package p000;
/* renamed from: Rx4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35802Rx4 implements InterfaceC48812sj1<C35568Qx4> {

    /* renamed from: a */
    public final Y94<InterfaceC35660Rh6> f32941a;

    /* renamed from: b */
    public final Y94<InterfaceC51919xx4> f32942b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f32943c;

    /* renamed from: d */
    public final Y94<InterfaceC40001dr4> f32944d;

    /* renamed from: e */
    public final Y94<InterfaceC6137On> f32945e;

    public C35802Rx4(Y94<InterfaceC35660Rh6> y94, Y94<InterfaceC51919xx4> y942, Y94<C36207Tq4> y943, Y94<InterfaceC40001dr4> y944, Y94<InterfaceC6137On> y945) {
        this.f32941a = y94;
        this.f32942b = y942;
        this.f32943c = y943;
        this.f32944d = y944;
        this.f32945e = y945;
    }

    /* renamed from: a */
    public static C35802Rx4 m86166a(Y94<InterfaceC35660Rh6> y94, Y94<InterfaceC51919xx4> y942, Y94<C36207Tq4> y943, Y94<InterfaceC40001dr4> y944, Y94<InterfaceC6137On> y945) {
        return new C35802Rx4(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C35568Qx4 m86164c(InterfaceC35660Rh6 interfaceC35660Rh6, InterfaceC51919xx4 interfaceC51919xx4, C36207Tq4 c36207Tq4, InterfaceC40001dr4 interfaceC40001dr4, InterfaceC6137On interfaceC6137On) {
        return new C35568Qx4(interfaceC35660Rh6, interfaceC51919xx4, c36207Tq4, interfaceC40001dr4, interfaceC6137On);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C35568Qx4 get() {
        return m86164c(this.f32941a.get(), this.f32942b.get(), this.f32943c.get(), this.f32944d.get(), this.f32945e.get());
    }
}
