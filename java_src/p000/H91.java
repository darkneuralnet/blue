package p000;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geom.TopologyException;
/* renamed from: H91 */
/* loaded from: classes8.dex */
public abstract class H91 {

    /* renamed from: a */
    public C43685k41 f12944a;

    /* renamed from: f */
    public C34108Kr2 f12949f;

    /* renamed from: g */
    public boolean f12950g;

    /* renamed from: h */
    public H91 f12951h;

    /* renamed from: j */
    public C38409bC1 f12953j;

    /* renamed from: b */
    public int f12945b = -1;

    /* renamed from: c */
    public List f12946c = new ArrayList();

    /* renamed from: d */
    public List f12947d = new ArrayList();

    /* renamed from: e */
    public C35926Sl2 f12948e = new C35926Sl2(-1);

    /* renamed from: i */
    public ArrayList f12952i = new ArrayList();

    public H91(C43685k41 c43685k41, C38409bC1 c38409bC1) {
        this.f12953j = c38409bC1;
        m104276d(c43685k41);
        m104275e();
    }

    /* renamed from: a */
    public void m104279a(H91 h91) {
        this.f12952i.add(h91);
    }

    /* renamed from: b */
    public void m104278b(C47293q91 c47293q91, boolean z, boolean z2) {
        C52053yB0[] m18068n = c47293q91.m18068n();
        if (z) {
            for (int i = !z2 ? 1 : 0; i < m18068n.length; i++) {
                this.f12947d.add(m18068n[i]);
            }
            return;
        }
        int length = m18068n.length - 2;
        if (z2) {
            length = m18068n.length - 1;
        }
        while (length >= 0) {
            this.f12947d.add(m18068n[length]);
            length--;
        }
    }

    /* renamed from: c */
    public final void m104277c() {
        this.f12945b = 0;
        C43685k41 c43685k41 = this.f12944a;
        do {
            int m27972m = ((C44278l41) c43685k41.m9127g().m110883k()).m27972m(this);
            if (m27972m > this.f12945b) {
                this.f12945b = m27972m;
            }
            c43685k41 = mo19215i(c43685k41);
        } while (c43685k41 != this.f12944a);
        this.f12945b *= 2;
    }

    /* renamed from: d */
    public void m104276d(C43685k41 c43685k41) {
        this.f12944a = c43685k41;
        boolean z = true;
        while (c43685k41 != null) {
            if (c43685k41.m29374k() != this) {
                this.f12946c.add(c43685k41);
                C35926Sl2 mo5787f = c43685k41.mo5787f();
                C4596Ko.m98282c(mo5787f.m84871g());
                m104269l(mo5787f);
                m104278b(c43685k41.mo9128e(), c43685k41.m29369p(), z);
                mo19214n(c43685k41, this);
                c43685k41 = mo19215i(c43685k41);
                if (c43685k41 == this.f12944a) {
                    return;
                }
                z = false;
            } else {
                throw new TopologyException("Directed Edge visited twice during ring-building at " + c43685k41.m9130c());
            }
        }
        throw new TopologyException("Found null DirectedEdge");
    }

    /* renamed from: e */
    public void m104275e() {
        if (this.f12949f != null) {
            return;
        }
        C52053yB0[] c52053yB0Arr = new C52053yB0[this.f12947d.size()];
        for (int i = 0; i < this.f12947d.size(); i++) {
            c52053yB0Arr[i] = (C52053yB0) this.f12947d.get(i);
        }
        C34108Kr2 m64845j = this.f12953j.m64845j(c52053yB0Arr);
        this.f12949f = m64845j;
        this.f12950g = C32534Dy3.m109569c(m64845j.mo77238Y());
    }

    /* renamed from: f */
    public C52053yB0 m104274f(int i) {
        return (C52053yB0) this.f12947d.get(i);
    }

    /* renamed from: g */
    public C34108Kr2 m104273g() {
        return this.f12949f;
    }

    /* renamed from: h */
    public int m104272h() {
        if (this.f12945b < 0) {
            m104277c();
        }
        return this.f12945b;
    }

    /* renamed from: i */
    public abstract C43685k41 mo19215i(C43685k41 c43685k41);

    /* renamed from: j */
    public H91 m104271j() {
        return this.f12951h;
    }

    /* renamed from: k */
    public boolean m104270k() {
        return this.f12950g;
    }

    /* renamed from: l */
    public void m104269l(C35926Sl2 c35926Sl2) {
        m104268m(c35926Sl2, 0);
        m104268m(c35926Sl2, 1);
    }

    /* renamed from: m */
    public void m104268m(C35926Sl2 c35926Sl2, int i) {
        int m84873e = c35926Sl2.m84873e(i, 2);
        if (m84873e != -1 && this.f12948e.m84874d(i) == -1) {
            this.f12948e.m84864n(i, m84873e);
        }
    }

    /* renamed from: n */
    public abstract void mo19214n(C43685k41 c43685k41, H91 h91);

    /* renamed from: o */
    public void m104267o() {
        C43685k41 c43685k41 = this.f12944a;
        do {
            c43685k41.mo9128e().m85833g(true);
            c43685k41 = c43685k41.m29372m();
        } while (c43685k41 != this.f12944a);
    }

    /* renamed from: p */
    public void m104266p(H91 h91) {
        this.f12951h = h91;
        if (h91 != null) {
            h91.m104279a(this);
        }
    }

    /* renamed from: q */
    public CX3 m104265q(C38409bC1 c38409bC1) {
        C34108Kr2[] c34108Kr2Arr = new C34108Kr2[this.f12952i.size()];
        for (int i = 0; i < this.f12952i.size(); i++) {
            c34108Kr2Arr[i] = ((H91) this.f12952i.get(i)).m104273g();
        }
        return c38409bC1.m64830y(m104273g(), c34108Kr2Arr);
    }
}
