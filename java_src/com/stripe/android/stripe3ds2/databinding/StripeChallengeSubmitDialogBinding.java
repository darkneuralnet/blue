package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.stripe3ds2.C19336R;
/* loaded from: classes7.dex */
public final class StripeChallengeSubmitDialogBinding implements InterfaceC34094Kp6 {
    public final CircularProgressIndicator progressBar;
    private final FrameLayout rootView;

    private StripeChallengeSubmitDialogBinding(FrameLayout frameLayout, CircularProgressIndicator circularProgressIndicator) {
        this.rootView = frameLayout;
        this.progressBar = circularProgressIndicator;
    }

    public static StripeChallengeSubmitDialogBinding bind(View view) {
        int i = C19336R.C19338id.progress_bar;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
        if (circularProgressIndicator != null) {
            return new StripeChallengeSubmitDialogBinding((FrameLayout) view, circularProgressIndicator);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeChallengeSubmitDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeChallengeSubmitDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19336R.C19339layout.stripe_challenge_submit_dialog, viewGroup, false);
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
