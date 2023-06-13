package p000;
/* renamed from: AW5 */
/* loaded from: classes8.dex */
public class AW5 implements Comparable {

    /* renamed from: b */
    public Object f674b;

    /* renamed from: c */
    public double f675c;

    /* renamed from: d */
    public int f676d;

    /* renamed from: e */
    public AW5 f677e;

    /* renamed from: f */
    public int f678f;

    /* renamed from: g */
    public Object f679g;

    public AW5(Object obj, double d, Object obj2) {
        this.f677e = null;
        this.f676d = 1;
        this.f674b = obj;
        this.f675c = d;
        this.f679g = obj2;
    }

    /* renamed from: a */
    public int m115686a() {
        return this.f678f;
    }

    /* renamed from: b */
    public AW5 m115685b() {
        return this.f677e;
    }

    /* renamed from: c */
    public Object m115684c() {
        return this.f679g;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        AW5 aw5 = (AW5) obj;
        double d = this.f675c;
        double d2 = aw5.f675c;
        if (d < d2) {
            return -1;
        }
        if (d > d2) {
            return 1;
        }
        int i = this.f676d;
        int i2 = aw5.f676d;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return 0;
    }

    /* renamed from: d */
    public boolean m115683d() {
        return this.f676d == 2;
    }

    /* renamed from: e */
    public boolean m115682e() {
        return this.f676d == 1;
    }

    /* renamed from: f */
    public boolean m115681f(AW5 aw5) {
        Object obj = this.f674b;
        if (obj == null || obj != aw5.f674b) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void m115680g(int i) {
        this.f678f = i;
    }

    public AW5(double d, AW5 aw5) {
        this.f676d = 2;
        this.f675c = d;
        this.f677e = aw5;
    }
}
