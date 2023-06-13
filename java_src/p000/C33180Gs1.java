package p000;

import co.bird.android.core.base.BaseCoreActivity;
/* renamed from: Gs1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33180Gs1 implements InterfaceC48812sj1<C32946Fs1> {

    /* renamed from: a */
    public final Y94<AbstractC26846oA> f12565a;

    /* renamed from: b */
    public final Y94<BaseCoreActivity> f12566b;

    /* renamed from: c */
    public final Y94<C6408PZ> f12567c;

    /* renamed from: d */
    public final Y94<C37392Ys1> f12568d;

    public C33180Gs1(Y94<AbstractC26846oA> y94, Y94<BaseCoreActivity> y942, Y94<C6408PZ> y943, Y94<C37392Ys1> y944) {
        this.f12565a = y94;
        this.f12566b = y942;
        this.f12567c = y943;
        this.f12568d = y944;
    }

    /* renamed from: a */
    public static C33180Gs1 m104651a(Y94<AbstractC26846oA> y94, Y94<BaseCoreActivity> y942, Y94<C6408PZ> y943, Y94<C37392Ys1> y944) {
        return new C33180Gs1(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C32946Fs1 m104649c(AbstractC26846oA abstractC26846oA, BaseCoreActivity baseCoreActivity, C6408PZ c6408pz, C37392Ys1 c37392Ys1) {
        return new C32946Fs1(abstractC26846oA, baseCoreActivity, c6408pz, c37392Ys1);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C32946Fs1 get() {
        return m104649c(this.f12565a.get(), this.f12566b.get(), this.f12567c.get(), this.f12568d.get());
    }
}
