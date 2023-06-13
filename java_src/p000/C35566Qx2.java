package p000;
/* renamed from: Qx2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35566Qx2 implements InterfaceC49405tj1<C35332Px2> {

    /* renamed from: a */
    public final Z94<C40500ei0> f31281a;

    public C35566Qx2(Z94<C40500ei0> z94) {
        this.f31281a = z94;
    }

    /* renamed from: a */
    public static C35566Qx2 m87556a(Z94<C40500ei0> z94) {
        return new C35566Qx2(z94);
    }

    /* renamed from: c */
    public static C35332Px2 m87554c(C40500ei0 c40500ei0) {
        return new C35332Px2(c40500ei0);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C35332Px2 get() {
        return m87554c(this.f31281a.get());
    }
}
