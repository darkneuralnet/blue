package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* renamed from: qM5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C47415qM5 implements T83 {

    /* renamed from: a */
    public C48008rM5 f105193a;

    /* renamed from: b */
    public double f105194b;

    /* renamed from: c */
    public List<S83> f105195c;

    public C47415qM5(double d) {
        this.f105194b = d;
        this.f105193a = new C48008rM5(d);
    }

    @Override // p000.T83
    /* renamed from: a */
    public void mo11840a(Collection collection) {
        this.f105195c = (List) m17589e(m17587g(collection));
    }

    @Override // p000.T83
    /* renamed from: b */
    public Collection mo11839b() {
        return this.f105195c;
    }

    /* renamed from: c */
    public final void m17591c(Collection<InterfaceC39410cr5> collection) {
        for (InterfaceC39410cr5 interfaceC39410cr5 : collection) {
            C52053yB0[] mo44967h = interfaceC39410cr5.mo44967h();
            int length = mo44967h.length / 100;
            double d = 0.0d;
            for (int i = 0; i < length; i++) {
                d = C37916aN2.m71517c(d);
                this.f105193a.m16037a(mo44967h[(int) (mo44967h.length * d)]);
            }
        }
    }

    /* renamed from: d */
    public final C52053yB0[] m17590d(C52053yB0[] c52053yB0Arr) {
        DB0 db0 = new DB0();
        for (C52053yB0 c52053yB0 : c52053yB0Arr) {
            db0.m110797f(this.f105193a.m16037a(c52053yB0), false);
        }
        return db0.m110799b2();
    }

    /* renamed from: e */
    public final Collection m17589e(List<S83> list) {
        EE2 ee2 = new EE2(new C46822pM5(this.f105194b, this.f105193a), this.f105194b * 2.0d);
        ee2.mo11840a(list);
        return ee2.mo11839b();
    }

    /* renamed from: f */
    public final S83 m17588f(InterfaceC39410cr5 interfaceC39410cr5) {
        return new S83(m17590d(interfaceC39410cr5.mo44967h()), interfaceC39410cr5.getData());
    }

    /* renamed from: g */
    public final List<S83> m17587g(Collection<InterfaceC39410cr5> collection) {
        m17591c(collection);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC39410cr5 interfaceC39410cr5 : collection) {
            arrayList.add(m17588f(interfaceC39410cr5));
        }
        return arrayList;
    }
}
