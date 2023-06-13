package p000;

import p000.InterfaceC41706gk0;
/* renamed from: Dk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32405Dk0 implements InterfaceC49405tj1<InterfaceC39332cl5> {

    /* renamed from: a */
    public final Z94<Integer> f6247a;

    /* renamed from: b */
    public final Z94<C39943dl5> f6248b;

    /* renamed from: c */
    public final Z94<C41128fl5> f6249c;

    /* renamed from: d */
    public final Z94<C42314hl5> f6250d;

    public C32405Dk0(Z94<Integer> z94, Z94<C39943dl5> z942, Z94<C41128fl5> z943, Z94<C42314hl5> z944) {
        this.f6247a = z94;
        this.f6248b = z942;
        this.f6249c = z943;
        this.f6250d = z944;
    }

    /* renamed from: a */
    public static C32405Dk0 m109989a(Z94<Integer> z94, Z94<C39943dl5> z942, Z94<C41128fl5> z943, Z94<C42314hl5> z944) {
        return new C32405Dk0(z94, z942, z943, z944);
    }

    /* renamed from: c */
    public static InterfaceC39332cl5 m109987c(int i, Z94<C39943dl5> z94, Z94<C41128fl5> z942, Z94<C42314hl5> z943) {
        return (InterfaceC39332cl5) C52272yZ3.m3257d(InterfaceC41706gk0.AbstractC22421c.m37838w(i, z94, z942, z943));
    }

    @Override // p000.Z94
    /* renamed from: b */
    public InterfaceC39332cl5 get() {
        return m109987c(this.f6247a.get().intValue(), this.f6248b, this.f6249c, this.f6250d);
    }
}
