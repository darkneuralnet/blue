package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.LoginClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<FacebookLiteLoginMethodHandler> CREATOR = new C17243a();

    /* renamed from: com.facebook.login.FacebookLiteLoginMethodHandler$a */
    /* loaded from: classes5.dex */
    public static class C17243a implements Parcelable.Creator<FacebookLiteLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FacebookLiteLoginMethodHandler createFromParcel(Parcel parcel) {
            return new FacebookLiteLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public FacebookLiteLoginMethodHandler[] newArray(int i) {
            return new FacebookLiteLoginMethodHandler[i];
        }
    }

    public FacebookLiteLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: g */
    public String mo52546g() {
        return "fb_lite_login";
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo52544o(LoginClient.Request request) {
        String m52613l = LoginClient.m52613l();
        Intent m8478j = C50483vY2.m8478j(this.f69549c.m52615j(), request.m52598a(), request.m52590j(), m52613l, request.m52587m(), request.m52588l(), request.m52595d(), m52566e(request.m52597b()), request.m52596c(), request.m52591i(), request.m52589k());
        m52569a("e2e", m52613l);
        return m52555t(m8478j, LoginClient.m52608q()) ? 1 : 0;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public FacebookLiteLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
