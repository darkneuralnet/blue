package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.stripe.android.C18606R;
/* loaded from: classes6.dex */
public final class AddPaymentMethodRowBinding implements InterfaceC34094Kp6 {
    public final AppCompatTextView label;
    private final LinearLayout rootView;

    private AddPaymentMethodRowBinding(LinearLayout linearLayout, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.label = appCompatTextView;
    }

    public static AddPaymentMethodRowBinding bind(View view) {
        int i = C18606R.C18608id.label;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C34328Lp6.m96312a(view, i);
        if (appCompatTextView != null) {
            return new AddPaymentMethodRowBinding((LinearLayout) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static AddPaymentMethodRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AddPaymentMethodRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18606R.C18609layout.add_payment_method_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
