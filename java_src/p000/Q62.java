package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: Q62 */
/* loaded from: classes8.dex */
public class Q62 {

    /* renamed from: a */
    public C38409bC1 f29831a;

    /* renamed from: b */
    public C46712pA3 f29832b;

    /* renamed from: c */
    public List<FW3> f29833c = new ArrayList();

    /* renamed from: d */
    public boolean f29834d = true;

    public Q62(C46712pA3 c46712pA3, C38409bC1 c38409bC1) {
        this.f29832b = c46712pA3;
        this.f29831a = c38409bC1;
    }

    /* renamed from: a */
    public final void m88918a() {
        for (C45526nA3 c45526nA3 : this.f29832b.m19848c()) {
            if (m88915d(c45526nA3)) {
                this.f29833c.add(this.f29831a.m64835t(c45526nA3.m24241t().mo3888e()));
            }
        }
    }

    /* renamed from: b */
    public List<FW3> m88917b() {
        m88918a();
        return this.f29833c;
    }

    /* renamed from: c */
    public final boolean m88916c(C47305qA3 c47305qA3, int i) {
        if (!this.f29834d && c47305qA3.m18014m()) {
            return false;
        }
        if (!c47305qA3.m18016k(i) && !c47305qA3.m18004w(i)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m88915d(C45526nA3 c45526nA3) {
        C45526nA3 c45526nA32 = c45526nA3;
        boolean z = false;
        boolean z2 = false;
        while (!c45526nA32.m24267A()) {
            C47305qA3 m24237x = c45526nA32.m24237x();
            z |= m88916c(m24237x, 0);
            z2 |= m88916c(m24237x, 1);
            c45526nA32 = (C45526nA3) c45526nA32.m107414l();
            if (c45526nA32 == c45526nA3) {
                if (!z || !z2) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void m88914e(boolean z) {
        this.f29834d = !z;
    }
}
