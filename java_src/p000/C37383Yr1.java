package p000;
/* renamed from: Yr1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37383Yr1 {

    /* renamed from: d */
    public static final C10776ad f47487d = C10776ad.m71007e();

    /* renamed from: a */
    public final String f47488a;

    /* renamed from: b */
    public final X94<U96> f47489b;

    /* renamed from: c */
    public R96<C43891kQ3> f47490c;

    public C37383Yr1(X94<U96> x94, String str) {
        this.f47488a = str;
        this.f47489b = x94;
    }

    /* renamed from: a */
    public final boolean m74094a() {
        if (this.f47490c == null) {
            U96 u96 = this.f47489b.get();
            if (u96 != null) {
                this.f47490c = u96.mo80270a(this.f47488a, C43891kQ3.class, C35142Pc1.m90060b("proto"), new C96() { // from class: Xr1
                    @Override // p000.C96
                    public final Object apply(Object obj) {
                        return ((C43891kQ3) obj).m46332o();
                    }
                });
            } else {
                f47487d.m71002j("Flg TransportFactory is not available at the moment");
            }
        }
        if (this.f47490c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m74093b(C43891kQ3 c43891kQ3) {
        if (!m74094a()) {
            f47487d.m71002j("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.f47490c.mo77276a(AbstractC52339yg1.m2986d(c43891kQ3));
        }
    }
}
