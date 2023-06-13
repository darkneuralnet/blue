package p000;
/* renamed from: JJ2 */
/* loaded from: classes4.dex */
public final class JJ2 implements InterfaceC48812sj1<InterfaceC36047Sy6> {

    /* renamed from: a */
    public final VH2 f17343a;

    /* renamed from: b */
    public final Y94<InterfaceC32537Dy6> f17344b;

    public JJ2(VH2 vh2, Y94<InterfaceC32537Dy6> y94) {
        this.f17343a = vh2;
        this.f17344b = y94;
    }

    /* renamed from: a */
    public static JJ2 m100712a(VH2 vh2, Y94<InterfaceC32537Dy6> y94) {
        return new JJ2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC36047Sy6 m100710c(VH2 vh2, InterfaceC32537Dy6 interfaceC32537Dy6) {
        return (InterfaceC36047Sy6) C51679xZ3.m5002e(vh2.m80089P0(interfaceC32537Dy6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC36047Sy6 get() {
        return m100710c(this.f17343a, this.f17344b.get());
    }
}
