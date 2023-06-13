package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.stripe.android.C18606R;
import com.stripe.android.view.ShippingInfoWidget;
/* loaded from: classes6.dex */
public final class ShippingInfoPageBinding implements InterfaceC34094Kp6 {
    private final ScrollView rootView;
    public final ShippingInfoWidget shippingInfoWidget;

    private ShippingInfoPageBinding(ScrollView scrollView, ShippingInfoWidget shippingInfoWidget) {
        this.rootView = scrollView;
        this.shippingInfoWidget = shippingInfoWidget;
    }

    public static ShippingInfoPageBinding bind(View view) {
        int i = C18606R.C18608id.shipping_info_widget;
        ShippingInfoWidget shippingInfoWidget = (ShippingInfoWidget) C34328Lp6.m96312a(view, i);
        if (shippingInfoWidget != null) {
            return new ShippingInfoPageBinding((ScrollView) view, shippingInfoWidget);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ShippingInfoPageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ShippingInfoPageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18606R.C18609layout.shipping_info_page, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    public ScrollView getRoot() {
        return this.rootView;
    }
}
