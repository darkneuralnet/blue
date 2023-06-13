package p000;

import java.util.HashMap;
import p000.C37211Xy0;
import p000.C43042iz0;
/* renamed from: Cy */
/* loaded from: classes.dex */
public class C1263Cy extends JL1 {

    /* renamed from: X0 */
    public int f4961X0 = 0;

    /* renamed from: Y0 */
    public boolean f4962Y0 = true;

    /* renamed from: Z0 */
    public int f4963Z0 = 0;

    /* renamed from: a1 */
    public boolean f4964a1 = false;

    /* renamed from: A1 */
    public int m111206A1() {
        return this.f4963Z0;
    }

    /* renamed from: B1 */
    public int m111205B1() {
        int i = this.f4961X0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* renamed from: C1 */
    public void m111204C1() {
        for (int i = 0; i < this.f17386W0; i++) {
            C43042iz0 c43042iz0 = this.f17385V0[i];
            if (this.f4962Y0 || c43042iz0.mo7203h()) {
                int i2 = this.f4961X0;
                if (i2 != 0 && i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        c43042iz0.m31394W0(1, true);
                    }
                } else {
                    c43042iz0.m31394W0(0, true);
                }
            }
        }
    }

    /* renamed from: D1 */
    public void m111203D1(boolean z) {
        this.f4962Y0 = z;
    }

    /* renamed from: E1 */
    public void m111202E1(int i) {
        this.f4961X0 = i;
    }

    /* renamed from: F1 */
    public void m111201F1(int i) {
        this.f4963Z0 = i;
    }

