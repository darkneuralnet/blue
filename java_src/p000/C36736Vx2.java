package p000;
/* renamed from: Vx2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36736Vx2 implements InterfaceC49405tj1<C36502Ux2> {

    /* renamed from: a */
    public final Z94<C49279tW1> f40105a;

    public C36736Vx2(Z94<C49279tW1> z94) {
        this.f40105a = z94;
    }

    /* renamed from: a */
    public static C36736Vx2 m79090a(Z94<C49279tW1> z94) {
        return new C36736Vx2(z94);
    }

    /* renamed from: c */
    public static C36502Ux2 m79088c(C49279tW1 c49279tW1) {
        return new C36502Ux2(c49279tW1);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C36502Ux2 get() {
        return m79088c(this.f40105a.get());
    }
}
