package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarView;
import p000.C36704Vt6;
import p000.DB6;
/* loaded from: classes6.dex */
public class NavigationRailView extends NavigationBarView {

    /* renamed from: f */
    public final int f73132f;

    /* renamed from: g */
    public View f73133g;

    /* renamed from: h */
    public Boolean f73134h;

    /* renamed from: i */
    public Boolean f73135i;

    /* renamed from: com.google.android.material.navigationrail.NavigationRailView$a */
    /* loaded from: classes6.dex */
    public class C17851a implements C36704Vt6.InterfaceC8809e {
        public C17851a() {
        }

        @Override // p000.C36704Vt6.InterfaceC8809e
        /* renamed from: a */
        public DB6 mo2412a(View view, DB6 db6, C36704Vt6.C8810f c8810f) {
            NavigationRailView navigationRailView = NavigationRailView.this;
            if (navigationRailView.m49266v(navigationRailView.f73134h)) {
                c8810f.f39893b += db6.m110784f(DB6.C1428m.m110715h()).f5127b;
            }
            NavigationRailView navigationRailView2 = NavigationRailView.this;
            if (navigationRailView2.m49266v(navigationRailView2.f73135i)) {
                c8810f.f39895d += db6.m110784f(DB6.C1428m.m110715h()).f5129d;
            }
            boolean z = true;
            if (C38790bq6.m62548D(view) != 1) {
                z = false;
            }
            int m110779k = db6.m110779k();
            int m110778l = db6.m110778l();
            int i = c8810f.f39892a;
            if (z) {
                m110779k = m110778l;
            }
            c8810f.f39892a = i + m110779k;
            c8810f.m79289a(view);
            return db6;
        }
    }

    public NavigationRailView(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    /* renamed from: e */
    public int mo49278e() {
        return 7;
    }

    /* renamed from: n */
    public void m49274n(int i) {
        m49273o(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, false));
    }

    /* renamed from: o */
    public void m49273o(View view) {
        m49267u();
        this.f73133g = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.f73132f;
        addView(view, 0, layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        NavigationRailMenuView m49270r = m49270r();
        int i5 = 0;
        if (m49269s()) {
            int bottom = this.f73133g.getBottom() + this.f73132f;
            int top = m49270r.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
        } else if (m49270r.m49284v()) {
            i5 = this.f73132f;
        }
        if (i5 > 0) {
            m49270r.layout(m49270r.getLeft(), m49270r.getTop() + i5, m49270r.getRight(), m49270r.getBottom() + i5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int m49268t = m49268t(i);
        super.onMeasure(m49268t, i2);
        if (m49269s()) {
            measureChild(m49270r(), m49268t, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f73133g.getMeasuredHeight()) - this.f73132f, Integer.MIN_VALUE));
        }
    }

    /* renamed from: p */
    public final void m49272p() {
        C36704Vt6.m79305c(this, new C17851a());
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    /* renamed from: q */
    public NavigationRailMenuView mo49279d(Context context) {
        return new NavigationRailMenuView(context);
    }

    /* renamed from: r */
    public final NavigationRailMenuView m49270r() {
        return (NavigationRailMenuView) m49310h();
    }

    /* renamed from: s */
    public final boolean m49269s() {
        View view = this.f73133g;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    public void setItemMinimumHeight(int i) {
        ((NavigationRailMenuView) m49310h()).setItemMinimumHeight(i);
    }

    public void setMenuGravity(int i) {
        m49270r().m49286A(i);
    }

    /* renamed from: t */
    public final int m49268t(int i) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) != 1073741824 && suggestedMinimumWidth > 0) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
        }
        return i;
    }

    /* renamed from: u */
    public void m49267u() {
        View view = this.f73133g;
        if (view != null) {
            removeView(view);
            this.f73133g = null;
        }
    }

    /* renamed from: v */
    public final boolean m49266v(Boolean bool) {
        return bool != null ? bool.booleanValue() : C38790bq6.m62554A(this);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.navigationRailStyle);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C50021ul4.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f73134h = null;
        this.f73135i = null;
        this.f73132f = getResources().getDimensionPixelSize(C35172Pf4.mtrl_navigation_rail_margin);
        Z46 m21865j = C46052o36.m21865j(getContext(), attributeSet, C37098Xl4.NavigationRailView, i, i2, new int[0]);
        int m73755n = m21865j.m73755n(C37098Xl4.NavigationRailView_headerLayout, 0);
        if (m73755n != 0) {
            m49274n(m73755n);
        }
        setMenuGravity(m21865j.m73758k(C37098Xl4.NavigationRailView_menuGravity, 49));
        int i3 = C37098Xl4.NavigationRailView_itemMinHeight;
        if (m21865j.m73750s(i3)) {
            setItemMinimumHeight(m21865j.m73763f(i3, -1));
        }
        int i4 = C37098Xl4.NavigationRailView_paddingTopSystemWindowInsets;
        if (m21865j.m73750s(i4)) {
            this.f73134h = Boolean.valueOf(m21865j.m73768a(i4, false));
        }
        int i5 = C37098Xl4.NavigationRailView_paddingBottomSystemWindowInsets;
        if (m21865j.m73750s(i5)) {
            this.f73135i = Boolean.valueOf(m21865j.m73768a(i5, false));
        }
        m21865j.m73746w();
        m49272p();
    }
}
