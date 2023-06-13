package p000;
/* renamed from: OQ8 */
/* loaded from: classes5.dex */
public final class OQ8 extends LP8 {

    /* renamed from: b */
    public final Object f26561b;

    public OQ8(Object obj) {
        this.f26561b = obj;
    }

    @Override // p000.LP8
    /* renamed from: a */
    public final Object mo78527a() {
        return this.f26561b;
    }

    @Override // p000.LP8
    /* renamed from: b */
    public final Object mo78526b(Object obj) {
        DQ8.m110468c(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.f26561b;
    }

    @Override // p000.LP8
    /* renamed from: c */
    public final boolean mo78525c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OQ8) {
            return this.f26561b.equals(((OQ8) obj).f26561b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26561b.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.f26561b.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 13);
        sb.append("Optional.of(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
