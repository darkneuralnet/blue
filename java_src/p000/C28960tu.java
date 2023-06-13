package p000;

import java.util.List;
import p000.InterfaceC44592lc1;
/* renamed from: tu */
/* loaded from: classes.dex */
public final class C28960tu extends AbstractC52434yp6 {

    /* renamed from: a */
    public final int f111348a;

    /* renamed from: b */
    public final int f111349b;

    /* renamed from: c */
    public final List<InterfaceC44592lc1.AbstractC25737a> f111350c;

    /* renamed from: d */
    public final List<InterfaceC44592lc1.AbstractC25739c> f111351d;

    /* renamed from: e */
    public final InterfaceC44592lc1.AbstractC25737a f111352e;

    /* renamed from: f */
    public final InterfaceC44592lc1.AbstractC25739c f111353f;

    public C28960tu(int i, int i2, List<InterfaceC44592lc1.AbstractC25737a> list, List<InterfaceC44592lc1.AbstractC25739c> list2, InterfaceC44592lc1.AbstractC25737a abstractC25737a, InterfaceC44592lc1.AbstractC25739c abstractC25739c) {
        this.f111348a = i;
        this.f111349b = i2;
        if (list != null) {
            this.f111350c = list;
            if (list2 != null) {
                this.f111351d = list2;
                this.f111352e = abstractC25737a;
                if (abstractC25739c != null) {
                    this.f111353f = abstractC25739c;
                    return;
                }
                throw new NullPointerException("Null defaultVideoProfile");
            }
            throw new NullPointerException("Null videoProfiles");
        }
        throw new NullPointerException("Null audioProfiles");
    }

    @Override // p000.InterfaceC44592lc1
    /* renamed from: a */
    public int mo6193a() {
        return this.f111349b;
    }

    @Override // p000.InterfaceC44592lc1
    /* renamed from: b */
    public List<InterfaceC44592lc1.AbstractC25737a> mo6192b() {
        return this.f111350c;
    }

    @Override // p000.InterfaceC44592lc1
    /* renamed from: c */
    public int mo6191c() {
        return this.f111348a;
    }

    @Override // p000.InterfaceC44592lc1
    /* renamed from: d */
    public List<InterfaceC44592lc1.AbstractC25739c> mo6190d() {
        return this.f111351d;
    }

    public boolean equals(Object obj) {
        InterfaceC44592lc1.AbstractC25737a abstractC25737a;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC52434yp6)) {
            return false;
        }
        AbstractC52434yp6 abstractC52434yp6 = (AbstractC52434yp6) obj;
        if (this.f111348a == abstractC52434yp6.mo6191c() && this.f111349b == abstractC52434yp6.mo6193a() && this.f111350c.equals(abstractC52434yp6.mo6192b()) && this.f111351d.equals(abstractC52434yp6.mo6190d()) && ((abstractC25737a = this.f111352e) != null ? abstractC25737a.equals(abstractC52434yp6.mo2520g()) : abstractC52434yp6.mo2520g() == null) && this.f111353f.equals(abstractC52434yp6.mo2519h())) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC52434yp6
    /* renamed from: g */
    public InterfaceC44592lc1.AbstractC25737a mo2520g() {
        return this.f111352e;
    }

    @Override // p000.AbstractC52434yp6
    /* renamed from: h */
    public InterfaceC44592lc1.AbstractC25739c mo2519h() {
        return this.f111353f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.f111348a ^ 1000003) * 1000003) ^ this.f111349b) * 1000003) ^ this.f111350c.hashCode()) * 1000003) ^ this.f111351d.hashCode()) * 1000003;
        InterfaceC44592lc1.AbstractC25737a abstractC25737a = this.f111352e;
        if (abstractC25737a == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC25737a.hashCode();
        }
        return ((hashCode2 ^ hashCode) * 1000003) ^ this.f111353f.hashCode();
    }

    public String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f111348a + ", recommendedFileFormat=" + this.f111349b + ", audioProfiles=" + this.f111350c + ", videoProfiles=" + this.f111351d + ", defaultAudioProfile=" + this.f111352e + ", defaultVideoProfile=" + this.f111353f + "}";
    }
}
