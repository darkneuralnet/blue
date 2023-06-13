package p000;

import java.util.Map;
import java.util.Objects;
/* renamed from: Ff */
/* loaded from: classes8.dex */
public final class C2395Ff<Q> extends AbstractC28986u1<Q> {
    private static final long serialVersionUID = -5676462045106887728L;

    /* renamed from: f */
    public final InterfaceC35858Sd6<Q> f9923f;

    /* renamed from: g */
    public final String f9924g;

    @Override // p000.AbstractC28986u1, p000.InterfaceC35858Sd6
    /* renamed from: F */
    public V31 mo3806F() {
        return this.f9923f.mo3806F();
    }

    @Override // p000.AbstractC28986u1
    /* renamed from: J */
    public InterfaceC35858Sd6<Q> mo3805J() {
        return this.f9923f.mo11089G();
    }

    /* renamed from: L */
    public InterfaceC35858Sd6<Q> m106768L() {
        return this.f9923f;
    }

    /* renamed from: M */
    public String m106767M() {
        return this.f9924g;
    }

    @Override // p000.AbstractC28986u1, p000.InterfaceC35858Sd6
    /* renamed from: a */
    public String mo11086a() {
        return this.f9923f.mo11086a();
    }

    @Override // p000.InterfaceC35726Rp0
    /* renamed from: b0 */
    public InterfaceC38077ae6 mo3804b0() {
        return ((AbstractC28986u1) this.f9923f).mo3804b0();
    }

    @Override // p000.AbstractC28986u1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2395Ff)) {
            return false;
        }
        C2395Ff c2395Ff = (C2395Ff) obj;
        if (Objects.equals(this.f9923f, c2395Ff.f9923f) && Objects.equals(this.f9924g, c2395Ff.f9924g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f9923f, this.f9924g);
    }

    @Override // p000.AbstractC28986u1, p000.InterfaceC35858Sd6
    /* renamed from: l */
    public Map<? extends InterfaceC35858Sd6<?>, Integer> mo3803l() {
        return this.f9923f.mo3803l();
    }
}
