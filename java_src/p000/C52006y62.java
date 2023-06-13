package p000;
/* renamed from: y62  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52006y62 implements InterfaceC49405tj1<C51413x62> {

    /* renamed from: a */
    public final Z94<C48766se5> f118751a;

    public C52006y62(Z94<C48766se5> z94) {
        this.f118751a = z94;
    }

    /* renamed from: a */
    public static C52006y62 m4143a(Z94<C48766se5> z94) {
        return new C52006y62(z94);
    }

    /* renamed from: c */
    public static C51413x62 m4141c(C48766se5 c48766se5) {
        return new C51413x62(c48766se5);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C51413x62 get() {
        return m4141c(this.f118751a.get());
    }
}
