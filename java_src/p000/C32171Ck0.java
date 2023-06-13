package p000;

import p000.InterfaceC41706gk0;
/* renamed from: Ck0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32171Ck0 implements InterfaceC49405tj1<InterfaceC50012uk5> {

    /* renamed from: a */
    public final Z94<Integer> f4586a;

    /* renamed from: b */
    public final Z94<C50604vk5> f4587b;

    /* renamed from: c */
    public final Z94<C51790xk5> f4588c;

    public C32171Ck0(Z94<Integer> z94, Z94<C50604vk5> z942, Z94<C51790xk5> z943) {
        this.f4586a = z94;
        this.f4587b = z942;
        this.f4588c = z943;
    }

    /* renamed from: a */
    public static C32171Ck0 m111763a(Z94<Integer> z94, Z94<C50604vk5> z942, Z94<C51790xk5> z943) {
        return new C32171Ck0(z94, z942, z943);
    }

    /* renamed from: c */
    public static InterfaceC50012uk5 m111761c(int i, Z94<C50604vk5> z94, Z94<C51790xk5> z942) {
        return (InterfaceC50012uk5) C52272yZ3.m3257d(InterfaceC41706gk0.AbstractC22421c.m37839v(i, z94, z942));
    }

    @Override // p000.Z94
    /* renamed from: b */
    public InterfaceC50012uk5 get() {
        return m111761c(this.f4586a.get().intValue(), this.f4587b, this.f4588c);
    }
}
