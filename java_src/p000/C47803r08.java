package p000;
/* renamed from: r08  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47803r08<T> extends AbstractC38891c08<T> {

    /* renamed from: b */
    public final T f106203b;

    public C47803r08(T t) {
        this.f106203b = t;
    }

    @Override // p000.AbstractC38891c08
    /* renamed from: a */
    public final T mo16672a() {
        return this.f106203b;
    }

    @Override // p000.AbstractC38891c08
    /* renamed from: b */
    public final boolean mo16671b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C47803r08) {
            return this.f106203b.equals(((C47803r08) obj).f106203b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f106203b.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f106203b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
