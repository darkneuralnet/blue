package p000;

import android.content.Context;
/* renamed from: PA3 */
/* loaded from: classes3.dex */
public final class PA3 implements InterfaceC48812sj1<OA3> {

    /* renamed from: a */
    public final Y94<Context> f28043a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f28044b;

    /* renamed from: c */
    public final Y94<InterfaceC25134kI> f28045c;

    public PA3(Y94<Context> y94, Y94<C36207Tq4> y942, Y94<InterfaceC25134kI> y943) {
        this.f28043a = y94;
        this.f28044b = y942;
        this.f28045c = y943;
    }

    /* renamed from: a */
    public static PA3 m90608a(Y94<Context> y94, Y94<C36207Tq4> y942, Y94<InterfaceC25134kI> y943) {
        return new PA3(y94, y942, y943);
    }

    /* renamed from: c */
    public static OA3 m90606c(Context context, C36207Tq4 c36207Tq4, InterfaceC25134kI interfaceC25134kI) {
        return new OA3(context, c36207Tq4, interfaceC25134kI);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public OA3 get() {
        return m90606c(this.f28043a.get(), this.f28044b.get(), this.f28045c.get());
    }
}
