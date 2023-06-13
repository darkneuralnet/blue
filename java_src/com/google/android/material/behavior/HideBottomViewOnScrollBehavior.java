package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes6.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: j */
    public static final int f72260j = C49961uf4.motionDurationLong2;

    /* renamed from: k */
    public static final int f72261k = C49961uf4.motionDurationMedium4;

    /* renamed from: l */
    public static final int f72262l = C49961uf4.motionEasingEmphasizedInterpolator;

    /* renamed from: a */
    public final LinkedHashSet<InterfaceC17675b> f72263a;

    /* renamed from: b */
    public int f72264b;

    /* renamed from: c */
    public int f72265c;

    /* renamed from: d */
    public TimeInterpolator f72266d;

    /* renamed from: e */
    public TimeInterpolator f72267e;

    /* renamed from: f */
    public int f72268f;

    /* renamed from: g */
    public int f72269g;

    /* renamed from: h */
    public int f72270h;

    /* renamed from: i */
    public ViewPropertyAnimator f72271i;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    /* loaded from: classes6.dex */
    public class C17674a extends AnimatorListenerAdapter {
        public C17674a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f72271i = null;
        }
    }

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC17675b {
        /* renamed from: a */
        void m50246a(View view, int i);
    }

    public HideBottomViewOnScrollBehavior() {
        this.f72263a = new LinkedHashSet<>();
        this.f72268f = 0;
        this.f72269g = 2;
        this.f72270h = 0;
    }

    /* renamed from: b */
    public final void m50255b(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f72271i = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C17674a());
    }

    /* renamed from: c */
    public boolean m50254c() {
        return this.f72269g == 1;
    }

    /* renamed from: d */
    public boolean m50253d() {
        return this.f72269g == 2;
    }

    /* renamed from: e */
    public void m50252e(V v, int i) {
        this.f72270h = i;
        if (this.f72269g == 1) {
            v.setTranslationY(this.f72268f + i);
        }
    }

    /* renamed from: f */
    public void m50251f(V v) {
        m50250g(v, true);
    }

    /* renamed from: g */
    public void m50250g(V v, boolean z) {
        if (m50254c()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f72271i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        m50247j(v, 1);
        int i = this.f72268f + this.f72270h;
        if (z) {
            m50255b(v, i, this.f72265c, this.f72267e);
        } else {
            v.setTranslationY(i);
        }
    }

    /* renamed from: h */
    public void m50249h(V v) {
        m50248i(v, true);
    }

    /* renamed from: i */
    public void m50248i(V v, boolean z) {
        if (m50253d()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f72271i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        m50247j(v, 2);
        if (z) {
            m50255b(v, 0, this.f72264b, this.f72266d);
        } else {
            v.setTranslationY(0);
        }
    }

    /* renamed from: j */
    public final void m50247j(V v, int i) {
        this.f72269g = i;
        Iterator<InterfaceC17675b> it = this.f72263a.iterator();
        while (it.hasNext()) {
            it.next().m50246a(v, this.f72269g);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f72268f = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        this.f72264b = C37997aW2.m71261f(v.getContext(), f72260j, 225);
        this.f72265c = C37997aW2.m71261f(v.getContext(), f72261k, 175);
        Context context = v.getContext();
        int i2 = f72262l;
        this.f72266d = C37997aW2.m71260g(context, i2, C27325pf.f103882d);
        this.f72267e = C37997aW2.m71260g(v.getContext(), i2, C27325pf.f103881c);
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            m50251f(v);
        } else if (i2 < 0) {
            m50249h(v);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f72263a = new LinkedHashSet<>();
        this.f72268f = 0;
        this.f72269g = 2;
        this.f72270h = 0;
    }
}
