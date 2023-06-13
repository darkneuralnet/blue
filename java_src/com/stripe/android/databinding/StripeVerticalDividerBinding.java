package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.stripe.android.C18606R;
/* loaded from: classes6.dex */
public final class StripeVerticalDividerBinding implements InterfaceC34094Kp6 {
    private final View rootView;

    private StripeVerticalDividerBinding(View view) {
        this.rootView = view;
    }

    public static StripeVerticalDividerBinding bind(View view) {
        if (view != null) {
            return new StripeVerticalDividerBinding(view);
        }
        throw new NullPointerException("rootView");
    }

    public static StripeVerticalDividerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.rootView;
    }

    public static StripeVerticalDividerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18606R.C18609layout.stripe_vertical_divider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
