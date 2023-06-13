package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.stripe.android.C18606R;
import com.stripe.android.view.MaskedCardView;
/* loaded from: classes6.dex */
public final class MaskedCardRowBinding implements InterfaceC34094Kp6 {
    public final MaskedCardView maskedCardItem;
    private final FrameLayout rootView;

    private MaskedCardRowBinding(FrameLayout frameLayout, MaskedCardView maskedCardView) {
        this.rootView = frameLayout;
        this.maskedCardItem = maskedCardView;
    }

    public static MaskedCardRowBinding bind(View view) {
        int i = C18606R.C18608id.masked_card_item;
        MaskedCardView maskedCardView = (MaskedCardView) C34328Lp6.m96312a(view, i);
        if (maskedCardView != null) {
            return new MaskedCardRowBinding((FrameLayout) view, maskedCardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MaskedCardRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MaskedCardRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18606R.C18609layout.masked_card_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
