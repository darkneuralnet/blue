package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
/* renamed from: R2 */
/* loaded from: classes2.dex */
public final class C7055R2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ScrollView f31406a;

    /* renamed from: b */
    public final LinearLayout f31407b;

    /* renamed from: c */
    public final TextView f31408c;

    /* renamed from: d */
    public final ScrollView f31409d;

    public C7055R2(ScrollView scrollView, LinearLayout linearLayout, TextView textView, ScrollView scrollView2) {
        this.f31406a = scrollView;
        this.f31407b = linearLayout;
        this.f31408c = textView;
        this.f31409d = scrollView2;
    }

    /* renamed from: a */
    public static C7055R2 m87418a(View view) {
        int i = C36585Vg4.analyticsEventDetailContent;
        LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
        if (linearLayout != null) {
            i = C36585Vg4.analyticsEventDetailName;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                ScrollView scrollView = (ScrollView) view;
                return new C7055R2(scrollView, linearLayout, textView, scrollView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C7055R2 m87416c(LayoutInflater layoutInflater) {
        return m87415d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C7055R2 m87415d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_analytics_event_detail_debug, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87418a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ScrollView getRoot() {
        return this.f31406a;
    }
}
