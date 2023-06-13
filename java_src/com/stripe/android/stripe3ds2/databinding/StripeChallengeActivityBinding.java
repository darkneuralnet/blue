package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentContainerView;
import com.stripe.android.stripe3ds2.C19336R;
/* loaded from: classes7.dex */
public final class StripeChallengeActivityBinding implements InterfaceC34094Kp6 {
    public final FragmentContainerView fragmentContainer;
    private final FrameLayout rootView;

    private StripeChallengeActivityBinding(FrameLayout frameLayout, FragmentContainerView fragmentContainerView) {
        this.rootView = frameLayout;
        this.fragmentContainer = fragmentContainerView;
    }

    public static StripeChallengeActivityBinding bind(View view) {
        int i = C19336R.C19338id.fragment_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) C34328Lp6.m96312a(view, i);
        if (fragmentContainerView != null) {
            return new StripeChallengeActivityBinding((FrameLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeChallengeActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeChallengeActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19336R.C19339layout.stripe_challenge_activity, viewGroup, false);
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
