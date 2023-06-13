package p000;

import android.content.Context;
/* renamed from: tD1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49108tD1 implements InterfaceC48812sj1<C47923rD1> {

    /* renamed from: a */
    public final Y94<Context> f110164a;

    /* renamed from: b */
    public final Y94<C22454gl> f110165b;

    /* renamed from: c */
    public final Y94<AM3> f110166c;

    /* renamed from: d */
    public final Y94<InterfaceC47178px5> f110167d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f110168e;

    /* renamed from: f */
    public final Y94<InterfaceC1880Ea> f110169f;

    /* renamed from: g */
    public final Y94<InterfaceC44647lh6> f110170g;

    /* renamed from: h */
    public final Y94<InterfaceC35660Rh6> f110171h;

    /* renamed from: i */
    public final Y94<InterfaceC40099e13> f110172i;

    /* renamed from: j */
    public final Y94<InterfaceC20357fL> f110173j;

    public C49108tD1(Y94<Context> y94, Y94<C22454gl> y942, Y94<AM3> y943, Y94<InterfaceC47178px5> y944, Y94<C36207Tq4> y945, Y94<InterfaceC1880Ea> y946, Y94<InterfaceC44647lh6> y947, Y94<InterfaceC35660Rh6> y948, Y94<InterfaceC40099e13> y949, Y94<InterfaceC20357fL> y9410) {
        this.f110164a = y94;
        this.f110165b = y942;
        this.f110166c = y943;
        this.f110167d = y944;
        this.f110168e = y945;
        this.f110169f = y946;
        this.f110170g = y947;
        this.f110171h = y948;
        this.f110172i = y949;
        this.f110173j = y9410;
    }

    /* renamed from: a */
    public static C49108tD1 m12595a(Y94<Context> y94, Y94<C22454gl> y942, Y94<AM3> y943, Y94<InterfaceC47178px5> y944, Y94<C36207Tq4> y945, Y94<InterfaceC1880Ea> y946, Y94<InterfaceC44647lh6> y947, Y94<InterfaceC35660Rh6> y948, Y94<InterfaceC40099e13> y949, Y94<InterfaceC20357fL> y9410) {
        return new C49108tD1(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410);
    }

    /* renamed from: c */
    public static C47923rD1 m12593c(Context context, C22454gl c22454gl, AM3 am3, InterfaceC47178px5 interfaceC47178px5, C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea, InterfaceC44647lh6 interfaceC44647lh6, InterfaceC35660Rh6 interfaceC35660Rh6, InterfaceC40099e13 interfaceC40099e13, InterfaceC20357fL interfaceC20357fL) {
        return new C47923rD1(context, c22454gl, am3, interfaceC47178px5, c36207Tq4, interfaceC1880Ea, interfaceC44647lh6, interfaceC35660Rh6, interfaceC40099e13, interfaceC20357fL);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C47923rD1 get() {
        return m12593c(this.f110164a.get(), this.f110165b.get(), this.f110166c.get(), this.f110167d.get(), this.f110168e.get(), this.f110169f.get(), this.f110170g.get(), this.f110171h.get(), this.f110172i.get(), this.f110173j.get());
    }
}
