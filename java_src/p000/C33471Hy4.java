package p000;
/* renamed from: Hy4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33471Hy4 implements InterfaceC48812sj1<InterfaceC32301Cy4> {

    /* renamed from: a */
    public final C33237Gy4 f14257a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f14258b;

    /* renamed from: c */
    public final Y94<InterfaceC37857aG6> f14259c;

    public C33471Hy4(C33237Gy4 c33237Gy4, Y94<InterfaceC1880Ea> y94, Y94<InterfaceC37857aG6> y942) {
        this.f14257a = c33237Gy4;
        this.f14258b = y94;
        this.f14259c = y942;
    }

    /* renamed from: a */
    public static C33471Hy4 m103147a(C33237Gy4 c33237Gy4, Y94<InterfaceC1880Ea> y94, Y94<InterfaceC37857aG6> y942) {
        return new C33471Hy4(c33237Gy4, y94, y942);
    }

    /* renamed from: c */
    public static InterfaceC32301Cy4 m103145c(C33237Gy4 c33237Gy4, InterfaceC1880Ea interfaceC1880Ea, InterfaceC37857aG6 interfaceC37857aG6) {
        return (InterfaceC32301Cy4) C51679xZ3.m5002e(c33237Gy4.m104542a(interfaceC1880Ea, interfaceC37857aG6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC32301Cy4 get() {
        return m103145c(this.f14257a, this.f14258b.get(), this.f14259c.get());
    }
}
