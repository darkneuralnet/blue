package p000;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
/* renamed from: DN6 */
/* loaded from: classes6.dex */
public final class DN6 extends ON6 {

    /* renamed from: c */
    public final byte[] f5567c;

    public DN6(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f5567c = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f5567c;
    }
}
