package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import kotlin.KotlinVersion;
/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements L43, K43, I43 {

    /* renamed from: U */
    public static final String f55653U = "SwipeRefreshLayout";

    /* renamed from: W */
    public static final int[] f55654W = {16842766};

    /* renamed from: A */
    public int f55655A;

    /* renamed from: B */
    public int f55656B;

    /* renamed from: C */
    public int f55657C;

    /* renamed from: D */
    public C32864Fj0 f55658D;

    /* renamed from: E */
    public Animation f55659E;

    /* renamed from: F */
    public Animation f55660F;

    /* renamed from: G */
    public Animation f55661G;

    /* renamed from: H */
    public Animation f55662H;

    /* renamed from: I */
    public Animation f55663I;

    /* renamed from: J */
    public boolean f55664J;

    /* renamed from: K */
    public int f55665K;

    /* renamed from: P */
    public boolean f55666P;

    /* renamed from: Q */
    public boolean f55667Q;

    /* renamed from: R */
    public Animation.AnimationListener f55668R;

    /* renamed from: S */
    public final Animation f55669S;

    /* renamed from: T */
    public final Animation f55670T;

    /* renamed from: b */
    public View f55671b;

    /* renamed from: c */
    public InterfaceC11985j f55672c;

    /* renamed from: d */
    public boolean f55673d;

    /* renamed from: e */
    public int f55674e;

    /* renamed from: f */
    public float f55675f;

    /* renamed from: g */
    public float f55676g;

    /* renamed from: h */
    public final M43 f55677h;

    /* renamed from: i */
    public final J43 f55678i;

    /* renamed from: j */
    public final int[] f55679j;

    /* renamed from: k */
    public final int[] f55680k;

    /* renamed from: l */
    public final int[] f55681l;

    /* renamed from: m */
    public boolean f55682m;

    /* renamed from: n */
    public int f55683n;

    /* renamed from: o */
    public int f55684o;

    /* renamed from: p */
    public float f55685p;

    /* renamed from: q */
    public float f55686q;

    /* renamed from: r */
    public boolean f55687r;

    /* renamed from: s */
    public int f55688s;

    /* renamed from: t */
    public boolean f55689t;

    /* renamed from: u */
    public boolean f55690u;

    /* renamed from: v */
    public final DecelerateInterpolator f55691v;

    /* renamed from: w */
    public C52368yj0 f55692w;

    /* renamed from: x */
    public int f55693x;

    /* renamed from: y */
    public int f55694y;

    /* renamed from: z */
    public float f55695z;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a  reason: invalid class name */
    /* loaded from: classes.dex */
    public class animationAnimation$AnimationListenerC11976a implements Animation.AnimationListener {
        public animationAnimation$AnimationListenerC11976a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InterfaceC11985j interfaceC11985j;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f55673d) {
                swipeRefreshLayout.f55658D.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                SwipeRefreshLayout.this.f55658D.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f55664J && (interfaceC11985j = swipeRefreshLayout2.f55672c) != null) {
                    interfaceC11985j.onRefresh();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f55684o = swipeRefreshLayout3.f55692w.getTop();
                return;
            }
            swipeRefreshLayout.m66028m();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    /* loaded from: classes.dex */
    public class C11977b extends Animation {
        public C11977b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.m66027n(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    /* loaded from: classes.dex */
    public class C11978c extends Animation {
        public C11978c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.m66027n(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    /* loaded from: classes.dex */
    public class C11979d extends Animation {

        /* renamed from: b */
        public final /* synthetic */ int f55700b;

        /* renamed from: c */
        public final /* synthetic */ int f55701c;

        public C11979d(int i, int i2) {
            this.f55700b = i;
            this.f55701c = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            C32864Fj0 c32864Fj0 = SwipeRefreshLayout.this.f55658D;
            int i = this.f55700b;
            c32864Fj0.setAlpha((int) (i + ((this.f55701c - i) * f)));
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e  reason: invalid class name */
    /* loaded from: classes.dex */
    public class animationAnimation$AnimationListenerC11980e implements Animation.AnimationListener {
        public animationAnimation$AnimationListenerC11980e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f55689t) {
                swipeRefreshLayout.m66019v(null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    /* loaded from: classes.dex */
    public class C11981f extends Animation {
        public C11981f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            int i;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f55666P) {
                i = swipeRefreshLayout.f55656B - Math.abs(swipeRefreshLayout.f55655A);
            } else {
                i = swipeRefreshLayout.f55656B;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i2 = swipeRefreshLayout2.f55694y;
            SwipeRefreshLayout.this.m66024q((i2 + ((int) ((i - i2) * f))) - swipeRefreshLayout2.f55692w.getTop());
            SwipeRefreshLayout.this.f55658D.m106683e(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    /* loaded from: classes.dex */
    public class C11982g extends Animation {
        public C11982g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.m66030k(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    /* loaded from: classes.dex */
    public class C11983h extends Animation {
        public C11983h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.f55695z;
            swipeRefreshLayout.m66027n(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.m66030k(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    /* loaded from: classes.dex */
    public interface InterfaceC11984i {
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j */
    /* loaded from: classes.dex */
    public interface InterfaceC11985j {
        void onRefresh();
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void m66040a(int i, Animation.AnimationListener animationListener) {
        this.f55694y = i;
        this.f55669S.reset();
        this.f55669S.setDuration(200L);
        this.f55669S.setInterpolator(this.f55691v);
        if (animationListener != null) {
            this.f55692w.m2786b(animationListener);
        }
        this.f55692w.clearAnimation();
        this.f55692w.startAnimation(this.f55669S);
    }

    /* renamed from: b */
    public final void m66039b(int i, Animation.AnimationListener animationListener) {
        if (this.f55689t) {
            m66018w(i, animationListener);
            return;
        }
        this.f55694y = i;
        this.f55670T.reset();
        this.f55670T.setDuration(200L);
        this.f55670T.setInterpolator(this.f55691v);
        if (animationListener != null) {
            this.f55692w.m2786b(animationListener);
        }
        this.f55692w.clearAnimation();
        this.f55692w.startAnimation(this.f55670T);
    }

    /* renamed from: c */
    public boolean m66038c() {
        View view = this.f55671b;
        if (view instanceof ListView) {
            return C32713Es2.m108283a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    /* renamed from: d */
    public final void m66037d() {
        this.f55692w = new C52368yj0(getContext());
        C32864Fj0 c32864Fj0 = new C32864Fj0(getContext());
        this.f55658D = c32864Fj0;
        c32864Fj0.m106676l(1);
        this.f55692w.setImageDrawable(this.f55658D);
        this.f55692w.setVisibility(8);
        addView(this.f55692w);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f55678i.m101216a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f55678i.m101215b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f55678i.m101214c(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f55678i.m101211f(i, i2, i3, i4, iArr);
    }

    /* renamed from: e */
    public void m66036e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        if (i5 == 0) {
            this.f55678i.m101212e(i, i2, i3, i4, iArr, i5, iArr2);
        }
    }

    /* renamed from: f */
    public final void m66035f() {
        if (this.f55671b == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f55692w)) {
                    this.f55671b = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public final void m66034g(float f) {
        animationAnimation$AnimationListenerC11980e animationanimation_animationlistenerc11980e;
        if (f > this.f55675f) {
            m66025p(true, true);
            return;
        }
        this.f55673d = false;
        this.f55658D.m106678j(0.0f, 0.0f);
        if (!this.f55689t) {
            animationanimation_animationlistenerc11980e = new animationAnimation$AnimationListenerC11980e();
        } else {
            animationanimation_animationlistenerc11980e = null;
        }
        m66039b(this.f55684o, animationanimation_animationlistenerc11980e);
        this.f55658D.m106684d(false);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f55693x;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f55677h.m95845a();
    }

    /* renamed from: h */
    public final boolean m66033h(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f55678i.m101206k();
    }

    /* renamed from: i */
    public boolean m66032i() {
        return this.f55673d;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f55678i.m101204m();
    }

    /* renamed from: j */
    public final void m66031j(float f) {
        this.f55658D.m106684d(true);
        float min = Math.min(1.0f, Math.abs(f / this.f55675f));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f55675f;
        int i = this.f55657C;
        if (i <= 0) {
            if (this.f55666P) {
                i = this.f55656B - this.f55655A;
            } else {
                i = this.f55656B;
            }
        }
        float f2 = i;
        double max2 = Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.f55655A + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f55692w.getVisibility() != 0) {
            this.f55692w.setVisibility(0);
        }
        if (!this.f55689t) {
            this.f55692w.setScaleX(1.0f);
            this.f55692w.setScaleY(1.0f);
        }
        if (this.f55689t) {
            m66027n(Math.min(1.0f, f / this.f55675f));
        }
        if (f < this.f55675f) {
            if (this.f55658D.getAlpha() > 76 && !m66033h(this.f55661G)) {
                m66020u();
            }
        } else if (this.f55658D.getAlpha() < 255 && !m66033h(this.f55662H)) {
            m66021t();
        }
        this.f55658D.m106678j(0.0f, Math.min(0.8f, max * 0.8f));
        this.f55658D.m106683e(Math.min(1.0f, max));
        this.f55658D.m106681g((((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f);
        m66024q(i2 - this.f55684o);
    }

    /* renamed from: k */
    public void m66030k(float f) {
        int i = this.f55694y;
        m66024q((i + ((int) ((this.f55655A - i) * f))) - this.f55692w.getTop());
    }

    /* renamed from: l */
    public final void m66029l(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f55688s) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f55688s = motionEvent.getPointerId(i);
        }
    }

    /* renamed from: m */
    public void m66028m() {
        this.f55692w.clearAnimation();
        this.f55658D.stop();
        this.f55692w.setVisibility(8);
        m66026o(KotlinVersion.MAX_COMPONENT_VALUE);
        if (this.f55689t) {
            m66027n(0.0f);
        } else {
            m66024q(this.f55655A - this.f55684o);
        }
        this.f55684o = this.f55692w.getTop();
    }

    /* renamed from: n */
    public void m66027n(float f) {
        this.f55692w.setScaleX(f);
        this.f55692w.setScaleY(f);
    }

    /* renamed from: o */
    public final void m66026o(int i) {
        this.f55692w.getBackground().setAlpha(i);
        this.f55658D.setAlpha(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m66028m();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m66035f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f55690u && actionMasked == 0) {
            this.f55690u = false;
        }
        if (!isEnabled() || this.f55690u || m66038c() || this.f55673d || this.f55682m) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            m66029l(motionEvent);
                        }
                    }
                } else {
                    int i = this.f55688s;
                    if (i == -1) {
                        Log.e(f55653U, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    m66022s(motionEvent.getY(findPointerIndex));
                }
            }
            this.f55687r = false;
            this.f55688s = -1;
        } else {
            m66024q(this.f55655A - this.f55692w.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f55688s = pointerId;
            this.f55687r = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f55686q = motionEvent.getY(findPointerIndex2);
        }
        return this.f55687r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f55671b == null) {
            m66035f();
        }
        View view = this.f55671b;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f55692w.getMeasuredWidth();
        int measuredHeight2 = this.f55692w.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f55684o;
        this.f55692w.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f55671b == null) {
            m66035f();
        }
        View view = this.f55671b;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f55692w.measure(View.MeasureSpec.makeMeasureSpec(this.f55665K, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f55665K, 1073741824));
        this.f55693x = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f55692w) {
                this.f55693x = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // p000.K43
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // p000.L43
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        m66036e(i, i2, i3, i4, this.f55680k, i5, iArr);
        int i7 = i4 - (iArr[1] - i6);
        int i8 = i7 == 0 ? i4 + this.f55680k[1] : i7;
        if (i8 >= 0 || m66038c()) {
            return;
        }
        float abs = this.f55676g + Math.abs(i8);
        this.f55676g = abs;
        m66031j(abs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // p000.K43
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f55696b);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f55673d);
    }

    @Override // p000.K43
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // p000.K43
    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f55690u && actionMasked == 0) {
            this.f55690u = false;
        }
        if (!isEnabled() || this.f55690u || m66038c() || this.f55673d || this.f55682m) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        return false;
                    }
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            m66029l(motionEvent);
                        }
                    } else {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            Log.e(f55653U, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                            return false;
                        }
                        this.f55688s = motionEvent.getPointerId(actionIndex);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f55688s);
                    if (findPointerIndex < 0) {
                        Log.e(f55653U, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y = motionEvent.getY(findPointerIndex);
                    m66022s(y);
                    if (this.f55687r) {
                        float f = (y - this.f55685p) * 0.5f;
                        if (f <= 0.0f) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        m66031j(f);
                    }
                }
            } else {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f55688s);
                if (findPointerIndex2 < 0) {
                    Log.e(f55653U, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f55687r) {
                    this.f55687r = false;
                    m66034g((motionEvent.getY(findPointerIndex2) - this.f55685p) * 0.5f);
                }
                this.f55688s = -1;
                return false;
            }
        } else {
            this.f55688s = motionEvent.getPointerId(0);
            this.f55687r = false;
        }
        return true;
    }

    /* renamed from: p */
    public final void m66025p(boolean z, boolean z2) {
        if (this.f55673d != z) {
            this.f55664J = z2;
            m66035f();
            this.f55673d = z;
            if (z) {
                m66040a(this.f55684o, this.f55668R);
            } else {
                m66019v(this.f55668R);
            }
        }
    }

    /* renamed from: q */
    public void m66024q(int i) {
        this.f55692w.bringToFront();
        C38790bq6.m62483g0(this.f55692w, i);
        this.f55684o = this.f55692w.getTop();
    }

    /* renamed from: r */
    public final Animation m66023r(int i, int i2) {
        C11979d c11979d = new C11979d(i, i2);
        c11979d.setDuration(300L);
        this.f55692w.m2786b(null);
        this.f55692w.clearAnimation();
        this.f55692w.startAnimation(c11979d);
        return c11979d;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.f55671b;
        if (view != null && !C38790bq6.m62501a0(view)) {
            if (!this.f55667Q && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(z);
                return;
            }
            return;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* renamed from: s */
    public final void m66022s(float f) {
        float f2 = this.f55686q;
        int i = this.f55674e;
        if (f - f2 > i && !this.f55687r) {
            this.f55685p = f2 + i;
            this.f55687r = true;
            this.f55658D.setAlpha(76);
        }
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m66035f();
        this.f55658D.m106682f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = NA0.m94301c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f55675f = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            m66028m();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.f55667Q = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f55678i.m101203n(z);
    }

    public void setOnChildScrollUpCallback(InterfaceC11984i interfaceC11984i) {
    }

    public void setOnRefreshListener(InterfaceC11985j interfaceC11985j) {
        this.f55672c = interfaceC11985j;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f55692w.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(NA0.m94301c(getContext(), i));
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.f55656B = i;
        this.f55689t = z;
        this.f55692w.invalidate();
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.f55689t = z;
        this.f55655A = i;
        this.f55656B = i2;
        this.f55666P = true;
        m66028m();
        this.f55673d = false;
    }

    public void setRefreshing(boolean z) {
        int i;
        if (z && this.f55673d != z) {
            this.f55673d = z;
            if (!this.f55666P) {
                i = this.f55656B + this.f55655A;
            } else {
                i = this.f55656B;
            }
            m66024q(i - this.f55684o);
            this.f55664J = false;
            m66017x(this.f55668R);
            return;
        }
        m66025p(z, false);
    }

    public void setSize(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i == 0) {
            this.f55665K = (int) (displayMetrics.density * 56.0f);
        } else {
            this.f55665K = (int) (displayMetrics.density * 40.0f);
        }
        this.f55692w.setImageDrawable(null);
        this.f55658D.m106676l(i);
        this.f55692w.setImageDrawable(this.f55658D);
    }

    public void setSlingshotDistance(int i) {
        this.f55657C = i;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f55678i.m101201p(i);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f55678i.m101199r();
    }

    /* renamed from: t */
    public final void m66021t() {
        this.f55662H = m66023r(this.f55658D.getAlpha(), KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: u */
    public final void m66020u() {
        this.f55661G = m66023r(this.f55658D.getAlpha(), 76);
    }

    /* renamed from: v */
    public void m66019v(Animation.AnimationListener animationListener) {
        C11978c c11978c = new C11978c();
        this.f55660F = c11978c;
        c11978c.setDuration(150L);
        this.f55692w.m2786b(animationListener);
        this.f55692w.clearAnimation();
        this.f55692w.startAnimation(this.f55660F);
    }

    /* renamed from: w */
    public final void m66018w(int i, Animation.AnimationListener animationListener) {
        this.f55694y = i;
        this.f55695z = this.f55692w.getScaleX();
        C11983h c11983h = new C11983h();
        this.f55663I = c11983h;
        c11983h.setDuration(150L);
        if (animationListener != null) {
            this.f55692w.m2786b(animationListener);
        }
        this.f55692w.clearAnimation();
        this.f55692w.startAnimation(this.f55663I);
    }

    /* renamed from: x */
    public final void m66017x(Animation.AnimationListener animationListener) {
        this.f55692w.setVisibility(0);
        this.f55658D.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        C11977b c11977b = new C11977b();
        this.f55659E = c11977b;
        c11977b.setDuration(this.f55683n);
        if (animationListener != null) {
            this.f55692w.m2786b(animationListener);
        }
        this.f55692w.clearAnimation();
        this.f55692w.startAnimation(this.f55659E);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11975a();

        /* renamed from: b */
        public final boolean f55696b;

        /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState$a */
        /* loaded from: classes.dex */
        public class C11975a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.f55696b = z;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f55696b ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f55696b = parcel.readByte() != 0;
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55673d = false;
        this.f55675f = -1.0f;
        this.f55679j = new int[2];
        this.f55680k = new int[2];
        this.f55681l = new int[2];
        this.f55688s = -1;
        this.f55693x = -1;
        this.f55668R = new animationAnimation$AnimationListenerC11976a();
        this.f55669S = new C11981f();
        this.f55670T = new C11982g();
        this.f55674e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f55683n = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f55691v = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f55665K = (int) (displayMetrics.density * 40.0f);
        m66037d();
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f55656B = i;
        this.f55675f = i;
        this.f55677h = new M43(this);
        this.f55678i = new J43(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f55665K;
        this.f55684o = i2;
        this.f55655A = i2;
        m66030k(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f55654W);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f55676g;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f55676g = 0.0f;
                } else {
                    this.f55676g = f - f2;
                    iArr[1] = i2;
                }
                m66031j(this.f55676g);
            }
        }
        if (this.f55666P && i2 > 0 && this.f55676g == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f55692w.setVisibility(8);
        }
        int[] iArr2 = this.f55679j;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f55677h.m95844b(view, view2, i);
        startNestedScroll(i & 2);
        this.f55676g = 0.0f;
        this.f55682m = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f55690u || this.f55673d || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f55677h.m95842d(view);
        this.f55682m = false;
        float f = this.f55676g;
        if (f > 0.0f) {
            m66034g(f);
            this.f55676g = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // p000.K43
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, i5, this.f55681l);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.f55681l);
    }
}
