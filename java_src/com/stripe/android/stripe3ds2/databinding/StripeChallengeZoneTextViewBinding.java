package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.stripe3ds2.C19336R;
/* loaded from: classes7.dex */
public final class StripeChallengeZoneTextViewBinding implements InterfaceC34094Kp6 {
    public final TextInputLayout label;
    private final TextInputLayout rootView;
    public final TextInputEditText textEntry;

    private StripeChallengeZoneTextViewBinding(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputEditText textInputEditText) {
        this.rootView = textInputLayout;
        this.label = textInputLayout2;
        this.textEntry = textInputEditText;
    }

    public static StripeChallengeZoneTextViewBinding bind(View view) {
        TextInputLayout textInputLayout = (TextInputLayout) view;
        int i = C19336R.C19338id.text_entry;
        TextInputEditText textInputEditText = (TextInputEditText) C34328Lp6.m96312a(view, i);
        if (textInputEditText != null) {
            return new StripeChallengeZoneTextViewBinding(textInputLayout, textInputLayout, textInputEditText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeChallengeZoneTextViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeChallengeZoneTextViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19336R.C19339layout.stripe_challenge_zone_text_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    public TextInputLayout getRoot() {
        return this.rootView;
    }
}
