package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.C17216a;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.login.LoginClient;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new C17232a();

    /* renamed from: h */
    public static boolean f69470h = false;

    /* renamed from: e */
    public String f69471e;

    /* renamed from: f */
    public String f69472f;

    /* renamed from: g */
    public String f69473g;

    /* renamed from: com.facebook.login.CustomTabLoginMethodHandler$a */
    /* loaded from: classes5.dex */
    public static class C17232a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CustomTabLoginMethodHandler createFromParcel(Parcel parcel) {
            return new CustomTabLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CustomTabLoginMethodHandler[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
        }
    }

    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f69473g = "";
        this.f69472f = C52364yi6.m2821p(20);
        f69470h = false;
        this.f69473g = C49125tF0.m12563c(m52685y());
    }

    /* renamed from: A */
    public final boolean m52687A(Bundle bundle) {
        try {
            String string = bundle.getString(TransferTable.COLUMN_STATE);
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.f69472f);
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: g */
    public String mo52546g() {
        return "custom_tab";
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: k */
    public boolean mo52560k(int i, int i2, Intent intent) {
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f69335i, false)) {
            return super.mo52560k(i, i2, intent);
        }
        if (i != 1) {
            return super.mo52560k(i, i2, intent);
        }
        LoginClient.Request m52607r = this.f69549c.m52607r();
        if (i2 == -1) {
            m52684z(intent.getStringExtra(CustomTabMainActivity.f69333g), m52607r);
            return true;
        }
        super.m52549v(m52607r, null, new FacebookOperationCanceledException());
        return false;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: l */
    public void mo52563l(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f69472f);
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: n */
    public /* bridge */ /* synthetic */ boolean mo52561n() {
        return super.mo52561n();
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo52544o(LoginClient.Request request) {
        if (mo52552r().isEmpty()) {
            return 0;
        }
        Bundle m52554p = m52554p(m52553q(request), request);
        if (f69470h) {
            m52554p.putString("cct_over_app_switch", "1");
        }
        if (C17216a.f69441q) {
            C48532sF0.m14497b(C47347qF0.m17737a("oauth", m52554p));
        }
        Intent intent = new Intent(this.f69549c.m52615j(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f69330d, "oauth");
        intent.putExtra(CustomTabMainActivity.f69331e, m52554p);
        intent.putExtra(CustomTabMainActivity.f69332f, m52686x());
        this.f69549c.m52612m().startActivityForResult(intent, 1);
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: r */
    public String mo52552r() {
        return this.f69473g;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: s */
    public String mo52551s() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: t */
    public EnumC3312I1 mo52543t() {
        return EnumC3312I1.CHROME_CUSTOM_TAB;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f69472f);
    }

    /* renamed from: x */
    public final String m52686x() {
        String str = this.f69471e;
        if (str != null) {
            return str;
        }
        String m12565a = C49125tF0.m12565a();
        this.f69471e = m12565a;
        return m12565a;
    }

    /* renamed from: y */
    public final String m52685y() {
        return super.mo52552r();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m52684z(String str, LoginClient.Request request) {
        int parseInt;
        if (str != null) {
            if (str.startsWith("fbconnect://cct.") || str.startsWith(super.mo52552r())) {
                Uri parse = Uri.parse(str);
                Bundle m2842e0 = C52364yi6.m2842e0(parse.getQuery());
                m2842e0.putAll(C52364yi6.m2842e0(parse.getFragment()));
                if (!m52687A(m2842e0)) {
                    super.m52549v(request, null, new FacebookException("Invalid state parameter"));
                    return;
                }
                String string = m2842e0.getString("error");
                if (string == null) {
                    string = m2842e0.getString("error_type");
                }
                String string2 = m2842e0.getString("error_msg");
                if (string2 == null) {
                    string2 = m2842e0.getString("error_message");
                }
                if (string2 == null) {
                    string2 = m2842e0.getString("error_description");
                }
                String string3 = m2842e0.getString("error_code");
                if (!C52364yi6.m2860R(string3)) {
                    try {
                        parseInt = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                    }
                    if (!C52364yi6.m2860R(string) && C52364yi6.m2860R(string2) && parseInt == -1) {
                        super.m52549v(request, m2842e0, null);
                        return;
                    } else if (string == null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) {
                        super.m52549v(request, null, new FacebookOperationCanceledException());
                        return;
                    } else if (parseInt != 4201) {
                        super.m52549v(request, null, new FacebookOperationCanceledException());
                        return;
                    } else {
                        super.m52549v(request, null, new FacebookServiceException(new FacebookRequestError(parseInt, string, string2), string2));
                        return;
                    }
                }
                parseInt = -1;
                if (!C52364yi6.m2860R(string)) {
                }
                if (string == null) {
                }
                if (parseInt != 4201) {
                }
            }
        }
    }

    public CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f69473g = "";
        this.f69472f = parcel.readString();
    }
}
