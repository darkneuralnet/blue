package p000;
/* renamed from: fo */
/* loaded from: classes4.dex */
public final class C20528fo implements InterfaceC48812sj1<C9979Yn> {

    /* renamed from: a */
    public final Y94<AbstractC9490Xm> f80705a;

    /* renamed from: b */
    public final Y94<InterfaceC36152Tk3> f80706b;

    /* renamed from: c */
    public final Y94<InterfaceC8601VK> f80707c;

    /* renamed from: d */
    public final Y94<DB1> f80708d;

    /* renamed from: e */
    public final Y94<InterfaceC51919xx4> f80709e;

    /* renamed from: f */
    public final Y94<C22454gl> f80710f;

    public C20528fo(Y94<AbstractC9490Xm> y94, Y94<InterfaceC36152Tk3> y942, Y94<InterfaceC8601VK> y943, Y94<DB1> y944, Y94<InterfaceC51919xx4> y945, Y94<C22454gl> y946) {
        this.f80705a = y94;
        this.f80706b = y942;
        this.f80707c = y943;
        this.f80708d = y944;
        this.f80709e = y945;
        this.f80710f = y946;
    }

    /* renamed from: a */
    public static C20528fo m40810a(Y94<AbstractC9490Xm> y94, Y94<InterfaceC36152Tk3> y942, Y94<InterfaceC8601VK> y943, Y94<DB1> y944, Y94<InterfaceC51919xx4> y945, Y94<C22454gl> y946) {
        return new C20528fo(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static C9979Yn m40808c(AbstractC9490Xm abstractC9490Xm, InterfaceC36152Tk3 interfaceC36152Tk3, InterfaceC8601VK interfaceC8601VK, DB1 db1, InterfaceC51919xx4 interfaceC51919xx4, C22454gl c22454gl) {
        return new C9979Yn(abstractC9490Xm, interfaceC36152Tk3, interfaceC8601VK, db1, interfaceC51919xx4, c22454gl);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C9979Yn get() {
        return m40808c(this.f80705a.get(), this.f80706b.get(), this.f80707c.get(), this.f80708d.get(), this.f80709e.get(), this.f80710f.get());
    }
}
