package p000;
/* renamed from: T53 */
/* loaded from: classes4.dex */
public final class T53 implements InterfaceC48812sj1<DB1> {

    /* renamed from: a */
    public final P43 f34740a;

    /* renamed from: b */
    public final Y94<MN4> f34741b;

    public T53(P43 p43, Y94<MN4> y94) {
        this.f34740a = p43;
        this.f34741b = y94;
    }

    /* renamed from: a */
    public static T53 m84357a(P43 p43, Y94<MN4> y94) {
        return new T53(p43, y94);
    }

    /* renamed from: c */
    public static DB1 m84355c(P43 p43, MN4 mn4) {
        return (DB1) C51679xZ3.m5002e(p43.m90943f0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public DB1 get() {
        return m84355c(this.f34740a, this.f34741b.get());
    }
}
