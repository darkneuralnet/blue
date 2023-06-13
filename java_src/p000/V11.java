package p000;

import java.util.Formatter;
/* renamed from: V11 */
/* loaded from: classes6.dex */
public final class V11 {

    /* renamed from: a */
    public final C7615Sx f38433a;

    /* renamed from: b */
    public final W11[] f38434b;

    /* renamed from: c */
    public C50758w00 f38435c;

    /* renamed from: d */
    public final int f38436d;

    public V11(C7615Sx c7615Sx, C50758w00 c50758w00) {
        this.f38433a = c7615Sx;
        int m84588a = c7615Sx.m84588a();
        this.f38436d = m84588a;
        this.f38435c = c50758w00;
        this.f38434b = new W11[m84588a + 2];
    }

    /* renamed from: b */
    public static boolean m80496b(C36158Tl0 c36158Tl0, C36158Tl0 c36158Tl02) {
        if (c36158Tl02 == null || !c36158Tl02.m83007g() || c36158Tl02.m83013a() != c36158Tl0.m83013a()) {
            return false;
        }
        c36158Tl0.m83005i(c36158Tl02.m83011c());
        return true;
    }

    /* renamed from: c */
    public static int m80495c(int i, int i2, C36158Tl0 c36158Tl0) {
        if (c36158Tl0 == null) {
            return i2;
        }
        if (!c36158Tl0.m83007g()) {
            if (c36158Tl0.m83006h(i)) {
                c36158Tl0.m83005i(i);
                return 0;
            }
            return i2 + 1;
        }
        return i2;
    }

    /* renamed from: a */
    public final void m80497a(W11 w11) {
        if (w11 != null) {
            ((X11) w11).m77546g(this.f38433a);
        }
    }

    /* renamed from: d */
    public final int m80494d() {
        int m80492f = m80492f();
        if (m80492f == 0) {
            return 0;
        }
        for (int i = 1; i < this.f38436d + 1; i++) {
            C36158Tl0[] m78928d = this.f38434b[i].m78928d();
            for (int i2 = 0; i2 < m78928d.length; i2++) {
                C36158Tl0 c36158Tl0 = m78928d[i2];
                if (c36158Tl0 != null && !c36158Tl0.m83007g()) {
                    m80493e(i, i2, m78928d);
                }
            }
        }
        return m80492f;
    }

    /* renamed from: e */
    public final void m80493e(int i, int i2, C36158Tl0[] c36158Tl0Arr) {
        C36158Tl0[] c36158Tl0Arr2;
        C36158Tl0 c36158Tl0 = c36158Tl0Arr[i2];
        C36158Tl0[] m78928d = this.f38434b[i - 1].m78928d();
        W11 w11 = this.f38434b[i + 1];
        if (w11 != null) {
            c36158Tl0Arr2 = w11.m78928d();
        } else {
            c36158Tl0Arr2 = m78928d;
        }
        C36158Tl0[] c36158Tl0Arr3 = new C36158Tl0[14];
        c36158Tl0Arr3[2] = m78928d[i2];
        c36158Tl0Arr3[3] = c36158Tl0Arr2[i2];
        if (i2 > 0) {
            int i3 = i2 - 1;
            c36158Tl0Arr3[0] = c36158Tl0Arr[i3];
            c36158Tl0Arr3[4] = m78928d[i3];
            c36158Tl0Arr3[5] = c36158Tl0Arr2[i3];
        }
        if (i2 > 1) {
            int i4 = i2 - 2;
            c36158Tl0Arr3[8] = c36158Tl0Arr[i4];
            c36158Tl0Arr3[10] = m78928d[i4];
            c36158Tl0Arr3[11] = c36158Tl0Arr2[i4];
        }
        if (i2 < c36158Tl0Arr.length - 1) {
            int i5 = i2 + 1;
            c36158Tl0Arr3[1] = c36158Tl0Arr[i5];
            c36158Tl0Arr3[6] = m78928d[i5];
            c36158Tl0Arr3[7] = c36158Tl0Arr2[i5];
        }
        if (i2 < c36158Tl0Arr.length - 2) {
            int i6 = i2 + 2;
            c36158Tl0Arr3[9] = c36158Tl0Arr[i6];
            c36158Tl0Arr3[12] = m78928d[i6];
            c36158Tl0Arr3[13] = c36158Tl0Arr2[i6];
        }
        for (int i7 = 0; i7 < 14 && !m80496b(c36158Tl0, c36158Tl0Arr3[i7]); i7++) {
        }
    }

