package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
/* loaded from: classes6.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC11526b {

    /* renamed from: s */
    public static final int f72817s = C50021ul4.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: t */
    public static final Property<View, Float> f72818t = new C17800f(Float.class, "width");

    /* renamed from: u */
    public static final Property<View, Float> f72819u = new C17801g(Float.class, "height");

    /* renamed from: v */
    public static final Property<View, Float> f72820v = new C17802h(Float.class, "paddingStart");

    /* renamed from: w */
    public static final Property<View, Float> f72821w = new C17803i(Float.class, "paddingEnd");

    /* renamed from: b */
    public int f72822b;

    /* renamed from: c */
    public final C0676Bf f72823c;

    /* renamed from: d */
    public final InterfaceC17827b f72824d;

    /* renamed from: e */
    public final InterfaceC17827b f72825e;

    /* renamed from: f */
    public final InterfaceC17827b f72826f;

    /* renamed from: g */
    public final InterfaceC17827b f72827g;

    /* renamed from: h */
    public final int f72828h;

    /* renamed from: i */
    public int f72829i;

    /* renamed from: j */
    public int f72830j;

    /* renamed from: k */
    public final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> f72831k;

    /* renamed from: l */
    public boolean f72832l;

    /* renamed from: m */
    public boolean f72833m;

    /* renamed from: n */
    public boolean f72834n;

    /* renamed from: o */
    public ColorStateList f72835o;

    /* renamed from: p */
    public int f72836p;

    /* renamed from: q */
    public int f72837q;

    /* renamed from: r */
    public final int f72838r;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    /* loaded from: classes6.dex */
    public class C17795a implements InterfaceC17808n {
        public C17795a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        /* renamed from: a */
        public ViewGroup.LayoutParams mo49535a() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.m49564p();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.m49565o();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.m49565o();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        public int getWidth() {
            return ExtendedFloatingActionButton.this.m49564p();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    /* loaded from: classes6.dex */
    public class C17796b implements InterfaceC17808n {
        public C17796b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        /* renamed from: a */
        public ViewGroup.LayoutParams mo49535a() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.f72830j;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.f72829i;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        public int getWidth() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.m49565o() * 2)) + ExtendedFloatingActionButton.this.f72829i + ExtendedFloatingActionButton.this.f72830j;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    /* loaded from: classes6.dex */
    public class C17797c implements InterfaceC17808n {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC17808n f72846a;

        public C17797c(InterfaceC17808n interfaceC17808n) {
            this.f72846a = interfaceC17808n;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        /* renamed from: a */
        public ViewGroup.LayoutParams mo49535a() {
            int i;
            if (ExtendedFloatingActionButton.this.f72837q == 0) {
                i = -2;
            } else {
                i = ExtendedFloatingActionButton.this.f72837q;
            }
            return new ViewGroup.LayoutParams(-1, i);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        public int getHeight() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (ExtendedFloatingActionButton.this.f72837q == -1) {
                if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                    return this.f72846a.getHeight();
                }
                View view = (View) ExtendedFloatingActionButton.this.getParent();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null && layoutParams.height == -2) {
                    return this.f72846a.getHeight();
                }
                int i = 0;
                int paddingTop = view.getPaddingTop() + view.getPaddingBottom() + 0;
                if ((ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) != null) {
                    i = 0 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                }
                return (view.getHeight() - i) - paddingTop;
            } else if (ExtendedFloatingActionButton.this.f72837q != 0 && ExtendedFloatingActionButton.this.f72837q != -2) {
                return ExtendedFloatingActionButton.this.f72837q;
            } else {
                return this.f72846a.getHeight();
            }
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.f72830j;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.f72829i;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        public int getWidth() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f72846a.getWidth();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.width == -2) {
                return this.f72846a.getWidth();
            }
            int i = 0;
            int paddingLeft = view.getPaddingLeft() + view.getPaddingRight() + 0;
            if ((ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) != null) {
                i = 0 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            }
            return (view.getWidth() - i) - paddingLeft;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    /* loaded from: classes6.dex */
    public class C17798d implements InterfaceC17808n {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC17808n f72848a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC17808n f72849b;

        public C17798d(InterfaceC17808n interfaceC17808n, InterfaceC17808n interfaceC17808n2) {
            this.f72848a = interfaceC17808n;
            this.f72849b = interfaceC17808n2;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        /* renamed from: a */
        public ViewGroup.LayoutParams mo49535a() {
            int i;
            int i2 = -2;
            if (ExtendedFloatingActionButton.this.f72836p == 0) {
                i = -2;
            } else {
                i = ExtendedFloatingActionButton.this.f72836p;
            }
            if (ExtendedFloatingActionButton.this.f72837q != 0) {
                i2 = ExtendedFloatingActionButton.this.f72837q;
            }
            return new ViewGroup.LayoutParams(i, i2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        public int getHeight() {
            if (ExtendedFloatingActionButton.this.f72837q == -1) {
                return this.f72848a.getHeight();
            }
            if (ExtendedFloatingActionButton.this.f72837q != 0 && ExtendedFloatingActionButton.this.f72837q != -2) {
                return ExtendedFloatingActionButton.this.f72837q;
            }
            return this.f72849b.getHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.f72830j;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.f72829i;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC17808n
        public int getWidth() {
            if (ExtendedFloatingActionButton.this.f72836p == -1) {
                return this.f72848a.getWidth();
            }
            if (ExtendedFloatingActionButton.this.f72836p != 0 && ExtendedFloatingActionButton.this.f72836p != -2) {
                return ExtendedFloatingActionButton.this.f72836p;
            }
            return this.f72849b.getWidth();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    /* loaded from: classes6.dex */
    public class C17799e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f72851a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC17827b f72852b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC17806l f72853c;

        public C17799e(InterfaceC17827b interfaceC17827b, AbstractC17806l abstractC17806l) {
            this.f72852b = interfaceC17827b;
            this.f72853c = abstractC17806l;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f72851a = true;
            this.f72852b.mo49438g();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f72852b.mo49437h();
            if (!this.f72851a) {
                this.f72852b.mo49440e(this.f72853c);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f72852b.onAnimationStart(animator);
            this.f72851a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    /* loaded from: classes6.dex */
    public class C17800f extends Property<View, Float> {
        public C17800f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g */
    /* loaded from: classes6.dex */
    public class C17801g extends Property<View, Float> {
        public C17801g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h */
    /* loaded from: classes6.dex */
    public class C17802h extends Property<View, Float> {
        public C17802h(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C38790bq6.m62538I(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            C38790bq6.m62529M0(view, f.intValue(), view.getPaddingTop(), C38790bq6.m62540H(view), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i */
    /* loaded from: classes6.dex */
    public class C17803i extends Property<View, Float> {
        public C17803i(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C38790bq6.m62540H(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            C38790bq6.m62529M0(view, C38790bq6.m62538I(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j */
    /* loaded from: classes6.dex */
    public class C17804j extends AbstractC2201FB {

        /* renamed from: g */
        public final InterfaceC17808n f72855g;

        /* renamed from: h */
        public final boolean f72856h;

        public C17804j(C0676Bf c0676Bf, InterfaceC17808n interfaceC17808n, boolean z) {
            super(ExtendedFloatingActionButton.this, c0676Bf);
            this.f72855g = interfaceC17808n;
            this.f72856h = z;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC17827b
        /* renamed from: a */
        public boolean mo49444a() {
            return this.f72856h == ExtendedFloatingActionButton.this.f72832l || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC17827b
        /* renamed from: c */
        public int mo49442c() {
            if (this.f72856h) {
                return C41067ff4.mtrl_extended_fab_change_size_expand_motion_spec;
            }
            return C41067ff4.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // p000.AbstractC2201FB, com.google.android.material.floatingactionbutton.InterfaceC17827b
        /* renamed from: d */
        public AnimatorSet mo49441d() {
            float f;
            YV2 m107450l = m107450l();
            if (m107450l.m74976j("width")) {
                PropertyValuesHolder[] m74979g = m107450l.m74979g("width");
                m74979g[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f72855g.getWidth());
                m107450l.m74974l("width", m74979g);
            }
            if (m107450l.m74976j("height")) {
                PropertyValuesHolder[] m74979g2 = m107450l.m74979g("height");
                m74979g2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f72855g.getHeight());
                m107450l.m74974l("height", m74979g2);
            }
            if (m107450l.m74976j("paddingStart")) {
                PropertyValuesHolder[] m74979g3 = m107450l.m74979g("paddingStart");
                m74979g3[0].setFloatValues(C38790bq6.m62538I(ExtendedFloatingActionButton.this), this.f72855g.getPaddingStart());
                m107450l.m74974l("paddingStart", m74979g3);
            }
            if (m107450l.m74976j("paddingEnd")) {
                PropertyValuesHolder[] m74979g4 = m107450l.m74979g("paddingEnd");
                m74979g4[0].setFloatValues(C38790bq6.m62540H(ExtendedFloatingActionButton.this), this.f72855g.getPaddingEnd());
                m107450l.m74974l("paddingEnd", m74979g4);
            }
            if (m107450l.m74976j("labelOpacity")) {
                PropertyValuesHolder[] m74979g5 = m107450l.m74979g("labelOpacity");
                boolean z = this.f72856h;
                float f2 = 0.0f;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                if (z) {
                    f2 = 1.0f;
                }
                m74979g5[0].setFloatValues(f, f2);
                m107450l.m74974l("labelOpacity", m74979g5);
            }
            return super.m107451k(m107450l);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC17827b
        /* renamed from: e */
        public void mo49440e(AbstractC17806l abstractC17806l) {
            if (abstractC17806l == null) {
                return;
            }
            if (this.f72856h) {
                abstractC17806l.m49539a(ExtendedFloatingActionButton.this);
            } else {
                abstractC17806l.m49536d(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC17827b
        /* renamed from: f */
        public void mo49439f() {
            ExtendedFloatingActionButton.this.f72832l = this.f72856h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.f72856h) {
                ExtendedFloatingActionButton.this.f72836p = layoutParams.width;
                ExtendedFloatingActionButton.this.f72837q = layoutParams.height;
            }
            layoutParams.width = this.f72855g.mo49535a().width;
            layoutParams.height = this.f72855g.mo49535a().height;
            C38790bq6.m62529M0(ExtendedFloatingActionButton.this, this.f72855g.getPaddingStart(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f72855g.getPaddingEnd(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // p000.AbstractC2201FB, com.google.android.material.floatingactionbutton.InterfaceC17827b
        /* renamed from: h */
        public void mo49437h() {
            super.mo49437h();
            ExtendedFloatingActionButton.this.f72833m = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f72855g.mo49535a().width;
            layoutParams.height = this.f72855g.mo49535a().height;
        }

        @Override // p000.AbstractC2201FB, com.google.android.material.floatingactionbutton.InterfaceC17827b
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.f72832l = this.f72856h;
            ExtendedFloatingActionButton.this.f72833m = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k */
    /* loaded from: classes6.dex */
    public class C17805k extends AbstractC2201FB {

        /* renamed from: g */
        public boolean f72858g;

        public C17805k(C0676Bf c0676Bf) {
            super(ExtendedFloatingActionButton.this, c0676Bf);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC17827b
        /* renamed from: a */
        public boolean mo49444a() {
            return ExtendedFloatingActionButton.this.m49562r();
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC17827b
        /* renamed from: c */
        public int mo49442c() {
            return C41067ff4.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC17827b
        /* renamed from: e */
        public void mo49440e(AbstractC17806l abstractC17806l) {
            if (abstractC17806l != null) {
                abstractC17806l.m49538b(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC17827b
        /* renamed from: f */
        public void mo49439f() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // p000.AbstractC2201FB, com.google.android.material.floatingactionbutton.InterfaceC17827b
        /* renamed from: g */
        public void mo49438g() {
            super.mo49438g();
            this.f72858g = true;
        }

        @Override // p000.AbstractC2201FB, com.google.android.material.floatingactionbutton.InterfaceC17827b
        /* renamed from: h */
        public void mo49437h() {
            super.mo49437h();
            ExtendedFloatingActionButton.this.f72822b = 0;
            if (!this.f72858g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        @Override // p000.AbstractC2201FB, com.google.android.material.floatingactionbutton.InterfaceC17827b
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f72858g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f72822b = 1;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$l */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC17806l {
        /* renamed from: a */
        public void m49539a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: b */
        public void m49538b(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: c */
        public void m49537c(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: d */
        public void m49536d(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$m */
    /* loaded from: classes6.dex */
    public class C17807m extends AbstractC2201FB {
        public C17807m(C0676Bf c0676Bf) {
            super(ExtendedFloatingActionButton.this, c0676Bf);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC17827b
        /* renamed from: a */
        public boolean mo49444a() {
            return ExtendedFloatingActionButton.this.m49561s();
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC17827b
        /* renamed from: c */
        public int mo49442c() {
            return C41067ff4.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC17827b
        /* renamed from: e */
        public void mo49440e(AbstractC17806l abstractC17806l) {
            if (abstractC17806l != null) {
                abstractC17806l.m49537c(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC17827b
        /* renamed from: f */
        public void mo49439f() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // p000.AbstractC2201FB, com.google.android.material.floatingactionbutton.InterfaceC17827b
        /* renamed from: h */
        public void mo49437h() {
            super.mo49437h();
            ExtendedFloatingActionButton.this.f72822b = 0;
        }

        @Override // p000.AbstractC2201FB, com.google.android.material.floatingactionbutton.InterfaceC17827b
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f72822b = 2;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n */
    /* loaded from: classes6.dex */
    public interface InterfaceC17808n {
        /* renamed from: a */
        ViewGroup.LayoutParams mo49535a();

        int getHeight();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC11526b
    /* renamed from: a */
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> mo49180a() {
        return this.f72831k;
    }

    /* renamed from: o */
    public int m49565o() {
        return (m49564p() - getIconSize()) / 2;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f72832l && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f72832l = false;
            this.f72824d.mo49439f();
        }
    }

    /* renamed from: p */
    public int m49564p() {
        int i = this.f72828h;
        if (i < 0) {
            return (Math.min(C38790bq6.m62538I(this), C38790bq6.m62540H(this)) * 2) + getIconSize();
        }
        return i;
    }

    /* renamed from: q */
    public final InterfaceC17808n m49563q(int i) {
        C17796b c17796b = new C17796b();
        C17797c c17797c = new C17797c(c17796b);
        C17798d c17798d = new C17798d(c17797c, c17796b);
        if (i != 1) {
            if (i != 2) {
                return c17798d;
            }
            return c17797c;
        }
        return c17796b;
    }

    /* renamed from: r */
    public final boolean m49562r() {
        if (getVisibility() == 0) {
            if (this.f72822b != 1) {
                return false;
            }
            return true;
        } else if (this.f72822b == 2) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: s */
    public final boolean m49561s() {
        if (getVisibility() != 0) {
            if (this.f72822b != 2) {
                return false;
            }
            return true;
        } else if (this.f72822b == 1) {
            return false;
        } else {
            return true;
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f72834n = z;
    }

    public void setExtendMotionSpec(YV2 yv2) {
        this.f72825e.mo49443b(yv2);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(YV2.m74982d(getContext(), i));
    }

    public void setExtended(boolean z) {
        InterfaceC17827b interfaceC17827b;
        if (this.f72832l == z) {
            return;
        }
        if (z) {
            interfaceC17827b = this.f72825e;
        } else {
            interfaceC17827b = this.f72824d;
        }
        if (interfaceC17827b.mo49444a()) {
            return;
        }
        interfaceC17827b.mo49439f();
    }

    public void setHideMotionSpec(YV2 yv2) {
        this.f72827g.mo49443b(yv2);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(YV2.m74982d(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.f72832l && !this.f72833m) {
            this.f72829i = C38790bq6.m62538I(this);
            this.f72830j = C38790bq6.m62540H(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.f72832l && !this.f72833m) {
            this.f72829i = i;
            this.f72830j = i3;
        }
    }

    public void setShowMotionSpec(YV2 yv2) {
        this.f72826f.mo49443b(yv2);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(YV2.m74982d(getContext(), i));
    }

    public void setShrinkMotionSpec(YV2 yv2) {
        this.f72824d.mo49443b(yv2);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(YV2.m74982d(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        m49559u();
    }

    /* renamed from: t */
    public final void m49560t(int i, AbstractC17806l abstractC17806l) {
        InterfaceC17827b interfaceC17827b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        interfaceC17827b = this.f72825e;
                    } else {
                        throw new IllegalStateException("Unknown strategy type: " + i);
                    }
                } else {
                    interfaceC17827b = this.f72824d;
                }
            } else {
                interfaceC17827b = this.f72827g;
            }
        } else {
            interfaceC17827b = this.f72826f;
        }
        if (interfaceC17827b.mo49444a()) {
            return;
        }
        if (!m49558v()) {
            interfaceC17827b.mo49439f();
            interfaceC17827b.mo49440e(abstractC17806l);
            return;
        }
        if (i == 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.f72836p = layoutParams.width;
                this.f72837q = layoutParams.height;
            } else {
                this.f72836p = getWidth();
                this.f72837q = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet mo49441d = interfaceC17827b.mo49441d();
        mo49441d.addListener(new C17799e(interfaceC17827b, abstractC17806l));
        for (Animator.AnimatorListener animatorListener : interfaceC17827b.mo49436i()) {
            mo49441d.addListener(animatorListener);
        }
        mo49441d.start();
    }

    /* renamed from: u */
    public final void m49559u() {
        this.f72835o = getTextColors();
    }

    /* renamed from: v */
    public final boolean m49558v() {
        if ((C38790bq6.m62504Z(this) || (!m49561s() && this.f72834n)) && !isInEditMode()) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public void m49557w(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.extendedFloatingActionButtonStyle);
    }

    /* loaded from: classes6.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        public Rect f72839a;

        /* renamed from: b */
        public AbstractC17806l f72840b;

        /* renamed from: c */
        public AbstractC17806l f72841c;

        /* renamed from: d */
        public boolean f72842d;

        /* renamed from: e */
        public boolean f72843e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f72842d = false;
            this.f72843e = true;
        }

        /* renamed from: c */
        public static boolean m49554c(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C11529e) {
                return ((CoordinatorLayout.C11529e) layoutParams).m67769f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        public void m49556a(ExtendedFloatingActionButton extendedFloatingActionButton) {
            AbstractC17806l abstractC17806l;
            int i;
            boolean z = this.f72843e;
            if (z) {
                abstractC17806l = this.f72841c;
            } else {
                abstractC17806l = this.f72840b;
            }
            if (z) {
                i = 3;
            } else {
                i = 0;
            }
            extendedFloatingActionButton.m49560t(i, abstractC17806l);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: b */
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: d */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m49549h(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (m49554c(view)) {
                m49548i(view, extendedFloatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: e */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = dependencies.get(i2);
                if (view instanceof AppBarLayout) {
                    if (m49549h(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m49554c(view) && m49548i(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i);
            return true;
        }

        /* renamed from: f */
        public final boolean m49551f(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C11529e c11529e = (CoordinatorLayout.C11529e) extendedFloatingActionButton.getLayoutParams();
            if ((!this.f72842d && !this.f72843e) || c11529e.m67770e() != view.getId()) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public void m49550g(ExtendedFloatingActionButton extendedFloatingActionButton) {
            AbstractC17806l abstractC17806l;
            int i;
            boolean z = this.f72843e;
            if (z) {
                abstractC17806l = this.f72841c;
            } else {
                abstractC17806l = this.f72840b;
            }
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            extendedFloatingActionButton.m49560t(i, abstractC17806l);
        }

        /* renamed from: h */
        public final boolean m49549h(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m49551f(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f72839a == null) {
                this.f72839a = new Rect();
            }
            Rect rect = this.f72839a;
            C50167v01.m9396a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.m50461m()) {
                m49550g(extendedFloatingActionButton);
                return true;
            }
            m49556a(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: i */
        public final boolean m49548i(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m49551f(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C11529e) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                m49550g(extendedFloatingActionButton);
                return true;
            }
            m49556a(extendedFloatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(CoordinatorLayout.C11529e c11529e) {
            if (c11529e.f54219h == 0) {
                c11529e.f54219h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C37098Xl4.ExtendedFloatingActionButton_Behavior_Layout);
            this.f72842d = obtainStyledAttributes.getBoolean(C37098Xl4.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f72843e = obtainStyledAttributes.getBoolean(C37098Xl4.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r9), attributeSet, i);
        int i2 = f72817s;
        this.f72822b = 0;
        C0676Bf c0676Bf = new C0676Bf();
        this.f72823c = c0676Bf;
        C17807m c17807m = new C17807m(c0676Bf);
        this.f72826f = c17807m;
        C17805k c17805k = new C17805k(c0676Bf);
        this.f72827g = c17805k;
        this.f72832l = true;
        this.f72833m = false;
        this.f72834n = false;
        Context context2 = getContext();
        this.f72831k = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray m21866i = C46052o36.m21866i(context2, attributeSet, C37098Xl4.ExtendedFloatingActionButton, i, i2, new int[0]);
        YV2 m74983c = YV2.m74983c(context2, m21866i, C37098Xl4.ExtendedFloatingActionButton_showMotionSpec);
        YV2 m74983c2 = YV2.m74983c(context2, m21866i, C37098Xl4.ExtendedFloatingActionButton_hideMotionSpec);
        YV2 m74983c3 = YV2.m74983c(context2, m21866i, C37098Xl4.ExtendedFloatingActionButton_extendMotionSpec);
        YV2 m74983c4 = YV2.m74983c(context2, m21866i, C37098Xl4.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.f72828h = m21866i.getDimensionPixelSize(C37098Xl4.ExtendedFloatingActionButton_collapsedSize, -1);
        int i3 = m21866i.getInt(C37098Xl4.ExtendedFloatingActionButton_extendStrategy, 1);
        this.f72838r = i3;
        this.f72829i = C38790bq6.m62538I(this);
        this.f72830j = C38790bq6.m62540H(this);
        C0676Bf c0676Bf2 = new C0676Bf();
        C17804j c17804j = new C17804j(c0676Bf2, m49563q(i3), true);
        this.f72825e = c17804j;
        C17804j c17804j2 = new C17804j(c0676Bf2, new C17795a(), false);
        this.f72824d = c17804j2;
        c17807m.mo49443b(m74983c);
        c17805k.mo49443b(m74983c2);
        c17804j.mo49443b(m74983c3);
        c17804j2.mo49443b(m74983c4);
        m21866i.recycle();
        setShapeAppearanceModel(C43037iy5.m31538g(context2, attributeSet, i, i2, C43037iy5.f91787m).m31495m());
        m49559u();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m49559u();
    }
}
