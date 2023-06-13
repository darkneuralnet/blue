package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.p047ui.PrimaryButton;
/* loaded from: classes7.dex */
public final class StripeGooglePayButtonBinding implements InterfaceC34094Kp6 {
    public final ImageView googlePayButtonContent;
    public final RelativeLayout googlePayButtonLayout;
    public final PrimaryButton googlePayPrimaryButton;
    private final View rootView;

    private StripeGooglePayButtonBinding(View view, ImageView imageView, RelativeLayout relativeLayout, PrimaryButton primaryButton) {
        this.rootView = view;
        this.googlePayButtonContent = imageView;
        this.googlePayButtonLayout = relativeLayout;
        this.googlePayPrimaryButton = primaryButton;
    }

    public static StripeGooglePayButtonBinding bind(View view) {
        int i = C19159R.C19161id.google_pay_button_content;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C19159R.C19161id.google_pay_button_layout;
            RelativeLayout relativeLayout = (RelativeLayout) C34328Lp6.m96312a(view, i);
            if (relativeLayout != null) {
                i = C19159R.C19161id.google_pay_primary_button;
                PrimaryButton primaryButton = (PrimaryButton) C34328Lp6.m96312a(view, i);
                if (primaryButton != null) {
                    return new StripeGooglePayButtonBinding(view, imageView, relativeLayout, primaryButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeGooglePayButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C19159R.C19162layout.stripe_google_pay_button, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.rootView;
    }
}