    /* renamed from: f */
    public final int m80492f() {
        m80491g();
        return m80490h() + m80489i();
    }

    /* renamed from: g */
    public final void m80491g() {
        W11[] w11Arr = this.f38434b;
        W11 w11 = w11Arr[0];
        if (w11 != null && w11Arr[this.f38436d + 1] != null) {
            C36158Tl0[] m78928d = w11.m78928d();
            C36158Tl0[] m78928d2 = this.f38434b[this.f38436d + 1].m78928d();
            for (int i = 0; i < m78928d.length; i++) {
                C36158Tl0 c36158Tl0 = m78928d[i];
                if (c36158Tl0 != null && m78928d2[i] != null && c36158Tl0.m83011c() == m78928d2[i].m83011c()) {
                    for (int i2 = 1; i2 <= this.f38436d; i2++) {
                        C36158Tl0 c36158Tl02 = this.f38434b[i2].m78928d()[i];
                        if (c36158Tl02 != null) {
                            c36158Tl02.m83005i(m78928d[i].m83011c());
                            if (!c36158Tl02.m83007g()) {
                                this.f38434b[i2].m78928d()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final int m80490h() {
        W11 w11 = this.f38434b[0];
        if (w11 == null) {
            return 0;
        }
        C36158Tl0[] m78928d = w11.m78928d();
        int i = 0;
        for (int i2 = 0; i2 < m78928d.length; i2++) {
            C36158Tl0 c36158Tl0 = m78928d[i2];
            if (c36158Tl0 != null) {
                int m83011c = c36158Tl0.m83011c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f38436d + 1 && i3 < 2; i4++) {
                    C36158Tl0 c36158Tl02 = this.f38434b[i4].m78928d()[i2];
                    if (c36158Tl02 != null) {
                        i3 = m80495c(m83011c, i3, c36158Tl02);
                        if (!c36158Tl02.m83007g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    public final int m80489i() {
        W11[] w11Arr = this.f38434b;
        int i = this.f38436d;
        if (w11Arr[i + 1] == null) {
            return 0;
        }
        C36158Tl0[] m78928d = w11Arr[i + 1].m78928d();
        int i2 = 0;
        for (int i3 = 0; i3 < m78928d.length; i3++) {
            C36158Tl0 c36158Tl0 = m78928d[i3];
            if (c36158Tl0 != null) {
                int m83011c = c36158Tl0.m83011c();
                int i4 = 0;
                for (int i5 = this.f38436d + 1; i5 > 0 && i4 < 2; i5--) {
                    C36158Tl0 c36158Tl02 = this.f38434b[i5].m78928d()[i3];
                    if (c36158Tl02 != null) {
                        i4 = m80495c(m83011c, i4, c36158Tl02);
                        if (!c36158Tl02.m83007g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: j */
    public int m80488j() {
        return this.f38436d;
    }

    /* renamed from: k */
    public int m80487k() {
        return this.f38433a.m84587b();
    }

    /* renamed from: l */
    public int m80486l() {
        return this.f38433a.m84586c();
    }

    /* renamed from: m */
    public C50758w00 m80485m() {
        return this.f38435c;
    }

    /* renamed from: n */
    public W11 m80484n(int i) {
        return this.f38434b[i];
    }

    /* renamed from: o */
    public W11[] m80483o() {
        m80497a(this.f38434b[0]);
        m80497a(this.f38434b[this.f38436d + 1]);
        int i = 928;
        while (true) {
            int m80494d = m80494d();
            if (m80494d <= 0 || m80494d >= i) {
                break;
            }
            i = m80494d;
        }
        return this.f38434b;
    }

    /* renamed from: p */
    public void m80482p(C50758w00 c50758w00) {
        this.f38435c = c50758w00;
    }

    /* renamed from: q */
    public void m80481q(int i, W11 w11) {
        this.f38434b[i] = w11;
    }

    public String toString() {
        W11[] w11Arr = this.f38434b;
        W11 w11 = w11Arr[0];
        if (w11 == null) {
            w11 = w11Arr[this.f38436d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < w11.m78928d().length; i++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i));
                for (int i2 = 0; i2 < this.f38436d + 2; i2++) {
                    W11 w112 = this.f38434b[i2];
                    if (w112 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        C36158Tl0 c36158Tl0 = w112.m78928d()[i];
                        if (c36158Tl0 == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(c36158Tl0.m83011c()), Integer.valueOf(c36158Tl0.m83009e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        formatter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
