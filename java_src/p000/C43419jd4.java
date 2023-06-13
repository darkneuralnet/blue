package p000;
/* renamed from: jd4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43419jd4 implements InterfaceC48812sj1<C42826id4> {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f93041a;

    public C43419jd4(Y94<InterfaceC1880Ea> y94) {
        this.f93041a = y94;
    }

    /* renamed from: a */
    public static C43419jd4 m30181a(Y94<InterfaceC1880Ea> y94) {
        return new C43419jd4(y94);
    }

    /* renamed from: c */
    public static C42826id4 m30179c(InterfaceC1880Ea interfaceC1880Ea) {
        return new C42826id4(interfaceC1880Ea);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C42826id4 get() {
        return m30179c(this.f93041a.get());
    }
}
