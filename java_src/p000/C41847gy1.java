package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
/* renamed from: gy1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41847gy1 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f84548a;

    /* renamed from: b */
    public final TabLayout f84549b;

    /* renamed from: c */
    public final ViewPager2 f84550c;

    public C41847gy1(ConstraintLayout constraintLayout, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.f84548a = constraintLayout;
        this.f84549b = tabLayout;
        this.f84550c = viewPager2;
    }

    /* renamed from: a */
    public static C41847gy1 m37276a(View view) {
        int i = C45831nh4.tabs;
        TabLayout tabLayout = (TabLayout) C34328Lp6.m96312a(view, i);
        if (tabLayout != null) {
            i = C45831nh4.viewPager;
            ViewPager2 viewPager2 = (ViewPager2) C34328Lp6.m96312a(view, i);
            if (viewPager2 != null) {
                return new C41847gy1((ConstraintLayout) view, tabLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C41847gy1 m37274c(LayoutInflater layoutInflater) {
        return m37273d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C41847gy1 m37273d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38125aj4.fragment_fleet_tab, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37276a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f84548a;
    }
}
