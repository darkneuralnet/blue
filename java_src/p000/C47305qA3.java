package p000;
/* renamed from: qA3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C47305qA3 {

    /* renamed from: k */
    public static int f104818k = -1;

    /* renamed from: a */
    public int f104819a = -1;

    /* renamed from: b */
    public boolean f104820b = false;

    /* renamed from: c */
    public int f104821c;

    /* renamed from: d */
    public int f104822d;

    /* renamed from: e */
    public int f104823e;

    /* renamed from: f */
    public int f104824f;

    /* renamed from: g */
    public boolean f104825g;

    /* renamed from: h */
    public int f104826h;

    /* renamed from: i */
    public int f104827i;

    /* renamed from: j */
    public int f104828j;

    public C47305qA3() {
        int i = f104818k;
        this.f104821c = i;
        this.f104822d = i;
        this.f104823e = i;
        this.f104824f = -1;
        this.f104825g = false;
        this.f104826h = i;
        this.f104827i = i;
        this.f104828j = i;
    }

    /* renamed from: B */
    public static char m18031B(boolean z) {
        return z ? 'h' : 's';
    }

    /* renamed from: b */
    public static char m18025b(int i) {
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? '#' : 'C';
            }
            return 'B';
        }
        return 'L';
    }

    /* renamed from: A */
    public final String m18032A(int i, boolean z) {
        int i2;
        boolean z2;
        int i3;
        StringBuilder sb = new StringBuilder();
        if (m18016k(i)) {
            sb.append(C36484Uv2.m80634a(m18023d(i, 1, z)));
            sb.append(C36484Uv2.m80634a(m18023d(i, 2, z)));
        } else {
            if (i == 0) {
                i2 = this.f104823e;
            } else {
                i2 = this.f104828j;
            }
            sb.append(C36484Uv2.m80634a(i2));
        }
        if (m18006u(i)) {
            if (i == 0) {
                i3 = this.f104819a;
            } else {
                i3 = this.f104824f;
            }
            sb.append(m18025b(i3));
        }
        if (m18010q(i)) {
            if (i == 0) {
                z2 = this.f104820b;
            } else {
                z2 = this.f104825g;
            }
            sb.append(m18031B(z2));
        }
        return sb.toString();
    }

    /* renamed from: C */
    public void m18030C(int i, int i2) {
        if (i == 0) {
            this.f104823e = i2;
            this.f104821c = i2;
            this.f104822d = i2;
            return;
        }
        this.f104828j = i2;
        this.f104826h = i2;
        this.f104827i = i2;
    }

    /* renamed from: D */
    public void m18029D(int i) {
        int i2;
        if (m18008s(i)) {
            i2 = 0;
        } else {
            i2 = 2;
        }
        if (i == 0) {
            this.f104823e = i2;
        } else {
            this.f104828j = i2;
        }
    }

    /* renamed from: E */
    public void m18028E(int i, int i2) {
        if (i == 0) {
            this.f104823e = i2;
        } else {
            this.f104828j = i2;
        }
    }

    /* renamed from: F */
    public String m18027F(boolean z) {
        return "A:" + m18032A(0, z) + "/B:" + m18032A(1, z);
    }

    /* renamed from: a */
    public int m18026a(int i) {
        if (i == 0) {
            return this.f104819a;
        }
        return this.f104824f;
    }

    /* renamed from: c */
    public int m18024c(int i) {
        if (i == 0) {
            return this.f104823e;
        }
        return this.f104828j;
    }

    /* renamed from: d */
    public int m18023d(int i, int i2, boolean z) {
        if (i == 0) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (z) {
                            return this.f104822d;
                        }
                        return this.f104821c;
                    }
                } else if (z) {
                    return this.f104821c;
                } else {
                    return this.f104822d;
                }
            } else {
                return this.f104823e;
            }
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return f104818k;
                }
                if (z) {
                    return this.f104827i;
                }
                return this.f104826h;
            } else if (z) {
                return this.f104826h;
            } else {
                return this.f104827i;
            }
        }
        return this.f104828j;
    }

    /* renamed from: e */
    public int m18022e(int i, int i2, boolean z) {
        if (m18016k(i)) {
            return m18023d(i, i2, z);
        }
        return m18024c(i);
    }

    /* renamed from: f */
    public boolean m18021f(int i) {
        if (i == 0) {
            int i2 = this.f104821c;
            int i3 = f104818k;
            if (i2 == i3 && this.f104822d == i3) {
                return false;
            }
            return true;
        }
        int i4 = this.f104826h;
        int i5 = f104818k;
        if (i4 == i5 && this.f104827i == i5) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void m18020g(int i, int i2, int i3, boolean z) {
        if (i == 0) {
            this.f104819a = 2;
            this.f104820b = z;
            this.f104821c = i2;
            this.f104822d = i3;
            this.f104823e = 0;
            return;
        }
        this.f104824f = 2;
        this.f104825g = z;
        this.f104826h = i2;
        this.f104827i = i3;
        this.f104828j = 0;
    }

    /* renamed from: h */
    public void m18019h(int i, boolean z) {
        if (i == 0) {
            this.f104819a = 3;
            this.f104820b = z;
            return;
        }
        this.f104824f = 3;
        this.f104825g = z;
    }

    /* renamed from: i */
    public void m18018i(int i) {
        if (i == 0) {
            this.f104819a = 1;
            this.f104823e = f104818k;
            return;
        }
        this.f104824f = 1;
        this.f104828j = f104818k;
    }

    /* renamed from: j */
    public void m18017j(int i) {
        if (i == 0) {
            this.f104819a = -1;
        } else {
            this.f104824f = -1;
        }
    }

    /* renamed from: k */
    public boolean m18016k(int i) {
        if (i == 0) {
            if (this.f104819a == 2) {
                return true;
            }
            return false;
        } else if (this.f104824f == 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: l */
    public boolean m18015l() {
        return this.f104819a == 2 && this.f104824f == 2;
    }

    /* renamed from: m */
    public boolean m18014m() {
        if (m18005v()) {
            return false;
        }
        return !m18015l();
    }

    /* renamed from: n */
    public boolean m18013n() {
        return this.f104819a == 2 || this.f104824f == 2;
    }

    /* renamed from: o */
    public boolean m18012o() {
        int i = this.f104819a;
        if (i == 2 && this.f104824f == -1) {
            return true;
        }
        if (this.f104824f == 2 && i == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean m18011p() {
        if (!m18015l() || m18023d(0, 2, true) == m18023d(1, 2, true)) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public boolean m18010q(int i) {
        return m18026a(i) == 3;
    }

    /* renamed from: r */
    public boolean m18009r() {
        int i = this.f104819a;
        if (i == 3 && this.f104824f == -1 && this.f104828j == 0) {
            return true;
        }
        if (this.f104824f == 3 && i == -1 && this.f104823e == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public boolean m18008s(int i) {
        if (i == 0) {
            return this.f104820b;
        }
        return this.f104825g;
    }

    /* renamed from: t */
    public boolean m18007t() {
        if (this.f104819a == 3 && this.f104823e == 0) {
            return true;
        }
        if (this.f104824f == 3 && this.f104828j == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return m18027F(true);
    }

    /* renamed from: u */
    public boolean m18006u(int i) {
        if (i == 0) {
            if (this.f104819a != -1) {
                return true;
            }
            return false;
        } else if (this.f104824f != -1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: v */
    public boolean m18005v() {
        return this.f104819a == 1 || this.f104824f == 1;
    }

    /* renamed from: w */
    public boolean m18004w(int i) {
        if (i == 0) {
            if (this.f104819a != 1) {
                return false;
            }
            return true;
        } else if (this.f104824f != 1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: x */
    public boolean m18003x(int i) {
        if (i == 0) {
            if (this.f104823e == 0) {
                return true;
            }
            return false;
        } else if (this.f104828j == 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: y */
    public boolean m18002y(int i) {
        if (i == 0) {
            if (this.f104823e == f104818k) {
                return true;
            }
            return false;
        } else if (this.f104828j == f104818k) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: z */
    public boolean m18001z(int i) {
        if (i == 0) {
            int i2 = this.f104819a;
            if (i2 != 1 && i2 != 3) {
                return false;
            }
            return true;
        }
        int i3 = this.f104824f;
        if (i3 != 1 && i3 != 3) {
            return false;
        }
        return true;
    }
}
