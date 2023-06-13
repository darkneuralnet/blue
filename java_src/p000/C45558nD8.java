package p000;
/* renamed from: nD8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45558nD8 extends QC8 {

    /* renamed from: b */
    public final Object f99651b;

    public C45558nD8(Object obj) {
        this.f99651b = obj;
    }

    @Override // p000.QC8
    /* renamed from: a */
    public final Object mo24138a() {
        return this.f99651b;
    }

    @Override // p000.QC8
    /* renamed from: b */
    public final boolean mo24137b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C45558nD8) {
            return this.f99651b.equals(((C45558nD8) obj).f99651b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f99651b.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.f99651b.toString();
        return "Optional.of(" + obj + ")";
    }
}
