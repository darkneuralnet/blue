package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
/* renamed from: Q4 */
/* loaded from: classes3.dex */
public final class C6669Q4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f29759a;

    /* renamed from: b */
    public final Button f29760b;

    /* renamed from: c */
    public final View f29761c;

    /* renamed from: d */
    public final View f29762d;

    /* renamed from: e */
    public final ProgressBar f29763e;

    /* renamed from: f */
    public final Group f29764f;

    /* renamed from: g */
    public final C33289He2 f29765g;

    /* renamed from: h */
    public final TextView f29766h;

    /* renamed from: i */
    public final C33055Ge2 f29767i;

    /* renamed from: j */
    public final ScrollView f29768j;

    /* renamed from: k */
    public final View f29769k;

    /* renamed from: l */
    public final TextView f29770l;

    /* renamed from: m */
    public final TextView f29771m;

    public C6669Q4(ConstraintLayout constraintLayout, Button button, View view, View view2, ProgressBar progressBar, Group group, C33289He2 c33289He2, TextView textView, C33055Ge2 c33055Ge2, ScrollView scrollView, View view3, TextView textView2, TextView textView3) {
        this.f29759a = constraintLayout;
        this.f29760b = button;
        this.f29761c = view;
        this.f29762d = view2;
        this.f29763e = progressBar;
        this.f29764f = group;
        this.f29765g = c33289He2;
        this.f29766h = textView;
        this.f29767i = c33055Ge2;
        this.f29768j = scrollView;
        this.f29769k = view3;
        this.f29770l = textView2;
        this.f29771m = textView3;
    }

    /* renamed from: a */
    public static C6669Q4 m88985a(View view) {
        View m96312a;
        View m96312a2;
        View m96312a3;
        View m96312a4;
        View m96312a5;
        int i = C34956Oh4.continueButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null && (m96312a = C34328Lp6.m96312a(view, (i = C34956Oh4.footerView))) != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C34956Oh4.loadingBackground))) != null) {
            i = C34956Oh4.loadingProgress;
            ProgressBar progressBar = (ProgressBar) C34328Lp6.m96312a(view, i);
            if (progressBar != null) {
                i = C34956Oh4.loadingViews;
                Group group = (Group) C34328Lp6.m96312a(view, i);
                if (group != null && (m96312a3 = C34328Lp6.m96312a(view, (i = C34956Oh4.payPerRideOption))) != null) {
                    C33289He2 m103619a = C33289He2.m103619a(m96312a3);
                    i = C34956Oh4.paymentTerms;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null && (m96312a4 = C34328Lp6.m96312a(view, (i = C34956Oh4.preloadOption))) != null) {
                        C33055Ge2 m104940a = C33055Ge2.m104940a(m96312a4);
                        i = C34956Oh4.scrollView;
                        ScrollView scrollView = (ScrollView) C34328Lp6.m96312a(view, i);
                        if (scrollView != null && (m96312a5 = C34328Lp6.m96312a(view, (i = C34956Oh4.spacer))) != null) {
                            i = C34956Oh4.subtitle;
                            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView2 != null) {
                                i = C34956Oh4.title;
                                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView3 != null) {
                                    return new C6669Q4((ConstraintLayout) view, button, m96312a, m96312a2, progressBar, group, m103619a, textView, m104940a, scrollView, m96312a5, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C6669Q4 m88983c(LayoutInflater layoutInflater) {
        return m88982d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C6669Q4 m88982d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31932Bj4.activity_preload_v2_version_b, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88985a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f29759a;
    }
}
