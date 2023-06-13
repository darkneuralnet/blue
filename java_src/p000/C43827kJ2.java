package p000;

import android.content.Context;
/* renamed from: kJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43827kJ2 implements InterfaceC48812sj1<InterfaceC40001dr4> {

    /* renamed from: a */
    public final VH2 f94228a;

    /* renamed from: b */
    public final Y94<Context> f94229b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f94230c;

    /* renamed from: d */
    public final Y94<C22454gl> f94231d;

    /* renamed from: e */
    public final Y94<InterfaceC6097Oh> f94232e;

    public C43827kJ2(VH2 vh2, Y94<Context> y94, Y94<C36207Tq4> y942, Y94<C22454gl> y943, Y94<InterfaceC6097Oh> y944) {
        this.f94228a = vh2;
        this.f94229b = y94;
        this.f94230c = y942;
        this.f94231d = y943;
        this.f94232e = y944;
    }

    /* renamed from: a */
    public static C43827kJ2 m29075a(VH2 vh2, Y94<Context> y94, Y94<C36207Tq4> y942, Y94<C22454gl> y943, Y94<InterfaceC6097Oh> y944) {
        return new C43827kJ2(vh2, y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static InterfaceC40001dr4 m29073c(VH2 vh2, Context context, C36207Tq4 c36207Tq4, C22454gl c22454gl, InterfaceC6097Oh interfaceC6097Oh) {
        return (InterfaceC40001dr4) C51679xZ3.m5002e(vh2.m80042p0(context, c36207Tq4, c22454gl, interfaceC6097Oh));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC40001dr4 get() {
        return m29073c(this.f94228a, this.f94229b.get(), this.f94230c.get(), this.f94231d.get(), this.f94232e.get());
    }
}
