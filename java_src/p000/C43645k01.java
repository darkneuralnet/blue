package p000;
/* renamed from: k01  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43645k01 {

    /* renamed from: a */
    public final C52292yb4<?> f93745a;

    /* renamed from: b */
    public final int f93746b;

    /* renamed from: c */
    public final int f93747c;

    public C43645k01(Class<?> cls, int i, int i2) {
        this(C52292yb4.m3202b(cls), i, i2);
    }

    /* renamed from: a */
    public static C43645k01 m29493a(Class<?> cls) {
        return new C43645k01(cls, 0, 2);
    }

    /* renamed from: b */
    public static String m29492b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i);
            }
            return "provider";
        }
        return "direct";
    }

    @Deprecated
    /* renamed from: h */
    public static C43645k01 m29486h(Class<?> cls) {
        return new C43645k01(cls, 0, 0);
    }

    /* renamed from: i */
    public static C43645k01 m29485i(Class<?> cls) {
        return new C43645k01(cls, 0, 1);
    }

    /* renamed from: j */
    public static C43645k01 m29484j(C52292yb4<?> c52292yb4) {
        return new C43645k01(c52292yb4, 1, 0);
    }

    /* renamed from: k */
    public static C43645k01 m29483k(Class<?> cls) {
        return new C43645k01(cls, 1, 0);
    }

    /* renamed from: l */
    public static C43645k01 m29482l(Class<?> cls) {
        return new C43645k01(cls, 1, 1);
    }

    /* renamed from: m */
    public static C43645k01 m29481m(Class<?> cls) {
        return new C43645k01(cls, 2, 0);
    }

    /* renamed from: c */
    public C52292yb4<?> m29491c() {
        return this.f93745a;
    }

    /* renamed from: d */
    public boolean m29490d() {
        return this.f93747c == 2;
    }

    /* renamed from: e */
    public boolean m29489e() {
        return this.f93747c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C43645k01)) {
            return false;
        }
        C43645k01 c43645k01 = (C43645k01) obj;
        if (!this.f93745a.equals(c43645k01.f93745a) || this.f93746b != c43645k01.f93746b || this.f93747c != c43645k01.f93747c) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m29488f() {
        return this.f93746b == 1;
    }

    /* renamed from: g */
    public boolean m29487g() {
        return this.f93746b == 2;
    }

    public int hashCode() {
        return ((((this.f93745a.hashCode() ^ 1000003) * 1000003) ^ this.f93746b) * 1000003) ^ this.f93747c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f93745a);
        sb.append(", type=");
        int i = this.f93746b;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(m29492b(this.f93747c));
        sb.append("}");
        return sb.toString();
    }

    public C43645k01(C52292yb4<?> c52292yb4, int i, int i2) {
        this.f93745a = (C52292yb4) FZ3.m106945c(c52292yb4, "Null dependency anInterface.");
        this.f93746b = i;
        this.f93747c = i2;
    }
}
