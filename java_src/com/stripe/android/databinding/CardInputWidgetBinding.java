package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.C18606R;
import com.stripe.android.view.CardBrandView;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PostalCodeEditText;
/* loaded from: classes6.dex */
public final class CardInputWidgetBinding implements InterfaceC34094Kp6 {
    public final CardBrandView cardBrandView;
    public final CardNumberEditText cardNumberEditText;
    public final TextInputLayout cardNumberTextInputLayout;
    public final FrameLayout container;
    public final CvcEditText cvcEditText;
    public final TextInputLayout cvcTextInputLayout;
    public final ExpiryDateEditText expiryDateEditText;
    public final TextInputLayout expiryDateTextInputLayout;
    public final PostalCodeEditText postalCodeEditText;
    public final TextInputLayout postalCodeTextInputLayout;
    private final View rootView;

    private CardInputWidgetBinding(View view, CardBrandView cardBrandView, CardNumberEditText cardNumberEditText, TextInputLayout textInputLayout, FrameLayout frameLayout, CvcEditText cvcEditText, TextInputLayout textInputLayout2, ExpiryDateEditText expiryDateEditText, TextInputLayout textInputLayout3, PostalCodeEditText postalCodeEditText, TextInputLayout textInputLayout4) {
        this.rootView = view;
        this.cardBrandView = cardBrandView;
        this.cardNumberEditText = cardNumberEditText;
        this.cardNumberTextInputLayout = textInputLayout;
        this.container = frameLayout;
        this.cvcEditText = cvcEditText;
        this.cvcTextInputLayout = textInputLayout2;
        this.expiryDateEditText = expiryDateEditText;
        this.expiryDateTextInputLayout = textInputLayout3;
        this.postalCodeEditText = postalCodeEditText;
        this.postalCodeTextInputLayout = textInputLayout4;
    }

    public static CardInputWidgetBinding bind(View view) {
        int i = C18606R.C18608id.card_brand_view;
        CardBrandView cardBrandView = (CardBrandView) C34328Lp6.m96312a(view, i);
        if (cardBrandView != null) {
            i = C18606R.C18608id.card_number_edit_text;
            CardNumberEditText cardNumberEditText = (CardNumberEditText) C34328Lp6.m96312a(view, i);
            if (cardNumberEditText != null) {
                i = C18606R.C18608id.card_number_text_input_layout;
                TextInputLayout textInputLayout = (TextInputLayout) C34328Lp6.m96312a(view, i);
                if (textInputLayout != null) {
                    i = C18606R.C18608id.container;
                    FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
                    if (frameLayout != null) {
                        i = C18606R.C18608id.cvc_edit_text;
                        CvcEditText cvcEditText = (CvcEditText) C34328Lp6.m96312a(view, i);
                        if (cvcEditText != null) {
                            i = C18606R.C18608id.cvc_text_input_layout;
                            TextInputLayout textInputLayout2 = (TextInputLayout) C34328Lp6.m96312a(view, i);
                            if (textInputLayout2 != null) {
                                i = C18606R.C18608id.expiry_date_edit_text;
                                ExpiryDateEditText expiryDateEditText = (ExpiryDateEditText) C34328Lp6.m96312a(view, i);
                                if (expiryDateEditText != null) {
                                    i = C18606R.C18608id.expiry_date_text_input_layout;
                                    TextInputLayout textInputLayout3 = (TextInputLayout) C34328Lp6.m96312a(view, i);
                                    if (textInputLayout3 != null) {
                                        i = C18606R.C18608id.postal_code_edit_text;
                                        PostalCodeEditText postalCodeEditText = (PostalCodeEditText) C34328Lp6.m96312a(view, i);
                                        if (postalCodeEditText != null) {
                                            i = C18606R.C18608id.postal_code_text_input_layout;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) C34328Lp6.m96312a(view, i);
                                            if (textInputLayout4 != null) {
                                                return new CardInputWidgetBinding(view, cardBrandView, cardNumberEditText, textInputLayout, frameLayout, cvcEditText, textInputLayout2, expiryDateEditText, textInputLayout3, postalCodeEditText, textInputLayout4);
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

    public static CardInputWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C18606R.C18609layout.card_input_widget, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.rootView;
    }
}
