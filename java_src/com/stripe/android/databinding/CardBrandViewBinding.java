package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.stripe.android.C18606R;
import com.stripe.android.view.CardWidgetProgressView;
/* loaded from: classes6.dex */
public final class CardBrandViewBinding implements InterfaceC34094Kp6 {
    public final ImageView icon;
    public final CardWidgetProgressView progress;
    private final View rootView;

    private CardBrandViewBinding(View view, ImageView imageView, CardWidgetProgressView cardWidgetProgressView) {
        this.rootView = view;
        this.icon = imageView;
        this.progress = cardWidgetProgressView;
    }

    public static CardBrandViewBinding bind(View view) {
        int i = C18606R.C18608id.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C18606R.C18608id.progress;
            CardWidgetProgressView cardWidgetProgressView = (CardWidgetProgressView) C34328Lp6.m96312a(view, i);
            if (cardWidgetProgressView != null) {
                return new CardBrandViewBinding(view, imageView, cardWidgetProgressView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static CardBrandViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C18606R.C18609layout.card_brand_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.rootView;
    }
}
