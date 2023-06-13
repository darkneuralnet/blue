package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C11032g;
import androidx.appcompat.view.menu.InterfaceC11039j;
import com.google.android.material.badge.C17671a;
import com.google.android.material.badge.C17673b;
import p000.C27125p2;
/* loaded from: classes6.dex */
public abstract class NavigationBarItemView extends FrameLayout implements InterfaceC11039j.InterfaceC11040a {

    /* renamed from: F */
    public static final int[] f73029F = {16842912};

    /* renamed from: G */
    public static final C17839d f73030G = new C17839d(null);

    /* renamed from: H */
    public static final C17839d f73031H = new C17840e(null);

    /* renamed from: A */
    public int f73032A;

    /* renamed from: B */
    public int f73033B;

    /* renamed from: C */
    public boolean f73034C;

    /* renamed from: D */
    public int f73035D;

    /* renamed from: E */
    public C17671a f73036E;

    /* renamed from: b */
    public boolean f73037b;

    /* renamed from: c */
    public ColorStateList f73038c;

    /* renamed from: d */
    public Drawable f73039d;

    /* renamed from: e */
    public int f73040e;

    /* renamed from: f */
    public int f73041f;

    /* renamed from: g */
    public float f73042g;

    /* renamed from: h */
    public float f73043h;

    /* renamed from: i */
    public float f73044i;

    /* renamed from: j */
    public int f73045j;

    /* renamed from: k */
    public boolean f73046k;

    /* renamed from: l */
    public final FrameLayout f73047l;

    /* renamed from: m */
    public final View f73048m;

    /* renamed from: n */
    public final ImageView f73049n;

    /* renamed from: o */
    public final ViewGroup f73050o;

    /* renamed from: p */
    public final TextView f73051p;

    /* renamed from: q */
    public final TextView f73052q;

    /* renamed from: r */
    public int f73053r;

    /* renamed from: s */
    public C11032g f73054s;

    /* renamed from: t */
    public ColorStateList f73055t;

    /* renamed from: u */
    public Drawable f73056u;

    /* renamed from: v */
    public Drawable f73057v;

    /* renamed from: w */
    public ValueAnimator f73058w;

    /* renamed from: x */
    public C17839d f73059x;

    /* renamed from: y */
    public float f73060y;

    /* renamed from: z */
    public boolean f73061z;

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$a */
    /* loaded from: classes6.dex */
    public class View$OnLayoutChangeListenerC17836a implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC17836a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (NavigationBarItemView.this.f73049n.getVisibility() == 0) {
                NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                navigationBarItemView.m49380G(navigationBarItemView.f73049n);
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$b */
    /* loaded from: classes6.dex */
    public class RunnableC17837b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f73063b;

