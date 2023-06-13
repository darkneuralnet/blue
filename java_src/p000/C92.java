package p000;
/* renamed from: C92 */
/* loaded from: classes3.dex */
public final class C92 implements InterfaceC48812sj1<B92> {

    /* renamed from: a */
    public final Y94<D92> f3516a;

    /* renamed from: b */
    public final Y94<InterfaceC40099e13> f3517b;

    /* renamed from: c */
    public final Y94<C43038iy6> f3518c;

    public C92(Y94<D92> y94, Y94<InterfaceC40099e13> y942, Y94<C43038iy6> y943) {
        this.f3516a = y94;
        this.f3517b = y942;
        this.f3518c = y943;
    }

    /* renamed from: a */
    public static C92 m112733a(Y94<D92> y94, Y94<InterfaceC40099e13> y942, Y94<C43038iy6> y943) {
        return new C92(y94, y942, y943);
    }

    /* renamed from: c */
    public static B92 m112731c(D92 d92, InterfaceC40099e13 interfaceC40099e13, C43038iy6 c43038iy6) {
        return new B92(d92, interfaceC40099e13, c43038iy6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public B92 get() {
        return m112731c(this.f3516a.get(), this.f3517b.get(), this.f3518c.get());
    }
}
