package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.view.CountryTextInputLayout;
import com.stripe.android.view.StripeEditText;
/* loaded from: classes7.dex */
public final class StripeBillingAddressLayoutBinding implements InterfaceC34094Kp6 {
    public final TextInputEditText address1;
    public final View address1Divider;
    public final TextInputLayout address1Layout;
    public final TextInputEditText address2;
    public final View address2Divider;
    public final TextInputLayout address2Layout;
    public final TextInputEditText city;
    public final TextInputLayout cityLayout;
    public final LinearLayout cityPostalContainer;
    public final View cityPostalDivider;
    public final CountryTextInputLayout countryLayout;
    public final StripeEditText postalCode;
    public final TextInputLayout postalCodeLayout;
    private final View rootView;
    public final TextInputEditText state;
    public final View stateDivider;
    public final TextInputLayout stateLayout;

    private StripeBillingAddressLayoutBinding(View view, TextInputEditText textInputEditText, View view2, TextInputLayout textInputLayout, TextInputEditText textInputEditText2, View view3, TextInputLayout textInputLayout2, TextInputEditText textInputEditText3, TextInputLayout textInputLayout3, LinearLayout linearLayout, View view4, CountryTextInputLayout countryTextInputLayout, StripeEditText stripeEditText, TextInputLayout textInputLayout4, TextInputEditText textInputEditText4, View view5, TextInputLayout textInputLayout5) {
        this.rootView = view;
        this.address1 = textInputEditText;
        this.address1Divider = view2;
        this.address1Layout = textInputLayout;
        this.address2 = textInputEditText2;
        this.address2Divider = view3;
        this.address2Layout = textInputLayout2;
        this.city = textInputEditText3;
        this.cityLayout = textInputLayout3;
        this.cityPostalContainer = linearLayout;
        this.cityPostalDivider = view4;
        this.countryLayout = countryTextInputLayout;
        this.postalCode = stripeEditText;
        this.postalCodeLayout = textInputLayout4;
        this.state = textInputEditText4;
        this.stateDivider = view5;
        this.stateLayout = textInputLayout5;
    }

    public static StripeBillingAddressLayoutBinding bind(View view) {
        View m96312a;
        View m96312a2;
        View m96312a3;
        View m96312a4;
        int i = C19159R.C19161id.address1;
        TextInputEditText textInputEditText = (TextInputEditText) C34328Lp6.m96312a(view, i);
        if (textInputEditText != null && (m96312a = C34328Lp6.m96312a(view, (i = C19159R.C19161id.address1_divider))) != null) {
            i = C19159R.C19161id.address1_layout;
            TextInputLayout textInputLayout = (TextInputLayout) C34328Lp6.m96312a(view, i);
            if (textInputLayout != null) {
                i = C19159R.C19161id.address2;
                TextInputEditText textInputEditText2 = (TextInputEditText) C34328Lp6.m96312a(view, i);
                if (textInputEditText2 != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C19159R.C19161id.address2_divider))) != null) {
                    i = C19159R.C19161id.address2_layout;
                    TextInputLayout textInputLayout2 = (TextInputLayout) C34328Lp6.m96312a(view, i);
                    if (textInputLayout2 != null) {
                        i = C19159R.C19161id.city;
                        TextInputEditText textInputEditText3 = (TextInputEditText) C34328Lp6.m96312a(view, i);
                        if (textInputEditText3 != null) {
                            i = C19159R.C19161id.city_layout;
                            TextInputLayout textInputLayout3 = (TextInputLayout) C34328Lp6.m96312a(view, i);
                            if (textInputLayout3 != null) {
                                i = C19159R.C19161id.city_postal_container;
                                LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                                if (linearLayout != null && (m96312a3 = C34328Lp6.m96312a(view, (i = C19159R.C19161id.city_postal_divider))) != null) {
                                    i = C19159R.C19161id.country_layout;
                                    CountryTextInputLayout countryTextInputLayout = (CountryTextInputLayout) C34328Lp6.m96312a(view, i);
                                    if (countryTextInputLayout != null) {
                                        i = C19159R.C19161id.postal_code;
                                        StripeEditText stripeEditText = (StripeEditText) C34328Lp6.m96312a(view, i);
                                        if (stripeEditText != null) {
                                            i = C19159R.C19161id.postal_code_layout;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) C34328Lp6.m96312a(view, i);
                                            if (textInputLayout4 != null) {
                                                i = C19159R.C19161id.state;
                                                TextInputEditText textInputEditText4 = (TextInputEditText) C34328Lp6.m96312a(view, i);
                                                if (textInputEditText4 != null && (m96312a4 = C34328Lp6.m96312a(view, (i = C19159R.C19161id.state_divider))) != null) {
                                                    i = C19159R.C19161id.state_layout;
                                                    TextInputLayout textInputLayout5 = (TextInputLayout) C34328Lp6.m96312a(view, i);
                                                    if (textInputLayout5 != null) {
                                                        return new StripeBillingAddressLayoutBinding(view, textInputEditText, m96312a, textInputLayout, textInputEditText2, m96312a2, textInputLayout2, textInputEditText3, textInputLayout3, linearLayout, m96312a3, countryTextInputLayout, stripeEditText, textInputLayout4, textInputEditText4, m96312a4, textInputLayout5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeBillingAddressLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C19159R.C19162layout.stripe_billing_address_layout, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.rootView;
    }
}
