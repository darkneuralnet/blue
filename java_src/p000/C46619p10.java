package p000;
/* renamed from: p10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46619p10 implements InterfaceC48812sj1<C46026o10> {

    /* renamed from: a */
    public final Y94<InterfaceC47212q10> f102947a;

    public C46619p10(Y94<InterfaceC47212q10> y94) {
        this.f102947a = y94;
    }

    /* renamed from: a */
    public static C46619p10 m20158a(Y94<InterfaceC47212q10> y94) {
        return new C46619p10(y94);
    }

    /* renamed from: c */
    public static C46026o10 m20156c(InterfaceC47212q10 interfaceC47212q10) {
        return new C46026o10(interfaceC47212q10);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C46026o10 get() {
        return m20156c(this.f102947a.get());
    }
}
