package p000;
/* renamed from: Ci0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32153Ci0 implements InterfaceC49405tj1<C31919Bi0> {

    /* renamed from: a */
    public final Z94<C52951zi0> f4517a;

    /* renamed from: b */
    public final Z94<String[][]> f4518b;

    public C32153Ci0(Z94<C52951zi0> z94, Z94<String[][]> z942) {
        this.f4517a = z94;
        this.f4518b = z942;
    }

    /* renamed from: a */
    public static C32153Ci0 m111830a(Z94<C52951zi0> z94, Z94<String[][]> z942) {
        return new C32153Ci0(z94, z942);
    }

    /* renamed from: c */
    public static C31919Bi0 m111828c(C52951zi0 c52951zi0, String[][] strArr) {
        return new C31919Bi0(c52951zi0, strArr);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C31919Bi0 get() {
        return m111828c(this.f4517a.get(), this.f4518b.get());
    }
}
