package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.stripe.android.paymentsheet.C19159R;
/* loaded from: classes7.dex */
public final class FragmentPaymentSheetPrimaryButtonBinding implements InterfaceC34094Kp6 {
    public final FragmentContainerView paymentSheetPrimaryButtonFragmentContainerView;
    private final FragmentContainerView rootView;

    private FragmentPaymentSheetPrimaryButtonBinding(FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2) {
        this.rootView = fragmentContainerView;
        this.paymentSheetPrimaryButtonFragmentContainerView = fragmentContainerView2;
    }

    public static FragmentPaymentSheetPrimaryButtonBinding bind(View view) {
        if (view != null) {
            FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
            return new FragmentPaymentSheetPrimaryButtonBinding(fragmentContainerView, fragmentContainerView);
        }
        throw new NullPointerException("rootView");
    }

    public static FragmentPaymentSheetPrimaryButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPaymentSheetPrimaryButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19159R.C19162layout.fragment_payment_sheet_primary_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    public FragmentContainerView getRoot() {
        return this.rootView;
    }
}
