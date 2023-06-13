package p000;

import co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner;
/* renamed from: gF5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41422gF5 implements InterfaceC48812sj1<SmartLockGlobalBluetoothScanner> {

    /* renamed from: a */
    public final Y94<InterfaceC47256q54> f81849a;

    /* renamed from: b */
    public final Y94<YR4> f81850b;

    /* renamed from: c */
    public final Y94<InterfaceC34441Mc2> f81851c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f81852d;

    /* renamed from: e */
    public final Y94<InterfaceC42015hF5> f81853e;

    /* renamed from: f */
    public final Y94<InterfaceC1510DX> f81854f;

    /* renamed from: g */
    public final Y94<InterfaceC40099e13> f81855g;

    public C41422gF5(Y94<InterfaceC47256q54> y94, Y94<YR4> y942, Y94<InterfaceC34441Mc2> y943, Y94<C36207Tq4> y944, Y94<InterfaceC42015hF5> y945, Y94<InterfaceC1510DX> y946, Y94<InterfaceC40099e13> y947) {
        this.f81849a = y94;
        this.f81850b = y942;
        this.f81851c = y943;
        this.f81852d = y944;
        this.f81853e = y945;
        this.f81854f = y946;
        this.f81855g = y947;
    }

    /* renamed from: a */
    public static C41422gF5 m39783a(Y94<InterfaceC47256q54> y94, Y94<YR4> y942, Y94<InterfaceC34441Mc2> y943, Y94<C36207Tq4> y944, Y94<InterfaceC42015hF5> y945, Y94<InterfaceC1510DX> y946, Y94<InterfaceC40099e13> y947) {
        return new C41422gF5(y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static SmartLockGlobalBluetoothScanner m39781c(InterfaceC47256q54 interfaceC47256q54, YR4 yr4, InterfaceC34441Mc2 interfaceC34441Mc2, C36207Tq4 c36207Tq4, InterfaceC42015hF5 interfaceC42015hF5, InterfaceC1510DX interfaceC1510DX, InterfaceC40099e13 interfaceC40099e13) {
        return new SmartLockGlobalBluetoothScanner(interfaceC47256q54, yr4, interfaceC34441Mc2, c36207Tq4, interfaceC42015hF5, interfaceC1510DX, interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public SmartLockGlobalBluetoothScanner get() {
        return m39781c(this.f81849a.get(), this.f81850b.get(), this.f81851c.get(), this.f81852d.get(), this.f81853e.get(), this.f81854f.get(), this.f81855g.get());
    }
}
