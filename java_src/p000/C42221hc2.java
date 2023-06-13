package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import co.bird.android.feature.frequentFlyer.view.FrequentFlyerAnimationView;
import com.google.android.material.tabs.TabLayout;
/* renamed from: hc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42221hc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f85603a;

    /* renamed from: b */
    public final FrequentFlyerAnimationView f85604b;

    /* renamed from: c */
    public final TextView f85605c;

    /* renamed from: d */
    public final TabLayout f85606d;

    public C42221hc2(LinearLayout linearLayout, FrequentFlyerAnimationView frequentFlyerAnimationView, TextView textView, TabLayout tabLayout) {
        this.f85603a = linearLayout;
        this.f85604b = frequentFlyerAnimationView;
        this.f85605c = textView;
        this.f85606d = tabLayout;
    }

    /* renamed from: a */
    public static C42221hc2 m36164a(View view) {
        int i = C47610qh4.mainIcon;
        FrequentFlyerAnimationView frequentFlyerAnimationView = (FrequentFlyerAnimationView) C34328Lp6.m96312a(view, i);
        if (frequentFlyerAnimationView != null) {
            i = C47610qh4.mainMessage;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C47610qh4.tabs;
                TabLayout tabLayout = (TabLayout) C34328Lp6.m96312a(view, i);
                if (tabLayout != null) {
                    return new C42221hc2((LinearLayout) view, frequentFlyerAnimationView, textView, tabLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f85603a;
    }
}
