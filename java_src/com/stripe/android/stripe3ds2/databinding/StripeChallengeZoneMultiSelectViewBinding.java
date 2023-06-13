package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.stripe.android.stripe3ds2.C19336R;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;
/* loaded from: classes7.dex */
public final class StripeChallengeZoneMultiSelectViewBinding implements InterfaceC34094Kp6 {
    public final ThreeDS2TextView label;
    private final LinearLayout rootView;
    public final LinearLayout selectGroup;

    private StripeChallengeZoneMultiSelectViewBinding(LinearLayout linearLayout, ThreeDS2TextView threeDS2TextView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.label = threeDS2TextView;
        this.selectGroup = linearLayout2;
    }

    public static StripeChallengeZoneMultiSelectViewBinding bind(View view) {
        int i = C19336R.C19338id.label;
        ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) C34328Lp6.m96312a(view, i);
        if (threeDS2TextView != null) {
            i = C19336R.C19338id.select_group;
            LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
            if (linearLayout != null) {
                return new StripeChallengeZoneMultiSelectViewBinding((LinearLayout) view, threeDS2TextView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeChallengeZoneMultiSelectViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeChallengeZoneMultiSelectViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19336R.C19339layout.stripe_challenge_zone_multi_select_view, viewGroup, false);
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
