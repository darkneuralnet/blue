package p000;
/* renamed from: wV2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51049wV2 {

    /* renamed from: a */
    public final C50456vV2 f116051a;

    /* renamed from: b */
    public final int[] f116052b;

    public C51049wV2(C50456vV2 c50456vV2, int[] iArr) {
        if (iArr.length != 0) {
            this.f116051a = c50456vV2;
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i = 1;
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.f116052b = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i];
                this.f116052b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
                return;
            }
            this.f116052b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C51049wV2 m6778a(C51049wV2 c51049wV2) {
        if (this.f116051a.equals(c51049wV2.f116051a)) {
            if (m6774e()) {
                return c51049wV2;
            }
            if (c51049wV2.m6774e()) {
                return this;
            }
            int[] iArr = this.f116052b;
            int[] iArr2 = c51049wV2.f116052b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = this.f116051a.m8593a(iArr2[i - length], iArr[i]);
            }
            return new C51049wV2(this.f116051a, iArr3);
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    /* renamed from: b */
    public int m6777b(int i) {
        if (i == 0) {
            return m6776c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.f116052b) {
                i2 = this.f116051a.m8593a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.f116052b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            C50456vV2 c50456vV2 = this.f116051a;
            i4 = c50456vV2.m8593a(c50456vV2.m8585i(i, i4), this.f116052b[i5]);
        }
        return i4;
    }

    /* renamed from: c */
    public int m6776c(int i) {
        int[] iArr = this.f116052b;
        return iArr[(iArr.length - 1) - i];
    }

    /* renamed from: d */
    public int m6775d() {
        return this.f116052b.length - 1;
    }

    /* renamed from: e */
    public boolean m6774e() {
        return this.f116052b[0] == 0;
    }

    /* renamed from: f */
    public C51049wV2 m6773f(int i) {
        if (i == 0) {
            return this.f116051a.m8588f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f116052b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f116051a.m8585i(this.f116052b[i2], i);
        }
        return new C51049wV2(this.f116051a, iArr);
    }

    /* renamed from: g */
    public C51049wV2 m6772g(C51049wV2 c51049wV2) {
        if (this.f116051a.equals(c51049wV2.f116051a)) {
            if (!m6774e() && !c51049wV2.m6774e()) {
                int[] iArr = this.f116052b;
                int length = iArr.length;
                int[] iArr2 = c51049wV2.f116052b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        C50456vV2 c50456vV2 = this.f116051a;
                        iArr3[i4] = c50456vV2.m8593a(iArr3[i4], c50456vV2.m8585i(i2, iArr2[i3]));
                    }
                }
                return new C51049wV2(this.f116051a, iArr3);
            }
            return this.f116051a.m8588f();
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    /* renamed from: h */
    public C51049wV2 m6771h(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f116051a.m8588f();
            }
            int length = this.f116052b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f116051a.m8585i(this.f116052b[i3], i2);
            }
            return new C51049wV2(this.f116051a, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public C51049wV2 m6770i() {
        int length = this.f116052b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f116051a.m8584j(0, this.f116052b[i]);
        }
        return new C51049wV2(this.f116051a, iArr);
    }

    /* renamed from: j */
    public C51049wV2 m6769j(C51049wV2 c51049wV2) {
        if (this.f116051a.equals(c51049wV2.f116051a)) {
            if (c51049wV2.m6774e()) {
                return this;
            }
            return m6778a(c51049wV2.m6770i());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(m6775d() * 8);
        for (int m6775d = m6775d(); m6775d >= 0; m6775d--) {
            int m6776c = m6776c(m6775d);
            if (m6776c != 0) {
                if (m6776c < 0) {
                    sb.append(" - ");
                    m6776c = -m6776c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (m6775d == 0 || m6776c != 1) {
                    sb.append(m6776c);
                }
                if (m6775d != 0) {
                    if (m6775d == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(m6775d);
                    }
                }
            }
        }
        return sb.toString();
    }
}
