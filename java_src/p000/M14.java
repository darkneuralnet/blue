package p000;
/* renamed from: M14 */
/* loaded from: classes6.dex */
public final class M14<T> extends AbstractC44221ky3<T> {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    public final T f22446b;

    public M14(T t) {
        this.f22446b = t;
    }

    @Override // p000.AbstractC44221ky3
    /* renamed from: b */
    public boolean mo28086b() {
        return true;
    }

    @Override // p000.AbstractC44221ky3
    /* renamed from: d */
    public T mo28084d(T t) {
        EZ3.m108800o(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.f22446b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof M14) {
            return this.f22446b.equals(((M14) obj).f22446b);
        }
        return false;
    }

    public int hashCode() {
        return this.f22446b.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f22446b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
