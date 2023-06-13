package p000;
/* renamed from: uW1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49872uW1 implements InterfaceC49405tj1<C49279tW1> {

    /* renamed from: a */
    public final Z94<C40500ei0> f112539a;

    public C49872uW1(Z94<C40500ei0> z94) {
        this.f112539a = z94;
    }

    /* renamed from: a */
    public static C49872uW1 m10155a(Z94<C40500ei0> z94) {
        return new C49872uW1(z94);
    }

    /* renamed from: c */
    public static C49279tW1 m10153c(C40500ei0 c40500ei0) {
        return new C49279tW1(c40500ei0);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C49279tW1 get() {
        return m10153c(this.f112539a.get());
    }
}
