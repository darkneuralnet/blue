package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import p000.C36704Vt6;
/* loaded from: classes6.dex */
public class BottomNavigationView extends NavigationBarView {

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    /* loaded from: classes6.dex */
    public class C17693a implements C36704Vt6.InterfaceC8809e {
        public C17693a() {
        }

        @Override // p000.C36704Vt6.InterfaceC8809e
        /* renamed from: a */
        public DB6 mo2412a(View view, DB6 db6, C36704Vt6.C8810f c8810f) {
            int i;
            c8810f.f39895d += db6.m110780j();
            boolean z = true;
            if (C38790bq6.m62548D(view) != 1) {
                z = false;
            }
            int m110779k = db6.m110779k();
            int m110778l = db6.m110778l();
            int i2 = c8810f.f39892a;
            if (z) {
                i = m110778l;
            } else {
                i = m110779k;
            }
            c8810f.f39892a = i2 + i;
            int i3 = c8810f.f39894c;
            if (!z) {
                m110779k = m110778l;
            }
            c8810f.f39894c = i3 + m110779k;
            c8810f.m79289a(view);
            return db6;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC17694b extends NavigationBarView.InterfaceC17845b {
    }

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC17695c extends NavigationBarView.InterfaceC17846c {
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    /* renamed from: d */
    public NavigationBarMenuView mo49279d(Context context) {
        return new BottomNavigationMenuView(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    /* renamed from: e */
    public int mo49278e() {
        return 5;
    }

    /* renamed from: k */
    public final void m50146k(Context context) {
        View view = new View(context);
        view.setBackgroundColor(NA0.m94301c(context, C33768Jf4.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C35172Pf4.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    /* renamed from: l */
    public final void m50145l() {
        C36704Vt6.m79305c(this, new C17693a());
    }

    /* renamed from: m */
    public final int m50144m(int i) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i) != 1073741824 && suggestedMinimumHeight > 0) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
        }
        return i;
    }

    /* renamed from: n */
    public final boolean m50143n() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, m50144m(i2));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) m49310h();
        if (bottomNavigationMenuView.m50147v() != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            m49309i().mo49322f(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(InterfaceC17694b interfaceC17694b) {
        setOnItemReselectedListener(interfaceC17694b);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(InterfaceC17695c interfaceC17695c) {
        setOnItemSelectedListener(interfaceC17695c);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C50021ul4.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = getContext();
        Z46 m21865j = C46052o36.m21865j(context2, attributeSet, C37098Xl4.BottomNavigationView, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(m21865j.m73768a(C37098Xl4.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int i3 = C37098Xl4.BottomNavigationView_android_minHeight;
        if (m21865j.m73750s(i3)) {
            setMinimumHeight(m21865j.m73763f(i3, 0));
        }
        if (m21865j.m73768a(C37098Xl4.BottomNavigationView_compatShadowEnabled, true) && m50143n()) {
            m50146k(context2);
        }
        m21865j.m73746w();
        m50145l();
    }
}
