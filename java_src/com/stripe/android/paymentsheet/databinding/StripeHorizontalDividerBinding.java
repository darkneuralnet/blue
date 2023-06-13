package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.stripe.android.paymentsheet.C19159R;
/* loaded from: classes7.dex */
public final class StripeHorizontalDividerBinding implements InterfaceC34094Kp6 {
    private final View rootView;

    private StripeHorizontalDividerBinding(View view) {
        this.rootView = view;
    }

    public static StripeHorizontalDividerBinding bind(View view) {
        if (view != null) {
            return new StripeHorizontalDividerBinding(view);
        }
        throw new NullPointerException("rootView");
    }

    public static StripeHorizontalDividerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.rootView;
    }

    public static StripeHorizontalDividerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19159R.C19162layout.stripe_horizontal_divider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
