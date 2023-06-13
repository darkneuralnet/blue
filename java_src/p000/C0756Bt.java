package p000;

import p000.C33567Ij1;
/* renamed from: Bt */
/* loaded from: classes.dex */
public final class C0756Bt extends C33567Ij1.AbstractC3746b {

    /* renamed from: b */
    public final C52885zb4 f2993b;

    /* renamed from: c */
    public final int f2994c;

    public C0756Bt(C52885zb4 c52885zb4, int i) {
        if (c52885zb4 != null) {
            this.f2993b = c52885zb4;
            this.f2994c = i;
            return;
        }
        throw new NullPointerException("Null fallbackQuality");
    }

    @Override // p000.C33567Ij1.AbstractC3746b
    /* renamed from: c */
    public C52885zb4 mo101748c() {
        return this.f2993b;
    }

    @Override // p000.C33567Ij1.AbstractC3746b
    /* renamed from: d */
    public int mo101747d() {
        return this.f2994c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C33567Ij1.AbstractC3746b)) {
            return false;
        }
        C33567Ij1.AbstractC3746b abstractC3746b = (C33567Ij1.AbstractC3746b) obj;
        if (this.f2993b.equals(abstractC3746b.mo101748c()) && this.f2994c == abstractC3746b.mo101747d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2993b.hashCode() ^ 1000003) * 1000003) ^ this.f2994c;
    }

    public String toString() {
        return "RuleStrategy{fallbackQuality=" + this.f2993b + ", fallbackRule=" + this.f2994c + "}";
    }
}
