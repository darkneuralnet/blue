package p000;

import java.io.IOException;
import java.util.Enumeration;
/* renamed from: cT5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C39159cT5 extends AbstractC5142M {

    /* renamed from: b */
    public C2675G9 f60696b;

    /* renamed from: c */
    public MF0 f60697c;

    public C39159cT5(AbstractC8166U abstractC8166U) {
        if (abstractC8166U.size() == 2) {
            Enumeration mo35871C = abstractC8166U.mo35871C();
            this.f60696b = C2675G9.m105699o(mo35871C.nextElement());
            this.f60697c = MF0.m95471G(mo35871C.nextElement());
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + abstractC8166U.size());
    }

    /* renamed from: o */
    public static C39159cT5 m61288o(Object obj) {
        if (obj instanceof C39159cT5) {
            return (C39159cT5) obj;
        }
        if (obj != null) {
            return new C39159cT5(AbstractC8166U.m82198z(obj));
        }
        return null;
    }

    @Override // p000.AbstractC5142M, p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        C2042F c2042f = new C2042F(2);
        c2042f.m108151a(this.f60696b);
        c2042f.m108151a(this.f60697c);
        return new ZF0(c2042f);
    }

    /* renamed from: j */
    public C2675G9 m61289j() {
        return this.f60696b;
    }

    /* renamed from: s */
    public MF0 m61287s() {
        return this.f60697c;
    }

    /* renamed from: u */
    public AbstractC7305S m61286u() throws IOException {
        return AbstractC7305S.m86134v(this.f60697c.m113148C());
    }

    public C39159cT5(C2675G9 c2675g9, InterfaceC1693E interfaceC1693E) throws IOException {
        this.f60697c = new MF0(interfaceC1693E);
        this.f60696b = c2675g9;
    }

    public C39159cT5(C2675G9 c2675g9, byte[] bArr) {
        this.f60697c = new MF0(bArr);
        this.f60696b = c2675g9;
    }
}
