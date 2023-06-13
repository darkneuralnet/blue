package p000;

import android.content.Context;
/* renamed from: eI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40260eI2 implements InterfaceC48812sj1<InterfaceC5225MD> {

    /* renamed from: a */
    public final VH2 f78194a;

    /* renamed from: b */
    public final Y94<Context> f78195b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f78196c;

    /* renamed from: d */
    public final Y94<InterfaceC1880Ea> f78197d;

    /* renamed from: e */
    public final Y94<AbstractC39873de5> f78198e;

    /* renamed from: f */
    public final Y94<InterfaceC22677hY> f78199f;

    /* renamed from: g */
    public final Y94<C22454gl> f78200g;

    /* renamed from: h */
    public final Y94<InterfaceC1510DX> f78201h;

    public C40260eI2(VH2 vh2, Y94<Context> y94, Y94<C36207Tq4> y942, Y94<InterfaceC1880Ea> y943, Y94<AbstractC39873de5> y944, Y94<InterfaceC22677hY> y945, Y94<C22454gl> y946, Y94<InterfaceC1510DX> y947) {
        this.f78194a = vh2;
        this.f78195b = y94;
        this.f78196c = y942;
        this.f78197d = y943;
        this.f78198e = y944;
        this.f78199f = y945;
        this.f78200g = y946;
        this.f78201h = y947;
    }

    /* renamed from: a */
    public static C40260eI2 m43053a(VH2 vh2, Y94<Context> y94, Y94<C36207Tq4> y942, Y94<InterfaceC1880Ea> y943, Y94<AbstractC39873de5> y944, Y94<InterfaceC22677hY> y945, Y94<C22454gl> y946, Y94<InterfaceC1510DX> y947) {
        return new C40260eI2(vh2, y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static InterfaceC5225MD m43051c(VH2 vh2, Context context, C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea, AbstractC39873de5 abstractC39873de5, InterfaceC22677hY interfaceC22677hY, C22454gl c22454gl, InterfaceC1510DX interfaceC1510DX) {
        return (InterfaceC5225MD) C51679xZ3.m5002e(vh2.m80057i(context, c36207Tq4, interfaceC1880Ea, abstractC39873de5, interfaceC22677hY, c22454gl, interfaceC1510DX));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC5225MD get() {
        return m43051c(this.f78194a, this.f78195b.get(), this.f78196c.get(), this.f78197d.get(), this.f78198e.get(), this.f78199f.get(), this.f78200g.get(), this.f78201h.get());
    }
}
