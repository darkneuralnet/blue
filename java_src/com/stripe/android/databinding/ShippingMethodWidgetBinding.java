package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.C18606R;
/* loaded from: classes6.dex */
public final class ShippingMethodWidgetBinding implements InterfaceC34094Kp6 {
    private final View rootView;
    public final RecyclerView shippingMethods;

    private ShippingMethodWidgetBinding(View view, RecyclerView recyclerView) {
        this.rootView = view;
        this.shippingMethods = recyclerView;
    }

    public static ShippingMethodWidgetBinding bind(View view) {
        int i = C18606R.C18608id.shipping_methods;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            return new ShippingMethodWidgetBinding(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ShippingMethodWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C18606R.C18609layout.shipping_method_widget, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.rootView;
    }
}
