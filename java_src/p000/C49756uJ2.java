package p000;

import android.content.Context;
/* renamed from: uJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49756uJ2 implements InterfaceC48812sj1<InterfaceC46193oI5> {

    /* renamed from: a */
    public final VH2 f112183a;

    /* renamed from: b */
    public final Y94<Context> f112184b;

    /* renamed from: c */
    public final Y94<AbstractC39873de5> f112185c;

    /* renamed from: d */
    public final Y94<InterfaceC42042hI5> f112186d;

    /* renamed from: e */
    public final Y94<InterfaceC5225MD> f112187e;

    /* renamed from: f */
    public final Y94<InterfaceC1880Ea> f112188f;

    /* renamed from: g */
    public final Y94<YR4> f112189g;

    /* renamed from: h */
    public final Y94<C36207Tq4> f112190h;

    /* renamed from: i */
    public final Y94<C22454gl> f112191i;

    /* renamed from: j */
    public final Y94<InterfaceC34441Mc2> f112192j;

    /* renamed from: k */
    public final Y94<InterfaceC1510DX> f112193k;

    public C49756uJ2(VH2 vh2, Y94<Context> y94, Y94<AbstractC39873de5> y942, Y94<InterfaceC42042hI5> y943, Y94<InterfaceC5225MD> y944, Y94<InterfaceC1880Ea> y945, Y94<YR4> y946, Y94<C36207Tq4> y947, Y94<C22454gl> y948, Y94<InterfaceC34441Mc2> y949, Y94<InterfaceC1510DX> y9410) {
        this.f112183a = vh2;
        this.f112184b = y94;
        this.f112185c = y942;
        this.f112186d = y943;
        this.f112187e = y944;
        this.f112188f = y945;
        this.f112189g = y946;
        this.f112190h = y947;
        this.f112191i = y948;
        this.f112192j = y949;
        this.f112193k = y9410;
    }

    /* renamed from: a */
    public static C49756uJ2 m10468a(VH2 vh2, Y94<Context> y94, Y94<AbstractC39873de5> y942, Y94<InterfaceC42042hI5> y943, Y94<InterfaceC5225MD> y944, Y94<InterfaceC1880Ea> y945, Y94<YR4> y946, Y94<C36207Tq4> y947, Y94<C22454gl> y948, Y94<InterfaceC34441Mc2> y949, Y94<InterfaceC1510DX> y9410) {
        return new C49756uJ2(vh2, y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410);
    }

    /* renamed from: c */
    public static InterfaceC46193oI5 m10466c(VH2 vh2, Context context, AbstractC39873de5 abstractC39873de5, InterfaceC42042hI5 interfaceC42042hI5, InterfaceC5225MD interfaceC5225MD, InterfaceC1880Ea interfaceC1880Ea, YR4 yr4, C36207Tq4 c36207Tq4, C22454gl c22454gl, InterfaceC34441Mc2 interfaceC34441Mc2, InterfaceC1510DX interfaceC1510DX) {
        return (InterfaceC46193oI5) C51679xZ3.m5002e(vh2.m80119A0(context, abstractC39873de5, interfaceC42042hI5, interfaceC5225MD, interfaceC1880Ea, yr4, c36207Tq4, c22454gl, interfaceC34441Mc2, interfaceC1510DX));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC46193oI5 get() {
        return m10466c(this.f112183a, this.f112184b.get(), this.f112185c.get(), this.f112186d.get(), this.f112187e.get(), this.f112188f.get(), this.f112189g.get(), this.f112190h.get(), this.f112191i.get(), this.f112192j.get(), this.f112193k.get());
    }
}
