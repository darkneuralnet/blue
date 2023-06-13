package p000;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.Entry;
import kotlin.KotlinVersion;
import p000.AbstractView$OnTouchListenerC44651li0;
/* renamed from: wx */
/* loaded from: classes5.dex */
public class C29996wx extends AbstractView$OnTouchListenerC44651li0<BarLineChartBase<? extends AbstractC30353xx<? extends YN1<? extends Entry>>>> {

    /* renamed from: g */
    public Matrix f116867g;

    /* renamed from: h */
    public Matrix f116868h;

    /* renamed from: i */
    public PE2 f116869i;

    /* renamed from: j */
    public PE2 f116870j;

    /* renamed from: k */
    public float f116871k;

    /* renamed from: l */
    public float f116872l;

    /* renamed from: m */
    public float f116873m;

    /* renamed from: n */
    public InterfaceC46243oO1 f116874n;

    /* renamed from: o */
    public VelocityTracker f116875o;

    /* renamed from: p */
    public long f116876p;

    /* renamed from: q */
    public PE2 f116877q;

    /* renamed from: r */
    public PE2 f116878r;

    /* renamed from: s */
    public float f116879s;

    /* renamed from: t */
    public float f116880t;

    public C29996wx(BarLineChartBase<? extends AbstractC30353xx<? extends YN1<? extends Entry>>> barLineChartBase, Matrix matrix, float f) {
        super(barLineChartBase);
        this.f116867g = new Matrix();
        this.f116868h = new Matrix();
        this.f116869i = PE2.m90558c(0.0f, 0.0f);
        this.f116870j = PE2.m90558c(0.0f, 0.0f);
        this.f116871k = 1.0f;
        this.f116872l = 1.0f;
        this.f116873m = 1.0f;
        this.f116876p = 0L;
        this.f116877q = PE2.m90558c(0.0f, 0.0f);
        this.f116878r = PE2.m90558c(0.0f, 0.0f);
        this.f116867g = matrix;
        this.f116879s = AbstractC34967Oi6.m91656e(f);
        this.f116880t = AbstractC34967Oi6.m91656e(3.5f);
    }

    /* renamed from: h */
    public static float m6083h(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
    }

    /* renamed from: i */
    public static float m6082i(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
    }

    /* renamed from: k */
    public static void m6080k(PE2 pe2, MotionEvent motionEvent) {
        pe2.f28146c = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
        pe2.f28147d = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
    }

