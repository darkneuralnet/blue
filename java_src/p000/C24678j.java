package p000;

import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.nimbusds.jose.JOSEException;
import java.nio.ByteBuffer;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: j */
/* loaded from: classes6.dex */
public class C24678j {
    private C24678j() {
    }

    /* renamed from: a */
    public static Cipher m31309a(SecretKey secretKey, boolean z, byte[] bArr, Provider provider) throws JOSEException {
        try {
            Cipher m8239a = C50589vj0.m8239a(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD, provider);
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getEncoded(), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            if (z) {
                m8239a.init(1, secretKeySpec, ivParameterSpec);
            } else {
                m8239a.init(2, secretKeySpec, ivParameterSpec);
            }
            return m8239a;
        } catch (Exception e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public static byte[] m31308b(SecretKey secretKey, byte[] bArr, byte[] bArr2, Provider provider) throws JOSEException {
        try {
            return m31309a(secretKey, false, bArr, provider).doFinal(bArr2);
        } catch (Exception e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public static byte[] m31307c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, Provider provider, Provider provider2) throws JOSEException {
        C36698Vt0 c36698Vt0 = new C36698Vt0(secretKey);
        byte[] m62051c = C13360c.m62051c(bArr3);
        if (C35807Ry0.m86160a(Arrays.copyOf(BE1.m114198b(c36698Vt0.m79309b(), ByteBuffer.allocate(bArr3.length + bArr.length + bArr2.length + m62051c.length).put(bArr3).put(bArr).put(bArr2).put(m62051c).array(), provider2), c36698Vt0.m79308c()), bArr4)) {
            return m31308b(c36698Vt0.m79310a(), bArr, bArr2, provider);
        }
        throw new JOSEException("MAC check failed");
    }

    /* renamed from: d */
    public static byte[] m31306d(C38696bh2 c38696bh2, SecretKey secretKey, C3824Iy c3824Iy, C3824Iy c3824Iy2, C3824Iy c3824Iy3, C3824Iy c3824Iy4, Provider provider, Provider provider2) throws JOSEException {
        byte[] bArr;
        byte[] bArr2 = null;
        if (c38696bh2.m3727d("epu") instanceof String) {
            bArr = new C3824Iy((String) c38696bh2.m3727d("epu")).m104549a();
        } else {
            bArr = null;
        }
        if (c38696bh2.m3727d("epv") instanceof String) {
            bArr2 = new C3824Iy((String) c38696bh2.m3727d("epv")).m104549a();
        }
        if (C35807Ry0.m86160a(c3824Iy4.m104549a(), BE1.m114198b(C38776bp2.m62560b(secretKey, c38696bh2.m64167t(), bArr, bArr2), (c38696bh2.m3723h().toString() + InstructionFileId.DOT + c3824Iy.toString() + InstructionFileId.DOT + c3824Iy2.toString() + InstructionFileId.DOT + c3824Iy3.toString()).getBytes(C48618sO5.f108725a), provider2))) {
            return m31308b(C38776bp2.m62561a(secretKey, c38696bh2.m64167t(), bArr, bArr2), c3824Iy2.m104549a(), c3824Iy3.m104549a(), provider);
        }
        throw new JOSEException("MAC check failed");
    }

    /* renamed from: e */
    public static byte[] m31305e(SecretKey secretKey, byte[] bArr, byte[] bArr2, Provider provider) throws JOSEException {
        try {
            return m31309a(secretKey, true, bArr, provider).doFinal(bArr2);
        } catch (Exception e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    /* renamed from: f */
    public static C1996Eq m31304f(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider, Provider provider2) throws JOSEException {
        C36698Vt0 c36698Vt0 = new C36698Vt0(secretKey);
        byte[] m31305e = m31305e(c36698Vt0.m79310a(), bArr, bArr2, provider);
        byte[] m62051c = C13360c.m62051c(bArr3);
        return new C1996Eq(m31305e, Arrays.copyOf(BE1.m114198b(c36698Vt0.m79309b(), ByteBuffer.allocate(bArr3.length + bArr.length + m31305e.length + m62051c.length).put(bArr3).put(bArr).put(m31305e).put(m62051c).array(), provider2), c36698Vt0.m79308c()));
    }

    /* renamed from: g */
    public static C1996Eq m31303g(C38696bh2 c38696bh2, SecretKey secretKey, C3824Iy c3824Iy, byte[] bArr, byte[] bArr2, Provider provider, Provider provider2) throws JOSEException {
        byte[] bArr3;
        byte[] m31305e;
        byte[] bArr4 = null;
        if (c38696bh2.m3727d("epu") instanceof String) {
            bArr3 = new C3824Iy((String) c38696bh2.m3727d("epu")).m104549a();
        } else {
            bArr3 = null;
        }
        if (c38696bh2.m3727d("epv") instanceof String) {
            bArr4 = new C3824Iy((String) c38696bh2.m3727d("epv")).m104549a();
        }
        return new C1996Eq(m31305e(C38776bp2.m62561a(secretKey, c38696bh2.m64167t(), bArr3, bArr4), bArr, bArr2, provider), BE1.m114198b(C38776bp2.m62560b(secretKey, c38696bh2.m64167t(), bArr3, bArr4), (c38696bh2.m3723h() + InstructionFileId.DOT + c3824Iy + InstructionFileId.DOT + C3824Iy.m101442e(bArr) + InstructionFileId.DOT + C3824Iy.m101442e(m31305e)).getBytes(C48618sO5.f108725a), provider2));
    }

    /* renamed from: h */
    public static byte[] m31302h(SecureRandom secureRandom) {
        byte[] bArr = new byte[N70.m94358c(128)];
        secureRandom.nextBytes(bArr);
        return bArr;
    }
}
