package p000;
/* renamed from: T63 */
/* loaded from: classes4.dex */
public final class T63 implements InterfaceC48812sj1<MQ5> {

    /* renamed from: a */
    public final P43 f34790a;

    /* renamed from: b */
    public final Y94<MN4> f34791b;

    public T63(P43 p43, Y94<MN4> y94) {
        this.f34790a = p43;
        this.f34791b = y94;
    }

    /* renamed from: a */
    public static T63 m84309a(P43 p43, Y94<MN4> y94) {
        return new T63(p43, y94);
    }

    /* renamed from: c */
    public static MQ5 m84307c(P43 p43, MN4 mn4) {
        return (MQ5) C51679xZ3.m5002e(p43.m90936h1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MQ5 get() {
        return m84307c(this.f34790a, this.f34791b.get());
    }
}
