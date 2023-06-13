package p000;

import android.content.Context;
/* renamed from: H7 */
/* loaded from: classes3.dex */
public final class C3024H7 implements InterfaceC48812sj1<C2652G7> {

    /* renamed from: a */
    public final Y94<C36207Tq4> f12863a;

    /* renamed from: b */
    public final Y94<Context> f12864b;

    public C3024H7(Y94<C36207Tq4> y94, Y94<Context> y942) {
        this.f12863a = y94;
        this.f12864b = y942;
    }

    /* renamed from: a */
    public static C3024H7 m104396a(Y94<C36207Tq4> y94, Y94<Context> y942) {
        return new C3024H7(y94, y942);
    }

    /* renamed from: c */
    public static C2652G7 m104394c(C36207Tq4 c36207Tq4, Context context) {
        return new C2652G7(c36207Tq4, context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C2652G7 get() {
        return m104394c(this.f12863a.get(), this.f12864b.get());
    }
}
