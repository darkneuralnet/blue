package p000;

import p000.C35379Qc4;
/* renamed from: Zt */
/* loaded from: classes.dex */
public final class C10427Zt extends C35379Qc4.AbstractC6815a {

    /* renamed from: a */
    public final C52885zb4 f49443a;

    /* renamed from: b */
    public final int f49444b;

    public C10427Zt(C52885zb4 c52885zb4, int i) {
        if (c52885zb4 != null) {
            this.f49443a = c52885zb4;
            this.f49444b = i;
            return;
        }
        throw new NullPointerException("Null quality");
    }

    @Override // p000.C35379Qc4.AbstractC6815a
    /* renamed from: a */
    public int mo72351a() {
        return this.f49444b;
    }

    @Override // p000.C35379Qc4.AbstractC6815a
    /* renamed from: b */
    public C52885zb4 mo72350b() {
        return this.f49443a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C35379Qc4.AbstractC6815a)) {
            return false;
        }
        C35379Qc4.AbstractC6815a abstractC6815a = (C35379Qc4.AbstractC6815a) obj;
        if (this.f49443a.equals(abstractC6815a.mo72350b()) && this.f49444b == abstractC6815a.mo72351a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f49443a.hashCode() ^ 1000003) * 1000003) ^ this.f49444b;
    }

    public String toString() {
        return "QualityRatio{quality=" + this.f49443a + ", aspectRatio=" + this.f49444b + "}";
    }
}
