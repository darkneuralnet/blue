package p000;

import java.util.ArrayList;
import p000.C37211Xy0;
import p000.C43042iz0;
/* renamed from: OE */
/* loaded from: classes.dex */
public class C5928OE {

    /* renamed from: a */
    public final ArrayList<C43042iz0> f26233a = new ArrayList<>();

    /* renamed from: b */
    public C5929a f26234b = new C5929a();

    /* renamed from: c */
    public C43635jz0 f26235c;

    /* renamed from: OE$a */
    /* loaded from: classes.dex */
    public static class C5929a {

        /* renamed from: k */
        public static int f26236k = 0;

        /* renamed from: l */
        public static int f26237l = 1;

        /* renamed from: m */
        public static int f26238m = 2;

        /* renamed from: a */
        public C43042iz0.EnumC24677b f26239a;

        /* renamed from: b */
        public C43042iz0.EnumC24677b f26240b;

        /* renamed from: c */
        public int f26241c;

        /* renamed from: d */
        public int f26242d;

        /* renamed from: e */
        public int f26243e;

        /* renamed from: f */
        public int f26244f;

        /* renamed from: g */
        public int f26245g;

        /* renamed from: h */
        public boolean f26246h;

        /* renamed from: i */
        public boolean f26247i;

        /* renamed from: j */
        public int f26248j;
    }

    /* renamed from: OE$b */
    /* loaded from: classes.dex */
    public interface InterfaceC5930b {
        /* renamed from: a */
        void mo67878a();

        /* renamed from: b */
        void mo67877b(C43042iz0 c43042iz0, C5929a c5929a);
    }

    public C5928OE(C43635jz0 c43635jz0) {
        this.f26235c = c43635jz0;
    }

