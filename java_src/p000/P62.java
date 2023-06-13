package p000;

import java.lang.reflect.Array;
/* renamed from: P62 */
/* loaded from: classes8.dex */
public class P62 implements Cloneable {

    /* renamed from: b */
    public int[][] f27898b = (int[][]) Array.newInstance(Integer.TYPE, 3, 3);

    public P62() {
        m90808n(-1);
    }

    /* renamed from: l */
    public static boolean m90810l(int i) {
        return i >= 0 || i == -2;
    }

    /* renamed from: d */
    public boolean m90817d() {
        if (m90810l(this.f27898b[0][0])) {
            int[] iArr = this.f27898b[2];
            return iArr[0] == -1 && iArr[1] == -1;
        }
        return false;
    }

    /* renamed from: e */
    public boolean m90816e() {
        boolean z;
        if (!m90810l(this.f27898b[0][0]) && !m90810l(this.f27898b[0][1]) && !m90810l(this.f27898b[1][0]) && !m90810l(this.f27898b[1][1])) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        int[] iArr = this.f27898b[2];
        if (iArr[0] != -1 || iArr[1] != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m90815f(int i, int i2) {
        if ((i == 0 && i2 == 1) || ((i == 0 && i2 == 2) || (i == 1 && i2 == 2))) {
            if (m90810l(this.f27898b[0][0]) && m90810l(this.f27898b[0][2])) {
                return true;
            }
            return false;
        } else if ((i == 1 && i2 == 0) || ((i == 2 && i2 == 0) || (i == 2 && i2 == 1))) {
            if (m90810l(this.f27898b[0][0]) && m90810l(this.f27898b[2][0])) {
                return true;
            }
            return false;
        } else if (i == 1 && i2 == 1 && this.f27898b[0][0] == 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: g */
    public boolean m90814g() {
        int[][] iArr = this.f27898b;
        int[] iArr2 = iArr[0];
        if (iArr2[0] == -1 && iArr2[1] == -1) {
            int[] iArr3 = iArr[1];
            return iArr3[0] == -1 && iArr3[1] == -1;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m90813h() {
        return !m90814g();
    }

    /* renamed from: j */
    public boolean m90812j(int i, int i2) {
        if ((i == 0 && i2 == 0) || (i == 2 && i2 == 2)) {
            if (m90810l(this.f27898b[0][0]) && m90810l(this.f27898b[0][2]) && m90810l(this.f27898b[2][0])) {
                return true;
            }
            return false;
        } else if (i != 1 || i2 != 1) {
            return false;
        } else {
            int[] iArr = this.f27898b[0];
            if (iArr[0] == 1 && m90810l(iArr[2]) && m90810l(this.f27898b[2][0])) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: k */
    public boolean m90811k(int i, int i2) {
        if (i > i2) {
            return m90811k(i2, i);
        }
        if ((i != 2 || i2 != 2) && ((i != 1 || i2 != 1) && ((i != 1 || i2 != 2) && ((i != 0 || i2 != 2) && (i != 0 || i2 != 1))))) {
            return false;
        }
        int[] iArr = this.f27898b[0];
        if (iArr[0] != -1) {
            return false;
        }
        if (!m90810l(iArr[1]) && !m90810l(this.f27898b[1][0]) && !m90810l(this.f27898b[1][1])) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public void m90809m(int i, int i2, int i3) {
        this.f27898b[i][i2] = i3;
    }

    /* renamed from: n */
    public void m90808n(int i) {
        for (int i2 = 0; i2 < 3; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                this.f27898b[i2][i3] = i;
            }
        }
    }

    /* renamed from: o */
    public void m90807o(int i, int i2, int i3) {
        int[] iArr = this.f27898b[i];
        if (iArr[i2] < i3) {
            iArr[i2] = i3;
        }
    }

    /* renamed from: p */
    public void m90806p(String str) {
        for (int i = 0; i < str.length(); i++) {
            m90807o(i / 3, i % 3, W31.m78887b(str.charAt(i)));
        }
    }

    /* renamed from: q */
    public void m90805q(int i, int i2, int i3) {
        if (i < 0 || i2 < 0) {
            return;
        }
        m90807o(i, i2, i3);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("123456789");
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                sb.setCharAt((i * 3) + i2, W31.m78888a(this.f27898b[i][i2]));
            }
        }
        return sb.toString();
    }
}