    @Override // p000.C43042iz0
    /* renamed from: g */
    public void mo7204g(C34342Lr2 c34342Lr2, boolean z) {
        C37211Xy0[] c37211Xy0Arr;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C37211Xy0[] c37211Xy0Arr2 = this.f91881Y;
        c37211Xy0Arr2[0] = this.f91869Q;
        c37211Xy0Arr2[2] = this.f91871R;
        c37211Xy0Arr2[1] = this.f91873S;
        c37211Xy0Arr2[3] = this.f91875T;
        int i6 = 0;
        while (true) {
            c37211Xy0Arr = this.f91881Y;
            if (i6 >= c37211Xy0Arr.length) {
                break;
            }
            C37211Xy0 c37211Xy0 = c37211Xy0Arr[i6];
            c37211Xy0.f44311i = c34342Lr2.m96275q(c37211Xy0);
            i6++;
        }
        int i7 = this.f4961X0;
        if (i7 >= 0 && i7 < 4) {
            C37211Xy0 c37211Xy02 = c37211Xy0Arr[i7];
            if (!this.f4964a1) {
                m111200x1();
            }
            if (this.f4964a1) {
                this.f4964a1 = false;
                int i8 = this.f4961X0;
                if (i8 != 0 && i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        c34342Lr2.m96286f(this.f91871R.f44311i, this.f91900i0);
                        c34342Lr2.m96286f(this.f91875T.f44311i, this.f91900i0);
                        return;
                    }
                    return;
                }
                c34342Lr2.m96286f(this.f91869Q.f44311i, this.f91898h0);
                c34342Lr2.m96286f(this.f91873S.f44311i, this.f91898h0);
                return;
            }
            for (int i9 = 0; i9 < this.f17386W0; i9++) {
                C43042iz0 c43042iz0 = this.f17385V0[i9];
                if ((this.f4962Y0 || c43042iz0.mo7203h()) && ((((i4 = this.f4961X0) == 0 || i4 == 1) && c43042iz0.m31434C() == C43042iz0.EnumC24677b.MATCH_CONSTRAINT && c43042iz0.f91869Q.f44308f != null && c43042iz0.f91873S.f44308f != null) || (((i5 = this.f4961X0) == 2 || i5 == 3) && c43042iz0.m31397V() == C43042iz0.EnumC24677b.MATCH_CONSTRAINT && c43042iz0.f91871R.f44308f != null && c43042iz0.f91875T.f44308f != null))) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (!this.f91869Q.m75991l() && !this.f91873S.m75991l()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!this.f91871R.m75991l() && !this.f91875T.m75991l()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z2 && (((i3 = this.f4961X0) == 0 && z3) || ((i3 == 2 && z4) || ((i3 == 1 && z3) || (i3 == 3 && z4))))) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                i = 4;
            } else {
                i = 5;
            }
            for (int i10 = 0; i10 < this.f17386W0; i10++) {
                C43042iz0 c43042iz02 = this.f17385V0[i10];
                if (this.f4962Y0 || c43042iz02.mo7203h()) {
                    C48017rN5 m96275q = c34342Lr2.m96275q(c43042iz02.f91881Y[this.f4961X0]);
                    C37211Xy0[] c37211Xy0Arr3 = c43042iz02.f91881Y;
                    int i11 = this.f4961X0;
                    C37211Xy0 c37211Xy03 = c37211Xy0Arr3[i11];
                    c37211Xy03.f44311i = m96275q;
                    C37211Xy0 c37211Xy04 = c37211Xy03.f44308f;
                    if (c37211Xy04 != null && c37211Xy04.f44306d == this) {
                        i2 = c37211Xy03.f44309g + 0;
                    } else {
                        i2 = 0;
                    }
                    if (i11 != 0 && i11 != 2) {
                        c34342Lr2.m96285g(c37211Xy02.f44311i, m96275q, this.f4963Z0 + i2, z2);
                    } else {
                        c34342Lr2.m96283i(c37211Xy02.f44311i, m96275q, this.f4963Z0 - i2, z2);
                    }
                    c34342Lr2.m96287e(c37211Xy02.f44311i, m96275q, this.f4963Z0 + i2, i);
                }
            }
            int i12 = this.f4961X0;
            if (i12 == 0) {
                c34342Lr2.m96287e(this.f91873S.f44311i, this.f91869Q.f44311i, 0, 8);
                c34342Lr2.m96287e(this.f91869Q.f44311i, this.f91888c0.f91873S.f44311i, 0, 4);
                c34342Lr2.m96287e(this.f91869Q.f44311i, this.f91888c0.f91869Q.f44311i, 0, 0);
            } else if (i12 == 1) {
                c34342Lr2.m96287e(this.f91869Q.f44311i, this.f91873S.f44311i, 0, 8);
                c34342Lr2.m96287e(this.f91869Q.f44311i, this.f91888c0.f91869Q.f44311i, 0, 4);
                c34342Lr2.m96287e(this.f91869Q.f44311i, this.f91888c0.f91873S.f44311i, 0, 0);
            } else if (i12 == 2) {
                c34342Lr2.m96287e(this.f91875T.f44311i, this.f91871R.f44311i, 0, 8);
                c34342Lr2.m96287e(this.f91871R.f44311i, this.f91888c0.f91875T.f44311i, 0, 4);
                c34342Lr2.m96287e(this.f91871R.f44311i, this.f91888c0.f91871R.f44311i, 0, 0);
            } else if (i12 == 3) {
                c34342Lr2.m96287e(this.f91871R.f44311i, this.f91875T.f44311i, 0, 8);
                c34342Lr2.m96287e(this.f91871R.f44311i, this.f91888c0.f91871R.f44311i, 0, 4);
                c34342Lr2.m96287e(this.f91871R.f44311i, this.f91888c0.f91875T.f44311i, 0, 0);
            }
        }
    }

    @Override // p000.C43042iz0
    /* renamed from: h */
    public boolean mo7203h() {
        return true;
    }

    @Override // p000.JL1, p000.C43042iz0
    /* renamed from: n */
    public void mo7202n(C43042iz0 c43042iz0, HashMap<C43042iz0, C43042iz0> hashMap) {
        super.mo7202n(c43042iz0, hashMap);
        C1263Cy c1263Cy = (C1263Cy) c43042iz0;
        this.f4961X0 = c1263Cy.f4961X0;
        this.f4962Y0 = c1263Cy.f4962Y0;
        this.f4963Z0 = c1263Cy.f4963Z0;
    }

    @Override // p000.C43042iz0
    /* renamed from: p0 */
    public boolean mo7201p0() {
        return this.f4964a1;
    }

    @Override // p000.C43042iz0
    /* renamed from: q0 */
    public boolean mo7199q0() {
        return this.f4964a1;
    }

    @Override // p000.C43042iz0
    public String toString() {
        String str = "[Barrier] " + m31335v() + " {";
        for (int i = 0; i < this.f17386W0; i++) {
            C43042iz0 c43042iz0 = this.f17385V0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + c43042iz0.m31335v();
        }
        return str + "}";
    }

    /* renamed from: x1 */
    public boolean m111200x1() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f17386W0;
            if (i4 >= i) {
                break;
            }
            C43042iz0 c43042iz0 = this.f17385V0[i4];
            if ((this.f4962Y0 || c43042iz0.mo7203h()) && ((((i2 = this.f4961X0) == 0 || i2 == 1) && !c43042iz0.mo7201p0()) || (((i3 = this.f4961X0) == 2 || i3 == 3) && !c43042iz0.mo7199q0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f17386W0; i6++) {
            C43042iz0 c43042iz02 = this.f17385V0[i6];
            if (this.f4962Y0 || c43042iz02.mo7203h()) {
                if (!z2) {
                    int i7 = this.f4961X0;
                    if (i7 == 0) {
                        i5 = c43042iz02.mo7200q(C37211Xy0.EnumC9561b.LEFT).m75998e();
                    } else if (i7 == 1) {
                        i5 = c43042iz02.mo7200q(C37211Xy0.EnumC9561b.RIGHT).m75998e();
                    } else if (i7 == 2) {
                        i5 = c43042iz02.mo7200q(C37211Xy0.EnumC9561b.TOP).m75998e();
                    } else if (i7 == 3) {
                        i5 = c43042iz02.mo7200q(C37211Xy0.EnumC9561b.BOTTOM).m75998e();
                    }
                    z2 = true;
                }
                int i8 = this.f4961X0;
                if (i8 == 0) {
                    i5 = Math.min(i5, c43042iz02.mo7200q(C37211Xy0.EnumC9561b.LEFT).m75998e());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c43042iz02.mo7200q(C37211Xy0.EnumC9561b.RIGHT).m75998e());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c43042iz02.mo7200q(C37211Xy0.EnumC9561b.TOP).m75998e());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c43042iz02.mo7200q(C37211Xy0.EnumC9561b.BOTTOM).m75998e());
                }
            }
        }
        int i9 = i5 + this.f4963Z0;
        int i10 = this.f4961X0;
        if (i10 != 0 && i10 != 1) {
            m31413M0(i9, i9);
        } else {
            m31419J0(i9, i9);
        }
        this.f4964a1 = true;
        return true;
    }

    /* renamed from: y1 */
    public boolean m111199y1() {
        return this.f4962Y0;
    }

    /* renamed from: z1 */
    public int m111198z1() {
        return this.f4961X0;
    }
}
