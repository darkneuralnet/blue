package p000;

import android.util.Base64;
import com.adyen.checkout.cse.exception.EncryptionException;
import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import kotlin.text.Charsets;
/* renamed from: Nk0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C34745Nk0 {

    /* renamed from: a */
    public final Cipher f25040a;

    /* renamed from: b */
    public final Cipher f25041b;

    /* renamed from: c */
    public final SecureRandom f25042c;

    public C34745Nk0(String str) throws EncryptionException {
        if (C52374yj6.m2755a(str)) {
            this.f25042c = new SecureRandom();
            String[] split = str.split("\\|");
            try {
                try {
                    PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(split[1].toLowerCase(Locale.getDefault()), 16), new BigInteger(split[0].toLowerCase(Locale.getDefault()), 16)));
                    try {
                        this.f25040a = Cipher.getInstance("AES/CCM/NoPadding");
                        try {
                            Cipher cipher = Cipher.getInstance("RSA/None/PKCS1Padding");
                            this.f25041b = cipher;
                            cipher.init(1, generatePublic);
                            return;
                        } catch (InvalidKeyException e) {
                            throw new EncryptionException("Invalid public key: " + str, e);
                        } catch (NoSuchAlgorithmException e2) {
                            throw new EncryptionException("Problem instantiation RSA Cipher Algorithm", e2);
                        } catch (NoSuchPaddingException e3) {
                            throw new EncryptionException("Problem instantiation RSA Cipher Padding", e3);
                        }
                    } catch (NoSuchAlgorithmException e4) {
                        throw new EncryptionException("Problem instantiation AES Cipher Algorithm", e4);
                    } catch (NoSuchPaddingException e5) {
                        throw new EncryptionException("Problem instantiation AES Cipher Padding", e5);
                    }
                } catch (InvalidKeySpecException e6) {
                    throw new EncryptionException("Problem reading public key: " + str, e6);
                }
            } catch (NoSuchAlgorithmException e7) {
                throw new EncryptionException("RSA KeyFactory not found.", e7);
            }
        }
        throw new EncryptionException("Invalid public key: " + str, null);
    }

    /* renamed from: a */
    public String m93534a(String str) throws EncryptionException {
        SecretKey m93533b = m93533b();
        byte[] m93532c = m93532c();
        try {
            this.f25040a.init(1, m93533b, new IvParameterSpec(m93532c));
            byte[] doFinal = this.f25040a.doFinal(str.getBytes(Charsets.UTF_8));
            byte[] bArr = new byte[m93532c.length + doFinal.length];
            System.arraycopy(m93532c, 0, bArr, 0, m93532c.length);
            System.arraycopy(doFinal, 0, bArr, m93532c.length, doFinal.length);
            try {
                return String.format("%s%s%s%s%s%s", "adyenan", "0_1_1", "$", Base64.encodeToString(this.f25041b.doFinal(m93533b.getEncoded()), 2), "$", Base64.encodeToString(bArr, 2));
            } catch (BadPaddingException e) {
                throw new EncryptionException("Incorrect RSA Padding", e);
            } catch (IllegalBlockSizeException e2) {
                throw new EncryptionException("Incorrect RSA Block Size", e2);
            }
        } catch (InvalidAlgorithmParameterException e3) {
            throw new EncryptionException("Invalid AES Parameters", e3);
        } catch (InvalidKeyException e4) {
            throw new EncryptionException("Invalid AES Key", e4);
        } catch (BadPaddingException e5) {
            throw new EncryptionException("Incorrect AES Padding", e5);
        } catch (IllegalBlockSizeException e6) {
            throw new EncryptionException("Incorrect AES Block Size", e6);
        }
    }

    /* renamed from: b */
    public final SecretKey m93533b() throws EncryptionException {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            keyGenerator.init(256);
            return keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            throw new EncryptionException("Unable to get AES algorithm", e);
        }
    }

    /* renamed from: c */
    public final byte[] m93532c() {
        byte[] bArr = new byte[12];
        this.f25042c.nextBytes(bArr);
        return bArr;
    }
}
