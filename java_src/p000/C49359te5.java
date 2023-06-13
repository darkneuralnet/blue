package p000;

import p000.C21;
/* renamed from: te5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49359te5 implements InterfaceC49405tj1<C48766se5> {

    /* renamed from: a */
    public final Z94<D21> f110828a;

    /* renamed from: b */
    public final Z94<C21.InterfaceC0844a> f110829b;

    public C49359te5(Z94<D21> z94, Z94<C21.InterfaceC0844a> z942) {
        this.f110828a = z94;
        this.f110829b = z942;
    }

    /* renamed from: a */
    public static C49359te5 m11979a(Z94<D21> z94, Z94<C21.InterfaceC0844a> z942) {
        return new C49359te5(z94, z942);
    }

    /* renamed from: c */
    public static C48766se5 m11977c(D21 d21, Z94<C21.InterfaceC0844a> z94) {
        return new C48766se5(d21, z94);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C48766se5 get() {
        return m11977c(this.f110828a.get(), this.f110829b);
    }
}
