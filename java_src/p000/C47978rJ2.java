package p000;
/* renamed from: rJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47978rJ2 implements InterfaceC48812sj1<InterfaceC33193Gt5> {

    /* renamed from: a */
    public final VH2 f106844a;

    /* renamed from: b */
    public final Y94<InterfaceC32023Bt5> f106845b;

    /* renamed from: c */
    public final Y94<InterfaceC44647lh6> f106846c;

    /* renamed from: d */
    public final Y94<InterfaceC1880Ea> f106847d;

    public C47978rJ2(VH2 vh2, Y94<InterfaceC32023Bt5> y94, Y94<InterfaceC44647lh6> y942, Y94<InterfaceC1880Ea> y943) {
        this.f106844a = vh2;
        this.f106845b = y94;
        this.f106846c = y942;
        this.f106847d = y943;
    }

    /* renamed from: a */
    public static C47978rJ2 m16078a(VH2 vh2, Y94<InterfaceC32023Bt5> y94, Y94<InterfaceC44647lh6> y942, Y94<InterfaceC1880Ea> y943) {
        return new C47978rJ2(vh2, y94, y942, y943);
    }

    /* renamed from: c */
    public static InterfaceC33193Gt5 m16076c(VH2 vh2, InterfaceC32023Bt5 interfaceC32023Bt5, InterfaceC44647lh6 interfaceC44647lh6, InterfaceC1880Ea interfaceC1880Ea) {
        return (InterfaceC33193Gt5) C51679xZ3.m5002e(vh2.m80026x0(interfaceC32023Bt5, interfaceC44647lh6, interfaceC1880Ea));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC33193Gt5 get() {
        return m16076c(this.f106844a, this.f106845b.get(), this.f106846c.get(), this.f106847d.get());
    }
}
