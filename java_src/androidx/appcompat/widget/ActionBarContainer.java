package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.p034ar.core.ImageMetadata;
import net.danlew.android.joda.DateUtils;
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b */
    public boolean f51971b;

    /* renamed from: c */
    public View f51972c;

    /* renamed from: d */
    public View f51973d;

    /* renamed from: e */
    public View f51974e;

    /* renamed from: f */
    public Drawable f51975f;

    /* renamed from: g */
    public Drawable f51976g;

    /* renamed from: h */
    public Drawable f51977h;

    /* renamed from: i */
    public boolean f51978i;

    /* renamed from: j */
    public boolean f51979j;

    /* renamed from: k */
    public int f51980k;

    /* renamed from: androidx.appcompat.widget.ActionBarContainer$a */
    /* loaded from: classes.dex */
    public static class C11045a {
        private C11045a() {
        }

        /* renamed from: a */
        public static void m70065a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final int m70068a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public View m70067b() {
        return this.f51972c;
    }

    /* renamed from: c */
    public final boolean m70066c(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f51975f;
        if (drawable != null && drawable.isStateful()) {
            this.f51975f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f51976g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f51976g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f51977h;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f51977h.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f51975f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f51976g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f51977h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f51973d = findViewById(C39902dh4.action_bar);
        this.f51974e = findViewById(C39902dh4.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f51971b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f51972c;
        boolean z3 = true;
        boolean z4 = false;
        if (view != null && view.getVisibility() != 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f51978i) {
            Drawable drawable2 = this.f51977h;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z3 = z4;
        } else {
            if (this.f51975f != null) {
                if (this.f51973d.getVisibility() == 0) {
                    this.f51975f.setBounds(this.f51973d.getLeft(), this.f51973d.getTop(), this.f51973d.getRight(), this.f51973d.getBottom());
                } else {
                    View view2 = this.f51974e;
                    if (view2 != null && view2.getVisibility() == 0) {
                        this.f51975f.setBounds(this.f51974e.getLeft(), this.f51974e.getTop(), this.f51974e.getRight(), this.f51974e.getBottom());
                    } else {
                        this.f51975f.setBounds(0, 0, 0, 0);
                    }
                }
                z4 = true;
            }
            this.f51979j = z2;
            if (z2 && (drawable = this.f51976g) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z3 = z4;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f51973d == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i5 = this.f51980k) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f51973d == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.f51972c;
        if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
            if (!m70066c(this.f51973d)) {
                i3 = m70068a(this.f51973d);
            } else if (!m70066c(this.f51974e)) {
                i3 = m70068a(this.f51974e);
            } else {
                i3 = 0;
            }
            if (mode == Integer.MIN_VALUE) {
                i4 = View.MeasureSpec.getSize(i2);
            } else {
                i4 = Integer.MAX_VALUE;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m70068a(this.f51972c), i4));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f51975f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f51975f);
        }
        this.f51975f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f51973d;
            if (view != null) {
                this.f51975f.setBounds(view.getLeft(), this.f51973d.getTop(), this.f51973d.getRight(), this.f51973d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f51978i ? this.f51975f != null || this.f51976g != null : this.f51977h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        C11045a.m70065a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f51977h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f51977h);
        }
        this.f51977h = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f51978i && (drawable2 = this.f51977h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f51978i ? !(this.f51975f != null || this.f51976g != null) : this.f51977h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        C11045a.m70065a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f51976g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f51976g);
        }
        this.f51976g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f51979j && (drawable2 = this.f51976g) != null) {
                drawable2.setBounds(this.f51972c.getLeft(), this.f51972c.getTop(), this.f51972c.getRight(), this.f51972c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f51978i ? this.f51975f != null || this.f51976g != null : this.f51977h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        C11045a.m70065a(this);
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f51972c;
        if (view != null) {
            removeView(view);
        }
        this.f51972c = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        int i;
        this.f51971b = z;
        if (z) {
            i = ImageMetadata.HOT_PIXEL_MODE;
        } else {
            i = DateUtils.FORMAT_ABBREV_RELATIVE;
        }
        setDescendantFocusability(i);
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
        Drawable drawable = this.f51975f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f51976g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f51977h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if ((drawable == this.f51975f && !this.f51978i) || ((drawable == this.f51976g && this.f51979j) || ((drawable == this.f51977h && this.f51978i) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C38790bq6.m62553A0(this, new C0379B2(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C43509jm4.ActionBar);
        this.f51975f = obtainStyledAttributes.getDrawable(C43509jm4.ActionBar_background);
        this.f51976g = obtainStyledAttributes.getDrawable(C43509jm4.ActionBar_backgroundStacked);
        this.f51980k = obtainStyledAttributes.getDimensionPixelSize(C43509jm4.ActionBar_height, -1);
        boolean z = true;
        if (getId() == C39902dh4.split_action_bar) {
            this.f51978i = true;
            this.f51977h = obtainStyledAttributes.getDrawable(C43509jm4.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f51978i ? this.f51975f != null || this.f51976g != null : this.f51977h != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
