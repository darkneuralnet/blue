package p000;

import android.content.Context;
import co.bird.android.manager.helmet.HelmetSelfieManagerImpl;
/* renamed from: DL1 */
/* loaded from: classes4.dex */
public final class DL1 implements InterfaceC48812sj1<HelmetSelfieManagerImpl> {

    /* renamed from: a */
    public final Y94<Context> f5533a;

    /* renamed from: b */
    public final Y94<YR4> f5534b;

    /* renamed from: c */
    public final Y94<InterfaceC6097Oh> f5535c;

    /* renamed from: d */
    public final Y94<InterfaceC1880Ea> f5536d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f5537e;

    public DL1(Y94<Context> y94, Y94<YR4> y942, Y94<InterfaceC6097Oh> y943, Y94<InterfaceC1880Ea> y944, Y94<C36207Tq4> y945) {
        this.f5533a = y94;
        this.f5534b = y942;
        this.f5535c = y943;
        this.f5536d = y944;
        this.f5537e = y945;
    }

    /* renamed from: a */
    public static DL1 m110570a(Y94<Context> y94, Y94<YR4> y942, Y94<InterfaceC6097Oh> y943, Y94<InterfaceC1880Ea> y944, Y94<C36207Tq4> y945) {
        return new DL1(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static HelmetSelfieManagerImpl m110568c(Context context, YR4 yr4, InterfaceC6097Oh interfaceC6097Oh, InterfaceC1880Ea interfaceC1880Ea, C36207Tq4 c36207Tq4) {
        return new HelmetSelfieManagerImpl(context, yr4, interfaceC6097Oh, interfaceC1880Ea, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public HelmetSelfieManagerImpl get() {
        return m110568c(this.f5533a.get(), this.f5534b.get(), this.f5535c.get(), this.f5536d.get(), this.f5537e.get());
    }
}
