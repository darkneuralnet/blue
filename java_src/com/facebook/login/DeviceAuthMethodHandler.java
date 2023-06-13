package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.login.LoginClient;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new C17242a();

    /* renamed from: d */
    public static ScheduledThreadPoolExecutor f69506d;

    /* renamed from: com.facebook.login.DeviceAuthMethodHandler$a */
    /* loaded from: classes5.dex */
    public static class C17242a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public DeviceAuthMethodHandler createFromParcel(Parcel parcel) {
            return new DeviceAuthMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public DeviceAuthMethodHandler[] newArray(int i) {
            return new DeviceAuthMethodHandler[i];
        }
    }

    public DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: q */
    public static synchronized ScheduledThreadPoolExecutor m52644q() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceAuthMethodHandler.class) {
            if (f69506d == null) {
                f69506d = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f69506d;
        }
        return scheduledThreadPoolExecutor;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: g */
    public String mo52546g() {
        return "device_auth";
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo52544o(LoginClient.Request request) {
        m52640u(request);
        return 1;
    }

    /* renamed from: p */
    public DeviceAuthDialog m52645p() {
        return new DeviceAuthDialog();
    }

    /* renamed from: r */
    public void m52643r() {
        this.f69549c.m52617h(LoginClient.Result.m52578a(this.f69549c.m52607r(), "User canceled log in."));
    }

    /* renamed from: s */
    public void m52642s(Exception exc) {
        this.f69549c.m52617h(LoginClient.Result.m52577b(this.f69549c.m52607r(), null, exc.getMessage()));
    }

    /* renamed from: t */
    public void m52641t(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, EnumC3312I1 enumC3312I1, Date date, Date date2, Date date3) {
        this.f69549c.m52617h(LoginClient.Result.m52575d(this.f69549c.m52607r(), new AccessToken(str, str2, str3, collection, collection2, collection3, enumC3312I1, date, date2, date3)));
    }

    /* renamed from: u */
    public final void m52640u(LoginClient.Request request) {
        FragmentActivity m52615j = this.f69549c.m52615j();
        if (m52615j != null && !m52615j.isFinishing()) {
            DeviceAuthDialog m52645p = m52645p();
            m52645p.show(m52615j.getSupportFragmentManager(), "login_with_facebook");
            m52645p.m52680Aa(request);
        }
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
