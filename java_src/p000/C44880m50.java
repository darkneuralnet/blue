package p000;

import android.content.Context;
/* renamed from: m50  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44880m50 implements InterfaceC48812sj1<C44287l50> {

    /* renamed from: a */
    public final Y94<Context> f97311a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f97312b;

    public C44880m50(Y94<Context> y94, Y94<C36207Tq4> y942) {
        this.f97311a = y94;
        this.f97312b = y942;
    }

    /* renamed from: a */
    public static C44880m50 m26367a(Y94<Context> y94, Y94<C36207Tq4> y942) {
        return new C44880m50(y94, y942);
    }

    /* renamed from: c */
    public static C44287l50 m26365c(Context context, C36207Tq4 c36207Tq4) {
        return new C44287l50(context, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C44287l50 get() {
        return m26365c(this.f97311a.get(), this.f97312b.get());
    }
}
