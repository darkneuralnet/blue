package me.relex.circleindicator;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
/* loaded from: classes8.dex */
class BaseCircleIndicator extends LinearLayout {

    /* renamed from: b */
    public int f98465b;

    /* renamed from: c */
    public int f98466c;

    /* renamed from: d */
    public int f98467d;

    /* renamed from: e */
    public int f98468e;

    /* renamed from: f */
    public int f98469f;

    /* renamed from: g */
    public ColorStateList f98470g;

    /* renamed from: h */
    public ColorStateList f98471h;

    /* renamed from: i */
    public Animator f98472i;

    /* renamed from: j */
    public Animator f98473j;

    /* renamed from: k */
    public Animator f98474k;

    /* renamed from: l */
    public Animator f98475l;

    /* renamed from: m */
    public int f98476m;

    /* renamed from: me.relex.circleindicator.BaseCircleIndicator$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC26152a {
    }

    /* renamed from: me.relex.circleindicator.BaseCircleIndicator$b  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static class animationInterpolatorC26153b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return Math.abs(1.0f - f);
        }
    }

    public BaseCircleIndicator(Context context) {
        super(context);
        this.f98465b = -1;
        this.f98466c = -1;
        this.f98467d = -1;
        this.f98476m = -1;
        m25283h(context, null);
    }

    /* renamed from: a */
    public void m25288a(int i) {
        View view = new View(getContext());
        LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = this.f98466c;
        generateDefaultLayoutParams.height = this.f98467d;
        if (i == 0) {
            int i2 = this.f98465b;
            generateDefaultLayoutParams.leftMargin = i2;
            generateDefaultLayoutParams.rightMargin = i2;
        } else {
            int i3 = this.f98465b;
            generateDefaultLayoutParams.topMargin = i3;
            generateDefaultLayoutParams.bottomMargin = i3;
        }
        addView(view, generateDefaultLayoutParams);
    }

    /* renamed from: b */
    public void mo25275b(int i) {
        View childAt;
        if (this.f98476m == i) {
            return;
        }
        if (this.f98473j.isRunning()) {
            this.f98473j.end();
            this.f98473j.cancel();
        }
        if (this.f98472i.isRunning()) {
            this.f98472i.end();
            this.f98472i.cancel();
        }
        int i2 = this.f98476m;
        if (i2 >= 0 && (childAt = getChildAt(i2)) != null) {
            m25287c(childAt, this.f98469f, this.f98471h);
            this.f98473j.setTarget(childAt);
            this.f98473j.start();
        }
        View childAt2 = getChildAt(i);
        if (childAt2 != null) {
            m25287c(childAt2, this.f98468e, this.f98470g);
            this.f98472i.setTarget(childAt2);
            this.f98472i.start();
        }
        this.f98476m = i;
    }

    /* renamed from: c */
    public final void m25287c(View view, int i, ColorStateList colorStateList) {
        if (colorStateList != null) {
            Drawable m90834r = P61.m90834r(NA0.m94299e(getContext(), i).mutate());
            P61.m90837o(m90834r, colorStateList);
            C38790bq6.m62553A0(view, m90834r);
            return;
        }
        view.setBackgroundResource(i);
    }

