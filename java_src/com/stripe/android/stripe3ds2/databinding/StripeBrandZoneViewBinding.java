package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.stripe.android.stripe3ds2.C19336R;
/* loaded from: classes7.dex */
public final class StripeBrandZoneViewBinding implements InterfaceC34094Kp6 {
    public final ImageView issuerImage;
    public final ImageView paymentSystemImage;
    private final View rootView;

    private StripeBrandZoneViewBinding(View view, ImageView imageView, ImageView imageView2) {
        this.rootView = view;
        this.issuerImage = imageView;
        this.paymentSystemImage = imageView2;
    }

    public static StripeBrandZoneViewBinding bind(View view) {
        int i = C19336R.C19338id.issuer_image;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C19336R.C19338id.payment_system_image;
            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView2 != null) {
                return new StripeBrandZoneViewBinding(view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeBrandZoneViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C19336R.C19339layout.stripe_brand_zone_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.rootView;
    }
}
