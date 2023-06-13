package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.stripe.android.C18606R;
/* loaded from: classes6.dex */
public final class AddPaymentMethodActivityBinding implements InterfaceC34094Kp6 {
    public final LinearLayout root;
    private final ScrollView rootView;

    private AddPaymentMethodActivityBinding(ScrollView scrollView, LinearLayout linearLayout) {
        this.rootView = scrollView;
        this.root = linearLayout;
    }

    public static AddPaymentMethodActivityBinding bind(View view) {
        int i = C18606R.C18608id.root;
        LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
        if (linearLayout != null) {
            return new AddPaymentMethodActivityBinding((ScrollView) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static AddPaymentMethodActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AddPaymentMethodActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18606R.C18609layout.add_payment_method_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    public ScrollView getRoot() {
        return this.rootView;
    }
}
