package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.stripe.android.C18606R;
import com.stripe.android.view.SelectShippingMethodWidget;
/* loaded from: classes6.dex */
public final class ShippingMethodPageBinding implements InterfaceC34094Kp6 {
    private final FrameLayout rootView;
    public final SelectShippingMethodWidget selectShippingMethodWidget;

    private ShippingMethodPageBinding(FrameLayout frameLayout, SelectShippingMethodWidget selectShippingMethodWidget) {
        this.rootView = frameLayout;
        this.selectShippingMethodWidget = selectShippingMethodWidget;
    }

    public static ShippingMethodPageBinding bind(View view) {
        int i = C18606R.C18608id.select_shipping_method_widget;
        SelectShippingMethodWidget selectShippingMethodWidget = (SelectShippingMethodWidget) C34328Lp6.m96312a(view, i);
        if (selectShippingMethodWidget != null) {
            return new ShippingMethodPageBinding((FrameLayout) view, selectShippingMethodWidget);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ShippingMethodPageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ShippingMethodPageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18606R.C18609layout.shipping_method_page, viewGroup, false);
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
