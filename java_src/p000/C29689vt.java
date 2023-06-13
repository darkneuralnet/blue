package p000;

import p000.InterfaceC44592lc1;
/* renamed from: vt */
/* loaded from: classes.dex */
public final class C29689vt extends InterfaceC44592lc1.AbstractC25737a {

    /* renamed from: a */
    public final int f114843a;

    /* renamed from: b */
    public final String f114844b;

    /* renamed from: c */
    public final int f114845c;

    /* renamed from: d */
    public final int f114846d;

    /* renamed from: e */
    public final int f114847e;

    /* renamed from: f */
    public final int f114848f;

    public C29689vt(int i, String str, int i2, int i3, int i4, int i5) {
        this.f114843a = i;
        if (str != null) {
            this.f114844b = str;
            this.f114845c = i2;
            this.f114846d = i3;
            this.f114847e = i4;
            this.f114848f = i5;
            return;
        }
        throw new NullPointerException("Null mediaType");
    }

    @Override // p000.InterfaceC44592lc1.AbstractC25737a
    /* renamed from: b */
    public int mo7874b() {
        return this.f114845c;
    }

    @Override // p000.InterfaceC44592lc1.AbstractC25737a
    /* renamed from: c */
    public int mo7873c() {
        return this.f114847e;
    }

    @Override // p000.InterfaceC44592lc1.AbstractC25737a
    /* renamed from: d */
    public int mo7872d() {
        return this.f114843a;
    }

    @Override // p000.InterfaceC44592lc1.AbstractC25737a
    /* renamed from: e */
    public String mo7871e() {
        return this.f114844b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC44592lc1.AbstractC25737a)) {
            return false;
        }
        InterfaceC44592lc1.AbstractC25737a abstractC25737a = (InterfaceC44592lc1.AbstractC25737a) obj;
        if (this.f114843a == abstractC25737a.mo7872d() && this.f114844b.equals(abstractC25737a.mo7871e()) && this.f114845c == abstractC25737a.mo7874b() && this.f114846d == abstractC25737a.mo7869g() && this.f114847e == abstractC25737a.mo7873c() && this.f114848f == abstractC25737a.mo7870f()) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC44592lc1.AbstractC25737a
    /* renamed from: f */
    public int mo7870f() {
        return this.f114848f;
    }

    @Override // p000.InterfaceC44592lc1.AbstractC25737a
    /* renamed from: g */
    public int mo7869g() {
        return this.f114846d;
    }

    public int hashCode() {
        return ((((((((((this.f114843a ^ 1000003) * 1000003) ^ this.f114844b.hashCode()) * 1000003) ^ this.f114845c) * 1000003) ^ this.f114846d) * 1000003) ^ this.f114847e) * 1000003) ^ this.f114848f;
    }

    public String toString() {
        return "AudioProfileProxy{codec=" + this.f114843a + ", mediaType=" + this.f114844b + ", bitrate=" + this.f114845c + ", sampleRate=" + this.f114846d + ", channels=" + this.f114847e + ", profile=" + this.f114848f + "}";
    }
}
