package p000;

import com.nimbusds.jose.JOSEException;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import java.util.Set;
/* renamed from: P81 */
/* loaded from: classes6.dex */
public class P81 extends O81 implements InterfaceC44050kh2 {

    /* renamed from: d */
    public final KE0 f27958d;

    /* renamed from: e */
    public final ECPublicKey f27959e;

    public P81(ECPublicKey eCPublicKey) throws JOSEException {
        this(eCPublicKey, null);
    }

    @Override // p000.InterfaceC44050kh2
    /* renamed from: b */
    public boolean mo15406b(C42864ih2 c42864ih2, byte[] bArr, C3824Iy c3824Iy) throws JOSEException {
        C42271hh2 m33577r = c42864ih2.m33577r();
        if (m26190c().contains(m33577r)) {
            if (!this.f27958d.m99063d(c42864ih2)) {
                return false;
            }
            byte[] m104549a = c3824Iy.m104549a();
            if (N81.m94330a(c42864ih2.m33577r()) != m104549a.length) {
                return false;
            }
            try {
                byte[] m94326e = N81.m94326e(m104549a);
                Signature m94329b = N81.m94329b(m33577r, getJCAContext().m113690a());
                try {
                    m94329b.initVerify(this.f27959e);
                    m94329b.update(bArr);
                    return m94329b.verify(m94326e);
                } catch (InvalidKeyException e) {
                    throw new JOSEException("Invalid EC public key: " + e.getMessage(), e);
                } catch (SignatureException unused) {
                    return false;
                }
            } catch (JOSEException unused2) {
                return false;
            }
        }
        throw new JOSEException(C3900J9.m101092d(m33577r, m26190c()));
    }

    public P81(ECPublicKey eCPublicKey, Set<String> set) throws JOSEException {
        super(N81.m94327d(eCPublicKey));
        KE0 ke0 = new KE0();
        this.f27958d = ke0;
        this.f27959e = eCPublicKey;
        if (L81.m97672b(eCPublicKey, C41417gF0.m39801b(m92854d()).iterator().next().m39798e())) {
            ke0.m99062e(set);
            return;
        }
        throw new JOSEException("Curve / public key parameters mismatch");
    }
}
