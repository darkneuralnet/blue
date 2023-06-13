package p000;

import p000.DV5;
/* renamed from: ju */
/* loaded from: classes.dex */
public final class C25037ju extends DV5 {

    /* renamed from: a */
    public final DV5.EnumC1500b f93515a;

    /* renamed from: b */
    public final DV5.EnumC1499a f93516b;

    public C25037ju(DV5.EnumC1500b enumC1500b, DV5.EnumC1499a enumC1499a) {
        if (enumC1500b != null) {
            this.f93515a = enumC1500b;
            if (enumC1499a != null) {
                this.f93516b = enumC1499a;
                return;
            }
            throw new NullPointerException("Null configSize");
        }
        throw new NullPointerException("Null configType");
    }

    @Override // p000.DV5
    /* renamed from: b */
    public DV5.EnumC1499a mo29774b() {
        return this.f93516b;
    }

    @Override // p000.DV5
    /* renamed from: c */
    public DV5.EnumC1500b mo29773c() {
        return this.f93515a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DV5)) {
            return false;
        }
        DV5 dv5 = (DV5) obj;
        if (this.f93515a.equals(dv5.mo29773c()) && this.f93516b.equals(dv5.mo29774b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f93515a.hashCode() ^ 1000003) * 1000003) ^ this.f93516b.hashCode();
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f93515a + ", configSize=" + this.f93516b + "}";
    }
}
