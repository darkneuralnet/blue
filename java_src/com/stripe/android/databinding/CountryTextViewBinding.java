package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.stripe.android.C18606R;
/* loaded from: classes6.dex */
public final class CountryTextViewBinding implements InterfaceC34094Kp6 {
    private final TextView rootView;

    private CountryTextViewBinding(TextView textView) {
        this.rootView = textView;
    }

    public static CountryTextViewBinding bind(View view) {
        if (view != null) {
            return new CountryTextViewBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static CountryTextViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CountryTextViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18606R.C18609layout.country_text_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    public TextView getRoot() {
        return this.rootView;
    }
}
