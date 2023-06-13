package p000;

import com.nimbusds.jose.JOSEException;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPublicKey;
import java.util.Set;
/* renamed from: rm4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48253rm4 extends AbstractC47660qm4 implements InterfaceC44050kh2 {

    /* renamed from: d */
    public final KE0 f107606d;

    /* renamed from: e */
    public final RSAPublicKey f107607e;

    public C48253rm4(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    @Override // p000.InterfaceC44050kh2
    /* renamed from: b */
    public boolean mo15406b(C42864ih2 c42864ih2, byte[] bArr, C3824Iy c3824Iy) throws JOSEException {
        if (!this.f107606d.m99063d(c42864ih2)) {
            return false;
        }
        Signature m18719a = C47067pm4.m18719a(c42864ih2.m33577r(), getJCAContext().m113690a());
        try {
            m18719a.initVerify(this.f107607e);
            try {
                m18719a.update(bArr);
                return m18719a.verify(c3824Iy.m104549a());
            } catch (SignatureException unused) {
                return false;
            }
        } catch (InvalidKeyException e) {
            throw new JOSEException("Invalid public RSA key: " + e.getMessage(), e);
        }
    }

    public C48253rm4(RSAPublicKey rSAPublicKey, Set<String> set) {
        KE0 ke0 = new KE0();
        this.f107606d = ke0;
        if (rSAPublicKey != null) {
            this.f107607e = rSAPublicKey;
            ke0.m99062e(set);
            return;
        }
        throw new IllegalArgumentException("The public RSA key must not be null");
    }
}
