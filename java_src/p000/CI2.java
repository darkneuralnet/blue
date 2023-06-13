package p000;

import android.content.Context;
/* renamed from: CI2 */
/* loaded from: classes4.dex */
public final class CI2 implements InterfaceC48812sj1<InterfaceC44662lj1> {

    /* renamed from: a */
    public final VH2 f3893a;

    /* renamed from: b */
    public final Y94<Context> f3894b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f3895c;

    /* renamed from: d */
    public final Y94<InterfaceC6097Oh> f3896d;

    public CI2(VH2 vh2, Y94<Context> y94, Y94<C36207Tq4> y942, Y94<InterfaceC6097Oh> y943) {
        this.f3893a = vh2;
        this.f3894b = y94;
        this.f3895c = y942;
        this.f3896d = y943;
    }

    /* renamed from: a */
    public static CI2 m112372a(VH2 vh2, Y94<Context> y94, Y94<C36207Tq4> y942, Y94<InterfaceC6097Oh> y943) {
        return new CI2(vh2, y94, y942, y943);
    }

    /* renamed from: c */
    public static InterfaceC44662lj1 m112370c(VH2 vh2, Context context, C36207Tq4 c36207Tq4, InterfaceC6097Oh interfaceC6097Oh) {
        return (InterfaceC44662lj1) C51679xZ3.m5002e(vh2.m80106H(context, c36207Tq4, interfaceC6097Oh));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC44662lj1 get() {
        return m112370c(this.f3893a, this.f3894b.get(), this.f3895c.get(), this.f3896d.get());
    }
}
