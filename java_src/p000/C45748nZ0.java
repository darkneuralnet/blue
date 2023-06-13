package p000;

import com.nimbusds.jose.JOSEException;
/* renamed from: nZ0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C45748nZ0 {
    /* renamed from: a */
    public static byte[] m23539a(C38696bh2 c38696bh2, byte[] bArr) throws JOSEException {
        C50699vu0 m64168s = c38696bh2.m64168s();
        if (m64168s == null) {
            return bArr;
        }
        if (m64168s.equals(C50699vu0.f114872c)) {
            try {
                return C46341oZ0.m20898a(bArr);
            } catch (Exception e) {
                throw new JOSEException("Couldn't compress plain text: " + e.getMessage(), e);
            }
        }
        throw new JOSEException("Unsupported compression algorithm: " + m64168s);
    }

    /* renamed from: b */
    public static byte[] m23538b(C38696bh2 c38696bh2, byte[] bArr) throws JOSEException {
        C50699vu0 m64168s = c38696bh2.m64168s();
        if (m64168s == null) {
            return bArr;
        }
        if (m64168s.equals(C50699vu0.f114872c)) {
            try {
                return C46341oZ0.m20897b(bArr);
            } catch (Exception e) {
                throw new JOSEException("Couldn't decompress plain text: " + e.getMessage(), e);
            }
        }
        throw new JOSEException("Unsupported compression algorithm: " + m64168s);
    }
}
