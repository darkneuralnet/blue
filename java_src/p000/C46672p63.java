package p000;
/* renamed from: p63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46672p63 implements InterfaceC48812sj1<InterfaceC46353oa3> {

    /* renamed from: a */
    public final P43 f103135a;

    /* renamed from: b */
    public final Y94<MN4> f103136b;

    public C46672p63(P43 p43, Y94<MN4> y94) {
        this.f103135a = p43;
        this.f103136b = y94;
    }

    /* renamed from: a */
    public static C46672p63 m19956a(P43 p43, Y94<MN4> y94) {
        return new C46672p63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC46353oa3 m19954c(P43 p43, MN4 mn4) {
        return (InterfaceC46353oa3) C51679xZ3.m5002e(p43.m91013C0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC46353oa3 get() {
        return m19954c(this.f103135a, this.f103136b.get());
    }
}
