package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C17813a;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;
/* loaded from: classes6.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements InterfaceC44059ki1, InterfaceC32302Cy5, CoordinatorLayout.InterfaceC11526b {

    /* renamed from: s */
    public static final int f72861s = C50021ul4.Widget_Design_FloatingActionButton;

    /* renamed from: c */
    public ColorStateList f72862c;

    /* renamed from: d */
    public PorterDuff.Mode f72863d;

    /* renamed from: e */
    public ColorStateList f72864e;

    /* renamed from: f */
    public PorterDuff.Mode f72865f;

    /* renamed from: g */
    public ColorStateList f72866g;

    /* renamed from: h */
    public int f72867h;

    /* renamed from: i */
    public int f72868i;

    /* renamed from: j */
    public int f72869j;

    /* renamed from: k */
    public int f72870k;

    /* renamed from: l */
    public int f72871l;

    /* renamed from: m */
    public boolean f72872m;

    /* renamed from: n */
    public final Rect f72873n;

    /* renamed from: o */
    public final Rect f72874o;

    /* renamed from: p */
    public final C28369si f72875p;

    /* renamed from: q */
    public final C44652li1 f72876q;

    /* renamed from: r */
    public C17813a f72877r;

    /* loaded from: classes6.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo49503a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: d */
        public /* bridge */ /* synthetic */ boolean mo49502d(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.onDependentViewChanged(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo49501e(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.onLayoutChild(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(CoordinatorLayout.C11529e c11529e) {
            super.onAttachedToLayoutParams(c11529e);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    /* loaded from: classes6.dex */
    public class C17809a implements C17813a.InterfaceC17824k {

        /* renamed from: a */
        public final /* synthetic */ AbstractC17810b f72881a;

        public C17809a(AbstractC17810b abstractC17810b) {
            this.f72881a = abstractC17810b;
        }

        @Override // com.google.android.material.floatingactionbutton.C17813a.InterfaceC17824k
        /* renamed from: a */
        public void mo49447a() {
            this.f72881a.mo49499b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C17813a.InterfaceC17824k
        /* renamed from: b */
        public void mo49446b() {
            this.f72881a.mo49500a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC17810b {
        /* renamed from: a */
        public void mo49500a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo49499b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    /* loaded from: classes6.dex */
    public class C17811c implements InterfaceC36505Ux5 {
        public C17811c() {
        }

        @Override // p000.InterfaceC36505Ux5
        /* renamed from: a */
        public void mo49498a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f72873n.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f72870k, i2 + FloatingActionButton.this.f72870k, i3 + FloatingActionButton.this.f72870k, i4 + FloatingActionButton.this.f72870k);
        }

        @Override // p000.InterfaceC36505Ux5
        /* renamed from: b */
        public void mo49497b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // p000.InterfaceC36505Ux5
        /* renamed from: c */
        public boolean mo49496c() {
            return FloatingActionButton.this.f72872m;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    /* loaded from: classes6.dex */
    public class C17812d<T extends FloatingActionButton> implements C17813a.InterfaceC17823j {

        /* renamed from: a */
        public final InterfaceC48483s96<T> f72884a;

        public C17812d(InterfaceC48483s96<T> interfaceC48483s96) {
            this.f72884a = interfaceC48483s96;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.C17813a.InterfaceC17823j
        /* renamed from: a */
        public void mo49449a() {
            this.f72884a.mo14636a(FloatingActionButton.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.C17813a.InterfaceC17823j
        /* renamed from: b */
        public void mo49448b() {
            this.f72884a.mo14635b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof C17812d) && ((C17812d) obj).f72884a.equals(this.f72884a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f72884a.hashCode();
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    public void m49534A() {
        m49533B(null);
    }

    /* renamed from: B */
    public void m49533B(AbstractC17810b abstractC17810b) {
        m49532C(abstractC17810b, true);
    }

    /* renamed from: C */
    public void m49532C(AbstractC17810b abstractC17810b, boolean z) {
        m49521n().m49476Y(m49531D(abstractC17810b), z);
    }

    /* renamed from: D */
    public final C17813a.InterfaceC17824k m49531D(AbstractC17810b abstractC17810b) {
        if (abstractC17810b == null) {
            return null;
        }
        return new C17809a(abstractC17810b);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC11526b
    /* renamed from: a */
    public CoordinatorLayout.Behavior<FloatingActionButton> mo49180a() {
        return new Behavior();
    }

    @Override // p000.InterfaceC44059ki1
    /* renamed from: b */
    public boolean mo28583b() {
        return this.f72876q.m26938c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m49521n().mo7802A(getDrawableState());
    }

    /* renamed from: g */
    public void m49528g(Animator.AnimatorListener animatorListener) {
        m49521n().m49467e(animatorListener);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f72862c;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f72863d;
    }

    /* renamed from: h */
    public void m49527h(Animator.AnimatorListener animatorListener) {
        m49521n().m49466f(animatorListener);
    }

    /* renamed from: i */
    public void m49526i(InterfaceC48483s96<? extends FloatingActionButton> interfaceC48483s96) {
        m49521n().m49465g(new C17812d(interfaceC48483s96));
    }

    /* renamed from: j */
    public final C17813a m49525j() {
        return new C50700vu1(this, new C17811c());
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        m49521n().mo7789w();
    }

    @Deprecated
    /* renamed from: k */
    public boolean m49524k(Rect rect) {
        if (!C38790bq6.m62504Z(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m49510y(rect);
        return true;
    }

    /* renamed from: l */
    public int m49523l() {
        return this.f72876q.m26939b();
    }

    /* renamed from: m */
    public YV2 m49522m() {
        return m49521n().m49459n();
    }

    /* renamed from: n */
    public final C17813a m49521n() {
        if (this.f72877r == null) {
            this.f72877r = m49525j();
        }
        return this.f72877r;
    }

    /* renamed from: o */
    public void m49520o(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m49510y(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m49521n().m49452x();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m49521n().m49451z();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int m49517r = m49517r();
        this.f72870k = (m49517r - this.f72871l) / 2;
        m49521n().m49472b0();
        int min = Math.min(View.resolveSize(m49517r, i), View.resolveSize(m49517r, i2));
        Rect rect = this.f72873n;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.m67617a());
        this.f72876q.m26937d((Bundle) HZ3.m103731g(extendableSavedState.f73428d.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        extendableSavedState.f73428d.put("expandableWidgetHelper", this.f72876q.m26936e());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m49524k(this.f72874o) && !this.f72874o.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public C43037iy5 m49519p() {
        return (C43037iy5) HZ3.m103731g(m49521n().m49457q());
    }

    /* renamed from: q */
    public YV2 m49518q() {
        return m49521n().m49456r();
    }

    /* renamed from: r */
    public int m49517r() {
        return m49516s(this.f72868i);
    }

    /* renamed from: s */
    public final int m49516s(int i) {
        int i2 = this.f72869j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(C35172Pf4.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(C35172Pf4.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return m49516s(1);
        } else {
            return m49516s(0);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f72862c != colorStateList) {
            this.f72862c = colorStateList;
            m49521n().m49491H(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f72863d != mode) {
            this.f72863d = mode;
            m49521n().m49490I(mode);
        }
    }

    public void setCompatElevation(float f) {
        m49521n().m49489J(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        m49521n().m49486M(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        m49521n().m49482Q(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            if (i != this.f72869j) {
                this.f72869j = i;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m49521n().m49470c0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != m49521n().m49460m()) {
            m49521n().m49488K(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f72876q.m26935f(i);
    }

    public void setHideMotionSpec(YV2 yv2) {
        m49521n().m49487L(yv2);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(YV2.m74982d(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            m49521n().m49474a0();
            if (this.f72864e != null) {
                m49509z();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f72875p.m13811g(i);
        m49509z();
    }

    public void setMaxImageSize(int i) {
        this.f72871l = i;
        m49521n().m49484O(i);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        m49521n().m49493E();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        m49521n().m49493E();
    }

    public void setShadowPaddingEnabled(boolean z) {
        m49521n().m49481S(z);
    }

    @Override // p000.InterfaceC32302Cy5
    public void setShapeAppearanceModel(C43037iy5 c43037iy5) {
        m49521n().m49480T(c43037iy5);
    }

    public void setShowMotionSpec(YV2 yv2) {
        m49521n().m49479U(yv2);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(YV2.m74982d(getContext(), i));
    }

    public void setSize(int i) {
        this.f72869j = 0;
        if (i != this.f72868i) {
            this.f72868i = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f72864e != colorStateList) {
            this.f72864e = colorStateList;
            m49509z();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f72865f != mode) {
            this.f72865f = mode;
            m49509z();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        m49521n().m49492F();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        m49521n().m49492F();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        m49521n().m49492F();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f72872m != z) {
            this.f72872m = z;
            m49521n().mo7788y();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: t */
    public void m49515t() {
        m49514u(null);
    }

    /* renamed from: u */
    public void m49514u(AbstractC17810b abstractC17810b) {
        m49513v(abstractC17810b, true);
    }

    /* renamed from: v */
    public void m49513v(AbstractC17810b abstractC17810b, boolean z) {
        m49521n().m49455s(m49531D(abstractC17810b), z);
    }

    /* renamed from: w */
    public boolean m49512w() {
        return m49521n().m49454u();
    }

    /* renamed from: x */
    public boolean m49511x() {
        return m49521n().m49453v();
    }

    /* renamed from: y */
    public final void m49510y(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f72873n;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: z */
    public final void m49509z() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f72864e;
        if (colorStateList == null) {
            P61.m90849c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f72865f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C27043oi.m20608e(colorForState, mode));
    }

    /* loaded from: classes6.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        public Rect f72878a;

        /* renamed from: b */
        public AbstractC17810b f72879b;

        /* renamed from: c */
        public boolean f72880c;

        public BaseBehavior() {
            this.f72880c = true;
        }

        /* renamed from: b */
        public static boolean m49508b(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C11529e) {
                return ((CoordinatorLayout.C11529e) layoutParams).m67769f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: a */
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f72873n;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: c */
        public final void m49507c(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.f72873n;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C11529e c11529e = (CoordinatorLayout.C11529e) floatingActionButton.getLayoutParams();
                int i2 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c11529e).rightMargin) {
                    i = rect.right;
                } else if (floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c11529e).leftMargin) {
                    i = -rect.left;
                } else {
                    i = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c11529e).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c11529e).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    C38790bq6.m62483g0(floatingActionButton, i2);
                }
                if (i != 0) {
                    C38790bq6.m62486f0(floatingActionButton, i);
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: d */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m49505g(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (m49508b(view)) {
                m49504h(view, floatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: e */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = dependencies.get(i2);
                if (view instanceof AppBarLayout) {
                    if (m49505g(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m49508b(view) && m49504h(view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i);
            m49507c(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: f */
        public final boolean m49506f(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.C11529e c11529e = (CoordinatorLayout.C11529e) floatingActionButton.getLayoutParams();
            if (!this.f72880c || c11529e.m67770e() != view.getId() || floatingActionButton.m49392c() != 0) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public final boolean m49505g(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m49506f(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f72878a == null) {
                this.f72878a = new Rect();
            }
            Rect rect = this.f72878a;
            C50167v01.m9396a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.m50461m()) {
                floatingActionButton.m49513v(this.f72879b, false);
                return true;
            }
            floatingActionButton.m49532C(this.f72879b, false);
            return true;
        }

        /* renamed from: h */
        public final boolean m49504h(View view, FloatingActionButton floatingActionButton) {
            if (!m49506f(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C11529e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m49513v(this.f72879b, false);
                return true;
            }
            floatingActionButton.m49532C(this.f72879b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(CoordinatorLayout.C11529e c11529e) {
            if (c11529e.f54219h == 0) {
                c11529e.f54219h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C37098Xl4.FloatingActionButton_Behavior_Layout);
            this.f72880c = obtainStyledAttributes.getBoolean(C37098Xl4.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.floatingActionButtonStyle);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f72866g != colorStateList) {
            this.f72866g = colorStateList;
            m49521n().mo7799R(this.f72866g);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r6), attributeSet, i);
        int i2 = f72861s;
        this.f72873n = new Rect();
        this.f72874o = new Rect();
        Context context2 = getContext();
        TypedArray m21866i = C46052o36.m21866i(context2, attributeSet, C37098Xl4.FloatingActionButton, i, i2, new int[0]);
        this.f72862c = NM2.m94029b(context2, m21866i, C37098Xl4.FloatingActionButton_backgroundTint);
        this.f72863d = C36704Vt6.m79293o(m21866i.getInt(C37098Xl4.FloatingActionButton_backgroundTintMode, -1), null);
        this.f72866g = NM2.m94029b(context2, m21866i, C37098Xl4.FloatingActionButton_rippleColor);
        this.f72868i = m21866i.getInt(C37098Xl4.FloatingActionButton_fabSize, -1);
        this.f72869j = m21866i.getDimensionPixelSize(C37098Xl4.FloatingActionButton_fabCustomSize, 0);
        this.f72867h = m21866i.getDimensionPixelSize(C37098Xl4.FloatingActionButton_borderWidth, 0);
        float dimension = m21866i.getDimension(C37098Xl4.FloatingActionButton_elevation, 0.0f);
        float dimension2 = m21866i.getDimension(C37098Xl4.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = m21866i.getDimension(C37098Xl4.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f72872m = m21866i.getBoolean(C37098Xl4.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C35172Pf4.mtrl_fab_min_touch_target);
        setMaxImageSize(m21866i.getDimensionPixelSize(C37098Xl4.FloatingActionButton_maxImageSize, 0));
        YV2 m74983c = YV2.m74983c(context2, m21866i, C37098Xl4.FloatingActionButton_showMotionSpec);
        YV2 m74983c2 = YV2.m74983c(context2, m21866i, C37098Xl4.FloatingActionButton_hideMotionSpec);
        C43037iy5 m31495m = C43037iy5.m31538g(context2, attributeSet, i, i2, C43037iy5.f91787m).m31495m();
        boolean z = m21866i.getBoolean(C37098Xl4.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(m21866i.getBoolean(C37098Xl4.FloatingActionButton_android_enabled, true));
        m21866i.recycle();
        C28369si c28369si = new C28369si(this);
        this.f72875p = c28369si;
        c28369si.m13813e(attributeSet, i);
        this.f72876q = new C44652li1(this);
        m49521n().m49480T(m31495m);
        m49521n().mo7790t(this.f72862c, this.f72863d, this.f72866g, this.f72867h);
        m49521n().m49483P(dimensionPixelSize);
        m49521n().m49489J(dimension);
        m49521n().m49486M(dimension2);
        m49521n().m49482Q(dimension3);
        m49521n().m49479U(m74983c);
        m49521n().m49487L(m74983c2);
        m49521n().m49488K(z);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
