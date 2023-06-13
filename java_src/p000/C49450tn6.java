package p000;
/* renamed from: tn6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49450tn6 implements InterfaceC48812sj1<C48857sn6> {

    /* renamed from: a */
    public final Y94<InterfaceC47672qn6> f111017a;

    public C49450tn6(Y94<InterfaceC47672qn6> y94) {
        this.f111017a = y94;
    }

    /* renamed from: a */
    public static C49450tn6 m11771a(Y94<InterfaceC47672qn6> y94) {
        return new C49450tn6(y94);
    }

    /* renamed from: c */
    public static C48857sn6 m11769c(InterfaceC47672qn6 interfaceC47672qn6) {
        return new C48857sn6(interfaceC47672qn6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C48857sn6 get() {
        return m11769c(this.f111017a.get());
    }
}
