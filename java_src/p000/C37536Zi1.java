package p000;

import p000.C35621Rd3;
/* renamed from: Zi1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37536Zi1 extends C35621Rd3.AbstractC7219a {

    /* renamed from: e */
    public static C35621Rd3<C37536Zi1> f48978e;

    /* renamed from: c */
    public float f48979c;

    /* renamed from: d */
    public float f48980d;

    static {
        C35621Rd3<C37536Zi1> m86536a = C35621Rd3.m86536a(256, new C37536Zi1(0.0f, 0.0f));
        f48978e = m86536a;
        m86536a.m86530g(0.5f);
    }

    public C37536Zi1() {
    }

    /* renamed from: b */
    public static C37536Zi1 m72661b(float f, float f2) {
        C37536Zi1 m86535b = f48978e.m86535b();
        m86535b.f48979c = f;
        m86535b.f48980d = f2;
        return m86535b;
    }

    /* renamed from: c */
    public static void m72660c(C37536Zi1 c37536Zi1) {
        f48978e.m86534c(c37536Zi1);
    }

    @Override // p000.C35621Rd3.AbstractC7219a
    /* renamed from: a */
    public C35621Rd3.AbstractC7219a mo72662a() {
        return new C37536Zi1(0.0f, 0.0f);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37536Zi1)) {
            return false;
        }
        C37536Zi1 c37536Zi1 = (C37536Zi1) obj;
        if (this.f48979c != c37536Zi1.f48979c || this.f48980d != c37536Zi1.f48980d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f48979c) ^ Float.floatToIntBits(this.f48980d);
    }

    public String toString() {
        return this.f48979c + "x" + this.f48980d;
    }

    public C37536Zi1(float f, float f2) {
        this.f48979c = f;
        this.f48980d = f2;
    }
}
