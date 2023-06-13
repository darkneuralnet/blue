package p000;

import java.io.IOException;
/* renamed from: m64  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44894m64 {
    private C44894m64() {
    }

    /* renamed from: a */
    public static C44301l64 m26341a(C19599cp c19599cp, AbstractC8888W abstractC8888W) throws IOException {
        if (c19599cp instanceof C48735sb4) {
            C48735sb4 c48735sb4 = (C48735sb4) c19599cp;
            return new C44301l64(C33329Hi6.m103510d(c48735sb4.m13960b()), new VF0(c48735sb4.m13961a()), abstractC8888W);
        } else if (c19599cp instanceof C49972ug5) {
            C49972ug5 c49972ug5 = (C49972ug5) c19599cp;
            return new C44301l64(new C2675G9(BD3.f2087r, new C48786sg5(C33329Hi6.m103508f(c49972ug5.m11928a()))), new VF0(c49972ug5.m9883b()));
        } else if (c19599cp instanceof C40997fY2) {
            C2675G9 c2675g9 = new C2675G9(BD3.f2091v);
            short[] m41206a = ((C40997fY2) c19599cp).m41206a();
            byte[] bArr = new byte[m41206a.length * 2];
            for (int i = 0; i != m41206a.length; i++) {
                DD3.m110670n(m41206a[i], bArr, i * 2);
            }
            return new C44301l64(c2675g9, new VF0(bArr));
        } else if (c19599cp instanceof C34054Kl2) {
            C34054Kl2 c34054Kl2 = (C34054Kl2) c19599cp;
            byte[] m104624b = C33188Gt0.m104620f().m104617i(1).m104623c(c34054Kl2).m104624b();
            return new C44301l64(new C2675G9(InterfaceC52074yD3.f119005I0), new VF0(m104624b), abstractC8888W, C33188Gt0.m104620f().m104617i(1).m104623c(c34054Kl2.m98309i()).m104624b());
        } else if (c19599cp instanceof CE1) {
            CE1 ce1 = (CE1) c19599cp;
            byte[] m104624b2 = C33188Gt0.m104620f().m104617i(ce1.m112601c()).m104623c(ce1).m104624b();
            return new C44301l64(new C2675G9(InterfaceC52074yD3.f119005I0), new VF0(m104624b2), abstractC8888W, C33188Gt0.m104620f().m104617i(ce1.m112601c()).m104623c(ce1.m112600d().m110662c()).m104624b());
        } else if (c19599cp instanceof TH6) {
            TH6 th6 = (TH6) c19599cp;
            return new C44301l64(new C2675G9(BD3.f2092w, new FH6(th6.m83967b().m86988b(), C33329Hi6.m103506h(th6.m109245a()))), m26340b(th6), abstractC8888W);
        } else if (c19599cp instanceof LH6) {
            LH6 lh6 = (LH6) c19599cp;
            return new C44301l64(new C2675G9(BD3.f2050F, new IH6(lh6.m97395b().m100739a(), lh6.m97395b().m100738b(), C33329Hi6.m103506h(lh6.m104061a()))), m26339c(lh6), abstractC8888W);
        } else if (c19599cp instanceof C43872kO2) {
            C43872kO2 c43872kO2 = (C43872kO2) c19599cp;
            return new C44301l64(new C2675G9(BD3.f2083n), new C43279jO2(c43872kO2.m29026f(), c43872kO2.m29027e(), c43872kO2.m29030b(), c43872kO2.m29029c(), c43872kO2.m29025g(), C33329Hi6.m103513a(c43872kO2.m34031a())));
        } else {
            throw new IOException("key parameters not recognized");
        }
    }

    /* renamed from: b */
    public static SH6 m26340b(TH6 th6) throws IOException {
        byte[] encoded = th6.getEncoded();
        int m86982h = th6.m83967b().m86982h();
        int m86988b = th6.m83967b().m86988b();
        int m78621a = (int) WH6.m78621a(encoded, 0, 4);
        if (WH6.m78610l(m86988b, m78621a)) {
            byte[] m78615g = WH6.m78615g(encoded, 4, m86982h);
            int i = 4 + m86982h;
            byte[] m78615g2 = WH6.m78615g(encoded, i, m86982h);
            int i2 = i + m86982h;
            byte[] m78615g3 = WH6.m78615g(encoded, i2, m86982h);
            int i3 = i2 + m86982h;
            byte[] m78615g4 = WH6.m78615g(encoded, i3, m86982h);
            int i4 = i3 + m86982h;
            byte[] m78615g5 = WH6.m78615g(encoded, i4, encoded.length - i4);
            try {
                C29993wv c29993wv = (C29993wv) WH6.m78616f(m78615g5, C29993wv.class);
                return c29993wv.m6111c() != (1 << m86988b) - 1 ? new SH6(m78621a, m78615g, m78615g2, m78615g3, m78615g4, m78615g5, c29993wv.m6111c()) : new SH6(m78621a, m78615g, m78615g2, m78615g3, m78615g4, m78615g5);
            } catch (ClassNotFoundException e) {
                throw new IOException("cannot parse BDS: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    /* renamed from: c */
    public static KH6 m26339c(LH6 lh6) throws IOException {
        byte[] encoded = lh6.getEncoded();
        int m100734f = lh6.m97395b().m100734f();
        int m100739a = lh6.m97395b().m100739a();
        int i = (m100739a + 7) / 8;
        long m78621a = (int) WH6.m78621a(encoded, 0, i);
        if (WH6.m78610l(m100739a, m78621a)) {
            int i2 = i + 0;
            byte[] m78615g = WH6.m78615g(encoded, i2, m100734f);
            int i3 = i2 + m100734f;
            byte[] m78615g2 = WH6.m78615g(encoded, i3, m100734f);
            int i4 = i3 + m100734f;
            byte[] m78615g3 = WH6.m78615g(encoded, i4, m100734f);
            int i5 = i4 + m100734f;
            byte[] m78615g4 = WH6.m78615g(encoded, i5, m100734f);
            int i6 = i5 + m100734f;
            byte[] m78615g5 = WH6.m78615g(encoded, i6, encoded.length - i6);
            try {
                C30340xv c30340xv = (C30340xv) WH6.m78616f(m78615g5, C30340xv.class);
                return c30340xv.m4444b() != (1 << m100739a) - 1 ? new KH6(m78621a, m78615g, m78615g2, m78615g3, m78615g4, m78615g5, c30340xv.m4444b()) : new KH6(m78621a, m78615g, m78615g2, m78615g3, m78615g4, m78615g5);
            } catch (ClassNotFoundException e) {
                throw new IOException("cannot parse BDSStateMap: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("index out of bounds");
    }
}
