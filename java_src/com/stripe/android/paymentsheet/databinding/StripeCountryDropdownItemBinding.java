package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.stripe.android.paymentsheet.C19159R;
/* loaded from: classes7.dex */
public final class StripeCountryDropdownItemBinding implements InterfaceC34094Kp6 {
    private final TextView rootView;
    public final TextView text1;

    private StripeCountryDropdownItemBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.text1 = textView2;
    }

    public static StripeCountryDropdownItemBinding bind(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new StripeCountryDropdownItemBinding(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    public static StripeCountryDropdownItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeCountryDropdownItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19159R.C19162layout.stripe_country_dropdown_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    public TextView getRoot() {
        return this.rootView;
    }
}
