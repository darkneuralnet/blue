package p000;

import java.lang.reflect.Array;
/* renamed from: sr2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC48893sr2 {

    /* renamed from: a */
    public int f109413a;

    /* renamed from: c */
    public C52053yB0[] f109415c;

    /* renamed from: d */
    public boolean f109416d;

    /* renamed from: e */
    public C52053yB0 f109417e;

    /* renamed from: f */
    public C52053yB0 f109418f;

    /* renamed from: b */
    public C52053yB0[][] f109414b = (C52053yB0[][]) Array.newInstance(C52053yB0.class, 2, 2);

    /* renamed from: g */
    public C40414eZ3 f109419g = null;

    public AbstractC48893sr2() {
        C52053yB0[] c52053yB0Arr = new C52053yB0[2];
        this.f109415c = c52053yB0Arr;
        c52053yB0Arr[0] = new C52053yB0();
        this.f109415c[1] = new C52053yB0();
        C52053yB0[] c52053yB0Arr2 = this.f109415c;
        this.f109417e = c52053yB0Arr2[0];
        this.f109418f = c52053yB0Arr2[1];
        this.f109413a = 0;
    }

    /* renamed from: a */
    public static double m13590a(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03) {
        boolean z;
        double abs = Math.abs(c52053yB03.f118922b - c52053yB02.f118922b);
        double abs2 = Math.abs(c52053yB03.f118923c - c52053yB02.f118923c);
        if (c52053yB0.equals(c52053yB02)) {
            abs = 0.0d;
        } else if (c52053yB0.equals(c52053yB03)) {
            if (abs <= abs2) {
                abs = abs2;
            }
        } else {
            double abs3 = Math.abs(c52053yB0.f118922b - c52053yB02.f118922b);
            double abs4 = Math.abs(c52053yB0.f118923c - c52053yB02.f118923c);
            if (abs > abs2) {
                abs = abs3;
            } else {
                abs = abs4;
            }
            if (abs == 0.0d && !c52053yB0.equals(c52053yB02)) {
                abs = Math.max(abs3, abs4);
            }
        }
        if (abs == 0.0d && !c52053yB0.equals(c52053yB02)) {
            z = false;
        } else {
            z = true;
        }
        C4596Ko.m98281d(z, "Bad distance calculation");
        return abs;
    }

    /* renamed from: b */
    public abstract int mo13589b(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03, C52053yB0 c52053yB04);

    /* renamed from: c */
    public abstract void mo13588c(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03);

    /* renamed from: d */
    public void m13587d(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03, C52053yB0 c52053yB04) {
        C52053yB0[][] c52053yB0Arr = this.f109414b;
        c52053yB0Arr[0][0] = c52053yB0;
        c52053yB0Arr[0][1] = c52053yB02;
        C52053yB0[] c52053yB0Arr2 = c52053yB0Arr[1];
        c52053yB0Arr2[0] = c52053yB03;
        c52053yB0Arr2[1] = c52053yB04;
        this.f109413a = mo13589b(c52053yB0, c52053yB02, c52053yB03, c52053yB04);
    }

    /* renamed from: e */
    public double m13586e(int i, int i2) {
        C52053yB0 c52053yB0 = this.f109415c[i2];
        C52053yB0[] c52053yB0Arr = this.f109414b[i];
        return m13590a(c52053yB0, c52053yB0Arr[0], c52053yB0Arr[1]);
    }

    /* renamed from: f */
    public C52053yB0 m13585f(int i) {
        return this.f109415c[i];
    }

    /* renamed from: g */
    public int m13584g() {
        return this.f109413a;
    }

    /* renamed from: h */
    public final String m13583h() {
        StringBuilder sb = new StringBuilder();
        if (m13580k()) {
            sb.append(" endpoint");
        }
        if (this.f109416d) {
            sb.append(" proper");
        }
        if (m13581j()) {
            sb.append(" collinear");
        }
        return sb.toString();
    }

    /* renamed from: i */
    public boolean m13582i() {
        return this.f109413a != 0;
    }

    /* renamed from: j */
    public boolean m13581j() {
        return this.f109413a == 2;
    }

    /* renamed from: k */
    public boolean m13580k() {
        return m13582i() && !this.f109416d;
    }

    /* renamed from: l */
    public boolean m13579l() {
        if (!m13578m(0) && !m13578m(1)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public boolean m13578m(int i) {
        for (int i2 = 0; i2 < this.f109413a; i2++) {
            if (!this.f109415c[i2].m3886g(this.f109414b[i][0]) && !this.f109415c[i2].m3886g(this.f109414b[i][1])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public boolean m13577n(C52053yB0 c52053yB0) {
        for (int i = 0; i < this.f109413a; i++) {
            if (this.f109415c[i].m3886g(c52053yB0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public boolean m13576o() {
        return m13582i() && this.f109416d;
    }

    /* renamed from: p */
    public void m13575p(C40414eZ3 c40414eZ3) {
        this.f109419g = c40414eZ3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        C52053yB0[] c52053yB0Arr = this.f109414b[0];
        sb.append(C44204kw6.m28149A(c52053yB0Arr[0], c52053yB0Arr[1]));
        sb.append(" - ");
        C52053yB0[] c52053yB0Arr2 = this.f109414b[1];
        sb.append(C44204kw6.m28149A(c52053yB0Arr2[0], c52053yB0Arr2[1]));
        sb.append(m13583h());
        return sb.toString();
    }
}
