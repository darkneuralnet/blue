package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractServiceConnectionC39184cW3;
import p000.C52364yi6;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new C17246c();

    /* renamed from: d */
    public C44949mC1 f69507d;

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$a */
    /* loaded from: classes5.dex */
    public class C17244a implements AbstractServiceConnectionC39184cW3.InterfaceC13588b {

        /* renamed from: a */
        public final /* synthetic */ LoginClient.Request f69508a;

        public C17244a(LoginClient.Request request) {
            this.f69508a = request;
        }

        @Override // p000.AbstractServiceConnectionC39184cW3.InterfaceC13588b
        /* renamed from: a */
        public void mo52310a(Bundle bundle) {
            GetTokenLoginMethodHandler.this.m52634q(this.f69508a, bundle);
        }
    }

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$b */
    /* loaded from: classes5.dex */
    public class C17245b implements C52364yi6.InterfaceC30682a {

        /* renamed from: a */
        public final /* synthetic */ Bundle f69510a;

        /* renamed from: b */
        public final /* synthetic */ LoginClient.Request f69511b;

        public C17245b(Bundle bundle, LoginClient.Request request) {
            this.f69510a = bundle;
            this.f69511b = request;
        }

        @Override // p000.C52364yi6.InterfaceC30682a
        /* renamed from: a */
        public void mo2799a(JSONObject jSONObject) {
            try {
                this.f69510a.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
                GetTokenLoginMethodHandler.this.m52633r(this.f69511b, this.f69510a);
            } catch (JSONException e) {
                LoginClient loginClient = GetTokenLoginMethodHandler.this.f69549c;
                loginClient.m52618g(LoginClient.Result.m52577b(loginClient.m52607r(), "Caught exception", e.getMessage()));
            }
        }

        @Override // p000.C52364yi6.InterfaceC30682a
        /* renamed from: b */
        public void mo2798b(FacebookException facebookException) {
            LoginClient loginClient = GetTokenLoginMethodHandler.this.f69549c;
            loginClient.m52618g(LoginClient.Result.m52577b(loginClient.m52607r(), "Caught exception", facebookException.getMessage()));
        }
    }

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$c */
    /* loaded from: classes5.dex */
    public static class C17246c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public GetTokenLoginMethodHandler createFromParcel(Parcel parcel) {
            return new GetTokenLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public GetTokenLoginMethodHandler[] newArray(int i) {
            return new GetTokenLoginMethodHandler[i];
        }
    }

    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: b */
    public void mo52547b() {
        C44949mC1 c44949mC1 = this.f69507d;
        if (c44949mC1 != null) {
            c44949mC1.m61259b();
            this.f69507d.m61256f(null);
            this.f69507d = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: g */
    public String mo52546g() {
        return "get_token";
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo52544o(LoginClient.Request request) {
        C44949mC1 c44949mC1 = new C44949mC1(this.f69549c.m52615j(), request.m52598a());
        this.f69507d = c44949mC1;
        if (!c44949mC1.m61255g()) {
            return 0;
        }
        this.f69549c.m52604u();
        this.f69507d.m61256f(new C17244a(request));
        return 1;
    }

    /* renamed from: p */
    public void m52635p(LoginClient.Request request, Bundle bundle) {
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string != null && !string.isEmpty()) {
            m52633r(request, bundle);
            return;
        }
        this.f69549c.m52604u();
        C52364yi6.m2803y(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new C17245b(bundle, request));
    }

    /* renamed from: q */
    public void m52634q(LoginClient.Request request, Bundle bundle) {
        C44949mC1 c44949mC1 = this.f69507d;
        if (c44949mC1 != null) {
            c44949mC1.m61256f(null);
        }
        this.f69507d = null;
        this.f69549c.m52603v();
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> m52590j = request.m52590j();
            if (stringArrayList != null && (m52590j == null || stringArrayList.containsAll(m52590j))) {
                m52635p(request, bundle);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : m52590j) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                m52569a("new_permissions", TextUtils.join(",", hashSet));
            }
            request.m52583q(hashSet);
        }
        this.f69549c.m52625D();
    }

    /* renamed from: r */
    public void m52633r(LoginClient.Request request, Bundle bundle) {
        this.f69549c.m52617h(LoginClient.Result.m52575d(this.f69549c.m52607r(), LoginMethodHandler.m52568c(bundle, EnumC3312I1.FACEBOOK_APPLICATION_SERVICE, request.m52598a())));
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
