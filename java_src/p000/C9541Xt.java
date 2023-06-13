package p000;

import p000.C40160e74;
/* renamed from: Xt */
/* loaded from: classes.dex */
public final class C9541Xt extends C40160e74.AbstractC19964a {

    /* renamed from: a */
    public final C48478s91<C40160e74.AbstractC19965b> f44149a;

    /* renamed from: b */
    public final int f44150b;

    public C9541Xt(C48478s91<C40160e74.AbstractC19965b> c48478s91, int i) {
        if (c48478s91 != null) {
            this.f44149a = c48478s91;
            this.f44150b = i;
            return;
        }
        throw new NullPointerException("Null edge");
    }

    @Override // p000.C40160e74.AbstractC19964a
    /* renamed from: a */
    public C48478s91<C40160e74.AbstractC19965b> mo43251a() {
        return this.f44149a;
    }

    @Override // p000.C40160e74.AbstractC19964a
    /* renamed from: b */
    public int mo43250b() {
        return this.f44150b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C40160e74.AbstractC19964a)) {
            return false;
        }
        C40160e74.AbstractC19964a abstractC19964a = (C40160e74.AbstractC19964a) obj;
        if (this.f44149a.equals(abstractC19964a.mo43251a()) && this.f44150b == abstractC19964a.mo43250b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f44149a.hashCode() ^ 1000003) * 1000003) ^ this.f44150b;
    }

    public String toString() {
        return "In{edge=" + this.f44149a + ", format=" + this.f44150b + "}";
    }
}
