package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.p003ui.platform.ComposeView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.paymentsheet.C19159R;
/* loaded from: classes7.dex */
public final class PrimaryButtonBinding implements InterfaceC34094Kp6 {
    public final ImageView confirmedIcon;
    public final CircularProgressIndicator confirmingIcon;
    public final ComposeView label;
    public final ImageView lockIcon;
    private final View rootView;

    private PrimaryButtonBinding(View view, ImageView imageView, CircularProgressIndicator circularProgressIndicator, ComposeView composeView, ImageView imageView2) {
        this.rootView = view;
        this.confirmedIcon = imageView;
        this.confirmingIcon = circularProgressIndicator;
        this.label = composeView;
        this.lockIcon = imageView2;
    }

    public static PrimaryButtonBinding bind(View view) {
        int i = C19159R.C19161id.confirmed_icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C19159R.C19161id.confirming_icon;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
            if (circularProgressIndicator != null) {
                i = C19159R.C19161id.label;
                ComposeView composeView = (ComposeView) C34328Lp6.m96312a(view, i);
                if (composeView != null) {
                    i = C19159R.C19161id.lock_icon;
                    ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView2 != null) {
                        return new PrimaryButtonBinding(view, imageView, circularProgressIndicator, composeView, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static PrimaryButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C19159R.C19162layout.primary_button, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.rootView;
    }
}
