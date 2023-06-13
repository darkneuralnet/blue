package com.amazonaws.services.p026s3.internal.crypto;

import com.amazonaws.AmazonClientException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
@Deprecated
/* renamed from: com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme */
/* loaded from: classes3.dex */
abstract class ContentCryptoScheme {
    private static final int BYTE_SIZE = 4;
    private static final int CBC_SHIFT_VALUE = 48;
    private static final int DEFAULT_BIT_COUNTER = 16;
    private static final int DEFAULT_RIGHTMOST_BIT_START = 12;
    private static final int GCM_SHIFT_VALUE = 32;
    private static final int LONG_BYTE_SIZE = 8;
    private static final long LONG_VALUE = 1;
    static final long MAX_CBC_BYTES = 4503599627370496L;
    static final long MAX_CTR_BYTES = -1;
    static final long MAX_GCM_BLOCKS = 4294967294L;
    static final long MAX_GCM_BYTES = 68719476704L;
    static final ContentCryptoScheme AES_CBC = new AesCbc();
    static final ContentCryptoScheme AES_GCM = new AesGcm();
    static final ContentCryptoScheme AES_CTR = new AesCtr();

    public static ContentCryptoScheme fromCEKAlgo(String str) {
        return fromCEKAlgo(str, false);
    }

    public static byte[] incrementBlocks(byte[] bArr, long j) {
        if (j == 0) {
            return bArr;
        }
        if (bArr != null && bArr.length == 16) {
            if (j <= MAX_GCM_BLOCKS) {
                ByteBuffer allocate = ByteBuffer.allocate(8);
                for (int i = 12; i <= 15; i++) {
                    allocate.put(i - 8, bArr[i]);
                }
                long j2 = allocate.getLong() + j;
                if (j2 <= MAX_GCM_BLOCKS) {
                    allocate.rewind();
                    byte[] array = allocate.putLong(j2).array();
                    for (int i2 = 12; i2 <= 15; i2++) {
                        bArr[i2] = array[i2 - 8];
                    }
                    return bArr;
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        throw new IllegalArgumentException();
    }

    public byte[] adjustIV(byte[] bArr, long j) {
        return bArr;
    }

    public CipherLite createAuxillaryCipher(SecretKey secretKey, byte[] bArr, int i, Provider provider, long j) throws NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
        return null;
    }

    public CipherLite createCipherLite(SecretKey secretKey, byte[] bArr, int i, Provider provider) {
        Cipher cipher;
        String specificCipherProvider = getSpecificCipherProvider();
        try {
            if (provider != null) {
                cipher = Cipher.getInstance(getCipherAlgorithm(), provider);
            } else if (specificCipherProvider != null) {
                cipher = Cipher.getInstance(getCipherAlgorithm(), specificCipherProvider);
            } else {
                cipher = Cipher.getInstance(getCipherAlgorithm());
            }
            cipher.init(i, secretKey, new IvParameterSpec(bArr));
            return newCipherLite(cipher, secretKey, i);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new AmazonClientException("Unable to build cipher: " + e.getMessage() + "\nMake sure you have the JCE unlimited strength policy files installed and configured for your JVM", e);
        }
    }

    public abstract int getBlockSizeInBytes();

    public abstract String getCipherAlgorithm();

    public abstract int getIVLengthInBytes();

    public abstract String getKeyGeneratorAlgorithm();

    public abstract int getKeyLengthInBits();

    public final String getKeySpec() {
        return getKeyGeneratorAlgorithm() + "_" + getKeyLengthInBits();
    }

    public abstract long getMaxPlaintextSize();

    public String getSpecificCipherProvider() {
        return null;
    }

    public int getTagLengthInBits() {
        return 0;
    }

    public CipherLite newCipherLite(Cipher cipher, SecretKey secretKey, int i) {
        return new CipherLite(cipher, this, secretKey, i);
    }

    public String toString() {
        return "cipherAlgo=" + getCipherAlgorithm() + ", blockSizeInBytes=" + getBlockSizeInBytes() + ", ivLengthInBytes=" + getIVLengthInBytes() + ", keyGenAlgo=" + getKeyGeneratorAlgorithm() + ", keyLengthInBits=" + getKeyLengthInBits() + ", specificProvider=" + getSpecificCipherProvider() + ", tagLengthInBits=" + getTagLengthInBits();
    }

    public static ContentCryptoScheme fromCEKAlgo(String str, boolean z) {
        ContentCryptoScheme contentCryptoScheme = AES_GCM;
        if (contentCryptoScheme.getCipherAlgorithm().equals(str)) {
            return z ? AES_CTR : contentCryptoScheme;
        } else if (str != null && !AES_CBC.getCipherAlgorithm().equals(str)) {
            throw new UnsupportedOperationException("Unsupported content encryption scheme: " + str);
        } else {
            return AES_CBC;
        }
    }

    public CipherLite createCipherLite(SecretKey secretKey, byte[] bArr, int i) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException, InvalidAlgorithmParameterException {
        return createCipherLite(secretKey, bArr, i, null);
    }
}
