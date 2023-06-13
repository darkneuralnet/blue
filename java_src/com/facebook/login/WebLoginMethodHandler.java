package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import ch.qos.logback.core.joran.action.Action;
import com.adyen.checkout.components.model.payments.response.SdkAction;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.AccessToken;
import com.facebook.C17216a;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.login.LoginClient;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: d */
    public String f69550d;

    public WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: p */
    public Bundle m52554p(Bundle bundle, LoginClient.Request request) {
        String str;
        bundle.putString("redirect_uri", mo52552r());
        bundle.putString(AnalyticsRequestV2.PARAM_CLIENT_ID, request.m52598a());
        bundle.putString("e2e", LoginClient.m52613l());
        bundle.putString("response_type", "token,signed_request,graph_domain");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", request.m52596c());
        bundle.putString("login_behavior", request.m52592h().name());
        bundle.putString(SdkAction.ACTION_TYPE, String.format(Locale.ROOT, "android-%s", C17216a.m52725u()));
        if (mo52551s() != null) {
            bundle.putString("sso", mo52551s());
        }
        if (C17216a.f69441q) {
            str = "1";
        } else {
            str = "0";
        }
        bundle.putString("cct_prefetching", str);
        return bundle;
    }

    /* renamed from: q */
    public Bundle m52553q(LoginClient.Request request) {
        String str;
        Bundle bundle = new Bundle();
        if (!C52364yi6.m2859S(request.m52590j())) {
            String join = TextUtils.join(",", request.m52590j());
            bundle.putString(Action.SCOPE_ATTRIBUTE, join);
            m52569a(Action.SCOPE_ATTRIBUTE, join);
        }
        bundle.putString("default_audience", request.m52595d().m15837a());
        bundle.putString(TransferTable.COLUMN_STATE, m52566e(request.m52597b()));
        AccessToken m52920c = AccessToken.m52920c();
        if (m52920c != null) {
            str = m52920c.m52911m();
        } else {
            str = null;
        }
        String str2 = "1";
        if (str != null && str.equals(m52550u())) {
            bundle.putString("access_token", str);
            m52569a("access_token", "1");
        } else {
            C52364yi6.m2841f(this.f69549c.m52615j());
            m52569a("access_token", "0");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        if (!C17216a.m52736j()) {
            str2 = "0";
        }
        bundle.putString("ies", str2);
        return bundle;
    }

    /* renamed from: r */
    public String mo52552r() {
        return "fb" + C17216a.m52740f() + "://authorize";
    }

    /* renamed from: s */
    public String mo52551s() {
        return null;
    }

    /* renamed from: t */
    public abstract EnumC3312I1 mo52543t();

    /* renamed from: u */
    public final String m52550u() {
        return this.f69549c.m52615j().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    /* renamed from: v */
    public void m52549v(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        String str;
        LoginClient.Result m52576c;
        this.f69550d = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f69550d = bundle.getString("e2e");
            }
            try {
                AccessToken m52567d = LoginMethodHandler.m52567d(request.m52590j(), bundle, mo52543t(), request.m52598a());
                m52576c = LoginClient.Result.m52575d(this.f69549c.m52607r(), m52567d);
                CookieSyncManager.createInstance(this.f69549c.m52615j()).sync();
                m52548w(m52567d.m52911m());
            } catch (FacebookException e) {
                m52576c = LoginClient.Result.m52577b(this.f69549c.m52607r(), null, e.getMessage());
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            m52576c = LoginClient.Result.m52578a(this.f69549c.m52607r(), "User canceled log in.");
        } else {
            this.f69550d = null;
            String message = facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError m52853a = ((FacebookServiceException) facebookException).m52853a();
                str = String.format(Locale.ROOT, "%d", Integer.valueOf(m52853a.m52866b()));
                message = m52853a.toString();
            } else {
                str = null;
            }
            m52576c = LoginClient.Result.m52576c(this.f69549c.m52607r(), null, message, str);
        }
        if (!C52364yi6.m2860R(this.f69550d)) {
            m52564i(this.f69550d);
        }
        this.f69549c.m52617h(m52576c);
    }

    /* renamed from: w */
    public final void m52548w(String str) {
        this.f69549c.m52615j().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    public WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
