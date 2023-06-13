package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
/* renamed from: Ex1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC32757Ex1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final float f8327b;

    /* renamed from: c */
    public final int f8328c;

    /* renamed from: d */
    public final int f8329d;

    /* renamed from: e */
    public final View f8330e;

    /* renamed from: f */
    public Runnable f8331f;

    /* renamed from: g */
    public Runnable f8332g;

    /* renamed from: h */
    public boolean f8333h;

    /* renamed from: i */
    public int f8334i;

    /* renamed from: j */
    public final int[] f8335j = new int[2];

    /* renamed from: Ex1$a */
    /* loaded from: classes.dex */
    public class RunnableC2025a implements Runnable {
        public RunnableC2025a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractView$OnTouchListenerC32757Ex1.this.f8330e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: Ex1$b */
    /* loaded from: classes.dex */
    public class RunnableC2026b implements Runnable {
        public RunnableC2026b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC32757Ex1.this.m108191e();
        }
    }

    public AbstractView$OnTouchListenerC32757Ex1(View view) {
        this.f8330e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f8327b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f8328c = tapTimeout;
        this.f8329d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: h */
    public static boolean m108188h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        if (f >= f4 && f2 >= f4 && f < (view.getRight() - view.getLeft()) + f3 && f2 < (view.getBottom() - view.getTop()) + f3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void m108192a() {
        Runnable runnable = this.f8332g;
        if (runnable != null) {
            this.f8330e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f8331f;
        if (runnable2 != null) {
            this.f8330e.removeCallbacks(runnable2);
        }
    }

    /* renamed from: b */
    public abstract InterfaceC52642zA5 mo69952b();

    /* renamed from: c */
    public abstract boolean mo69951c();

    /* renamed from: d */
    public boolean mo69974d() {
        InterfaceC52642zA5 mo69952b = mo69952b();
        if (mo69952b != null && mo69952b.mo1721c()) {
            mo69952b.dismiss();
            return true;
        }
        return true;
    }

    /* renamed from: e */
    public void m108191e() {
        m108192a();
        View view = this.f8330e;
        if (!view.isEnabled() || view.isLongClickable() || !mo69951c()) {
            return;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        view.onTouchEvent(obtain);
        obtain.recycle();
        this.f8333h = true;
    }

    /* renamed from: f */
    public final boolean m108190f(MotionEvent motionEvent) {
        R71 r71;
        boolean z;
        View view = this.f8330e;
        InterfaceC52642zA5 mo69952b = mo69952b();
        if (mo69952b == null || !mo69952b.mo1721c() || (r71 = (R71) mo69952b.mo1720k()) == null || !r71.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m108187i(view, obtainNoHistory);
        m108186j(r71, obtainNoHistory);
        boolean mo69863e = r71.mo69863e(obtainNoHistory, this.f8334i);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            z = true;
        } else {
            z = false;
        }
        if (!mo69863e || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L13;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m108189g(MotionEvent motionEvent) {
        View view = this.f8330e;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f8334i);
                    if (findPointerIndex >= 0 && !m108188h(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f8327b)) {
                        m108192a();
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
            }
            m108192a();
        } else {
            this.f8334i = motionEvent.getPointerId(0);
            if (this.f8331f == null) {
                this.f8331f = new RunnableC2025a();
            }
            view.postDelayed(this.f8331f, this.f8328c);
            if (this.f8332g == null) {
                this.f8332g = new RunnableC2026b();
            }
            view.postDelayed(this.f8332g, this.f8329d);
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m108187i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f8335j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    /* renamed from: j */
    public final boolean m108186j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f8335j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f8333h;
        if (z2) {
            if (!m108190f(motionEvent) && mo69974d()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            if (m108189g(motionEvent) && mo69951c()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f8330e.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f8333h = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f8333h = false;
        this.f8334i = -1;
        Runnable runnable = this.f8331f;
        if (runnable != null) {
            this.f8330e.removeCallbacks(runnable);
        }
    }
}
