package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.stripe.android.C18606R;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.ShippingInfoWidget;
/* loaded from: classes6.dex */
public final class AddPaymentMethodCardViewBinding implements InterfaceC34094Kp6 {
    public final LinearLayout addPaymentMethodCard;
    public final ShippingInfoWidget billingAddressWidget;
    public final CardMultilineWidget cardMultilineWidget;
    private final LinearLayout rootView;

    private AddPaymentMethodCardViewBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ShippingInfoWidget shippingInfoWidget, CardMultilineWidget cardMultilineWidget) {
        this.rootView = linearLayout;
        this.addPaymentMethodCard = linearLayout2;
        this.billingAddressWidget = shippingInfoWidget;
        this.cardMultilineWidget = cardMultilineWidget;
    }

    public static AddPaymentMethodCardViewBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C18606R.C18608id.billing_address_widget;
        ShippingInfoWidget shippingInfoWidget = (ShippingInfoWidget) C34328Lp6.m96312a(view, i);
        if (shippingInfoWidget != null) {
            i = C18606R.C18608id.card_multiline_widget;
            CardMultilineWidget cardMultilineWidget = (CardMultilineWidget) C34328Lp6.m96312a(view, i);
            if (cardMultilineWidget != null) {
                return new AddPaymentMethodCardViewBinding(linearLayout, linearLayout, shippingInfoWidget, cardMultilineWidget);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static AddPaymentMethodCardViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AddPaymentMethodCardViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18606R.C18609layout.add_payment_method_card_view, viewGroup, false);
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
