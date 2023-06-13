package p000;
/* renamed from: C91 */
/* loaded from: classes8.dex */
public class C91 implements Comparable<C91> {

    /* renamed from: b */
    public double f3512b;

    /* renamed from: c */
    public double f3513c;

    /* renamed from: d */
    public double f3514d;

    /* renamed from: e */
    public double f3515e;

    public C91(C47886r91 c47886r91) {
        m112734f(c47886r91);
    }

    /* renamed from: b */
    public static C91 m112738b(C47886r91 c47886r91) {
        return new C91(c47886r91);
    }

    /* renamed from: d */
    public static int m112736d(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C91 c91) {
        double d = this.f3512b;
        double d2 = c91.f3512b;
        if (d < d2) {
            return -1;
        }
        if (d > d2) {
            return 1;
        }
        double d3 = this.f3513c;
        double d4 = c91.f3513c;
        if (d3 < d4) {
            return -1;
        }
        if (d3 > d4) {
            return 1;
        }
        double d5 = this.f3514d;
        double d6 = c91.f3514d;
        if (d5 < d6) {
            return -1;
        }
        if (d5 > d6) {
            return 1;
        }
        double d7 = this.f3515e;
        double d8 = c91.f3515e;
        if (d7 < d8) {
            return -1;
        }
        if (d7 > d8) {
            return 1;
        }
        return 0;
    }

    /* renamed from: c */
    public final String m112737c(double d, double d2) {
        return C32066By3.f3145b.m113211c(d) + " " + C32066By3.f3145b.m113211c(d2);
    }

    /* renamed from: e */
    public final void m112735e(C52053yB0 c52053yB0, C52053yB0 c52053yB02) {
        this.f3512b = c52053yB0.m3883k();
        this.f3513c = c52053yB0.m3882l();
        this.f3514d = c52053yB02.m3883k();
        this.f3515e = c52053yB02.m3882l();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C91)) {
            return false;
        }
        C91 c91 = (C91) obj;
        if (this.f3512b != c91.f3512b || this.f3513c != c91.f3513c || this.f3514d != c91.f3514d || this.f3515e != c91.f3515e) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void m112734f(C47886r91 c47886r91) {
        if (c47886r91.m16349d()) {
            m112735e(c47886r91.m16348e(0), c47886r91.m16348e(1));
            return;
        }
        int m16334s = c47886r91.m16334s();
        m112735e(c47886r91.m16348e(m16334s - 1), c47886r91.m16348e(m16334s - 2));
    }

    public int hashCode() {
        return ((((((629 + m112736d(this.f3512b)) * 37) + m112736d(this.f3513c)) * 37) + m112736d(this.f3514d)) * 37) + m112736d(this.f3515e);
    }

    public String toString() {
        return "EdgeKey(" + m112737c(this.f3512b, this.f3513c) + ", " + m112737c(this.f3514d, this.f3515e) + ")";
    }
}
