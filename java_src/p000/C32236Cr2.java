package p000;
/* renamed from: Cr2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C32236Cr2 {

    /* renamed from: a */
    public double f4811a;

    /* renamed from: b */
    public C52053yB0[] f4812b;

    /* renamed from: c */
    public C31768Ar2 f4813c = new C31768Ar2();

    /* renamed from: d */
    public boolean f4814d = false;

    /* renamed from: e */
    public boolean f4815e;

    public C32236Cr2(C52053yB0[] c52053yB0Arr, double d) {
        this.f4811a = 0.0d;
        this.f4815e = false;
        this.f4812b = c52053yB0Arr;
        this.f4815e = m111406c(c52053yB0Arr);
        this.f4811a = d;
    }

    /* renamed from: c */
    public static boolean m111406c(C52053yB0[] c52053yB0Arr) {
        if (c52053yB0Arr.length <= 1) {
            return false;
        }
        return c52053yB0Arr[0].m3886g(c52053yB0Arr[c52053yB0Arr.length - 1]);
    }

    /* renamed from: a */
    public final int m111408a(C52053yB0 c52053yB0, DB0 db0) {
        double d = Double.MAX_VALUE;
        int i = 0;
        int i2 = -1;
        while (i < db0.size() - 1) {
            this.f4813c.f1204b = db0.get(i);
            int i3 = i + 1;
            this.f4813c.f1205c = db0.get(i3);
            if (!this.f4813c.f1204b.m3886g(c52053yB0) && !this.f4813c.f1205c.m3886g(c52053yB0)) {
                double m115110a = this.f4813c.m115110a(c52053yB0);
                if (m115110a < this.f4811a && m115110a < d) {
                    i2 = i;
                    d = m115110a;
                }
            } else if (!this.f4814d) {
                return -1;
            }
            i = i3;
        }
        return i2;
    }

    /* renamed from: b */
    public final C52053yB0 m111407b(C52053yB0 c52053yB0, C52053yB0[] c52053yB0Arr) {
        for (int i = 0; i < c52053yB0Arr.length && !c52053yB0.m3886g(c52053yB0Arr[i]); i++) {
            if (c52053yB0.m3887f(c52053yB0Arr[i]) < this.f4811a) {
                return c52053yB0Arr[i];
            }
        }
        return null;
    }

    /* renamed from: d */
    public void m111405d(boolean z) {
        this.f4814d = z;
    }

    /* renamed from: e */
    public final void m111404e(DB0 db0, C52053yB0[] c52053yB0Arr) {
        if (c52053yB0Arr.length == 0) {
            return;
        }
        int length = c52053yB0Arr.length;
        if (c52053yB0Arr[0].m3886g(c52053yB0Arr[c52053yB0Arr.length - 1])) {
            length = c52053yB0Arr.length - 1;
        }
        for (int i = 0; i < length; i++) {
            C52053yB0 c52053yB0 = c52053yB0Arr[i];
            int m111408a = m111408a(c52053yB0, db0);
            if (m111408a >= 0) {
                db0.m110798e(m111408a + 1, new C52053yB0(c52053yB0), false);
            }
        }
    }

    /* renamed from: f */
    public C52053yB0[] m111403f(C52053yB0[] c52053yB0Arr) {
        DB0 db0 = new DB0(this.f4812b);
        m111402g(db0, c52053yB0Arr);
        m111404e(db0, c52053yB0Arr);
        return db0.m110799b2();
    }

    /* renamed from: g */
    public final void m111402g(DB0 db0, C52053yB0[] c52053yB0Arr) {
        int size = this.f4815e ? db0.size() - 1 : db0.size();
        for (int i = 0; i < size; i++) {
            C52053yB0 m111407b = m111407b(db0.get(i), c52053yB0Arr);
            if (m111407b != null) {
                db0.set(i, new C52053yB0(m111407b));
                if (i == 0 && this.f4815e) {
                    db0.set(db0.size() - 1, new C52053yB0(m111407b));
                }
            }
        }
    }
}
