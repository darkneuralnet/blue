package p000;
/* renamed from: Vs3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36692Vs3 implements InterfaceC48812sj1<C35990Ss3> {

    /* renamed from: a */
    public final Y94<InterfaceC12495bn> f39859a;

    /* renamed from: b */
    public final Y94<InterfaceC42996iu4> f39860b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f39861c;

    /* renamed from: d */
    public final Y94<DQ3> f39862d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f39863e;

    /* renamed from: f */
    public final Y94<C22454gl> f39864f;

    /* renamed from: g */
    public final Y94<InterfaceC36926Ws3> f39865g;

    /* renamed from: h */
    public final Y94<InterfaceC40099e13> f39866h;

    public C36692Vs3(Y94<InterfaceC12495bn> y94, Y94<InterfaceC42996iu4> y942, Y94<InterfaceC1880Ea> y943, Y94<DQ3> y944, Y94<C36207Tq4> y945, Y94<C22454gl> y946, Y94<InterfaceC36926Ws3> y947, Y94<InterfaceC40099e13> y948) {
        this.f39859a = y94;
        this.f39860b = y942;
        this.f39861c = y943;
        this.f39862d = y944;
        this.f39863e = y945;
        this.f39864f = y946;
        this.f39865g = y947;
        this.f39866h = y948;
    }

    /* renamed from: a */
    public static C36692Vs3 m79326a(Y94<InterfaceC12495bn> y94, Y94<InterfaceC42996iu4> y942, Y94<InterfaceC1880Ea> y943, Y94<DQ3> y944, Y94<C36207Tq4> y945, Y94<C22454gl> y946, Y94<InterfaceC36926Ws3> y947, Y94<InterfaceC40099e13> y948) {
        return new C36692Vs3(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    /* renamed from: c */
    public static C35990Ss3 m79324c(InterfaceC12495bn interfaceC12495bn, InterfaceC42996iu4 interfaceC42996iu4, InterfaceC1880Ea interfaceC1880Ea, DQ3 dq3, C36207Tq4 c36207Tq4, C22454gl c22454gl, InterfaceC36926Ws3 interfaceC36926Ws3, InterfaceC40099e13 interfaceC40099e13) {
        return new C35990Ss3(interfaceC12495bn, interfaceC42996iu4, interfaceC1880Ea, dq3, c36207Tq4, c22454gl, interfaceC36926Ws3, interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C35990Ss3 get() {
        return m79324c(this.f39859a.get(), this.f39860b.get(), this.f39861c.get(), this.f39862d.get(), this.f39863e.get(), this.f39864f.get(), this.f39865g.get(), this.f39866h.get());
    }
}
