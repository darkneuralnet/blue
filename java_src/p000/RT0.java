package p000;
/* renamed from: RT0 */
/* loaded from: classes3.dex */
public final class RT0 implements InterfaceC48812sj1<QT0> {

    /* renamed from: a */
    public final Y94<C22454gl> f32069a;

    /* renamed from: b */
    public final Y94<JT0> f32070b;

    /* renamed from: c */
    public final Y94<C51174wi2> f32071c;

    /* renamed from: d */
    public final Y94<InterfaceC1880Ea> f32072d;

    /* renamed from: e */
    public final Y94<InterfaceC40099e13> f32073e;

    public RT0(Y94<C22454gl> y94, Y94<JT0> y942, Y94<C51174wi2> y943, Y94<InterfaceC1880Ea> y944, Y94<InterfaceC40099e13> y945) {
        this.f32069a = y94;
        this.f32070b = y942;
        this.f32071c = y943;
        this.f32072d = y944;
        this.f32073e = y945;
    }

    /* renamed from: a */
    public static RT0 m86735a(Y94<C22454gl> y94, Y94<JT0> y942, Y94<C51174wi2> y943, Y94<InterfaceC1880Ea> y944, Y94<InterfaceC40099e13> y945) {
        return new RT0(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static QT0 m86733c(C22454gl c22454gl, JT0 jt0, C51174wi2 c51174wi2, InterfaceC1880Ea interfaceC1880Ea, InterfaceC40099e13 interfaceC40099e13) {
        return new QT0(c22454gl, jt0, c51174wi2, interfaceC1880Ea, interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public QT0 get() {
        return m86733c(this.f32069a.get(), this.f32070b.get(), this.f32071c.get(), this.f32072d.get(), this.f32073e.get());
    }
}
