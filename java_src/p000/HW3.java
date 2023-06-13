package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: HW3 */
/* loaded from: classes8.dex */
public class HW3 {

    /* renamed from: a */
    public C50861wA3 f13487a;

    /* renamed from: b */
    public C38409bC1 f13488b;

    /* renamed from: c */
    public List f13489c = new ArrayList();

    public HW3(C50861wA3 c50861wA3, C38409bC1 c38409bC1, MW3 mw3) {
        this.f13487a = c50861wA3;
        this.f13488b = c38409bC1;
    }

    /* renamed from: a */
    public List m103798a(int i) {
        m103797b(i);
        return this.f13489c;
    }

    /* renamed from: b */
    public final void m103797b(int i) {
        for (D83 d83 : this.f13487a.m7332j().m27207g()) {
            if (!d83.m85835e() && !d83.m110882l() && (d83.m110883k().m1759d() == 0 || i == 1)) {
                if (C50861wA3.m7324r(d83.m85838b(), i)) {
                    m103796c(d83);
                }
            }
        }
    }

    /* renamed from: c */
    public final void m103796c(D83 d83) {
        C52053yB0 m110884j = d83.m110884j();
        if (!this.f13487a.m7326p(m110884j)) {
            this.f13489c.add(this.f13488b.m64835t(m110884j));
        }
    }
}
