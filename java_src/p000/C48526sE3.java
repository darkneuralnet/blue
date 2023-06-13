package p000;
/* renamed from: sE3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C48526sE3<F, S> {

    /* renamed from: a */
    public final F f108491a;

    /* renamed from: b */
    public final S f108492b;

    public C48526sE3(F f, S s) {
        this.f108491a = f;
        this.f108492b = s;
    }

    /* renamed from: a */
    public static <A, B> C48526sE3<A, B> m14515a(A a, B b) {
        return new C48526sE3<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C48526sE3)) {
            return false;
        }
        C48526sE3 c48526sE3 = (C48526sE3) obj;
        if (!C37259Yd3.m74780a(c48526sE3.f108491a, this.f108491a) || !C37259Yd3.m74780a(c48526sE3.f108492b, this.f108492b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f = this.f108491a;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f108492b;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f108491a + " " + this.f108492b + "}";
    }
}
