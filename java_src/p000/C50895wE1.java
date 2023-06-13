package p000;

import java.util.HashMap;
import p000.C37211Xy0;
import p000.C43042iz0;
/* renamed from: wE1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C50895wE1 extends C43042iz0 {

    /* renamed from: V0 */
    public float f115613V0 = -1.0f;

    /* renamed from: W0 */
    public int f115614W0 = -1;

    /* renamed from: X0 */
    public int f115615X0 = -1;

    /* renamed from: Y0 */
    public boolean f115616Y0 = true;

    /* renamed from: Z0 */
    public C37211Xy0 f115617Z0 = this.f91871R;

    /* renamed from: a1 */
    public int f115618a1 = 0;

    /* renamed from: b1 */
    public int f115619b1 = 0;

    /* renamed from: c1 */
    public boolean f115620c1;

    /* renamed from: wE1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C29812a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f115621a;

        static {
            int[] iArr = new int[C37211Xy0.EnumC9561b.values().length];
            f115621a = iArr;
            try {
                iArr[C37211Xy0.EnumC9561b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f115621a[C37211Xy0.EnumC9561b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f115621a[C37211Xy0.EnumC9561b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f115621a[C37211Xy0.EnumC9561b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f115621a[C37211Xy0.EnumC9561b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f115621a[C37211Xy0.EnumC9561b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f115621a[C37211Xy0.EnumC9561b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f115621a[C37211Xy0.EnumC9561b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f115621a[C37211Xy0.EnumC9561b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C50895wE1() {
        this.f91882Z.clear();
        this.f91882Z.add(this.f115617Z0);
        int length = this.f91881Y.length;
        for (int i = 0; i < length; i++) {
            this.f91881Y[i] = this.f115617Z0;
        }
    }

    /* renamed from: A1 */
    public void m7209A1(int i) {
        this.f115617Z0.m75983t(i);
        this.f115620c1 = true;
    }

    /* renamed from: B1 */
    public void m7208B1(int i) {
        if (i > -1) {
            this.f115613V0 = -1.0f;
            this.f115614W0 = i;
            this.f115615X0 = -1;
        }
    }

    /* renamed from: C1 */
    public void m7207C1(int i) {
        if (i > -1) {
            this.f115613V0 = -1.0f;
            this.f115614W0 = -1;
            this.f115615X0 = i;
        }
    }

    /* renamed from: D1 */
    public void m7206D1(float f) {
        if (f > -1.0f) {
            this.f115613V0 = f;
            this.f115614W0 = -1;
            this.f115615X0 = -1;
        }
    }

    /* renamed from: E1 */
    public void m7205E1(int i) {
        if (this.f115618a1 == i) {
            return;
        }
        this.f115618a1 = i;
        this.f91882Z.clear();
        if (this.f115618a1 == 1) {
            this.f115617Z0 = this.f91869Q;
        } else {
            this.f115617Z0 = this.f91871R;
        }
        this.f91882Z.add(this.f115617Z0);
        int length = this.f91881Y.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f91881Y[i2] = this.f115617Z0;
        }
    }

    @Override // p000.C43042iz0
    /* renamed from: g */
    public void mo7204g(C34342Lr2 c34342Lr2, boolean z) {
        boolean z2;
        C43635jz0 c43635jz0 = (C43635jz0) m31414M();
        if (c43635jz0 == null) {
            return;
        }
        C37211Xy0 mo7200q = c43635jz0.mo7200q(C37211Xy0.EnumC9561b.LEFT);
        C37211Xy0 mo7200q2 = c43635jz0.mo7200q(C37211Xy0.EnumC9561b.RIGHT);
        C43042iz0 c43042iz0 = this.f91888c0;
        boolean z3 = true;
        if (c43042iz0 != null && c43042iz0.f91886b0[0] == C43042iz0.EnumC24677b.WRAP_CONTENT) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f115618a1 == 0) {
            mo7200q = c43635jz0.mo7200q(C37211Xy0.EnumC9561b.TOP);
            mo7200q2 = c43635jz0.mo7200q(C37211Xy0.EnumC9561b.BOTTOM);
            C43042iz0 c43042iz02 = this.f91888c0;
            if (c43042iz02 == null || c43042iz02.f91886b0[1] != C43042iz0.EnumC24677b.WRAP_CONTENT) {
                z3 = false;
            }
            z2 = z3;
        }
        if (this.f115620c1 && this.f115617Z0.m75989n()) {
            C48017rN5 m96275q = c34342Lr2.m96275q(this.f115617Z0);
            c34342Lr2.m96286f(m96275q, this.f115617Z0.m75998e());
            if (this.f115614W0 != -1) {
                if (z2) {
                    c34342Lr2.m96284h(c34342Lr2.m96275q(mo7200q2), m96275q, 0, 5);
                }
            } else if (this.f115615X0 != -1 && z2) {
                C48017rN5 m96275q2 = c34342Lr2.m96275q(mo7200q2);
                c34342Lr2.m96284h(m96275q, c34342Lr2.m96275q(mo7200q), 0, 5);
                c34342Lr2.m96284h(m96275q2, m96275q, 0, 5);
            }
            this.f115620c1 = false;
        } else if (this.f115614W0 != -1) {
            C48017rN5 m96275q3 = c34342Lr2.m96275q(this.f115617Z0);
            c34342Lr2.m96287e(m96275q3, c34342Lr2.m96275q(mo7200q), this.f115614W0, 8);
            if (z2) {
                c34342Lr2.m96284h(c34342Lr2.m96275q(mo7200q2), m96275q3, 0, 5);
            }
        } else if (this.f115615X0 != -1) {
            C48017rN5 m96275q4 = c34342Lr2.m96275q(this.f115617Z0);
            C48017rN5 m96275q5 = c34342Lr2.m96275q(mo7200q2);
            c34342Lr2.m96287e(m96275q4, m96275q5, -this.f115615X0, 8);
            if (z2) {
                c34342Lr2.m96284h(m96275q4, c34342Lr2.m96275q(mo7200q), 0, 5);
                c34342Lr2.m96284h(m96275q5, m96275q4, 0, 5);
            }
        } else if (this.f115613V0 != -1.0f) {
            c34342Lr2.m96288d(C34342Lr2.m96273s(c34342Lr2, c34342Lr2.m96275q(this.f115617Z0), c34342Lr2.m96275q(mo7200q2), this.f115613V0));
        }
    }

    @Override // p000.C43042iz0
    /* renamed from: h */
    public boolean mo7203h() {
        return true;
    }

    @Override // p000.C43042iz0
    /* renamed from: n */
    public void mo7202n(C43042iz0 c43042iz0, HashMap<C43042iz0, C43042iz0> hashMap) {
        super.mo7202n(c43042iz0, hashMap);
        C50895wE1 c50895wE1 = (C50895wE1) c43042iz0;
        this.f115613V0 = c50895wE1.f115613V0;
        this.f115614W0 = c50895wE1.f115614W0;
        this.f115615X0 = c50895wE1.f115615X0;
        this.f115616Y0 = c50895wE1.f115616Y0;
        m7205E1(c50895wE1.f115618a1);
    }

    @Override // p000.C43042iz0
    /* renamed from: p0 */
    public boolean mo7201p0() {
        return this.f115620c1;
    }

    @Override // p000.C43042iz0
    /* renamed from: q */
    public C37211Xy0 mo7200q(C37211Xy0.EnumC9561b enumC9561b) {
        int i = C29812a.f115621a[enumC9561b.ordinal()];
        if (i != 1 && i != 2) {
            if ((i == 3 || i == 4) && this.f115618a1 == 0) {
                return this.f115617Z0;
            }
            return null;
        } else if (this.f115618a1 == 1) {
            return this.f115617Z0;
        } else {
            return null;
        }
    }

    @Override // p000.C43042iz0
    /* renamed from: q0 */
    public boolean mo7199q0() {
        return this.f115620c1;
    }

    @Override // p000.C43042iz0
    /* renamed from: u1 */
    public void mo7198u1(C34342Lr2 c34342Lr2, boolean z) {
        if (m31414M() == null) {
            return;
        }
        int m96267y = c34342Lr2.m96267y(this.f115617Z0);
        if (this.f115618a1 == 1) {
            m31346q1(m96267y);
            m31343r1(0);
            m31407P0(m31414M().m31328z());
            m31349o1(0);
            return;
        }
        m31346q1(0);
        m31343r1(m96267y);
        m31349o1(m31414M().m31391Y());
        m31407P0(0);
    }

    /* renamed from: v1 */
    public C37211Xy0 m7197v1() {
        return this.f115617Z0;
    }

    /* renamed from: w1 */
    public int m7196w1() {
        return this.f115618a1;
    }

    /* renamed from: x1 */
    public int m7195x1() {
        return this.f115614W0;
    }

    /* renamed from: y1 */
    public int m7194y1() {
        return this.f115615X0;
    }

    /* renamed from: z1 */
    public float m7193z1() {
        return this.f115613V0;
    }
}