        public RunnableC17837b(int i) {
            this.f73063b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            NavigationBarItemView.this.m49379H(this.f73063b);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$c */
    /* loaded from: classes6.dex */
    public class C17838c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f73065a;

        public C17838c(float f) {
            this.f73065a = f;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            NavigationBarItemView.this.m49351z(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f73065a);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$d */
    /* loaded from: classes6.dex */
    public static class C17839d {
        private C17839d() {
        }

        /* renamed from: a */
        public float m49350a(float f, float f2) {
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            return C27325pf.m19014b(0.0f, 1.0f, i == 0 ? 0.8f : 0.0f, i == 0 ? 1.0f : 0.2f, f);
        }

        /* renamed from: b */
        public float m49349b(float f, float f2) {
            return C27325pf.m19015a(0.4f, 1.0f, f);
        }

        /* renamed from: c */
        public float mo49347c(float f, float f2) {
            return 1.0f;
        }

        /* renamed from: d */
        public void m49348d(float f, float f2, View view) {
            view.setScaleX(m49349b(f, f2));
            view.setScaleY(mo49347c(f, f2));
            view.setAlpha(m49350a(f, f2));
        }

        public /* synthetic */ C17839d(View$OnLayoutChangeListenerC17836a view$OnLayoutChangeListenerC17836a) {
            this();
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$e */
    /* loaded from: classes6.dex */
    public static class C17840e extends C17839d {
        private C17840e() {
            super(null);
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.C17839d
        /* renamed from: c */
        public float mo49347c(float f, float f2) {
            return m49349b(f, f2);
        }

        public /* synthetic */ C17840e(View$OnLayoutChangeListenerC17836a view$OnLayoutChangeListenerC17836a) {
            this();
        }
    }

    public NavigationBarItemView(Context context) {
        super(context);
        this.f73037b = false;
        this.f73053r = -1;
        this.f73059x = f73030G;
        this.f73060y = 0.0f;
        this.f73061z = false;
        this.f73032A = 0;
        this.f73033B = 0;
        this.f73034C = false;
        this.f73035D = 0;
        LayoutInflater.from(context).inflate(mo49361p(), (ViewGroup) this, true);
        this.f73047l = (FrameLayout) findViewById(C33795Ji4.navigation_bar_item_icon_container);
        this.f73048m = findViewById(C33795Ji4.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(C33795Ji4.navigation_bar_item_icon_view);
        this.f73049n = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(C33795Ji4.navigation_bar_item_labels_group);
        this.f73050o = viewGroup;
        TextView textView = (TextView) findViewById(C33795Ji4.navigation_bar_item_small_label_view);
        this.f73051p = textView;
        TextView textView2 = (TextView) findViewById(C33795Ji4.navigation_bar_item_large_label_view);
        this.f73052q = textView2;
        setBackgroundResource(m49363n());
        this.f73040e = getResources().getDimensionPixelSize(mo49362o());
        this.f73041f = viewGroup.getPaddingBottom();
        C38790bq6.m62539H0(textView, 2);
        C38790bq6.m62539H0(textView2, 2);
        setFocusable(true);
        m49369h(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC17836a());
        }
    }

    /* renamed from: B */
    public static void m49385B(TextView textView, int i) {
        Q26.m89061o(textView, i);
        int m94023h = NM2.m94023h(textView.getContext(), i, 0);
        if (m94023h != 0) {
            textView.setTextSize(0, m94023h);
        }
    }

    /* renamed from: C */
    public static void m49384C(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: D */
    public static void m49383D(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: J */
    public static void m49377J(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    /* renamed from: j */
    public static Drawable m49367j(ColorStateList colorStateList) {
        return new RippleDrawable(C52886zb5.m1054a(colorStateList), null, null);
    }

    /* renamed from: A */
    public void m49386A(C17671a c17671a) {
        if (this.f73036E == c17671a) {
            return;
        }
        if (m49357t() && this.f73049n != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            m49381F(this.f73049n);
        }
        this.f73036E = c17671a;
        ImageView imageView = this.f73049n;
        if (imageView != null) {
            m49382E(imageView);
        }
    }

    /* renamed from: E */
    public final void m49382E(View view) {
        if (m49357t() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            C17673b.m50262a(this.f73036E, view, m49365l(view));
        }
    }

    /* renamed from: F */
    public final void m49381F(View view) {
        if (!m49357t()) {
            return;
        }
        if (view != null) {
            setClipChildren(true);
            setClipToPadding(true);
            C17673b.m50259d(this.f73036E, view);
        }
        this.f73036E = null;
    }

    /* renamed from: G */
    public final void m49380G(View view) {
        if (!m49357t()) {
            return;
        }
        C17673b.m50258e(this.f73036E, view, m49365l(view));
    }

    /* renamed from: H */
    public final void m49379H(int i) {
        int i2;
        if (this.f73048m == null) {
            return;
        }
        int min = Math.min(this.f73032A, i - (this.f73035D * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f73048m.getLayoutParams();
        if (m49356u()) {
            i2 = min;
        } else {
            i2 = this.f73033B;
        }
        layoutParams.height = i2;
        layoutParams.width = min;
        this.f73048m.setLayoutParams(layoutParams);
    }

    /* renamed from: I */
    public final void m49378I() {
        if (m49356u()) {
            this.f73059x = f73031H;
        } else {
            this.f73059x = f73030G;
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11039j.InterfaceC11040a
    /* renamed from: c */
    public boolean mo49374c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11039j.InterfaceC11040a
    /* renamed from: d */
    public void mo49373d(C11032g c11032g, int i) {
        CharSequence title;
        int i2;
        this.f73054s = c11032g;
        setCheckable(c11032g.isCheckable());
        setChecked(c11032g.isChecked());
        setEnabled(c11032g.isEnabled());
        setIcon(c11032g.getIcon());
        setTitle(c11032g.getTitle());
        setId(c11032g.getItemId());
        if (!TextUtils.isEmpty(c11032g.getContentDescription())) {
            setContentDescription(c11032g.getContentDescription());
        }
        if (!TextUtils.isEmpty(c11032g.getTooltipText())) {
            title = c11032g.getTooltipText();
        } else {
            title = c11032g.getTitle();
        }
        E56.m109403a(this, title);
        if (c11032g.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        this.f73037b = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f73047l;
        if (frameLayout != null && this.f73061z) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11039j.InterfaceC11040a
    /* renamed from: e */
    public C11032g mo49372e() {
        return this.f73054s;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f73050o.getLayoutParams();
        return m49359r() + layoutParams.topMargin + this.f73050o.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f73050o.getLayoutParams();
        return Math.max(m49358s(), layoutParams.leftMargin + this.f73050o.getMeasuredWidth() + layoutParams.rightMargin);
    }

    /* renamed from: h */
    public final void m49369h(float f, float f2) {
        this.f73042g = f - f2;
        this.f73043h = (f2 * 1.0f) / f;
        this.f73044i = (f * 1.0f) / f2;
    }

    /* renamed from: i */
    public void m49368i() {
        m49352y();
        this.f73054s = null;
        this.f73060y = 0.0f;
        this.f73037b = false;
    }

    /* renamed from: k */
    public Drawable m49366k() {
        View view = this.f73048m;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    /* renamed from: l */
    public final FrameLayout m49365l(View view) {
        ImageView imageView = this.f73049n;
        if (view != imageView || !C17673b.f72259a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    /* renamed from: m */
    public final View m49364m() {
        FrameLayout frameLayout = this.f73047l;
        return frameLayout != null ? frameLayout : this.f73049n;
    }

    /* renamed from: n */
    public int m49363n() {
        return C52935zg4.mtrl_navigation_bar_item_background;
    }

    /* renamed from: o */
    public int mo49362o() {
        return C35172Pf4.mtrl_navigation_bar_item_default_margin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C11032g c11032g = this.f73054s;
        if (c11032g != null && c11032g.isCheckable() && this.f73054s.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f73029F);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C17671a c17671a = this.f73036E;
        if (c17671a != null && c17671a.isVisible()) {
            CharSequence title = this.f73054s.getTitle();
            if (!TextUtils.isEmpty(this.f73054s.getContentDescription())) {
                title = this.f73054s.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f73036E.m50283f()));
        }
        C27125p2 m20096V0 = C27125p2.m20096V0(accessibilityNodeInfo);
        m20096V0.m20074i0(C27125p2.C27128c.m20033a(0, 1, m49360q(), 1, false, isSelected()));
        if (isSelected()) {
            m20096V0.m20078g0(false);
            m20096V0.m20095W(C27125p2.C27126a.f102997i);
        }
        m20096V0.m20128F0(getResources().getString(C40534el4.item_view_role_description));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new RunnableC17837b(i));
    }

    /* renamed from: p */
    public abstract int mo49361p();

    /* renamed from: q */
    public final int m49360q() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: r */
    public final int m49359r() {
        int i;
        C17671a c17671a = this.f73036E;
        if (c17671a != null) {
            i = c17671a.getMinimumHeight() / 2;
        } else {
            i = 0;
        }
        return Math.max(i, ((FrameLayout.LayoutParams) m49364m().getLayoutParams()).topMargin) + this.f73049n.getMeasuredWidth() + i;
    }

    /* renamed from: s */
    public final int m49358s() {
        int minimumWidth;
        C17671a c17671a = this.f73036E;
        if (c17671a == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = c17671a.getMinimumWidth() - this.f73036E.m50281h();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m49364m().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f73049n.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f73048m;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        m49353x();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        int i;
        this.f73061z = z;
        m49353x();
        View view = this.f73048m;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.f73033B = i;
        m49379H(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.f73035D = i;
        m49379H(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.f73034C = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f73032A = i;
        m49379H(getWidth());
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        float f;
        this.f73052q.setPivotX(textView.getWidth() / 2);
        this.f73052q.setPivotY(textView2.getBaseline());
        this.f73051p.setPivotX(textView3.getWidth() / 2);
        this.f73051p.setPivotY(textView4.getBaseline());
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        m49355v(f);
        int i = this.f73045j;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        m49383D(m49364m(), this.f73040e, 17);
                        this.f73052q.setVisibility(8);
                        this.f73051p.setVisibility(8);
                    }
                } else {
                    m49377J(this.f73050o, this.f73041f);
                    if (z) {
                        m49383D(m49364m(), (int) (this.f73040e + this.f73042g), 49);
                        m49384C(this.f73052q, 1.0f, 1.0f, 0);
                        TextView textView5 = this.f73051p;
                        float f2 = this.f73043h;
                        m49384C(textView5, f2, f2, 4);
                    } else {
                        m49383D(m49364m(), this.f73040e, 49);
                        TextView textView6 = this.f73052q;
                        float f3 = this.f73044i;
                        m49384C(textView6, f3, f3, 4);
                        m49384C(this.f73051p, 1.0f, 1.0f, 0);
                    }
                }
            } else {
                if (z) {
                    m49383D(m49364m(), this.f73040e, 49);
                    m49377J(this.f73050o, this.f73041f);
                    this.f73052q.setVisibility(0);
                } else {
                    m49383D(m49364m(), this.f73040e, 17);
                    m49377J(this.f73050o, 0);
                    this.f73052q.setVisibility(4);
                }
                this.f73051p.setVisibility(4);
            }
        } else if (this.f73046k) {
            if (z) {
                m49383D(m49364m(), this.f73040e, 49);
                m49377J(this.f73050o, this.f73041f);
                this.f73052q.setVisibility(0);
            } else {
                m49383D(m49364m(), this.f73040e, 17);
                m49377J(this.f73050o, 0);
                this.f73052q.setVisibility(4);
            }
            this.f73051p.setVisibility(4);
        } else {
            m49377J(this.f73050o, this.f73041f);
            if (z) {
                m49383D(m49364m(), (int) (this.f73040e + this.f73042g), 49);
                m49384C(this.f73052q, 1.0f, 1.0f, 0);
                TextView textView7 = this.f73051p;
                float f4 = this.f73043h;
                m49384C(textView7, f4, f4, 4);
            } else {
                m49383D(m49364m(), this.f73040e, 49);
                TextView textView8 = this.f73052q;
                float f5 = this.f73044i;
                m49384C(textView8, f5, f5, 4);
                m49384C(this.f73051p, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f73051p.setEnabled(z);
        this.f73052q.setEnabled(z);
        this.f73049n.setEnabled(z);
        if (z) {
            C38790bq6.m62523P0(this, C40396eX3.m42806b(getContext(), 1002));
        } else {
            C38790bq6.m62523P0(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f73056u) {
            return;
        }
        this.f73056u = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = P61.m90834r(drawable).mutate();
            this.f73057v = drawable;
            ColorStateList colorStateList = this.f73055t;
            if (colorStateList != null) {
                P61.m90837o(drawable, colorStateList);
            }
        }
        this.f73049n.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f73049n.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f73049n.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f73055t = colorStateList;
        if (this.f73054s != null && (drawable = this.f73057v) != null) {
            P61.m90837o(drawable, colorStateList);
            this.f73057v.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : NA0.m94299e(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.f73041f != i) {
            this.f73041f = i;
            m49354w();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f73040e != i) {
            this.f73040e = i;
            m49354w();
        }
    }

    public void setItemPosition(int i) {
        this.f73053r = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f73038c = colorStateList;
        m49353x();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f73045j != i) {
            this.f73045j = i;
            m49378I();
            m49379H(getWidth());
            m49354w();
        }
    }

    public void setShifting(boolean z) {
        if (this.f73046k != z) {
            this.f73046k = z;
            m49354w();
        }
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearanceActive(int i) {
        m49385B(this.f73052q, i);
        m49369h(this.f73051p.getTextSize(), this.f73052q.getTextSize());
        TextView textView = this.f73052q;
        textView.setTypeface(textView.getTypeface(), 1);
    }

    public void setTextAppearanceInactive(int i) {
        m49385B(this.f73051p, i);
        m49369h(this.f73051p.getTextSize(), this.f73052q.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f73051p.setTextColor(colorStateList);
            this.f73052q.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f73051p.setText(charSequence);
        this.f73052q.setText(charSequence);
        C11032g c11032g = this.f73054s;
        if (c11032g == null || TextUtils.isEmpty(c11032g.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C11032g c11032g2 = this.f73054s;
        if (c11032g2 != null && !TextUtils.isEmpty(c11032g2.getTooltipText())) {
            charSequence = this.f73054s.getTooltipText();
        }
        E56.m109403a(this, charSequence);
    }

    /* renamed from: t */
    public final boolean m49357t() {
        return this.f73036E != null;
    }

    /* renamed from: u */
    public final boolean m49356u() {
        return this.f73034C && this.f73045j == 2;
    }

    /* renamed from: v */
    public final void m49355v(float f) {
        if (this.f73061z && this.f73037b && C38790bq6.m62506Y(this)) {
            ValueAnimator valueAnimator = this.f73058w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f73058w = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f73060y, f);
            this.f73058w = ofFloat;
            ofFloat.addUpdateListener(new C17838c(f));
            this.f73058w.setInterpolator(C37997aW2.m71260g(getContext(), C49961uf4.motionEasingEmphasizedInterpolator, C27325pf.f103880b));
            this.f73058w.setDuration(C37997aW2.m71261f(getContext(), C49961uf4.motionDurationLong2, getResources().getInteger(C35667Ri4.material_motion_duration_long_1)));
            this.f73058w.start();
            return;
        }
        m49351z(f, f);
    }

    /* renamed from: w */
    public final void m49354w() {
        C11032g c11032g = this.f73054s;
        if (c11032g != null) {
            setChecked(c11032g.isChecked());
        }
    }

    /* renamed from: x */
    public final void m49353x() {
        Drawable drawable = this.f73039d;
        RippleDrawable rippleDrawable = null;
        boolean z = true;
        if (this.f73038c != null) {
            Drawable m49366k = m49366k();
            if (this.f73061z && m49366k() != null && this.f73047l != null && m49366k != null) {
                rippleDrawable = new RippleDrawable(C52886zb5.m1051d(this.f73038c), null, m49366k);
                z = false;
            } else if (drawable == null) {
                drawable = m49367j(this.f73038c);
            }
        }
        FrameLayout frameLayout = this.f73047l;
        if (frameLayout != null) {
            C38790bq6.m62553A0(frameLayout, rippleDrawable);
        }
        C38790bq6.m62553A0(this, drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    /* renamed from: y */
    public void m49352y() {
        m49381F(this.f73049n);
    }

    /* renamed from: z */
    public final void m49351z(float f, float f2) {
        View view = this.f73048m;
        if (view != null) {
            this.f73059x.m49348d(f, f2, view);
        }
        this.f73060y = f;
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f73039d = drawable;
        m49353x();
    }
}
