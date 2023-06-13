package p000;

import android.view.Choreographer;
/* renamed from: fE2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class Choreographer$FrameCallbackC40817fE2 extends AbstractC28544tB implements Choreographer.FrameCallback {

    /* renamed from: m */
    public C47924rD2 f79714m;

    /* renamed from: e */
    public float f79706e = 1.0f;

    /* renamed from: f */
    public boolean f79707f = false;

    /* renamed from: g */
    public long f79708g = 0;

    /* renamed from: h */
    public float f79709h = 0.0f;

    /* renamed from: i */
    public float f79710i = 0.0f;

    /* renamed from: j */
    public int f79711j = 0;

    /* renamed from: k */
    public float f79712k = -2.14748365E9f;

    /* renamed from: l */
    public float f79713l = 2.14748365E9f;

    /* renamed from: n */
    public boolean f79715n = false;

    /* renamed from: o */
    public boolean f79716o = false;

    /* renamed from: A */
    public void m41699A() {
        if (isRunning()) {
            m41697C(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* renamed from: B */
    public void m41698B() {
        m41697C(true);
    }

    /* renamed from: C */
    public void m41697C(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f79715n = false;
        }
    }

    /* renamed from: D */
    public void m41696D() {
        this.f79715n = true;
        m41699A();
        this.f79708g = 0L;
        if (m41678w() && m41683o() == m41680r()) {
            m41693I(m41681q());
        } else if (!m41678w() && m41683o() == m41681q()) {
            m41693I(m41680r());
        }
        m12925h();
    }

    /* renamed from: G */
    public void m41695G() {
        m41689O(-m41679t());
    }

    /* renamed from: H */
    public void m41694H(C47924rD2 c47924rD2) {
        boolean z;
        if (this.f79714m == null) {
            z = true;
        } else {
            z = false;
        }
        this.f79714m = c47924rD2;
        if (z) {
            m41691M(Math.max(this.f79712k, c47924rD2.m16208p()), Math.min(this.f79713l, c47924rD2.m16218f()));
        } else {
            m41691M((int) c47924rD2.m16208p(), (int) c47924rD2.m16218f());
        }
        float f = this.f79710i;
        this.f79710i = 0.0f;
        this.f79709h = 0.0f;
        m41693I((int) f);
        m12923k();
    }

    /* renamed from: I */
    public void m41693I(float f) {
        if (this.f79709h == f) {
            return;
        }
        float m15918b = C48077rU2.m15918b(f, m41680r(), m41681q());
        this.f79709h = m15918b;
        if (this.f79716o) {
            m15918b = (float) Math.floor(m15918b);
        }
        this.f79710i = m15918b;
        this.f79708g = 0L;
        m12923k();
    }

    /* renamed from: J */
    public void m41692J(float f) {
        m41691M(this.f79712k, f);
    }

    /* renamed from: M */
    public void m41691M(float f, float f2) {
        float m16208p;
        float m16218f;
        if (f <= f2) {
            C47924rD2 c47924rD2 = this.f79714m;
            if (c47924rD2 == null) {
                m16208p = -3.4028235E38f;
            } else {
                m16208p = c47924rD2.m16208p();
            }
            C47924rD2 c47924rD22 = this.f79714m;
            if (c47924rD22 == null) {
                m16218f = Float.MAX_VALUE;
            } else {
                m16218f = c47924rD22.m16218f();
            }
            float m15918b = C48077rU2.m15918b(f, m16208p, m16218f);
            float m15918b2 = C48077rU2.m15918b(f2, m16208p, m16218f);
            if (m15918b != this.f79712k || m15918b2 != this.f79713l) {
                this.f79712k = m15918b;
                this.f79713l = m15918b2;
                m41693I((int) C48077rU2.m15918b(this.f79710i, m15918b, m15918b2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }

    /* renamed from: N */
    public void m41690N(int i) {
        m41691M(i, (int) this.f79713l);
    }

    /* renamed from: O */
    public void m41689O(float f) {
        this.f79706e = f;
    }

    /* renamed from: P */
    public void m41688P(boolean z) {
        this.f79716o = z;
    }

    /* renamed from: Q */
    public final void m41687Q() {
        if (this.f79714m == null) {
            return;
        }
        float f = this.f79710i;
        if (f >= this.f79712k && f <= this.f79713l) {
            return;
        }
        throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f79712k), Float.valueOf(this.f79713l), Float.valueOf(this.f79710i)));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        mo12929d();
        m41698B();
    }

    @Override // p000.AbstractC28544tB
    /* renamed from: d */
    public void mo12929d() {
        super.mo12929d();
        m12928e(m41678w());
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        float m41680r;
        float m41681q;
        m41699A();
        if (this.f79714m != null && isRunning()) {
            C32416Dl2.m109978a("LottieValueAnimator#doFrame");
            long j2 = this.f79708g;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float m41682p = ((float) j3) / m41682p();
            float f = this.f79709h;
            if (m41678w()) {
                m41682p = -m41682p;
            }
            float f2 = f + m41682p;
            boolean z = !C48077rU2.m15916d(f2, m41680r(), m41681q());
            float f3 = this.f79709h;
            float m15918b = C48077rU2.m15918b(f2, m41680r(), m41681q());
            this.f79709h = m15918b;
            if (this.f79716o) {
                m15918b = (float) Math.floor(m15918b);
            }
            this.f79710i = m15918b;
            this.f79708g = j;
            if (!this.f79716o || this.f79709h != f3) {
                m12923k();
            }
            if (z) {
                if (getRepeatCount() != -1 && this.f79711j >= getRepeatCount()) {
                    if (this.f79706e < 0.0f) {
                        m41681q = m41680r();
                    } else {
                        m41681q = m41681q();
                    }
                    this.f79709h = m41681q;
                    this.f79710i = m41681q;
                    m41698B();
                    m12928e(m41678w());
                } else {
                    m12926g();
                    this.f79711j++;
                    if (getRepeatMode() == 2) {
                        this.f79707f = !this.f79707f;
                        m41695G();
                    } else {
                        if (m41678w()) {
                            m41680r = m41681q();
                        } else {
                            m41680r = m41680r();
                        }
                        this.f79709h = m41680r;
                        this.f79710i = m41680r;
                    }
                    this.f79708g = j;
                }
            }
            m41687Q();
            C32416Dl2.m109977b("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float m41680r;
        float m41681q;
        float m41680r2;
        if (this.f79714m == null) {
            return 0.0f;
        }
        if (m41678w()) {
            m41680r = m41681q() - this.f79710i;
            m41681q = m41681q();
            m41680r2 = m41680r();
        } else {
            m41680r = this.f79710i - m41680r();
            m41681q = m41681q();
            m41680r2 = m41680r();
        }
        return m41680r / (m41681q - m41680r2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(m41684n());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        C47924rD2 c47924rD2 = this.f79714m;
        if (c47924rD2 == null) {
            return 0L;
        }
        return c47924rD2.m16220d();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f79715n;
    }

    /* renamed from: l */
    public void m41686l() {
        this.f79714m = null;
        this.f79712k = -2.14748365E9f;
        this.f79713l = 2.14748365E9f;
    }

    /* renamed from: m */
    public void m41685m() {
        m41698B();
        m12928e(m41678w());
    }

    /* renamed from: n */
    public float m41684n() {
        C47924rD2 c47924rD2 = this.f79714m;
        if (c47924rD2 == null) {
            return 0.0f;
        }
        return (this.f79710i - c47924rD2.m16208p()) / (this.f79714m.m16218f() - this.f79714m.m16208p());
    }

    /* renamed from: o */
    public float m41683o() {
        return this.f79710i;
    }

    /* renamed from: p */
    public final float m41682p() {
        C47924rD2 c47924rD2 = this.f79714m;
        if (c47924rD2 == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / c47924rD2.m16215i()) / Math.abs(this.f79706e);
    }

    /* renamed from: q */
    public float m41681q() {
        C47924rD2 c47924rD2 = this.f79714m;
        if (c47924rD2 == null) {
            return 0.0f;
        }
        float f = this.f79713l;
        if (f == 2.14748365E9f) {
            return c47924rD2.m16218f();
        }
        return f;
    }

    /* renamed from: r */
    public float m41680r() {
        C47924rD2 c47924rD2 = this.f79714m;
        if (c47924rD2 == null) {
            return 0.0f;
        }
        float f = this.f79712k;
        if (f == -2.14748365E9f) {
            return c47924rD2.m16208p();
        }
        return f;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f79707f) {
            this.f79707f = false;
            m41695G();
        }
    }

    /* renamed from: t */
    public float m41679t() {
        return this.f79706e;
    }

    /* renamed from: w */
    public final boolean m41678w() {
        return m41679t() < 0.0f;
    }

    /* renamed from: y */
    public void m41677y() {
        m41698B();
        m12927f();
    }

    /* renamed from: z */
    public void m41676z() {
        float m41680r;
        this.f79715n = true;
        m12924j(m41678w());
        if (m41678w()) {
            m41680r = m41681q();
        } else {
            m41680r = m41680r();
        }
        m41693I((int) m41680r);
        this.f79708g = 0L;
        this.f79711j = 0;
        m41699A();
    }
}
