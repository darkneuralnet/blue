package p000;

import java.io.ByteArrayInputStream;
import java.security.Provider;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
/* renamed from: sH6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48556sH6 {

    /* renamed from: a */
    public static Provider f108535a;

    /* renamed from: a */
    public static X509Certificate m14485a(byte[] bArr) {
        try {
            return m14484b(bArr);
        } catch (CertificateException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static X509Certificate m14484b(byte[] bArr) throws CertificateException {
        CertificateFactory certificateFactory;
        if (bArr != null && bArr.length != 0) {
            Provider provider = f108535a;
            if (provider != null) {
                certificateFactory = CertificateFactory.getInstance("X.509", provider);
            } else {
                certificateFactory = CertificateFactory.getInstance("X.509");
            }
            Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
            if (generateCertificate instanceof X509Certificate) {
                return (X509Certificate) generateCertificate;
            }
            throw new CertificateException("Not a X.509 certificate: " + generateCertificate.getType());
        }
        return null;
    }
}
