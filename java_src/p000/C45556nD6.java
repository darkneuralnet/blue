package p000;

import android.content.Context;
/* renamed from: nD6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45556nD6 implements InterfaceC48812sj1<C44963mD6> {

    /* renamed from: a */
    public final Y94<Context> f99649a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f99650b;

    public C45556nD6(Y94<Context> y94, Y94<C36207Tq4> y942) {
        this.f99649a = y94;
        this.f99650b = y942;
    }

    /* renamed from: a */
    public static C45556nD6 m24141a(Y94<Context> y94, Y94<C36207Tq4> y942) {
        return new C45556nD6(y94, y942);
    }

    /* renamed from: c */
    public static C44963mD6 m24139c(Context context, C36207Tq4 c36207Tq4) {
        return new C44963mD6(context, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C44963mD6 get() {
        return m24139c(this.f99649a.get(), this.f99650b.get());
    }
}
