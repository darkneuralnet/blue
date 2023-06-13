package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.stripe.android.stripe3ds2.C19336R;
import com.stripe.android.stripe3ds2.views.BrandZoneView;
import com.stripe.android.stripe3ds2.views.ChallengeZoneView;
import com.stripe.android.stripe3ds2.views.InformationZoneView;
/* loaded from: classes7.dex */
public final class StripeChallengeFragmentBinding implements InterfaceC34094Kp6 {
    public final BrandZoneView caBrandZone;
    public final ChallengeZoneView caChallengeZone;
    public final InformationZoneView caInformationZone;
    private final ScrollView rootView;

    private StripeChallengeFragmentBinding(ScrollView scrollView, BrandZoneView brandZoneView, ChallengeZoneView challengeZoneView, InformationZoneView informationZoneView) {
        this.rootView = scrollView;
        this.caBrandZone = brandZoneView;
        this.caChallengeZone = challengeZoneView;
        this.caInformationZone = informationZoneView;
    }

    public static StripeChallengeFragmentBinding bind(View view) {
        int i = C19336R.C19338id.ca_brand_zone;
        BrandZoneView brandZoneView = (BrandZoneView) C34328Lp6.m96312a(view, i);
        if (brandZoneView != null) {
            i = C19336R.C19338id.ca_challenge_zone;
            ChallengeZoneView challengeZoneView = (ChallengeZoneView) C34328Lp6.m96312a(view, i);
            if (challengeZoneView != null) {
                i = C19336R.C19338id.ca_information_zone;
                InformationZoneView informationZoneView = (InformationZoneView) C34328Lp6.m96312a(view, i);
                if (informationZoneView != null) {
                    return new StripeChallengeFragmentBinding((ScrollView) view, brandZoneView, challengeZoneView, informationZoneView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeChallengeFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeChallengeFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19336R.C19339layout.stripe_challenge_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    public ScrollView getRoot() {
        return this.rootView;
    }
}
