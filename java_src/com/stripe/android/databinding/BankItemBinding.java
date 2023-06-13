package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.stripe.android.C18606R;
/* loaded from: classes6.dex */
public final class BankItemBinding implements InterfaceC34094Kp6 {
    public final AppCompatImageView checkIcon;
    public final AppCompatImageView icon;
    public final AppCompatTextView name;
    private final LinearLayout rootView;

    private BankItemBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.checkIcon = appCompatImageView;
        this.icon = appCompatImageView2;
        this.name = appCompatTextView;
    }

    public static BankItemBinding bind(View view) {
        int i = C18606R.C18608id.check_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C34328Lp6.m96312a(view, i);
        if (appCompatImageView != null) {
            i = C18606R.C18608id.icon;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C34328Lp6.m96312a(view, i);
            if (appCompatImageView2 != null) {
                i = C18606R.C18608id.name;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C34328Lp6.m96312a(view, i);
                if (appCompatTextView != null) {
                    return new BankItemBinding((LinearLayout) view, appCompatImageView, appCompatImageView2, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static BankItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BankItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18606R.C18609layout.bank_item, viewGroup, false);
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
