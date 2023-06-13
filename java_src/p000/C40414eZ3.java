package p000;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* renamed from: eZ3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C40414eZ3 implements Serializable, Comparable {

    /* renamed from: e */
    public static final C20067a f78545e = new C20067a("FIXED");

    /* renamed from: f */
    public static final C20067a f78546f = new C20067a("FLOATING");

    /* renamed from: g */
    public static final C20067a f78547g = new C20067a("FLOATING SINGLE");
    private static final long serialVersionUID = 7777263578777803835L;

    /* renamed from: b */
    public C20067a f78548b;

    /* renamed from: c */
    public double f78549c;

    /* renamed from: d */
    public double f78550d;

    /* renamed from: eZ3$a */
    /* loaded from: classes8.dex */
    public static class C20067a implements Serializable {

        /* renamed from: c */
        public static Map f78551c = new HashMap();
        private static final long serialVersionUID = -5528602631731589822L;

        /* renamed from: b */
        public String f78552b;

        public C20067a(String str) {
            this.f78552b = str;
            f78551c.put(str, this);
        }

        private Object readResolve() {
            return f78551c.get(this.f78552b);
        }

        public String toString() {
            return this.f78552b;
        }
    }

    public C40414eZ3() {
        this.f78548b = f78546f;
    }

    /* renamed from: a */
    public int m42765a() {
        C20067a c20067a = this.f78548b;
        if (c20067a == f78546f) {
            return 16;
        }
        if (c20067a == f78547g) {
            return 6;
        }
        if (c20067a != f78545e) {
            return 16;
        }
        return ((int) Math.ceil(Math.log(m42764b()) / Math.log(10.0d))) + 1;
    }

    /* renamed from: b */
    public double m42764b() {
        return this.f78549c;
    }

    /* renamed from: c */
    public C20067a m42763c() {
        return this.f78548b;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return Integer.compare(m42765a(), ((C40414eZ3) obj).m42765a());
    }

    /* renamed from: d */
    public boolean m42762d() {
        C20067a c20067a = this.f78548b;
        return c20067a == f78546f || c20067a == f78547g;
    }

    /* renamed from: e */
    public double m42761e(double d) {
        if (Double.isNaN(d)) {
            return d;
        }
        C20067a c20067a = this.f78548b;
        if (c20067a == f78547g) {
            return (float) d;
        }
        if (c20067a == f78545e) {
            double d2 = this.f78550d;
            if (d2 > 0.0d) {
                return Math.round(d / d2) * this.f78550d;
            }
            return Math.round(d * this.f78549c) / this.f78549c;
        }
        return d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C40414eZ3)) {
            return false;
        }
        C40414eZ3 c40414eZ3 = (C40414eZ3) obj;
        if (this.f78548b != c40414eZ3.f78548b || this.f78549c != c40414eZ3.f78549c) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void m42760f(C52053yB0 c52053yB0) {
        if (this.f78548b == f78546f) {
            return;
        }
        c52053yB0.f118922b = m42761e(c52053yB0.f118922b);
        c52053yB0.f118923c = m42761e(c52053yB0.f118923c);
    }

    /* renamed from: g */
    public final void m42759g(double d) {
        if (d < 0.0d) {
            double abs = Math.abs(d);
            this.f78550d = abs;
            this.f78549c = 1.0d / abs;
            return;
        }
        this.f78549c = Math.abs(d);
        this.f78550d = 0.0d;
    }

    public int hashCode() {
        int hashCode;
        C20067a c20067a = this.f78548b;
        if (c20067a == null) {
            hashCode = 0;
        } else {
            hashCode = c20067a.hashCode();
        }
        long doubleToLongBits = Double.doubleToLongBits(this.f78549c);
        return ((hashCode + 31) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public String toString() {
        C20067a c20067a = this.f78548b;
        if (c20067a == f78546f) {
            return "Floating";
        }
        if (c20067a == f78547g) {
            return "Floating-Single";
        }
        if (c20067a == f78545e) {
            return "Fixed (Scale=" + m42764b() + ")";
        }
        return "UNKNOWN";
    }

    public C40414eZ3(double d) {
        this.f78548b = f78545e;
        m42759g(d);
    }
}