    /* renamed from: a */
    public final boolean m92606a(InterfaceC5930b interfaceC5930b, C43042iz0 c43042iz0, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f26234b.f26239a = c43042iz0.m31434C();
        this.f26234b.f26240b = c43042iz0.m31397V();
        this.f26234b.f26241c = c43042iz0.m31391Y();
        this.f26234b.f26242d = c43042iz0.m31328z();
        C5929a c5929a = this.f26234b;
        c5929a.f26247i = false;
        c5929a.f26248j = i;
        C43042iz0.EnumC24677b enumC24677b = c5929a.f26239a;
        C43042iz0.EnumC24677b enumC24677b2 = C43042iz0.EnumC24677b.MATCH_CONSTRAINT;
        if (enumC24677b == enumC24677b2) {
            z = true;
        } else {
            z = false;
        }
        if (c5929a.f26240b == enumC24677b2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && c43042iz0.f91894f0 > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && c43042iz0.f91894f0 > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && c43042iz0.f91931y[0] == 4) {
            c5929a.f26239a = C43042iz0.EnumC24677b.FIXED;
        }
        if (z4 && c43042iz0.f91931y[1] == 4) {
            c5929a.f26240b = C43042iz0.EnumC24677b.FIXED;
        }
        interfaceC5930b.mo67877b(c43042iz0, c5929a);
        c43042iz0.m31349o1(this.f26234b.f26243e);
        c43042iz0.m31407P0(this.f26234b.f26244f);
        c43042iz0.m31409O0(this.f26234b.f26246h);
        c43042iz0.m31429E0(this.f26234b.f26245g);
        C5929a c5929a2 = this.f26234b;
        c5929a2.f26248j = C5929a.f26236k;
        return c5929a2.f26247i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
        if (r8 != r9) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0095, code lost:
        if (r5.f91894f0 <= 0.0f) goto L58;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m92605b(C43635jz0 c43635jz0) {
        boolean z;
        C40304eN1 c40304eN1;
        C34085Ko6 c34085Ko6;
        int size = c43635jz0.f60262V0.size();
        boolean m29536Y1 = c43635jz0.m29536Y1(64);
        InterfaceC5930b m29548N1 = c43635jz0.m29548N1();
        for (int i = 0; i < size; i++) {
            C43042iz0 c43042iz0 = c43635jz0.f60262V0.get(i);
            if (!(c43042iz0 instanceof C50895wE1) && !(c43042iz0 instanceof C1263Cy) && !c43042iz0.m31353n0() && (!m29536Y1 || (c40304eN1 = c43042iz0.f91891e) == null || (c34085Ko6 = c43042iz0.f91893f) == null || !c40304eN1.f81753e.f102910j || !c34085Ko6.f81753e.f102910j)) {
                C43042iz0.EnumC24677b m31334w = c43042iz0.m31334w(0);
                boolean z2 = true;
                C43042iz0.EnumC24677b m31334w2 = c43042iz0.m31334w(1);
                C43042iz0.EnumC24677b enumC24677b = C43042iz0.EnumC24677b.MATCH_CONSTRAINT;
                if (m31334w == enumC24677b && c43042iz0.f91927w != 1 && m31334w2 == enumC24677b && c43042iz0.f91929x != 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && c43635jz0.m29536Y1(1) && !(c43042iz0 instanceof C53077zu6)) {
                    if (m31334w == enumC24677b && c43042iz0.f91927w == 0 && m31334w2 != enumC24677b && !c43042iz0.m31361k0()) {
                        z = true;
                    }
                    if (m31334w2 == enumC24677b && c43042iz0.f91929x == 0 && m31334w != enumC24677b && !c43042iz0.m31361k0()) {
                        z = true;
                    }
                    if (m31334w != enumC24677b) {
                    }
                }
                z2 = z;
                if (!z2) {
                    m92606a(m29548N1, c43042iz0, C5929a.f26236k);
                    C38572bU2 c38572bU2 = c43635jz0.f93671b1;
                    if (c38572bU2 != null) {
                        c38572bU2.f57532a++;
                    }
                }
            }
        }
        m29548N1.mo67878a();
    }

    /* renamed from: c */
    public final void m92604c(C43635jz0 c43635jz0, String str, int i, int i2, int i3) {
        int m31418K = c43635jz0.m31418K();
        int m31420J = c43635jz0.m31420J();
        c43635jz0.m31376e1(0);
        c43635jz0.m31379d1(0);
        c43635jz0.m31349o1(i2);
        c43635jz0.m31407P0(i3);
        c43635jz0.m31376e1(m31418K);
        c43635jz0.m31379d1(m31420J);
        this.f26235c.m29532c2(i);
        this.f26235c.mo29526w1();
    }

    /* renamed from: d */
    public long m92603d(C43635jz0 c43635jz0, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        boolean z2;
        boolean z3;
        int i10;
        int i11;
        boolean z4;
        boolean z5;
        boolean z6;
        int i12;
        InterfaceC5930b interfaceC5930b;
        int i13;
        int i14;
        int i15;
        boolean z7;
        boolean z8;
        boolean z9;
        C38572bU2 c38572bU2;
        boolean z10;
        boolean z11;
        boolean z12;
        InterfaceC5930b m29548N1 = c43635jz0.m29548N1();
        int size = c43635jz0.f60262V0.size();
        int m31391Y = c43635jz0.m31391Y();
        int m31328z = c43635jz0.m31328z();
        boolean m35434b = C42442hy3.m35434b(i, 128);
        if (!m35434b && !C42442hy3.m35434b(i, 64)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            for (int i16 = 0; i16 < size; i16++) {
                C43042iz0 c43042iz0 = c43635jz0.f60262V0.get(i16);
                C43042iz0.EnumC24677b m31434C = c43042iz0.m31434C();
                C43042iz0.EnumC24677b enumC24677b = C43042iz0.EnumC24677b.MATCH_CONSTRAINT;
                if (m31434C == enumC24677b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c43042iz0.m31397V() == enumC24677b) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 && z11 && c43042iz0.m31332x() > 0.0f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((c43042iz0.m31361k0() && z12) || ((c43042iz0.m31355m0() && z12) || (c43042iz0 instanceof C53077zu6) || c43042iz0.m31361k0() || c43042iz0.m31355m0())) {
                    z = false;
                    break;
                }
            }
        }
        if (z && (c38572bU2 = C34342Lr2.f22126x) != null) {
            c38572bU2.f57534c++;
        }
        if ((i4 == 1073741824 && i6 == 1073741824) || m35434b) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z13 = z & z2;
        int i17 = 2;
        if (z13) {
            int min = Math.min(c43635jz0.m31422I(), i5);
            int min2 = Math.min(c43635jz0.m31424H(), i7);
            if (i4 == 1073741824 && c43635jz0.m31391Y() != min) {
                c43635jz0.m31349o1(min);
                c43635jz0.m29543R1();
            }
            if (i6 == 1073741824 && c43635jz0.m31328z() != min2) {
                c43635jz0.m31407P0(min2);
                c43635jz0.m29543R1();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z3 = c43635jz0.m29552J1(m35434b);
                i10 = 2;
            } else {
                boolean m29551K1 = c43635jz0.m29551K1(m35434b);
                if (i4 == 1073741824) {
                    m29551K1 &= c43635jz0.m29550L1(m35434b, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    z3 = c43635jz0.m29550L1(m35434b, 1) & m29551K1;
                    i10++;
                } else {
                    z3 = m29551K1;
                }
            }
            if (z3) {
                if (i4 == 1073741824) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (i6 == 1073741824) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                c43635jz0.mo29528t1(z8, z9);
            }
        } else {
            z3 = false;
            i10 = 0;
        }
        if (!z3 || i10 != 2) {
            int m29547O1 = c43635jz0.m29547O1();
            if (size > 0) {
                m92605b(c43635jz0);
            }
            m92602e(c43635jz0);
            int size2 = this.f26233a.size();
            if (size > 0) {
                m92604c(c43635jz0, "First pass", 0, m31391Y, m31328z);
            }
            if (size2 > 0) {
                C43042iz0.EnumC24677b m31434C2 = c43635jz0.m31434C();
                C43042iz0.EnumC24677b enumC24677b2 = C43042iz0.EnumC24677b.WRAP_CONTENT;
                if (m31434C2 == enumC24677b2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c43635jz0.m31397V() == enumC24677b2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int max = Math.max(c43635jz0.m31391Y(), this.f26235c.m31418K());
                int max2 = Math.max(c43635jz0.m31328z(), this.f26235c.m31420J());
                int i18 = 0;
                boolean z14 = false;
                while (i18 < size2) {
                    C43042iz0 c43042iz02 = this.f26233a.get(i18);
                    if (!(c43042iz02 instanceof C53077zu6)) {
                        i13 = m29547O1;
                        i15 = m31391Y;
                        i14 = m31328z;
                    } else {
                        int m31391Y2 = c43042iz02.m31391Y();
                        i13 = m29547O1;
                        int m31328z2 = c43042iz02.m31328z();
                        i14 = m31328z;
                        boolean m92606a = m92606a(m29548N1, c43042iz02, C5929a.f26237l) | z14;
                        C38572bU2 c38572bU22 = c43635jz0.f93671b1;
                        i15 = m31391Y;
                        if (c38572bU22 != null) {
                            c38572bU22.f57533b++;
                        }
                        int m31391Y3 = c43042iz02.m31391Y();
                        int m31328z3 = c43042iz02.m31328z();
                        if (m31391Y3 != m31391Y2) {
                            c43042iz02.m31349o1(m31391Y3);
                            if (z4 && c43042iz02.m31410O() > max) {
                                max = Math.max(max, c43042iz02.m31410O() + c43042iz02.mo7200q(C37211Xy0.EnumC9561b.RIGHT).m75997f());
                            }
                            z7 = true;
                        } else {
                            z7 = m92606a;
                        }
                        if (m31328z3 != m31328z2) {
                            c43042iz02.m31407P0(m31328z3);
                            if (z5 && c43042iz02.m31339t() > max2) {
                                max2 = Math.max(max2, c43042iz02.m31339t() + c43042iz02.mo7200q(C37211Xy0.EnumC9561b.BOTTOM).m75997f());
                            }
                            z7 = true;
                        }
                        z14 = z7 | ((C53077zu6) c43042iz02).m132J1();
                    }
                    i18++;
                    m29547O1 = i13;
                    m31328z = i14;
                    m31391Y = i15;
                    i17 = 2;
                }
                int i19 = m29547O1;
                int i20 = m31391Y;
                int i21 = m31328z;
                int i22 = i17;
                int i23 = 0;
                while (i23 < i22) {
                    int i24 = 0;
                    while (i24 < size2) {
                        C43042iz0 c43042iz03 = this.f26233a.get(i24);
                        if (((c43042iz03 instanceof HL1) && !(c43042iz03 instanceof C53077zu6)) || (c43042iz03 instanceof C50895wE1) || c43042iz03.m31393X() == 8 || ((z13 && c43042iz03.f91891e.f81753e.f102910j && c43042iz03.f91893f.f81753e.f102910j) || (c43042iz03 instanceof C53077zu6))) {
                            z6 = z13;
                            i12 = size2;
                            interfaceC5930b = m29548N1;
                        } else {
                            int m31391Y4 = c43042iz03.m31391Y();
                            int m31328z4 = c43042iz03.m31328z();
                            int m31345r = c43042iz03.m31345r();
                            int i25 = C5929a.f26237l;
                            z6 = z13;
                            if (i23 == 1) {
                                i25 = C5929a.f26238m;
                            }
                            boolean m92606a2 = m92606a(m29548N1, c43042iz03, i25) | z14;
                            C38572bU2 c38572bU23 = c43635jz0.f93671b1;
                            i12 = size2;
                            interfaceC5930b = m29548N1;
                            if (c38572bU23 != null) {
                                c38572bU23.f57533b++;
                            }
                            int m31391Y5 = c43042iz03.m31391Y();
                            int m31328z5 = c43042iz03.m31328z();
                            if (m31391Y5 != m31391Y4) {
                                c43042iz03.m31349o1(m31391Y5);
                                if (z4 && c43042iz03.m31410O() > max) {
                                    max = Math.max(max, c43042iz03.m31410O() + c43042iz03.mo7200q(C37211Xy0.EnumC9561b.RIGHT).m75997f());
                                }
                                m92606a2 = true;
                            }
                            if (m31328z5 != m31328z4) {
                                c43042iz03.m31407P0(m31328z5);
                                if (z5 && c43042iz03.m31339t() > max2) {
                                    max2 = Math.max(max2, c43042iz03.m31339t() + c43042iz03.mo7200q(C37211Xy0.EnumC9561b.BOTTOM).m75997f());
                                }
                                m92606a2 = true;
                            }
                            if (c43042iz03.m31385b0() && m31345r != c43042iz03.m31345r()) {
                                z14 = true;
                            } else {
                                z14 = m92606a2;
                            }
                        }
                        i24++;
                        m29548N1 = interfaceC5930b;
                        z13 = z6;
                        size2 = i12;
                    }
                    boolean z15 = z13;
                    int i26 = size2;
                    InterfaceC5930b interfaceC5930b2 = m29548N1;
                    if (!z14) {
                        break;
                    }
                    i23++;
                    m92604c(c43635jz0, "intermediate pass", i23, i20, i21);
                    m29548N1 = interfaceC5930b2;
                    z13 = z15;
                    size2 = i26;
                    i22 = 2;
                    z14 = false;
                }
                i11 = i19;
            } else {
                i11 = m29547O1;
            }
            c43635jz0.m29533b2(i11);
            return 0L;
        }
        return 0L;
    }

    /* renamed from: e */
    public void m92602e(C43635jz0 c43635jz0) {
        this.f26233a.clear();
        int size = c43635jz0.f60262V0.size();
        for (int i = 0; i < size; i++) {
            C43042iz0 c43042iz0 = c43635jz0.f60262V0.get(i);
            C43042iz0.EnumC24677b m31434C = c43042iz0.m31434C();
            C43042iz0.EnumC24677b enumC24677b = C43042iz0.EnumC24677b.MATCH_CONSTRAINT;
            if (m31434C == enumC24677b || c43042iz0.m31397V() == enumC24677b) {
                this.f26233a.add(c43042iz0);
            }
        }
        c43635jz0.m29543R1();
    }
}
