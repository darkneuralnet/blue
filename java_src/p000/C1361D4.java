package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.tabs.TabLayout;
/* renamed from: D4 */
/* loaded from: classes3.dex */
public final class C1361D4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f5175a;

    /* renamed from: b */
    public final TextView f5176b;

    /* renamed from: c */
    public final LinearProgressIndicator f5177c;

    /* renamed from: d */
    public final TabLayout f5178d;

    /* renamed from: e */
    public final ViewPager2 f5179e;

    public C1361D4(ConstraintLayout constraintLayout, TextView textView, LinearProgressIndicator linearProgressIndicator, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.f5175a = constraintLayout;
        this.f5176b = textView;
        this.f5177c = linearProgressIndicator;
        this.f5178d = tabLayout;
        this.f5179e = viewPager2;
    }

    /* renamed from: a */
    public static C1361D4 m110972a(View view) {
        int i = C34254Lh4.banner;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C34254Lh4.progressBar;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
            if (linearProgressIndicator != null) {
                i = C34254Lh4.tabs;
                TabLayout tabLayout = (TabLayout) C34328Lp6.m96312a(view, i);
                if (tabLayout != null) {
                    i = C34254Lh4.viewPager;
                    ViewPager2 viewPager2 = (ViewPager2) C34328Lp6.m96312a(view, i);
                    if (viewPager2 != null) {
                        return new C1361D4((ConstraintLayout) view, textView, linearProgressIndicator, tabLayout, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C1361D4 m110970c(LayoutInflater layoutInflater) {
        return m110969d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C1361D4 m110969d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C51779xj4.activity_operator_task_list_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m110972a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f5175a;
    }
}
