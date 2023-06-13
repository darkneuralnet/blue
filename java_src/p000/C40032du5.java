package p000;

import android.content.Context;
import android.content.Intent;
/* renamed from: du5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40032du5 implements InterfaceC48812sj1<AbstractC47767qx1> {

    /* renamed from: a */
    public final Y94<Context> f77401a;

    /* renamed from: b */
    public final Y94<InterfaceC48923su2> f77402b;

    /* renamed from: c */
    public final Y94<Intent> f77403c;

    public C40032du5(Y94<Context> y94, Y94<InterfaceC48923su2> y942, Y94<Intent> y943) {
        this.f77401a = y94;
        this.f77402b = y942;
        this.f77403c = y943;
    }

    /* renamed from: a */
    public static C40032du5 m43515a(Y94<Context> y94, Y94<InterfaceC48923su2> y942, Y94<Intent> y943) {
        return new C40032du5(y94, y942, y943);
    }

    /* renamed from: c */
    public static AbstractC47767qx1 m43513c(Context context, InterfaceC48923su2 interfaceC48923su2, Intent intent) {
        return (AbstractC47767qx1) C51679xZ3.m5002e(C38236au5.m65292c(context, interfaceC48923su2, intent));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC47767qx1 get() {
        return m43513c(this.f77401a.get(), this.f77402b.get(), this.f77403c.get());
    }
}
