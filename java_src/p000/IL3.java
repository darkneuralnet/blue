package p000;

import co.bird.android.manager.payment.StripeResolverManagerImpl;
/* renamed from: IL3 */
/* loaded from: classes4.dex */
public final class IL3 implements InterfaceC48812sj1<HL3> {

    /* renamed from: a */
    public final Y94<StripeResolverManagerImpl> f15378a;

    /* renamed from: b */
    public final Y94<InterfaceC46820pM3> f15379b;

    /* renamed from: c */
    public final Y94<C51174wi2> f15380c;

    public IL3(Y94<StripeResolverManagerImpl> y94, Y94<InterfaceC46820pM3> y942, Y94<C51174wi2> y943) {
        this.f15378a = y94;
        this.f15379b = y942;
        this.f15380c = y943;
    }

    /* renamed from: a */
    public static IL3 m102471a(Y94<StripeResolverManagerImpl> y94, Y94<InterfaceC46820pM3> y942, Y94<C51174wi2> y943) {
        return new IL3(y94, y942, y943);
    }

    /* renamed from: c */
    public static HL3 m102469c(StripeResolverManagerImpl stripeResolverManagerImpl, InterfaceC46820pM3 interfaceC46820pM3, C51174wi2 c51174wi2) {
        return new HL3(stripeResolverManagerImpl, interfaceC46820pM3, c51174wi2);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public HL3 get() {
        return m102469c(this.f15378a.get(), this.f15379b.get(), this.f15380c.get());
    }
}
