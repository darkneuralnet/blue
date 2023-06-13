package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* renamed from: mM5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45043mM5 implements T83 {

    /* renamed from: a */
    public final C40414eZ3 f97845a;

    /* renamed from: b */
    public final C42676iN1 f97846b;

    /* renamed from: c */
    public List<S83> f97847c;

    /* renamed from: mM5$a */
    /* loaded from: classes8.dex */
    public class C26045a implements InterfaceC36142Tj2 {

        /* renamed from: a */
        public final /* synthetic */ C52053yB0 f97848a;

        /* renamed from: b */
        public final /* synthetic */ C52053yB0 f97849b;

        /* renamed from: c */
        public final /* synthetic */ S83 f97850c;

        /* renamed from: d */
        public final /* synthetic */ int f97851d;

        public C26045a(C52053yB0 c52053yB0, C52053yB0 c52053yB02, S83 s83, int i) {
            this.f97848a = c52053yB0;
            this.f97849b = c52053yB02;
            this.f97850c = s83;
            this.f97851d = i;
        }

        @Override // p000.InterfaceC36142Tj2
        /* renamed from: a */
        public void mo25796a(C35908Sj2 c35908Sj2) {
            C42083hN1 c42083hN1 = (C42083hN1) c35908Sj2.m84995b();
            if ((c42083hN1.m36500e() || (!c42083hN1.m36503b(this.f97848a) && !c42083hN1.m36503b(this.f97849b))) && c42083hN1.m36502c(this.f97848a, this.f97849b)) {
                this.f97850c.m85917a(c42083hN1.m36504a(), this.f97851d);
                c42083hN1.m36497h();
            }
        }
    }

    /* renamed from: mM5$b */
    /* loaded from: classes8.dex */
    public class C26046b implements InterfaceC36142Tj2 {

        /* renamed from: a */
        public final /* synthetic */ C52053yB0 f97853a;

        /* renamed from: b */
        public final /* synthetic */ S83 f97854b;

        /* renamed from: c */
        public final /* synthetic */ int f97855c;

        public C26046b(C52053yB0 c52053yB0, S83 s83, int i) {
            this.f97853a = c52053yB0;
            this.f97854b = s83;
            this.f97855c = i;
        }

        @Override // p000.InterfaceC36142Tj2
        /* renamed from: a */
        public void mo25796a(C35908Sj2 c35908Sj2) {
            C42083hN1 c42083hN1 = (C42083hN1) c35908Sj2.m84995b();
            if (c42083hN1.m36500e() && c42083hN1.m36504a().m3886g(this.f97853a)) {
                this.f97854b.m85917a(this.f97853a, this.f97855c);
            }
        }
    }

    public C45043mM5(C40414eZ3 c40414eZ3) {
        this.f97845a = c40414eZ3;
        this.f97846b = new C42676iN1(c40414eZ3);
    }

    @Override // p000.T83
    /* renamed from: a */
    public void mo11840a(Collection collection) {
        this.f97847c = m25799j(collection);
    }

    @Override // p000.T83
    /* renamed from: b */
    public Collection mo11839b() {
        return S83.m85911g(this.f97847c);
    }

    /* renamed from: c */
    public final void m25806c(Collection<S83> collection) {
        double m42764b = (1.0d / this.f97845a.m42764b()) / 100.0d;
        C44450lM5 c44450lM5 = new C44450lM5(m42764b);
        new EE2(c44450lM5, m42764b).mo11840a(collection);
        this.f97846b.m34046c(c44450lM5.m27392b());
    }

    /* renamed from: d */
    public final void m25805d(S83 s83) {
        C52053yB0[] mo44967h = s83.mo44967h();
        for (int i = 1; i < mo44967h.length - 1; i++) {
            m25797l(mo44967h[i], s83, i);
        }
    }

    /* renamed from: e */
    public final void m25804e(Collection<S83> collection) {
        for (S83 s83 : collection) {
            this.f97846b.m34047b(s83.mo44967h());
        }
    }

    /* renamed from: f */
    public final S83 m25803f(S83 s83) {
        C52053yB0[] m85912f = s83.m85912f();
        C52053yB0[] m25800i = m25800i(m85912f);
        if (m25800i.length <= 1) {
            return null;
        }
        S83 s832 = new S83(m25800i, s83.getData());
        int i = 0;
        int i2 = 0;
        while (i < m85912f.length - 1) {
            C52053yB0 mo44966u = s832.mo44966u(i2);
            int i3 = i + 1;
            C52053yB0 c52053yB0 = m85912f[i3];
            if (!m25801h(c52053yB0).m3886g(mo44966u)) {
                m25798k(m85912f[i], c52053yB0, s832, i2);
                i2++;
            }
            i = i3;
        }
        return s832;
    }

    /* renamed from: g */
    public final List<S83> m25802g(Collection<S83> collection) {
        ArrayList<S83> arrayList = new ArrayList();
        for (S83 s83 : collection) {
            S83 m25803f = m25803f(s83);
            if (m25803f != null) {
                arrayList.add(m25803f);
            }
        }
        for (S83 s832 : arrayList) {
            m25805d(s832);
        }
        return arrayList;
    }

    /* renamed from: h */
    public final C52053yB0 m25801h(C52053yB0 c52053yB0) {
        C52053yB0 mo3888e = c52053yB0.mo3888e();
        this.f97845a.m42760f(mo3888e);
        return mo3888e;
    }

    /* renamed from: i */
    public final C52053yB0[] m25800i(C52053yB0[] c52053yB0Arr) {
        DB0 db0 = new DB0();
        for (C52053yB0 c52053yB0 : c52053yB0Arr) {
            db0.m110797f(m25801h(c52053yB0), false);
        }
        return db0.m110799b2();
    }

    /* renamed from: j */
    public final List<S83> m25799j(Collection<S83> collection) {
        m25806c(collection);
        m25804e(collection);
        return m25802g(collection);
    }

    /* renamed from: k */
    public final void m25798k(C52053yB0 c52053yB0, C52053yB0 c52053yB02, S83 s83, int i) {
        this.f97846b.m34044e(c52053yB0, c52053yB02, new C26045a(c52053yB0, c52053yB02, s83, i));
    }

    /* renamed from: l */
    public final void m25797l(C52053yB0 c52053yB0, S83 s83, int i) {
        this.f97846b.m34044e(c52053yB0, c52053yB0, new C26046b(c52053yB0, s83, i));
    }
}
