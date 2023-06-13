package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.stripe.android.stripe3ds2.C19336R;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;
/* loaded from: classes7.dex */
public final class StripeInformationZoneViewBinding implements InterfaceC34094Kp6 {
    public final AppCompatImageView expandArrow;
    public final LinearLayout expandContainer;
    public final ThreeDS2TextView expandLabel;
    public final ThreeDS2TextView expandText;
    private final LinearLayout rootView;
    public final AppCompatImageView whyArrow;
    public final LinearLayout whyContainer;
    public final ThreeDS2TextView whyLabel;
    public final ThreeDS2TextView whyText;

    private StripeInformationZoneViewBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout2, ThreeDS2TextView threeDS2TextView, ThreeDS2TextView threeDS2TextView2, AppCompatImageView appCompatImageView2, LinearLayout linearLayout3, ThreeDS2TextView threeDS2TextView3, ThreeDS2TextView threeDS2TextView4) {
        this.rootView = linearLayout;
        this.expandArrow = appCompatImageView;
        this.expandContainer = linearLayout2;
        this.expandLabel = threeDS2TextView;
        this.expandText = threeDS2TextView2;
        this.whyArrow = appCompatImageView2;
        this.whyContainer = linearLayout3;
        this.whyLabel = threeDS2TextView3;
        this.whyText = threeDS2TextView4;
    }

    public static StripeInformationZoneViewBinding bind(View view) {
        int i = C19336R.C19338id.expand_arrow;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C34328Lp6.m96312a(view, i);
        if (appCompatImageView != null) {
            i = C19336R.C19338id.expand_container;
            LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
            if (linearLayout != null) {
                i = C19336R.C19338id.expand_label;
                ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) C34328Lp6.m96312a(view, i);
                if (threeDS2TextView != null) {
                    i = C19336R.C19338id.expand_text;
                    ThreeDS2TextView threeDS2TextView2 = (ThreeDS2TextView) C34328Lp6.m96312a(view, i);
                    if (threeDS2TextView2 != null) {
                        i = C19336R.C19338id.why_arrow;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) C34328Lp6.m96312a(view, i);
                        if (appCompatImageView2 != null) {
                            i = C19336R.C19338id.why_container;
                            LinearLayout linearLayout2 = (LinearLayout) C34328Lp6.m96312a(view, i);
                            if (linearLayout2 != null) {
                                i = C19336R.C19338id.why_label;
                                ThreeDS2TextView threeDS2TextView3 = (ThreeDS2TextView) C34328Lp6.m96312a(view, i);
                                if (threeDS2TextView3 != null) {
                                    i = C19336R.C19338id.why_text;
                                    ThreeDS2TextView threeDS2TextView4 = (ThreeDS2TextView) C34328Lp6.m96312a(view, i);
                                    if (threeDS2TextView4 != null) {
                                        return new StripeInformationZoneViewBinding((LinearLayout) view, appCompatImageView, linearLayout, threeDS2TextView, threeDS2TextView2, appCompatImageView2, linearLayout2, threeDS2TextView3, threeDS2TextView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeInformationZoneViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeInformationZoneViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19336R.C19339layout.stripe_information_zone_view, viewGroup, false);
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
