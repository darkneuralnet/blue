package p000;

import java.io.IOException;
import java.util.Enumeration;
/* renamed from: l64  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44301l64 extends AbstractC5142M {

    /* renamed from: b */
    public C4295K f95492b;

    /* renamed from: c */
    public C2675G9 f95493c;

    /* renamed from: d */
    public AbstractC5803O f95494d;

    /* renamed from: e */
    public AbstractC8888W f95495e;

    /* renamed from: f */
    public AbstractC0808C f95496f;

    public C44301l64(AbstractC8166U abstractC8166U) {
        Enumeration mo35871C = abstractC8166U.mo35871C();
        C4295K m99377A = C4295K.m99377A(mo35871C.nextElement());
        this.f95492b = m99377A;
        int m27860v = m27860v(m99377A);
        this.f95493c = C2675G9.m105699o(mo35871C.nextElement());
        this.f95494d = AbstractC5803O.m93018A(mo35871C.nextElement());
        int i = -1;
        while (mo35871C.hasMoreElements()) {
            AbstractC10088Z abstractC10088Z = (AbstractC10088Z) mo35871C.nextElement();
            int m73928C = abstractC10088Z.m73928C();
            if (m73928C <= i) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            if (m73928C == 0) {
                this.f95495e = AbstractC8888W.m79015A(abstractC10088Z, false);
            } else if (m73928C != 1) {
                throw new IllegalArgumentException("unknown optional field in private key info");
            } else {
                if (m27860v < 1) {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                this.f95496f = MF0.m95472F(abstractC10088Z, false);
            }
            i = m73928C;
        }
    }

    /* renamed from: o */
    public static C44301l64 m27863o(Object obj) {
        if (obj instanceof C44301l64) {
            return (C44301l64) obj;
        }
        if (obj != null) {
            return new C44301l64(AbstractC8166U.m82198z(obj));
        }
        return null;
    }

    /* renamed from: v */
    public static int m27860v(C4295K c4295k) {
        int m99373F = c4295k.m99373F();
        if (m99373F < 0 || m99373F > 1) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        return m99373F;
    }

    @Override // p000.AbstractC5142M, p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        C2042F c2042f = new C2042F(5);
        c2042f.m108151a(this.f95492b);
        c2042f.m108151a(this.f95493c);
        c2042f.m108151a(this.f95494d);
        AbstractC8888W abstractC8888W = this.f95495e;
        if (abstractC8888W != null) {
            c2042f.m108151a(new C39037cG0(false, 0, abstractC8888W));
        }
        AbstractC0808C abstractC0808C = this.f95496f;
        if (abstractC0808C != null) {
            c2042f.m108151a(new C39037cG0(false, 1, abstractC0808C));
        }
        return new ZF0(c2042f);
    }

    /* renamed from: j */
    public AbstractC8888W m27864j() {
        return this.f95495e;
    }

    /* renamed from: s */
    public C2675G9 m27862s() {
        return this.f95493c;
    }

    /* renamed from: u */
    public AbstractC0808C m27861u() {
        return this.f95496f;
    }

    /* renamed from: w */
    public InterfaceC1693E m27859w() throws IOException {
        return AbstractC7305S.m86134v(this.f95494d.m93017C());
    }

    public C44301l64(C2675G9 c2675g9, InterfaceC1693E interfaceC1693E) throws IOException {
        this(c2675g9, interfaceC1693E, null, null);
    }

    public C44301l64(C2675G9 c2675g9, InterfaceC1693E interfaceC1693E, AbstractC8888W abstractC8888W) throws IOException {
        this(c2675g9, interfaceC1693E, abstractC8888W, null);
    }

    public C44301l64(C2675G9 c2675g9, InterfaceC1693E interfaceC1693E, AbstractC8888W abstractC8888W, byte[] bArr) throws IOException {
        this.f95492b = new C4295K(bArr != null ? C4387KG.f19325b : C4387KG.f19324a);
        this.f95493c = c2675g9;
        this.f95494d = new VF0(interfaceC1693E);
        this.f95495e = abstractC8888W;
        this.f95496f = bArr == null ? null : new MF0(bArr);
    }
}
