package p000;

import java.util.Arrays;
import p000.C30303xo;
/* renamed from: sN5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C48609sN5 implements C30303xo.InterfaceC30304a {

    /* renamed from: n */
    public static float f108695n = 0.001f;

    /* renamed from: a */
    public final int f108696a = -1;

    /* renamed from: b */
    public int f108697b = 16;

    /* renamed from: c */
    public int f108698c = 16;

    /* renamed from: d */
    public int[] f108699d = new int[16];

    /* renamed from: e */
    public int[] f108700e = new int[16];

    /* renamed from: f */
    public int[] f108701f = new int[16];

    /* renamed from: g */
    public float[] f108702g = new float[16];

    /* renamed from: h */
    public int[] f108703h = new int[16];

    /* renamed from: i */
    public int[] f108704i = new int[16];

    /* renamed from: j */
    public int f108705j = 0;

    /* renamed from: k */
    public int f108706k = -1;

    /* renamed from: l */
    public final C30303xo f108707l;

    /* renamed from: m */
    public final C38370b80 f108708m;

    public C48609sN5(C30303xo c30303xo, C38370b80 c38370b80) {
        this.f108707l = c30303xo;
        this.f108708m = c38370b80;
        clear();
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: a */
    public boolean mo4662a(C48017rN5 c48017rN5) {
        return m14252p(c48017rN5) != -1;
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: b */
    public C48017rN5 mo4661b(int i) {
        int i2 = this.f108705j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f108706k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f108708m.f56963d[this.f108701f[i3]];
            }
            i3 = this.f108704i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: c */
    public float mo4660c(C30303xo c30303xo, boolean z) {
        float mo4655h = mo4655h(c30303xo.f118136a);
        mo4652k(c30303xo.f118136a, z);
        C48609sN5 c48609sN5 = (C48609sN5) c30303xo.f118140e;
        int mo4654i = c48609sN5.mo4654i();
        int i = 0;
        int i2 = 0;
        while (i < mo4654i) {
            int i3 = c48609sN5.f108701f[i2];
            if (i3 != -1) {
                mo4659d(this.f108708m.f56963d[i3], c48609sN5.f108702g[i2] * mo4655h, z);
                i++;
            }
            i2++;
        }
        return mo4655h;
    }

    @Override // p000.C30303xo.InterfaceC30304a
    public void clear() {
        int i = this.f108705j;
        for (int i2 = 0; i2 < i; i2++) {
            C48017rN5 mo4661b = mo4661b(i2);
            if (mo4661b != null) {
                mo4661b.m16023d(this.f108707l);
            }
        }
        for (int i3 = 0; i3 < this.f108697b; i3++) {
            this.f108701f[i3] = -1;
            this.f108700e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f108698c; i4++) {
            this.f108699d[i4] = -1;
        }
        this.f108705j = 0;
        this.f108706k = -1;
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: d */
    public void mo4659d(C48017rN5 c48017rN5, float f, boolean z) {
        float f2 = f108695n;
        if (f > (-f2) && f < f2) {
            return;
        }
        int m14252p = m14252p(c48017rN5);
        if (m14252p == -1) {
            mo4657f(c48017rN5, f);
            return;
        }
        float[] fArr = this.f108702g;
        float f3 = fArr[m14252p] + f;
        fArr[m14252p] = f3;
        float f4 = f108695n;
        if (f3 > (-f4) && f3 < f4) {
            fArr[m14252p] = 0.0f;
            mo4652k(c48017rN5, z);
        }
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: e */
    public void mo4658e(float f) {
        int i = this.f108705j;
        int i2 = this.f108706k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f108702g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f108704i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: f */
    public void mo4657f(C48017rN5 c48017rN5, float f) {
        float f2 = f108695n;
        if (f > (-f2) && f < f2) {
            mo4652k(c48017rN5, true);
            return;
        }
        if (this.f108705j == 0) {
            m14255m(0, c48017rN5, f);
            m14256l(c48017rN5, 0);
            this.f108706k = 0;
            return;
        }
        int m14252p = m14252p(c48017rN5);
        if (m14252p != -1) {
            this.f108702g[m14252p] = f;
            return;
        }
        if (this.f108705j + 1 >= this.f108697b) {
            m14253o();
        }
        int i = this.f108705j;
        int i2 = this.f108706k;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = this.f108701f[i2];
            int i6 = c48017rN5.f106919d;
            if (i5 == i6) {
                this.f108702g[i2] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i2;
            }
            i2 = this.f108704i[i2];
            if (i2 == -1) {
                break;
            }
        }
        m14251q(i3, c48017rN5, f);
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: g */
    public void mo4656g() {
        int i = this.f108705j;
        int i2 = this.f108706k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f108702g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f108704i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: h */
    public float mo4655h(C48017rN5 c48017rN5) {
        int m14252p = m14252p(c48017rN5);
        if (m14252p != -1) {
            return this.f108702g[m14252p];
        }
        return 0.0f;
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: i */
    public int mo4654i() {
        return this.f108705j;
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: j */
    public float mo4653j(int i) {
        int i2 = this.f108705j;
        int i3 = this.f108706k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f108702g[i3];
            }
            i3 = this.f108704i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p000.C30303xo.InterfaceC30304a
    /* renamed from: k */
    public float mo4652k(C48017rN5 c48017rN5, boolean z) {
        int m14252p = m14252p(c48017rN5);
        if (m14252p == -1) {
            return 0.0f;
        }
        m14250r(c48017rN5);
        float f = this.f108702g[m14252p];
        if (this.f108706k == m14252p) {
            this.f108706k = this.f108704i[m14252p];
        }
        this.f108701f[m14252p] = -1;
        int[] iArr = this.f108703h;
        int i = iArr[m14252p];
        if (i != -1) {
            int[] iArr2 = this.f108704i;
            iArr2[i] = iArr2[m14252p];
        }
        int i2 = this.f108704i[m14252p];
        if (i2 != -1) {
            iArr[i2] = iArr[m14252p];
        }
        this.f108705j--;
        c48017rN5.f106929n--;
        if (z) {
            c48017rN5.m16023d(this.f108707l);
        }
        return f;
    }

    /* renamed from: l */
    public final void m14256l(C48017rN5 c48017rN5, int i) {
        int[] iArr;
        int i2 = c48017rN5.f106919d % this.f108698c;
        int[] iArr2 = this.f108699d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f108700e;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                }
                i3 = i4;
            }
            iArr[i3] = i;
        }
        this.f108700e[i] = -1;
    }

    /* renamed from: m */
    public final void m14255m(int i, C48017rN5 c48017rN5, float f) {
        this.f108701f[i] = c48017rN5.f106919d;
        this.f108702g[i] = f;
        this.f108703h[i] = -1;
        this.f108704i[i] = -1;
        c48017rN5.m16026a(this.f108707l);
        c48017rN5.f106929n++;
        this.f108705j++;
    }

    /* renamed from: n */
    public final int m14254n() {
        for (int i = 0; i < this.f108697b; i++) {
            if (this.f108701f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public final void m14253o() {
        int i = this.f108697b * 2;
        this.f108701f = Arrays.copyOf(this.f108701f, i);
        this.f108702g = Arrays.copyOf(this.f108702g, i);
        this.f108703h = Arrays.copyOf(this.f108703h, i);
        this.f108704i = Arrays.copyOf(this.f108704i, i);
        this.f108700e = Arrays.copyOf(this.f108700e, i);
        for (int i2 = this.f108697b; i2 < i; i2++) {
            this.f108701f[i2] = -1;
            this.f108700e[i2] = -1;
        }
        this.f108697b = i;
    }

    /* renamed from: p */
    public int m14252p(C48017rN5 c48017rN5) {
        if (this.f108705j != 0 && c48017rN5 != null) {
            int i = c48017rN5.f106919d;
            int i2 = this.f108699d[i % this.f108698c];
            if (i2 == -1) {
                return -1;
            }
            if (this.f108701f[i2] == i) {
                return i2;
            }
            do {
                i2 = this.f108700e[i2];
                if (i2 == -1) {
                    break;
                }
            } while (this.f108701f[i2] != i);
            if (i2 != -1 && this.f108701f[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public final void m14251q(int i, C48017rN5 c48017rN5, float f) {
        int m14254n = m14254n();
        m14255m(m14254n, c48017rN5, f);
        if (i != -1) {
            this.f108703h[m14254n] = i;
            int[] iArr = this.f108704i;
            iArr[m14254n] = iArr[i];
            iArr[i] = m14254n;
        } else {
            this.f108703h[m14254n] = -1;
            if (this.f108705j > 0) {
                this.f108704i[m14254n] = this.f108706k;
                this.f108706k = m14254n;
            } else {
                this.f108704i[m14254n] = -1;
            }
        }
        int i2 = this.f108704i[m14254n];
        if (i2 != -1) {
            this.f108703h[i2] = m14254n;
        }
        m14256l(c48017rN5, m14254n);
    }

    /* renamed from: r */
    public final void m14250r(C48017rN5 c48017rN5) {
        int[] iArr;
        int i;
        int i2 = c48017rN5.f106919d;
        int i3 = i2 % this.f108698c;
        int[] iArr2 = this.f108699d;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f108701f[i4] == i2) {
            int[] iArr3 = this.f108700e;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.f108700e;
            i = iArr[i4];
            if (i == -1 || this.f108701f[i] == i2) {
                break;
            }
            i4 = i;
        }
        if (i != -1 && this.f108701f[i] == i2) {
            iArr[i4] = iArr[i];
            iArr[i] = -1;
        }
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i = this.f108705j;
        for (int i2 = 0; i2 < i; i2++) {
            C48017rN5 mo4661b = mo4661b(i2);
            if (mo4661b != null) {
                String str4 = str3 + mo4661b + " = " + mo4653j(i2) + " ";
                int m14252p = m14252p(mo4661b);
                String str5 = str4 + "[p: ";
                if (this.f108703h[m14252p] != -1) {
                    str = str5 + this.f108708m.f56963d[this.f108701f[this.f108703h[m14252p]]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                if (this.f108704i[m14252p] != -1) {
                    str2 = str6 + this.f108708m.f56963d[this.f108701f[this.f108704i[m14252p]]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }
}
