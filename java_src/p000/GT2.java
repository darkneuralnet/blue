package p000;

import android.content.Context;
/* renamed from: GT2 */
/* loaded from: classes5.dex */
public final class GT2 implements InterfaceC48220rj1<FT2> {

    /* renamed from: a */
    public final Y94<Context> f11958a;

    /* renamed from: b */
    public final Y94<DE0> f11959b;

    public GT2(Y94<Context> y94, Y94<DE0> y942) {
        this.f11958a = y94;
        this.f11959b = y942;
    }

    /* renamed from: a */
    public static GT2 m105072a(Y94<Context> y94, Y94<DE0> y942) {
        return new GT2(y94, y942);
    }

    /* renamed from: c */
    public static FT2 m105070c(Context context, Object obj) {
        return new FT2(context, (DE0) obj);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public FT2 get() {
        return m105070c(this.f11958a.get(), this.f11959b.get());
    }
}
