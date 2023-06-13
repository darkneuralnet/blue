package p000;

import java.lang.reflect.Array;
/* renamed from: r01  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C47796r01 {

    /* renamed from: a */
    public int[][] f106179a = (int[][]) Array.newInstance(Integer.TYPE, 2, 3);

    public C47796r01() {
        for (int i = 0; i < 2; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                this.f106179a[i][i2] = -1;
            }
        }
    }

    /* renamed from: b */
    public static int m16699b(int i) {
        if (i == 2) {
            return 0;
        }
        return i == 0 ? 1 : -1;
    }

    /* renamed from: a */
    public void m16700a(C35926Sl2 c35926Sl2) {
        for (int i = 0; i < 2; i++) {
            for (int i2 = 1; i2 < 3; i2++) {
                int m84873e = c35926Sl2.m84873e(i, i2);
                if (m84873e == 2 || m84873e == 0) {
                    if (m16694g(i, i2)) {
                        this.f106179a[i][i2] = m16699b(m84873e);
                    } else {
                        int[] iArr = this.f106179a[i];
                        iArr[i2] = iArr[i2] + m16699b(m84873e);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public int m16698c(int i) {
        int[] iArr = this.f106179a[i];
        return iArr[2] - iArr[1];
    }

    /* renamed from: d */
    public int m16697d(int i, int i2) {
        return this.f106179a[i][i2] <= 0 ? 2 : 0;
    }

    /* renamed from: e */
    public boolean m16696e() {
        for (int i = 0; i < 2; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                if (this.f106179a[i][i2] != -1) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean m16695f(int i) {
        return this.f106179a[i][1] == -1;
    }

    /* renamed from: g */
    public boolean m16694g(int i, int i2) {
        return this.f106179a[i][i2] == -1;
    }

    /* renamed from: h */
    public void m16693h() {
        int i;
        for (int i2 = 0; i2 < 2; i2++) {
            if (!m16695f(i2)) {
                int[] iArr = this.f106179a[i2];
                int i3 = iArr[1];
                int i4 = iArr[2];
                if (i4 < i3) {
                    i3 = i4;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                for (int i5 = 1; i5 < 3; i5++) {
                    int[] iArr2 = this.f106179a[i2];
                    if (iArr2[i5] > i3) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    iArr2[i5] = i;
                }
            }
        }
    }

    public String toString() {
        return "A: " + this.f106179a[0][1] + "," + this.f106179a[0][2] + " B: " + this.f106179a[1][1] + "," + this.f106179a[1][2];
    }
}
