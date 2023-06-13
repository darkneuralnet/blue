package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.stripe.android.C18606R;
/* loaded from: classes6.dex */
public final class CardWidgetProgressViewBinding implements InterfaceC34094Kp6 {
    public final ProgressBar cardLoading;
    private final View rootView;

    private CardWidgetProgressViewBinding(View view, ProgressBar progressBar) {
        this.rootView = view;
        this.cardLoading = progressBar;
    }

    public static CardWidgetProgressViewBinding bind(View view) {
        int i = C18606R.C18608id.card_loading;
        ProgressBar progressBar = (ProgressBar) C34328Lp6.m96312a(view, i);
        if (progressBar != null) {
            return new CardWidgetProgressViewBinding(view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static CardWidgetProgressViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C18606R.C18609layout.card_widget_progress_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.rootView;
    }
}
