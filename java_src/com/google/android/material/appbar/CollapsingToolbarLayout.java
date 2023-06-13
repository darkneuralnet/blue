package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.KotlinVersion;
/* loaded from: classes6.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: G */
    public static final int f72164G = C50021ul4.Widget_Design_CollapsingToolbar;

    /* renamed from: A */
    public int f72165A;

    /* renamed from: B */
    public DB6 f72166B;

    /* renamed from: C */
    public int f72167C;

    /* renamed from: D */
    public boolean f72168D;

    /* renamed from: E */
    public int f72169E;

    /* renamed from: F */
    public boolean f72170F;

    /* renamed from: b */
    public boolean f72171b;

    /* renamed from: c */
    public int f72172c;

    /* renamed from: d */
    public ViewGroup f72173d;

    /* renamed from: e */
    public View f72174e;

    /* renamed from: f */
    public View f72175f;

    /* renamed from: g */
    public int f72176g;

    /* renamed from: h */
    public int f72177h;

    /* renamed from: i */
    public int f72178i;

    /* renamed from: j */
    public int f72179j;

    /* renamed from: k */
    public final Rect f72180k;

    /* renamed from: l */
    public final C37094Xl0 f72181l;

    /* renamed from: m */
    public final C46351oa1 f72182m;

    /* renamed from: n */
    public boolean f72183n;

    /* renamed from: o */
    public boolean f72184o;

    /* renamed from: p */
    public Drawable f72185p;

    /* renamed from: q */
    public Drawable f72186q;

    /* renamed from: r */
    public int f72187r;

    /* renamed from: s */
    public boolean f72188s;

    /* renamed from: t */
    public ValueAnimator f72189t;

    /* renamed from: u */
    public long f72190u;

    /* renamed from: v */
    public final TimeInterpolator f72191v;

    /* renamed from: w */
    public final TimeInterpolator f72192w;

    /* renamed from: x */
    public int f72193x;

    /* renamed from: y */
    public AppBarLayout.InterfaceC17664f f72194y;

    /* renamed from: z */
    public int f72195z;

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    /* loaded from: classes6.dex */
    public class C17665a implements InterfaceC36332Ue3 {
        public C17665a() {
        }

        @Override // p000.InterfaceC36332Ue3
        /* renamed from: a */
        public DB6 mo7930a(View view, DB6 db6) {
            return CollapsingToolbarLayout.this.m50378q(db6);
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    /* loaded from: classes6.dex */
    public class C17666b implements ValueAnimator.AnimatorUpdateListener {
        public C17666b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.m50377r(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$c */
    /* loaded from: classes6.dex */
    public class C17667c implements AppBarLayout.InterfaceC17664f {
        public C17667c() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC17660b
        /* renamed from: a */
        public void mo16909a(AppBarLayout appBarLayout, int i) {
            int i2;
            int height;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f72195z = i;
            DB6 db6 = collapsingToolbarLayout.f72166B;
            if (db6 != null) {
                i2 = db6.m110777m();
            } else {
                i2 = 0;
            }
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                C38217as6 m50382m = CollapsingToolbarLayout.m50382m(childAt);
                int i4 = layoutParams.f72196a;
                if (i4 != 1) {
                    if (i4 == 2) {
                        m50382m.m65341j(Math.round((-i) * layoutParams.f72197b));
                    }
                } else {
                    m50382m.m65341j(C40898fN2.m41475c(-i, 0, CollapsingToolbarLayout.this.m50386i(childAt)));
                }
            }
            CollapsingToolbarLayout.this.m50371x();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f72186q != null && i2 > 0) {
                C38790bq6.m62470m0(collapsingToolbarLayout2);
            }
            int height2 = (CollapsingToolbarLayout.this.getHeight() - C38790bq6.m62546E(CollapsingToolbarLayout.this)) - i2;
            float f = height2;
            CollapsingToolbarLayout.this.f72181l.m76399o0(Math.min(1.0f, (height - CollapsingToolbarLayout.this.m50385j()) / f));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f72181l.m76425b0(collapsingToolbarLayout3.f72195z + height2);
            CollapsingToolbarLayout.this.f72181l.m76403m0(Math.abs(i) / f);
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC17668d extends PP5 {
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    /* renamed from: h */
    public static int m50387h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: l */
    public static CharSequence m50383l(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).m69792H();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    /* renamed from: m */
    public static C38217as6 m50382m(View view) {
        int i = C33795Ji4.view_offset_helper;
        C38217as6 c38217as6 = (C38217as6) view.getTag(i);
        if (c38217as6 == null) {
            C38217as6 c38217as62 = new C38217as6(view);
            view.setTag(i, c38217as62);
            return c38217as62;
        }
        return c38217as6;
    }

    /* renamed from: o */
    public static boolean m50380o(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    /* renamed from: a */
    public final void m50394a(int i) {
        TimeInterpolator timeInterpolator;
        m50391d();
        ValueAnimator valueAnimator = this.f72189t;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f72189t = valueAnimator2;
            if (i > this.f72187r) {
                timeInterpolator = this.f72191v;
            } else {
                timeInterpolator = this.f72192w;
            }
            valueAnimator2.setInterpolator(timeInterpolator);
            this.f72189t.addUpdateListener(new C17666b());
        } else if (valueAnimator.isRunning()) {
            this.f72189t.cancel();
        }
        this.f72189t.setDuration(this.f72190u);
        this.f72189t.setIntValues(this.f72187r, i);
        this.f72189t.start();
    }

    /* renamed from: b */
    public final TextUtils.TruncateAt m50393b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    return TextUtils.TruncateAt.END;
                }
                return TextUtils.TruncateAt.MARQUEE;
            }
            return TextUtils.TruncateAt.MIDDLE;
        }
        return TextUtils.TruncateAt.START;
    }

    /* renamed from: c */
    public final void m50392c(AppBarLayout appBarLayout) {
        if (m50381n()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final void m50391d() {
        if (!this.f72171b) {
            return;
        }
        ViewGroup viewGroup = null;
        this.f72173d = null;
        this.f72174e = null;
        int i = this.f72172c;
        if (i != -1) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
            this.f72173d = viewGroup2;
            if (viewGroup2 != null) {
                this.f72174e = m50390e(viewGroup2);
            }
        }
        if (this.f72173d == null) {
            int childCount = getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i2);
                if (m50380o(childAt)) {
                    viewGroup = (ViewGroup) childAt;
                    break;
                }
                i2++;
            }
            this.f72173d = viewGroup;
        }
        m50372w();
        this.f72171b = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        Drawable drawable;
        super.draw(canvas);
        m50391d();
        if (this.f72173d == null && (drawable = this.f72185p) != null && this.f72187r > 0) {
            drawable.mutate().setAlpha(this.f72187r);
            this.f72185p.draw(canvas);
        }
        if (this.f72183n && this.f72184o) {
            if (this.f72173d != null && this.f72185p != null && this.f72187r > 0 && m50381n() && this.f72181l.m76378z() < this.f72181l.m76457A()) {
                int save = canvas.save();
                canvas.clipRect(this.f72185p.getBounds(), Region.Op.DIFFERENCE);
                this.f72181l.m76406l(canvas);
                canvas.restoreToCount(save);
            } else {
                this.f72181l.m76406l(canvas);
            }
        }
        if (this.f72186q != null && this.f72187r > 0) {
            DB6 db6 = this.f72166B;
            if (db6 != null) {
                i = db6.m110777m();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f72186q.setBounds(0, -this.f72195z, getWidth(), i - this.f72195z);
                this.f72186q.mutate().setAlpha(this.f72187r);
                this.f72186q.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.f72185p != null && this.f72187r > 0 && m50379p(view)) {
            m50373v(this.f72185p, view, getWidth(), getHeight());
            this.f72185p.mutate().setAlpha(this.f72187r);
            this.f72185p.draw(canvas);
            z = true;
        } else {
            z = false;
        }
        if (super.drawChild(canvas, view, j) || z) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f72186q;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f72185p;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C37094Xl0 c37094Xl0 = this.f72181l;
        if (c37094Xl0 != null) {
            z |= c37094Xl0.m76383w0(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final View m50390e(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return view;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: f */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: g */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* renamed from: i */
    public final int m50386i(View view) {
        return ((getHeight() - m50382m(view).m65349b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    /* renamed from: j */
    public int m50385j() {
        int i;
        int i2 = this.f72193x;
        if (i2 >= 0) {
            return i2 + this.f72167C + this.f72169E;
        }
        DB6 db6 = this.f72166B;
        if (db6 != null) {
            i = db6.m110777m();
        } else {
            i = 0;
        }
        int m62546E = C38790bq6.m62546E(this);
        if (m62546E > 0) {
            return Math.min((m62546E * 2) + i, getHeight());
        }
        return getHeight() / 3;
    }

    /* renamed from: k */
    public CharSequence m50384k() {
        if (this.f72183n) {
            return this.f72181l.m76451D();
        }
        return null;
    }

    /* renamed from: n */
    public final boolean m50381n() {
        return this.f72165A == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            m50392c(appBarLayout);
            C38790bq6.m62543F0(this, C38790bq6.m62554A(appBarLayout));
            if (this.f72194y == null) {
                this.f72194y = new C17667c();
            }
            appBarLayout.m50469e(this.f72194y);
            C38790bq6.m62458s0(this);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f72181l.m76442M(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.InterfaceC17664f interfaceC17664f = this.f72194y;
        if (interfaceC17664f != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).m50483D(interfaceC17664f);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        DB6 db6 = this.f72166B;
        if (db6 != null) {
            int m110777m = db6.m110777m();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!C38790bq6.m62554A(childAt) && childAt.getTop() < m110777m) {
                    C38790bq6.m62483g0(childAt, m110777m);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            m50382m(getChildAt(i6)).m65344g();
        }
        m50370y(i, i2, i3, i4, false);
        m50369z();
        m50371x();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m50382m(getChildAt(i7)).m65350a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        m50391d();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        DB6 db6 = this.f72166B;
        if (db6 != null) {
            i3 = db6.m110777m();
        } else {
            i3 = 0;
        }
        if ((mode == 0 || this.f72168D) && i3 > 0) {
            this.f72167C = i3;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, 1073741824));
        }
        if (this.f72170F && this.f72181l.m76455B() > 1) {
            m50369z();
            m50370y(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int m76384w = this.f72181l.m76384w();
            if (m76384w > 1) {
                this.f72169E = Math.round(this.f72181l.m76382x()) * (m76384w - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f72169E, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f72173d;
        if (viewGroup != null) {
            View view = this.f72174e;
            if (view != null && view != this) {
                setMinimumHeight(m50387h(view));
            } else {
                setMinimumHeight(m50387h(viewGroup));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f72185p;
        if (drawable != null) {
            m50374u(drawable, i, i2);
        }
    }

    /* renamed from: p */
    public final boolean m50379p(View view) {
        View view2 = this.f72174e;
        if (view2 != null && view2 != this) {
            if (view == view2) {
                return true;
            }
        } else if (view == this.f72173d) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public DB6 m50378q(DB6 db6) {
        DB6 db62;
        if (C38790bq6.m62554A(this)) {
            db62 = db6;
        } else {
            db62 = null;
        }
        if (!C37259Yd3.m74780a(this.f72166B, db62)) {
            this.f72166B = db62;
            requestLayout();
        }
        return db6.m110787c();
    }

    /* renamed from: r */
    public void m50377r(int i) {
        ViewGroup viewGroup;
        if (i != this.f72187r) {
            if (this.f72185p != null && (viewGroup = this.f72173d) != null) {
                C38790bq6.m62470m0(viewGroup);
            }
            this.f72187r = i;
            C38790bq6.m62470m0(this);
        }
    }

    /* renamed from: s */
    public final void m50376s(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View view = this.f72174e;
        if (view == null) {
            view = this.f72173d;
        }
        int m50386i = m50386i(view);
        C50167v01.m9396a(this, this.f72175f, this.f72180k);
        ViewGroup viewGroup = this.f72173d;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i = toolbar.m69789K();
            i3 = toolbar.m69790J();
            i4 = toolbar.m69788L();
            i2 = toolbar.m69791I();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i = toolbar2.getTitleMarginStart();
            i3 = toolbar2.getTitleMarginEnd();
            i4 = toolbar2.getTitleMarginTop();
            i2 = toolbar2.getTitleMarginBottom();
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        C37094Xl0 c37094Xl0 = this.f72181l;
        Rect rect = this.f72180k;
        int i6 = rect.left;
        if (z) {
            i5 = i3;
        } else {
            i5 = i;
        }
        int i7 = i6 + i5;
        int i8 = rect.top + m50386i + i4;
        int i9 = rect.right;
        if (!z) {
            i = i3;
        }
        c37094Xl0.m76436S(i7, i8, i9 - i, (rect.bottom + m50386i) - i2);
    }

    public void setCollapsedTitleGravity(int i) {
        this.f72181l.m76431X(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f72181l.m76434U(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextSize(float f) {
        this.f72181l.m76430Y(f);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f72181l.m76429Z(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f72185p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f72185p = drawable3;
            if (drawable3 != null) {
                m50374u(drawable3, getWidth(), getHeight());
                this.f72185p.setCallback(this);
                this.f72185p.setAlpha(this.f72187r);
            }
            C38790bq6.m62470m0(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(NA0.m94299e(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f72181l.m76411i0(i);
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.f72176g = i;
        this.f72177h = i2;
        this.f72178i = i3;
        this.f72179j = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f72179j = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f72178i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f72176g = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f72177h = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f72181l.m76417f0(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f72181l.m76413h0(colorStateList);
    }

    public void setExpandedTitleTextSize(float f) {
        this.f72181l.m76409j0(f);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f72181l.m76407k0(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.f72170F = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.f72168D = z;
    }

    public void setHyphenationFrequency(int i) {
        this.f72181l.m76397p0(i);
    }

    public void setLineSpacingAdd(float f) {
        this.f72181l.m76393r0(f);
    }

    public void setLineSpacingMultiplier(float f) {
        this.f72181l.m76391s0(f);
    }

    public void setMaxLines(int i) {
        this.f72181l.m76389t0(i);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f72181l.m76385v0(z);
    }

    public void setScrimAnimationDuration(long j) {
        this.f72190u = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f72193x != i) {
            this.f72193x = i;
            m50371x();
        }
    }

    public void setScrimsShown(boolean z) {
        setScrimsShown(z, C38790bq6.m62504Z(this) && !isInEditMode());
    }

    public void setStaticLayoutBuilderConfigurer(InterfaceC17668d interfaceC17668d) {
        this.f72181l.m76381x0(interfaceC17668d);
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f72186q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f72186q = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f72186q.setState(getDrawableState());
                }
                P61.m90839m(this.f72186q, C38790bq6.m62548D(this));
                Drawable drawable4 = this.f72186q;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f72186q.setCallback(this);
                this.f72186q.setAlpha(this.f72187r);
            }
            C38790bq6.m62470m0(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(NA0.m94299e(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.f72181l.m76379y0(charSequence);
        m50375t();
    }

    public void setTitleCollapseMode(int i) {
        this.f72165A = i;
        boolean m50381n = m50381n();
        this.f72181l.m76401n0(m50381n);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            m50392c((AppBarLayout) parent);
        }
        if (m50381n && this.f72185p == null) {
            setContentScrimColor(this.f72182m.m20831d(getResources().getDimension(C35172Pf4.design_appbar_elevation)));
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f72181l.m76456A0(truncateAt);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f72183n) {
            this.f72183n = z;
            m50375t();
            m50372w();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        this.f72181l.m76387u0(timeInterpolator);
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
        Drawable drawable = this.f72186q;
        if (drawable != null && drawable.isVisible() != z) {
            this.f72186q.setVisible(z, false);
        }
        Drawable drawable2 = this.f72185p;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f72185p.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public final void m50375t() {
        setContentDescription(m50384k());
    }

    /* renamed from: u */
    public final void m50374u(Drawable drawable, int i, int i2) {
        m50373v(drawable, this.f72173d, i, i2);
    }

    /* renamed from: v */
    public final void m50373v(Drawable drawable, View view, int i, int i2) {
        if (m50381n() && view != null && this.f72183n) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f72185p || drawable == this.f72186q;
    }

    /* renamed from: w */
    public final void m50372w() {
        View view;
        if (!this.f72183n && (view = this.f72175f) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f72175f);
            }
        }
        if (this.f72183n && this.f72173d != null) {
            if (this.f72175f == null) {
                this.f72175f = new View(getContext());
            }
            if (this.f72175f.getParent() == null) {
                this.f72173d.addView(this.f72175f, -1, -1);
            }
        }
    }

    /* renamed from: x */
    public final void m50371x() {
        boolean z;
        if (this.f72185p != null || this.f72186q != null) {
            if (getHeight() + this.f72195z < m50385j()) {
                z = true;
            } else {
                z = false;
            }
            setScrimsShown(z);
        }
    }

    /* renamed from: y */
    public final void m50370y(int i, int i2, int i3, int i4, boolean z) {
        View view;
        boolean z2;
        int i5;
        int i6;
        if (this.f72183n && (view = this.f72175f) != null) {
            boolean z3 = false;
            if (C38790bq6.m62506Y(view) && this.f72175f.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f72184o = z2;
            if (z2 || z) {
                if (C38790bq6.m62548D(this) == 1) {
                    z3 = true;
                }
                m50376s(z3);
                C37094Xl0 c37094Xl0 = this.f72181l;
                if (z3) {
                    i5 = this.f72178i;
                } else {
                    i5 = this.f72176g;
                }
                int i7 = this.f72180k.top + this.f72177h;
                int i8 = i3 - i;
                if (z3) {
                    i6 = this.f72176g;
                } else {
                    i6 = this.f72178i;
                }
                c37094Xl0.m76423c0(i5, i7, i8 - i6, (i4 - i2) - this.f72179j);
                this.f72181l.m76439P(z);
            }
        }
    }

    /* renamed from: z */
    public final void m50369z() {
        if (this.f72173d != null && this.f72183n && TextUtils.isEmpty(this.f72181l.m76451D())) {
            setTitle(m50383l(this.f72173d));
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.collapsingToolbarLayoutStyle);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f72181l.m76432W(colorStateList);
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.f72188s != z) {
            int i = KotlinVersion.MAX_COMPONENT_VALUE;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                m50394a(i);
            } else {
                if (!z) {
                    i = 0;
                }
                m50377r(i);
            }
            this.f72188s = z;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = f72164G;
        this.f72171b = true;
        this.f72180k = new Rect();
        this.f72193x = -1;
        this.f72167C = 0;
        this.f72169E = 0;
        Context context2 = getContext();
        C37094Xl0 c37094Xl0 = new C37094Xl0(this);
        this.f72181l = c37094Xl0;
        c37094Xl0.m76377z0(C27325pf.f103883e);
        c37094Xl0.m76385v0(false);
        this.f72182m = new C46351oa1(context2);
        TypedArray m21866i = C46052o36.m21866i(context2, attributeSet, C37098Xl4.CollapsingToolbarLayout, i, i2, new int[0]);
        c37094Xl0.m76411i0(m21866i.getInt(C37098Xl4.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        c37094Xl0.m76431X(m21866i.getInt(C37098Xl4.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = m21866i.getDimensionPixelSize(C37098Xl4.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f72179j = dimensionPixelSize;
        this.f72178i = dimensionPixelSize;
        this.f72177h = dimensionPixelSize;
        this.f72176g = dimensionPixelSize;
        int i3 = C37098Xl4.CollapsingToolbarLayout_expandedTitleMarginStart;
        if (m21866i.hasValue(i3)) {
            this.f72176g = m21866i.getDimensionPixelSize(i3, 0);
        }
        int i4 = C37098Xl4.CollapsingToolbarLayout_expandedTitleMarginEnd;
        if (m21866i.hasValue(i4)) {
            this.f72178i = m21866i.getDimensionPixelSize(i4, 0);
        }
        int i5 = C37098Xl4.CollapsingToolbarLayout_expandedTitleMarginTop;
        if (m21866i.hasValue(i5)) {
            this.f72177h = m21866i.getDimensionPixelSize(i5, 0);
        }
        int i6 = C37098Xl4.CollapsingToolbarLayout_expandedTitleMarginBottom;
        if (m21866i.hasValue(i6)) {
            this.f72179j = m21866i.getDimensionPixelSize(i6, 0);
        }
        this.f72183n = m21866i.getBoolean(C37098Xl4.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(m21866i.getText(C37098Xl4.CollapsingToolbarLayout_title));
        c37094Xl0.m76417f0(C50021ul4.TextAppearance_Design_CollapsingToolbar_Expanded);
        c37094Xl0.m76434U(C33588Il4.TextAppearance_AppCompat_Widget_ActionBar_Title);
        int i7 = C37098Xl4.CollapsingToolbarLayout_expandedTitleTextAppearance;
        if (m21866i.hasValue(i7)) {
            c37094Xl0.m76417f0(m21866i.getResourceId(i7, 0));
        }
        int i8 = C37098Xl4.CollapsingToolbarLayout_collapsedTitleTextAppearance;
        if (m21866i.hasValue(i8)) {
            c37094Xl0.m76434U(m21866i.getResourceId(i8, 0));
        }
        int i9 = C37098Xl4.CollapsingToolbarLayout_titleTextEllipsize;
        if (m21866i.hasValue(i9)) {
            setTitleEllipsize(m50393b(m21866i.getInt(i9, -1)));
        }
        int i10 = C37098Xl4.CollapsingToolbarLayout_expandedTitleTextColor;
        if (m21866i.hasValue(i10)) {
            c37094Xl0.m76413h0(NM2.m94029b(context2, m21866i, i10));
        }
        int i11 = C37098Xl4.CollapsingToolbarLayout_collapsedTitleTextColor;
        if (m21866i.hasValue(i11)) {
            c37094Xl0.m76432W(NM2.m94029b(context2, m21866i, i11));
        }
        this.f72193x = m21866i.getDimensionPixelSize(C37098Xl4.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        int i12 = C37098Xl4.CollapsingToolbarLayout_maxLines;
        if (m21866i.hasValue(i12)) {
            c37094Xl0.m76389t0(m21866i.getInt(i12, 1));
        }
        int i13 = C37098Xl4.CollapsingToolbarLayout_titlePositionInterpolator;
        if (m21866i.hasValue(i13)) {
            c37094Xl0.m76387u0(AnimationUtils.loadInterpolator(context2, m21866i.getResourceId(i13, 0)));
        }
        this.f72190u = m21866i.getInt(C37098Xl4.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        int i14 = C49961uf4.motionEasingStandardInterpolator;
        this.f72191v = C37997aW2.m71260g(context2, i14, C27325pf.f103881c);
        this.f72192w = C37997aW2.m71260g(context2, i14, C27325pf.f103882d);
        setContentScrim(m21866i.getDrawable(C37098Xl4.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(m21866i.getDrawable(C37098Xl4.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(m21866i.getInt(C37098Xl4.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.f72172c = m21866i.getResourceId(C37098Xl4.CollapsingToolbarLayout_toolbarId, -1);
        this.f72168D = m21866i.getBoolean(C37098Xl4.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.f72170F = m21866i.getBoolean(C37098Xl4.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        m21866i.recycle();
        setWillNotDraw(false);
        C38790bq6.m62531L0(this, new C17665a());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* loaded from: classes6.dex */
    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: a */
        public int f72196a;

        /* renamed from: b */
        public float f72197b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f72196a = 0;
            this.f72197b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C37098Xl4.CollapsingToolbarLayout_Layout);
            this.f72196a = obtainStyledAttributes.getInt(C37098Xl4.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            m50368a(obtainStyledAttributes.getFloat(C37098Xl4.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void m50368a(float f) {
            this.f72197b = f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f72196a = 0;
            this.f72197b = 0.5f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f72196a = 0;
            this.f72197b = 0.5f;
        }
    }
}
