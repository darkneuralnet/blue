package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.stripe.android.stripe3ds2.C19336R;
import com.stripe.android.stripe3ds2.views.ThreeDS2Button;
import com.stripe.android.stripe3ds2.views.ThreeDS2HeaderTextView;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;
/* loaded from: classes7.dex */
public final class StripeChallengeZoneViewBinding implements InterfaceC34094Kp6 {
    public final FrameLayout czvEntryView;
    public final ThreeDS2HeaderTextView czvHeader;
    public final ThreeDS2TextView czvInfo;
    public final ThreeDS2Button czvResendButton;
    public final ThreeDS2Button czvSubmitButton;
    public final RadioButton czvWhitelistNoButton;
    public final RadioGroup czvWhitelistRadioGroup;
    public final RadioButton czvWhitelistYesButton;
    public final ThreeDS2TextView czvWhitelistingLabel;
    private final View rootView;

    private StripeChallengeZoneViewBinding(View view, FrameLayout frameLayout, ThreeDS2HeaderTextView threeDS2HeaderTextView, ThreeDS2TextView threeDS2TextView, ThreeDS2Button threeDS2Button, ThreeDS2Button threeDS2Button2, RadioButton radioButton, RadioGroup radioGroup, RadioButton radioButton2, ThreeDS2TextView threeDS2TextView2) {
        this.rootView = view;
        this.czvEntryView = frameLayout;
        this.czvHeader = threeDS2HeaderTextView;
        this.czvInfo = threeDS2TextView;
        this.czvResendButton = threeDS2Button;
        this.czvSubmitButton = threeDS2Button2;
        this.czvWhitelistNoButton = radioButton;
        this.czvWhitelistRadioGroup = radioGroup;
        this.czvWhitelistYesButton = radioButton2;
        this.czvWhitelistingLabel = threeDS2TextView2;
    }

    public static StripeChallengeZoneViewBinding bind(View view) {
        int i = C19336R.C19338id.czv_entry_view;
        FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
        if (frameLayout != null) {
            i = C19336R.C19338id.czv_header;
            ThreeDS2HeaderTextView threeDS2HeaderTextView = (ThreeDS2HeaderTextView) C34328Lp6.m96312a(view, i);
            if (threeDS2HeaderTextView != null) {
                i = C19336R.C19338id.czv_info;
                ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) C34328Lp6.m96312a(view, i);
                if (threeDS2TextView != null) {
                    i = C19336R.C19338id.czv_resend_button;
                    ThreeDS2Button threeDS2Button = (ThreeDS2Button) C34328Lp6.m96312a(view, i);
                    if (threeDS2Button != null) {
                        i = C19336R.C19338id.czv_submit_button;
                        ThreeDS2Button threeDS2Button2 = (ThreeDS2Button) C34328Lp6.m96312a(view, i);
                        if (threeDS2Button2 != null) {
                            i = C19336R.C19338id.czv_whitelist_no_button;
                            RadioButton radioButton = (RadioButton) C34328Lp6.m96312a(view, i);
                            if (radioButton != null) {
                                i = C19336R.C19338id.czv_whitelist_radio_group;
                                RadioGroup radioGroup = (RadioGroup) C34328Lp6.m96312a(view, i);
                                if (radioGroup != null) {
                                    i = C19336R.C19338id.czv_whitelist_yes_button;
                                    RadioButton radioButton2 = (RadioButton) C34328Lp6.m96312a(view, i);
                                    if (radioButton2 != null) {
                                        i = C19336R.C19338id.czv_whitelisting_label;
                                        ThreeDS2TextView threeDS2TextView2 = (ThreeDS2TextView) C34328Lp6.m96312a(view, i);
                                        if (threeDS2TextView2 != null) {
                                            return new StripeChallengeZoneViewBinding(view, frameLayout, threeDS2HeaderTextView, threeDS2TextView, threeDS2Button, threeDS2Button2, radioButton, radioGroup, radioButton2, threeDS2TextView2);
                                        }
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

    public static StripeChallengeZoneViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C19336R.C19339layout.stripe_challenge_zone_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.rootView;
    }
}
