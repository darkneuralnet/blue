package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: ir2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42964ir2 {

    /* renamed from: a */
    public C50861wA3 f91387a;

    /* renamed from: b */
    public C38409bC1 f91388b;

    /* renamed from: c */
    public MW3 f91389c;

    /* renamed from: d */
    public List f91390d = new ArrayList();

    /* renamed from: e */
    public List f91391e = new ArrayList();

    public C42964ir2(C50861wA3 c50861wA3, C38409bC1 c38409bC1, MW3 mw3) {
        this.f91387a = c50861wA3;
        this.f91388b = c38409bC1;
        this.f91389c = mw3;
    }

    /* renamed from: a */
    public List m31756a(int i) {
        m31751f();
        m31752e(i);
        m31755b(i);
        return this.f91391e;
    }

    /* renamed from: b */
    public final void m31755b(int i) {
        for (C47293q91 c47293q91 : this.f91390d) {
            this.f91391e.add(this.f91388b.m64848g(c47293q91.m18068n()));
            c47293q91.m85833g(true);
        }
    }

    /* renamed from: c */
    public final void m31754c(C43685k41 c43685k41, int i, List list) {
        boolean z;
        C35926Sl2 mo5787f = c43685k41.mo5787f();
        if (c43685k41.m29366s() || c43685k41.m29365t() || c43685k41.m29367r() || c43685k41.mo9128e().m85835e()) {
            return;
        }
        if ((!c43685k41.m29368q() && !c43685k41.m29370o().m29368q()) || !c43685k41.mo9128e().m85835e()) {
            z = true;
        } else {
            z = false;
        }
        C4596Ko.m98282c(z);
        if (C50861wA3.m7324r(mo5787f, i) && i == 1) {
            list.add(c43685k41.mo9128e());
            c43685k41.m29376K(true);
        }
    }

    /* renamed from: d */
    public final void m31753d(C43685k41 c43685k41, int i, List list) {
        C35926Sl2 mo5787f = c43685k41.mo5787f();
        C47293q91 mo9128e = c43685k41.mo9128e();
        if (c43685k41.m29366s() && !c43685k41.m29365t() && C50861wA3.m7324r(mo5787f, i) && !mo9128e.m85837c()) {
            list.add(mo9128e);
            c43685k41.m29376K(true);
        }
    }

    /* renamed from: e */
    public final void m31752e(int i) {
        for (C43685k41 c43685k41 : this.f91387a.m7332j().m27210d()) {
            m31753d(c43685k41, i, this.f91390d);
            m31754c(c43685k41, i, this.f91390d);
        }
    }

    /* renamed from: f */
    public final void m31751f() {
        for (D83 d83 : this.f91387a.m7332j().m27207g()) {
            ((C44278l41) d83.m110883k()).m27974k();
        }
        for (C43685k41 c43685k41 : this.f91387a.m7332j().m27210d()) {
            C47293q91 mo9128e = c43685k41.mo9128e();
            if (c43685k41.m29366s() && !mo9128e.m85836d()) {
                mo9128e.m85834f(this.f91387a.m7327o(c43685k41.m9130c()));
            }
        }
    }
}
