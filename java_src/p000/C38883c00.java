package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.feature.payment.views.SupportedPaymentMethodsView;
/* renamed from: c00  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38883c00 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f59869a;

    /* renamed from: b */
    public final SupportedPaymentMethodsView f59870b;

    /* renamed from: c */
    public final TextView f59871c;

    public C38883c00(ConstraintLayout constraintLayout, SupportedPaymentMethodsView supportedPaymentMethodsView, TextView textView) {
        this.f59869a = constraintLayout;
        this.f59870b = supportedPaymentMethodsView;
        this.f59871c = textView;
    }

    /* renamed from: a */
    public static C38883c00 m62050a(View view) {
        int i = C34956Oh4.supportedPaymentMethodsView;
        SupportedPaymentMethodsView supportedPaymentMethodsView = (SupportedPaymentMethodsView) C34328Lp6.m96312a(view, i);
        if (supportedPaymentMethodsView != null) {
            i = C34956Oh4.title;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C38883c00((ConstraintLayout) view, supportedPaymentMethodsView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C38883c00 m62048c(LayoutInflater layoutInflater) {
        return m62047d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C38883c00 m62047d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31932Bj4.bottom_sheet_quick_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m62050a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f59869a;
    }
}
