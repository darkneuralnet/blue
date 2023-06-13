package p000;
/* renamed from: e0 */
/* loaded from: classes6.dex */
public final class C19922e0<T> extends AbstractC44221ky3<T> {

    /* renamed from: b */
    public static final C19922e0<Object> f77526b = new C19922e0<>();
    private static final long serialVersionUID = 0;

    private C19922e0() {
    }

    /* renamed from: e */
    public static <T> AbstractC44221ky3<T> m43416e() {
        return f77526b;
    }

    private Object readResolve() {
        return f77526b;
    }

    @Override // p000.AbstractC44221ky3
    /* renamed from: b */
    public boolean mo28086b() {
        return false;
    }

    @Override // p000.AbstractC44221ky3
    /* renamed from: d */
    public T mo28084d(T t) {
        return (T) EZ3.m108800o(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
