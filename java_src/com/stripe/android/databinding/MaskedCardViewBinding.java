package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.stripe.android.C18606R;
/* loaded from: classes6.dex */
public final class MaskedCardViewBinding implements InterfaceC34094Kp6 {
    public final AppCompatImageView brandIcon;
    public final AppCompatImageView checkIcon;
    public final AppCompatTextView details;
    private final View rootView;

    private MaskedCardViewBinding(View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        this.rootView = view;
        this.brandIcon = appCompatImageView;
        this.checkIcon = appCompatImageView2;
        this.details = appCompatTextView;
    }

    public static MaskedCardViewBinding bind(View view) {
        int i = C18606R.C18608id.brand_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C34328Lp6.m96312a(view, i);
        if (appCompatImageView != null) {
            i = C18606R.C18608id.check_icon;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C34328Lp6.m96312a(view, i);
            if (appCompatImageView2 != null) {
                i = C18606R.C18608id.details;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C34328Lp6.m96312a(view, i);
                if (appCompatTextView != null) {
                    return new MaskedCardViewBinding(view, appCompatImageView, appCompatImageView2, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MaskedCardViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C18606R.C18609layout.masked_card_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.rootView;
    }
}
