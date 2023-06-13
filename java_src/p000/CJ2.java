package p000;

import android.content.Context;
/* renamed from: CJ2 */
/* loaded from: classes4.dex */
public final class CJ2 implements InterfaceC48812sj1<InterfaceC36821Wg6> {

    /* renamed from: a */
    public final VH2 f3910a;

    /* renamed from: b */
    public final Y94<Context> f3911b;

    /* renamed from: c */
    public final Y94<InterfaceC36587Vg6> f3912c;

    /* renamed from: d */
    public final Y94<C22454gl> f3913d;

    /* renamed from: e */
    public final Y94<InterfaceC35660Rh6> f3914e;

    /* renamed from: f */
    public final Y94<C36207Tq4> f3915f;

    public CJ2(VH2 vh2, Y94<Context> y94, Y94<InterfaceC36587Vg6> y942, Y94<C22454gl> y943, Y94<InterfaceC35660Rh6> y944, Y94<C36207Tq4> y945) {
        this.f3910a = vh2;
        this.f3911b = y94;
        this.f3912c = y942;
        this.f3913d = y943;
        this.f3914e = y944;
        this.f3915f = y945;
    }

    /* renamed from: a */
    public static CJ2 m112361a(VH2 vh2, Y94<Context> y94, Y94<InterfaceC36587Vg6> y942, Y94<C22454gl> y943, Y94<InterfaceC35660Rh6> y944, Y94<C36207Tq4> y945) {
        return new CJ2(vh2, y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static InterfaceC36821Wg6 m112359c(VH2 vh2, Context context, InterfaceC36587Vg6 interfaceC36587Vg6, C22454gl c22454gl, InterfaceC35660Rh6 interfaceC35660Rh6, C36207Tq4 c36207Tq4) {
        return (InterfaceC36821Wg6) C51679xZ3.m5002e(vh2.m80103I0(context, interfaceC36587Vg6, c22454gl, interfaceC35660Rh6, c36207Tq4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC36821Wg6 get() {
        return m112359c(this.f3910a, this.f3911b.get(), this.f3912c.get(), this.f3913d.get(), this.f3914e.get(), this.f3915f.get());
    }
}
