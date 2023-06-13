package p000;

import io.reactivex.AbstractC23437E;
/* renamed from: yk5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52383yk5 implements InterfaceC49405tj1<C51790xk5> {

    /* renamed from: a */
    public final Z94<C50604vk5> f120098a;

    /* renamed from: b */
    public final Z94<AbstractC23437E> f120099b;

    public C52383yk5(Z94<C50604vk5> z94, Z94<AbstractC23437E> z942) {
        this.f120098a = z94;
        this.f120099b = z942;
    }

    /* renamed from: a */
    public static C52383yk5 m2706a(Z94<C50604vk5> z94, Z94<AbstractC23437E> z942) {
        return new C52383yk5(z94, z942);
    }

    /* renamed from: c */
    public static C51790xk5 m2704c(C50604vk5 c50604vk5, AbstractC23437E abstractC23437E) {
        return new C51790xk5(c50604vk5, abstractC23437E);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C51790xk5 get() {
        return m2704c(this.f120098a.get(), this.f120099b.get());
    }
}
