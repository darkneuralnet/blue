package p000;

import p000.PV5;
/* renamed from: ku */
/* loaded from: classes.dex */
public final class C25544ku extends PV5.AbstractC6398a {

    /* renamed from: a */
    public final int f95169a;

    /* renamed from: b */
    public final PV5 f95170b;

    public C25544ku(int i, PV5 pv5) {
        this.f95169a = i;
        if (pv5 != null) {
            this.f95170b = pv5;
            return;
        }
        throw new NullPointerException("Null surfaceOutput");
    }

    @Override // p000.PV5.AbstractC6398a
    /* renamed from: a */
    public int mo28203a() {
        return this.f95169a;
    }

    @Override // p000.PV5.AbstractC6398a
    /* renamed from: b */
    public PV5 mo28202b() {
        return this.f95170b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PV5.AbstractC6398a)) {
            return false;
        }
        PV5.AbstractC6398a abstractC6398a = (PV5.AbstractC6398a) obj;
        if (this.f95169a == abstractC6398a.mo28203a() && this.f95170b.equals(abstractC6398a.mo28202b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f95169a ^ 1000003) * 1000003) ^ this.f95170b.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.f95169a + ", surfaceOutput=" + this.f95170b + "}";
    }
}
