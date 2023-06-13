package p000;
/* renamed from: mW2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45130mW2 implements InterfaceC49405tj1<C44537lW2> {

    /* renamed from: a */
    public final Z94<InterfaceC44023ke5> f98126a;

    /* renamed from: b */
    public final Z94<Integer> f98127b;

    public C45130mW2(Z94<InterfaceC44023ke5> z94, Z94<Integer> z942) {
        this.f98126a = z94;
        this.f98127b = z942;
    }

    /* renamed from: a */
    public static C45130mW2 m25474a(Z94<InterfaceC44023ke5> z94, Z94<Integer> z942) {
        return new C45130mW2(z94, z942);
    }

    /* renamed from: c */
    public static C44537lW2 m25472c(InterfaceC44023ke5 interfaceC44023ke5, int i) {
        return new C44537lW2(interfaceC44023ke5, i);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C44537lW2 get() {
        return m25472c(this.f98126a.get(), this.f98127b.get().intValue());
    }
}
