package p000;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
/* renamed from: bt */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC13320bt implements View.OnTouchListener {

    /* renamed from: s */
    public static final int f59681s = ViewConfiguration.getTapTimeout();

    /* renamed from: d */
    public final View f59684d;

    /* renamed from: e */
    public Runnable f59685e;

    /* renamed from: h */
    public int f59688h;

    /* renamed from: i */
    public int f59689i;

    /* renamed from: m */
    public boolean f59693m;

    /* renamed from: n */
    public boolean f59694n;

    /* renamed from: o */
    public boolean f59695o;

    /* renamed from: p */
    public boolean f59696p;

    /* renamed from: q */
    public boolean f59697q;

    /* renamed from: r */
    public boolean f59698r;

    /* renamed from: b */
    public final C13321a f59682b = new C13321a();

    /* renamed from: c */
    public final Interpolator f59683c = new AccelerateInterpolator();

    /* renamed from: f */
    public float[] f59686f = {0.0f, 0.0f};

    /* renamed from: g */
    public float[] f59687g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j */
    public float[] f59690j = {0.0f, 0.0f};

    /* renamed from: k */
    public float[] f59691k = {0.0f, 0.0f};

    /* renamed from: l */
    public float[] f59692l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: bt$a */
    /* loaded from: classes.dex */
    public static class C13321a {

        /* renamed from: a */
        public int f59699a;

        /* renamed from: b */
        public int f59700b;

        /* renamed from: c */
        public float f59701c;

        /* renamed from: d */
        public float f59702d;

        /* renamed from: j */
        public float f59708j;

        /* renamed from: k */
        public int f59709k;

        /* renamed from: e */
        public long f59703e = Long.MIN_VALUE;

        /* renamed from: i */
        public long f59707i = -1;

        /* renamed from: f */
        public long f59704f = 0;

        /* renamed from: g */
        public int f59705g = 0;

        /* renamed from: h */
        public int f59706h = 0;

        /* renamed from: a */
        public void m62219a() {
            if (this.f59704f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float m62213g = m62213g(m62215e(currentAnimationTimeMillis));
                this.f59704f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f59704f)) * m62213g;
                this.f59705g = (int) (this.f59701c * f);
                this.f59706h = (int) (f * this.f59702d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int m62218b() {
            return this.f59705g;
        }

        /* renamed from: c */
        public int m62217c() {
            return this.f59706h;
        }

        /* renamed from: d */
        public int m62216d() {
            float f = this.f59701c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public final float m62215e(long j) {
            long j2 = this.f59703e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f59707i;
            if (j3 >= 0 && j >= j3) {
                float f = this.f59708j;
                return (1.0f - f) + (f * AbstractView$OnTouchListenerC13320bt.m62237e(((float) (j - j3)) / this.f59709k, 0.0f, 1.0f));
            }
            return AbstractView$OnTouchListenerC13320bt.m62237e(((float) (j - j2)) / this.f59699a, 0.0f, 1.0f) * 0.5f;
        }

        /* renamed from: f */
        public int m62214f() {
            float f = this.f59702d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: g */
        public final float m62213g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        /* renamed from: h */
        public boolean m62212h() {
            if (this.f59707i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f59707i + this.f59709k) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        public void m62211i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f59709k = AbstractView$OnTouchListenerC13320bt.m62236f((int) (currentAnimationTimeMillis - this.f59703e), 0, this.f59700b);
            this.f59708j = m62215e(currentAnimationTimeMillis);
            this.f59707i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m62210j(int i) {
            this.f59700b = i;
        }

        /* renamed from: k */
        public void m62209k(int i) {
            this.f59699a = i;
        }

        /* renamed from: l */
        public void m62208l(float f, float f2) {
            this.f59701c = f;
            this.f59702d = f2;
        }

        /* renamed from: m */
        public void m62207m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f59703e = currentAnimationTimeMillis;
            this.f59707i = -1L;
            this.f59704f = currentAnimationTimeMillis;
            this.f59708j = 0.5f;
            this.f59705g = 0;
            this.f59706h = 0;
        }
    }

    /* renamed from: bt$b */
    /* loaded from: classes.dex */
    public class RunnableC13322b implements Runnable {
        public RunnableC13322b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC13320bt abstractView$OnTouchListenerC13320bt = AbstractView$OnTouchListenerC13320bt.this;
            if (!abstractView$OnTouchListenerC13320bt.f59696p) {
                return;
            }
            if (abstractView$OnTouchListenerC13320bt.f59694n) {
                abstractView$OnTouchListenerC13320bt.f59694n = false;
                abstractView$OnTouchListenerC13320bt.f59682b.m62207m();
            }
            C13321a c13321a = AbstractView$OnTouchListenerC13320bt.this.f59682b;
            if (!c13321a.m62212h() && AbstractView$OnTouchListenerC13320bt.this.m62221u()) {
                AbstractView$OnTouchListenerC13320bt abstractView$OnTouchListenerC13320bt2 = AbstractView$OnTouchListenerC13320bt.this;
                if (abstractView$OnTouchListenerC13320bt2.f59695o) {
                    abstractView$OnTouchListenerC13320bt2.f59695o = false;
                    abstractView$OnTouchListenerC13320bt2.m62239c();
                }
                c13321a.m62219a();
                AbstractView$OnTouchListenerC13320bt.this.mo62232j(c13321a.m62218b(), c13321a.m62217c());
                C38790bq6.m62468n0(AbstractView$OnTouchListenerC13320bt.this.f59684d, this);
                return;
            }
            AbstractView$OnTouchListenerC13320bt.this.f59696p = false;
        }
    }

    public AbstractView$OnTouchListenerC13320bt(View view) {
        this.f59684d = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        m62227o(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        m62226p(f3, f3);
        m62230l(1);
        m62228n(Float.MAX_VALUE, Float.MAX_VALUE);
        m62223s(0.2f, 0.2f);
        m62222t(1.0f, 1.0f);
        m62231k(f59681s);
        m62224r(500);
        m62225q(500);
    }

    /* renamed from: e */
    public static float m62237e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    public static int m62236f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public abstract boolean mo62241a(int i);

    /* renamed from: b */
    public abstract boolean mo62240b(int i);

    /* renamed from: c */
    public void m62239c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f59684d.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: d */
    public final float m62238d(int i, float f, float f2, float f3) {
        float m62234h = m62234h(this.f59686f[i], f2, this.f59687g[i], f);
        int i2 = (m62234h > 0.0f ? 1 : (m62234h == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f59690j[i];
        float f5 = this.f59691k[i];
        float f6 = this.f59692l[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return m62237e(m62234h * f7, f5, f6);
        }
        return -m62237e((-m62234h) * f7, f5, f6);
    }

    /* renamed from: g */
    public final float m62235g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f59688h;
        if (i != 0 && i != 1) {
            if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        } else if (f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.f59696p && i == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final float m62234h(float f, float f2, float f3, float f4) {
        float interpolation;
        float m62237e = m62237e(f * f2, 0.0f, f3);
        float m62235g = m62235g(f2 - f4, m62237e) - m62235g(f4, m62237e);
        if (m62235g < 0.0f) {
            interpolation = -this.f59683c.getInterpolation(-m62235g);
        } else if (m62235g <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f59683c.getInterpolation(m62235g);
        }
        return m62237e(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: i */
    public final void m62233i() {
        if (this.f59694n) {
            this.f59696p = false;
        } else {
            this.f59682b.m62211i();
        }
    }

    /* renamed from: j */
    public abstract void mo62232j(int i, int i2);

    /* renamed from: k */
    public AbstractView$OnTouchListenerC13320bt m62231k(int i) {
        this.f59689i = i;
        return this;
    }

    /* renamed from: l */
    public AbstractView$OnTouchListenerC13320bt m62230l(int i) {
        this.f59688h = i;
        return this;
    }

    /* renamed from: m */
    public AbstractView$OnTouchListenerC13320bt m62229m(boolean z) {
        if (this.f59697q && !z) {
            m62233i();
        }
        this.f59697q = z;
        return this;
    }

    /* renamed from: n */
    public AbstractView$OnTouchListenerC13320bt m62228n(float f, float f2) {
        float[] fArr = this.f59687g;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: o */
    public AbstractView$OnTouchListenerC13320bt m62227o(float f, float f2) {
        float[] fArr = this.f59692l;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f59697q) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            m62233i();
            if (!this.f59698r && this.f59696p) {
                return true;
            }
        }
        this.f59695o = true;
        this.f59693m = false;
        this.f59682b.m62208l(m62238d(0, motionEvent.getX(), view.getWidth(), this.f59684d.getWidth()), m62238d(1, motionEvent.getY(), view.getHeight(), this.f59684d.getHeight()));
        if (!this.f59696p && m62221u()) {
            m62220v();
        }
        return !this.f59698r ? false : false;
    }

    /* renamed from: p */
    public AbstractView$OnTouchListenerC13320bt m62226p(float f, float f2) {
        float[] fArr = this.f59691k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AbstractView$OnTouchListenerC13320bt m62225q(int i) {
        this.f59682b.m62210j(i);
        return this;
    }

    /* renamed from: r */
    public AbstractView$OnTouchListenerC13320bt m62224r(int i) {
        this.f59682b.m62209k(i);
        return this;
    }

    /* renamed from: s */
    public AbstractView$OnTouchListenerC13320bt m62223s(float f, float f2) {
        float[] fArr = this.f59686f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: t */
    public AbstractView$OnTouchListenerC13320bt m62222t(float f, float f2) {
        float[] fArr = this.f59690j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: u */
    public boolean m62221u() {
        C13321a c13321a = this.f59682b;
        int m62214f = c13321a.m62214f();
        int m62216d = c13321a.m62216d();
        if ((m62214f != 0 && mo62240b(m62214f)) || (m62216d != 0 && mo62241a(m62216d))) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final void m62220v() {
        int i;
        if (this.f59685e == null) {
            this.f59685e = new RunnableC13322b();
        }
        this.f59696p = true;
        this.f59694n = true;
        if (!this.f59693m && (i = this.f59689i) > 0) {
            C38790bq6.m62466o0(this.f59684d, this.f59685e, i);
        } else {
            this.f59685e.run();
        }
        this.f59693m = true;
    }
}
