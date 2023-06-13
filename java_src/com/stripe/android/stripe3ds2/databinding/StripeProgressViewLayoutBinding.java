package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.stripe3ds2.C19336R;
/* loaded from: classes7.dex */
public final class StripeProgressViewLayoutBinding implements InterfaceC34094Kp6 {
    public final ImageView brandLogo;
    public final CircularProgressIndicator progressBar;
    private final LinearLayout rootView;

    private StripeProgressViewLayoutBinding(LinearLayout linearLayout, ImageView imageView, CircularProgressIndicator circularProgressIndicator) {
        this.rootView = linearLayout;
        this.brandLogo = imageView;
        this.progressBar = circularProgressIndicator;
    }

    public static StripeProgressViewLayoutBinding bind(View view) {
        int i = C19336R.C19338id.brand_logo;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C19336R.C19338id.progress_bar;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
            if (circularProgressIndicator != null) {
                return new StripeProgressViewLayoutBinding((LinearLayout) view, imageView, circularProgressIndicator);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeProgressViewLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeProgressViewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19336R.C19339layout.stripe_progress_view_layout, viewGroup, false);
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
