package p000;
/* renamed from: kM5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43857kM5 {

    /* renamed from: a */
    public WB1[] f94295a;

    /* renamed from: b */
    public double f94296b;

    /* renamed from: c */
    public C47686qp0 f94297c;

    public C43857kM5(WB1 wb1, WB1 wb12) {
        this.f94295a = r0;
        WB1[] wb1Arr = {wb1, wb12};
        m29044a();
    }

    /* renamed from: c */
    public static WB1 m29042c(WB1 wb1, WB1 wb12, int i) {
        return new C43857kM5(wb1, wb12).m29043b(i);
    }

    /* renamed from: a */
    public final void m29044a() {
        WB1[] wb1Arr = this.f94295a;
        this.f94296b = C40798fC1.m41749b(wb1Arr[0], wb1Arr[1]);
    }

    /* renamed from: b */
    public WB1 m29043b(int i) {
        WB1[] m29039f = m29039f(this.f94295a);
        return m29041d(C50861wA3.m7320v(m29039f[0], m29039f[1], i));
    }

    /* renamed from: d */
    public final WB1 m29041d(WB1 wb1) {
        this.f94297c.m16958b(wb1);
        return wb1;
    }

    /* renamed from: e */
    public final WB1[] m29040e(WB1[] wb1Arr) {
        C47686qp0 c47686qp0 = new C47686qp0();
        this.f94297c = c47686qp0;
        c47686qp0.m16959a(wb1Arr[0]);
        this.f94297c.m16959a(wb1Arr[1]);
        return new WB1[]{this.f94297c.m16957c(wb1Arr[0].m78752m()), this.f94297c.m16957c(wb1Arr[1].m78752m())};
    }

    /* renamed from: f */
    public final WB1[] m29039f(WB1[] wb1Arr) {
        WB1[] m29040e = m29040e(wb1Arr);
        return C40798fC1.m41746e(m29040e[0], m29040e[1], this.f94296b);
    }
}
