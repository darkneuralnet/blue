package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
/* renamed from: lj0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44661lj0 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CoordinatorLayout f96636a;

    /* renamed from: b */
    public final TabLayout f96637b;

    /* renamed from: c */
    public final MaterialToolbar f96638c;

    /* renamed from: d */
    public final TextView f96639d;

    /* renamed from: e */
    public final ViewPager f96640e;

    public C44661lj0(CoordinatorLayout coordinatorLayout, TabLayout tabLayout, MaterialToolbar materialToolbar, TextView textView, ViewPager viewPager) {
        this.f96636a = coordinatorLayout;
        this.f96637b = tabLayout;
        this.f96638c = materialToolbar;
        this.f96639d = textView;
        this.f96640e = viewPager;
    }

    /* renamed from: a */
    public static C44661lj0 m26909a(View view) {
        int i = C33093Gi4.tabLayout;
        TabLayout tabLayout = (TabLayout) C34328Lp6.m96312a(view, i);
        if (tabLayout != null) {
            i = C33093Gi4.toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) C34328Lp6.m96312a(view, i);
            if (materialToolbar != null) {
                i = C33093Gi4.toolbarTitle;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C33093Gi4.viewPager;
                    ViewPager viewPager = (ViewPager) C34328Lp6.m96312a(view, i);
                    if (viewPager != null) {
                        return new C44661lj0((CoordinatorLayout) view, tabLayout, materialToolbar, textView, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C44661lj0 m26907c(LayoutInflater layoutInflater) {
        return m26906d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C44661lj0 m26906d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C48825sk4.chucker_activity_transaction, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m26909a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f96636a;
    }
}
