package p000;

import p000.C35458Ql2;
import p000.C49144tH1;
/* renamed from: PH6 */
/* loaded from: classes8.dex */
public class PH6 {
    /* renamed from: a */
    public static OH6 m90508a(C44797lw6 c44797lw6, C46576ow6 c46576ow6, C35458Ql2 c35458Ql2) {
        double d;
        if (c46576ow6 == null) {
            throw new NullPointerException("publicKey == null");
        }
        if (c35458Ql2 == null) {
            throw new NullPointerException("address == null");
        }
        int m22162a = c44797lw6.m26614d().m22162a();
        byte[][] m20253a = c46576ow6.m20253a();
        OH6[] oh6Arr = new OH6[m20253a.length];
        for (int i = 0; i < m20253a.length; i++) {
            oh6Arr[i] = new OH6(0, m20253a[i]);
        }
        C35458Ql2.C6861b m112394f = new C35458Ql2.C6861b().m112393g(c35458Ql2.m112400b()).m112392h(c35458Ql2.m112399c()).m88078n(c35458Ql2.m88086e()).m88077o(0).m88076p(c35458Ql2.m88084g()).m112394f(c35458Ql2.m112401a());
        while (true) {
            C35458Ql2 c35458Ql22 = (C35458Ql2) m112394f.m88080l();
            if (m22162a <= 1) {
                return oh6Arr[0];
            }
            int i2 = 0;
            while (true) {
                d = m22162a / 2;
                if (i2 >= ((int) Math.floor(d))) {
                    break;
                }
                c35458Ql22 = (C35458Ql2) new C35458Ql2.C6861b().m112393g(c35458Ql22.m112400b()).m112392h(c35458Ql22.m112399c()).m88078n(c35458Ql22.m88086e()).m88077o(c35458Ql22.m88085f()).m88076p(i2).m112394f(c35458Ql22.m112401a()).m88080l();
                int i3 = i2 * 2;
                oh6Arr[i2] = m90507b(c44797lw6, oh6Arr[i3], oh6Arr[i3 + 1], c35458Ql22);
                i2++;
            }
            if (m22162a % 2 == 1) {
                oh6Arr[(int) Math.floor(d)] = oh6Arr[m22162a - 1];
            }
            m22162a = (int) Math.ceil(m22162a / 2.0d);
            m112394f = new C35458Ql2.C6861b().m112393g(c35458Ql22.m112400b()).m112392h(c35458Ql22.m112399c()).m88078n(c35458Ql22.m88086e()).m88077o(c35458Ql22.m88085f() + 1).m88076p(c35458Ql22.m88084g()).m112394f(c35458Ql22.m112401a());
        }
    }

    /* renamed from: b */
    public static OH6 m90507b(C44797lw6 c44797lw6, OH6 oh6, OH6 oh62, CH6 ch6) {
        if (oh6 != null) {
            if (oh62 != null) {
                if (oh6.m92565a() == oh62.m92565a()) {
                    if (ch6 != null) {
                        byte[] m26612f = c44797lw6.m26612f();
                        if (ch6 instanceof C35458Ql2) {
                            C35458Ql2 c35458Ql2 = (C35458Ql2) ch6;
                            ch6 = (C35458Ql2) new C35458Ql2.C6861b().m112393g(c35458Ql2.m112400b()).m112392h(c35458Ql2.m112399c()).m88078n(c35458Ql2.m88086e()).m88077o(c35458Ql2.m88085f()).m88076p(c35458Ql2.m88084g()).m112394f(0).m88080l();
                        } else if (ch6 instanceof C49144tH1) {
                            C49144tH1 c49144tH1 = (C49144tH1) ch6;
                            ch6 = (C49144tH1) new C49144tH1.C28670b().m112393g(c49144tH1.m112400b()).m112392h(c49144tH1.m112399c()).m12539m(c49144tH1.m12546e()).m12538n(c49144tH1.m12545f()).m112394f(0).m12541k();
                        }
                        byte[] m42574c = c44797lw6.m26615c().m42574c(m26612f, ch6.mo12547d());
                        if (ch6 instanceof C35458Ql2) {
                            C35458Ql2 c35458Ql22 = (C35458Ql2) ch6;
                            ch6 = (C35458Ql2) new C35458Ql2.C6861b().m112393g(c35458Ql22.m112400b()).m112392h(c35458Ql22.m112399c()).m88078n(c35458Ql22.m88086e()).m88077o(c35458Ql22.m88085f()).m88076p(c35458Ql22.m88084g()).m112394f(1).m88080l();
                        } else if (ch6 instanceof C49144tH1) {
                            C49144tH1 c49144tH12 = (C49144tH1) ch6;
                            ch6 = (C49144tH1) new C49144tH1.C28670b().m112393g(c49144tH12.m112400b()).m112392h(c49144tH12.m112399c()).m12539m(c49144tH12.m12546e()).m12538n(c49144tH12.m12545f()).m112394f(1).m12541k();
                        }
                        byte[] m42574c2 = c44797lw6.m26615c().m42574c(m26612f, ch6.mo12547d());
                        if (ch6 instanceof C35458Ql2) {
                            C35458Ql2 c35458Ql23 = (C35458Ql2) ch6;
                            ch6 = (C35458Ql2) new C35458Ql2.C6861b().m112393g(c35458Ql23.m112400b()).m112392h(c35458Ql23.m112399c()).m88078n(c35458Ql23.m88086e()).m88077o(c35458Ql23.m88085f()).m88076p(c35458Ql23.m88084g()).m112394f(2).m88080l();
                        } else if (ch6 instanceof C49144tH1) {
                            C49144tH1 c49144tH13 = (C49144tH1) ch6;
                            ch6 = (C49144tH1) new C49144tH1.C28670b().m112393g(c49144tH13.m112400b()).m112392h(c49144tH13.m112399c()).m12539m(c49144tH13.m12546e()).m12538n(c49144tH13.m12545f()).m112394f(2).m12541k();
                        }
                        byte[] m42574c3 = c44797lw6.m26615c().m42574c(m26612f, ch6.mo12547d());
                        int m22160c = c44797lw6.m26614d().m22160c();
                        byte[] bArr = new byte[m22160c * 2];
                        for (int i = 0; i < m22160c; i++) {
                            bArr[i] = (byte) (oh6.m92564b()[i] ^ m42574c2[i]);
                        }
                        for (int i2 = 0; i2 < m22160c; i2++) {
                            bArr[i2 + m22160c] = (byte) (oh62.m92564b()[i2] ^ m42574c3[i2]);
                        }
                        return new OH6(oh6.m92565a(), c44797lw6.m26615c().m42575b(m42574c, bArr));
                    }
                    throw new NullPointerException("address == null");
                }
                throw new IllegalStateException("height of both nodes must be equal");
            }
            throw new NullPointerException("right == null");
        }
        throw new NullPointerException("left == null");
    }
}
