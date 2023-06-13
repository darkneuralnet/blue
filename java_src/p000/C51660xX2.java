package p000;
/* renamed from: xX2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C51660xX2<T> {

    /* renamed from: a */
    public T f117769a;

    /* renamed from: b */
    public T f117770b;

    /* renamed from: a */
    public static boolean m5066a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public void m5065b(T t, T t2) {
        this.f117769a = t;
        this.f117770b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C48526sE3)) {
            return false;
        }
        C48526sE3 c48526sE3 = (C48526sE3) obj;
        if (!m5066a(c48526sE3.f108491a, this.f117769a) || !m5066a(c48526sE3.f108492b, this.f117770b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t = this.f117769a;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f117770b;
        return hashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f117769a + " " + this.f117770b + "}";
    }
}
