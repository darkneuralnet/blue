package p000;

import android.content.Context;
/* renamed from: VB4 */
/* loaded from: classes3.dex */
public final class VB4 implements InterfaceC48812sj1<UB4> {

    /* renamed from: a */
    public final Y94<Context> f38726a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f38727b;

    public VB4(Y94<Context> y94, Y94<C36207Tq4> y942) {
        this.f38726a = y94;
        this.f38727b = y942;
    }

    /* renamed from: a */
    public static VB4 m80244a(Y94<Context> y94, Y94<C36207Tq4> y942) {
        return new VB4(y94, y942);
    }

    /* renamed from: c */
    public static UB4 m80242c(Context context, C36207Tq4 c36207Tq4) {
        return new UB4(context, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public UB4 get() {
        return m80242c(this.f38726a.get(), this.f38727b.get());
    }
}
