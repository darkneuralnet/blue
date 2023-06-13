package p000;
/* renamed from: oY6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46338oY6 extends L77 {

    /* renamed from: a */
    public final int f102136a;

    /* renamed from: b */
    public final I57 f102137b;

    public C46338oY6(int i, I57 i57) {
        this.f102136a = i;
        this.f102137b = i57;
    }

    @Override // p000.L77
    /* renamed from: a */
    public final int mo20902a() {
        return this.f102136a;
    }

    @Override // p000.L77
    /* renamed from: b */
    public final I57 mo20901b() {
        return this.f102137b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof L77) {
            L77 l77 = (L77) obj;
            if (this.f102136a == l77.mo20902a() && this.f102137b.equals(l77.mo20901b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f102136a ^ 1000003) * 1000003) ^ this.f102137b.hashCode();
    }

    public final String toString() {
        int i = this.f102136a;
        String obj = this.f102137b.toString();
        return "VkpStatus{exceptionType=" + i + ", remoteException=" + obj + "}";
    }
}
