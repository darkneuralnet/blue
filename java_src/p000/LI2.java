package p000;

import android.content.Context;
/* renamed from: LI2 */
/* loaded from: classes4.dex */
public final class LI2 implements InterfaceC48812sj1<InterfaceC45102mT1> {

    /* renamed from: a */
    public final VH2 f21067a;

    /* renamed from: b */
    public final Y94<Context> f21068b;

    /* renamed from: c */
    public final Y94<InterfaceC39766dT1> f21069c;

    /* renamed from: d */
    public final Y94<InterfaceC6097Oh> f21070d;

    /* renamed from: e */
    public final Y94<C51174wi2> f21071e;

    /* renamed from: f */
    public final Y94<InterfaceC1880Ea> f21072f;

    public LI2(VH2 vh2, Y94<Context> y94, Y94<InterfaceC39766dT1> y942, Y94<InterfaceC6097Oh> y943, Y94<C51174wi2> y944, Y94<InterfaceC1880Ea> y945) {
        this.f21067a = vh2;
        this.f21068b = y94;
        this.f21069c = y942;
        this.f21070d = y943;
        this.f21071e = y944;
        this.f21072f = y945;
    }

    /* renamed from: a */
    public static LI2 m97375a(VH2 vh2, Y94<Context> y94, Y94<InterfaceC39766dT1> y942, Y94<InterfaceC6097Oh> y943, Y94<C51174wi2> y944, Y94<InterfaceC1880Ea> y945) {
        return new LI2(vh2, y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static InterfaceC45102mT1 m97373c(VH2 vh2, Context context, InterfaceC39766dT1 interfaceC39766dT1, InterfaceC6097Oh interfaceC6097Oh, C51174wi2 c51174wi2, InterfaceC1880Ea interfaceC1880Ea) {
        return (InterfaceC45102mT1) C51679xZ3.m5002e(vh2.m80088Q(context, interfaceC39766dT1, interfaceC6097Oh, c51174wi2, interfaceC1880Ea));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC45102mT1 get() {
        return m97373c(this.f21067a, this.f21068b.get(), this.f21069c.get(), this.f21070d.get(), this.f21071e.get(), this.f21072f.get());
    }
}
