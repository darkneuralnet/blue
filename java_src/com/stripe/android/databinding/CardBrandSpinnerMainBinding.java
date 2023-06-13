package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.stripe.android.C18606R;
/* loaded from: classes6.dex */
public final class CardBrandSpinnerMainBinding implements InterfaceC34094Kp6 {
    public final AppCompatImageView image;
    private final AppCompatImageView rootView;

    private CardBrandSpinnerMainBinding(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.rootView = appCompatImageView;
        this.image = appCompatImageView2;
    }

    public static CardBrandSpinnerMainBinding bind(View view) {
        if (view != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view;
            return new CardBrandSpinnerMainBinding(appCompatImageView, appCompatImageView);
        }
        throw new NullPointerException("rootView");
    }

    public static CardBrandSpinnerMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CardBrandSpinnerMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18606R.C18609layout.card_brand_spinner_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    public AppCompatImageView getRoot() {
        return this.rootView;
    }
}
