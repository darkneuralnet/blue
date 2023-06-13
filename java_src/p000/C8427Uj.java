package p000;
/* renamed from: Uj */
/* loaded from: classes4.dex */
public final class C8427Uj implements InterfaceC48812sj1<NV0> {

    /* renamed from: a */
    public final C22711hj f37885a;

    /* renamed from: b */
    public final Y94<WV0> f37886b;

    public C8427Uj(C22711hj c22711hj, Y94<WV0> y94) {
        this.f37885a = c22711hj;
        this.f37886b = y94;
    }

    /* renamed from: a */
    public static C8427Uj m80980a(C22711hj c22711hj, Y94<WV0> y94) {
        return new C8427Uj(c22711hj, y94);
    }

    /* renamed from: c */
    public static NV0 m80978c(C22711hj c22711hj, WV0 wv0) {
        return (NV0) C51679xZ3.m5002e(c22711hj.m36032N(wv0));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public NV0 get() {
        return m80978c(this.f37885a, this.f37886b.get());
    }
}
