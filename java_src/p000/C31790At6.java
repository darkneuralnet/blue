package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: At6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C31790At6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f1312a;

    /* renamed from: b */
    public final TextView f1313b;

    public C31790At6(ConstraintLayout constraintLayout, TextView textView) {
        this.f1312a = constraintLayout;
        this.f1313b = textView;
    }

    /* renamed from: a */
    public static C31790At6 m114984a(View view) {
        int i = C52955zi4.priceString;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            return new C31790At6((ConstraintLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C31790At6 m114982c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45268mk4.view_selected_bird_ride_price_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114984a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f1312a;
    }
}
