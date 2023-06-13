package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.C18606R;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.CountryTextInputLayout;
import com.stripe.android.view.PostalCodeEditText;
/* loaded from: classes6.dex */
public final class StripeCardFormViewBinding implements InterfaceC34094Kp6 {
    public final CardMultilineWidget cardMultilineWidget;
    public final MaterialCardView cardMultilineWidgetContainer;
    public final CountryTextInputLayout countryLayout;
    public final View countryPostalDivider;
    public final TextView errors;
    public final PostalCodeEditText postalCode;
    public final TextInputLayout postalCodeContainer;
    private final View rootView;

    private StripeCardFormViewBinding(View view, CardMultilineWidget cardMultilineWidget, MaterialCardView materialCardView, CountryTextInputLayout countryTextInputLayout, View view2, TextView textView, PostalCodeEditText postalCodeEditText, TextInputLayout textInputLayout) {
        this.rootView = view;
        this.cardMultilineWidget = cardMultilineWidget;
        this.cardMultilineWidgetContainer = materialCardView;
        this.countryLayout = countryTextInputLayout;
        this.countryPostalDivider = view2;
        this.errors = textView;
        this.postalCode = postalCodeEditText;
        this.postalCodeContainer = textInputLayout;
    }

    public static StripeCardFormViewBinding bind(View view) {
        View m96312a;
        int i = C18606R.C18608id.card_multiline_widget;
        CardMultilineWidget cardMultilineWidget = (CardMultilineWidget) C34328Lp6.m96312a(view, i);
        if (cardMultilineWidget != null) {
            i = C18606R.C18608id.card_multiline_widget_container;
            MaterialCardView materialCardView = (MaterialCardView) C34328Lp6.m96312a(view, i);
            if (materialCardView != null) {
                i = C18606R.C18608id.country_layout;
                CountryTextInputLayout countryTextInputLayout = (CountryTextInputLayout) C34328Lp6.m96312a(view, i);
                if (countryTextInputLayout != null && (m96312a = C34328Lp6.m96312a(view, (i = C18606R.C18608id.country_postal_divider))) != null) {
                    i = C18606R.C18608id.errors;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null) {
                        i = C18606R.C18608id.postal_code;
                        PostalCodeEditText postalCodeEditText = (PostalCodeEditText) C34328Lp6.m96312a(view, i);
                        if (postalCodeEditText != null) {
                            i = C18606R.C18608id.postal_code_container;
                            TextInputLayout textInputLayout = (TextInputLayout) C34328Lp6.m96312a(view, i);
                            if (textInputLayout != null) {
                                return new StripeCardFormViewBinding(view, cardMultilineWidget, materialCardView, countryTextInputLayout, m96312a, textView, postalCodeEditText, textInputLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeCardFormViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C18606R.C18609layout.stripe_card_form_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.rootView;
    }
}
