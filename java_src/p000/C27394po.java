package p000;

import java.util.Arrays;
import p000.C30303xo;
/* renamed from: po */
/* loaded from: classes.dex */
public class C27394po implements C30303xo.InterfaceC30304a {

    /* renamed from: l */
    public static float f104101l = 0.001f;

    /* renamed from: b */
    public final C30303xo f104103b;

    /* renamed from: c */
    public final C38370b80 f104104c;

    /* renamed from: a */
    public int f104102a = 0;

    /* renamed from: d */
    public int f104105d = 8;

    /* renamed from: e */
    public C48017rN5 f104106e = null;

    /* renamed from: f */
    public int[] f104107f = new int[8];

    /* renamed from: g */
    public int[] f104108g = new int[8];

    /* renamed from: h */
    public float[] f104109h = new float[8];

    /* renamed from: i */
    public int f104110i = -1;

    /* renamed from: j */
    public int f104111j = -1;

    /* renamed from: k */
    public boolean f104112k = false;

    public C27394po(C30303xo c30303xo, C38370b80 c38370b80) {
        this.f104103b = c30303xo;
        this.f104104c = c38370b80;
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: a */
    public boolean mo4662a(C48017rN5 c48017rN5) {
        int i = this.f104110i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f104102a; i2++) {
            if (this.f104107f[i] == c48017rN5.f106919d) {
                return true;
            }
            i = this.f104108g[i];
        }
        return false;
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: b */
    public C48017rN5 mo4661b(int i) {
        int i2 = this.f104110i;
        for (int i3 = 0; i2 != -1 && i3 < this.f104102a; i3++) {
            if (i3 == i) {
                return this.f104104c.f56963d[this.f104107f[i2]];
            }
            i2 = this.f104108g[i2];
        }
        return null;
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: c */
    public float mo4660c(C30303xo c30303xo, boolean z) {
        float mo4655h = mo4655h(c30303xo.f118136a);
        mo4652k(c30303xo.f118136a, z);
        C30303xo.InterfaceC30304a interfaceC30304a = c30303xo.f118140e;
        int mo4654i = interfaceC30304a.mo4654i();
        for (int i = 0; i < mo4654i; i++) {
            C48017rN5 mo4661b = interfaceC30304a.mo4661b(i);
            mo4659d(mo4661b, interfaceC30304a.mo4655h(mo4661b) * mo4655h, z);
        }
        return mo4655h;
    }

    @Override // p000.C30303xo.InterfaceC30304a
    public final void clear() {
        int i = this.f104110i;
        for (int i2 = 0; i != -1 && i2 < this.f104102a; i2++) {
            C48017rN5 c48017rN5 = this.f104104c.f56963d[this.f104107f[i]];
            if (c48017rN5 != null) {
                c48017rN5.m16023d(this.f104103b);
            }
            i = this.f104108g[i];
        }
        this.f104110i = -1;
        this.f104111j = -1;
        this.f104112k = false;
        this.f104102a = 0;
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: d */
    public void mo4659d(C48017rN5 c48017rN5, float f, boolean z) {
        float f2 = f104101l;
        if (f > (-f2) && f < f2) {
            return;
        }
        int i = this.f104110i;
        if (i == -1) {
            this.f104110i = 0;
            this.f104109h[0] = f;
            this.f104107f[0] = c48017rN5.f106919d;
            this.f104108g[0] = -1;
            c48017rN5.f106929n++;
            c48017rN5.m16026a(this.f104103b);
            this.f104102a++;
            if (!this.f104112k) {
                int i2 = this.f104111j + 1;
                this.f104111j = i2;
                int[] iArr = this.f104107f;
                if (i2 >= iArr.length) {
                    this.f104112k = true;
                    this.f104111j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f104102a; i4++) {
            int i5 = this.f104107f[i];
            int i6 = c48017rN5.f106919d;
            if (i5 == i6) {
                float[] fArr = this.f104109h;
                float f3 = fArr[i] + f;
                float f4 = f104101l;
                if (f3 > (-f4) && f3 < f4) {
                    f3 = 0.0f;
                }
                fArr[i] = f3;
                if (f3 == 0.0f) {
                    if (i == this.f104110i) {
                        this.f104110i = this.f104108g[i];
                    } else {
                        int[] iArr2 = this.f104108g;
                        iArr2[i3] = iArr2[i];
                    }
                    if (z) {
                        c48017rN5.m16023d(this.f104103b);
                    }
                    if (this.f104112k) {
                        this.f104111j = i;
                    }
                    c48017rN5.f106929n--;
                    this.f104102a--;
                    return;
                }
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f104108g[i];
        }
        int i7 = this.f104111j;
        int i8 = i7 + 1;
        if (this.f104112k) {
            int[] iArr3 = this.f104107f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f104107f;
        if (i7 >= iArr4.length && this.f104102a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f104107f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f104107f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f104105d * 2;
            this.f104105d = i10;
            this.f104112k = false;
            this.f104111j = i7 - 1;
            this.f104109h = Arrays.copyOf(this.f104109h, i10);
            this.f104107f = Arrays.copyOf(this.f104107f, this.f104105d);
            this.f104108g = Arrays.copyOf(this.f104108g, this.f104105d);
        }
        this.f104107f[i7] = c48017rN5.f106919d;
        this.f104109h[i7] = f;
        if (i3 != -1) {
            int[] iArr7 = this.f104108g;
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            this.f104108g[i7] = this.f104110i;
            this.f104110i = i7;
        }
        c48017rN5.f106929n++;
        c48017rN5.m16026a(this.f104103b);
        this.f104102a++;
        if (!this.f104112k) {
            this.f104111j++;
        }
        int i11 = this.f104111j;
        int[] iArr8 = this.f104107f;
        if (i11 >= iArr8.length) {
            this.f104112k = true;
            this.f104111j = iArr8.length - 1;
        }
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: e */
    public void mo4658e(float f) {
        int i = this.f104110i;
        for (int i2 = 0; i != -1 && i2 < this.f104102a; i2++) {
            float[] fArr = this.f104109h;
            fArr[i] = fArr[i] / f;
            i = this.f104108g[i];
        }
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: f */
    public final void mo4657f(C48017rN5 c48017rN5, float f) {
        if (f == 0.0f) {
            mo4652k(c48017rN5, true);
            return;
        }
        int i = this.f104110i;
        if (i == -1) {
            this.f104110i = 0;
            this.f104109h[0] = f;
            this.f104107f[0] = c48017rN5.f106919d;
            this.f104108g[0] = -1;
            c48017rN5.f106929n++;
            c48017rN5.m16026a(this.f104103b);
            this.f104102a++;
            if (!this.f104112k) {
                int i2 = this.f104111j + 1;
                this.f104111j = i2;
                int[] iArr = this.f104107f;
                if (i2 >= iArr.length) {
                    this.f104112k = true;
                    this.f104111j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f104102a; i4++) {
            int i5 = this.f104107f[i];
            int i6 = c48017rN5.f106919d;
            if (i5 == i6) {
                this.f104109h[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f104108g[i];
        }
        int i7 = this.f104111j;
        int i8 = i7 + 1;
        if (this.f104112k) {
            int[] iArr2 = this.f104107f;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f104107f;
        if (i7 >= iArr3.length && this.f104102a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f104107f;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.f104107f;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.f104105d * 2;
            this.f104105d = i10;
            this.f104112k = false;
            this.f104111j = i7 - 1;
            this.f104109h = Arrays.copyOf(this.f104109h, i10);
            this.f104107f = Arrays.copyOf(this.f104107f, this.f104105d);
            this.f104108g = Arrays.copyOf(this.f104108g, this.f104105d);
        }
        this.f104107f[i7] = c48017rN5.f106919d;
        this.f104109h[i7] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f104108g;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f104108g[i7] = this.f104110i;
            this.f104110i = i7;
        }
        c48017rN5.f106929n++;
        c48017rN5.m16026a(this.f104103b);
        int i11 = this.f104102a + 1;
        this.f104102a = i11;
        if (!this.f104112k) {
            this.f104111j++;
        }
        int[] iArr7 = this.f104107f;
        if (i11 >= iArr7.length) {
            this.f104112k = true;
        }
        if (this.f104111j >= iArr7.length) {
            this.f104112k = true;
            this.f104111j = iArr7.length - 1;
        }
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: g */
    public void mo4656g() {
        int i = this.f104110i;
        for (int i2 = 0; i != -1 && i2 < this.f104102a; i2++) {
            float[] fArr = this.f104109h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f104108g[i];
        }
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: h */
    public final float mo4655h(C48017rN5 c48017rN5) {
        int i = this.f104110i;
        for (int i2 = 0; i != -1 && i2 < this.f104102a; i2++) {
            if (this.f104107f[i] == c48017rN5.f106919d) {
                return this.f104109h[i];
            }
            i = this.f104108g[i];
        }
        return 0.0f;
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: i */
    public int mo4654i() {
        return this.f104102a;
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: j */
    public float mo4653j(int i) {
        int i2 = this.f104110i;
        for (int i3 = 0; i2 != -1 && i3 < this.f104102a; i3++) {
            if (i3 == i) {
                return this.f104109h[i2];
            }
            i2 = this.f104108g[i2];
        }
        return 0.0f;
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: k */
    public final float mo4652k(C48017rN5 c48017rN5, boolean z) {
        if (this.f104106e == c48017rN5) {
            this.f104106e = null;
        }
        int i = this.f104110i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f104102a) {
            if (this.f104107f[i] == c48017rN5.f106919d) {
                if (i == this.f104110i) {
                    this.f104110i = this.f104108g[i];
                } else {
                    int[] iArr = this.f104108g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c48017rN5.m16023d(this.f104103b);
                }
                c48017rN5.f106929n--;
                this.f104102a--;
                this.f104107f[i] = -1;
                if (this.f104112k) {
                    this.f104111j = i;
                }
                return this.f104109h[i];
            }
            i2++;
            i3 = i;
            i = this.f104108g[i];
        }
        return 0.0f;
    }

    public String toString() {
        int i = this.f104110i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f104102a; i2++) {
            str = ((str + " -> ") + this.f104109h[i] + " : ") + this.f104104c.f56963d[this.f104107f[i]];
            i = this.f104108g[i];
        }
        return str;
    }
}
