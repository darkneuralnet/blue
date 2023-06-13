package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: a */
    public Runnable f72201a;

    /* renamed from: b */
    public OverScroller f72202b;

    /* renamed from: c */
    public boolean f72203c;

    /* renamed from: d */
    public int f72204d;

    /* renamed from: e */
    public int f72205e;

    /* renamed from: f */
    public int f72206f;

    /* renamed from: g */
    public VelocityTracker f72207g;

    /* renamed from: com.google.android.material.appbar.HeaderBehavior$a */
    /* loaded from: classes6.dex */
    public class RunnableC17669a implements Runnable {

        /* renamed from: b */
        public final CoordinatorLayout f72208b;

        /* renamed from: c */
        public final V f72209c;

        public RunnableC17669a(CoordinatorLayout coordinatorLayout, V v) {
            this.f72208b = coordinatorLayout;
            this.f72209c = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f72209c != null && (overScroller = HeaderBehavior.this.f72202b) != null) {
                if (overScroller.computeScrollOffset()) {
                    HeaderBehavior headerBehavior = HeaderBehavior.this;
                    headerBehavior.m50359i(this.f72208b, this.f72209c, headerBehavior.f72202b.getCurrY());
                    C38790bq6.m62468n0(this.f72209c, this);
                    return;
                }
                HeaderBehavior.this.mo50361g(this.f72208b, this.f72209c);
            }
        }
    }

    public HeaderBehavior() {
        this.f72204d = -1;
        this.f72206f = -1;
    }

    /* renamed from: a */
    public boolean mo50367a(V v) {
        return false;
    }

    /* renamed from: b */
    public final void m50366b() {
        if (this.f72207g == null) {
            this.f72207g = VelocityTracker.obtain();
        }
    }

    /* renamed from: c */
    public final boolean m50365c(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        Runnable runnable = this.f72201a;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f72201a = null;
        }
        if (this.f72202b == null) {
            this.f72202b = new OverScroller(v.getContext());
        }
        this.f72202b.fling(0, getTopAndBottomOffset(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f72202b.computeScrollOffset()) {
            RunnableC17669a runnableC17669a = new RunnableC17669a(coordinatorLayout, v);
            this.f72201a = runnableC17669a;
            C38790bq6.m62468n0(v, runnableC17669a);
            return true;
        }
        mo50361g(coordinatorLayout, v);
        return false;
    }

    /* renamed from: d */
    public int mo50364d(V v) {
        return -v.getHeight();
    }

    /* renamed from: e */
    public int mo50363e(V v) {
        return v.getHeight();
    }

    /* renamed from: f */
    public int mo50362f() {
        return getTopAndBottomOffset();
    }

    /* renamed from: g */
    public void mo50361g(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* renamed from: h */
    public final int m50360h(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo50358j(coordinatorLayout, v, mo50362f() - i, i2, i3);
    }

    /* renamed from: i */
    public int m50359i(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo50358j(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: j */
    public int mo50358j(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int m41475c;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i2 != 0 && topAndBottomOffset >= i2 && topAndBottomOffset <= i3 && topAndBottomOffset != (m41475c = C40898fN2.m41475c(i, i2, i3))) {
            setTopAndBottomOffset(m41475c);
            return topAndBottomOffset - m41475c;
        }
        return 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        if (this.f72206f < 0) {
            this.f72206f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f72203c) {
            int i = this.f72204d;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f72205e) > this.f72206f) {
                this.f72205e = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f72204d = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (mo50367a(v) && coordinatorLayout.isPointInChildBounds(v, x, y2)) {
                z = true;
            } else {
                z = false;
            }
            this.f72203c = z;
            if (z) {
                this.f72205e = y2;
                this.f72204d = motionEvent.getPointerId(0);
                m50366b();
                OverScroller overScroller = this.f72202b;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f72202b.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f72207g;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        if (motionEvent.getActionIndex() == 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        this.f72204d = motionEvent.getPointerId(i);
                        this.f72205e = (int) (motionEvent.getY(i) + 0.5f);
                    }
                }
            } else {
                int findPointerIndex = motionEvent.findPointerIndex(this.f72204d);
                if (findPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(findPointerIndex);
                this.f72205e = y;
                m50360h(coordinatorLayout, v, this.f72205e - y, mo50364d(v), 0);
            }
            z = false;
            velocityTracker2 = this.f72207g;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (!this.f72203c && !z) {
                return false;
            }
        }
        VelocityTracker velocityTracker3 = this.f72207g;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f72207g.computeCurrentVelocity(1000);
            m50365c(coordinatorLayout, v, -mo50363e(v), 0, this.f72207g.getYVelocity(this.f72204d));
            z = true;
            this.f72203c = false;
            this.f72204d = -1;
            velocityTracker = this.f72207g;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f72207g = null;
            }
            velocityTracker2 = this.f72207g;
            if (velocityTracker2 != null) {
            }
            return !this.f72203c ? true : true;
        }
        z = false;
        this.f72203c = false;
        this.f72204d = -1;
        velocityTracker = this.f72207g;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.f72207g;
        if (velocityTracker2 != null) {
        }
        if (!this.f72203c) {
        }
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f72204d = -1;
        this.f72206f = -1;
    }
}
