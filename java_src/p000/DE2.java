package p000;

import com.nimbusds.jose.JOSEException;
import java.util.Set;
import javax.crypto.SecretKey;
/* renamed from: DE2 */
/* loaded from: classes6.dex */
public class DE2 extends CE2 implements InterfaceC44050kh2 {

    /* renamed from: e */
    public final KE0 f5407e;

    public DE2(byte[] bArr) throws JOSEException {
        this(bArr, null);
    }

    @Override // p000.InterfaceC44050kh2
    /* renamed from: b */
    public boolean mo15406b(C42864ih2 c42864ih2, byte[] bArr, C3824Iy c3824Iy) throws JOSEException {
        if (!this.f5407e.m99063d(c42864ih2)) {
            return false;
        }
        return C35807Ry0.m86160a(BE1.m114199a(CE2.m112597d(c42864ih2.m33577r()), m112596e(), bArr, getJCAContext().m113690a()), c3824Iy.m104549a());
    }

    public DE2(SecretKey secretKey) throws JOSEException {
        this(secretKey.getEncoded());
    }

    public DE2(byte[] bArr, Set<String> set) throws JOSEException {
        super(bArr, CE2.f3641d);
        KE0 ke0 = new KE0();
        this.f5407e = ke0;
        ke0.m99062e(set);
    }
}
