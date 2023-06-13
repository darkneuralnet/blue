package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.p047ui.PrimaryButton;
/* loaded from: classes7.dex */
public final class FragmentPrimaryButtonContainerBinding implements InterfaceC34094Kp6 {
    public final PrimaryButton primaryButton;
    private final FrameLayout rootView;

    private FragmentPrimaryButtonContainerBinding(FrameLayout frameLayout, PrimaryButton primaryButton) {
        this.rootView = frameLayout;
        this.primaryButton = primaryButton;
    }

    public static FragmentPrimaryButtonContainerBinding bind(View view) {
        int i = C19159R.C19161id.primary_button;
        PrimaryButton primaryButton = (PrimaryButton) C34328Lp6.m96312a(view, i);
        if (primaryButton != null) {
            return new FragmentPrimaryButtonContainerBinding((FrameLayout) view, primaryButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentPrimaryButtonContainerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPrimaryButtonContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19159R.C19162layout.fragment_primary_button_container, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
