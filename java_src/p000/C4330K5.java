package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: K5 */
/* loaded from: classes2.dex */
public final class C4330K5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f19036a;

    /* renamed from: b */
    public final LinearProgressIndicator f19037b;

    /* renamed from: c */
    public final LinearLayout f19038c;

    public C4330K5(LinearLayout linearLayout, LinearProgressIndicator linearProgressIndicator, LinearLayout linearLayout2) {
        this.f19036a = linearLayout;
        this.f19037b = linearProgressIndicator;
        this.f19038c = linearLayout2;
    }

    /* renamed from: a */
    public static C4330K5 m99257a(View view) {
        int i = C36585Vg4.progressBar;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
        if (linearProgressIndicator != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new C4330K5(linearLayout, linearProgressIndicator, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C4330K5 m99255c(LayoutInflater layoutInflater) {
        return m99254d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C4330K5 m99254d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_ride_mode, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m99257a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f19036a;
    }
}
