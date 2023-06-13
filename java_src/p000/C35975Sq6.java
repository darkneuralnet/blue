package p000;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
/* renamed from: Sq6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C35975Sq6 {

    /* renamed from: x */
    public static final Interpolator f34322x = new animationInterpolatorC7551a();

    /* renamed from: a */
    public int f34323a;

    /* renamed from: b */
    public int f34324b;

    /* renamed from: d */
    public float[] f34326d;

    /* renamed from: e */
    public float[] f34327e;

    /* renamed from: f */
    public float[] f34328f;

    /* renamed from: g */
    public float[] f34329g;

    /* renamed from: h */
    public int[] f34330h;

    /* renamed from: i */
    public int[] f34331i;

    /* renamed from: j */
    public int[] f34332j;

    /* renamed from: k */
    public int f34333k;

    /* renamed from: l */
    public VelocityTracker f34334l;

    /* renamed from: m */
    public float f34335m;

    /* renamed from: n */
    public float f34336n;

    /* renamed from: o */
    public int f34337o;

    /* renamed from: p */
    public final int f34338p;

    /* renamed from: q */
    public int f34339q;

    /* renamed from: r */
    public OverScroller f34340r;

    /* renamed from: s */
    public final AbstractC7553c f34341s;

    /* renamed from: t */
    public View f34342t;

    /* renamed from: u */
    public boolean f34343u;

    /* renamed from: v */
    public final ViewGroup f34344v;

    /* renamed from: c */
    public int f34325c = -1;

    /* renamed from: w */
    public final Runnable f34345w = new RunnableC7552b();

    /* renamed from: Sq6$a  reason: invalid class name */
    /* loaded from: classes.dex */
    public class animationInterpolatorC7551a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: Sq6$b */
    /* loaded from: classes.dex */
    public class RunnableC7552b implements Runnable {
        public RunnableC7552b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C35975Sq6.this.m84780L(0);
        }
    }

    /* renamed from: Sq6$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC7553c {
        /* renamed from: a */
        public int mo49043a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public int mo49042b(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: c */
        public int m84746c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo49041d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo50058e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void mo66041f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean mo67556g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo67555h(int i, int i2) {
        }

        /* renamed from: i */
        public void mo50235i(View view, int i) {
        }

        /* renamed from: j */
        public void mo49040j(int i) {
        }

        /* renamed from: k */
        public void mo49039k(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: l */
        public void mo49038l(View view, float f, float f2) {
        }

        /* renamed from: m */
        public abstract boolean mo49037m(View view, int i);
    }

    public C35975Sq6(Context context, ViewGroup viewGroup, AbstractC7553c abstractC7553c) {
        if (viewGroup != null) {
            if (abstractC7553c != null) {
                this.f34344v = viewGroup;
                this.f34341s = abstractC7553c;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.f34338p = i;
                this.f34337o = i;
                this.f34324b = viewConfiguration.getScaledTouchSlop();
                this.f34335m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f34336n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f34340r = new OverScroller(context, f34322x);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    /* renamed from: o */
    public static C35975Sq6 m84758o(ViewGroup viewGroup, float f, AbstractC7553c abstractC7553c) {
        C35975Sq6 m84757p = m84757p(viewGroup, abstractC7553c);
        m84757p.f34324b = (int) (m84757p.f34324b * (1.0f / f));
        return m84757p;
    }

    /* renamed from: p */
    public static C35975Sq6 m84757p(ViewGroup viewGroup, AbstractC7553c abstractC7553c) {
        return new C35975Sq6(viewGroup.getContext(), viewGroup, abstractC7553c);
    }

    /* renamed from: A */
    public int m84791A() {
        return this.f34324b;
    }

    /* renamed from: B */
    public int m84790B() {
        return this.f34323a;
    }

    /* renamed from: C */
    public boolean m84789C(int i, int i2) {
        return m84786F(this.f34342t, i, i2);
    }

    /* renamed from: D */
    public boolean m84788D(int i) {
        return ((1 << i) & this.f34333k) != 0;
    }

    /* renamed from: E */
    public final boolean m84787E(int i) {
        if (!m84788D(i)) {
            Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public boolean m84786F(View view, int i, int i2) {
        if (view == null || i < view.getLeft() || i >= view.getRight() || i2 < view.getTop() || i2 >= view.getBottom()) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public void m84785G(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m84771b();
        }
        if (this.f34334l == null) {
            this.f34334l = VelocityTracker.obtain();
        }
        this.f34334l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f34323a == 1 && pointerId == this.f34325c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i2 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i2);
                                            if (pointerId2 != this.f34325c) {
                                                View m84752u = m84752u((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                                View view = this.f34342t;
                                                if (m84752u == view && m84773S(view, pointerId2)) {
                                                    i = this.f34325c;
                                                    break;
                                                }
                                            }
                                            i2++;
                                        } else {
                                            i = -1;
                                            break;
                                        }
                                    }
                                    if (i == -1) {
                                        m84784H();
                                    }
                                }
                                m84762k(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x = motionEvent.getX(actionIndex);
                        float y = motionEvent.getY(actionIndex);
                        m84782J(x, y, pointerId3);
                        if (this.f34323a == 0) {
                            m84773S(m84752u((int) x, (int) y), pointerId3);
                            int i3 = this.f34330h[pointerId3];
                            int i4 = this.f34339q;
                            if ((i3 & i4) != 0) {
                                this.f34341s.mo67555h(i3 & i4, pointerId3);
                                return;
                            }
                            return;
                        } else if (m84789C((int) x, (int) y)) {
                            m84773S(this.f34342t, pointerId3);
                            return;
                        } else {
                            return;
                        }
                    }
                    if (this.f34323a == 1) {
                        m84756q(0.0f, 0.0f);
                    }
                    m84771b();
                    return;
                } else if (this.f34323a == 1) {
                    if (m84787E(this.f34325c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f34325c);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f34328f;
                        int i5 = this.f34325c;
                        int i6 = (int) (x2 - fArr[i5]);
                        int i7 = (int) (y2 - this.f34329g[i5]);
                        m84754s(this.f34342t.getLeft() + i6, this.f34342t.getTop() + i7, i6, i7);
                        m84781K(motionEvent);
                        return;
                    }
                    return;
                } else {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (i2 < pointerCount2) {
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (m84787E(pointerId4)) {
                            float x3 = motionEvent.getX(i2);
                            float y3 = motionEvent.getY(i2);
                            float f = x3 - this.f34326d[pointerId4];
                            float f2 = y3 - this.f34327e[pointerId4];
                            m84783I(f, f2, pointerId4);
                            if (this.f34323a != 1) {
                                View m84752u2 = m84752u((int) x3, (int) y3);
                                if (m84766g(m84752u2, f, f2) && m84773S(m84752u2, pointerId4)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                    m84781K(motionEvent);
                    return;
                }
            }
            if (this.f34323a == 1) {
                m84784H();
            }
            m84771b();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View m84752u3 = m84752u((int) x4, (int) y4);
        m84782J(x4, y4, pointerId5);
        m84773S(m84752u3, pointerId5);
        int i8 = this.f34330h[pointerId5];
        int i9 = this.f34339q;
        if ((i8 & i9) != 0) {
            this.f34341s.mo67555h(i8 & i9, pointerId5);
        }
    }

    /* renamed from: H */
    public final void m84784H() {
        this.f34334l.computeCurrentVelocity(1000, this.f34335m);
        m84756q(m84765h(this.f34334l.getXVelocity(this.f34325c), this.f34336n, this.f34335m), m84765h(this.f34334l.getYVelocity(this.f34325c), this.f34336n, this.f34335m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [Sq6$c] */
    /* renamed from: I */
    public final void m84783I(float f, float f2, int i) {
        boolean m84769d = m84769d(f, f2, i, 1);
        boolean z = m84769d;
        if (m84769d(f2, f, i, 4)) {
            z = m84769d | true;
        }
        boolean z2 = z;
        if (m84769d(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | true;
        }
        ?? r0 = z2;
        if (m84769d(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | true;
        }
        if (r0 != 0) {
            int[] iArr = this.f34331i;
            iArr[i] = iArr[i] | r0;
            this.f34341s.mo66041f(r0, i);
        }
    }

    /* renamed from: J */
    public final void m84782J(float f, float f2, int i) {
        m84753t(i);
        float[] fArr = this.f34326d;
        this.f34328f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f34327e;
        this.f34329g[i] = f2;
        fArr2[i] = f2;
        this.f34330h[i] = m84747z((int) f, (int) f2);
        this.f34333k |= 1 << i;
    }

    /* renamed from: K */
    public final void m84781K(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m84787E(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f34328f[pointerId] = x;
                this.f34329g[pointerId] = y;
            }
        }
    }

    /* renamed from: L */
    public void m84780L(int i) {
        this.f34344v.removeCallbacks(this.f34345w);
        if (this.f34323a != i) {
            this.f34323a = i;
            this.f34341s.mo49040j(i);
            if (this.f34323a == 0) {
                this.f34342t = null;
            }
        }
    }

    /* renamed from: M */
    public void m84779M(int i) {
        this.f34337o = i;
    }

    /* renamed from: N */
    public void m84778N(int i) {
        this.f34339q = i;
    }

    /* renamed from: O */
    public void m84777O(float f) {
        this.f34336n = f;
    }

    /* renamed from: P */
    public boolean m84776P(int i, int i2) {
        if (this.f34343u) {
            return m84751v(i, i2, (int) this.f34334l.getXVelocity(this.f34325c), (int) this.f34334l.getYVelocity(this.f34325c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L58;
     */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m84775Q(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        View m84752u;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m84771b();
        }
        if (this.f34334l == null) {
            this.f34334l = VelocityTracker.obtain();
        }
        this.f34334l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                m84762k(motionEvent.getPointerId(actionIndex));
                            }
                        } else {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y = motionEvent.getY(actionIndex);
                            m84782J(x, y, pointerId);
                            int i = this.f34323a;
                            if (i == 0) {
                                int i2 = this.f34330h[pointerId];
                                int i3 = this.f34339q;
                                if ((i2 & i3) != 0) {
                                    this.f34341s.mo67555h(i2 & i3, pointerId);
                                }
                            } else if (i == 2 && (m84752u = m84752u((int) x, (int) y)) == this.f34342t) {
                                m84773S(m84752u, pointerId);
                            }
                        }
                    }
                } else if (this.f34326d != null && this.f34327e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i4 = 0; i4 < pointerCount; i4++) {
                        int pointerId2 = motionEvent.getPointerId(i4);
                        if (m84787E(pointerId2)) {
                            float x2 = motionEvent.getX(i4);
                            float y2 = motionEvent.getY(i4);
                            float f = x2 - this.f34326d[pointerId2];
                            float f2 = y2 - this.f34327e[pointerId2];
                            View m84752u2 = m84752u((int) x2, (int) y2);
                            if (m84752u2 != null && m84766g(m84752u2, f, f2)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                int left = m84752u2.getLeft();
                                int i5 = (int) f;
                                int mo49043a = this.f34341s.mo49043a(m84752u2, left + i5, i5);
                                int top = m84752u2.getTop();
                                int i6 = (int) f2;
                                int mo49042b = this.f34341s.mo49042b(m84752u2, top + i6, i6);
                                int mo49041d = this.f34341s.mo49041d(m84752u2);
                                int mo50058e = this.f34341s.mo50058e(m84752u2);
                                if (mo49041d != 0) {
                                    if (mo49041d > 0) {
                                    }
                                }
                                if (mo50058e == 0) {
                                    break;
                                } else if (mo50058e > 0 && mo49042b == top) {
                                    break;
                                }
                            }
                            m84783I(f, f2, pointerId2);
                            if (this.f34323a != 1) {
                                if (z2 && m84773S(m84752u2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    m84781K(motionEvent);
                }
                z = false;
            }
            m84771b();
            z = false;
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            z = false;
            int pointerId3 = motionEvent.getPointerId(0);
            m84782J(x3, y3, pointerId3);
            View m84752u3 = m84752u((int) x3, (int) y3);
            if (m84752u3 == this.f34342t && this.f34323a == 2) {
                m84773S(m84752u3, pointerId3);
            }
            int i7 = this.f34330h[pointerId3];
            int i8 = this.f34339q;
            if ((i7 & i8) != 0) {
                this.f34341s.mo67555h(i7 & i8, pointerId3);
            }
        }
        if (this.f34323a == 1) {
            return true;
        }
        return z;
    }

    /* renamed from: R */
    public boolean m84774R(View view, int i, int i2) {
        this.f34342t = view;
        this.f34325c = -1;
        boolean m84751v = m84751v(i, i2, 0, 0);
        if (!m84751v && this.f34323a == 0 && this.f34342t != null) {
            this.f34342t = null;
        }
        return m84751v;
    }

    /* renamed from: S */
    public boolean m84773S(View view, int i) {
        if (view == this.f34342t && this.f34325c == i) {
            return true;
        }
        if (view != null && this.f34341s.mo49037m(view, i)) {
            this.f34325c = i;
            m84770c(view, i);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m84772a() {
        m84771b();
        if (this.f34323a == 2) {
            int currX = this.f34340r.getCurrX();
            int currY = this.f34340r.getCurrY();
            this.f34340r.abortAnimation();
            int currX2 = this.f34340r.getCurrX();
            int currY2 = this.f34340r.getCurrY();
            this.f34341s.mo49039k(this.f34342t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m84780L(0);
    }

    /* renamed from: b */
    public void m84771b() {
        this.f34325c = -1;
        m84763j();
        VelocityTracker velocityTracker = this.f34334l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f34334l = null;
        }
    }

    /* renamed from: c */
    public void m84770c(View view, int i) {
        if (view.getParent() == this.f34344v) {
            this.f34342t = view;
            this.f34325c = i;
            this.f34341s.mo50235i(view, i);
            m84780L(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f34344v + ")");
    }

    /* renamed from: d */
    public final boolean m84769d(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f34330h[i] & i2) != i2 || (this.f34339q & i2) == 0 || (this.f34332j[i] & i2) == i2 || (this.f34331i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f34324b;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f34341s.mo67556g(i2)) {
            int[] iArr = this.f34332j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f34331i[i] & i2) != 0 || abs <= this.f34324b) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    public boolean m84768e(int i) {
        int length = this.f34326d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m84767f(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean m84767f(int i, int i2) {
        boolean z;
        boolean z2;
        if (!m84788D(i2)) {
            return false;
        }
        if ((i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f = this.f34328f[i2] - this.f34326d[i2];
        float f2 = this.f34329g[i2] - this.f34327e[i2];
        if (z && z2) {
            int i3 = this.f34324b;
            if ((f * f) + (f2 * f2) <= i3 * i3) {
                return false;
            }
            return true;
        } else if (z) {
            if (Math.abs(f) <= this.f34324b) {
                return false;
            }
            return true;
        } else if (!z2 || Math.abs(f2) <= this.f34324b) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: g */
    public final boolean m84766g(View view, float f, float f2) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        if (this.f34341s.mo49041d(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f34341s.mo50058e(view) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            int i = this.f34324b;
            if ((f * f) + (f2 * f2) <= i * i) {
                return false;
            }
            return true;
        } else if (z) {
            if (Math.abs(f) <= this.f34324b) {
                return false;
            }
            return true;
        } else if (!z2 || Math.abs(f2) <= this.f34324b) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: h */
    public final float m84765h(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: i */
    public final int m84764i(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: j */
    public final void m84763j() {
        float[] fArr = this.f34326d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f34327e, 0.0f);
        Arrays.fill(this.f34328f, 0.0f);
        Arrays.fill(this.f34329g, 0.0f);
        Arrays.fill(this.f34330h, 0);
        Arrays.fill(this.f34331i, 0);
        Arrays.fill(this.f34332j, 0);
        this.f34333k = 0;
    }

    /* renamed from: k */
    public final void m84762k(int i) {
        if (this.f34326d != null && m84788D(i)) {
            this.f34326d[i] = 0.0f;
            this.f34327e[i] = 0.0f;
            this.f34328f[i] = 0.0f;
            this.f34329g[i] = 0.0f;
            this.f34330h[i] = 0;
            this.f34331i[i] = 0;
            this.f34332j[i] = 0;
            this.f34333k = (~(1 << i)) & this.f34333k;
        }
    }

    /* renamed from: l */
    public final int m84761l(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.f34344v.getWidth();
        float f = width / 2;
        float m84755r = f + (m84755r(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(m84755r / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    /* renamed from: m */
    public final int m84760m(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int m84764i = m84764i(i3, (int) this.f34336n, (int) this.f34335m);
        int m84764i2 = m84764i(i4, (int) this.f34336n, (int) this.f34335m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(m84764i);
        int abs4 = Math.abs(m84764i2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (m84764i != 0) {
            f = abs3;
            f2 = i5;
        } else {
            f = abs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (m84764i2 != 0) {
            f3 = abs4;
            f4 = i5;
        } else {
            f3 = abs2;
            f4 = i6;
        }
        return (int) ((m84761l(i, m84764i, this.f34341s.mo49041d(view)) * f5) + (m84761l(i2, m84764i2, this.f34341s.mo50058e(view)) * (f3 / f4)));
    }

    /* renamed from: n */
    public boolean m84759n(boolean z) {
        if (this.f34323a == 2) {
            boolean computeScrollOffset = this.f34340r.computeScrollOffset();
            int currX = this.f34340r.getCurrX();
            int currY = this.f34340r.getCurrY();
            int left = currX - this.f34342t.getLeft();
            int top = currY - this.f34342t.getTop();
            if (left != 0) {
                C38790bq6.m62486f0(this.f34342t, left);
            }
            if (top != 0) {
                C38790bq6.m62483g0(this.f34342t, top);
            }
            if (left != 0 || top != 0) {
                this.f34341s.mo49039k(this.f34342t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f34340r.getFinalX() && currY == this.f34340r.getFinalY()) {
                this.f34340r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f34344v.post(this.f34345w);
                } else {
                    m84780L(0);
                }
            }
        }
        if (this.f34323a != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final void m84756q(float f, float f2) {
        this.f34343u = true;
        this.f34341s.mo49038l(this.f34342t, f, f2);
        this.f34343u = false;
        if (this.f34323a == 1) {
            m84780L(0);
        }
    }

    /* renamed from: r */
    public final float m84755r(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: s */
    public final void m84754s(int i, int i2, int i3, int i4) {
        int left = this.f34342t.getLeft();
        int top = this.f34342t.getTop();
        if (i3 != 0) {
            i = this.f34341s.mo49043a(this.f34342t, i, i3);
            C38790bq6.m62486f0(this.f34342t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f34341s.mo49042b(this.f34342t, i2, i4);
            C38790bq6.m62483g0(this.f34342t, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f34341s.mo49039k(this.f34342t, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: t */
    public final void m84753t(int i) {
        float[] fArr = this.f34326d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f34327e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f34328f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f34329g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f34330h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f34331i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f34332j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f34326d = fArr2;
            this.f34327e = fArr3;
            this.f34328f = fArr4;
            this.f34329g = fArr5;
            this.f34330h = iArr;
            this.f34331i = iArr2;
            this.f34332j = iArr3;
        }
    }

    /* renamed from: u */
    public View m84752u(int i, int i2) {
        for (int childCount = this.f34344v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f34344v.getChildAt(this.f34341s.m84746c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: v */
    public final boolean m84751v(int i, int i2, int i3, int i4) {
        int left = this.f34342t.getLeft();
        int top = this.f34342t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f34340r.abortAnimation();
            m84780L(0);
            return false;
        }
        this.f34340r.startScroll(left, top, i5, i6, m84760m(this.f34342t, i5, i6, i3, i4));
        m84780L(2);
        return true;
    }

    /* renamed from: w */
    public View m84750w() {
        return this.f34342t;
    }

    /* renamed from: x */
    public int m84749x() {
        return this.f34338p;
    }

    /* renamed from: y */
    public int m84748y() {
        return this.f34337o;
    }

    /* renamed from: z */
    public final int m84747z(int i, int i2) {
        int i3;
        if (i < this.f34344v.getLeft() + this.f34337o) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.f34344v.getTop() + this.f34337o) {
            i3 |= 4;
        }
        if (i > this.f34344v.getRight() - this.f34337o) {
            i3 |= 2;
        }
        if (i2 > this.f34344v.getBottom() - this.f34337o) {
            return i3 | 8;
        }
        return i3;
    }
}
