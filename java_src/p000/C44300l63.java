package p000;

import android.content.Context;
import android.os.Handler;
import io.reactivex.functions.InterfaceC23484g;
/* renamed from: l63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44300l63 implements InterfaceC48812sj1<InterfaceC23484g<Throwable>> {

    /* renamed from: a */
    public final P43 f95489a;

    /* renamed from: b */
    public final Y94<Context> f95490b;

    /* renamed from: c */
    public final Y94<Handler> f95491c;

    public C44300l63(P43 p43, Y94<Context> y94, Y94<Handler> y942) {
        this.f95489a = p43;
        this.f95490b = y94;
        this.f95491c = y942;
    }

    /* renamed from: a */
    public static C44300l63 m27867a(P43 p43, Y94<Context> y94, Y94<Handler> y942) {
        return new C44300l63(p43, y94, y942);
    }

    /* renamed from: c */
    public static InterfaceC23484g<Throwable> m27865c(P43 p43, Context context, Handler handler) {
        return (InterfaceC23484g) C51679xZ3.m5002e(p43.m90886y0(context, handler));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC23484g<Throwable> get() {
        return m27865c(this.f95489a, this.f95490b.get(), this.f95491c.get());
    }
}
