package p000;
/* renamed from: si1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48802si1 implements InterfaceC48812sj1<C48210ri1> {

    /* renamed from: a */
    public final Y94<InterfaceC47024pi1> f109140a;

    public C48802si1(Y94<InterfaceC47024pi1> y94) {
        this.f109140a = y94;
    }

    /* renamed from: a */
    public static C48802si1 m13806a(Y94<InterfaceC47024pi1> y94) {
        return new C48802si1(y94);
    }

    /* renamed from: c */
    public static C48210ri1 m13804c(InterfaceC47024pi1 interfaceC47024pi1) {
        return new C48210ri1(interfaceC47024pi1);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C48210ri1 get() {
        return m13804c(this.f109140a.get());
    }
}