    /* renamed from: d */
    public Animator m25286d(C33431Hu0 c33431Hu0) {
        if (c33431Hu0.f14157e == 0) {
            Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), c33431Hu0.f14156d);
            loadAnimator.setInterpolator(new animationInterpolatorC26153b());
            return loadAnimator;
        }
        return AnimatorInflater.loadAnimator(getContext(), c33431Hu0.f14157e);
    }

    /* renamed from: e */
    public Animator m25285e(C33431Hu0 c33431Hu0) {
        return AnimatorInflater.loadAnimator(getContext(), c33431Hu0.f14156d);
    }

    /* renamed from: f */
    public void mo25274f(int i, int i2) {
        if (this.f98474k.isRunning()) {
            this.f98474k.end();
            this.f98474k.cancel();
        }
        if (this.f98475l.isRunning()) {
            this.f98475l.end();
            this.f98475l.cancel();
        }
        int childCount = getChildCount();
        if (i < childCount) {
            removeViews(i, childCount - i);
        } else if (i > childCount) {
            int i3 = i - childCount;
            int orientation = getOrientation();
            for (int i4 = 0; i4 < i3; i4++) {
                m25288a(orientation);
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            View childAt = getChildAt(i5);
            if (i2 == i5) {
                m25287c(childAt, this.f98468e, this.f98470g);
                this.f98474k.setTarget(childAt);
                this.f98474k.start();
                this.f98474k.end();
            } else {
                m25287c(childAt, this.f98469f, this.f98471h);
                this.f98475l.setTarget(childAt);
                this.f98475l.start();
                this.f98475l.end();
            }
        }
        this.f98476m = i2;
    }

    /* renamed from: g */
    public final C33431Hu0 m25284g(Context context, AttributeSet attributeSet) {
        C33431Hu0 c33431Hu0 = new C33431Hu0();
        if (attributeSet == null) {
            return c33431Hu0;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C38155am4.BaseCircleIndicator);
        c33431Hu0.f14153a = obtainStyledAttributes.getDimensionPixelSize(C38155am4.BaseCircleIndicator_ci_width, -1);
        c33431Hu0.f14154b = obtainStyledAttributes.getDimensionPixelSize(C38155am4.BaseCircleIndicator_ci_height, -1);
        c33431Hu0.f14155c = obtainStyledAttributes.getDimensionPixelSize(C38155am4.BaseCircleIndicator_ci_margin, -1);
        c33431Hu0.f14156d = obtainStyledAttributes.getResourceId(C38155am4.BaseCircleIndicator_ci_animator, C41660gf4.scale_with_alpha);
        c33431Hu0.f14157e = obtainStyledAttributes.getResourceId(C38155am4.BaseCircleIndicator_ci_animator_reverse, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C38155am4.BaseCircleIndicator_ci_drawable, C32841Fg4.white_radius);
        c33431Hu0.f14158f = resourceId;
        c33431Hu0.f14159g = obtainStyledAttributes.getResourceId(C38155am4.BaseCircleIndicator_ci_drawable_unselected, resourceId);
        c33431Hu0.f14160h = obtainStyledAttributes.getInt(C38155am4.BaseCircleIndicator_ci_orientation, -1);
        c33431Hu0.f14161i = obtainStyledAttributes.getInt(C38155am4.BaseCircleIndicator_ci_gravity, -1);
        obtainStyledAttributes.recycle();
        return c33431Hu0;
    }

    /* renamed from: h */
    public final void m25283h(Context context, AttributeSet attributeSet) {
        mo25273i(m25284g(context, attributeSet));
        if (isInEditMode()) {
            mo25274f(3, 1);
        }
    }

    /* renamed from: i */
    public void mo25273i(C33431Hu0 c33431Hu0) {
        int i;
        int i2 = 1;
        int applyDimension = (int) (TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics()) + 0.5f);
        int i3 = c33431Hu0.f14153a;
        if (i3 < 0) {
            i3 = applyDimension;
        }
        this.f98466c = i3;
        int i4 = c33431Hu0.f14154b;
        if (i4 < 0) {
            i4 = applyDimension;
        }
        this.f98467d = i4;
        int i5 = c33431Hu0.f14155c;
        if (i5 >= 0) {
            applyDimension = i5;
        }
        this.f98465b = applyDimension;
        this.f98472i = m25285e(c33431Hu0);
        Animator m25285e = m25285e(c33431Hu0);
        this.f98474k = m25285e;
        m25285e.setDuration(0L);
        this.f98473j = m25286d(c33431Hu0);
        Animator m25286d = m25286d(c33431Hu0);
        this.f98475l = m25286d;
        m25286d.setDuration(0L);
        int i6 = c33431Hu0.f14158f;
        if (i6 == 0) {
            i = C32841Fg4.white_radius;
        } else {
            i = i6;
        }
        this.f98468e = i;
        int i7 = c33431Hu0.f14159g;
        if (i7 != 0) {
            i6 = i7;
        }
        this.f98469f = i6;
        if (c33431Hu0.f14160h != 1) {
            i2 = 0;
        }
        setOrientation(i2);
        int i8 = c33431Hu0.f14161i;
        if (i8 < 0) {
            i8 = 17;
        }
        setGravity(i8);
    }

    public void setIndicatorCreatedListener(InterfaceC26152a interfaceC26152a) {
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f98465b = -1;
        this.f98466c = -1;
        this.f98467d = -1;
        this.f98476m = -1;
        m25283h(context, attributeSet);
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f98465b = -1;
        this.f98466c = -1;
        this.f98467d = -1;
        this.f98476m = -1;
        m25283h(context, attributeSet);
    }
}
