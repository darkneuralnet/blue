package p000;

import androidx.camera.core.InterfaceC11183i;
import p000.C44621lf0;
/* renamed from: rt */
/* loaded from: classes.dex */
public final class C28046rt extends C44621lf0.AbstractC25756c {

    /* renamed from: a */
    public final C48478s91<InterfaceC11183i> f107823a;

    /* renamed from: b */
    public final C48478s91<C40753f74> f107824b;

    /* renamed from: c */
    public final int f107825c;

    public C28046rt(C48478s91<InterfaceC11183i> c48478s91, C48478s91<C40753f74> c48478s912, int i) {
        if (c48478s91 != null) {
            this.f107823a = c48478s91;
            if (c48478s912 != null) {
                this.f107824b = c48478s912;
                this.f107825c = i;
                return;
            }
            throw new NullPointerException("Null requestEdge");
        }
        throw new NullPointerException("Null imageEdge");
    }

    @Override // p000.C44621lf0.AbstractC25756c
    /* renamed from: a */
    public int mo15141a() {
        return this.f107825c;
    }

    @Override // p000.C44621lf0.AbstractC25756c
    /* renamed from: b */
    public C48478s91<InterfaceC11183i> mo15140b() {
        return this.f107823a;
    }

    @Override // p000.C44621lf0.AbstractC25756c
    /* renamed from: c */
    public C48478s91<C40753f74> mo15139c() {
        return this.f107824b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C44621lf0.AbstractC25756c)) {
            return false;
        }
        C44621lf0.AbstractC25756c abstractC25756c = (C44621lf0.AbstractC25756c) obj;
        if (this.f107823a.equals(abstractC25756c.mo15140b()) && this.f107824b.equals(abstractC25756c.mo15139c()) && this.f107825c == abstractC25756c.mo15141a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f107823a.hashCode() ^ 1000003) * 1000003) ^ this.f107824b.hashCode()) * 1000003) ^ this.f107825c;
    }

    public String toString() {
        return "Out{imageEdge=" + this.f107823a + ", requestEdge=" + this.f107824b + ", format=" + this.f107825c + "}";
    }
}
