package p000;
/* renamed from: sg5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C48786sg5 extends AbstractC5142M {

    /* renamed from: b */
    public final C4295K f109099b;

    /* renamed from: c */
    public final C2675G9 f109100c;

    public C48786sg5(AbstractC8166U abstractC8166U) {
        this.f109099b = C4295K.m99377A(abstractC8166U.mo35872A(0));
        this.f109100c = C2675G9.m105699o(abstractC8166U.mo35872A(1));
    }

    /* renamed from: j */
    public static final C48786sg5 m13849j(Object obj) {
        if (obj instanceof C48786sg5) {
            return (C48786sg5) obj;
        }
        if (obj != null) {
            return new C48786sg5(AbstractC8166U.m82198z(obj));
        }
        return null;
    }

    @Override // p000.AbstractC5142M, p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        C2042F c2042f = new C2042F();
        c2042f.m108151a(this.f109099b);
        c2042f.m108151a(this.f109100c);
        return new ZF0(c2042f);
    }

    /* renamed from: o */
    public C2675G9 m13848o() {
        return this.f109100c;
    }

    public C48786sg5(C2675G9 c2675g9) {
        this.f109099b = new C4295K(0L);
        this.f109100c = c2675g9;
    }
}
