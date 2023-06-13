package p000;
/* renamed from: nb5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45772nb5 {

    /* renamed from: a */
    public C48772sf1 f100179a;

    /* renamed from: b */
    public double f100180b;

    /* renamed from: c */
    public double f100181c;

    /* renamed from: d */
    public double f100182d;

    /* renamed from: e */
    public double f100183e;

    public C45772nb5(C48772sf1 c48772sf1) {
        this.f100179a = c48772sf1;
        this.f100180b = c48772sf1.m13868q();
        this.f100181c = c48772sf1.m13870o();
        this.f100182d = c48772sf1.m13869p();
        this.f100183e = c48772sf1.m13871n();
    }

    /* renamed from: a */
    public C52053yB0[] m23476a(C52053yB0[] c52053yB0Arr) {
        boolean z;
        for (int i = 0; i < 4; i++) {
            if (i == 3) {
                z = true;
            } else {
                z = false;
            }
            c52053yB0Arr = m23475b(c52053yB0Arr, i, z);
            if (c52053yB0Arr.length == 0) {
                return c52053yB0Arr;
            }
        }
        return c52053yB0Arr;
    }

    /* renamed from: b */
    public final C52053yB0[] m23475b(C52053yB0[] c52053yB0Arr, int i, boolean z) {
        DB0 db0 = new DB0();
        C52053yB0 c52053yB0 = c52053yB0Arr[c52053yB0Arr.length - 1];
        int i2 = 0;
        while (i2 < c52053yB0Arr.length) {
            C52053yB0 c52053yB02 = c52053yB0Arr[i2];
            if (m23471f(c52053yB02, i)) {
                if (!m23471f(c52053yB0, i)) {
                    db0.m110797f(m23474c(c52053yB0, c52053yB02, i), false);
                }
                db0.m110797f(c52053yB02.mo3888e(), false);
            } else if (m23471f(c52053yB0, i)) {
                db0.m110797f(m23474c(c52053yB0, c52053yB02, i), false);
            }
            i2++;
            c52053yB0 = c52053yB02;
        }
        if (z && db0.size() > 0) {
            C52053yB0 c52053yB03 = db0.get(0);
            if (!c52053yB03.m3886g(db0.get(db0.size() - 1))) {
                db0.add(c52053yB03.mo3888e());
            }
        }
        return db0.m110799b2();
    }

    /* renamed from: c */
    public final C52053yB0 m23474c(C52053yB0 c52053yB0, C52053yB0 c52053yB02, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    double d = this.f100182d;
                    return new C52053yB0(d, m23473d(c52053yB0, c52053yB02, d));
                }
                return new C52053yB0(m23472e(c52053yB0, c52053yB02, this.f100181c), this.f100181c);
            }
            double d2 = this.f100183e;
            return new C52053yB0(d2, m23473d(c52053yB0, c52053yB02, d2));
        }
        return new C52053yB0(m23472e(c52053yB0, c52053yB02, this.f100180b), this.f100180b);
    }

    /* renamed from: d */
    public final double m23473d(C52053yB0 c52053yB0, C52053yB0 c52053yB02, double d) {
        double d2 = c52053yB02.f118923c;
        double d3 = c52053yB0.f118923c;
        double d4 = c52053yB02.f118922b;
        double d5 = c52053yB0.f118922b;
        return d3 + ((d - d5) * ((d2 - d3) / (d4 - d5)));
    }

    /* renamed from: e */
    public final double m23472e(C52053yB0 c52053yB0, C52053yB0 c52053yB02, double d) {
        double d2 = c52053yB02.f118922b;
        double d3 = c52053yB0.f118922b;
        double d4 = c52053yB02.f118923c;
        double d5 = c52053yB0.f118923c;
        return d3 + ((d - d5) * ((d2 - d3) / (d4 - d5)));
    }

    /* renamed from: f */
    public final boolean m23471f(C52053yB0 c52053yB0, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (c52053yB0.f118922b <= this.f100182d) {
                        return false;
                    }
                } else if (c52053yB0.f118923c >= this.f100181c) {
                    return false;
                }
            } else if (c52053yB0.f118922b >= this.f100183e) {
                return false;
            }
        } else if (c52053yB0.f118923c <= this.f100180b) {
            return false;
        }
        return true;
    }
}
