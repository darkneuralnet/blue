package p000;

import p000.InterfaceC41706gk0;
/* renamed from: zk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52971zk0 implements InterfaceC49405tj1<InterfaceC34855Nw2> {

    /* renamed from: a */
    public final Z94<Integer> f122145a;

    /* renamed from: b */
    public final Z94<C35089Ow2> f122146b;

    /* renamed from: c */
    public final Z94<C35557Qw2> f122147c;

    /* renamed from: d */
    public final Z94<C36025Sw2> f122148d;

    public C52971zk0(Z94<Integer> z94, Z94<C35089Ow2> z942, Z94<C35557Qw2> z943, Z94<C36025Sw2> z944) {
        this.f122145a = z94;
        this.f122146b = z942;
        this.f122147c = z943;
        this.f122148d = z944;
    }

    /* renamed from: a */
    public static C52971zk0 m462a(Z94<Integer> z94, Z94<C35089Ow2> z942, Z94<C35557Qw2> z943, Z94<C36025Sw2> z944) {
        return new C52971zk0(z94, z942, z943, z944);
    }

    /* renamed from: c */
    public static InterfaceC34855Nw2 m460c(int i, Z94<C35089Ow2> z94, Z94<C35557Qw2> z942, Z94<C36025Sw2> z943) {
        return (InterfaceC34855Nw2) C52272yZ3.m3257d(InterfaceC41706gk0.AbstractC22421c.m37842s(i, z94, z942, z943));
    }

    @Override // p000.Z94
    /* renamed from: b */
    public InterfaceC34855Nw2 get() {
        return m460c(this.f122145a.get().intValue(), this.f122146b, this.f122147c, this.f122148d);
    }
}
