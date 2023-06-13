package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
/* renamed from: ts6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49500ts6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ScrollView f111317a;

    /* renamed from: b */
    public final LinearLayout f111318b;

    public C49500ts6(ScrollView scrollView, LinearLayout linearLayout) {
        this.f111317a = scrollView;
        this.f111318b = linearLayout;
    }

    /* renamed from: a */
    public static C49500ts6 m11265a(View view) {
        int i = C36585Vg4.optionsContainer;
        LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
        if (linearLayout != null) {
            return new C49500ts6((ScrollView) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C49500ts6 m11263c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.view_option_report, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m11265a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ScrollView getRoot() {
        return this.f111317a;
    }
}
