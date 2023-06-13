package p000;
/* renamed from: Q56 */
/* loaded from: classes8.dex */
public class Q56 {

    /* renamed from: a */
    public int[] f29821a;

    public Q56(int i, int i2, int i3) {
        m88933d(3);
        int[] iArr = this.f29821a;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
    }

    /* renamed from: a */
    public boolean m88936a(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f29821a;
            if (i2 < iArr.length) {
                if (iArr[i2] != i) {
                    return false;
                }
                i2++;
            } else {
                return true;
            }
        }
    }

    /* renamed from: b */
    public void m88935b() {
        int[] iArr = this.f29821a;
        if (iArr.length <= 1) {
            return;
        }
        int i = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = i;
    }

    /* renamed from: c */
    public int m88934c(int i) {
        int[] iArr = this.f29821a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: d */
    public final void m88933d(int i) {
        this.f29821a = new int[i];
        m88927j(-1);
    }

    /* renamed from: e */
    public boolean m88932e() {
        int i = 0;
        while (true) {
            int[] iArr = this.f29821a;
            if (i >= iArr.length) {
                return false;
            }
            if (iArr[i] == -1) {
                return true;
            }
            i++;
        }
    }

    /* renamed from: f */
    public boolean m88931f() {
        return this.f29821a.length > 1;
    }

    /* renamed from: g */
    public boolean m88930g() {
        return this.f29821a.length == 1;
    }

    /* renamed from: h */
    public boolean m88929h() {
        int i = 0;
        while (true) {
            int[] iArr = this.f29821a;
            if (i < iArr.length) {
                if (iArr[i] != -1) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    /* renamed from: i */
    public void m88928i(Q56 q56) {
        int length = q56.f29821a.length;
        int[] iArr = this.f29821a;
        int i = 0;
        if (length > iArr.length) {
            this.f29821a = new int[]{iArr[0], -1, -1};
        }
        while (true) {
            int[] iArr2 = this.f29821a;
            if (i < iArr2.length) {
                if (iArr2[i] == -1) {
                    int[] iArr3 = q56.f29821a;
                    if (i < iArr3.length) {
                        iArr2[i] = iArr3[i];
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: j */
    public void m88927j(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f29821a;
            if (i2 < iArr.length) {
                iArr[i2] = i;
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public void m88926k(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f29821a;
            if (i2 < iArr.length) {
                if (iArr[i2] == -1) {
                    iArr[i2] = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    public void m88925l(int i) {
        m88924m(0, i);
    }

    /* renamed from: m */
    public void m88924m(int i, int i2) {
        this.f29821a[i] = i2;
    }

    /* renamed from: n */
    public void m88923n(int i, int i2, int i3) {
        int[] iArr = this.f29821a;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int[] iArr = this.f29821a;
        if (iArr.length > 1) {
            stringBuffer.append(C36484Uv2.m80634a(iArr[1]));
        }
        stringBuffer.append(C36484Uv2.m80634a(this.f29821a[0]));
        int[] iArr2 = this.f29821a;
        if (iArr2.length > 1) {
            stringBuffer.append(C36484Uv2.m80634a(iArr2[2]));
        }
        return stringBuffer.toString();
    }

    public Q56(int i) {
        m88933d(1);
        this.f29821a[0] = i;
    }

    public Q56(Q56 q56) {
        m88933d(q56.f29821a.length);
        int i = 0;
        while (true) {
            int[] iArr = this.f29821a;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = q56.f29821a[i];
            i++;
        }
    }
}
