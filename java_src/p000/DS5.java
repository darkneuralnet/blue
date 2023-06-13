package p000;

import android.content.Context;
import co.bird.android.manager.payment.StripeResolverManagerImpl;
import com.stripe.android.Stripe;
/* renamed from: DS5 */
/* loaded from: classes4.dex */
public final class DS5 implements InterfaceC48812sj1<StripeResolverManagerImpl> {

    /* renamed from: a */
    public final Y94<Context> f5727a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f5728b;

    /* renamed from: c */
    public final Y94<InterfaceC6097Oh> f5729c;

    /* renamed from: d */
    public final Y94<InterfaceC35660Rh6> f5730d;

    /* renamed from: e */
    public final Y94<C22454gl> f5731e;

    /* renamed from: f */
    public final Y94<Stripe> f5732f;

    /* renamed from: g */
    public final Y94<LifecycleOwner> f5733g;

    public DS5(Y94<Context> y94, Y94<C36207Tq4> y942, Y94<InterfaceC6097Oh> y943, Y94<InterfaceC35660Rh6> y944, Y94<C22454gl> y945, Y94<Stripe> y946, Y94<LifecycleOwner> y947) {
        this.f5727a = y94;
        this.f5728b = y942;
        this.f5729c = y943;
        this.f5730d = y944;
        this.f5731e = y945;
        this.f5732f = y946;
        this.f5733g = y947;
    }

    /* renamed from: a */
    public static DS5 m110419a(Y94<Context> y94, Y94<C36207Tq4> y942, Y94<InterfaceC6097Oh> y943, Y94<InterfaceC35660Rh6> y944, Y94<C22454gl> y945, Y94<Stripe> y946, Y94<LifecycleOwner> y947) {
        return new DS5(y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static StripeResolverManagerImpl m110417c(Context context, C36207Tq4 c36207Tq4, InterfaceC6097Oh interfaceC6097Oh, InterfaceC35660Rh6 interfaceC35660Rh6, C22454gl c22454gl, Stripe stripe, LifecycleOwner lifecycleOwner) {
        return new StripeResolverManagerImpl(context, c36207Tq4, interfaceC6097Oh, interfaceC35660Rh6, c22454gl, stripe, lifecycleOwner);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public StripeResolverManagerImpl get() {
        return m110417c(this.f5727a.get(), this.f5728b.get(), this.f5729c.get(), this.f5730d.get(), this.f5731e.get(), this.f5732f.get(), this.f5733g.get());
    }
}
