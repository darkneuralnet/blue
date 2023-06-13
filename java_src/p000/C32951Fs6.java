package p000;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
/* renamed from: Fs6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C32951Fs6 {

    /* renamed from: a */
    public final Matrix f10373a = new Matrix();

    /* renamed from: b */
    public RectF f10374b = new RectF();

    /* renamed from: c */
    public float f10375c = 0.0f;

    /* renamed from: d */
    public float f10376d = 0.0f;

    /* renamed from: e */
    public float f10377e = 1.0f;

    /* renamed from: f */
    public float f10378f = Float.MAX_VALUE;

    /* renamed from: g */
    public float f10379g = 1.0f;

    /* renamed from: h */
    public float f10380h = Float.MAX_VALUE;

    /* renamed from: i */
    public float f10381i = 1.0f;

    /* renamed from: j */
    public float f10382j = 1.0f;

    /* renamed from: k */
    public float f10383k = 0.0f;

    /* renamed from: l */
    public float f10384l = 0.0f;

    /* renamed from: m */
    public float f10385m = 0.0f;

    /* renamed from: n */
    public float f10386n = 0.0f;

    /* renamed from: o */
    public float[] f10387o = new float[9];

    /* renamed from: p */
    public Matrix f10388p = new Matrix();

    /* renamed from: q */
    public final float[] f10389q = new float[9];

    /* renamed from: A */
    public boolean m106407A(float f) {
        return this.f10374b.right >= (((float) ((int) (f * 100.0f))) / 100.0f) - 1.0f;
    }

    /* renamed from: B */
    public boolean m106406B(float f) {
        return this.f10374b.top <= f;
    }

    /* renamed from: C */
    public boolean m106405C(float f) {
        return m106361z(f) && m106407A(f);
    }

    /* renamed from: D */
    public boolean m106404D(float f) {
        return m106406B(f) && m106362y(f);
    }

    /* renamed from: E */
    public void m106403E(Matrix matrix, RectF rectF) {
        float f;
        float f2;
        matrix.getValues(this.f10389q);
        float[] fArr = this.f10389q;
        float f3 = fArr[2];
        float f4 = fArr[0];
        float f5 = fArr[5];
        float f6 = fArr[4];
        this.f10381i = Math.min(Math.max(this.f10379g, f4), this.f10380h);
        this.f10382j = Math.min(Math.max(this.f10377e, f6), this.f10378f);
        if (rectF != null) {
            f = rectF.width();
            f2 = rectF.height();
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.f10383k = Math.min(Math.max(f3, ((-f) * (this.f10381i - 1.0f)) - this.f10385m), this.f10385m);
        float max = Math.max(Math.min(f5, (f2 * (this.f10382j - 1.0f)) + this.f10386n), -this.f10386n);
        this.f10384l = max;
        float[] fArr2 = this.f10389q;
        fArr2[2] = this.f10383k;
        fArr2[0] = this.f10381i;
        fArr2[5] = max;
        fArr2[4] = this.f10382j;
        matrix.setValues(fArr2);
    }

    /* renamed from: F */
    public float m106402F() {
        return this.f10376d - this.f10374b.bottom;
    }

    /* renamed from: G */
    public float m106401G() {
        return this.f10374b.left;
    }

    /* renamed from: H */
    public float m106400H() {
        return this.f10375c - this.f10374b.right;
    }

    /* renamed from: I */
    public float m106399I() {
        return this.f10374b.top;
    }

    /* renamed from: J */
    public Matrix m106398J(Matrix matrix, View view, boolean z) {
        this.f10373a.set(matrix);
        m106403E(this.f10373a, this.f10374b);
        if (z) {
            view.invalidate();
        }
        matrix.set(this.f10373a);
        return matrix;
    }

    /* renamed from: K */
    public void m106397K(float f, float f2, float f3, float f4) {
        this.f10374b.set(f, f2, this.f10375c - f3, this.f10376d - f4);
    }

    /* renamed from: L */
    public void m106396L(float f, float f2) {
        float m106401G = m106401G();
        float m106399I = m106399I();
        float m106400H = m106400H();
        float m106402F = m106402F();
        this.f10376d = f2;
        this.f10375c = f;
        m106397K(m106401G, m106399I, m106400H, m106402F);
    }

    /* renamed from: M */
    public void m106395M(float f) {
        this.f10385m = AbstractC34967Oi6.m91656e(f);
    }

    /* renamed from: N */
    public void m106394N(float f) {
        this.f10386n = AbstractC34967Oi6.m91656e(f);
    }

    /* renamed from: O */
    public void m106393O(float f) {
        if (f == 0.0f) {
            f = Float.MAX_VALUE;
        }
        this.f10380h = f;
        m106403E(this.f10373a, this.f10374b);
    }

    /* renamed from: P */
    public void m106392P(float f) {
        if (f == 0.0f) {
            f = Float.MAX_VALUE;
        }
        this.f10378f = f;
        m106403E(this.f10373a, this.f10374b);
    }

    /* renamed from: Q */
    public void m106391Q(float f, float f2) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (f2 == 0.0f) {
            f2 = Float.MAX_VALUE;
        }
        this.f10379g = f;
        this.f10380h = f2;
        m106403E(this.f10373a, this.f10374b);
    }

    /* renamed from: R */
    public void m106390R(float f, float f2) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (f2 == 0.0f) {
            f2 = Float.MAX_VALUE;
        }
        this.f10377e = f;
        this.f10378f = f2;
        m106403E(this.f10373a, this.f10374b);
    }

    /* renamed from: S */
    public void m106389S(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        this.f10379g = f;
        m106403E(this.f10373a, this.f10374b);
    }

    /* renamed from: T */
    public void m106388T(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        this.f10377e = f;
        m106403E(this.f10373a, this.f10374b);
    }

    /* renamed from: U */
    public void m106387U(float f, float f2, float f3, float f4, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f10373a);
        matrix.postScale(f, f2, f3, f4);
    }

    /* renamed from: a */
    public boolean m106386a() {
        return this.f10381i < this.f10380h;
    }

    /* renamed from: b */
    public boolean m106385b() {
        return this.f10382j < this.f10378f;
    }

    /* renamed from: c */
    public boolean m106384c() {
        return this.f10381i > this.f10379g;
    }

    /* renamed from: d */
    public boolean m106383d() {
        return this.f10382j > this.f10377e;
    }

    /* renamed from: e */
    public void m106382e(float[] fArr, View view) {
        Matrix matrix = this.f10388p;
        matrix.reset();
        matrix.set(this.f10373a);
        matrix.postTranslate(-(fArr[0] - m106401G()), -(fArr[1] - m106399I()));
        m106398J(matrix, view, true);
    }

    /* renamed from: f */
    public float m106381f() {
        return this.f10374b.bottom;
    }

    /* renamed from: g */
    public float m106380g() {
        return this.f10374b.height();
    }

    /* renamed from: h */
    public float m106379h() {
        return this.f10374b.left;
    }

    /* renamed from: i */
    public float m106378i() {
        return this.f10374b.right;
    }

    /* renamed from: j */
    public float m106377j() {
        return this.f10374b.top;
    }

    /* renamed from: k */
    public float m106376k() {
        return this.f10374b.width();
    }

    /* renamed from: l */
    public float m106375l() {
        return this.f10376d;
    }

    /* renamed from: m */
    public float m106374m() {
        return this.f10375c;
    }

    /* renamed from: n */
    public PE2 m106373n() {
        return PE2.m90558c(this.f10374b.centerX(), this.f10374b.centerY());
    }

    /* renamed from: o */
    public RectF m106372o() {
        return this.f10374b;
    }

    /* renamed from: p */
    public Matrix m106371p() {
        return this.f10373a;
    }

    /* renamed from: q */
    public float m106370q() {
        return this.f10381i;
    }

    /* renamed from: r */
    public float m106369r() {
        return this.f10382j;
    }

    /* renamed from: s */
    public float m106368s() {
        return Math.min(this.f10374b.width(), this.f10374b.height());
    }

    /* renamed from: t */
    public boolean m106367t() {
        return this.f10385m <= 0.0f && this.f10386n <= 0.0f;
    }

    /* renamed from: u */
    public boolean m106366u() {
        return m106365v() && m106364w();
    }

    /* renamed from: v */
    public boolean m106365v() {
        float f = this.f10381i;
        float f2 = this.f10379g;
        return f <= f2 && f2 <= 1.0f;
    }

    /* renamed from: w */
    public boolean m106364w() {
        float f = this.f10382j;
        float f2 = this.f10377e;
        return f <= f2 && f2 <= 1.0f;
    }

    /* renamed from: x */
    public boolean m106363x(float f, float f2) {
        return m106405C(f) && m106404D(f2);
    }

    /* renamed from: y */
    public boolean m106362y(float f) {
        return this.f10374b.bottom >= ((float) ((int) (f * 100.0f))) / 100.0f;
    }

    /* renamed from: z */
    public boolean m106361z(float f) {
        return this.f10374b.left <= f + 1.0f;
    }
}
