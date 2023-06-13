package p000;

import android.content.Context;
/* renamed from: iI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42632iI2 implements InterfaceC48812sj1<InterfaceC27246pJ> {

    /* renamed from: a */
    public final VH2 f87077a;

    /* renamed from: b */
    public final Y94<Context> f87078b;

    /* renamed from: c */
    public final Y94<InterfaceC25136kJ> f87079c;

    /* renamed from: d */
    public final Y94<InterfaceC48847sm6> f87080d;

    /* renamed from: e */
    public final Y94<InterfaceC10732aY> f87081e;

    /* renamed from: f */
    public final Y94<InterfaceC1880Ea> f87082f;

    /* renamed from: g */
    public final Y94<InterfaceC34076Kn6> f87083g;

    /* renamed from: h */
    public final Y94<C36207Tq4> f87084h;

    public C42632iI2(VH2 vh2, Y94<Context> y94, Y94<InterfaceC25136kJ> y942, Y94<InterfaceC48847sm6> y943, Y94<InterfaceC10732aY> y944, Y94<InterfaceC1880Ea> y945, Y94<InterfaceC34076Kn6> y946, Y94<C36207Tq4> y947) {
        this.f87077a = vh2;
        this.f87078b = y94;
        this.f87079c = y942;
        this.f87080d = y943;
        this.f87081e = y944;
        this.f87082f = y945;
        this.f87083g = y946;
        this.f87084h = y947;
    }

    /* renamed from: a */
    public static C42632iI2 m34240a(VH2 vh2, Y94<Context> y94, Y94<InterfaceC25136kJ> y942, Y94<InterfaceC48847sm6> y943, Y94<InterfaceC10732aY> y944, Y94<InterfaceC1880Ea> y945, Y94<InterfaceC34076Kn6> y946, Y94<C36207Tq4> y947) {
        return new C42632iI2(vh2, y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static InterfaceC27246pJ m34238c(VH2 vh2, Context context, InterfaceC25136kJ interfaceC25136kJ, InterfaceC48847sm6 interfaceC48847sm6, InterfaceC10732aY interfaceC10732aY, InterfaceC1880Ea interfaceC1880Ea, InterfaceC34076Kn6 interfaceC34076Kn6, C36207Tq4 c36207Tq4) {
        return (InterfaceC27246pJ) C51679xZ3.m5002e(vh2.m80049m(context, interfaceC25136kJ, interfaceC48847sm6, interfaceC10732aY, interfaceC1880Ea, interfaceC34076Kn6, c36207Tq4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC27246pJ get() {
        return m34238c(this.f87077a, this.f87078b.get(), this.f87079c.get(), this.f87080d.get(), this.f87081e.get(), this.f87082f.get(), this.f87083g.get(), this.f87084h.get());
    }
}
