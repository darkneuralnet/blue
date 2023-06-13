package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.stripe.android.stripe3ds2.C19336R;
import com.stripe.android.stripe3ds2.views.ThreeDS2WebView;
/* loaded from: classes7.dex */
public final class StripeChallengeZoneWebViewBinding implements InterfaceC34094Kp6 {
    private final View rootView;
    public final ThreeDS2WebView webView;

    private StripeChallengeZoneWebViewBinding(View view, ThreeDS2WebView threeDS2WebView) {
        this.rootView = view;
        this.webView = threeDS2WebView;
    }

    public static StripeChallengeZoneWebViewBinding bind(View view) {
        int i = C19336R.C19338id.web_view;
        ThreeDS2WebView threeDS2WebView = (ThreeDS2WebView) C34328Lp6.m96312a(view, i);
        if (threeDS2WebView != null) {
            return new StripeChallengeZoneWebViewBinding(view, threeDS2WebView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeChallengeZoneWebViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C19336R.C19339layout.stripe_challenge_zone_web_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.rootView;
    }
}
