package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.stripe.android.C18606R;
/* loaded from: classes6.dex */
public final class ShippingMethodViewBinding implements InterfaceC34094Kp6 {
    public final TextView description;
    public final TextView name;
    public final TextView price;
    private final View rootView;
    public final AppCompatImageView selectedIcon;

    private ShippingMethodViewBinding(View view, TextView textView, TextView textView2, TextView textView3, AppCompatImageView appCompatImageView) {
        this.rootView = view;
        this.description = textView;
        this.name = textView2;
        this.price = textView3;
        this.selectedIcon = appCompatImageView;
    }

    public static ShippingMethodViewBinding bind(View view) {
        int i = C18606R.C18608id.description;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C18606R.C18608id.name;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C18606R.C18608id.price;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null) {
                    i = C18606R.C18608id.selected_icon;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C34328Lp6.m96312a(view, i);
                    if (appCompatImageView != null) {
                        return new ShippingMethodViewBinding(view, textView, textView2, textView3, appCompatImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ShippingMethodViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C18606R.C18609layout.shipping_method_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.rootView;
    }
}
