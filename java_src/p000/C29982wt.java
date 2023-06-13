package p000;

import java.util.List;
import p000.InterfaceC44592lc1;
/* renamed from: wt */
/* loaded from: classes.dex */
public final class C29982wt extends InterfaceC44592lc1.AbstractC25738b {

    /* renamed from: a */
    public final int f116708a;

    /* renamed from: b */
    public final int f116709b;

    /* renamed from: c */
    public final List<InterfaceC44592lc1.AbstractC25737a> f116710c;

    /* renamed from: d */
    public final List<InterfaceC44592lc1.AbstractC25739c> f116711d;

    public C29982wt(int i, int i2, List<InterfaceC44592lc1.AbstractC25737a> list, List<InterfaceC44592lc1.AbstractC25739c> list2) {
        this.f116708a = i;
        this.f116709b = i2;
        if (list != null) {
            this.f116710c = list;
            if (list2 != null) {
                this.f116711d = list2;
                return;
            }
            throw new NullPointerException("Null videoProfiles");
        }
        throw new NullPointerException("Null audioProfiles");
    }

    @Override // p000.InterfaceC44592lc1
    /* renamed from: a */
    public int mo6193a() {
        return this.f116709b;
    }

    @Override // p000.InterfaceC44592lc1
    /* renamed from: b */
    public List<InterfaceC44592lc1.AbstractC25737a> mo6192b() {
        return this.f116710c;
    }

    @Override // p000.InterfaceC44592lc1
    /* renamed from: c */
    public int mo6191c() {
        return this.f116708a;
    }

    @Override // p000.InterfaceC44592lc1
    /* renamed from: d */
    public List<InterfaceC44592lc1.AbstractC25739c> mo6190d() {
        return this.f116711d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC44592lc1.AbstractC25738b)) {
            return false;
        }
        InterfaceC44592lc1.AbstractC25738b abstractC25738b = (InterfaceC44592lc1.AbstractC25738b) obj;
        if (this.f116708a == abstractC25738b.mo6191c() && this.f116709b == abstractC25738b.mo6193a() && this.f116710c.equals(abstractC25738b.mo6192b()) && this.f116711d.equals(abstractC25738b.mo6190d())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f116708a ^ 1000003) * 1000003) ^ this.f116709b) * 1000003) ^ this.f116710c.hashCode()) * 1000003) ^ this.f116711d.hashCode();
    }

    public String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.f116708a + ", recommendedFileFormat=" + this.f116709b + ", audioProfiles=" + this.f116710c + ", videoProfiles=" + this.f116711d + "}";
    }
}
