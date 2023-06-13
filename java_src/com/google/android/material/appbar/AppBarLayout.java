package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import p000.C27125p2;
import p000.InterfaceC28996u2;
/* loaded from: classes6.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC11526b {

    /* renamed from: z */
    public static final int f72109z = C50021ul4.Widget_Design_AppBarLayout;

    /* renamed from: b */
    public int f72110b;

    /* renamed from: c */
    public int f72111c;

    /* renamed from: d */
    public int f72112d;

    /* renamed from: e */
    public int f72113e;

    /* renamed from: f */
    public boolean f72114f;

    /* renamed from: g */
    public int f72115g;

    /* renamed from: h */
    public DB6 f72116h;

    /* renamed from: i */
    public List<InterfaceC17660b> f72117i;

    /* renamed from: j */
    public boolean f72118j;

    /* renamed from: k */
    public boolean f72119k;

    /* renamed from: l */
    public boolean f72120l;

    /* renamed from: m */
    public boolean f72121m;

    /* renamed from: n */
    public int f72122n;

    /* renamed from: o */
    public WeakReference<View> f72123o;

    /* renamed from: p */
    public final ColorStateList f72124p;

    /* renamed from: q */
    public ValueAnimator f72125q;

    /* renamed from: r */
    public ValueAnimator.AnimatorUpdateListener f72126r;

    /* renamed from: s */
    public final List<InterfaceC17663e> f72127s;

    /* renamed from: t */
    public final long f72128t;

    /* renamed from: u */
    public final TimeInterpolator f72129u;

    /* renamed from: v */
    public int[] f72130v;

    /* renamed from: w */
    public Drawable f72131w;

    /* renamed from: x */
    public final float f72132x;

    /* renamed from: y */
    public Behavior f72133y;

    /* loaded from: classes6.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* renamed from: h */
        public int f72134h;

        /* renamed from: i */
        public int f72135i;

        /* renamed from: j */
        public ValueAnimator f72136j;

        /* renamed from: k */
        public SavedState f72137k;

        /* renamed from: l */
        public WeakReference<View> f72138l;

        /* renamed from: m */
        public AbstractC17658e f72139m;

        /* renamed from: n */
        public boolean f72140n;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        /* loaded from: classes6.dex */
        public class C17654a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ CoordinatorLayout f72146a;

            /* renamed from: b */
            public final /* synthetic */ AppBarLayout f72147b;

            public C17654a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f72146a = coordinatorLayout;
                this.f72147b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.m50359i(this.f72146a, this.f72147b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        /* loaded from: classes6.dex */
        public class C17655b extends C5148M1 {
            public C17655b() {
            }

            @Override // p000.C5148M1
            public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
                super.onInitializeAccessibilityNodeInfo(view, c27125p2);
                c27125p2.m20124H0(BaseBehavior.this.f72140n);
                c27125p2.m20080f0(ScrollView.class.getName());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        /* loaded from: classes6.dex */
        public class C17656c implements InterfaceC28996u2 {

            /* renamed from: a */
            public final /* synthetic */ CoordinatorLayout f72150a;

            /* renamed from: b */
            public final /* synthetic */ AppBarLayout f72151b;

            /* renamed from: c */
            public final /* synthetic */ View f72152c;

            /* renamed from: d */
            public final /* synthetic */ int f72153d;

            public C17656c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.f72150a = coordinatorLayout;
                this.f72151b = appBarLayout;
                this.f72152c = view;
                this.f72153d = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.InterfaceC28996u2
            /* renamed from: a */
            public boolean mo8762a(View view, InterfaceC28996u2.AbstractC28997a abstractC28997a) {
                BaseBehavior.this.onNestedPreScroll(this.f72150a, this.f72151b, this.f72152c, 0, this.f72153d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$d */
        /* loaded from: classes6.dex */
        public class C17657d implements InterfaceC28996u2 {

            /* renamed from: a */
            public final /* synthetic */ AppBarLayout f72155a;

            /* renamed from: b */
            public final /* synthetic */ boolean f72156b;

            public C17657d(AppBarLayout appBarLayout, boolean z) {
                this.f72155a = appBarLayout;
                this.f72156b = z;
            }

            @Override // p000.InterfaceC28996u2
            /* renamed from: a */
            public boolean mo8762a(View view, InterfaceC28996u2.AbstractC28997a abstractC28997a) {
                this.f72155a.setExpanded(this.f72156b);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$e */
        /* loaded from: classes6.dex */
        public static abstract class AbstractC17658e<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean m50413a(T t);
        }

        public BaseBehavior() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: F */
        public /* synthetic */ boolean m50442F(View view, AppBarLayout appBarLayout, View view2, KeyEvent keyEvent) {
            m50419x(keyEvent, view, appBarLayout);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: G */
        public /* synthetic */ boolean m50441G(View view, AppBarLayout appBarLayout, View view2, int i, KeyEvent keyEvent) {
            m50419x(keyEvent, view, appBarLayout);
            return false;
        }

        /* renamed from: v */
        public static boolean m50421v(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: z */
        public static View m50417z(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: A */
        public final int m50447A(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m50421v(layoutParams.m50402c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: B */
        public final View m50446B(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.C11529e) childAt.getLayoutParams()).m67769f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: C */
        public int mo50364d(T t) {
            return -t.m50462l();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: D */
        public int mo50363e(T t) {
            return t.m50458p();
        }

        /* renamed from: E */
        public final int m50443E(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator m50401d = layoutParams.m50401d();
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    if (m50401d != null) {
                        int m50402c = layoutParams.m50402c();
                        if ((m50402c & 1) != 0) {
                            i2 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                            if ((m50402c & 2) != 0) {
                                i2 -= C38790bq6.m62546E(childAt);
                            }
                        }
                        if (C38790bq6.m62554A(childAt)) {
                            i2 -= t.m50459o();
                        }
                        if (i2 > 0) {
                            float f = i2;
                            return Integer.signum(i) * (childAt.getTop() + Math.round(f * m50401d.getInterpolation((abs - childAt.getTop()) / f)));
                        }
                    }
                } else {
                    i3++;
                }
            }
            return i;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: H */
        public void mo50361g(CoordinatorLayout coordinatorLayout, T t) {
            m50435U(coordinatorLayout, t);
            if (t.m50450x()) {
                t.m50479H(t.m50476K(m50418y(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: I */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, final T t, int i) {
            boolean z;
            int round;
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, t, i);
            int m50460n = t.m50460n();
            SavedState savedState = this.f72137k;
            if (savedState != null && (m50460n & 8) == 0) {
                if (savedState.f72141d) {
                    m50359i(coordinatorLayout, t, -t.m50458p());
                } else if (savedState.f72142e) {
                    m50359i(coordinatorLayout, t, 0);
                } else {
                    View childAt = t.getChildAt(savedState.f72143f);
                    int i2 = -childAt.getBottom();
                    if (this.f72137k.f72145h) {
                        round = C38790bq6.m62546E(childAt) + t.m50459o();
                    } else {
                        round = Math.round(childAt.getHeight() * this.f72137k.f72144g);
                    }
                    m50359i(coordinatorLayout, t, i2 + round);
                }
            } else if (m50460n != 0) {
                if ((m50460n & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((m50460n & 2) != 0) {
                    int i3 = -t.m50457q();
                    if (z) {
                        m50426q(coordinatorLayout, t, i3, 0.0f);
                    } else {
                        m50359i(coordinatorLayout, t, i3);
                    }
                } else if ((m50460n & 1) != 0) {
                    if (z) {
                        m50426q(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        m50359i(coordinatorLayout, t, 0);
                    }
                }
            }
            t.m50482E();
            this.f72137k = null;
            setTopAndBottomOffset(C40898fN2.m41475c(getTopAndBottomOffset(), -t.m50458p(), 0));
            m50433W(coordinatorLayout, t, getTopAndBottomOffset(), 0, true);
            t.m50486A(getTopAndBottomOffset());
            m50434V(coordinatorLayout, t);
            final View m50418y = m50418y(coordinatorLayout);
            if (m50418y != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    m50418y.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: Lh
                        @Override // android.view.View.OnUnhandledKeyEventListener
                        public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
                            boolean m50442F;
                            m50442F = AppBarLayout.BaseBehavior.this.m50442F(m50418y, t, view, keyEvent);
                            return m50442F;
                        }
                    });
                } else {
                    m50418y.setOnKeyListener(new View.OnKeyListener() { // from class: Mh
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                            boolean m50441G;
                            m50441G = AppBarLayout.BaseBehavior.this.m50441G(m50418y, t, view, i4, keyEvent);
                            return m50441G;
                        }
                    });
                }
            }
            return onLayoutChild;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: J */
        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C11529e) t.getLayoutParams())).height == -2) {
                coordinatorLayout.onMeasureChild(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return super.onMeasureChild(coordinatorLayout, t, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: K */
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -t.m50458p();
                    i5 = t.m50463k() + i4;
                } else {
                    i4 = -t.m50457q();
                    i5 = 0;
                }
                int i6 = i4;
                int i7 = i5;
                if (i6 != i7) {
                    iArr[1] = m50360h(coordinatorLayout, t, i2, i6, i7);
                }
            }
            if (t.m50450x()) {
                t.m50479H(t.m50476K(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: L */
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = m50360h(coordinatorLayout, t, i4, -t.m50462l(), 0);
            }
            if (i4 == 0) {
                m50434V(coordinatorLayout, t);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: M */
        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                m50439Q((SavedState) parcelable, true);
                super.onRestoreInstanceState(coordinatorLayout, t, this.f72137k.m67617a());
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, t, parcelable);
            this.f72137k = null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: N */
        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, t);
            SavedState m50438R = m50438R(onSaveInstanceState, t);
            if (m50438R != null) {
                return m50438R;
            }
            return onSaveInstanceState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: O */
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            boolean z;
            ValueAnimator valueAnimator;
            if ((i & 2) != 0 && (t.m50450x() || m50422u(coordinatorLayout, t, view))) {
                z = true;
            } else {
                z = false;
            }
            if (z && (valueAnimator = this.f72136j) != null) {
                valueAnimator.cancel();
            }
            this.f72138l = null;
            this.f72135i = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: P */
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f72135i == 0 || i == 1) {
                m50435U(coordinatorLayout, t);
                if (t.m50450x()) {
                    t.m50479H(t.m50476K(view));
                }
            }
            this.f72138l = new WeakReference<>(view);
        }

        /* renamed from: Q */
        public void m50439Q(SavedState savedState, boolean z) {
            if (this.f72137k == null || z) {
                this.f72137k = savedState;
            }
        }

        /* renamed from: R */
        public SavedState m50438R(Parcelable parcelable, T t) {
            boolean z;
            boolean z2;
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = t.getChildCount();
            boolean z3 = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f54338c;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    if (topAndBottomOffset == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    savedState.f72142e = z;
                    if (!z && (-topAndBottomOffset) >= t.m50458p()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    savedState.f72141d = z2;
                    savedState.f72143f = i;
                    if (bottom == C38790bq6.m62546E(childAt) + t.m50459o()) {
                        z3 = true;
                    }
                    savedState.f72145h = z3;
                    savedState.f72144g = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: S */
        public int mo50358j(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int i4;
            int mo50362f = mo50362f();
            int i5 = 0;
            if (i2 != 0 && mo50362f >= i2 && mo50362f <= i3) {
                int m41475c = C40898fN2.m41475c(i, i2, i3);
                if (mo50362f != m41475c) {
                    if (t.m50456r()) {
                        i4 = m50443E(t, m41475c);
                    } else {
                        i4 = m41475c;
                    }
                    boolean topAndBottomOffset = setTopAndBottomOffset(i4);
                    int i6 = mo50362f - m41475c;
                    this.f72134h = m41475c - i4;
                    int i7 = 1;
                    if (topAndBottomOffset) {
                        while (i5 < t.getChildCount()) {
                            LayoutParams layoutParams = (LayoutParams) t.getChildAt(i5).getLayoutParams();
                            AbstractC17661c m50403b = layoutParams.m50403b();
                            if (m50403b != null && (layoutParams.m50402c() & 1) != 0) {
                                m50403b.mo50397a(t, t.getChildAt(i5), getTopAndBottomOffset());
                            }
                            i5++;
                        }
                    }
                    if (!topAndBottomOffset && t.m50456r()) {
                        coordinatorLayout.dispatchDependentViewsChanged(t);
                    }
                    t.m50486A(getTopAndBottomOffset());
                    if (m41475c < mo50362f) {
                        i7 = -1;
                    }
                    m50433W(coordinatorLayout, t, m41475c, i7, false);
                    i5 = i6;
                }
            } else {
                this.f72134h = 0;
            }
            m50434V(coordinatorLayout, t);
            return i5;
        }

        /* renamed from: T */
        public final boolean m50436T(CoordinatorLayout coordinatorLayout, T t) {
            List<View> dependents = coordinatorLayout.getDependents(t);
            int size = dependents.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.Behavior m67769f = ((CoordinatorLayout.C11529e) dependents.get(i).getLayoutParams()).m67769f();
                if (m67769f instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) m67769f).getOverlayTop() == 0) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: U */
        public final void m50435U(CoordinatorLayout coordinatorLayout, T t) {
            int m50459o = t.m50459o() + t.getPaddingTop();
            int mo50362f = mo50362f() - m50459o;
            int m50447A = m50447A(t, mo50362f);
            if (m50447A >= 0) {
                View childAt = t.getChildAt(m50447A);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int m50402c = layoutParams.m50402c();
                if ((m50402c & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (m50447A == 0 && C38790bq6.m62554A(t) && C38790bq6.m62554A(childAt)) {
                        i -= t.m50459o();
                    }
                    if (m50421v(m50402c, 2)) {
                        i2 += C38790bq6.m62546E(childAt);
                    } else if (m50421v(m50402c, 5)) {
                        int m62546E = C38790bq6.m62546E(childAt) + i2;
                        if (mo50362f < m62546E) {
                            i = m62546E;
                        } else {
                            i2 = m62546E;
                        }
                    }
                    if (m50421v(m50402c, 32)) {
                        i += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    m50426q(coordinatorLayout, t, C40898fN2.m41475c(m50424s(mo50362f, i2, i) + m50459o, -t.m50458p(), 0), 0.0f);
                }
            }
        }

        /* renamed from: V */
        public final void m50434V(CoordinatorLayout coordinatorLayout, T t) {
            View m50446B;
            C38790bq6.m62464p0(coordinatorLayout, C27125p2.C27126a.f103005q.m20038b());
            C38790bq6.m62464p0(coordinatorLayout, C27125p2.C27126a.f103006r.m20038b());
            if (t.m50458p() == 0 || (m50446B = m50446B(coordinatorLayout)) == null || !m50420w(t)) {
                return;
            }
            if (!C38790bq6.m62516T(coordinatorLayout)) {
                C38790bq6.m62452v0(coordinatorLayout, new C17655b());
            }
            this.f72140n = m50428o(coordinatorLayout, t, m50446B);
        }

        /* renamed from: W */
        public final void m50433W(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View m50417z = m50417z(t, i);
            boolean z2 = false;
            if (m50417z != null) {
                int m50402c = ((LayoutParams) m50417z.getLayoutParams()).m50402c();
                if ((m50402c & 1) != 0) {
                    int m62546E = C38790bq6.m62546E(m50417z);
                    if (i2 <= 0 || (m50402c & 12) == 0 ? !((m50402c & 2) == 0 || (-i) < (m50417z.getBottom() - m62546E) - t.m50459o()) : (-i) >= (m50417z.getBottom() - m62546E) - t.m50459o()) {
                        z2 = true;
                    }
                }
            }
            if (t.m50450x()) {
                z2 = t.m50476K(m50418y(coordinatorLayout));
            }
            boolean m50479H = t.m50479H(z2);
            if (z || (m50479H && m50436T(coordinatorLayout, t))) {
                t.jumpDrawablesToCurrentState();
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: f */
        public int mo50362f() {
            return getTopAndBottomOffset() + this.f72134h;
        }

        /* renamed from: o */
        public final boolean m50428o(CoordinatorLayout coordinatorLayout, T t, View view) {
            boolean z = false;
            if (mo50362f() != (-t.m50458p())) {
                m50427p(coordinatorLayout, t, C27125p2.C27126a.f103005q, false);
                z = true;
            }
            if (mo50362f() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i = -t.m50463k();
                    if (i != 0) {
                        C38790bq6.m62460r0(coordinatorLayout, C27125p2.C27126a.f103006r, null, new C17656c(coordinatorLayout, t, view, i));
                        return true;
                    }
                } else {
                    m50427p(coordinatorLayout, t, C27125p2.C27126a.f103006r, true);
                    return true;
                }
            }
            return z;
        }

        /* renamed from: p */
        public final void m50427p(CoordinatorLayout coordinatorLayout, T t, C27125p2.C27126a c27126a, boolean z) {
            C38790bq6.m62460r0(coordinatorLayout, c27126a, null, new C17657d(t, z));
        }

        /* renamed from: q */
        public final void m50426q(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int height;
            int abs = Math.abs(mo50362f() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
            }
            m50425r(coordinatorLayout, t, i, height);
        }

        /* renamed from: r */
        public final void m50425r(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int mo50362f = mo50362f();
            if (mo50362f == i) {
                ValueAnimator valueAnimator = this.f72136j;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f72136j.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f72136j;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f72136j = valueAnimator3;
                valueAnimator3.setInterpolator(C27325pf.f103883e);
                this.f72136j.addUpdateListener(new C17654a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f72136j.setDuration(Math.min(i2, 600));
            this.f72136j.setIntValues(mo50362f, i);
            this.f72136j.start();
        }

        /* renamed from: s */
        public final int m50424s(int i, int i2, int i3) {
            return i < (i2 + i3) / 2 ? i2 : i3;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: t */
        public boolean mo50367a(T t) {
            AbstractC17658e abstractC17658e = this.f72139m;
            if (abstractC17658e != null) {
                return abstractC17658e.m50413a(t);
            }
            WeakReference<View> weakReference = this.f72138l;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            if (view != null && view.isShown() && !view.canScrollVertically(-1)) {
                return true;
            }
            return false;
        }

        /* renamed from: u */
        public final boolean m50422u(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (t.m50454t() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: w */
        public final boolean m50420w(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((LayoutParams) appBarLayout.getChildAt(i).getLayoutParams()).f72158a != 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: x */
        public final void m50419x(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19 && keyCode != 280 && keyCode != 92) {
                    if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                        appBarLayout.setExpanded(false);
                    }
                } else if (view.getScrollY() < view.getMeasuredHeight() * 0.1d) {
                    appBarLayout.setExpanded(true);
                }
            }
        }

        /* renamed from: y */
        public final View m50418y(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof I43) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* loaded from: classes6.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C17653a();

            /* renamed from: d */
            public boolean f72141d;

            /* renamed from: e */
            public boolean f72142e;

            /* renamed from: f */
            public int f72143f;

            /* renamed from: g */
            public float f72144g;

            /* renamed from: h */
            public boolean f72145h;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            /* loaded from: classes6.dex */
            public class C17653a implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f72141d = parcel.readByte() != 0;
                this.f72142e = parcel.readByte() != 0;
                this.f72143f = parcel.readInt();
                this.f72144g = parcel.readFloat();
                this.f72145h = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f72141d ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f72142e ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f72143f);
                parcel.writeFloat(this.f72144g);
                parcel.writeByte(this.f72145h ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo50412I(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.onLayoutChild(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: J */
        public /* bridge */ /* synthetic */ boolean mo50411J(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: K */
        public /* bridge */ /* synthetic */ void mo50410K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: L */
        public /* bridge */ /* synthetic */ void mo50409L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: M */
        public /* bridge */ /* synthetic */ void mo50408M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: N */
        public /* bridge */ /* synthetic */ Parcelable mo50407N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: O */
        public /* bridge */ /* synthetic */ boolean mo50406O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: P */
        public /* bridge */ /* synthetic */ void mo50405P(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes6.dex */
    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        private static int getAppBarLayoutOffset(AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior m67769f = ((CoordinatorLayout.C11529e) appBarLayout.getLayoutParams()).m67769f();
            if (m67769f instanceof BaseBehavior) {
                return ((BaseBehavior) m67769f).mo50362f();
            }
            return 0;
        }

        private void offsetChildAsNeeded(View view, View view2) {
            CoordinatorLayout.Behavior m67769f = ((CoordinatorLayout.C11529e) view2.getLayoutParams()).m67769f();
            if (m67769f instanceof BaseBehavior) {
                C38790bq6.m62483g0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) m67769f).f72134h) + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view2));
            }
        }

        private void updateLiftedStateIfNeeded(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.m50450x()) {
                    appBarLayout.m50479H(appBarLayout.m50476K(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public /* bridge */ /* synthetic */ View findFirstDependency(List list) {
            return findFirstDependency((List<View>) list);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public float getOverlapRatioForOffset(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int m50458p = appBarLayout.m50458p();
                int m50463k = appBarLayout.m50463k();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if ((m50463k == 0 || m50458p + appBarLayoutOffset > m50463k) && (i = m50458p - m50463k) != 0) {
                    return (appBarLayoutOffset / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public int getScrollRange(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).m50458p();
            }
            return super.getScrollRange(view);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            offsetChildAsNeeded(view, view2);
            updateLiftedStateIfNeeded(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C38790bq6.m62464p0(coordinatorLayout, C27125p2.C27126a.f103005q.m20038b());
                C38790bq6.m62464p0(coordinatorLayout, C27125p2.C27126a.f103006r.m20038b());
                C38790bq6.m62452v0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
            if (findFirstDependency != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.tempRect1;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    findFirstDependency.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C37098Xl4.ScrollingViewBehavior_Layout);
            setOverlayTop(obtainStyledAttributes.getDimensionPixelSize(C37098Xl4.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public AppBarLayout findFirstDependency(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    /* loaded from: classes6.dex */
    public class C17659a implements InterfaceC36332Ue3 {
        public C17659a() {
        }

        @Override // p000.InterfaceC36332Ue3
        /* renamed from: a */
        public DB6 mo7930a(View view, DB6 db6) {
            return AppBarLayout.this.m50485B(db6);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC17660b<T extends AppBarLayout> {
        /* renamed from: a */
        void mo16909a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC17661c {
        /* renamed from: a */
        public abstract void mo50397a(AppBarLayout appBarLayout, View view, float f);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    /* loaded from: classes6.dex */
    public static class C17662d extends AbstractC17661c {

        /* renamed from: a */
        public final Rect f72162a = new Rect();

        /* renamed from: b */
        public final Rect f72163b = new Rect();

        /* renamed from: b */
        public static void m50396b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.m50459o());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.AbstractC17661c
        /* renamed from: a */
        public void mo50397a(AppBarLayout appBarLayout, View view, float f) {
            m50396b(this.f72162a, appBarLayout, view);
            float abs = this.f72162a.top - Math.abs(f);
            if (abs <= 0.0f) {
                float m41476b = 1.0f - C40898fN2.m41476b(Math.abs(abs / this.f72162a.height()), 0.0f, 1.0f);
                float height = (-abs) - ((this.f72162a.height() * 0.3f) * (1.0f - (m41476b * m41476b)));
                view.setTranslationY(height);
                view.getDrawingRect(this.f72163b);
                this.f72163b.offset(0, (int) (-height));
                C38790bq6.m62547D0(view, this.f72163b);
                return;
            }
            C38790bq6.m62547D0(view, null);
            view.setTranslationY(0.0f);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$e */
    /* loaded from: classes6.dex */
    public interface InterfaceC17663e {
        /* renamed from: a */
        void m50395a(float f, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$f */
    /* loaded from: classes6.dex */
    public interface InterfaceC17664f extends InterfaceC17660b<AppBarLayout> {
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m50449y(PM2 pm2, ValueAnimator valueAnimator) {
        int floatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pm2.setAlpha(floatValue);
        for (InterfaceC17663e interfaceC17663e : this.f72127s) {
            if (pm2.m90379x() != null) {
                interfaceC17663e.m50395a(0.0f, pm2.m90379x().withAlpha(floatValue).getDefaultColor());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m50448z(PM2 pm2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pm2.m90417Z(floatValue);
        Drawable drawable = this.f72131w;
        if (drawable instanceof PM2) {
            ((PM2) drawable).m90417Z(floatValue);
        }
        for (InterfaceC17663e interfaceC17663e : this.f72127s) {
            interfaceC17663e.m50395a(floatValue, pm2.m90442A());
        }
    }

    /* renamed from: A */
    public void m50486A(int i) {
        this.f72110b = i;
        if (!willNotDraw()) {
            C38790bq6.m62470m0(this);
        }
        List<InterfaceC17660b> list = this.f72117i;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC17660b interfaceC17660b = this.f72117i.get(i2);
                if (interfaceC17660b != null) {
                    interfaceC17660b.mo16909a(this, i);
                }
            }
        }
    }

    /* renamed from: B */
    public DB6 m50485B(DB6 db6) {
        DB6 db62;
        if (C38790bq6.m62554A(this)) {
            db62 = db6;
        } else {
            db62 = null;
        }
        if (!C37259Yd3.m74780a(this.f72116h, db62)) {
            this.f72116h = db62;
            m50473N();
            requestLayout();
        }
        return db6;
    }

    /* renamed from: C */
    public void m50484C(InterfaceC17660b interfaceC17660b) {
        List<InterfaceC17660b> list = this.f72117i;
        if (list != null && interfaceC17660b != null) {
            list.remove(interfaceC17660b);
        }
    }

    /* renamed from: D */
    public void m50483D(InterfaceC17664f interfaceC17664f) {
        m50484C(interfaceC17664f);
    }

    /* renamed from: E */
    public void m50482E() {
        this.f72115g = 0;
    }

    /* renamed from: F */
    public final void m50481F(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = 0;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (z3) {
            i3 = 8;
        }
        this.f72115g = i4 | i3;
        requestLayout();
    }

    /* renamed from: G */
    public final boolean m50480G(boolean z) {
        if (this.f72119k != z) {
            this.f72119k = z;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public boolean m50479H(boolean z) {
        return m50478I(z, !this.f72118j);
    }

    /* renamed from: I */
    public boolean m50478I(boolean z, boolean z2) {
        float f;
        float f2;
        if (z2 && this.f72120l != z) {
            this.f72120l = z;
            refreshDrawableState();
            if (this.f72121m && (getBackground() instanceof PM2)) {
                float f3 = 0.0f;
                if (this.f72124p != null) {
                    if (z) {
                        f2 = 0.0f;
                    } else {
                        f2 = 255.0f;
                    }
                    if (z) {
                        f3 = 255.0f;
                    }
                    m50474M(f2, f3);
                    return true;
                }
                if (z) {
                    f = 0.0f;
                } else {
                    f = this.f72132x;
                }
                if (z) {
                    f3 = this.f72132x;
                }
                m50474M(f, f3);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final boolean m50477J() {
        return this.f72131w != null && m50459o() > 0;
    }

    /* renamed from: K */
    public boolean m50476K(View view) {
        View m50467g = m50467g(view);
        if (m50467g != null) {
            view = m50467g;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public final boolean m50475L() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || C38790bq6.m62554A(childAt)) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public final void m50474M(float f, float f2) {
        ValueAnimator valueAnimator = this.f72125q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        this.f72125q = ofFloat;
        ofFloat.setDuration(this.f72128t);
        this.f72125q.setInterpolator(this.f72129u);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f72126r;
        if (animatorUpdateListener != null) {
            this.f72125q.addUpdateListener(animatorUpdateListener);
        }
        this.f72125q.start();
    }

    /* renamed from: N */
    public final void m50473N() {
        setWillNotDraw(!m50477J());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC11526b
    /* renamed from: a */
    public CoordinatorLayout.Behavior<AppBarLayout> mo49180a() {
        Behavior behavior = new Behavior();
        this.f72133y = behavior;
        return behavior;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public void m50470d(InterfaceC17660b interfaceC17660b) {
        if (this.f72117i == null) {
            this.f72117i = new ArrayList();
        }
        if (interfaceC17660b != null && !this.f72117i.contains(interfaceC17660b)) {
            this.f72117i.add(interfaceC17660b);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m50477J()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f72110b);
            this.f72131w.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f72131w;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* renamed from: e */
    public void m50469e(InterfaceC17664f interfaceC17664f) {
        m50470d(interfaceC17664f);
    }

    /* renamed from: f */
    public final void m50468f() {
        WeakReference<View> weakReference = this.f72123o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f72123o = null;
    }

    /* renamed from: g */
    public final View m50467g(View view) {
        int i;
        View view2;
        if (this.f72123o == null && (i = this.f72122n) != -1) {
            if (view != null) {
                view2 = view.findViewById(i);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f72122n);
            }
            if (view2 != null) {
                this.f72123o = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.f72123o;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: h */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: i */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: j */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: k */
    public int m50463k() {
        int i;
        int m62546E;
        int i2 = this.f72112d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.f72158a;
                if ((i4 & 5) == 5) {
                    int i5 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i4 & 8) != 0) {
                        m62546E = C38790bq6.m62546E(childAt);
                    } else if ((i4 & 2) != 0) {
                        m62546E = measuredHeight - C38790bq6.m62546E(childAt);
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && C38790bq6.m62554A(childAt)) {
                            i = Math.min(i, measuredHeight - m50459o());
                        }
                        i3 += i;
                    }
                    i = i5 + m62546E;
                    if (childCount == 0) {
                        i = Math.min(i, measuredHeight - m50459o());
                    }
                    i3 += i;
                } else if (i3 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i3);
        this.f72112d = max;
        return max;
    }

    /* renamed from: l */
    public int m50462l() {
        int i = this.f72113e;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                int i4 = layoutParams.f72158a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= C38790bq6.m62546E(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f72113e = max;
        return max;
    }

    /* renamed from: m */
    public final int m50461m() {
        int m50459o = m50459o();
        int m62546E = C38790bq6.m62546E(this);
        if (m62546E == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                m62546E = C38790bq6.m62546E(getChildAt(childCount - 1));
            } else {
                m62546E = 0;
            }
            if (m62546E == 0) {
                return getHeight() / 3;
            }
        }
        return (m62546E * 2) + m50459o;
    }

    /* renamed from: n */
    public int m50460n() {
        return this.f72115g;
    }

    /* renamed from: o */
    public final int m50459o() {
        DB6 db6 = this.f72116h;
        if (db6 != null) {
            return db6.m110777m();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        QM2.m88639e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        if (this.f72130v == null) {
            this.f72130v = new int[4];
        }
        int[] iArr = this.f72130v;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f72119k;
        int i4 = C49961uf4.state_liftable;
        if (!z) {
            i4 = -i4;
        }
        iArr[0] = i4;
        if (z && this.f72120l) {
            i2 = C49961uf4.state_lifted;
        } else {
            i2 = -C49961uf4.state_lifted;
        }
        iArr[1] = i2;
        int i5 = C49961uf4.state_collapsible;
        if (!z) {
            i5 = -i5;
        }
        iArr[2] = i5;
        if (z && this.f72120l) {
            i3 = C49961uf4.state_collapsed;
        } else {
            i3 = -C49961uf4.state_collapsed;
        }
        iArr[3] = i3;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m50468f();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C38790bq6.m62554A(this) && m50475L()) {
            int m50459o = m50459o();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C38790bq6.m62483g0(getChildAt(childCount), m50459o);
            }
        }
        m50451w();
        this.f72114f = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((LayoutParams) getChildAt(i5).getLayoutParams()).m50401d() != null) {
                this.f72114f = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f72131w;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), m50459o());
        }
        if (!this.f72118j) {
            if (!this.f72121m && !m50455s()) {
                z2 = false;
            }
            m50480G(z2);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C38790bq6.m62554A(this) && m50475L()) {
            int measuredHeight = getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    measuredHeight += m50459o();
                }
            } else {
                measuredHeight = C40898fN2.m41475c(getMeasuredHeight() + m50459o(), 0, View.MeasureSpec.getSize(i2));
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m50451w();
    }

    /* renamed from: p */
    public final int m50458p() {
        int i = this.f72111c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.f72158a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if (i2 == 0 && C38790bq6.m62554A(childAt)) {
                    i3 -= m50459o();
                }
                if ((i4 & 2) != 0) {
                    i3 -= C38790bq6.m62546E(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f72111c = max;
        return max;
    }

    /* renamed from: q */
    public int m50457q() {
        return m50458p();
    }

    /* renamed from: r */
    public boolean m50456r() {
        return this.f72114f;
    }

    /* renamed from: s */
    public final boolean m50455s() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).m50400e()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        QM2.m88640d(this, f);
    }

    public void setExpanded(boolean z) {
        setExpanded(z, C38790bq6.m62504Z(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f72121m = z;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f72122n = -1;
        if (view == null) {
            m50468f();
        } else {
            this.f72123o = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f72122n = i;
        m50468f();
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f72118j = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f72131w;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f72131w = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f72131w.setState(getDrawableState());
                }
                P61.m90839m(this.f72131w, C38790bq6.m62548D(this));
                Drawable drawable4 = this.f72131w;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f72131w.setCallback(this);
            }
            m50473N();
            C38790bq6.m62470m0(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C29611vi.m8248b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        C44777lu6.m26691b(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f72131w;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public boolean m50454t() {
        return m50458p() != 0;
    }

    /* renamed from: u */
    public final void m50453u(final PM2 pm2) {
        int i;
        if (this.f72120l) {
            i = KotlinVersion.MAX_COMPONENT_VALUE;
        } else {
            i = 0;
        }
        pm2.setAlpha(i);
        pm2.m90416a0(this.f72124p);
        this.f72126r = new ValueAnimator.AnimatorUpdateListener() { // from class: Jh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.this.m50449y(pm2, valueAnimator);
            }
        };
    }

    /* renamed from: v */
    public final void m50452v(Context context, final PM2 pm2) {
        pm2.m90427P(context);
        this.f72126r = new ValueAnimator.AnimatorUpdateListener() { // from class: Kh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.this.m50448z(pm2, valueAnimator);
            }
        };
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f72131w;
    }

    /* renamed from: w */
    public final void m50451w() {
        BaseBehavior.SavedState savedState;
        Behavior behavior = this.f72133y;
        if (behavior != null && this.f72111c != -1 && this.f72115g == 0) {
            savedState = behavior.m50438R(AbsSavedState.f54338c, this);
        } else {
            savedState = null;
        }
        this.f72111c = -1;
        this.f72112d = -1;
        this.f72113e = -1;
        if (savedState != null) {
            this.f72133y.m50439Q(savedState, false);
        }
    }

    /* renamed from: x */
    public boolean m50450x() {
        return this.f72121m;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.appBarLayoutStyle);
    }

    public void setExpanded(boolean z, boolean z2) {
        m50481F(z, z2, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = f72109z;
        this.f72111c = -1;
        this.f72112d = -1;
        this.f72113e = -1;
        this.f72115g = 0;
        this.f72127s = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i3 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            C44777lu6.m26692a(this);
        }
        C44777lu6.m26690c(this, attributeSet, i, i2);
        TypedArray m21866i = C46052o36.m21866i(context2, attributeSet, C37098Xl4.AppBarLayout, i, i2, new int[0]);
        C38790bq6.m62553A0(this, m21866i.getDrawable(C37098Xl4.AppBarLayout_android_background));
        ColorStateList m94029b = NM2.m94029b(context2, m21866i, C37098Xl4.AppBarLayout_liftOnScrollColor);
        this.f72124p = m94029b;
        if (getBackground() instanceof ColorDrawable) {
            PM2 pm2 = new PM2();
            pm2.m90416a0(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            if (m94029b != null) {
                m50453u(pm2);
            } else {
                m50452v(context2, pm2);
            }
            C38790bq6.m62553A0(this, pm2);
        }
        this.f72128t = C37997aW2.m71261f(context2, C49961uf4.motionDurationMedium2, getResources().getInteger(C35667Ri4.app_bar_elevation_anim_duration));
        this.f72129u = C37997aW2.m71260g(context2, C49961uf4.motionEasingStandardInterpolator, C27325pf.f103879a);
        int i4 = C37098Xl4.AppBarLayout_expanded;
        if (m21866i.hasValue(i4)) {
            m50481F(m21866i.getBoolean(i4, false), false, false);
        }
        int i5 = C37098Xl4.AppBarLayout_elevation;
        if (m21866i.hasValue(i5)) {
            C44777lu6.m26691b(this, m21866i.getDimensionPixelSize(i5, 0));
        }
        if (i3 >= 26) {
            int i6 = C37098Xl4.AppBarLayout_android_keyboardNavigationCluster;
            if (m21866i.hasValue(i6)) {
                setKeyboardNavigationCluster(m21866i.getBoolean(i6, false));
            }
            int i7 = C37098Xl4.AppBarLayout_android_touchscreenBlocksFocus;
            if (m21866i.hasValue(i7)) {
                setTouchscreenBlocksFocus(m21866i.getBoolean(i7, false));
            }
        }
        this.f72132x = getResources().getDimension(C35172Pf4.design_appbar_elevation);
        this.f72121m = m21866i.getBoolean(C37098Xl4.AppBarLayout_liftOnScroll, false);
        this.f72122n = m21866i.getResourceId(C37098Xl4.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(m21866i.getDrawable(C37098Xl4.AppBarLayout_statusBarForeground));
        m21866i.recycle();
        C38790bq6.m62531L0(this, new C17659a());
    }

    /* loaded from: classes6.dex */
    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f72158a;

        /* renamed from: b */
        public AbstractC17661c f72159b;

        /* renamed from: c */
        public Interpolator f72160c;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f72158a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C37098Xl4.AppBarLayout_Layout);
            this.f72158a = obtainStyledAttributes.getInt(C37098Xl4.AppBarLayout_Layout_layout_scrollFlags, 0);
            m50399f(obtainStyledAttributes.getInt(C37098Xl4.AppBarLayout_Layout_layout_scrollEffect, 0));
            int i = C37098Xl4.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f72160c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final AbstractC17661c m50404a(int i) {
            if (i != 1) {
                return null;
            }
            return new C17662d();
        }

        /* renamed from: b */
        public AbstractC17661c m50403b() {
            return this.f72159b;
        }

        /* renamed from: c */
        public int m50402c() {
            return this.f72158a;
        }

        /* renamed from: d */
        public Interpolator m50401d() {
            return this.f72160c;
        }

        /* renamed from: e */
        public boolean m50400e() {
            int i = this.f72158a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        /* renamed from: f */
        public void m50399f(int i) {
            this.f72159b = m50404a(i);
        }

        /* renamed from: g */
        public void m50398g(int i) {
            this.f72158a = i;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f72158a = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f72158a = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f72158a = 1;
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f72158a = 1;
        }
    }
}