    /* renamed from: p */
    public static float m6075p(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    /* renamed from: f */
    public void m6085f() {
        float f;
        PE2 pe2 = this.f116878r;
        float f2 = 0.0f;
        if (pe2.f28146c == 0.0f && pe2.f28147d == 0.0f) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f116878r.f28146c *= ((BarLineChartBase) this.f96578f).m52025B();
        this.f116878r.f28147d *= ((BarLineChartBase) this.f96578f).m52025B();
        float f3 = ((float) (currentAnimationTimeMillis - this.f116876p)) / 1000.0f;
        PE2 pe22 = this.f116878r;
        float f4 = pe22.f28146c * f3;
        float f5 = pe22.f28147d * f3;
        PE2 pe23 = this.f116877q;
        float f6 = pe23.f28146c + f4;
        pe23.f28146c = f6;
        float f7 = pe23.f28147d + f5;
        pe23.f28147d = f7;
        MotionEvent obtain = MotionEvent.obtain(currentAnimationTimeMillis, currentAnimationTimeMillis, 2, f6, f7, 0);
        if (((BarLineChartBase) this.f96578f).m52035m0()) {
            f = this.f116877q.f28146c - this.f116869i.f28146c;
        } else {
            f = 0.0f;
        }
        if (((BarLineChartBase) this.f96578f).m52034n0()) {
            f2 = this.f116877q.f28147d - this.f116869i.f28147d;
        }
        m6079l(obtain, f, f2);
        obtain.recycle();
        this.f116867g = ((BarLineChartBase) this.f96578f).m52017L().m106398J(this.f116867g, this.f96578f, false);
        this.f116876p = currentAnimationTimeMillis;
        if (Math.abs(this.f116878r.f28146c) < 0.01d && Math.abs(this.f116878r.f28147d) < 0.01d) {
            ((BarLineChartBase) this.f96578f).mo51967r();
            ((BarLineChartBase) this.f96578f).postInvalidate();
            m6074q();
            return;
        }
        AbstractC34967Oi6.m91637x(this.f96578f);
    }

    /* renamed from: g */
    public PE2 m6084g(float f, float f2) {
        float f3;
        C32951Fs6 m52017L = ((BarLineChartBase) this.f96578f).m52017L();
        float m106401G = f - m52017L.m106401G();
        if (m6081j()) {
            f3 = -(f2 - m52017L.m106399I());
        } else {
            f3 = -((((BarLineChartBase) this.f96578f).getMeasuredHeight() - f2) - m52017L.m106402F());
        }
        return PE2.m90558c(m106401G, f3);
    }

    /* renamed from: j */
    public final boolean m6081j() {
        InterfaceC46243oO1 interfaceC46243oO1;
        if ((this.f116874n == null && ((BarLineChartBase) this.f96578f).m52039i0()) || ((interfaceC46243oO1 = this.f116874n) != null && ((BarLineChartBase) this.f96578f).mo2229p(interfaceC46243oO1.mo4013j0()))) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final void m6079l(MotionEvent motionEvent, float f, float f2) {
        this.f96574b = AbstractView$OnTouchListenerC44651li0.EnumC25766a.DRAG;
        this.f116867g.set(this.f116868h);
        ((BarLineChartBase) this.f96578f).m52018K();
        if (m6081j()) {
            if (this.f96578f instanceof HorizontalBarChart) {
                f = -f;
            } else {
                f2 = -f2;
            }
        }
        this.f116867g.postTranslate(f, f2);
    }

    /* renamed from: m */
    public final void m6078m(MotionEvent motionEvent) {
        OM1 mo51997G = ((BarLineChartBase) this.f96578f).mo51997G(motionEvent.getX(), motionEvent.getY());
        if (mo51997G != null && !mo51997G.m92394a(this.f96576d)) {
            this.f96576d = mo51997G;
            ((BarLineChartBase) this.f96578f).m52016N(mo51997G, true);
        }
    }

    /* renamed from: n */
    public final void m6077n(MotionEvent motionEvent) {
        boolean m106385b;
        boolean m106386a;
        boolean m106386a2;
        boolean m106385b2;
        float f;
        if (motionEvent.getPointerCount() >= 2) {
            ((BarLineChartBase) this.f96578f).m52018K();
            float m6075p = m6075p(motionEvent);
            if (m6075p > this.f116880t) {
                PE2 pe2 = this.f116870j;
                PE2 m6084g = m6084g(pe2.f28146c, pe2.f28147d);
                C32951Fs6 m52017L = ((BarLineChartBase) this.f96578f).m52017L();
                int i = this.f96575c;
                boolean z = true;
                float f2 = 1.0f;
                if (i == 4) {
                    this.f96574b = AbstractView$OnTouchListenerC44651li0.EnumC25766a.PINCH_ZOOM;
                    float f3 = m6075p / this.f116873m;
                    if (f3 >= 1.0f) {
                        z = false;
                    }
                    if (z) {
                        m106386a2 = m52017L.m106384c();
                    } else {
                        m106386a2 = m52017L.m106386a();
                    }
                    if (z) {
                        m106385b2 = m52017L.m106383d();
                    } else {
                        m106385b2 = m52017L.m106385b();
                    }
                    if (((BarLineChartBase) this.f96578f).m52030r0()) {
                        f = f3;
                    } else {
                        f = 1.0f;
                    }
                    if (((BarLineChartBase) this.f96578f).m52029s0()) {
                        f2 = f3;
                    }
                    if (m106385b2 || m106386a2) {
                        this.f116867g.set(this.f116868h);
                        this.f116867g.postScale(f, f2, m6084g.f28146c, m6084g.f28147d);
                    }
                } else if (i == 2 && ((BarLineChartBase) this.f96578f).m52030r0()) {
                    this.f96574b = AbstractView$OnTouchListenerC44651li0.EnumC25766a.X_ZOOM;
                    float m6083h = m6083h(motionEvent) / this.f116871k;
                    if (m6083h >= 1.0f) {
                        z = false;
                    }
                    if (z) {
                        m106386a = m52017L.m106384c();
                    } else {
                        m106386a = m52017L.m106386a();
                    }
                    if (m106386a) {
                        this.f116867g.set(this.f116868h);
                        this.f116867g.postScale(m6083h, 1.0f, m6084g.f28146c, m6084g.f28147d);
                    }
                } else if (this.f96575c == 3 && ((BarLineChartBase) this.f96578f).m52029s0()) {
                    this.f96574b = AbstractView$OnTouchListenerC44651li0.EnumC25766a.Y_ZOOM;
                    float m6082i = m6082i(motionEvent) / this.f116872l;
                    if (m6082i >= 1.0f) {
                        z = false;
                    }
                    if (z) {
                        m106385b = m52017L.m106383d();
                    } else {
                        m106385b = m52017L.m106385b();
                    }
                    if (m106385b) {
                        this.f116867g.set(this.f116868h);
                        this.f116867g.postScale(1.0f, m6082i, m6084g.f28146c, m6084g.f28147d);
                    }
                }
                PE2.m90555f(m6084g);
            }
        }
    }

    /* renamed from: o */
    public final void m6076o(MotionEvent motionEvent) {
        this.f116868h.set(this.f116867g);
        this.f116869i.f28146c = motionEvent.getX();
        this.f116869i.f28147d = motionEvent.getY();
        this.f116874n = ((BarLineChartBase) this.f96578f).m52041g0(motionEvent.getX(), motionEvent.getY());
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        float f;
        this.f96574b = AbstractView$OnTouchListenerC44651li0.EnumC25766a.DOUBLE_TAP;
        ((BarLineChartBase) this.f96578f).m52018K();
        if (((BarLineChartBase) this.f96578f).m52037k0() && ((AbstractC30353xx) ((BarLineChartBase) this.f96578f).getData()).m33551g() > 0) {
            PE2 m6084g = m6084g(motionEvent.getX(), motionEvent.getY());
            Object obj = this.f96578f;
            BarLineChartBase barLineChartBase = (BarLineChartBase) obj;
            float f2 = 1.4f;
            if (((BarLineChartBase) obj).m52030r0()) {
                f = 1.4f;
            } else {
                f = 1.0f;
            }
            if (!((BarLineChartBase) this.f96578f).m52029s0()) {
                f2 = 1.0f;
            }
            barLineChartBase.m52027v0(f, f2, m6084g.f28146c, m6084g.f28147d);
            if (((BarLineChartBase) this.f96578f).m52012S()) {
                Log.i("BarlineChartTouch", "Double-Tap, Zooming In, x: " + m6084g.f28146c + ", y: " + m6084g.f28147d);
            }
            PE2.m90555f(m6084g);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f96574b = AbstractView$OnTouchListenerC44651li0.EnumC25766a.FLING;
        ((BarLineChartBase) this.f96578f).m52018K();
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.f96574b = AbstractView$OnTouchListenerC44651li0.EnumC25766a.LONG_PRESS;
        ((BarLineChartBase) this.f96578f).m52018K();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f96574b = AbstractView$OnTouchListenerC44651li0.EnumC25766a.SINGLE_TAP;
        ((BarLineChartBase) this.f96578f).m52018K();
        if (!((BarLineChartBase) this.f96578f).m52013R()) {
            return false;
        }
        m26943c(((BarLineChartBase) this.f96578f).mo51997G(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return super.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        VelocityTracker velocityTracker;
        if (this.f116875o == null) {
            this.f116875o = VelocityTracker.obtain();
        }
        this.f116875o.addMovement(motionEvent);
        int i = 3;
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.f116875o) != null) {
            velocityTracker.recycle();
            this.f116875o = null;
        }
        if (this.f96575c == 0) {
            this.f96577e.onTouchEvent(motionEvent);
        }
        if (!((BarLineChartBase) this.f96578f).m52036l0() && !((BarLineChartBase) this.f96578f).m52030r0() && !((BarLineChartBase) this.f96578f).m52029s0()) {
            return true;
        }
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action != 0) {
            boolean z = false;
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                AbstractC34967Oi6.m91635z(motionEvent, this.f116875o);
                                this.f96575c = 5;
                            }
                        } else if (motionEvent.getPointerCount() >= 2) {
                            ((BarLineChartBase) this.f96578f).m52006t();
                            m6076o(motionEvent);
                            this.f116871k = m6083h(motionEvent);
                            this.f116872l = m6082i(motionEvent);
                            float m6075p = m6075p(motionEvent);
                            this.f116873m = m6075p;
                            if (m6075p > 10.0f) {
                                if (((BarLineChartBase) this.f96578f).m52031q0()) {
                                    this.f96575c = 4;
                                } else if (((BarLineChartBase) this.f96578f).m52030r0() != ((BarLineChartBase) this.f96578f).m52029s0()) {
                                    if (((BarLineChartBase) this.f96578f).m52030r0()) {
                                        i = 2;
                                    }
                                    this.f96575c = i;
                                } else {
                                    if (this.f116871k > this.f116872l) {
                                        i = 2;
                                    }
                                    this.f96575c = i;
                                }
                            }
                            m6080k(this.f116870j, motionEvent);
                        }
                    } else {
                        this.f96575c = 0;
                        m26944b(motionEvent);
                    }
                } else {
                    int i2 = this.f96575c;
                    if (i2 == 1) {
                        ((BarLineChartBase) this.f96578f).m52006t();
                        float f2 = 0.0f;
                        if (((BarLineChartBase) this.f96578f).m52035m0()) {
                            f = motionEvent.getX() - this.f116869i.f28146c;
                        } else {
                            f = 0.0f;
                        }
                        if (((BarLineChartBase) this.f96578f).m52034n0()) {
                            f2 = motionEvent.getY() - this.f116869i.f28147d;
                        }
                        m6079l(motionEvent, f, f2);
                    } else if (i2 != 2 && i2 != 3 && i2 != 4) {
                        if (i2 == 0 && Math.abs(AbstractView$OnTouchListenerC44651li0.m26945a(motionEvent.getX(), this.f116869i.f28146c, motionEvent.getY(), this.f116869i.f28147d)) > this.f116879s && ((BarLineChartBase) this.f96578f).m52036l0()) {
                            if (!((BarLineChartBase) this.f96578f).m52033o0() || !((BarLineChartBase) this.f96578f).m52040h0()) {
                                z = true;
                            }
                            if (z) {
                                float abs = Math.abs(motionEvent.getX() - this.f116869i.f28146c);
                                float abs2 = Math.abs(motionEvent.getY() - this.f116869i.f28147d);
                                if ((((BarLineChartBase) this.f96578f).m52035m0() || abs2 >= abs) && (((BarLineChartBase) this.f96578f).m52034n0() || abs2 <= abs)) {
                                    this.f96574b = AbstractView$OnTouchListenerC44651li0.EnumC25766a.DRAG;
                                    this.f96575c = 1;
                                }
                            } else if (((BarLineChartBase) this.f96578f).m52032p0()) {
                                this.f96574b = AbstractView$OnTouchListenerC44651li0.EnumC25766a.DRAG;
                                if (((BarLineChartBase) this.f96578f).m52032p0()) {
                                    m6078m(motionEvent);
                                }
                            }
                        }
                    } else {
                        ((BarLineChartBase) this.f96578f).m52006t();
                        if (((BarLineChartBase) this.f96578f).m52030r0() || ((BarLineChartBase) this.f96578f).m52029s0()) {
                            m6077n(motionEvent);
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker2 = this.f116875o;
                int pointerId = motionEvent.getPointerId(0);
                velocityTracker2.computeCurrentVelocity(1000, AbstractC34967Oi6.m91646o());
                float yVelocity = velocityTracker2.getYVelocity(pointerId);
                float xVelocity = velocityTracker2.getXVelocity(pointerId);
                if ((Math.abs(xVelocity) > AbstractC34967Oi6.m91645p() || Math.abs(yVelocity) > AbstractC34967Oi6.m91645p()) && this.f96575c == 1 && ((BarLineChartBase) this.f96578f).m52015P()) {
                    m6074q();
                    this.f116876p = AnimationUtils.currentAnimationTimeMillis();
                    this.f116877q.f28146c = motionEvent.getX();
                    this.f116877q.f28147d = motionEvent.getY();
                    PE2 pe2 = this.f116878r;
                    pe2.f28146c = xVelocity;
                    pe2.f28147d = yVelocity;
                    AbstractC34967Oi6.m91637x(this.f96578f);
                }
                int i3 = this.f96575c;
                if (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5) {
                    ((BarLineChartBase) this.f96578f).mo51967r();
                    ((BarLineChartBase) this.f96578f).postInvalidate();
                }
                this.f96575c = 0;
                ((BarLineChartBase) this.f96578f).m52004w();
                VelocityTracker velocityTracker3 = this.f116875o;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f116875o = null;
                }
                m26944b(motionEvent);
            }
        } else {
            m26941e(motionEvent);
            m6074q();
            m6076o(motionEvent);
        }
        this.f116867g = ((BarLineChartBase) this.f96578f).m52017L().m106398J(this.f116867g, this.f96578f, true);
        return true;
    }

    /* renamed from: q */
    public void m6074q() {
        PE2 pe2 = this.f116878r;
        pe2.f28146c = 0.0f;
        pe2.f28147d = 0.0f;
    }
}
