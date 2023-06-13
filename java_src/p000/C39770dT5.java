package p000;

import java.io.IOException;
/* renamed from: dT5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C39770dT5 {
    private C39770dT5() {
    }

    /* renamed from: a */
    public static C39159cT5 m44228a(C19599cp c19599cp) throws IOException {
        if (c19599cp instanceof C49328tb4) {
            C49328tb4 c49328tb4 = (C49328tb4) c19599cp;
            return new C39159cT5(C33329Hi6.m103510d(c49328tb4.m12021b()), c49328tb4.m12022a());
        } else if (c19599cp instanceof C50564vg5) {
            C50564vg5 c50564vg5 = (C50564vg5) c19599cp;
            return new C39159cT5(new C2675G9(BD3.f2087r, new C48786sg5(C33329Hi6.m103508f(c50564vg5.m11928a()))), c50564vg5.m8264b());
        } else if (c19599cp instanceof C41590gY2) {
            return new C39159cT5(new C2675G9(BD3.f2091v), ((C41590gY2) c19599cp).m39181a());
        } else {
            if (c19599cp instanceof C34288Ll2) {
                return new C39159cT5(new C2675G9(InterfaceC52074yD3.f119005I0), new VF0(C33188Gt0.m104620f().m104617i(1).m104623c((C34288Ll2) c19599cp).m104624b()));
            } else if (c19599cp instanceof DE1) {
                DE1 de1 = (DE1) c19599cp;
                return new C39159cT5(new C2675G9(InterfaceC52074yD3.f119005I0), new VF0(C33188Gt0.m104620f().m104617i(de1.m110663b()).m104623c(de1.m110662c()).m104624b()));
            } else if (c19599cp instanceof VH6) {
                VH6 vh6 = (VH6) c19599cp;
                byte[] m80013c = vh6.m80013c();
                byte[] m80012d = vh6.m80012d();
                byte[] encoded = vh6.getEncoded();
                return encoded.length > m80013c.length + m80012d.length ? new C39159cT5(new C2675G9(InterfaceC41015fa2.f80335a), new VF0(encoded)) : new C39159cT5(new C2675G9(BD3.f2092w, new FH6(vh6.m80014b().m86988b(), C33329Hi6.m103506h(vh6.m109245a()))), new UH6(m80013c, m80012d));
            } else if (!(c19599cp instanceof NH6)) {
                if (c19599cp instanceof C45058mO2) {
                    C45058mO2 c45058mO2 = (C45058mO2) c19599cp;
                    return new C39159cT5(new C2675G9(BD3.f2083n), new C44465lO2(c45058mO2.m25684c(), c45058mO2.m25683d(), c45058mO2.m25685b(), C33329Hi6.m103513a(c45058mO2.m34031a())));
                }
                throw new IOException("key parameters not recognized");
            } else {
                NH6 nh6 = (NH6) c19599cp;
                byte[] m94102c = nh6.m94102c();
                byte[] m94101d = nh6.m94101d();
                byte[] encoded2 = nh6.getEncoded();
                return encoded2.length > m94102c.length + m94101d.length ? new C39159cT5(new C2675G9(InterfaceC41015fa2.f80336b), new VF0(encoded2)) : new C39159cT5(new C2675G9(BD3.f2050F, new IH6(nh6.m94103b().m100739a(), nh6.m94103b().m100738b(), C33329Hi6.m103506h(nh6.m104061a()))), new MH6(nh6.m94102c(), nh6.m94101d()));
            }
        }
    }
}
