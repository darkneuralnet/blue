package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p000.C43042iz0;
/* renamed from: Du1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C32496Du1 extends C53077zu6 {

    /* renamed from: H1 */
    public C43042iz0[] f6518H1;

    /* renamed from: k1 */
    public int f6520k1 = -1;

    /* renamed from: l1 */
    public int f6521l1 = -1;

    /* renamed from: m1 */
    public int f6522m1 = -1;

    /* renamed from: n1 */
    public int f6523n1 = -1;

    /* renamed from: o1 */
    public int f6524o1 = -1;

    /* renamed from: p1 */
    public int f6525p1 = -1;

    /* renamed from: q1 */
    public float f6526q1 = 0.5f;

    /* renamed from: r1 */
    public float f6527r1 = 0.5f;

    /* renamed from: s1 */
    public float f6528s1 = 0.5f;

    /* renamed from: t1 */
    public float f6529t1 = 0.5f;

    /* renamed from: u1 */
    public float f6530u1 = 0.5f;

    /* renamed from: v1 */
    public float f6531v1 = 0.5f;

    /* renamed from: w1 */
    public int f6532w1 = 0;

    /* renamed from: x1 */
    public int f6533x1 = 0;

    /* renamed from: y1 */
    public int f6534y1 = 2;

    /* renamed from: z1 */
    public int f6535z1 = 2;

    /* renamed from: A1 */
    public int f6511A1 = 0;

    /* renamed from: B1 */
    public int f6512B1 = -1;

    /* renamed from: C1 */
    public int f6513C1 = 0;

    /* renamed from: D1 */
    public ArrayList<C1637a> f6514D1 = new ArrayList<>();

    /* renamed from: E1 */
    public C43042iz0[] f6515E1 = null;

    /* renamed from: F1 */
    public C43042iz0[] f6516F1 = null;

    /* renamed from: G1 */
    public int[] f6517G1 = null;

    /* renamed from: I1 */
    public int f6519I1 = 0;

    /* renamed from: Du1$a */
    /* loaded from: classes.dex */
    public class C1637a {

        /* renamed from: a */
        public int f6536a;

        /* renamed from: d */
        public C37211Xy0 f6539d;

        /* renamed from: e */
        public C37211Xy0 f6540e;

        /* renamed from: f */
        public C37211Xy0 f6541f;

        /* renamed from: g */
        public C37211Xy0 f6542g;

        /* renamed from: h */
        public int f6543h;

        /* renamed from: i */
        public int f6544i;

        /* renamed from: j */
        public int f6545j;

        /* renamed from: k */
        public int f6546k;

        /* renamed from: q */
        public int f6552q;

        /* renamed from: b */
        public C43042iz0 f6537b = null;

        /* renamed from: c */
        public int f6538c = 0;

        /* renamed from: l */
        public int f6547l = 0;

        /* renamed from: m */
        public int f6548m = 0;

        /* renamed from: n */
        public int f6549n = 0;

        /* renamed from: o */
        public int f6550o = 0;

        /* renamed from: p */
        public int f6551p = 0;

        public C1637a(int i, C37211Xy0 c37211Xy0, C37211Xy0 c37211Xy02, C37211Xy0 c37211Xy03, C37211Xy0 c37211Xy04, int i2) {
            this.f6543h = 0;
            this.f6544i = 0;
            this.f6545j = 0;
            this.f6546k = 0;
            this.f6552q = 0;
            this.f6536a = i;
            this.f6539d = c37211Xy0;
            this.f6540e = c37211Xy02;
            this.f6541f = c37211Xy03;
            this.f6542g = c37211Xy04;
            this.f6543h = C32496Du1.this.m138D1();
            this.f6544i = C32496Du1.this.m136F1();
            this.f6545j = C32496Du1.this.m137E1();
            this.f6546k = C32496Du1.this.m139C1();
            this.f6552q = i2;
        }

        /* renamed from: b */
        public void m109725b(C43042iz0 c43042iz0) {
            int i = 0;
            if (this.f6536a == 0) {
                int m109737p2 = C32496Du1.this.m109737p2(c43042iz0, this.f6552q);
                if (c43042iz0.m31434C() == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
                    this.f6551p++;
                    m109737p2 = 0;
                }
                int i2 = C32496Du1.this.f6532w1;
                if (c43042iz0.m31393X() != 8) {
                    i = i2;
                }
                this.f6547l += m109737p2 + i;
                int m109738o2 = C32496Du1.this.m109738o2(c43042iz0, this.f6552q);
                if (this.f6537b == null || this.f6538c < m109738o2) {
                    this.f6537b = c43042iz0;
                    this.f6538c = m109738o2;
                    this.f6548m = m109738o2;
                }
            } else {
                int m109737p22 = C32496Du1.this.m109737p2(c43042iz0, this.f6552q);
                int m109738o22 = C32496Du1.this.m109738o2(c43042iz0, this.f6552q);
                if (c43042iz0.m31397V() == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
                    this.f6551p++;
                    m109738o22 = 0;
                }
                int i3 = C32496Du1.this.f6533x1;
                if (c43042iz0.m31393X() != 8) {
                    i = i3;
                }
                this.f6548m += m109738o22 + i;
                if (this.f6537b == null || this.f6538c < m109737p22) {
                    this.f6537b = c43042iz0;
                    this.f6538c = m109737p22;
                    this.f6547l = m109737p22;
                }
            }
            this.f6550o++;
        }

        /* renamed from: c */
        public void m109724c() {
            this.f6538c = 0;
            this.f6537b = null;
            this.f6547l = 0;
            this.f6548m = 0;
            this.f6549n = 0;
            this.f6550o = 0;
            this.f6551p = 0;
        }

        /* renamed from: d */
        public void m109723d(boolean z, int i, boolean z2) {
            C43042iz0 c43042iz0;
            char c;
            float f;
            float f2;
            int i2 = this.f6550o;
            for (int i3 = 0; i3 < i2 && this.f6549n + i3 < C32496Du1.this.f6519I1; i3++) {
                C43042iz0 c43042iz02 = C32496Du1.this.f6518H1[this.f6549n + i3];
                if (c43042iz02 != null) {
                    c43042iz02.m31331x0();
                }
            }
            if (i2 == 0 || this.f6537b == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = z ? (i2 - 1) - i6 : i6;
                if (this.f6549n + i7 >= C32496Du1.this.f6519I1) {
                    break;
                }
                C43042iz0 c43042iz03 = C32496Du1.this.f6518H1[this.f6549n + i7];
                if (c43042iz03 != null && c43042iz03.m31393X() == 0) {
                    if (i4 == -1) {
                        i4 = i6;
                    }
                    i5 = i6;
                }
            }
            C43042iz0 c43042iz04 = null;
            if (this.f6536a == 0) {
                C43042iz0 c43042iz05 = this.f6537b;
                c43042iz05.m31366i1(C32496Du1.this.f6521l1);
                int i8 = this.f6544i;
                if (i > 0) {
                    i8 += C32496Du1.this.f6533x1;
                }
                c43042iz05.f91871R.m76002a(this.f6540e, i8);
                if (z2) {
                    c43042iz05.f91875T.m76002a(this.f6542g, this.f6546k);
                }
                if (i > 0) {
                    this.f6540e.f44306d.f91875T.m76002a(c43042iz05.f91871R, 0);
                }
                char c2 = 3;
                if (C32496Du1.this.f6535z1 == 3 && !c43042iz05.m31385b0()) {
                    for (int i9 = 0; i9 < i2; i9++) {
                        int i10 = z ? (i2 - 1) - i9 : i9;
                        if (this.f6549n + i10 >= C32496Du1.this.f6519I1) {
                            break;
                        }
                        c43042iz0 = C32496Du1.this.f6518H1[this.f6549n + i10];
                        if (c43042iz0.m31385b0()) {
                            break;
                        }
                    }
                }
                c43042iz0 = c43042iz05;
                int i11 = 0;
                while (i11 < i2) {
                    int i12 = z ? (i2 - 1) - i11 : i11;
                    if (this.f6549n + i12 >= C32496Du1.this.f6519I1) {
                        return;
                    }
                    C43042iz0 c43042iz06 = C32496Du1.this.f6518H1[this.f6549n + i12];
                    if (c43042iz06 == null) {
                        c43042iz06 = c43042iz04;
                        c = c2;
                    } else {
                        if (i11 == 0) {
                            c43042iz06.m31359l(c43042iz06.f91869Q, this.f6539d, this.f6543h);
                        }
                        if (i12 == 0) {
                            int i13 = C32496Du1.this.f6520k1;
                            float f3 = C32496Du1.this.f6526q1;
                            if (z) {
                                f3 = 1.0f - f3;
                            }
                            if (this.f6549n == 0 && C32496Du1.this.f6522m1 != -1) {
                                i13 = C32496Du1.this.f6522m1;
                                if (z) {
                                    f2 = C32496Du1.this.f6528s1;
                                    f = 1.0f - f2;
                                    f3 = f;
                                } else {
                                    f = C32496Du1.this.f6528s1;
                                    f3 = f;
                                }
                            } else if (z2 && C32496Du1.this.f6524o1 != -1) {
                                i13 = C32496Du1.this.f6524o1;
                                if (z) {
                                    f2 = C32496Du1.this.f6530u1;
                                    f = 1.0f - f2;
                                    f3 = f;
                                } else {
                                    f = C32496Du1.this.f6530u1;
                                    f3 = f;
                                }
                            }
                            c43042iz06.m31404R0(i13);
                            c43042iz06.m31406Q0(f3);
                        }
                        if (i11 == i2 - 1) {
                            c43042iz06.m31359l(c43042iz06.f91873S, this.f6541f, this.f6545j);
                        }
                        if (c43042iz04 != null) {
                            c43042iz06.f91869Q.m76002a(c43042iz04.f91873S, C32496Du1.this.f6532w1);
                            if (i11 == i4) {
                                c43042iz06.f91869Q.m75982u(this.f6543h);
                            }
                            c43042iz04.f91873S.m76002a(c43042iz06.f91869Q, 0);
                            if (i11 == i5 + 1) {
                                c43042iz04.f91873S.m75982u(this.f6545j);
                            }
                        }
                        if (c43042iz06 != c43042iz05) {
                            c = 3;
                            if (C32496Du1.this.f6535z1 == 3 && c43042iz0.m31385b0() && c43042iz06 != c43042iz0 && c43042iz06.m31385b0()) {
                                c43042iz06.f91877U.m76002a(c43042iz0.f91877U, 0);
                            } else {
                                int i14 = C32496Du1.this.f6535z1;
                                if (i14 == 0) {
                                    c43042iz06.f91871R.m76002a(c43042iz05.f91871R, 0);
                                } else if (i14 == 1) {
                                    c43042iz06.f91875T.m76002a(c43042iz05.f91875T, 0);
                                } else if (z3) {
                                    c43042iz06.f91871R.m76002a(this.f6540e, this.f6544i);
                                    c43042iz06.f91875T.m76002a(this.f6542g, this.f6546k);
                                } else {
                                    c43042iz06.f91871R.m76002a(c43042iz05.f91871R, 0);
                                    c43042iz06.f91875T.m76002a(c43042iz05.f91875T, 0);
                                }
                            }
                        } else {
                            c = 3;
                        }
                    }
                    i11++;
                    c2 = c;
                    c43042iz04 = c43042iz06;
                }
                return;
            }
            C43042iz0 c43042iz07 = this.f6537b;
            c43042iz07.m31404R0(C32496Du1.this.f6520k1);
            int i15 = this.f6543h;
            if (i > 0) {
                i15 += C32496Du1.this.f6532w1;
            }
            if (z) {
                c43042iz07.f91873S.m76002a(this.f6541f, i15);
                if (z2) {
                    c43042iz07.f91869Q.m76002a(this.f6539d, this.f6545j);
                }
                if (i > 0) {
                    this.f6541f.f44306d.f91869Q.m76002a(c43042iz07.f91873S, 0);
                }
            } else {
                c43042iz07.f91869Q.m76002a(this.f6539d, i15);
                if (z2) {
                    c43042iz07.f91873S.m76002a(this.f6541f, this.f6545j);
                }
                if (i > 0) {
                    this.f6539d.f44306d.f91873S.m76002a(c43042iz07.f91869Q, 0);
                }
            }
            for (int i16 = 0; i16 < i2 && this.f6549n + i16 < C32496Du1.this.f6519I1; i16++) {
                C43042iz0 c43042iz08 = C32496Du1.this.f6518H1[this.f6549n + i16];
                if (c43042iz08 != null) {
                    if (i16 == 0) {
                        c43042iz08.m31359l(c43042iz08.f91871R, this.f6540e, this.f6544i);
                        int i17 = C32496Du1.this.f6521l1;
                        float f4 = C32496Du1.this.f6527r1;
                        if (this.f6549n == 0 && C32496Du1.this.f6523n1 != -1) {
                            i17 = C32496Du1.this.f6523n1;
                            f4 = C32496Du1.this.f6529t1;
                        } else if (z2 && C32496Du1.this.f6525p1 != -1) {
                            i17 = C32496Du1.this.f6525p1;
                            f4 = C32496Du1.this.f6531v1;
                        }
                        c43042iz08.m31366i1(i17);
                        c43042iz08.m31369h1(f4);
                    }
                    if (i16 == i2 - 1) {
                        c43042iz08.m31359l(c43042iz08.f91875T, this.f6542g, this.f6546k);
                    }
                    if (c43042iz04 != null) {
                        c43042iz08.f91871R.m76002a(c43042iz04.f91875T, C32496Du1.this.f6533x1);
                        if (i16 == i4) {
                            c43042iz08.f91871R.m75982u(this.f6544i);
                        }
                        c43042iz04.f91875T.m76002a(c43042iz08.f91871R, 0);
                        if (i16 == i5 + 1) {
                            c43042iz04.f91875T.m75982u(this.f6546k);
                        }
                    }
                    if (c43042iz08 != c43042iz07) {
                        if (z) {
                            int i18 = C32496Du1.this.f6534y1;
                            if (i18 == 0) {
                                c43042iz08.f91873S.m76002a(c43042iz07.f91873S, 0);
                            } else if (i18 == 1) {
                                c43042iz08.f91869Q.m76002a(c43042iz07.f91869Q, 0);
                            } else if (i18 == 2) {
                                c43042iz08.f91869Q.m76002a(c43042iz07.f91869Q, 0);
                                c43042iz08.f91873S.m76002a(c43042iz07.f91873S, 0);
                            }
                        } else {
                            int i19 = C32496Du1.this.f6534y1;
                            if (i19 == 0) {
                                c43042iz08.f91869Q.m76002a(c43042iz07.f91869Q, 0);
                            } else if (i19 == 1) {
                                c43042iz08.f91873S.m76002a(c43042iz07.f91873S, 0);
                            } else if (i19 == 2) {
                                if (z3) {
                                    c43042iz08.f91869Q.m76002a(this.f6539d, this.f6543h);
                                    c43042iz08.f91873S.m76002a(this.f6541f, this.f6545j);
                                } else {
                                    c43042iz08.f91869Q.m76002a(c43042iz07.f91869Q, 0);
                                    c43042iz08.f91873S.m76002a(c43042iz07.f91873S, 0);
                                }
                            }
                            c43042iz04 = c43042iz08;
                        }
                    }
                    c43042iz04 = c43042iz08;
                }
            }
        }

        /* renamed from: e */
        public int m109722e() {
            if (this.f6536a == 1) {
                return this.f6548m - C32496Du1.this.f6533x1;
            }
            return this.f6548m;
        }

        /* renamed from: f */
        public int m109721f() {
            if (this.f6536a == 0) {
                return this.f6547l - C32496Du1.this.f6532w1;
            }
            return this.f6547l;
        }

        /* renamed from: g */
        public void m109720g(int i) {
            int i2 = this.f6551p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.f6550o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3 && this.f6549n + i5 < C32496Du1.this.f6519I1; i5++) {
                C43042iz0 c43042iz0 = C32496Du1.this.f6518H1[this.f6549n + i5];
                if (this.f6536a == 0) {
                    if (c43042iz0 != null && c43042iz0.m31434C() == C43042iz0.EnumC24677b.MATCH_CONSTRAINT && c43042iz0.f91927w == 0) {
                        C32496Du1.this.m134H1(c43042iz0, C43042iz0.EnumC24677b.FIXED, i4, c43042iz0.m31397V(), c43042iz0.m31328z());
                    }
                } else if (c43042iz0 != null && c43042iz0.m31397V() == C43042iz0.EnumC24677b.MATCH_CONSTRAINT && c43042iz0.f91929x == 0) {
                    C32496Du1.this.m134H1(c43042iz0, c43042iz0.m31434C(), c43042iz0.m31391Y(), C43042iz0.EnumC24677b.FIXED, i4);
                }
            }
            m109719h();
        }

        /* renamed from: h */
        public final void m109719h() {
            this.f6547l = 0;
            this.f6548m = 0;
            this.f6537b = null;
            this.f6538c = 0;
            int i = this.f6550o;
            for (int i2 = 0; i2 < i && this.f6549n + i2 < C32496Du1.this.f6519I1; i2++) {
                C43042iz0 c43042iz0 = C32496Du1.this.f6518H1[this.f6549n + i2];
                if (this.f6536a == 0) {
                    int m31391Y = c43042iz0.m31391Y();
                    int i3 = C32496Du1.this.f6532w1;
                    if (c43042iz0.m31393X() == 8) {
                        i3 = 0;
                    }
                    this.f6547l += m31391Y + i3;
                    int m109738o2 = C32496Du1.this.m109738o2(c43042iz0, this.f6552q);
                    if (this.f6537b == null || this.f6538c < m109738o2) {
                        this.f6537b = c43042iz0;
                        this.f6538c = m109738o2;
                        this.f6548m = m109738o2;
                    }
                } else {
                    int m109737p2 = C32496Du1.this.m109737p2(c43042iz0, this.f6552q);
                    int m109738o22 = C32496Du1.this.m109738o2(c43042iz0, this.f6552q);
                    int i4 = C32496Du1.this.f6533x1;
                    if (c43042iz0.m31393X() == 8) {
                        i4 = 0;
                    }
                    this.f6548m += m109738o22 + i4;
                    if (this.f6537b == null || this.f6538c < m109737p2) {
                        this.f6537b = c43042iz0;
                        this.f6538c = m109737p2;
                        this.f6547l = m109737p2;
                    }
                }
            }
        }

        /* renamed from: i */
        public void m109718i(int i) {
            this.f6549n = i;
        }

        /* renamed from: j */
        public void m109717j(int i, C37211Xy0 c37211Xy0, C37211Xy0 c37211Xy02, C37211Xy0 c37211Xy03, C37211Xy0 c37211Xy04, int i2, int i3, int i4, int i5, int i6) {
            this.f6536a = i;
            this.f6539d = c37211Xy0;
            this.f6540e = c37211Xy02;
            this.f6541f = c37211Xy03;
            this.f6542g = c37211Xy04;
            this.f6543h = i2;
            this.f6544i = i3;
            this.f6545j = i4;
            this.f6546k = i5;
            this.f6552q = i6;
        }
    }

    /* renamed from: A2 */
    public void m109772A2(int i) {
        this.f6532w1 = i;
    }

    /* renamed from: B2 */
    public void m109771B2(int i) {
        this.f6520k1 = i;
    }

    /* renamed from: C2 */
    public void m109770C2(float f) {
        this.f6530u1 = f;
    }

    /* renamed from: D2 */
    public void m109769D2(int i) {
        this.f6524o1 = i;
    }

    /* renamed from: E2 */
    public void m109768E2(float f) {
        this.f6531v1 = f;
    }

    /* renamed from: F2 */
    public void m109767F2(int i) {
        this.f6525p1 = i;
    }

    @Override // p000.C53077zu6
    /* renamed from: G1 */
    public void mo135G1(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int[] iArr;
        boolean z;
        if (this.f17386W0 > 0 && !m133I1()) {
            m130L1(0, 0);
            m131K1(false);
            return;
        }
        int m138D1 = m138D1();
        int m137E1 = m137E1();
        int m136F1 = m136F1();
        int m139C1 = m139C1();
        int[] iArr2 = new int[2];
        int i7 = (i2 - m138D1) - m137E1;
        int i8 = this.f6513C1;
        if (i8 == 1) {
            i7 = (i4 - m136F1) - m139C1;
        }
        int i9 = i7;
        if (i8 == 0) {
            if (this.f6520k1 == -1) {
                this.f6520k1 = 0;
            }
            if (this.f6521l1 == -1) {
                this.f6521l1 = 0;
            }
        } else {
            if (this.f6520k1 == -1) {
                this.f6520k1 = 0;
            }
            if (this.f6521l1 == -1) {
                this.f6521l1 = 0;
            }
        }
        C43042iz0[] c43042iz0Arr = this.f17385V0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i5 = this.f17386W0;
            if (i10 >= i5) {
                break;
            }
            if (this.f17385V0[i10].m31393X() == 8) {
                i11++;
            }
            i10++;
        }
        if (i11 > 0) {
            c43042iz0Arr = new C43042iz0[i5 - i11];
            int i12 = 0;
            for (int i13 = 0; i13 < this.f17386W0; i13++) {
                C43042iz0 c43042iz0 = this.f17385V0[i13];
                if (c43042iz0.m31393X() != 8) {
                    c43042iz0Arr[i12] = c43042iz0;
                    i12++;
                }
            }
            i6 = i12;
        } else {
            i6 = i5;
        }
        this.f6518H1 = c43042iz0Arr;
        this.f6519I1 = i6;
        int i14 = this.f6511A1;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        z = true;
                        iArr = iArr2;
                    } else {
                        z = true;
                        iArr = iArr2;
                        m109734s2(c43042iz0Arr, i6, this.f6513C1, i9, iArr2);
                    }
                } else {
                    z = true;
                    iArr = iArr2;
                    m109736q2(c43042iz0Arr, i6, this.f6513C1, i9, iArr2);
                }
            } else {
                z = true;
                iArr = iArr2;
                m109735r2(c43042iz0Arr, i6, this.f6513C1, i9, iArr2);
            }
        } else {
            iArr = iArr2;
            z = true;
            m109733t2(c43042iz0Arr, i6, this.f6513C1, i9, iArr2);
        }
        int i15 = iArr[0] + m138D1 + m137E1;
        int i16 = iArr[z ? 1 : 0] + m136F1 + m139C1;
        if (i == 1073741824) {
            i15 = i2;
        } else if (i == Integer.MIN_VALUE) {
            i15 = Math.min(i15, i2);
        } else if (i != 0) {
            i15 = 0;
        }
        if (i3 == 1073741824) {
            i16 = i4;
        } else if (i3 == Integer.MIN_VALUE) {
            i16 = Math.min(i16, i4);
        } else if (i3 != 0) {
            i16 = 0;
        }
        m130L1(i15, i16);
        m31349o1(i15);
        m31407P0(i16);
        if (this.f17386W0 <= 0) {
            z = false;
        }
        m131K1(z);
    }

    /* renamed from: G2 */
    public void m109766G2(int i) {
        this.f6512B1 = i;
    }

    /* renamed from: H2 */
    public void m109765H2(int i) {
        this.f6513C1 = i;
    }

    /* renamed from: I2 */
    public void m109764I2(int i) {
        this.f6535z1 = i;
    }

    /* renamed from: J2 */
    public void m109763J2(float f) {
        this.f6527r1 = f;
    }

    /* renamed from: K2 */
    public void m109762K2(int i) {
        this.f6533x1 = i;
    }

    /* renamed from: L2 */
    public void m109761L2(int i) {
        this.f6521l1 = i;
    }

    /* renamed from: M2 */
    public void m109760M2(int i) {
        this.f6511A1 = i;
    }

    @Override // p000.C43042iz0
    /* renamed from: g */
    public void mo7204g(C34342Lr2 c34342Lr2, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        super.mo7204g(c34342Lr2, z);
        if (m31414M() != null && ((C43635jz0) m31414M()).m29540U1()) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i = this.f6511A1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        int size = this.f6514D1.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            C1637a c1637a = this.f6514D1.get(i2);
                            if (i2 == size - 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            c1637a.m109723d(z2, i2, z4);
                        }
                    }
                } else {
                    m109739n2(z2);
                }
            } else {
                int size2 = this.f6514D1.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C1637a c1637a2 = this.f6514D1.get(i3);
                    if (i3 == size2 - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c1637a2.m109723d(z2, i3, z3);
                }
            }
        } else if (this.f6514D1.size() > 0) {
            this.f6514D1.get(0).m109723d(z2, 0, true);
        }
        m131K1(false);
    }

    @Override // p000.JL1, p000.C43042iz0
    /* renamed from: n */
    public void mo7202n(C43042iz0 c43042iz0, HashMap<C43042iz0, C43042iz0> hashMap) {
        super.mo7202n(c43042iz0, hashMap);
        C32496Du1 c32496Du1 = (C32496Du1) c43042iz0;
        this.f6520k1 = c32496Du1.f6520k1;
        this.f6521l1 = c32496Du1.f6521l1;
        this.f6522m1 = c32496Du1.f6522m1;
        this.f6523n1 = c32496Du1.f6523n1;
        this.f6524o1 = c32496Du1.f6524o1;
        this.f6525p1 = c32496Du1.f6525p1;
        this.f6526q1 = c32496Du1.f6526q1;
        this.f6527r1 = c32496Du1.f6527r1;
        this.f6528s1 = c32496Du1.f6528s1;
        this.f6529t1 = c32496Du1.f6529t1;
        this.f6530u1 = c32496Du1.f6530u1;
        this.f6531v1 = c32496Du1.f6531v1;
        this.f6532w1 = c32496Du1.f6532w1;
        this.f6533x1 = c32496Du1.f6533x1;
        this.f6534y1 = c32496Du1.f6534y1;
        this.f6535z1 = c32496Du1.f6535z1;
        this.f6511A1 = c32496Du1.f6511A1;
        this.f6512B1 = c32496Du1.f6512B1;
        this.f6513C1 = c32496Du1.f6513C1;
    }

    /* renamed from: n2 */
    public final void m109739n2(boolean z) {
        C43042iz0 c43042iz0;
        float f;
        int i;
        if (this.f6517G1 != null && this.f6516F1 != null && this.f6515E1 != null) {
            for (int i2 = 0; i2 < this.f6519I1; i2++) {
                this.f6518H1[i2].m31331x0();
            }
            int[] iArr = this.f6517G1;
            int i3 = iArr[0];
            int i4 = iArr[1];
            float f2 = this.f6526q1;
            C43042iz0 c43042iz02 = null;
            int i5 = 0;
            while (i5 < i3) {
                if (z) {
                    i = (i3 - i5) - 1;
                    f = 1.0f - this.f6526q1;
                } else {
                    f = f2;
                    i = i5;
                }
                C43042iz0 c43042iz03 = this.f6516F1[i];
                if (c43042iz03 != null && c43042iz03.m31393X() != 8) {
                    if (i5 == 0) {
                        c43042iz03.m31359l(c43042iz03.f91869Q, this.f91869Q, m138D1());
                        c43042iz03.m31404R0(this.f6520k1);
                        c43042iz03.m31406Q0(f);
                    }
                    if (i5 == i3 - 1) {
                        c43042iz03.m31359l(c43042iz03.f91873S, this.f91873S, m137E1());
                    }
                    if (i5 > 0 && c43042iz02 != null) {
                        c43042iz03.m31359l(c43042iz03.f91869Q, c43042iz02.f91873S, this.f6532w1);
                        c43042iz02.m31359l(c43042iz02.f91873S, c43042iz03.f91869Q, 0);
                    }
                    c43042iz02 = c43042iz03;
                }
                i5++;
                f2 = f;
            }
            for (int i6 = 0; i6 < i4; i6++) {
                C43042iz0 c43042iz04 = this.f6515E1[i6];
                if (c43042iz04 != null && c43042iz04.m31393X() != 8) {
                    if (i6 == 0) {
                        c43042iz04.m31359l(c43042iz04.f91871R, this.f91871R, m136F1());
                        c43042iz04.m31366i1(this.f6521l1);
                        c43042iz04.m31369h1(this.f6527r1);
                    }
                    if (i6 == i4 - 1) {
                        c43042iz04.m31359l(c43042iz04.f91875T, this.f91875T, m139C1());
                    }
                    if (i6 > 0 && c43042iz02 != null) {
                        c43042iz04.m31359l(c43042iz04.f91871R, c43042iz02.f91875T, this.f6533x1);
                        c43042iz02.m31359l(c43042iz02.f91875T, c43042iz04.f91871R, 0);
                    }
                    c43042iz02 = c43042iz04;
                }
            }
            for (int i7 = 0; i7 < i3; i7++) {
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = (i8 * i3) + i7;
                    if (this.f6513C1 == 1) {
                        i9 = (i7 * i4) + i8;
                    }
                    C43042iz0[] c43042iz0Arr = this.f6518H1;
                    if (i9 < c43042iz0Arr.length && (c43042iz0 = c43042iz0Arr[i9]) != null && c43042iz0.m31393X() != 8) {
                        C43042iz0 c43042iz05 = this.f6516F1[i7];
                        C43042iz0 c43042iz06 = this.f6515E1[i8];
                        if (c43042iz0 != c43042iz05) {
                            c43042iz0.m31359l(c43042iz0.f91869Q, c43042iz05.f91869Q, 0);
                            c43042iz0.m31359l(c43042iz0.f91873S, c43042iz05.f91873S, 0);
                        }
                        if (c43042iz0 != c43042iz06) {
                            c43042iz0.m31359l(c43042iz0.f91871R, c43042iz06.f91871R, 0);
                            c43042iz0.m31359l(c43042iz0.f91875T, c43042iz06.f91875T, 0);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: o2 */
    public final int m109738o2(C43042iz0 c43042iz0, int i) {
        if (c43042iz0 == null) {
            return 0;
        }
        if (c43042iz0.m31397V() == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
            int i2 = c43042iz0.f91929x;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c43042iz0.f91845E * i);
                if (i3 != c43042iz0.m31328z()) {
                    c43042iz0.m31382c1(true);
                    m134H1(c43042iz0, c43042iz0.m31434C(), c43042iz0.m31391Y(), C43042iz0.EnumC24677b.FIXED, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return c43042iz0.m31328z();
            } else {
                if (i2 == 3) {
                    return (int) ((c43042iz0.m31391Y() * c43042iz0.f91894f0) + 0.5f);
                }
            }
        }
        return c43042iz0.m31328z();
    }

    /* renamed from: p2 */
    public final int m109737p2(C43042iz0 c43042iz0, int i) {
        if (c43042iz0 == null) {
            return 0;
        }
        if (c43042iz0.m31434C() == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
            int i2 = c43042iz0.f91927w;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c43042iz0.f91839B * i);
                if (i3 != c43042iz0.m31391Y()) {
                    c43042iz0.m31382c1(true);
                    m134H1(c43042iz0, C43042iz0.EnumC24677b.FIXED, i3, c43042iz0.m31397V(), c43042iz0.m31328z());
                }
                return i3;
            } else if (i2 == 1) {
                return c43042iz0.m31391Y();
            } else {
                if (i2 == 3) {
                    return (int) ((c43042iz0.m31328z() * c43042iz0.f91894f0) + 0.5f);
                }
            }
        }
        return c43042iz0.m31391Y();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please submit an issue!!! */
    /* renamed from: q2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m109736q2(C43042iz0[] c43042iz0Arr, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        boolean z;
        C43042iz0 c43042iz0;
        if (i2 == 0) {
            int i6 = this.f6512B1;
            if (i6 <= 0) {
                i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < i; i8++) {
                    if (i8 > 0) {
                        i7 += this.f6532w1;
                    }
                    C43042iz0 c43042iz02 = c43042iz0Arr[i8];
                    if (c43042iz02 != null) {
                        i7 += m109737p2(c43042iz02, i3);
                        if (i7 > i3) {
                            break;
                        }
                        i6++;
                    }
                }
            }
            i5 = i6;
            i4 = 0;
        } else {
            i4 = this.f6512B1;
            if (i4 <= 0) {
                i4 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < i; i10++) {
                    if (i10 > 0) {
                        i9 += this.f6533x1;
                    }
                    C43042iz0 c43042iz03 = c43042iz0Arr[i10];
                    if (c43042iz03 != null) {
                        i9 += m109738o2(c43042iz03, i3);
                        if (i9 > i3) {
                            break;
                        }
                        i4++;
                    }
                }
            }
            i5 = 0;
        }
        if (this.f6517G1 == null) {
            this.f6517G1 = new int[2];
        }
        if ((i4 != 0 || i2 != 1) && (i5 != 0 || i2 != 0)) {
            z = false;
            while (!z) {
                if (i2 == 0) {
                    i4 = (int) Math.ceil(i / i5);
                } else {
                    i5 = (int) Math.ceil(i / i4);
                }
                C43042iz0[] c43042iz0Arr2 = this.f6516F1;
                if (c43042iz0Arr2 != null && c43042iz0Arr2.length >= i5) {
                    Arrays.fill(c43042iz0Arr2, (Object) null);
                } else {
                    this.f6516F1 = new C43042iz0[i5];
                }
                C43042iz0[] c43042iz0Arr3 = this.f6515E1;
                if (c43042iz0Arr3 != null && c43042iz0Arr3.length >= i4) {
                    Arrays.fill(c43042iz0Arr3, (Object) null);
                } else {
                    this.f6515E1 = new C43042iz0[i4];
                }
                for (int i11 = 0; i11 < i5; i11++) {
                    for (int i12 = 0; i12 < i4; i12++) {
                        int i13 = (i12 * i5) + i11;
                        if (i2 == 1) {
                            i13 = (i11 * i4) + i12;
                        }
                        if (i13 < c43042iz0Arr.length && (c43042iz0 = c43042iz0Arr[i13]) != null) {
                            int m109737p2 = m109737p2(c43042iz0, i3);
                            C43042iz0 c43042iz04 = this.f6516F1[i11];
                            if (c43042iz04 == null || c43042iz04.m31391Y() < m109737p2) {
                                this.f6516F1[i11] = c43042iz0;
                            }
                            int m109738o2 = m109738o2(c43042iz0, i3);
                            C43042iz0 c43042iz05 = this.f6515E1[i12];
                            if (c43042iz05 == null || c43042iz05.m31328z() < m109738o2) {
                                this.f6515E1[i12] = c43042iz0;
                            }
                        }
                    }
                }
                int i14 = 0;
                for (int i15 = 0; i15 < i5; i15++) {
                    C43042iz0 c43042iz06 = this.f6516F1[i15];
                    if (c43042iz06 != null) {
                        if (i15 > 0) {
                            i14 += this.f6532w1;
                        }
                        i14 += m109737p2(c43042iz06, i3);
                    }
                }
                int i16 = 0;
                for (int i17 = 0; i17 < i4; i17++) {
                    C43042iz0 c43042iz07 = this.f6515E1[i17];
                    if (c43042iz07 != null) {
                        if (i17 > 0) {
                            i16 += this.f6533x1;
                        }
                        i16 += m109738o2(c43042iz07, i3);
                    }
                }
                iArr[0] = i14;
                iArr[1] = i16;
                if (i2 == 0) {
                    if (i14 > i3 && i5 > 1) {
                        i5--;
                    }
                } else if (i16 > i3 && i4 > 1) {
                    i4--;
                }
                while (!z) {
                }
            }
            int[] iArr2 = this.f6517G1;
            iArr2[0] = i5;
            iArr2[1] = i4;
        }
        z = true;
        while (!z) {
        }
        int[] iArr22 = this.f6517G1;
        iArr22[0] = i5;
        iArr22[1] = i4;
    }

    /* renamed from: r2 */
    public final void m109735r2(C43042iz0[] c43042iz0Arr, int i, int i2, int i3, int[] iArr) {
        int i4;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        C37211Xy0 c37211Xy0;
        int m137E1;
        C37211Xy0 c37211Xy02;
        int m139C1;
        boolean z3;
        int i7;
        if (i == 0) {
            return;
        }
        this.f6514D1.clear();
        C1637a c1637a = new C1637a(i2, this.f91869Q, this.f91871R, this.f91873S, this.f91875T, i3);
        this.f6514D1.add(c1637a);
        if (i2 == 0) {
            i4 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i9 < i) {
                C43042iz0 c43042iz0 = c43042iz0Arr[i9];
                int m109737p2 = m109737p2(c43042iz0, i3);
                if (c43042iz0.m31434C() == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i10 = i4;
                if ((i8 == i3 || this.f6532w1 + i8 + m109737p2 > i3) && c1637a.f6537b != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3 && i9 > 0 && (i7 = this.f6512B1) > 0 && i9 % i7 == 0) {
                    z3 = true;
                }
                if (z3) {
                    c1637a = new C1637a(i2, this.f91869Q, this.f91871R, this.f91873S, this.f91875T, i3);
                    c1637a.m109718i(i9);
                    this.f6514D1.add(c1637a);
                } else if (i9 > 0) {
                    i8 += this.f6532w1 + m109737p2;
                    c1637a.m109725b(c43042iz0);
                    i9++;
                    i4 = i10;
                }
                i8 = m109737p2;
                c1637a.m109725b(c43042iz0);
                i9++;
                i4 = i10;
            }
        } else {
            i4 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i) {
                C43042iz0 c43042iz02 = c43042iz0Arr[i12];
                int m109738o2 = m109738o2(c43042iz02, i3);
                if (c43042iz02.m31397V() == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i13 = i4;
                if ((i11 == i3 || this.f6533x1 + i11 + m109738o2 > i3) && c1637a.f6537b != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && i12 > 0 && (i5 = this.f6512B1) > 0 && i12 % i5 == 0) {
                    z = true;
                }
                if (z) {
                    c1637a = new C1637a(i2, this.f91869Q, this.f91871R, this.f91873S, this.f91875T, i3);
                    c1637a.m109718i(i12);
                    this.f6514D1.add(c1637a);
                } else if (i12 > 0) {
                    i11 += this.f6533x1 + m109738o2;
                    c1637a.m109725b(c43042iz02);
                    i12++;
                    i4 = i13;
                }
                i11 = m109738o2;
                c1637a.m109725b(c43042iz02);
                i12++;
                i4 = i13;
            }
        }
        int size = this.f6514D1.size();
        C37211Xy0 c37211Xy03 = this.f91869Q;
        C37211Xy0 c37211Xy04 = this.f91871R;
        C37211Xy0 c37211Xy05 = this.f91873S;
        C37211Xy0 c37211Xy06 = this.f91875T;
        int m138D1 = m138D1();
        int m136F1 = m136F1();
        int m137E12 = m137E1();
        int m139C12 = m139C1();
        C43042iz0.EnumC24677b m31434C = m31434C();
        C43042iz0.EnumC24677b enumC24677b = C43042iz0.EnumC24677b.WRAP_CONTENT;
        if (m31434C != enumC24677b && m31397V() != enumC24677b) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i4 > 0 && z2) {
            for (int i14 = 0; i14 < size; i14++) {
                C1637a c1637a2 = this.f6514D1.get(i14);
                if (i2 == 0) {
                    c1637a2.m109720g(i3 - c1637a2.m109721f());
                } else {
                    c1637a2.m109720g(i3 - c1637a2.m109722e());
                }
            }
        }
        int i15 = m136F1;
        int i16 = m137E12;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = m138D1;
        C37211Xy0 c37211Xy07 = c37211Xy04;
        C37211Xy0 c37211Xy08 = c37211Xy03;
        int i21 = m139C12;
        while (i19 < size) {
            C1637a c1637a3 = this.f6514D1.get(i19);
            if (i2 == 0) {
                if (i19 < size - 1) {
                    c37211Xy02 = this.f6514D1.get(i19 + 1).f6537b.f91871R;
                    m139C1 = 0;
                } else {
                    c37211Xy02 = this.f91875T;
                    m139C1 = m139C1();
                }
                C37211Xy0 c37211Xy09 = c1637a3.f6537b.f91875T;
                C37211Xy0 c37211Xy010 = c37211Xy08;
                C37211Xy0 c37211Xy011 = c37211Xy08;
                int i22 = i17;
                C37211Xy0 c37211Xy012 = c37211Xy07;
                int i23 = i18;
                C37211Xy0 c37211Xy013 = c37211Xy05;
                C37211Xy0 c37211Xy014 = c37211Xy05;
                i6 = i19;
                c1637a3.m109717j(i2, c37211Xy010, c37211Xy012, c37211Xy013, c37211Xy02, i20, i15, i16, m139C1, i3);
                int max = Math.max(i23, c1637a3.m109721f());
                i17 = i22 + c1637a3.m109722e();
                if (i6 > 0) {
                    i17 += this.f6533x1;
                }
                c37211Xy08 = c37211Xy011;
                i18 = max;
                i15 = 0;
                c37211Xy07 = c37211Xy09;
                c37211Xy0 = c37211Xy014;
                int i24 = m139C1;
                c37211Xy06 = c37211Xy02;
                i21 = i24;
            } else {
                C37211Xy0 c37211Xy015 = c37211Xy08;
                int i25 = i17;
                int i26 = i18;
                i6 = i19;
                if (i6 < size - 1) {
                    c37211Xy0 = this.f6514D1.get(i6 + 1).f6537b.f91869Q;
                    m137E1 = 0;
                } else {
                    c37211Xy0 = this.f91873S;
                    m137E1 = m137E1();
                }
                C37211Xy0 c37211Xy016 = c1637a3.f6537b.f91873S;
                c1637a3.m109717j(i2, c37211Xy015, c37211Xy07, c37211Xy0, c37211Xy06, i20, i15, m137E1, i21, i3);
                i18 = i26 + c1637a3.m109721f();
                int max2 = Math.max(i25, c1637a3.m109722e());
                if (i6 > 0) {
                    i18 += this.f6532w1;
                }
                i17 = max2;
                i20 = 0;
                i16 = m137E1;
                c37211Xy08 = c37211Xy016;
            }
            i19 = i6 + 1;
            c37211Xy05 = c37211Xy0;
        }
        iArr[0] = i18;
        iArr[1] = i17;
    }

    /* renamed from: s2 */
    public final void m109734s2(C43042iz0[] c43042iz0Arr, int i, int i2, int i3, int[] iArr) {
        int i4;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        C37211Xy0 c37211Xy0;
        int m137E1;
        C37211Xy0 c37211Xy02;
        int m139C1;
        boolean z3;
        int i7;
        if (i == 0) {
            return;
        }
        this.f6514D1.clear();
        C1637a c1637a = new C1637a(i2, this.f91869Q, this.f91871R, this.f91873S, this.f91875T, i3);
        this.f6514D1.add(c1637a);
        if (i2 == 0) {
            int i8 = 0;
            i4 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i10 < i) {
                int i11 = i8 + 1;
                C43042iz0 c43042iz0 = c43042iz0Arr[i10];
                int m109737p2 = m109737p2(c43042iz0, i3);
                if (c43042iz0.m31434C() == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i12 = i4;
                if ((i9 == i3 || this.f6532w1 + i9 + m109737p2 > i3) && c1637a.f6537b != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3 && i10 > 0 && (i7 = this.f6512B1) > 0 && i11 > i7) {
                    z3 = true;
                }
                if (z3) {
                    c1637a = new C1637a(i2, this.f91869Q, this.f91871R, this.f91873S, this.f91875T, i3);
                    c1637a.m109718i(i10);
                    this.f6514D1.add(c1637a);
                    i8 = i11;
                    i9 = m109737p2;
                } else {
                    if (i10 > 0) {
                        i9 += this.f6532w1 + m109737p2;
                    } else {
                        i9 = m109737p2;
                    }
                    i8 = 0;
                }
                c1637a.m109725b(c43042iz0);
                i10++;
                i4 = i12;
            }
        } else {
            int i13 = 0;
            i4 = 0;
            int i14 = 0;
            while (i14 < i) {
                C43042iz0 c43042iz02 = c43042iz0Arr[i14];
                int m109738o2 = m109738o2(c43042iz02, i3);
                if (c43042iz02.m31397V() == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i15 = i4;
                if ((i13 == i3 || this.f6533x1 + i13 + m109738o2 > i3) && c1637a.f6537b != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && i14 > 0 && (i5 = this.f6512B1) > 0 && i5 < 0) {
                    z = true;
                }
                if (z) {
                    c1637a = new C1637a(i2, this.f91869Q, this.f91871R, this.f91873S, this.f91875T, i3);
                    c1637a.m109718i(i14);
                    this.f6514D1.add(c1637a);
                } else if (i14 > 0) {
                    i13 += this.f6533x1 + m109738o2;
                    c1637a.m109725b(c43042iz02);
                    i14++;
                    i4 = i15;
                }
                i13 = m109738o2;
                c1637a.m109725b(c43042iz02);
                i14++;
                i4 = i15;
            }
        }
        int size = this.f6514D1.size();
        C37211Xy0 c37211Xy03 = this.f91869Q;
        C37211Xy0 c37211Xy04 = this.f91871R;
        C37211Xy0 c37211Xy05 = this.f91873S;
        C37211Xy0 c37211Xy06 = this.f91875T;
        int m138D1 = m138D1();
        int m136F1 = m136F1();
        int m137E12 = m137E1();
        int m139C12 = m139C1();
        C43042iz0.EnumC24677b m31434C = m31434C();
        C43042iz0.EnumC24677b enumC24677b = C43042iz0.EnumC24677b.WRAP_CONTENT;
        if (m31434C != enumC24677b && m31397V() != enumC24677b) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i4 > 0 && z2) {
            for (int i16 = 0; i16 < size; i16++) {
                C1637a c1637a2 = this.f6514D1.get(i16);
                if (i2 == 0) {
                    c1637a2.m109720g(i3 - c1637a2.m109721f());
                } else {
                    c1637a2.m109720g(i3 - c1637a2.m109722e());
                }
            }
        }
        int i17 = m136F1;
        int i18 = m137E12;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = m138D1;
        C37211Xy0 c37211Xy07 = c37211Xy04;
        C37211Xy0 c37211Xy08 = c37211Xy03;
        int i23 = m139C12;
        while (i21 < size) {
            C1637a c1637a3 = this.f6514D1.get(i21);
            if (i2 == 0) {
                if (i21 < size - 1) {
                    c37211Xy02 = this.f6514D1.get(i21 + 1).f6537b.f91871R;
                    m139C1 = 0;
                } else {
                    c37211Xy02 = this.f91875T;
                    m139C1 = m139C1();
                }
                C37211Xy0 c37211Xy09 = c1637a3.f6537b.f91875T;
                C37211Xy0 c37211Xy010 = c37211Xy08;
                C37211Xy0 c37211Xy011 = c37211Xy08;
                int i24 = i19;
                C37211Xy0 c37211Xy012 = c37211Xy07;
                int i25 = i20;
                C37211Xy0 c37211Xy013 = c37211Xy05;
                C37211Xy0 c37211Xy014 = c37211Xy05;
                i6 = i21;
                c1637a3.m109717j(i2, c37211Xy010, c37211Xy012, c37211Xy013, c37211Xy02, i22, i17, i18, m139C1, i3);
                int max = Math.max(i25, c1637a3.m109721f());
                i19 = i24 + c1637a3.m109722e();
                if (i6 > 0) {
                    i19 += this.f6533x1;
                }
                c37211Xy08 = c37211Xy011;
                i20 = max;
                i17 = 0;
                c37211Xy07 = c37211Xy09;
                c37211Xy0 = c37211Xy014;
                int i26 = m139C1;
                c37211Xy06 = c37211Xy02;
                i23 = i26;
            } else {
                C37211Xy0 c37211Xy015 = c37211Xy08;
                int i27 = i19;
                int i28 = i20;
                i6 = i21;
                if (i6 < size - 1) {
                    c37211Xy0 = this.f6514D1.get(i6 + 1).f6537b.f91869Q;
                    m137E1 = 0;
                } else {
                    c37211Xy0 = this.f91873S;
                    m137E1 = m137E1();
                }
                C37211Xy0 c37211Xy016 = c1637a3.f6537b.f91873S;
                c1637a3.m109717j(i2, c37211Xy015, c37211Xy07, c37211Xy0, c37211Xy06, i22, i17, m137E1, i23, i3);
                i20 = i28 + c1637a3.m109721f();
                int max2 = Math.max(i27, c1637a3.m109722e());
                if (i6 > 0) {
                    i20 += this.f6532w1;
                }
                i19 = max2;
                i22 = 0;
                i18 = m137E1;
                c37211Xy08 = c37211Xy016;
            }
            i21 = i6 + 1;
            c37211Xy05 = c37211Xy0;
        }
        iArr[0] = i20;
        iArr[1] = i19;
    }

    /* renamed from: t2 */
    public final void m109733t2(C43042iz0[] c43042iz0Arr, int i, int i2, int i3, int[] iArr) {
        C1637a c1637a;
        if (i == 0) {
            return;
        }
        if (this.f6514D1.size() == 0) {
            c1637a = new C1637a(i2, this.f91869Q, this.f91871R, this.f91873S, this.f91875T, i3);
            this.f6514D1.add(c1637a);
        } else {
            C1637a c1637a2 = this.f6514D1.get(0);
            c1637a2.m109724c();
            c1637a = c1637a2;
            c1637a.m109717j(i2, this.f91869Q, this.f91871R, this.f91873S, this.f91875T, m138D1(), m136F1(), m137E1(), m139C1(), i3);
        }
        for (int i4 = 0; i4 < i; i4++) {
            c1637a.m109725b(c43042iz0Arr[i4]);
        }
        iArr[0] = c1637a.m109721f();
        iArr[1] = c1637a.m109722e();
    }

    /* renamed from: u2 */
    public void m109732u2(float f) {
        this.f6528s1 = f;
    }

    /* renamed from: v2 */
    public void m109731v2(int i) {
        this.f6522m1 = i;
    }

    /* renamed from: w2 */
    public void m109730w2(float f) {
        this.f6529t1 = f;
    }

    /* renamed from: x2 */
    public void m109729x2(int i) {
        this.f6523n1 = i;
    }

    /* renamed from: y2 */
    public void m109728y2(int i) {
        this.f6534y1 = i;
    }

    /* renamed from: z2 */
    public void m109727z2(float f) {
        this.f6526q1 = f;
    }
}
