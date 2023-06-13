package p000;
/* renamed from: f32  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C40711f32 {

    /* renamed from: a */
    public WB1[] f79345a;

    /* renamed from: b */
    public NW3 f79346b;

    /* renamed from: c */
    public NW3 f79347c;

    /* renamed from: d */
    public boolean[] f79348d = new boolean[2];

    public C40711f32(WB1 wb1, WB1 wb12) {
        this.f79345a = new WB1[]{wb1, wb12};
    }

    /* renamed from: a */
    public int m42231a() {
        if (m42230b(0) == 2) {
            return 0;
        }
        if (m42230b(1) == 2) {
            return 1;
        }
        return -1;
    }

    /* renamed from: b */
    public int m42230b(int i) {
        WB1 wb1 = this.f79345a[i];
        if (wb1 == null) {
            return -1;
        }
        return wb1.mo77244F();
    }

    /* renamed from: c */
    public C48772sf1 m42229c(int i) {
        return this.f79345a[i].m78759Z();
    }

    /* renamed from: d */
    public WB1 m42228d(int i) {
        return this.f79345a[i];
    }

    /* renamed from: e */
    public final NW3 m42227e(int i) {
        if (i == 0) {
            if (this.f79346b == null) {
                this.f79346b = new C50770w12(m42228d(i));
            }
            return this.f79346b;
        }
        if (this.f79347c == null) {
            this.f79347c = new C50770w12(m42228d(i));
        }
        return this.f79347c;
    }

    /* renamed from: f */
    public boolean m42226f(int i) {
        WB1 wb1 = this.f79345a[i];
        return wb1 != null && wb1.mo77244F() > 0;
    }

    /* renamed from: g */
    public boolean m42225g() {
        return m42230b(0) == 0 || m42230b(1) == 0;
    }

    /* renamed from: h */
    public boolean m42224h() {
        if (m42230b(0) != 0 || this.f79345a[1] == null || m42230b(1) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public boolean m42223i(int i) {
        WB1 wb1 = this.f79345a[i];
        return wb1 != null && wb1.mo77244F() == 2;
    }

    /* renamed from: j */
    public boolean m42222j(int i) {
        return m42230b(i) == 1;
    }

    /* renamed from: k */
    public boolean m42221k() {
        return this.f79345a[1] == null;
    }

    /* renamed from: l */
    public int m42220l(int i, C52053yB0 c52053yB0) {
        if (this.f79348d[i] || m42228d(i).mo77226r0() || this.f79348d[i]) {
            return 2;
        }
        return m42227e(i).mo5981a(c52053yB0);
    }

    /* renamed from: m */
    public void m42219m(int i, boolean z) {
        this.f79348d[i] = z;
    }
}
