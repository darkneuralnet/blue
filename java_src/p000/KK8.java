package p000;
/* renamed from: KK8 */
/* loaded from: classes6.dex */
public final class KK8<T> extends EJ8<T> {

    /* renamed from: b */
    public final T f19448b;

    public KK8(T t) {
        this.f19448b = t;
    }

    @Override // p000.EJ8
    /* renamed from: a */
    public final T mo21499a() {
        return this.f19448b;
    }

    @Override // p000.EJ8
    /* renamed from: b */
    public final boolean mo21498b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KK8) {
            return this.f19448b.equals(((KK8) obj).f19448b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19448b.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19448b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
