package p000;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p000.NH6;
import p000.VH6;
/* renamed from: ja4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43389ja4 {

    /* renamed from: a */
    public static Map f92948a;

    /* renamed from: ja4$b */
    /* loaded from: classes8.dex */
    public static class C24932b extends AbstractC24937g {
        private C24932b() {
            super();
        }

        @Override // p000.C43389ja4.AbstractC24937g
        /* renamed from: a */
        public C19599cp mo30291a(C39159cT5 c39159cT5, Object obj) throws IOException {
            byte[] m93017C = AbstractC5803O.m93018A(c39159cT5.m61286u()).m93017C();
            if (DD3.m110683a(m93017C, 0) == 1) {
                return C34288Ll2.m96377a(C0210Ao.m115247h(m93017C, 4, m93017C.length));
            }
            if (m93017C.length == 64) {
                m93017C = C0210Ao.m115247h(m93017C, 4, m93017C.length);
            }
            return DE1.m110664a(m93017C);
        }
    }

    /* renamed from: ja4$c */
    /* loaded from: classes8.dex */
    public static class C24933c extends AbstractC24937g {
        private C24933c() {
            super();
        }

        @Override // p000.C43389ja4.AbstractC24937g
        /* renamed from: a */
        public C19599cp mo30291a(C39159cT5 c39159cT5, Object obj) throws IOException {
            C44465lO2 m27344s = C44465lO2.m27344s(c39159cT5.m61286u());
            return new C45058mO2(m27344s.m27343u(), m27344s.m27342v(), m27344s.m27345o(), C33329Hi6.m103511c(m27344s.m27346j().m105700j()));
        }
    }

    /* renamed from: ja4$d */
    /* loaded from: classes8.dex */
    public static class C24934d extends AbstractC24937g {
        private C24934d() {
            super();
        }

        @Override // p000.C43389ja4.AbstractC24937g
        /* renamed from: a */
        public C19599cp mo30291a(C39159cT5 c39159cT5, Object obj) throws IOException {
            return new C41590gY2(c39159cT5.m61287s().m113149A());
        }
    }

    /* renamed from: ja4$e */
    /* loaded from: classes8.dex */
    public static class C24935e extends AbstractC24937g {
        private C24935e() {
            super();
        }

        @Override // p000.C43389ja4.AbstractC24937g
        /* renamed from: a */
        public C19599cp mo30291a(C39159cT5 c39159cT5, Object obj) throws IOException {
            return new C49328tb4(C33329Hi6.m103509e(c39159cT5.m61289j()), c39159cT5.m61287s().m113148C());
        }
    }

    /* renamed from: ja4$f */
    /* loaded from: classes8.dex */
    public static class C24936f extends AbstractC24937g {
        private C24936f() {
            super();
        }

        @Override // p000.C43389ja4.AbstractC24937g
        /* renamed from: a */
        public C19599cp mo30291a(C39159cT5 c39159cT5, Object obj) throws IOException {
            return new C50564vg5(c39159cT5.m61287s().m113149A(), C33329Hi6.m103507g(C48786sg5.m13849j(c39159cT5.m61289j().m105698s())));
        }
    }

    /* renamed from: ja4$g */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC24937g {
        private AbstractC24937g() {
        }

        /* renamed from: a */
        public abstract C19599cp mo30291a(C39159cT5 c39159cT5, Object obj) throws IOException;
    }

    /* renamed from: ja4$h */
    /* loaded from: classes8.dex */
    public static class C24938h extends AbstractC24937g {
        private C24938h() {
            super();
        }

        @Override // p000.C43389ja4.AbstractC24937g
        /* renamed from: a */
        public C19599cp mo30291a(C39159cT5 c39159cT5, Object obj) throws IOException {
            VH6.C8597b m80005f;
            FH6 m107355o = FH6.m107355o(c39159cT5.m61289j().m105698s());
            if (m107355o != null) {
                C5448N m105700j = m107355o.m107354s().m105700j();
                UH6 m81680j = UH6.m81680j(c39159cT5.m61286u());
                m80005f = new VH6.C8597b(new RH6(m107355o.m107356j(), C33329Hi6.m103512b(m105700j))).m80004g(m81680j.m81679o()).m80003h(m81680j.m81678s());
            } else {
                byte[] m93017C = AbstractC5803O.m93018A(c39159cT5.m61286u()).m93017C();
                m80005f = new VH6.C8597b(RH6.m86979k(DD3.m110683a(m93017C, 0))).m80005f(m93017C);
            }
            return m80005f.m80006e();
        }
    }

    /* renamed from: ja4$i */
    /* loaded from: classes8.dex */
    public static class C24939i extends AbstractC24937g {
        private C24939i() {
            super();
        }

        @Override // p000.C43389ja4.AbstractC24937g
        /* renamed from: a */
        public C19599cp mo30291a(C39159cT5 c39159cT5, Object obj) throws IOException {
            NH6.C5539b m94094f;
            IH6 m102558o = IH6.m102558o(c39159cT5.m61289j().m105698s());
            if (m102558o != null) {
                C5448N m105700j = m102558o.m102556u().m105700j();
                UH6 m81680j = UH6.m81680j(c39159cT5.m61286u());
                m94094f = new NH6.C5539b(new JH6(m102558o.m102559j(), m102558o.m102557s(), C33329Hi6.m103512b(m105700j))).m94093g(m81680j.m81679o()).m94092h(m81680j.m81678s());
            } else {
                byte[] m93017C = AbstractC5803O.m93018A(c39159cT5.m61286u()).m93017C();
                m94094f = new NH6.C5539b(JH6.m100731i(DD3.m110683a(m93017C, 0))).m94094f(m93017C);
            }
            return m94094f.m94095e();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f92948a = hashMap;
        hashMap.put(BD3.f2068X, new C24935e());
        f92948a.put(BD3.f2069Y, new C24935e());
        f92948a.put(BD3.f2087r, new C24936f());
        f92948a.put(BD3.f2091v, new C24934d());
        f92948a.put(BD3.f2092w, new C24938h());
        f92948a.put(BD3.f2050F, new C24939i());
        f92948a.put(InterfaceC41015fa2.f80335a, new C24938h());
        f92948a.put(InterfaceC41015fa2.f80336b, new C24939i());
        f92948a.put(InterfaceC52074yD3.f119005I0, new C24932b());
        f92948a.put(BD3.f2083n, new C24933c());
    }

    /* renamed from: a */
    public static C19599cp m30293a(C39159cT5 c39159cT5) throws IOException {
        return m30292b(c39159cT5, null);
    }

    /* renamed from: b */
    public static C19599cp m30292b(C39159cT5 c39159cT5, Object obj) throws IOException {
        C2675G9 m61289j = c39159cT5.m61289j();
        AbstractC24937g abstractC24937g = (AbstractC24937g) f92948a.get(m61289j.m105700j());
        if (abstractC24937g != null) {
            return abstractC24937g.mo30291a(c39159cT5, obj);
        }
        throw new IOException("algorithm identifier in public key not recognised: " + m61289j.m105700j());
    }
}
