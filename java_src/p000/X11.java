package p000;
/* renamed from: X11 */
/* loaded from: classes6.dex */
public final class X11 extends W11 {

    /* renamed from: c */
    public final boolean f42529c;

    public X11(C50758w00 c50758w00, boolean z) {
        super(c50758w00);
        this.f42529c = z;
    }

    /* renamed from: g */
    public void m77546g(C7615Sx c7615Sx) {
        C40900fN4 m7575i;
        C40900fN4 m7581c;
        boolean z;
        C36158Tl0[] m78928d = m78928d();
        m77540m();
        m77541l(m78928d, c7615Sx);
        C50758w00 m78931a = m78931a();
        if (this.f42529c) {
            m7575i = m78931a.m7576h();
        } else {
            m7575i = m78931a.m7575i();
        }
        if (this.f42529c) {
            m7581c = m78931a.m7582b();
        } else {
            m7581c = m78931a.m7581c();
        }
        int m78927e = m78927e((int) m7581c.m41470d());
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int m78927e2 = m78927e((int) m7575i.m41470d()); m78927e2 < m78927e; m78927e2++) {
            C36158Tl0 c36158Tl0 = m78928d[m78927e2];
            if (c36158Tl0 != null) {
                int m83011c = c36158Tl0.m83011c() - i;
                if (m83011c == 0) {
                    i2++;
                } else {
                    if (m83011c == 1) {
                        i3 = Math.max(i3, i2);
                        i = c36158Tl0.m83011c();
                    } else if (m83011c >= 0 && c36158Tl0.m83011c() < c7615Sx.m84586c() && m83011c <= m78927e2) {
                        if (i3 > 2) {
                            m83011c *= i3 - 2;
                        }
                        if (m83011c >= m78927e2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        for (int i4 = 1; i4 <= m83011c && !z; i4++) {
                            if (m78928d[m78927e2 - i4] != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            m78928d[m78927e2] = null;
                        } else {
                            i = c36158Tl0.m83011c();
                        }
                    } else {
                        m78928d[m78927e2] = null;
                    }
                    i2 = 1;
                }
            }
        }
    }

    /* renamed from: h */
    public final void m77545h(C7615Sx c7615Sx) {
        C40900fN4 m7575i;
        C40900fN4 m7581c;
        C50758w00 m78931a = m78931a();
        if (this.f42529c) {
            m7575i = m78931a.m7576h();
        } else {
            m7575i = m78931a.m7575i();
        }
        if (this.f42529c) {
            m7581c = m78931a.m7582b();
        } else {
            m7581c = m78931a.m7581c();
        }
        int m78927e = m78927e((int) m7581c.m41470d());
        C36158Tl0[] m78928d = m78928d();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int m78927e2 = m78927e((int) m7575i.m41470d()); m78927e2 < m78927e; m78927e2++) {
            C36158Tl0 c36158Tl0 = m78928d[m78927e2];
            if (c36158Tl0 != null) {
                c36158Tl0.m83004j();
                int m83011c = c36158Tl0.m83011c() - i;
                if (m83011c == 0) {
                    i2++;
                } else {
                    if (m83011c == 1) {
                        i3 = Math.max(i3, i2);
                        i = c36158Tl0.m83011c();
                    } else if (c36158Tl0.m83011c() >= c7615Sx.m84586c()) {
                        m78928d[m78927e2] = null;
                    } else {
                        i = c36158Tl0.m83011c();
                    }
                    i2 = 1;
                }
            }
        }
    }

    /* renamed from: i */
    public C7615Sx m77544i() {
        C36158Tl0[] m78928d = m78928d();
        C30789yy c30789yy = new C30789yy();
        C30789yy c30789yy2 = new C30789yy();
        C30789yy c30789yy3 = new C30789yy();
        C30789yy c30789yy4 = new C30789yy();
        for (C36158Tl0 c36158Tl0 : m78928d) {
            if (c36158Tl0 != null) {
                c36158Tl0.m83004j();
                int m83009e = c36158Tl0.m83009e() % 30;
                int m83011c = c36158Tl0.m83011c();
                if (!this.f42529c) {
                    m83011c += 2;
                }
                int i = m83011c % 3;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c30789yy.m2206b(m83009e + 1);
                        }
                    } else {
                        c30789yy4.m2206b(m83009e / 3);
                        c30789yy3.m2206b(m83009e % 3);
                    }
                } else {
                    c30789yy2.m2206b((m83009e * 3) + 1);
                }
            }
        }
        if (c30789yy.m2207a().length != 0 && c30789yy2.m2207a().length != 0 && c30789yy3.m2207a().length != 0 && c30789yy4.m2207a().length != 0 && c30789yy.m2207a()[0] > 0 && c30789yy2.m2207a()[0] + c30789yy3.m2207a()[0] >= 3 && c30789yy2.m2207a()[0] + c30789yy3.m2207a()[0] <= 90) {
            C7615Sx c7615Sx = new C7615Sx(c30789yy.m2207a()[0], c30789yy2.m2207a()[0], c30789yy3.m2207a()[0], c30789yy4.m2207a()[0]);
            m77541l(m78928d, c7615Sx);
            return c7615Sx;
        }
        return null;
    }

    /* renamed from: j */
    public int[] m77543j() {
        C36158Tl0[] m78928d;
        int m83011c;
        C7615Sx m77544i = m77544i();
        if (m77544i == null) {
            return null;
        }
        m77545h(m77544i);
        int m84586c = m77544i.m84586c();
        int[] iArr = new int[m84586c];
        for (C36158Tl0 c36158Tl0 : m78928d()) {
            if (c36158Tl0 != null && (m83011c = c36158Tl0.m83011c()) < m84586c) {
                iArr[m83011c] = iArr[m83011c] + 1;
            }
        }
        return iArr;
    }

    /* renamed from: k */
    public boolean m77542k() {
        return this.f42529c;
    }

    /* renamed from: l */
    public final void m77541l(C36158Tl0[] c36158Tl0Arr, C7615Sx c7615Sx) {
        for (int i = 0; i < c36158Tl0Arr.length; i++) {
            C36158Tl0 c36158Tl0 = c36158Tl0Arr[i];
            if (c36158Tl0 != null) {
                int m83009e = c36158Tl0.m83009e() % 30;
                int m83011c = c36158Tl0.m83011c();
                if (m83011c > c7615Sx.m84586c()) {
                    c36158Tl0Arr[i] = null;
                } else {
                    if (!this.f42529c) {
                        m83011c += 2;
                    }
                    int i2 = m83011c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && m83009e + 1 != c7615Sx.m84588a()) {
                                c36158Tl0Arr[i] = null;
                            }
                        } else if (m83009e / 3 != c7615Sx.m84587b() || m83009e % 3 != c7615Sx.m84585d()) {
                            c36158Tl0Arr[i] = null;
                        }
                    } else if ((m83009e * 3) + 1 != c7615Sx.m84584e()) {
                        c36158Tl0Arr[i] = null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final void m77540m() {
        C36158Tl0[] m78928d;
        for (C36158Tl0 c36158Tl0 : m78928d()) {
            if (c36158Tl0 != null) {
                c36158Tl0.m83004j();
            }
        }
    }

    @Override // p000.W11
    public String toString() {
        return "IsLeft: " + this.f42529c + '\n' + super.toString();
    }
}
