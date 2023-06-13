package p000;

import co.bird.android.app.feature.privatebirds.SmartlockBluetoothScanner;
/* renamed from: gI5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41449gI5 implements InterfaceC48812sj1<SmartlockBluetoothScanner> {

    /* renamed from: a */
    public final Y94<AbstractC39873de5> f81941a;

    /* renamed from: b */
    public final Y94<InterfaceC47256q54> f81942b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f81943c;

    /* renamed from: d */
    public final Y94<InterfaceC46193oI5> f81944d;

    /* renamed from: e */
    public final Y94<InterfaceC5225MD> f81945e;

    public C41449gI5(Y94<AbstractC39873de5> y94, Y94<InterfaceC47256q54> y942, Y94<C36207Tq4> y943, Y94<InterfaceC46193oI5> y944, Y94<InterfaceC5225MD> y945) {
        this.f81941a = y94;
        this.f81942b = y942;
        this.f81943c = y943;
        this.f81944d = y944;
        this.f81945e = y945;
    }

    /* renamed from: a */
    public static C41449gI5 m39655a(Y94<AbstractC39873de5> y94, Y94<InterfaceC47256q54> y942, Y94<C36207Tq4> y943, Y94<InterfaceC46193oI5> y944, Y94<InterfaceC5225MD> y945) {
        return new C41449gI5(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static SmartlockBluetoothScanner m39653c(AbstractC39873de5 abstractC39873de5, InterfaceC47256q54 interfaceC47256q54, C36207Tq4 c36207Tq4, InterfaceC46193oI5 interfaceC46193oI5, InterfaceC5225MD interfaceC5225MD) {
        return new SmartlockBluetoothScanner(abstractC39873de5, interfaceC47256q54, c36207Tq4, interfaceC46193oI5, interfaceC5225MD);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public SmartlockBluetoothScanner get() {
        return m39653c(this.f81941a.get(), this.f81942b.get(), this.f81943c.get(), this.f81944d.get(), this.f81945e.get());
    }
}
