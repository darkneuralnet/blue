package p000;

import android.content.Context;
/* renamed from: Mz6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34652Mz6 implements InterfaceC48812sj1<C33950Jz6> {

    /* renamed from: a */
    public final Y94<Context> f23923a;

    /* renamed from: b */
    public final Y94<InterfaceC48923su2> f23924b;

    public C34652Mz6(Y94<Context> y94, Y94<InterfaceC48923su2> y942) {
        this.f23923a = y94;
        this.f23924b = y942;
    }

    /* renamed from: a */
    public static C34652Mz6 m94524a(Y94<Context> y94, Y94<InterfaceC48923su2> y942) {
        return new C34652Mz6(y94, y942);
    }

    /* renamed from: c */
    public static C33950Jz6 m94522c(Context context, InterfaceC48923su2 interfaceC48923su2) {
        return new C33950Jz6(context, interfaceC48923su2);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C33950Jz6 get() {
        return m94522c(this.f23923a.get(), this.f23924b.get());
    }
}
