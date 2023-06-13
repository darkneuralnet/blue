package com.amazonaws.services.p026s3.internal.crypto;

import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
@Deprecated
/* renamed from: com.amazonaws.services.s3.internal.crypto.GCMCipherLite */
/* loaded from: classes3.dex */
final class GCMCipherLite extends CipherLite {
    private static final int BITS = 8;
    private static final int TAG_LENGTH = ContentCryptoScheme.AES_GCM.getTagLengthInBits() / 8;
    private CipherLite aux;
    private long currentCount;
    private boolean doneFinal;
    private byte[] finalBytes;
    private boolean invisiblyProcessed;
    private long markedCount;
    private long outputByteCount;
    private boolean securityViolated;
    private final int tagLen;

    public GCMCipherLite(Cipher cipher, SecretKey secretKey, int i) {
        super(cipher, ContentCryptoScheme.AES_GCM, secretKey, i);
        int i2;
        if (i == 1) {
            i2 = TAG_LENGTH;
        } else {
            i2 = 0;
        }
        this.tagLen = i2;
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException();
        }
    }

    private int checkMax(int i) {
        if (this.outputByteCount + i <= 68719476704L) {
            return i;
        }
        this.securityViolated = true;
        throw new SecurityException("Number of bytes processed has exceeded the maximum allowed by AES/GCM; [outputByteCount=" + this.outputByteCount + ", delta=" + i + "]");
    }

    private final byte[] doFinal0(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        if (this.doneFinal) {
            if (!this.securityViolated) {
                if (2 == getCipherMode()) {
                    byte[] bArr2 = this.finalBytes;
                    if (bArr2 == null) {
                        return null;
                    }
                    return (byte[]) bArr2.clone();
                }
                byte[] bArr3 = this.finalBytes;
                int length = bArr3.length;
                int i3 = this.tagLen;
                int i4 = length - i3;
                if (i2 == i4) {
                    return (byte[]) bArr3.clone();
                }
                if (i2 < i4 && i2 + this.currentCount == this.outputByteCount) {
                    return Arrays.copyOfRange(bArr3, (bArr3.length - i3) - i2, bArr3.length);
                }
                throw new IllegalStateException("Inconsistent re-rencryption");
            }
            throw new SecurityException();
        }
        this.doneFinal = true;
        byte[] doFinal = super.doFinal(bArr, i, i2);
        this.finalBytes = doFinal;
        if (doFinal == null) {
            return null;
        }
        this.outputByteCount += checkMax(doFinal.length - this.tagLen);
        return (byte[]) this.finalBytes.clone();
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.CipherLite
    public byte[] doFinal() throws IllegalBlockSizeException, BadPaddingException {
        if (this.doneFinal) {
            if (!this.securityViolated) {
                byte[] bArr = this.finalBytes;
                if (bArr == null) {
                    return null;
                }
                return (byte[]) bArr.clone();
            }
            throw new SecurityException();
        }
        this.doneFinal = true;
        byte[] doFinal = super.doFinal();
        this.finalBytes = doFinal;
        if (doFinal == null) {
            return null;
        }
        this.outputByteCount += checkMax(doFinal.length - this.tagLen);
        return (byte[]) this.finalBytes.clone();
    }

    public long getCurrentCount() {
        return this.currentCount;
    }

    public byte[] getFinalBytes() {
        byte[] bArr = this.finalBytes;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public long getMarkedCount() {
        return this.markedCount;
    }

    public long getOutputByteCount() {
        return this.outputByteCount;
    }

    public byte[] getTag() {
        byte[] bArr;
        if (getCipherMode() == 1 && (bArr = this.finalBytes) != null) {
            return Arrays.copyOfRange(bArr, bArr.length - this.tagLen, bArr.length);
        }
        return null;
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.CipherLite
    public long mark() {
        long j = this.aux == null ? this.outputByteCount : this.currentCount;
        this.markedCount = j;
        return j;
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.CipherLite
    public boolean markSupported() {
        return true;
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.CipherLite
    public void reset() {
        long j = this.markedCount;
        if (j < this.outputByteCount || this.invisiblyProcessed) {
            try {
                this.aux = createAuxiliary(j);
                this.currentCount = this.markedCount;
            } catch (Exception e) {
                if (e instanceof RuntimeException) {
                    throw ((RuntimeException) e);
                }
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.CipherLite
    public byte[] update(byte[] bArr, int i, int i2) {
        byte[] update;
        CipherLite cipherLite = this.aux;
        boolean z = true;
        int i3 = 0;
        if (cipherLite == null) {
            update = super.update(bArr, i, i2);
            if (update == null) {
                if (bArr.length <= 0) {
                    z = false;
                }
                this.invisiblyProcessed = z;
                return null;
            }
            this.outputByteCount += checkMax(update.length);
            if (update.length != 0 || i2 <= 0) {
                z = false;
            }
            this.invisiblyProcessed = z;
        } else {
            update = cipherLite.update(bArr, i, i2);
            if (update == null) {
                return null;
            }
            long length = this.currentCount + update.length;
            this.currentCount = length;
            long j = this.outputByteCount;
            if (length == j) {
                this.aux = null;
            } else if (length > j) {
                if (1 != getCipherMode()) {
                    byte[] bArr2 = this.finalBytes;
                    if (bArr2 != null) {
                        i3 = bArr2.length;
                    }
                    long j2 = this.outputByteCount;
                    long j3 = i3;
                    this.currentCount = j2 - j3;
                    this.aux = null;
                    return Arrays.copyOf(update, (int) ((j2 - (this.currentCount - update.length)) - j3));
                }
                throw new IllegalStateException("currentCount=" + this.currentCount + " > outputByteCount=" + this.outputByteCount);
            }
        }
        return update;
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.CipherLite
    public final byte[] doFinal(byte[] bArr) throws IllegalBlockSizeException, BadPaddingException {
        return doFinal0(bArr, 0, bArr.length);
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.CipherLite
    public final byte[] doFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        return doFinal0(bArr, i, i2);
    }
}
