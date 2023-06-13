package p000;
/* renamed from: C95 */
/* loaded from: classes4.dex */
public final class C95 implements InterfaceC48812sj1<B95> {

    /* renamed from: a */
    public final Y94<UI4> f3520a;

    public C95(Y94<UI4> y94) {
        this.f3520a = y94;
    }

    /* renamed from: a */
    public static C95 m112729a(Y94<UI4> y94) {
        return new C95(y94);
    }

    /* renamed from: c */
    public static B95 m112727c(UI4 ui4) {
        return new B95(ui4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public B95 get() {
        return m112727c(this.f3520a.get());
    }
}
