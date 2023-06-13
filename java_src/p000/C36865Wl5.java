package p000;
/* renamed from: Wl5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36865Wl5 implements InterfaceC48812sj1<C35227Pl5> {

    /* renamed from: a */
    public final Y94<C36207Tq4> f42055a;

    /* renamed from: b */
    public final Y94<InterfaceC35660Rh6> f42056b;

    /* renamed from: c */
    public final Y94<InterfaceC5225MD> f42057c;

    /* renamed from: d */
    public final Y94<InterfaceC10636aM> f42058d;

    /* renamed from: e */
    public final Y94<InterfaceC40001dr4> f42059e;

    /* renamed from: f */
    public final Y94<InterfaceC1880Ea> f42060f;

    public C36865Wl5(Y94<C36207Tq4> y94, Y94<InterfaceC35660Rh6> y942, Y94<InterfaceC5225MD> y943, Y94<InterfaceC10636aM> y944, Y94<InterfaceC40001dr4> y945, Y94<InterfaceC1880Ea> y946) {
        this.f42055a = y94;
        this.f42056b = y942;
        this.f42057c = y943;
        this.f42058d = y944;
        this.f42059e = y945;
        this.f42060f = y946;
    }

    /* renamed from: a */
    public static C36865Wl5 m77879a(Y94<C36207Tq4> y94, Y94<InterfaceC35660Rh6> y942, Y94<InterfaceC5225MD> y943, Y94<InterfaceC10636aM> y944, Y94<InterfaceC40001dr4> y945, Y94<InterfaceC1880Ea> y946) {
        return new C36865Wl5(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static C35227Pl5 m77877c(C36207Tq4 c36207Tq4, InterfaceC35660Rh6 interfaceC35660Rh6, InterfaceC5225MD interfaceC5225MD, InterfaceC10636aM interfaceC10636aM, InterfaceC40001dr4 interfaceC40001dr4, InterfaceC1880Ea interfaceC1880Ea) {
        return new C35227Pl5(c36207Tq4, interfaceC35660Rh6, interfaceC5225MD, interfaceC10636aM, interfaceC40001dr4, interfaceC1880Ea);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C35227Pl5 get() {
        return m77877c(this.f42055a.get(), this.f42056b.get(), this.f42057c.get(), this.f42058d.get(), this.f42059e.get(), this.f42060f.get());
    }
}
