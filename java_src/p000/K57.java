package p000;
/* renamed from: K57 */
/* loaded from: classes5.dex */
public final class K57 extends I57 {

    /* renamed from: b */
    public final Object f19061b;

    public K57(Object obj) {
        this.f19061b = obj;
    }

    @Override // p000.I57
    /* renamed from: a */
    public final Object mo4153a() {
        return this.f19061b;
    }

    @Override // p000.I57
    /* renamed from: b */
    public final Object mo4152b(Object obj) {
        return this.f19061b;
    }

    @Override // p000.I57
    /* renamed from: c */
    public final boolean mo4151c() {
        return true;
    }

    @Override // p000.I57
    public final boolean equals(Object obj) {
        if (obj instanceof K57) {
            return this.f19061b.equals(((K57) obj).f19061b);
        }
        return false;
    }

    @Override // p000.I57
    public final int hashCode() {
        return this.f19061b.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.f19061b.toString();
        return "Optional.of(" + obj + ")";
    }
}
