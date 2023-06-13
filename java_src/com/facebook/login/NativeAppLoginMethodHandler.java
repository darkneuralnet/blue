package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: k */
    public boolean mo52560k(int i, int i2, Intent intent) {
        LoginClient.Result m52556s;
        LoginClient.Request m52607r = this.f69549c.m52607r();
        if (intent == null) {
            m52556s = LoginClient.Result.m52578a(m52607r, "Operation canceled");
        } else if (i2 == 0) {
            m52556s = m52557r(m52607r, intent);
        } else if (i2 != -1) {
            m52556s = LoginClient.Result.m52577b(m52607r, "Unexpected resultCode from authorization.", null);
        } else {
            m52556s = m52556s(m52607r, intent);
        }
        if (m52556s != null) {
            this.f69549c.m52617h(m52556s);
            return true;
        }
        this.f69549c.m52625D();
        return true;
    }

    /* renamed from: p */
    public final String m52559p(Bundle bundle) {
        String string = bundle.getString("error");
        if (string == null) {
            return bundle.getString("error_type");
        }
        return string;
    }

    /* renamed from: q */
    public final String m52558q(Bundle bundle) {
        String string = bundle.getString("error_message");
        if (string == null) {
            return bundle.getString("error_description");
        }
        return string;
    }

    /* renamed from: r */
    public final LoginClient.Result m52557r(LoginClient.Request request, Intent intent) {
        String str;
        Bundle extras = intent.getExtras();
        String m52559p = m52559p(extras);
        if (extras.get("error_code") != null) {
            str = extras.get("error_code").toString();
        } else {
            str = null;
        }
        if (C53066zt5.m162c().equals(str)) {
            return LoginClient.Result.m52576c(request, m52559p, m52558q(extras), str);
        }
        return LoginClient.Result.m52578a(request, m52559p);
    }

    /* renamed from: s */
    public final LoginClient.Result m52556s(LoginClient.Request request, Intent intent) {
        String str;
        Bundle extras = intent.getExtras();
        String m52559p = m52559p(extras);
        if (extras.get("error_code") != null) {
            str = extras.get("error_code").toString();
        } else {
            str = null;
        }
        String m52558q = m52558q(extras);
        String string = extras.getString("e2e");
        if (!C52364yi6.m2860R(string)) {
            m52564i(string);
        }
        if (m52559p == null && str == null && m52558q == null) {
            try {
                return LoginClient.Result.m52575d(request, LoginMethodHandler.m52567d(request.m52590j(), extras, EnumC3312I1.FACEBOOK_APPLICATION_WEB, request.m52598a()));
            } catch (FacebookException e) {
                return LoginClient.Result.m52577b(request, null, e.getMessage());
            }
        } else if (m52559p.equals("logged_out")) {
            CustomTabLoginMethodHandler.f69470h = true;
            return null;
        } else if (C53066zt5.m161d().contains(m52559p)) {
            return null;
        } else {
            if (C53066zt5.m160e().contains(m52559p)) {
                return LoginClient.Result.m52578a(request, null);
            }
            return LoginClient.Result.m52576c(request, m52559p, m52558q, str);
        }
    }

    /* renamed from: t */
    public boolean m52555t(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            this.f69549c.m52612m().startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
