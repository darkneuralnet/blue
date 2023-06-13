package p000;

import java.util.ArrayList;
import p000.C43042iz0;
/* renamed from: nh0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C45827nh0 {

    /* renamed from: a */
    public C43042iz0 f100325a;

    /* renamed from: b */
    public C43042iz0 f100326b;

    /* renamed from: c */
    public C43042iz0 f100327c;

    /* renamed from: d */
    public C43042iz0 f100328d;

    /* renamed from: e */
    public C43042iz0 f100329e;

    /* renamed from: f */
    public C43042iz0 f100330f;

    /* renamed from: g */
    public C43042iz0 f100331g;

    /* renamed from: h */
    public ArrayList<C43042iz0> f100332h;

    /* renamed from: i */
    public int f100333i;

    /* renamed from: j */
    public int f100334j;

    /* renamed from: k */
    public float f100335k = 0.0f;

    /* renamed from: l */
    public int f100336l;

    /* renamed from: m */
    public int f100337m;

    /* renamed from: n */
    public int f100338n;

    /* renamed from: o */
    public boolean f100339o;

    /* renamed from: p */
    public int f100340p;

    /* renamed from: q */
    public boolean f100341q;

    /* renamed from: r */
    public boolean f100342r;

    /* renamed from: s */
    public boolean f100343s;

    /* renamed from: t */
    public boolean f100344t;

    /* renamed from: u */
    public boolean f100345u;

    /* renamed from: v */
    public boolean f100346v;

    public C45827nh0(C43042iz0 c43042iz0, int i, boolean z) {
        this.f100325a = c43042iz0;
        this.f100340p = i;
        this.f100341q = z;
    }

    /* renamed from: c */
    public static boolean m23316c(C43042iz0 c43042iz0, int i) {
        int i2;
        return c43042iz0.m31393X() != 8 && c43042iz0.f91886b0[i] == C43042iz0.EnumC24677b.MATCH_CONSTRAINT && ((i2 = c43042iz0.f91931y[i]) == 0 || i2 == 3);
    }

    /* renamed from: a */
    public void m23318a() {
        if (!this.f100346v) {
            m23317b();
        }
        this.f100346v = true;
    }

    /* renamed from: b */
    public final void m23317b() {
        int i = this.f100340p * 2;
        C43042iz0 c43042iz0 = this.f100325a;
        boolean z = true;
        this.f100339o = true;
        C43042iz0 c43042iz02 = c43042iz0;
        boolean z2 = false;
        while (!z2) {
            this.f100333i++;
            C43042iz0[] c43042iz0Arr = c43042iz0.f91868P0;
            int i2 = this.f100340p;
            C43042iz0 c43042iz03 = null;
            c43042iz0Arr[i2] = null;
            c43042iz0.f91866O0[i2] = null;
            if (c43042iz0.m31393X() != 8) {
                this.f100336l++;
                C43042iz0.EnumC24677b m31334w = c43042iz0.m31334w(this.f100340p);
                C43042iz0.EnumC24677b enumC24677b = C43042iz0.EnumC24677b.MATCH_CONSTRAINT;
                if (m31334w != enumC24677b) {
                    this.f100337m += c43042iz0.m31426G(this.f100340p);
                }
                int m75997f = this.f100337m + c43042iz0.f91881Y[i].m75997f();
                this.f100337m = m75997f;
                int i3 = i + 1;
                this.f100337m = m75997f + c43042iz0.f91881Y[i3].m75997f();
                int m75997f2 = this.f100338n + c43042iz0.f91881Y[i].m75997f();
                this.f100338n = m75997f2;
                this.f100338n = m75997f2 + c43042iz0.f91881Y[i3].m75997f();
                if (this.f100326b == null) {
                    this.f100326b = c43042iz0;
                }
                this.f100328d = c43042iz0;
                C43042iz0.EnumC24677b[] enumC24677bArr = c43042iz0.f91886b0;
                int i4 = this.f100340p;
                if (enumC24677bArr[i4] == enumC24677b) {
                    int i5 = c43042iz0.f91931y[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.f100334j++;
                        float f = c43042iz0.f91864N0[i4];
                        if (f > 0.0f) {
                            this.f100335k += f;
                        }
                        if (m23316c(c43042iz0, i4)) {
                            if (f < 0.0f) {
                                this.f100342r = true;
                            } else {
                                this.f100343s = true;
                            }
                            if (this.f100332h == null) {
                                this.f100332h = new ArrayList<>();
                            }
                            this.f100332h.add(c43042iz0);
                        }
                        if (this.f100330f == null) {
                            this.f100330f = c43042iz0;
                        }
                        C43042iz0 c43042iz04 = this.f100331g;
                        if (c43042iz04 != null) {
                            c43042iz04.f91866O0[this.f100340p] = c43042iz0;
                        }
                        this.f100331g = c43042iz0;
                    }
                    if (this.f100340p == 0) {
                        if (c43042iz0.f91927w != 0) {
                            this.f100339o = false;
                        } else if (c43042iz0.f91933z != 0 || c43042iz0.f91837A != 0) {
                            this.f100339o = false;
                        }
                    } else if (c43042iz0.f91929x != 0) {
                        this.f100339o = false;
                    } else if (c43042iz0.f91841C != 0 || c43042iz0.f91843D != 0) {
                        this.f100339o = false;
                    }
                    if (c43042iz0.f91894f0 != 0.0f) {
                        this.f100339o = false;
                        this.f100345u = true;
                    }
                }
            }
            if (c43042iz02 != c43042iz0) {
                c43042iz02.f91868P0[this.f100340p] = c43042iz0;
            }
            C37211Xy0 c37211Xy0 = c43042iz0.f91881Y[i + 1].f44308f;
            if (c37211Xy0 != null) {
                C43042iz0 c43042iz05 = c37211Xy0.f44306d;
                C37211Xy0 c37211Xy02 = c43042iz05.f91881Y[i].f44308f;
                if (c37211Xy02 != null && c37211Xy02.f44306d == c43042iz0) {
                    c43042iz03 = c43042iz05;
                }
            }
            if (c43042iz03 == null) {
                c43042iz03 = c43042iz0;
                z2 = true;
            }
            c43042iz02 = c43042iz0;
            c43042iz0 = c43042iz03;
        }
        C43042iz0 c43042iz06 = this.f100326b;
        if (c43042iz06 != null) {
            this.f100337m -= c43042iz06.f91881Y[i].m75997f();
        }
        C43042iz0 c43042iz07 = this.f100328d;
        if (c43042iz07 != null) {
            this.f100337m -= c43042iz07.f91881Y[i + 1].m75997f();
        }
        this.f100327c = c43042iz0;
        if (this.f100340p == 0 && this.f100341q) {
            this.f100329e = c43042iz0;
        } else {
            this.f100329e = this.f100325a;
        }
        if (!this.f100343s || !this.f100342r) {
            z = false;
        }
        this.f100344t = z;
    }
}
