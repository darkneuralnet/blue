package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p000.M80;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new C17251a();

    /* renamed from: b */
    public LoginMethodHandler[] f69513b;

    /* renamed from: c */
    public int f69514c;

    /* renamed from: d */
    public Fragment f69515d;

    /* renamed from: e */
    public InterfaceC17253c f69516e;

    /* renamed from: f */
    public InterfaceC17252b f69517f;

    /* renamed from: g */
    public boolean f69518g;

    /* renamed from: h */
    public Request f69519h;

    /* renamed from: i */
    public Map<String, String> f69520i;

    /* renamed from: j */
    public Map<String, String> f69521j;

    /* renamed from: k */
    public C17261c f69522k;

    /* renamed from: l */
    public int f69523l;

    /* renamed from: m */
    public int f69524m;

    /* loaded from: classes5.dex */
    public static class Request implements Parcelable {
        public static final Parcelable.Creator<Request> CREATOR = new C17248a();

        /* renamed from: b */
        public final EnumC38273ay2 f69525b;

        /* renamed from: c */
        public Set<String> f69526c;

        /* renamed from: d */
        public final EnumC48093rW0 f69527d;

        /* renamed from: e */
        public final String f69528e;

        /* renamed from: f */
        public final String f69529f;

        /* renamed from: g */
        public boolean f69530g;

        /* renamed from: h */
        public String f69531h;

        /* renamed from: i */
        public String f69532i;

        /* renamed from: j */
        public String f69533j;

        /* renamed from: k */
        public String f69534k;

        /* renamed from: l */
        public boolean f69535l;

        /* renamed from: com.facebook.login.LoginClient$Request$a */
        /* loaded from: classes5.dex */
        public static class C17248a implements Parcelable.Creator<Request> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public Request createFromParcel(Parcel parcel) {
                return new Request(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public Request[] newArray(int i) {
                return new Request[i];
            }
        }

        public /* synthetic */ Request(Parcel parcel, C17251a c17251a) {
            this(parcel);
        }

        /* renamed from: a */
        public String m52598a() {
            return this.f69528e;
        }

        /* renamed from: b */
        public String m52597b() {
            return this.f69529f;
        }

        /* renamed from: c */
        public String m52596c() {
            return this.f69532i;
        }

        /* renamed from: d */
        public EnumC48093rW0 m52595d() {
            return this.f69527d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public String m52594e() {
            return this.f69533j;
        }

        /* renamed from: g */
        public String m52593g() {
            return this.f69531h;
        }

        /* renamed from: h */
        public EnumC38273ay2 m52592h() {
            return this.f69525b;
        }

        /* renamed from: i */
        public String m52591i() {
            return this.f69534k;
        }

        /* renamed from: j */
        public Set<String> m52590j() {
            return this.f69526c;
        }

        /* renamed from: k */
        public boolean m52589k() {
            return this.f69535l;
        }

        /* renamed from: l */
        public boolean m52588l() {
            for (String str : this.f69526c) {
                if (C17263d.m52506e(str)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: m */
        public boolean m52587m() {
            return this.f69530g;
        }

        /* renamed from: n */
        public void m52586n(String str) {
            this.f69533j = str;
        }

        /* renamed from: o */
        public void m52585o(String str) {
            this.f69531h = str;
        }

        /* renamed from: p */
        public void m52584p(String str) {
            this.f69534k = str;
        }

        /* renamed from: q */
        public void m52583q(Set<String> set) {
            C48817sj6.m13765m(set, "permissions");
            this.f69526c = set;
        }

        /* renamed from: r */
        public void m52582r(boolean z) {
            this.f69530g = z;
        }

        /* renamed from: s */
        public void m52581s(boolean z) {
            this.f69535l = z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            String str;
            EnumC38273ay2 enumC38273ay2 = this.f69525b;
            String str2 = null;
            if (enumC38273ay2 != null) {
                str = enumC38273ay2.name();
            } else {
                str = null;
            }
            parcel.writeString(str);
            parcel.writeStringList(new ArrayList(this.f69526c));
            EnumC48093rW0 enumC48093rW0 = this.f69527d;
            if (enumC48093rW0 != null) {
                str2 = enumC48093rW0.name();
            }
            parcel.writeString(str2);
            parcel.writeString(this.f69528e);
            parcel.writeString(this.f69529f);
            parcel.writeByte(this.f69530g ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f69531h);
            parcel.writeString(this.f69532i);
            parcel.writeString(this.f69533j);
            parcel.writeString(this.f69534k);
            parcel.writeByte(this.f69535l ? (byte) 1 : (byte) 0);
        }

        public Request(EnumC38273ay2 enumC38273ay2, Set<String> set, EnumC48093rW0 enumC48093rW0, String str, String str2, String str3) {
            this.f69530g = false;
            this.f69525b = enumC38273ay2;
            this.f69526c = set == null ? new HashSet<>() : set;
            this.f69527d = enumC48093rW0;
            this.f69532i = str;
            this.f69528e = str2;
            this.f69529f = str3;
        }

        public Request(Parcel parcel) {
            this.f69530g = false;
            String readString = parcel.readString();
            this.f69525b = readString != null ? EnumC38273ay2.valueOf(readString) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f69526c = new HashSet(arrayList);
            String readString2 = parcel.readString();
            this.f69527d = readString2 != null ? EnumC48093rW0.valueOf(readString2) : null;
            this.f69528e = parcel.readString();
            this.f69529f = parcel.readString();
            this.f69530g = parcel.readByte() != 0;
            this.f69531h = parcel.readString();
            this.f69532i = parcel.readString();
            this.f69533j = parcel.readString();
            this.f69534k = parcel.readString();
            this.f69535l = parcel.readByte() != 0;
        }
    }

    /* loaded from: classes5.dex */
    public static class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new C17249a();

        /* renamed from: b */
        public final EnumC17250b f69536b;

        /* renamed from: c */
        public final AccessToken f69537c;

        /* renamed from: d */
        public final String f69538d;

        /* renamed from: e */
        public final String f69539e;

        /* renamed from: f */
        public final Request f69540f;

        /* renamed from: g */
        public Map<String, String> f69541g;

        /* renamed from: h */
        public Map<String, String> f69542h;

        /* renamed from: com.facebook.login.LoginClient$Result$a */
        /* loaded from: classes5.dex */
        public static class C17249a implements Parcelable.Creator<Result> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public Result createFromParcel(Parcel parcel) {
                return new Result(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public Result[] newArray(int i) {
                return new Result[i];
            }
        }

        /* renamed from: com.facebook.login.LoginClient$Result$b */
        /* loaded from: classes5.dex */
        public enum EnumC17250b {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            

            /* renamed from: b */
            public final String f69547b;

            EnumC17250b(String str) {
                this.f69547b = str;
            }

            /* renamed from: a */
            public String m52572a() {
                return this.f69547b;
            }
        }

        public /* synthetic */ Result(Parcel parcel, C17251a c17251a) {
            this(parcel);
        }

        /* renamed from: a */
        public static Result m52578a(Request request, String str) {
            return new Result(request, EnumC17250b.CANCEL, null, str, null);
        }

        /* renamed from: b */
        public static Result m52577b(Request request, String str, String str2) {
            return m52576c(request, str, str2, null);
        }

        /* renamed from: c */
        public static Result m52576c(Request request, String str, String str2, String str3) {
            return new Result(request, EnumC17250b.ERROR, null, TextUtils.join(": ", C52364yi6.m2849b(str, str2)), str3);
        }

        /* renamed from: d */
        public static Result m52575d(Request request, AccessToken accessToken) {
            return new Result(request, EnumC17250b.SUCCESS, accessToken, null, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f69536b.name());
            parcel.writeParcelable(this.f69537c, i);
            parcel.writeString(this.f69538d);
            parcel.writeString(this.f69539e);
            parcel.writeParcelable(this.f69540f, i);
            C52364yi6.m2800z0(parcel, this.f69541g);
            C52364yi6.m2800z0(parcel, this.f69542h);
        }

        public Result(Request request, EnumC17250b enumC17250b, AccessToken accessToken, String str, String str2) {
            C48817sj6.m13765m(enumC17250b, PaymentMethodOptionsParams.Blik.PARAM_CODE);
            this.f69540f = request;
            this.f69537c = accessToken;
            this.f69538d = str;
            this.f69536b = enumC17250b;
            this.f69539e = str2;
        }

        public Result(Parcel parcel) {
            this.f69536b = EnumC17250b.valueOf(parcel.readString());
            this.f69537c = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f69538d = parcel.readString();
            this.f69539e = parcel.readString();
            this.f69540f = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f69541g = C52364yi6.m2832j0(parcel);
            this.f69542h = C52364yi6.m2832j0(parcel);
        }
    }

    /* renamed from: com.facebook.login.LoginClient$a */
    /* loaded from: classes5.dex */
    public static class C17251a implements Parcelable.Creator<LoginClient> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public LoginClient createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public LoginClient[] newArray(int i) {
            return new LoginClient[i];
        }
    }

    /* renamed from: com.facebook.login.LoginClient$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC17252b {
        /* renamed from: a */
        void mo52523a();

        /* renamed from: b */
        void mo52522b();
    }

    /* renamed from: com.facebook.login.LoginClient$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC17253c {
        /* renamed from: a */
        void mo52524a(Result result);
    }

    public LoginClient(Fragment fragment) {
        this.f69514c = -1;
        this.f69523l = 0;
        this.f69524m = 0;
        this.f69515d = fragment;
    }

    /* renamed from: l */
    public static String m52613l() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: q */
    public static int m52608q() {
        return M80.EnumC5210c.Login.m95691a();
    }

    /* renamed from: A */
    public void m52628A(InterfaceC17253c interfaceC17253c) {
        this.f69516e = interfaceC17253c;
    }

    /* renamed from: B */
    public void m52627B(Request request) {
        if (!m52610o()) {
            m52622b(request);
        }
    }

    /* renamed from: C */
    public boolean m52626C() {
        LoginMethodHandler m52614k = m52614k();
        if (m52614k.mo52545j() && !m52620d()) {
            m52623a("no_internet_permission", "1", false);
            return false;
        }
        int mo52544o = m52614k.mo52544o(this.f69519h);
        this.f69523l = 0;
        if (mo52544o > 0) {
            m52609p().m52517e(this.f69519h.m52597b(), m52614k.mo52546g());
            this.f69524m = mo52544o;
        } else {
            m52609p().m52518d(this.f69519h.m52597b(), m52614k.mo52546g());
            m52623a("not_tried", m52614k.mo52546g(), true);
        }
        if (mo52544o <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public void m52625D() {
        int i;
        if (this.f69514c >= 0) {
            m52605t(m52614k().mo52546g(), "skipped", null, null, m52614k().f69548b);
        }
        do {
            LoginMethodHandler[] loginMethodHandlerArr = this.f69513b;
            if (loginMethodHandlerArr != null && (i = this.f69514c) < loginMethodHandlerArr.length - 1) {
                this.f69514c = i + 1;
            } else if (this.f69519h != null) {
                m52616i();
                return;
            } else {
                return;
            }
        } while (!m52626C());
    }

    /* renamed from: E */
    public void m52624E(Result result) {
        Result m52577b;
        if (result.f69537c != null) {
            AccessToken m52920c = AccessToken.m52920c();
            AccessToken accessToken = result.f69537c;
            if (m52920c != null && accessToken != null) {
                try {
                    if (m52920c.m52910n().equals(accessToken.m52910n())) {
                        m52577b = Result.m52575d(this.f69519h, result.f69537c);
                        m52618g(m52577b);
                        return;
                    }
                } catch (Exception e) {
                    m52618g(Result.m52577b(this.f69519h, "Caught exception", e.getMessage()));
                    return;
                }
            }
            m52577b = Result.m52577b(this.f69519h, "User logged in as different Facebook user.", null);
            m52618g(m52577b);
            return;
        }
        throw new FacebookException("Can't validate without a token");
    }

    /* renamed from: a */
    public final void m52623a(String str, String str2, boolean z) {
        if (this.f69520i == null) {
            this.f69520i = new HashMap();
        }
        if (this.f69520i.containsKey(str) && z) {
            str2 = this.f69520i.get(str) + "," + str2;
        }
        this.f69520i.put(str, str2);
    }

    /* renamed from: b */
    public void m52622b(Request request) {
        if (request == null) {
            return;
        }
        if (this.f69519h == null) {
            if (AccessToken.m52909o() && !m52620d()) {
                return;
            }
            this.f69519h = request;
            this.f69513b = m52611n(request);
            m52625D();
            return;
        }
        throw new FacebookException("Attempted to authorize while a request is pending.");
    }

    /* renamed from: c */
    public void m52621c() {
        if (this.f69514c >= 0) {
            m52614k().mo52547b();
        }
    }

    /* renamed from: d */
    public boolean m52620d() {
        if (this.f69518g) {
            return true;
        }
        if (m52619e("android.permission.INTERNET") != 0) {
            FragmentActivity m52615j = m52615j();
            m52618g(Result.m52577b(this.f69519h, m52615j.getString(C38738bl4.com_facebook_internet_permission_error_title), m52615j.getString(C38738bl4.com_facebook_internet_permission_error_message)));
            return false;
        }
        this.f69518g = true;
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int m52619e(String str) {
        return m52615j().checkCallingOrSelfPermission(str);
    }

    /* renamed from: g */
    public void m52618g(Result result) {
        LoginMethodHandler m52614k = m52614k();
        if (m52614k != null) {
            m52606s(m52614k.mo52546g(), result, m52614k.f69548b);
        }
        Map<String, String> map = this.f69520i;
        if (map != null) {
            result.f69541g = map;
        }
        Map<String, String> map2 = this.f69521j;
        if (map2 != null) {
            result.f69542h = map2;
        }
        this.f69513b = null;
        this.f69514c = -1;
        this.f69519h = null;
        this.f69520i = null;
        this.f69523l = 0;
        this.f69524m = 0;
        m52602w(result);
    }

    /* renamed from: h */
    public void m52617h(Result result) {
        if (result.f69537c != null && AccessToken.m52909o()) {
            m52624E(result);
        } else {
            m52618g(result);
        }
    }

    /* renamed from: i */
    public final void m52616i() {
        m52618g(Result.m52577b(this.f69519h, "Login attempt failed.", null));
    }

    /* renamed from: j */
    public FragmentActivity m52615j() {
        return this.f69515d.getActivity();
    }

    /* renamed from: k */
    public LoginMethodHandler m52614k() {
        int i = this.f69514c;
        if (i >= 0) {
            return this.f69513b[i];
        }
        return null;
    }

    /* renamed from: m */
    public Fragment m52612m() {
        return this.f69515d;
    }

    /* renamed from: n */
    public LoginMethodHandler[] m52611n(Request request) {
        ArrayList arrayList = new ArrayList();
        EnumC38273ay2 m52592h = request.m52592h();
        if (m52592h.m65191d()) {
            arrayList.add(new GetTokenLoginMethodHandler(this));
        }
        if (m52592h.m65190e()) {
            arrayList.add(new KatanaProxyLoginMethodHandler(this));
        }
        if (m52592h.m65192c()) {
            arrayList.add(new FacebookLiteLoginMethodHandler(this));
        }
        if (m52592h.m65194a()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (m52592h.m65189f()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (m52592h.m65193b()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        LoginMethodHandler[] loginMethodHandlerArr = new LoginMethodHandler[arrayList.size()];
        arrayList.toArray(loginMethodHandlerArr);
        return loginMethodHandlerArr;
    }

    /* renamed from: o */
    public boolean m52610o() {
        return this.f69519h != null && this.f69514c >= 0;
    }

    /* renamed from: p */
    public final C17261c m52609p() {
        C17261c c17261c = this.f69522k;
        if (c17261c == null || !c17261c.m52520b().equals(this.f69519h.m52598a())) {
            this.f69522k = new C17261c(m52615j(), this.f69519h.m52598a());
        }
        return this.f69522k;
    }

    /* renamed from: r */
    public Request m52607r() {
        return this.f69519h;
    }

    /* renamed from: s */
    public final void m52606s(String str, Result result, Map<String, String> map) {
        m52605t(str, result.f69536b.m52572a(), result.f69538d, result.f69539e, map);
    }

    /* renamed from: t */
    public final void m52605t(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.f69519h == null) {
            m52609p().m52512j("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            m52609p().m52519c(this.f69519h.m52597b(), str, str2, str3, str4, map);
        }
    }

    /* renamed from: u */
    public void m52604u() {
        InterfaceC17252b interfaceC17252b = this.f69517f;
        if (interfaceC17252b != null) {
            interfaceC17252b.mo52523a();
        }
    }

    /* renamed from: v */
    public void m52603v() {
        InterfaceC17252b interfaceC17252b = this.f69517f;
        if (interfaceC17252b != null) {
            interfaceC17252b.mo52522b();
        }
    }

    /* renamed from: w */
    public final void m52602w(Result result) {
        InterfaceC17253c interfaceC17253c = this.f69516e;
        if (interfaceC17253c != null) {
            interfaceC17253c.mo52524a(result);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.f69513b, i);
        parcel.writeInt(this.f69514c);
        parcel.writeParcelable(this.f69519h, i);
        C52364yi6.m2800z0(parcel, this.f69520i);
        C52364yi6.m2800z0(parcel, this.f69521j);
    }

    /* renamed from: x */
    public boolean m52601x(int i, int i2, Intent intent) {
        this.f69523l++;
        if (this.f69519h != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f69335i, false)) {
                m52625D();
                return false;
            } else if (!m52614k().mo52561n() || intent != null || this.f69523l >= this.f69524m) {
                return m52614k().mo52560k(i, i2, intent);
            }
        }
        return false;
    }

    /* renamed from: y */
    public void m52600y(InterfaceC17252b interfaceC17252b) {
        this.f69517f = interfaceC17252b;
    }

    /* renamed from: z */
    public void m52599z(Fragment fragment) {
        if (this.f69515d == null) {
            this.f69515d = fragment;
            return;
        }
        throw new FacebookException("Can't set fragment once it is already set.");
    }

    public LoginClient(Parcel parcel) {
        this.f69514c = -1;
        this.f69523l = 0;
        this.f69524m = 0;
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.f69513b = new LoginMethodHandler[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            LoginMethodHandler[] loginMethodHandlerArr = this.f69513b;
            LoginMethodHandler loginMethodHandler = (LoginMethodHandler) readParcelableArray[i];
            loginMethodHandlerArr[i] = loginMethodHandler;
            loginMethodHandler.m52562m(this);
        }
        this.f69514c = parcel.readInt();
        this.f69519h = (Request) parcel.readParcelable(Request.class.getClassLoader());
        this.f69520i = C52364yi6.m2832j0(parcel);
        this.f69521j = C52364yi6.m2832j0(parcel);
    }
}
