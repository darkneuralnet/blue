package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
/* renamed from: k4 */
/* loaded from: classes3.dex */
public final class C25093k4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f93837a;

    /* renamed from: b */
    public final TabLayout f93838b;

    /* renamed from: c */
    public final ViewPager2 f93839c;

    public C25093k4(LinearLayout linearLayout, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.f93837a = linearLayout;
        this.f93838b = tabLayout;
        this.f93839c = viewPager2;
    }

    /* renamed from: a */
    public static C25093k4 m29385a(View view) {
        int i = C52352yh4.tabs;
        TabLayout tabLayout = (TabLayout) C34328Lp6.m96312a(view, i);
        if (tabLayout != null) {
            i = C52352yh4.viewPager;
            ViewPager2 viewPager2 = (ViewPager2) C34328Lp6.m96312a(view, i);
            if (viewPager2 != null) {
                return new C25093k4((LinearLayout) view, tabLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C25093k4 m29383c(LayoutInflater layoutInflater) {
        return m29382d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C25093k4 m29382d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C44665lj4.activity_maintenance_landing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m29385a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f93837a;
    }
}
