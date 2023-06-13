package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.C11925l;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C17897a;
import java.util.List;
/* loaded from: classes6.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    public final int f73353a;

    /* renamed from: b */
    public final int f73354b;

    /* renamed from: c */
    public final int f73355c;

    /* renamed from: d */
    public final TimeInterpolator f73356d;

    /* renamed from: e */
    public final TimeInterpolator f73357e;

    /* renamed from: f */
    public final TimeInterpolator f73358f;

    /* renamed from: g */
    public final ViewGroup f73359g;

    /* renamed from: h */
    public final Context f73360h;

    /* renamed from: i */
    public final SnackbarBaseLayout f73361i;

    /* renamed from: j */
    public final IA0 f73362j;

    /* renamed from: k */
    public int f73363k;

    /* renamed from: l */
    public boolean f73364l;

    /* renamed from: o */
    public int f73367o;

    /* renamed from: p */
    public int f73368p;

    /* renamed from: q */
    public int f73369q;

    /* renamed from: r */
    public int f73370r;

    /* renamed from: s */
    public int f73371s;

    /* renamed from: t */
    public boolean f73372t;

    /* renamed from: u */
    public List<AbstractC17895q<B>> f73373u;

    /* renamed from: v */
    public Behavior f73374v;

    /* renamed from: w */
    public final AccessibilityManager f73375w;

    /* renamed from: y */
    public static final TimeInterpolator f73351y = C27325pf.f103880b;

    /* renamed from: z */
    public static final TimeInterpolator f73352z = C27325pf.f103879a;

    /* renamed from: A */
    public static final TimeInterpolator f73346A = C27325pf.f103882d;

    /* renamed from: C */
    public static final boolean f73348C = false;

    /* renamed from: D */
    public static final int[] f73349D = {C49961uf4.snackbarStyle};

    /* renamed from: E */
    public static final String f73350E = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: B */
    public static final Handler f73347B = new Handler(Looper.getMainLooper(), new C17886h());

    /* renamed from: m */
    public boolean f73365m = false;

    /* renamed from: n */
    public final Runnable f73366n = new RunnableC17887i();

    /* renamed from: x */
    public C17897a.InterfaceC17899b f73376x = new C17890l();

    /* loaded from: classes6.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: l */
        public final C17896r f73377l = new C17896r(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* renamed from: b */
        public boolean mo48885b(View view) {
            return this.f73377l.m48868a(view);
        }

        /* renamed from: m */
        public final void m48883m(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f73377l.m48866c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f73377l.m48867b(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    /* loaded from: classes6.dex */
    public static class SnackbarBaseLayout extends FrameLayout {

        /* renamed from: m */
        public static final View.OnTouchListener f73378m = new View$OnTouchListenerC17878a();

        /* renamed from: b */
        public BaseTransientBottomBar<?> f73379b;

        /* renamed from: c */
        public C43037iy5 f73380c;

        /* renamed from: d */
        public int f73381d;

        /* renamed from: e */
        public final float f73382e;

        /* renamed from: f */
        public final float f73383f;

        /* renamed from: g */
        public final int f73384g;

        /* renamed from: h */
        public final int f73385h;

        /* renamed from: i */
        public ColorStateList f73386i;

        /* renamed from: j */
        public PorterDuff.Mode f73387j;

        /* renamed from: k */
        public Rect f73388k;

        /* renamed from: l */
        public boolean f73389l;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$a */
        /* loaded from: classes6.dex */
        public class View$OnTouchListenerC17878a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public SnackbarBaseLayout(Context context) {
            this(context, null);
        }

        /* renamed from: c */
        public void m48880c(ViewGroup viewGroup) {
            this.f73389l = true;
            viewGroup.addView(this);
            this.f73389l = false;
        }

        /* renamed from: d */
        public final Drawable m48879d() {
            Drawable m48889v;
            int m103946j = HM2.m103946j(this, C49961uf4.colorSurface, C49961uf4.colorOnSurface, m48876g());
            C43037iy5 c43037iy5 = this.f73380c;
            if (c43037iy5 != null) {
                m48889v = BaseTransientBottomBar.m48888w(m103946j, c43037iy5);
            } else {
                m48889v = BaseTransientBottomBar.m48889v(m103946j, getResources());
            }
            if (this.f73386i != null) {
                Drawable m90834r = P61.m90834r(m48889v);
                P61.m90837o(m90834r, this.f73386i);
                return m90834r;
            }
            return P61.m90834r(m48889v);
        }

        /* renamed from: e */
        public float m48878e() {
            return this.f73383f;
        }

        /* renamed from: f */
        public int m48877f() {
            return this.f73381d;
        }

        /* renamed from: g */
        public float m48876g() {
            return this.f73382e;
        }

        /* renamed from: h */
        public int m48875h() {
            return this.f73385h;
        }

        /* renamed from: i */
        public final void m48874i(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f73379b = baseTransientBottomBar;
        }

        /* renamed from: j */
        public final void m48873j(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f73388k = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f73379b;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m48927O();
            }
            C38790bq6.m62458s0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f73379b;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m48926P();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f73379b;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m48925Q();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f73384g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.f73384g;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f73386i != null) {
                drawable = P61.m90834r(drawable.mutate());
                P61.m90837o(drawable, this.f73386i);
                P61.m90836p(drawable, this.f73387j);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f73386i = colorStateList;
            if (getBackground() != null) {
                Drawable m90834r = P61.m90834r(getBackground().mutate());
                P61.m90837o(m90834r, colorStateList);
                P61.m90836p(m90834r, this.f73387j);
                if (m90834r != getBackground()) {
                    super.setBackgroundDrawable(m90834r);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f73387j = mode;
            if (getBackground() != null) {
                Drawable m90834r = P61.m90834r(getBackground().mutate());
                P61.m90836p(m90834r, mode);
                if (m90834r != getBackground()) {
                    super.setBackgroundDrawable(m90834r);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f73389l && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                m48873j((ViewGroup.MarginLayoutParams) layoutParams);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f73379b;
                if (baseTransientBottomBar != null) {
                    baseTransientBottomBar.m48905f0();
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            View.OnTouchListener onTouchListener;
            if (onClickListener != null) {
                onTouchListener = null;
            } else {
                onTouchListener = f73378m;
            }
            setOnTouchListener(onTouchListener);
            super.setOnClickListener(onClickListener);
        }

        public SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(VM2.m79935c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C37098Xl4.SnackbarLayout);
            int i = C37098Xl4.SnackbarLayout_elevation;
            if (obtainStyledAttributes.hasValue(i)) {
                C38790bq6.m62545E0(this, obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.f73381d = obtainStyledAttributes.getInt(C37098Xl4.SnackbarLayout_animationMode, 0);
            if (obtainStyledAttributes.hasValue(C37098Xl4.SnackbarLayout_shapeAppearance) || obtainStyledAttributes.hasValue(C37098Xl4.SnackbarLayout_shapeAppearanceOverlay)) {
                this.f73380c = C43037iy5.m31540e(context2, attributeSet, 0, 0).m31495m();
            }
            this.f73382e = obtainStyledAttributes.getFloat(C37098Xl4.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(NM2.m94029b(context2, obtainStyledAttributes, C37098Xl4.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(C36704Vt6.m79293o(obtainStyledAttributes.getInt(C37098Xl4.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f73383f = obtainStyledAttributes.getFloat(C37098Xl4.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f73384g = obtainStyledAttributes.getDimensionPixelSize(C37098Xl4.SnackbarLayout_android_maxWidth, -1);
            this.f73385h = obtainStyledAttributes.getDimensionPixelSize(C37098Xl4.SnackbarLayout_maxActionInlineWidth, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f73378m);
            setFocusable(true);
            if (getBackground() == null) {
                C38790bq6.m62553A0(this, m48879d());
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    /* loaded from: classes6.dex */
    public class C17879a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f73390a;

        public C17879a(int i) {
            this.f73390a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m48924R(this.f73390a);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    /* loaded from: classes6.dex */
    public class C17880b implements ValueAnimator.AnimatorUpdateListener {
        public C17880b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f73361i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    /* loaded from: classes6.dex */
    public class C17881c implements ValueAnimator.AnimatorUpdateListener {
        public C17881c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f73361i.setScaleX(floatValue);
            BaseTransientBottomBar.this.f73361i.setScaleY(floatValue);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    /* loaded from: classes6.dex */
    public class C17882d extends AnimatorListenerAdapter {
        public C17882d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m48923S();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f73362j.mo48846a(BaseTransientBottomBar.this.f73355c - BaseTransientBottomBar.this.f73353a, BaseTransientBottomBar.this.f73353a);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    /* loaded from: classes6.dex */
    public class C17883e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f73395a;

        /* renamed from: b */
        public final /* synthetic */ int f73396b;

        public C17883e(int i) {
            this.f73396b = i;
            this.f73395a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f73348C) {
                C38790bq6.m62483g0(BaseTransientBottomBar.this.f73361i, intValue - this.f73395a);
            } else {
                BaseTransientBottomBar.this.f73361i.setTranslationY(intValue);
            }
            this.f73395a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    /* loaded from: classes6.dex */
    public class C17884f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f73398a;

        public C17884f(int i) {
            this.f73398a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m48924R(this.f73398a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f73362j.mo48845b(0, BaseTransientBottomBar.this.f73354b);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    /* loaded from: classes6.dex */
    public class C17885g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f73400a = 0;

        public C17885g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f73348C) {
                C38790bq6.m62483g0(BaseTransientBottomBar.this.f73361i, intValue - this.f73400a);
            } else {
                BaseTransientBottomBar.this.f73361i.setTranslationY(intValue);
            }
            this.f73400a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    /* loaded from: classes6.dex */
    public class C17886h implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                ((BaseTransientBottomBar) message.obj).m48930L(message.arg1);
                return true;
            }
            ((BaseTransientBottomBar) message.obj).m48917Z();
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    /* loaded from: classes6.dex */
    public class RunnableC17887i implements Runnable {
        public RunnableC17887i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int m48936F;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f73361i == null || baseTransientBottomBar.f73360h == null || (m48936F = (BaseTransientBottomBar.this.m48936F() - BaseTransientBottomBar.this.m48932J()) + ((int) BaseTransientBottomBar.this.f73361i.getTranslationY())) >= BaseTransientBottomBar.this.f73370r) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f73361i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f73350E, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f73370r - m48936F;
            BaseTransientBottomBar.this.f73361i.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    /* loaded from: classes6.dex */
    public class C17888j implements InterfaceC36332Ue3 {
        public C17888j() {
        }

        @Override // p000.InterfaceC36332Ue3
        /* renamed from: a */
        public DB6 mo7930a(View view, DB6 db6) {
            BaseTransientBottomBar.this.f73367o = db6.m110780j();
            BaseTransientBottomBar.this.f73368p = db6.m110779k();
            BaseTransientBottomBar.this.f73369q = db6.m110778l();
            BaseTransientBottomBar.this.m48905f0();
            return db6;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    /* loaded from: classes6.dex */
    public class C17889k extends C5148M1 {
        public C17889k() {
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
            super.onInitializeAccessibilityNodeInfo(view, c27125p2);
            c27125p2.m20091a(1048576);
            c27125p2.m20068l0(true);
        }

        @Override // p000.C5148M1
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                BaseTransientBottomBar.this.mo48847x();
                return true;
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    /* loaded from: classes6.dex */
    public class C17890l implements C17897a.InterfaceC17899b {
        public C17890l() {
        }

        @Override // com.google.android.material.snackbar.C17897a.InterfaceC17899b
        /* renamed from: a */
        public void mo48825a() {
            Handler handler = BaseTransientBottomBar.f73347B;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.C17897a.InterfaceC17899b
        /* renamed from: b */
        public void mo48824b(int i) {
            Handler handler = BaseTransientBottomBar.f73347B;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    /* loaded from: classes6.dex */
    public class RunnableC17891m implements Runnable {
        public RunnableC17891m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.m48924R(3);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    /* loaded from: classes6.dex */
    public class C17892n implements SwipeDismissBehavior.InterfaceC17678c {
        public C17892n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.InterfaceC17678c
        /* renamed from: a */
        public void mo48872a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.m48887y(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.InterfaceC17678c
        /* renamed from: b */
        public void mo48871b(int i) {
            if (i != 0) {
                if (i == 1 || i == 2) {
                    C17897a.m48837c().m48830j(BaseTransientBottomBar.this.f73376x);
                    return;
                }
                return;
            }
            C17897a.m48837c().m48829k(BaseTransientBottomBar.this.f73376x);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    /* loaded from: classes6.dex */
    public class RunnableC17893o implements Runnable {
        public RunnableC17893o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SnackbarBaseLayout snackbarBaseLayout = BaseTransientBottomBar.this.f73361i;
            if (snackbarBaseLayout == null) {
                return;
            }
            if (snackbarBaseLayout.getParent() != null) {
                BaseTransientBottomBar.this.f73361i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f73361i.m48877f() == 1) {
                BaseTransientBottomBar.this.m48913b0();
            } else {
                BaseTransientBottomBar.this.m48909d0();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    /* loaded from: classes6.dex */
    public class C17894p extends AnimatorListenerAdapter {
        public C17894p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m48923S();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC17895q<B> {
        /* renamed from: a */
        public void m48870a(B b, int i) {
        }

        /* renamed from: b */
        public void m48869b(B b) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r */
    /* loaded from: classes6.dex */
    public static class C17896r {

        /* renamed from: a */
        public C17897a.InterfaceC17899b f73410a;

        public C17896r(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.m50238i(0.1f);
            swipeDismissBehavior.m50240g(0.6f);
            swipeDismissBehavior.m50237j(0);
        }

        /* renamed from: a */
        public boolean m48868a(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        /* renamed from: b */
        public void m48867b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C17897a.m48837c().m48829k(this.f73410a);
                }
            } else if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C17897a.m48837c().m48830j(this.f73410a);
            }
        }

        /* renamed from: c */
        public void m48866c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f73410a = baseTransientBottomBar.f73376x;
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, IA0 ia0) {
        if (viewGroup != null) {
            if (view != null) {
                if (ia0 != null) {
                    this.f73359g = viewGroup;
                    this.f73362j = ia0;
                    this.f73360h = context;
                    C46052o36.m21874a(context);
                    SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(m48935G(), viewGroup, false);
                    this.f73361i = snackbarBaseLayout;
                    snackbarBaseLayout.m48874i(this);
                    if (view instanceof SnackbarContentLayout) {
                        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                        snackbarContentLayout.m48842e(snackbarBaseLayout.m48878e());
                        snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.m48875h());
                    }
                    snackbarBaseLayout.addView(view);
                    C38790bq6.m62448x0(snackbarBaseLayout, 1);
                    C38790bq6.m62539H0(snackbarBaseLayout, 1);
                    C38790bq6.m62543F0(snackbarBaseLayout, true);
                    C38790bq6.m62531L0(snackbarBaseLayout, new C17888j());
                    C38790bq6.m62452v0(snackbarBaseLayout, new C17889k());
                    this.f73375w = (AccessibilityManager) context.getSystemService("accessibility");
                    int i = C49961uf4.motionDurationLong2;
                    this.f73355c = C37997aW2.m71261f(context, i, C11925l.AbstractC11930e.DEFAULT_SWIPE_ANIMATION_DURATION);
                    this.f73353a = C37997aW2.m71261f(context, i, 150);
                    this.f73354b = C37997aW2.m71261f(context, C49961uf4.motionDurationMedium1, 75);
                    int i2 = C49961uf4.motionEasingEmphasizedInterpolator;
                    this.f73356d = C37997aW2.m71260g(context, i2, f73352z);
                    this.f73358f = C37997aW2.m71260g(context, i2, f73346A);
                    this.f73357e = C37997aW2.m71260g(context, i2, f73351y);
                    return;
                }
                throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
    }

    /* renamed from: v */
    public static GradientDrawable m48889v(int i, Resources resources) {
        float dimension = resources.getDimension(C35172Pf4.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* renamed from: w */
    public static PM2 m48888w(int i, C43037iy5 c43037iy5) {
        PM2 pm2 = new PM2(c43037iy5);
        pm2.m90416a0(ColorStateList.valueOf(i));
        return pm2;
    }

    /* renamed from: A */
    public View m48940A() {
        return null;
    }

    /* renamed from: B */
    public Context m48939B() {
        return this.f73360h;
    }

    /* renamed from: C */
    public int mo48865C() {
        return this.f73363k;
    }

    /* renamed from: D */
    public SwipeDismissBehavior<? extends View> m48938D() {
        return new Behavior();
    }

    /* renamed from: E */
    public final ValueAnimator m48937E(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f73358f);
        ofFloat.addUpdateListener(new C17881c());
        return ofFloat;
    }

    /* renamed from: F */
    public final int m48936F() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f73360h.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: G */
    public int m48935G() {
        return m48931K() ? C50603vk4.mtrl_layout_snackbar : C50603vk4.design_layout_snackbar;
    }

    /* renamed from: H */
    public final int m48934H() {
        int height = this.f73361i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f73361i.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    /* renamed from: I */
    public View m48933I() {
        return this.f73361i;
    }

    /* renamed from: J */
    public final int m48932J() {
        int[] iArr = new int[2];
        this.f73361i.getLocationOnScreen(iArr);
        return iArr[1] + this.f73361i.getHeight();
    }

    /* renamed from: K */
    public boolean m48931K() {
        TypedArray obtainStyledAttributes = this.f73360h.obtainStyledAttributes(f73349D);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    public final void m48930L(int i) {
        if (m48919W() && this.f73361i.getVisibility() == 0) {
            m48891t(i);
        } else {
            m48924R(i);
        }
    }

    /* renamed from: M */
    public boolean m48929M() {
        return C17897a.m48837c().m48835e(this.f73376x);
    }

    /* renamed from: N */
    public final boolean m48928N() {
        ViewGroup.LayoutParams layoutParams = this.f73361i.getLayoutParams();
        if ((layoutParams instanceof CoordinatorLayout.C11529e) && (((CoordinatorLayout.C11529e) layoutParams).m67769f() instanceof SwipeDismissBehavior)) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public void m48927O() {
        WindowInsets rootWindowInsets;
        Insets mandatorySystemGestureInsets;
        int i;
        if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = this.f73361i.getRootWindowInsets()) != null) {
            mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
            i = mandatorySystemGestureInsets.bottom;
            this.f73370r = i;
            m48905f0();
        }
    }

    /* renamed from: P */
    public void m48926P() {
        if (m48929M()) {
            f73347B.post(new RunnableC17891m());
        }
    }

    /* renamed from: Q */
    public void m48925Q() {
        if (this.f73372t) {
            m48915a0();
            this.f73372t = false;
        }
    }

    /* renamed from: R */
    public void m48924R(int i) {
        C17897a.m48837c().m48832h(this.f73376x);
        List<AbstractC17895q<B>> list = this.f73373u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f73373u.get(size).m48870a(this, i);
            }
        }
        ViewParent parent = this.f73361i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f73361i);
        }
    }

    /* renamed from: S */
    public void m48923S() {
        C17897a.m48837c().m48831i(this.f73376x);
        List<AbstractC17895q<B>> list = this.f73373u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f73373u.get(size).m48869b(this);
            }
        }
    }

    /* renamed from: T */
    public final void m48922T() {
        int m48890u = m48890u();
        if (m48890u == this.f73371s) {
            return;
        }
        this.f73371s = m48890u;
        m48905f0();
    }

    /* renamed from: U */
    public B m48921U(int i) {
        this.f73363k = i;
        return this;
    }

    /* renamed from: V */
    public final void m48920V(CoordinatorLayout.C11529e c11529e) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f73374v;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = m48938D();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).m48883m(this);
        }
        swipeDismissBehavior.m50239h(new C17892n());
        c11529e.m67758q(swipeDismissBehavior);
        if (m48940A() == null) {
            c11529e.f54218g = 80;
        }
    }

    /* renamed from: W */
    public boolean m48919W() {
        AccessibilityManager accessibilityManager = this.f73375w;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public final boolean m48918X() {
        return this.f73370r > 0 && !this.f73364l && m48928N();
    }

    /* renamed from: Y */
    public void mo48864Y() {
        C17897a.m48837c().m48827m(mo48865C(), this.f73376x);
    }

    /* renamed from: Z */
    public final void m48917Z() {
        if (this.f73361i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f73361i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C11529e) {
                m48920V((CoordinatorLayout.C11529e) layoutParams);
            }
            this.f73361i.m48880c(this.f73359g);
            m48922T();
            this.f73361i.setVisibility(4);
        }
        if (C38790bq6.m62504Z(this.f73361i)) {
            m48915a0();
        } else {
            this.f73372t = true;
        }
    }

    /* renamed from: a0 */
    public final void m48915a0() {
        if (m48919W()) {
            m48892s();
            return;
        }
        if (this.f73361i.getParent() != null) {
            this.f73361i.setVisibility(0);
        }
        m48923S();
    }

    /* renamed from: b0 */
    public final void m48913b0() {
        ValueAnimator m48886z = m48886z(0.0f, 1.0f);
        ValueAnimator m48937E = m48937E(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m48886z, m48937E);
        animatorSet.setDuration(this.f73353a);
        animatorSet.addListener(new C17894p());
        animatorSet.start();
    }

    /* renamed from: c0 */
    public final void m48911c0(int i) {
        ValueAnimator m48886z = m48886z(1.0f, 0.0f);
        m48886z.setDuration(this.f73354b);
        m48886z.addListener(new C17879a(i));
        m48886z.start();
    }

    /* renamed from: d0 */
    public final void m48909d0() {
        int m48934H = m48934H();
        if (f73348C) {
            C38790bq6.m62483g0(this.f73361i, m48934H);
        } else {
            this.f73361i.setTranslationY(m48934H);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(m48934H, 0);
        valueAnimator.setInterpolator(this.f73357e);
        valueAnimator.setDuration(this.f73355c);
        valueAnimator.addListener(new C17882d());
        valueAnimator.addUpdateListener(new C17883e(m48934H));
        valueAnimator.start();
    }

    /* renamed from: e0 */
    public final void m48907e0(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, m48934H());
        valueAnimator.setInterpolator(this.f73357e);
        valueAnimator.setDuration(this.f73355c);
        valueAnimator.addListener(new C17884f(i));
        valueAnimator.addUpdateListener(new C17885g());
        valueAnimator.start();
    }

    /* renamed from: f0 */
    public final void m48905f0() {
        int i;
        ViewGroup.LayoutParams layoutParams = this.f73361i.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.f73361i.f73388k != null) {
            if (this.f73361i.getParent() == null) {
                return;
            }
            if (m48940A() != null) {
                i = this.f73371s;
            } else {
                i = this.f73367o;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = this.f73361i.f73388k.bottom + i;
            marginLayoutParams.leftMargin = this.f73361i.f73388k.left + this.f73368p;
            marginLayoutParams.rightMargin = this.f73361i.f73388k.right + this.f73369q;
            marginLayoutParams.topMargin = this.f73361i.f73388k.top;
            this.f73361i.requestLayout();
            if (Build.VERSION.SDK_INT >= 29 && m48918X()) {
                this.f73361i.removeCallbacks(this.f73366n);
                this.f73361i.post(this.f73366n);
                return;
            }
            return;
        }
        Log.w(f73350E, "Unable to update margins because layout params are not MarginLayoutParams");
    }

    /* renamed from: s */
    public void m48892s() {
        this.f73361i.post(new RunnableC17893o());
    }

    /* renamed from: t */
    public final void m48891t(int i) {
        if (this.f73361i.m48877f() == 1) {
            m48911c0(i);
        } else {
            m48907e0(i);
        }
    }

    /* renamed from: u */
    public final int m48890u() {
        if (m48940A() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        m48940A().getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f73359g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f73359g.getHeight()) - i;
    }

    /* renamed from: x */
    public void mo48847x() {
        m48887y(3);
    }

    /* renamed from: y */
    public void m48887y(int i) {
        C17897a.m48837c().m48838b(this.f73376x, i);
    }

    /* renamed from: z */
    public final ValueAnimator m48886z(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f73356d);
        ofFloat.addUpdateListener(new C17880b());
        return ofFloat;
    }
}
