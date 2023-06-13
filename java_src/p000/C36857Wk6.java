package p000;

import android.content.Context;
/* renamed from: Wk6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36857Wk6 implements InterfaceC48812sj1<C36623Vk6> {

    /* renamed from: a */
    public final Y94<C36207Tq4> f41873a;

    /* renamed from: b */
    public final Y94<Context> f41874b;

    public C36857Wk6(Y94<C36207Tq4> y94, Y94<Context> y942) {
        this.f41873a = y94;
        this.f41874b = y942;
    }

    /* renamed from: a */
    public static C36857Wk6 m77888a(Y94<C36207Tq4> y94, Y94<Context> y942) {
        return new C36857Wk6(y94, y942);
    }

    /* renamed from: c */
    public static C36623Vk6 m77886c(C36207Tq4 c36207Tq4, Context context) {
        return new C36623Vk6(c36207Tq4, context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C36623Vk6 get() {
        return m77886c(this.f41873a.get(), this.f41874b.get());
    }
}
