package p000;

import com.nimbusds.jose.JOSEException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
/* renamed from: l */
/* loaded from: classes6.dex */
public class C25580l {
    private C25580l() {
    }

    /* renamed from: a */
    public static byte[] m28039a(Cipher cipher) throws JOSEException {
        GCMParameterSpec m28038b = m28038b(cipher);
        byte[] iv = m28038b.getIV();
        m28034f(iv, m28038b.getTLen());
        return iv;
    }

    /* renamed from: b */
    public static GCMParameterSpec m28038b(Cipher cipher) throws JOSEException {
        AlgorithmParameters parameters = cipher.getParameters();
        if (parameters != null) {
            try {
                return (GCMParameterSpec) parameters.getParameterSpec(GCMParameterSpec.class);
            } catch (InvalidParameterSpecException e) {
                throw new JOSEException(e.getMessage(), e);
            }
        }
        throw new JOSEException("AES GCM ciphers are expected to make use of algorithm parameters");
    }

    /* renamed from: c */
    public static byte[] m28037c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, Provider provider) throws JOSEException {
        Cipher cipher;
        SecretKey m80951a = C36385Uk2.m80951a(secretKey);
        try {
            if (provider != null) {
                cipher = Cipher.getInstance("AES/GCM/NoPadding", provider);
            } else {
                cipher = Cipher.getInstance("AES/GCM/NoPadding");
            }
            cipher.init(2, m80951a, new GCMParameterSpec(128, bArr));
            cipher.updateAAD(bArr3);
            try {
                return cipher.doFinal(N70.m94357d(bArr2, bArr4));
            } catch (BadPaddingException | IllegalBlockSizeException e) {
                throw new JOSEException("AES/GCM/NoPadding decryption failed: " + e.getMessage(), e);
            }
        } catch (NoClassDefFoundError unused) {
            return C35953So2.m84811c(m80951a, bArr, bArr2, bArr3, bArr4);
        } catch (InvalidAlgorithmParameterException e2) {
            e = e2;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (InvalidKeyException e3) {
            e = e3;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (NoSuchPaddingException e5) {
            e = e5;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        }
    }

    /* renamed from: d */
    public static C1996Eq m28036d(SecretKey secretKey, C50157uz0<byte[]> c50157uz0, byte[] bArr, byte[] bArr2, Provider provider) throws JOSEException {
        Cipher cipher;
        SecretKey m80951a = C36385Uk2.m80951a(secretKey);
        byte[] m9420a = c50157uz0.m9420a();
        try {
            if (provider != null) {
                cipher = Cipher.getInstance("AES/GCM/NoPadding", provider);
            } else {
                cipher = Cipher.getInstance("AES/GCM/NoPadding");
            }
            cipher.init(1, m80951a, new GCMParameterSpec(128, m9420a));
            cipher.updateAAD(bArr2);
            try {
                byte[] doFinal = cipher.doFinal(bArr);
                int length = doFinal.length - N70.m94358c(128);
                byte[] m94354g = N70.m94354g(doFinal, 0, length);
                byte[] m94354g2 = N70.m94354g(doFinal, length, N70.m94358c(128));
                c50157uz0.m9419b(m28039a(cipher));
                return new C1996Eq(m94354g, m94354g2);
            } catch (BadPaddingException | IllegalBlockSizeException e) {
                throw new JOSEException("Couldn't encrypt with AES/GCM/NoPadding: " + e.getMessage(), e);
            }
        } catch (NoClassDefFoundError unused) {
            return C35953So2.m84810d(m80951a, m9420a, bArr, bArr2);
        } catch (InvalidAlgorithmParameterException e2) {
            e = e2;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (InvalidKeyException e3) {
            e = e3;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (NoSuchPaddingException e5) {
            e = e5;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        }
    }

    /* renamed from: e */
    public static byte[] m28035e(SecureRandom secureRandom) {
        byte[] bArr = new byte[12];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    /* renamed from: f */
    public static void m28034f(byte[] bArr, int i) throws JOSEException {
        if (N70.m94355f(bArr) == 96) {
            if (i == 128) {
                return;
            }
            throw new JOSEException(String.format("Authentication tag length of %d bits is required, got %d", 128, Integer.valueOf(i)));
        }
        throw new JOSEException(String.format("IV length of %d bits is required, got %d", 96, Integer.valueOf(N70.m94355f(bArr))));
    }
}
