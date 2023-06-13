package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class LoginMethodHandler implements Parcelable {

    /* renamed from: b */
    public Map<String, String> f69548b;

    /* renamed from: c */
    public LoginClient f69549c;

    public LoginMethodHandler(LoginClient loginClient) {
        this.f69549c = loginClient;
    }

    /* renamed from: c */
    public static AccessToken m52568c(Bundle bundle, EnumC3312I1 enumC3312I1, String str) {
        Date m2813t = C52364yi6.m2813t(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date m2813t2 = C52364yi6.m2813t(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if (C52364yi6.m2860R(string)) {
            return null;
        }
        return new AccessToken(string, str, bundle.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, null, null, enumC3312I1, m2813t, new Date(), m2813t2, bundle.getString("graph_domain"));
    }

    /* renamed from: d */
    public static AccessToken m52567d(Collection<String> collection, Bundle bundle, EnumC3312I1 enumC3312I1, String str) throws FacebookException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Date m2813t = C52364yi6.m2813t(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        Date m2813t2 = C52364yi6.m2813t(bundle, "data_access_expiration_time", new Date(0L));
        String string2 = bundle.getString("granted_scopes");
        if (!C52364yi6.m2860R(string2)) {
            arrayList = new ArrayList(Arrays.asList(string2.split(",")));
        } else {
            arrayList = collection;
        }
        String string3 = bundle.getString("denied_scopes");
        if (!C52364yi6.m2860R(string3)) {
            arrayList2 = new ArrayList(Arrays.asList(string3.split(",")));
        } else {
            arrayList2 = null;
        }
        String string4 = bundle.getString("expired_scopes");
        if (!C52364yi6.m2860R(string4)) {
            arrayList3 = new ArrayList(Arrays.asList(string4.split(",")));
        } else {
            arrayList3 = null;
        }
        if (C52364yi6.m2860R(string)) {
            return null;
        }
        return new AccessToken(string, str, m52565h(bundle.getString("signed_request")), arrayList, arrayList2, arrayList3, enumC3312I1, m2813t, new Date(), m2813t2, bundle.getString("graph_domain"));
    }

    /* renamed from: h */
    public static String m52565h(String str) throws FacebookException {
        if (str != null && !str.isEmpty()) {
            try {
                String[] split = str.split("\\.");
                if (split.length == 2) {
                    return new JSONObject(new String(Base64.decode(split[1], 0), Constants.DEFAULT_ENCODING)).getString("user_id");
                }
            } catch (UnsupportedEncodingException | JSONException unused) {
            }
            throw new FacebookException("Failed to retrieve user_id from signed_request");
        }
        throw new FacebookException("Authorization response does not contain the signed_request");
    }

    /* renamed from: a */
    public void m52569a(String str, Object obj) {
        String obj2;
        if (this.f69548b == null) {
            this.f69548b = new HashMap();
        }
        Map<String, String> map = this.f69548b;
        if (obj == null) {
            obj2 = null;
        } else {
            obj2 = obj.toString();
        }
        map.put(str, obj2);
    }

    /* renamed from: b */
    public void mo52547b() {
    }

    /* renamed from: e */
    public String m52566e(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", mo52546g());
            mo52563l(jSONObject);
        } catch (JSONException e) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    /* renamed from: g */
    public abstract String mo52546g();

    /* renamed from: i */
    public void m52564i(String str) {
        String m52598a = this.f69549c.m52607r().m52598a();
        C45485n62 c45485n62 = new C45485n62(this.f69549c.m52615j(), m52598a);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, m52598a);
        c45485n62.m24337i("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    /* renamed from: j */
    public boolean mo52545j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo52560k(int i, int i2, Intent intent) {
        return false;
    }

    /* renamed from: l */
    public void mo52563l(JSONObject jSONObject) throws JSONException {
    }

    /* renamed from: m */
    public void m52562m(LoginClient loginClient) {
        if (this.f69549c == null) {
            this.f69549c = loginClient;
            return;
        }
        throw new FacebookException("Can't set LoginClient if it is already set.");
    }

    /* renamed from: n */
    public boolean mo52561n() {
        return false;
    }

    /* renamed from: o */
    public abstract int mo52544o(LoginClient.Request request);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C52364yi6.m2800z0(parcel, this.f69548b);
    }

    public LoginMethodHandler(Parcel parcel) {
        this.f69548b = C52364yi6.m2832j0(parcel);
    }
}
