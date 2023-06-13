package p000;

import java.util.ArrayList;
import java.util.Iterator;
import p000.C37211Xy0;
import p000.C43042iz0;
import p000.C5928OE;
/* renamed from: c41  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C38924c41 {

    /* renamed from: a */
    public static C5928OE.C5929a f60028a = new C5928OE.C5929a();

    /* renamed from: b */
    public static int f60029b = 0;

    /* renamed from: c */
    public static int f60030c = 0;

    /* renamed from: a */
    public static boolean m61980a(int i, C43042iz0 c43042iz0) {
        C43635jz0 c43635jz0;
        boolean z;
        boolean z2;
        C43042iz0.EnumC24677b enumC24677b;
        C43042iz0.EnumC24677b enumC24677b2;
        C43042iz0.EnumC24677b m31434C = c43042iz0.m31434C();
        C43042iz0.EnumC24677b m31397V = c43042iz0.m31397V();
        if (c43042iz0.m31414M() != null) {
            c43635jz0 = (C43635jz0) c43042iz0.m31414M();
        } else {
            c43635jz0 = null;
        }
        if (c43635jz0 != null) {
            c43635jz0.m31434C();
            C43042iz0.EnumC24677b enumC24677b3 = C43042iz0.EnumC24677b.FIXED;
        }
        if (c43635jz0 != null) {
            c43635jz0.m31397V();
            C43042iz0.EnumC24677b enumC24677b4 = C43042iz0.EnumC24677b.FIXED;
        }
        C43042iz0.EnumC24677b enumC24677b5 = C43042iz0.EnumC24677b.FIXED;
        if (m31434C != enumC24677b5 && !c43042iz0.mo7201p0() && m31434C != C43042iz0.EnumC24677b.WRAP_CONTENT && ((m31434C != (enumC24677b2 = C43042iz0.EnumC24677b.MATCH_CONSTRAINT) || c43042iz0.f91927w != 0 || c43042iz0.f91894f0 != 0.0f || !c43042iz0.m31383c0(0)) && (m31434C != enumC24677b2 || c43042iz0.f91927w != 1 || !c43042iz0.m31374f0(0, c43042iz0.m31391Y())))) {
            z = false;
        } else {
            z = true;
        }
        if (m31397V != enumC24677b5 && !c43042iz0.mo7199q0() && m31397V != C43042iz0.EnumC24677b.WRAP_CONTENT && ((m31397V != (enumC24677b = C43042iz0.EnumC24677b.MATCH_CONSTRAINT) || c43042iz0.f91929x != 0 || c43042iz0.f91894f0 != 0.0f || !c43042iz0.m31383c0(1)) && (m31397V != enumC24677b || c43042iz0.f91929x != 1 || !c43042iz0.m31374f0(1, c43042iz0.m31328z())))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (c43042iz0.f91894f0 > 0.0f && (z || z2)) {
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m61979b(int i, C43042iz0 c43042iz0, C5928OE.InterfaceC5930b interfaceC5930b, boolean z) {
        boolean z2;
        C37211Xy0 c37211Xy0;
        C37211Xy0 c37211Xy02;
        boolean z3;
        C37211Xy0 c37211Xy03;
        C37211Xy0 c37211Xy04;
        if (c43042iz0.m31367i0()) {
            return;
        }
        boolean z4 = true;
        f60029b++;
        if (!(c43042iz0 instanceof C43635jz0) && c43042iz0.m31350o0()) {
            int i2 = i + 1;
            if (m61980a(i2, c43042iz0)) {
                C43635jz0.m29537X1(i2, c43042iz0, interfaceC5930b, new C5928OE.C5929a(), C5928OE.C5929a.f26236k);
            }
        }
        C37211Xy0 mo7200q = c43042iz0.mo7200q(C37211Xy0.EnumC9561b.LEFT);
        C37211Xy0 mo7200q2 = c43042iz0.mo7200q(C37211Xy0.EnumC9561b.RIGHT);
        int m75998e = mo7200q.m75998e();
        int m75998e2 = mo7200q2.m75998e();
        if (mo7200q.m75999d() != null && mo7200q.m75989n()) {
            Iterator<C37211Xy0> it = mo7200q.m75999d().iterator();
            while (it.hasNext()) {
                C37211Xy0 next = it.next();
                C43042iz0 c43042iz02 = next.f44306d;
                int i3 = i + 1;
                boolean m61980a = m61980a(i3, c43042iz02);
                if (c43042iz02.m31350o0() && m61980a) {
                    C43635jz0.m29537X1(i3, c43042iz02, interfaceC5930b, new C5928OE.C5929a(), C5928OE.C5929a.f26236k);
                }
                if ((next == c43042iz02.f91869Q && (c37211Xy04 = c43042iz02.f91873S.f44308f) != null && c37211Xy04.m75989n()) || (next == c43042iz02.f91873S && (c37211Xy03 = c43042iz02.f91869Q.f44308f) != null && c37211Xy03.m75989n())) {
                    z3 = z4;
                } else {
                    z3 = false;
                }
                C43042iz0.EnumC24677b m31434C = c43042iz02.m31434C();
                C43042iz0.EnumC24677b enumC24677b = C43042iz0.EnumC24677b.MATCH_CONSTRAINT;
                if (m31434C == enumC24677b && !m61980a) {
                    if (c43042iz02.m31434C() == enumC24677b && c43042iz02.f91837A >= 0 && c43042iz02.f91933z >= 0 && ((c43042iz02.m31393X() == 8 || (c43042iz02.f91927w == 0 && c43042iz02.m31332x() == 0.0f)) && !c43042iz02.m31361k0() && !c43042iz02.m31353n0() && z3 && !c43042iz02.m31361k0())) {
                        m61976e(i3, c43042iz0, interfaceC5930b, c43042iz02, z);
                    }
                } else if (!c43042iz02.m31350o0()) {
                    C37211Xy0 c37211Xy05 = c43042iz02.f91869Q;
                    if (next == c37211Xy05 && c43042iz02.f91873S.f44308f == null) {
                        int m75997f = c37211Xy05.m75997f() + m75998e;
                        c43042iz02.m31419J0(m75997f, c43042iz02.m31391Y() + m75997f);
                        m61979b(i3, c43042iz02, interfaceC5930b, z);
                    } else {
                        C37211Xy0 c37211Xy06 = c43042iz02.f91873S;
                        if (next == c37211Xy06 && c37211Xy05.f44308f == null) {
                            int m75997f2 = m75998e - c37211Xy06.m75997f();
                            c43042iz02.m31419J0(m75997f2 - c43042iz02.m31391Y(), m75997f2);
                            m61979b(i3, c43042iz02, interfaceC5930b, z);
                        } else if (z3 && !c43042iz02.m31361k0()) {
                            m61977d(i3, interfaceC5930b, c43042iz02, z);
                        }
                    }
                }
                z4 = true;
            }
        }
        if (c43042iz0 instanceof C50895wE1) {
            return;
        }
        if (mo7200q2.m75999d() != null && mo7200q2.m75989n()) {
            Iterator<C37211Xy0> it2 = mo7200q2.m75999d().iterator();
            while (it2.hasNext()) {
                C37211Xy0 next2 = it2.next();
                C43042iz0 c43042iz03 = next2.f44306d;
                int i4 = i + 1;
                boolean m61980a2 = m61980a(i4, c43042iz03);
                if (c43042iz03.m31350o0() && m61980a2) {
                    C43635jz0.m29537X1(i4, c43042iz03, interfaceC5930b, new C5928OE.C5929a(), C5928OE.C5929a.f26236k);
                }
                if ((next2 == c43042iz03.f91869Q && (c37211Xy02 = c43042iz03.f91873S.f44308f) != null && c37211Xy02.m75989n()) || (next2 == c43042iz03.f91873S && (c37211Xy0 = c43042iz03.f91869Q.f44308f) != null && c37211Xy0.m75989n())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C43042iz0.EnumC24677b m31434C2 = c43042iz03.m31434C();
                C43042iz0.EnumC24677b enumC24677b2 = C43042iz0.EnumC24677b.MATCH_CONSTRAINT;
                if (m31434C2 == enumC24677b2 && !m61980a2) {
                    if (c43042iz03.m31434C() == enumC24677b2 && c43042iz03.f91837A >= 0 && c43042iz03.f91933z >= 0 && (c43042iz03.m31393X() == 8 || (c43042iz03.f91927w == 0 && c43042iz03.m31332x() == 0.0f))) {
                        if (!c43042iz03.m31361k0() && !c43042iz03.m31353n0() && z2 && !c43042iz03.m31361k0()) {
                            m61976e(i4, c43042iz0, interfaceC5930b, c43042iz03, z);
                        }
                    }
                } else if (!c43042iz03.m31350o0()) {
                    C37211Xy0 c37211Xy07 = c43042iz03.f91869Q;
                    if (next2 == c37211Xy07 && c43042iz03.f91873S.f44308f == null) {
                        int m75997f3 = c37211Xy07.m75997f() + m75998e2;
                        c43042iz03.m31419J0(m75997f3, c43042iz03.m31391Y() + m75997f3);
                        m61979b(i4, c43042iz03, interfaceC5930b, z);
                    } else {
                        C37211Xy0 c37211Xy08 = c43042iz03.f91873S;
                        if (next2 == c37211Xy08 && c37211Xy07.f44308f == null) {
                            int m75997f4 = m75998e2 - c37211Xy08.m75997f();
                            c43042iz03.m31419J0(m75997f4 - c43042iz03.m31391Y(), m75997f4);
                            m61979b(i4, c43042iz03, interfaceC5930b, z);
                        } else if (z2 && !c43042iz03.m31361k0()) {
                            m61977d(i4, interfaceC5930b, c43042iz03, z);
                        }
                    }
                }
            }
        }
        c43042iz0.m31341s0();
    }

    /* renamed from: c */
    public static void m61978c(int i, C1263Cy c1263Cy, C5928OE.InterfaceC5930b interfaceC5930b, int i2, boolean z) {
        if (c1263Cy.m111200x1()) {
            if (i2 == 0) {
                m61979b(i + 1, c1263Cy, interfaceC5930b, z);
            } else {
                m61972i(i + 1, c1263Cy, interfaceC5930b);
            }
        }
    }

    /* renamed from: d */
    public static void m61977d(int i, C5928OE.InterfaceC5930b interfaceC5930b, C43042iz0 c43042iz0, boolean z) {
        float f;
        float m31438A = c43042iz0.m31438A();
        int m75998e = c43042iz0.f91869Q.f44308f.m75998e();
        int m75998e2 = c43042iz0.f91873S.f44308f.m75998e();
        int m75997f = c43042iz0.f91869Q.m75997f() + m75998e;
        int m75997f2 = m75998e2 - c43042iz0.f91873S.m75997f();
        if (m75998e == m75998e2) {
            m31438A = 0.5f;
        } else {
            m75998e = m75997f;
            m75998e2 = m75997f2;
        }
        int m31391Y = c43042iz0.m31391Y();
        int i2 = (m75998e2 - m75998e) - m31391Y;
        if (m75998e > m75998e2) {
            i2 = (m75998e - m75998e2) - m31391Y;
        }
        if (i2 > 0) {
            f = (m31438A * i2) + 0.5f;
        } else {
            f = m31438A * i2;
        }
        int i3 = ((int) f) + m75998e;
        int i4 = i3 + m31391Y;
        if (m75998e > m75998e2) {
            i4 = i3 - m31391Y;
        }
        c43042iz0.m31419J0(i3, i4);
        m61979b(i + 1, c43042iz0, interfaceC5930b, z);
    }

    /* renamed from: e */
    public static void m61976e(int i, C43042iz0 c43042iz0, C5928OE.InterfaceC5930b interfaceC5930b, C43042iz0 c43042iz02, boolean z) {
        int m31391Y;
        float m31438A = c43042iz02.m31438A();
        int m75998e = c43042iz02.f91869Q.f44308f.m75998e() + c43042iz02.f91869Q.m75997f();
        int m75998e2 = c43042iz02.f91873S.f44308f.m75998e() - c43042iz02.f91873S.m75997f();
        if (m75998e2 >= m75998e) {
            int m31391Y2 = c43042iz02.m31391Y();
            if (c43042iz02.m31393X() != 8) {
                int i2 = c43042iz02.f91927w;
                if (i2 == 2) {
                    if (c43042iz0 instanceof C43635jz0) {
                        m31391Y = c43042iz0.m31391Y();
                    } else {
                        m31391Y = c43042iz0.m31414M().m31391Y();
                    }
                    m31391Y2 = (int) (c43042iz02.m31438A() * 0.5f * m31391Y);
                } else if (i2 == 0) {
                    m31391Y2 = m75998e2 - m75998e;
                }
                m31391Y2 = Math.max(c43042iz02.f91933z, m31391Y2);
                int i3 = c43042iz02.f91837A;
                if (i3 > 0) {
                    m31391Y2 = Math.min(i3, m31391Y2);
                }
            }
            int i4 = m75998e + ((int) ((m31438A * ((m75998e2 - m75998e) - m31391Y2)) + 0.5f));
            c43042iz02.m31419J0(i4, m31391Y2 + i4);
            m61979b(i + 1, c43042iz02, interfaceC5930b, z);
        }
    }

    /* renamed from: f */
    public static void m61975f(int i, C5928OE.InterfaceC5930b interfaceC5930b, C43042iz0 c43042iz0) {
        float f;
        float m31401T = c43042iz0.m31401T();
        int m75998e = c43042iz0.f91871R.f44308f.m75998e();
        int m75998e2 = c43042iz0.f91875T.f44308f.m75998e();
        int m75997f = c43042iz0.f91871R.m75997f() + m75998e;
        int m75997f2 = m75998e2 - c43042iz0.f91875T.m75997f();
        if (m75998e == m75998e2) {
            m31401T = 0.5f;
        } else {
            m75998e = m75997f;
            m75998e2 = m75997f2;
        }
        int m31328z = c43042iz0.m31328z();
        int i2 = (m75998e2 - m75998e) - m31328z;
        if (m75998e > m75998e2) {
            i2 = (m75998e - m75998e2) - m31328z;
        }
        if (i2 > 0) {
            f = (m31401T * i2) + 0.5f;
        } else {
            f = m31401T * i2;
        }
        int i3 = (int) f;
        int i4 = m75998e + i3;
        int i5 = i4 + m31328z;
        if (m75998e > m75998e2) {
            i4 = m75998e - i3;
            i5 = i4 - m31328z;
        }
        c43042iz0.m31413M0(i4, i5);
        m61972i(i + 1, c43042iz0, interfaceC5930b);
    }

    /* renamed from: g */
    public static void m61974g(int i, C43042iz0 c43042iz0, C5928OE.InterfaceC5930b interfaceC5930b, C43042iz0 c43042iz02) {
        int m31328z;
        float m31401T = c43042iz02.m31401T();
        int m75998e = c43042iz02.f91871R.f44308f.m75998e() + c43042iz02.f91871R.m75997f();
        int m75998e2 = c43042iz02.f91875T.f44308f.m75998e() - c43042iz02.f91875T.m75997f();
        if (m75998e2 >= m75998e) {
            int m31328z2 = c43042iz02.m31328z();
            if (c43042iz02.m31393X() != 8) {
                int i2 = c43042iz02.f91929x;
                if (i2 == 2) {
                    if (c43042iz0 instanceof C43635jz0) {
                        m31328z = c43042iz0.m31328z();
                    } else {
                        m31328z = c43042iz0.m31414M().m31328z();
                    }
                    m31328z2 = (int) (m31401T * 0.5f * m31328z);
                } else if (i2 == 0) {
                    m31328z2 = m75998e2 - m75998e;
                }
                m31328z2 = Math.max(c43042iz02.f91841C, m31328z2);
                int i3 = c43042iz02.f91843D;
                if (i3 > 0) {
                    m31328z2 = Math.min(i3, m31328z2);
                }
            }
            int i4 = m75998e + ((int) ((m31401T * ((m75998e2 - m75998e) - m31328z2)) + 0.5f));
            c43042iz02.m31413M0(i4, m31328z2 + i4);
            m61972i(i + 1, c43042iz02, interfaceC5930b);
        }
    }

    /* renamed from: h */
    public static void m61973h(C43635jz0 c43635jz0, C5928OE.InterfaceC5930b interfaceC5930b) {
        C43042iz0.EnumC24677b m31434C = c43635jz0.m31434C();
        C43042iz0.EnumC24677b m31397V = c43635jz0.m31397V();
        f60029b = 0;
        f60030c = 0;
        c43635jz0.m31329y0();
        ArrayList<C43042iz0> m61757v1 = c43635jz0.m61757v1();
        int size = m61757v1.size();
        for (int i = 0; i < size; i++) {
            m61757v1.get(i).m31329y0();
        }
        boolean m29540U1 = c43635jz0.m29540U1();
        if (m31434C == C43042iz0.EnumC24677b.FIXED) {
            c43635jz0.m31419J0(0, c43635jz0.m31391Y());
        } else {
            c43635jz0.m31417K0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C43042iz0 c43042iz0 = m61757v1.get(i2);
            if (c43042iz0 instanceof C50895wE1) {
                C50895wE1 c50895wE1 = (C50895wE1) c43042iz0;
                if (c50895wE1.m7196w1() == 1) {
                    if (c50895wE1.m7195x1() != -1) {
                        c50895wE1.m7209A1(c50895wE1.m7195x1());
                    } else if (c50895wE1.m7194y1() != -1 && c43635jz0.mo7201p0()) {
                        c50895wE1.m7209A1(c43635jz0.m31391Y() - c50895wE1.m7194y1());
                    } else if (c43635jz0.mo7201p0()) {
                        c50895wE1.m7209A1((int) ((c50895wE1.m7193z1() * c43635jz0.m31391Y()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((c43042iz0 instanceof C1263Cy) && ((C1263Cy) c43042iz0).m111205B1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C43042iz0 c43042iz02 = m61757v1.get(i3);
                if (c43042iz02 instanceof C50895wE1) {
                    C50895wE1 c50895wE12 = (C50895wE1) c43042iz02;
                    if (c50895wE12.m7196w1() == 1) {
                        m61979b(0, c50895wE12, interfaceC5930b, m29540U1);
                    }
                }
            }
        }
        m61979b(0, c43635jz0, interfaceC5930b, m29540U1);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                C43042iz0 c43042iz03 = m61757v1.get(i4);
                if (c43042iz03 instanceof C1263Cy) {
                    C1263Cy c1263Cy = (C1263Cy) c43042iz03;
                    if (c1263Cy.m111205B1() == 0) {
                        m61978c(0, c1263Cy, interfaceC5930b, 0, m29540U1);
                    }
                }
            }
        }
        if (m31397V == C43042iz0.EnumC24677b.FIXED) {
            c43635jz0.m31413M0(0, c43635jz0.m31328z());
        } else {
            c43635jz0.m31415L0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C43042iz0 c43042iz04 = m61757v1.get(i5);
            if (c43042iz04 instanceof C50895wE1) {
                C50895wE1 c50895wE13 = (C50895wE1) c43042iz04;
                if (c50895wE13.m7196w1() == 0) {
                    if (c50895wE13.m7195x1() != -1) {
                        c50895wE13.m7209A1(c50895wE13.m7195x1());
                    } else if (c50895wE13.m7194y1() != -1 && c43635jz0.mo7199q0()) {
                        c50895wE13.m7209A1(c43635jz0.m31328z() - c50895wE13.m7194y1());
                    } else if (c43635jz0.mo7199q0()) {
                        c50895wE13.m7209A1((int) ((c50895wE13.m7193z1() * c43635jz0.m31328z()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((c43042iz04 instanceof C1263Cy) && ((C1263Cy) c43042iz04).m111205B1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                C43042iz0 c43042iz05 = m61757v1.get(i6);
                if (c43042iz05 instanceof C50895wE1) {
                    C50895wE1 c50895wE14 = (C50895wE1) c43042iz05;
                    if (c50895wE14.m7196w1() == 0) {
                        m61972i(1, c50895wE14, interfaceC5930b);
                    }
                }
            }
        }
        m61972i(0, c43635jz0, interfaceC5930b);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                C43042iz0 c43042iz06 = m61757v1.get(i7);
                if (c43042iz06 instanceof C1263Cy) {
                    C1263Cy c1263Cy2 = (C1263Cy) c43042iz06;
                    if (c1263Cy2.m111205B1() == 1) {
                        m61978c(0, c1263Cy2, interfaceC5930b, 1, m29540U1);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            C43042iz0 c43042iz07 = m61757v1.get(i8);
            if (c43042iz07.m31350o0() && m61980a(0, c43042iz07)) {
                C43635jz0.m29537X1(0, c43042iz07, interfaceC5930b, f60028a, C5928OE.C5929a.f26236k);
                if (c43042iz07 instanceof C50895wE1) {
                    if (((C50895wE1) c43042iz07).m7196w1() == 0) {
                        m61972i(0, c43042iz07, interfaceC5930b);
                    } else {
                        m61979b(0, c43042iz07, interfaceC5930b, m29540U1);
                    }
                } else {
                    m61979b(0, c43042iz07, interfaceC5930b, m29540U1);
                    m61972i(0, c43042iz07, interfaceC5930b);
                }
            }
        }
    }

    /* renamed from: i */
    public static void m61972i(int i, C43042iz0 c43042iz0, C5928OE.InterfaceC5930b interfaceC5930b) {
        boolean z;
        C37211Xy0 c37211Xy0;
        C37211Xy0 c37211Xy02;
        boolean z2;
        C37211Xy0 c37211Xy03;
        C37211Xy0 c37211Xy04;
        if (c43042iz0.m31344r0()) {
            return;
        }
        f60030c++;
        if (!(c43042iz0 instanceof C43635jz0) && c43042iz0.m31350o0()) {
            int i2 = i + 1;
            if (m61980a(i2, c43042iz0)) {
                C43635jz0.m29537X1(i2, c43042iz0, interfaceC5930b, new C5928OE.C5929a(), C5928OE.C5929a.f26236k);
            }
        }
        C37211Xy0 mo7200q = c43042iz0.mo7200q(C37211Xy0.EnumC9561b.TOP);
        C37211Xy0 mo7200q2 = c43042iz0.mo7200q(C37211Xy0.EnumC9561b.BOTTOM);
        int m75998e = mo7200q.m75998e();
        int m75998e2 = mo7200q2.m75998e();
        if (mo7200q.m75999d() != null && mo7200q.m75989n()) {
            Iterator<C37211Xy0> it = mo7200q.m75999d().iterator();
            while (it.hasNext()) {
                C37211Xy0 next = it.next();
                C43042iz0 c43042iz02 = next.f44306d;
                int i3 = i + 1;
                boolean m61980a = m61980a(i3, c43042iz02);
                if (c43042iz02.m31350o0() && m61980a) {
                    C43635jz0.m29537X1(i3, c43042iz02, interfaceC5930b, new C5928OE.C5929a(), C5928OE.C5929a.f26236k);
                }
                if ((next == c43042iz02.f91871R && (c37211Xy04 = c43042iz02.f91875T.f44308f) != null && c37211Xy04.m75989n()) || (next == c43042iz02.f91875T && (c37211Xy03 = c43042iz02.f91871R.f44308f) != null && c37211Xy03.m75989n())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C43042iz0.EnumC24677b m31397V = c43042iz02.m31397V();
                C43042iz0.EnumC24677b enumC24677b = C43042iz0.EnumC24677b.MATCH_CONSTRAINT;
                if (m31397V == enumC24677b && !m61980a) {
                    if (c43042iz02.m31397V() == enumC24677b && c43042iz02.f91843D >= 0 && c43042iz02.f91841C >= 0 && (c43042iz02.m31393X() == 8 || (c43042iz02.f91929x == 0 && c43042iz02.m31332x() == 0.0f))) {
                        if (!c43042iz02.m31355m0() && !c43042iz02.m31353n0() && z2 && !c43042iz02.m31355m0()) {
                            m61974g(i3, c43042iz0, interfaceC5930b, c43042iz02);
                        }
                    }
                } else if (!c43042iz02.m31350o0()) {
                    C37211Xy0 c37211Xy05 = c43042iz02.f91871R;
                    if (next == c37211Xy05 && c43042iz02.f91875T.f44308f == null) {
                        int m75997f = c37211Xy05.m75997f() + m75998e;
                        c43042iz02.m31413M0(m75997f, c43042iz02.m31328z() + m75997f);
                        m61972i(i3, c43042iz02, interfaceC5930b);
                    } else {
                        C37211Xy0 c37211Xy06 = c43042iz02.f91875T;
                        if (next == c37211Xy06 && c37211Xy05.f44308f == null) {
                            int m75997f2 = m75998e - c37211Xy06.m75997f();
                            c43042iz02.m31413M0(m75997f2 - c43042iz02.m31328z(), m75997f2);
                            m61972i(i3, c43042iz02, interfaceC5930b);
                        } else if (z2 && !c43042iz02.m31355m0()) {
                            m61975f(i3, interfaceC5930b, c43042iz02);
                        }
                    }
                }
            }
        }
        if (c43042iz0 instanceof C50895wE1) {
            return;
        }
        if (mo7200q2.m75999d() != null && mo7200q2.m75989n()) {
            Iterator<C37211Xy0> it2 = mo7200q2.m75999d().iterator();
            while (it2.hasNext()) {
                C37211Xy0 next2 = it2.next();
                C43042iz0 c43042iz03 = next2.f44306d;
                int i4 = i + 1;
                boolean m61980a2 = m61980a(i4, c43042iz03);
                if (c43042iz03.m31350o0() && m61980a2) {
                    C43635jz0.m29537X1(i4, c43042iz03, interfaceC5930b, new C5928OE.C5929a(), C5928OE.C5929a.f26236k);
                }
                if ((next2 == c43042iz03.f91871R && (c37211Xy02 = c43042iz03.f91875T.f44308f) != null && c37211Xy02.m75989n()) || (next2 == c43042iz03.f91875T && (c37211Xy0 = c43042iz03.f91871R.f44308f) != null && c37211Xy0.m75989n())) {
                    z = true;
                } else {
                    z = false;
                }
                C43042iz0.EnumC24677b m31397V2 = c43042iz03.m31397V();
                C43042iz0.EnumC24677b enumC24677b2 = C43042iz0.EnumC24677b.MATCH_CONSTRAINT;
                if (m31397V2 == enumC24677b2 && !m61980a2) {
                    if (c43042iz03.m31397V() == enumC24677b2 && c43042iz03.f91843D >= 0 && c43042iz03.f91841C >= 0 && (c43042iz03.m31393X() == 8 || (c43042iz03.f91929x == 0 && c43042iz03.m31332x() == 0.0f))) {
                        if (!c43042iz03.m31355m0() && !c43042iz03.m31353n0() && z && !c43042iz03.m31355m0()) {
                            m61974g(i4, c43042iz0, interfaceC5930b, c43042iz03);
                        }
                    }
                } else if (!c43042iz03.m31350o0()) {
                    C37211Xy0 c37211Xy07 = c43042iz03.f91871R;
                    if (next2 == c37211Xy07 && c43042iz03.f91875T.f44308f == null) {
                        int m75997f3 = c37211Xy07.m75997f() + m75998e2;
                        c43042iz03.m31413M0(m75997f3, c43042iz03.m31328z() + m75997f3);
                        m61972i(i4, c43042iz03, interfaceC5930b);
                    } else {
                        C37211Xy0 c37211Xy08 = c43042iz03.f91875T;
                        if (next2 == c37211Xy08 && c37211Xy07.f44308f == null) {
                            int m75997f4 = m75998e2 - c37211Xy08.m75997f();
                            c43042iz03.m31413M0(m75997f4 - c43042iz03.m31328z(), m75997f4);
                            m61972i(i4, c43042iz03, interfaceC5930b);
                        } else if (z && !c43042iz03.m31355m0()) {
                            m61975f(i4, interfaceC5930b, c43042iz03);
                        }
                    }
                }
            }
        }
        C37211Xy0 mo7200q3 = c43042iz0.mo7200q(C37211Xy0.EnumC9561b.BASELINE);
        if (mo7200q3.m75999d() != null && mo7200q3.m75989n()) {
            int m75998e3 = mo7200q3.m75998e();
            Iterator<C37211Xy0> it3 = mo7200q3.m75999d().iterator();
            while (it3.hasNext()) {
                C37211Xy0 next3 = it3.next();
                C43042iz0 c43042iz04 = next3.f44306d;
                int i5 = i + 1;
                boolean m61980a3 = m61980a(i5, c43042iz04);
                if (c43042iz04.m31350o0() && m61980a3) {
                    C43635jz0.m29537X1(i5, c43042iz04, interfaceC5930b, new C5928OE.C5929a(), C5928OE.C5929a.f26236k);
                }
                if (c43042iz04.m31397V() != C43042iz0.EnumC24677b.MATCH_CONSTRAINT || m61980a3) {
                    if (!c43042iz04.m31350o0() && next3 == c43042iz04.f91877U) {
                        c43042iz04.m31421I0(next3.m75997f() + m75998e3);
                        m61972i(i5, c43042iz04, interfaceC5930b);
                    }
                }
            }
        }
        c43042iz0.m31338t0();
    }
}
