package p000;

import p000.InterfaceC41706gk0;
/* renamed from: vk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50599vk0 implements InterfaceC49405tj1<Z92> {

    /* renamed from: a */
    public final Z94<Integer> f114557a;

    /* renamed from: b */
    public final Z94<C38033aa2> f114558b;

    /* renamed from: c */
    public final Z94<C39830da2> f114559c;

    public C50599vk0(Z94<Integer> z94, Z94<C38033aa2> z942, Z94<C39830da2> z943) {
        this.f114557a = z94;
        this.f114558b = z942;
        this.f114559c = z943;
    }

    /* renamed from: a */
    public static C50599vk0 m8213a(Z94<Integer> z94, Z94<C38033aa2> z942, Z94<C39830da2> z943) {
        return new C50599vk0(z94, z942, z943);
    }

    /* renamed from: c */
    public static Z92 m8211c(int i, Z94<C38033aa2> z94, Z94<C39830da2> z942) {
        return (Z92) C52272yZ3.m3257d(InterfaceC41706gk0.AbstractC22421c.m37846o(i, z94, z942));
    }

    @Override // p000.Z94
    /* renamed from: b */
    public Z92 get() {
        return m8211c(this.f114557a.get().intValue(), this.f114558b, this.f114559c);
    }
}
