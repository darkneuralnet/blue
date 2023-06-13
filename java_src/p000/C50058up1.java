package p000;
/* renamed from: up1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50058up1 implements InterfaceC48812sj1<C49465tp1> {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f113035a;

    public C50058up1(Y94<InterfaceC1880Ea> y94) {
        this.f113035a = y94;
    }

    /* renamed from: a */
    public static C50058up1 m9697a(Y94<InterfaceC1880Ea> y94) {
        return new C50058up1(y94);
    }

    /* renamed from: c */
    public static C49465tp1 m9695c(InterfaceC1880Ea interfaceC1880Ea) {
        return new C49465tp1(interfaceC1880Ea);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C49465tp1 get() {
        return m9695c(this.f113035a.get());
    }
}
