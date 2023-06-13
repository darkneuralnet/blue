package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C17216a;
import com.facebook.login.LoginClient;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new C17247a();

    /* renamed from: com.facebook.login.KatanaProxyLoginMethodHandler$a */
    /* loaded from: classes5.dex */
    public static class C17247a implements Parcelable.Creator<KatanaProxyLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public KatanaProxyLoginMethodHandler[] newArray(int i) {
            return new KatanaProxyLoginMethodHandler[i];
        }
    }

    public KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: g */
    public String mo52546g() {
        return "katana_proxy_auth";
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: n */
    public boolean mo52561n() {
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo52544o(LoginClient.Request request) {
        boolean z;
        EnumC38273ay2 m52592h = request.m52592h();
        if (C17216a.f69442r && C49125tF0.m12565a() != null && m52592h.m65194a()) {
            z = true;
        } else {
            z = false;
        }
        String m52613l = LoginClient.m52613l();
        List<Intent> m8473o = C50483vY2.m8473o(this.f69549c.m52615j(), request.m52598a(), request.m52590j(), m52613l, request.m52587m(), request.m52588l(), request.m52595d(), m52566e(request.m52597b()), request.m52596c(), z, request.m52591i(), request.m52589k());
        m52569a("e2e", m52613l);
        for (int i = 0; i < m8473o.size(); i++) {
            if (m52555t(m8473o.get(i), LoginClient.m52608q())) {
                return i + 1;
            }
        }
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
