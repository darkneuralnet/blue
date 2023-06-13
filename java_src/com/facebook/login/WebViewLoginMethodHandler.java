package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import p000.DialogC37226Xz6;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new C17255b();

    /* renamed from: e */
    public DialogC37226Xz6 f69551e;

    /* renamed from: f */
    public String f69552f;

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$a */
    /* loaded from: classes5.dex */
    public class C17254a implements DialogC37226Xz6.InterfaceC9582g {

        /* renamed from: a */
        public final /* synthetic */ LoginClient.Request f69553a;

        public C17254a(LoginClient.Request request) {
            this.f69553a = request;
        }

        @Override // p000.DialogC37226Xz6.InterfaceC9582g
        /* renamed from: a */
        public void mo28565a(Bundle bundle, FacebookException facebookException) {
            WebViewLoginMethodHandler.this.m52542x(this.f69553a, bundle, facebookException);
        }
    }

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$b */
    /* loaded from: classes5.dex */
    public static class C17255b implements Parcelable.Creator<WebViewLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            return new WebViewLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public WebViewLoginMethodHandler[] newArray(int i) {
            return new WebViewLoginMethodHandler[i];
        }
    }

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$c */
    /* loaded from: classes5.dex */
    public static class C17256c extends DialogC37226Xz6.C9580e {

        /* renamed from: h */
        public String f69555h;

        /* renamed from: i */
        public String f69556i;

        /* renamed from: j */
        public String f69557j;

        /* renamed from: k */
        public EnumC38273ay2 f69558k;

        public C17256c(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
            this.f69557j = "fbconnect://success";
            this.f69558k = EnumC38273ay2.NATIVE_WITH_FALLBACK;
        }

        @Override // p000.DialogC37226Xz6.C9580e
        /* renamed from: a */
        public DialogC37226Xz6 mo52539a() {
            Bundle m75895f = m75895f();
            m75895f.putString("redirect_uri", this.f69557j);
            m75895f.putString(AnalyticsRequestV2.PARAM_CLIENT_ID, m75898c());
            m75895f.putString("e2e", this.f69555h);
            m75895f.putString("response_type", "token,signed_request,graph_domain");
            m75895f.putString("return_scopes", "true");
            m75895f.putString("auth_type", this.f69556i);
            m75895f.putString("login_behavior", this.f69558k.name());
            return DialogC37226Xz6.m75907q(m75897d(), "oauth", m75895f, m75894g(), m75896e());
        }

        /* renamed from: i */
        public C17256c m52538i(String str) {
            this.f69556i = str;
            return this;
        }

        /* renamed from: j */
        public C17256c m52537j(String str) {
            this.f69555h = str;
            return this;
        }

        /* renamed from: k */
        public C17256c m52536k(boolean z) {
            String str;
            if (z) {
                str = "fbconnect://chrome_os_success";
            } else {
                str = "fbconnect://success";
            }
            this.f69557j = str;
            return this;
        }

        /* renamed from: l */
        public C17256c m52535l(EnumC38273ay2 enumC38273ay2) {
            this.f69558k = enumC38273ay2;
            return this;
        }
    }

    public WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: b */
    public void mo52547b() {
        DialogC37226Xz6 dialogC37226Xz6 = this.f69551e;
        if (dialogC37226Xz6 != null) {
            dialogC37226Xz6.cancel();
            this.f69551e = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: g */
    public String mo52546g() {
        return "web_view";
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: j */
    public boolean mo52545j() {
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo52544o(LoginClient.Request request) {
        Bundle m52553q = m52553q(request);
        C17254a c17254a = new C17254a(request);
        String m52613l = LoginClient.m52613l();
        this.f69552f = m52613l;
        m52569a("e2e", m52613l);
        FragmentActivity m52615j = this.f69549c.m52615j();
        this.f69551e = new C17256c(m52615j, request.m52598a(), m52553q).m52537j(this.f69552f).m52536k(C52364yi6.m2865M(m52615j)).m52538i(request.m52596c()).m52535l(request.m52592h()).m75893h(c17254a).mo52539a();
        C44069kj1 c44069kj1 = new C44069kj1();
        c44069kj1.setRetainInstance(true);
        c44069kj1.m28569B9(this.f69551e);
        c44069kj1.show(m52615j.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: t */
    public EnumC3312I1 mo52543t() {
        return EnumC3312I1.WEB_VIEW;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f69552f);
    }

    /* renamed from: x */
    public void m52542x(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        super.m52549v(request, bundle, facebookException);
    }

    public WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f69552f = parcel.readString();
    }
}
