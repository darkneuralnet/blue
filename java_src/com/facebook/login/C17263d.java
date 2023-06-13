package com.facebook.login;

import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C17216a;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.login.LoginClient;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p000.M80;
/* renamed from: com.facebook.login.d */
/* loaded from: classes5.dex */
public class C17263d {

    /* renamed from: g */
    public static final Set<String> f69574g = m52507d();

    /* renamed from: h */
    public static volatile C17263d f69575h;

    /* renamed from: c */
    public final SharedPreferences f69578c;

    /* renamed from: e */
    public String f69580e;

    /* renamed from: f */
    public boolean f69581f;

    /* renamed from: a */
    public EnumC38273ay2 f69576a = EnumC38273ay2.NATIVE_WITH_FALLBACK;

    /* renamed from: b */
    public EnumC48093rW0 f69577b = EnumC48093rW0.FRIENDS;

    /* renamed from: d */
    public String f69579d = "rerequest";

    /* renamed from: com.facebook.login.d$a */
    /* loaded from: classes5.dex */
    public static class C17264a extends HashSet<String> {
        public C17264a() {
            add("ads_management");
            add("create_event");
            add("rsvp_event");
        }
    }

    /* renamed from: com.facebook.login.d$b */
    /* loaded from: classes5.dex */
    public class C17265b implements M80.InterfaceC5208a {
        public C17265b() {
        }
    }

    /* renamed from: com.facebook.login.d$c */
    /* loaded from: classes5.dex */
    public static class C17266c implements GO5 {

        /* renamed from: a */
        public final Activity f69583a;

        public C17266c(Activity activity) {
            C48817sj6.m13765m(activity, "activity");
            this.f69583a = activity;
        }

        @Override // p000.GO5
        /* renamed from: a */
        public Activity mo52489a() {
            return this.f69583a;
        }

        @Override // p000.GO5
        public void startActivityForResult(Intent intent, int i) {
            this.f69583a.startActivityForResult(intent, i);
        }
    }

    /* renamed from: com.facebook.login.d$d */
    /* loaded from: classes5.dex */
    public static class C17267d implements GO5 {

        /* renamed from: a */
        public final C33702Iy1 f69584a;

        public C17267d(C33702Iy1 c33702Iy1) {
            C48817sj6.m13765m(c33702Iy1, "fragment");
            this.f69584a = c33702Iy1;
        }

        @Override // p000.GO5
        /* renamed from: a */
        public Activity mo52489a() {
            return this.f69584a.m101440a();
        }

        @Override // p000.GO5
        public void startActivityForResult(Intent intent, int i) {
            this.f69584a.m101437d(intent, i);
        }
    }

    /* renamed from: com.facebook.login.d$e */
    /* loaded from: classes5.dex */
    public static class C17268e {

        /* renamed from: a */
        public static C17261c f69585a;

        private C17268e() {
        }

        /* renamed from: b */
        public static synchronized C17261c m52487b(Context context) {
            synchronized (C17268e.class) {
                if (context == null) {
                    context = C17216a.m52741e();
                }
                if (context == null) {
                    return null;
                }
                if (f69585a == null) {
                    f69585a = new C17261c(context, C17216a.m52740f());
                }
                return f69585a;
            }
        }
    }

    public C17263d() {
        C48817sj6.m13763o();
        this.f69578c = C17216a.m52741e().getSharedPreferences("com.facebook.loginManager", 0);
        if (C17216a.f69441q && C49125tF0.m12565a() != null) {
            C50310vF0.m8960a(C17216a.m52741e(), "com.android.chrome", new C48532sF0());
            C50310vF0.m8959b(C17216a.m52741e(), C17216a.m52741e().getPackageName());
        }
    }

    /* renamed from: c */
    public static C17263d m52508c() {
        if (f69575h == null) {
            synchronized (C17263d.class) {
                if (f69575h == null) {
                    f69575h = new C17263d();
                }
            }
        }
        return f69575h;
    }

    /* renamed from: d */
    public static Set<String> m52507d() {
        return Collections.unmodifiableSet(new C17264a());
    }

    /* renamed from: e */
    public static boolean m52506e(String str) {
        if (str != null && (str.startsWith("publish") || str.startsWith("manage") || f69574g.contains(str))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public LoginClient.Request mo52510a(Collection<String> collection) {
        HashSet hashSet;
        EnumC38273ay2 enumC38273ay2 = this.f69576a;
        if (collection != null) {
            hashSet = new HashSet(collection);
        } else {
            hashSet = new HashSet();
        }
        LoginClient.Request request = new LoginClient.Request(enumC38273ay2, Collections.unmodifiableSet(hashSet), this.f69577b, this.f69579d, C17216a.m52740f(), UUID.randomUUID().toString());
        request.m52582r(AccessToken.m52909o());
        request.m52584p(this.f69580e);
        request.m52581s(this.f69581f);
        return request;
    }

    /* renamed from: b */
    public Intent m52509b(LoginClient.Request request) {
        Intent intent = new Intent();
        intent.setClass(C17216a.m52741e(), FacebookActivity.class);
        intent.setAction(request.m52592h().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    /* renamed from: f */
    public final void m52505f(Context context, LoginClient.Result.EnumC17250b enumC17250b, Map<String, String> map, Exception exc, boolean z, LoginClient.Request request) {
        String str;
        C17261c m52487b = C17268e.m52487b(context);
        if (m52487b == null) {
            return;
        }
        if (request == null) {
            m52487b.m52513i("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            return;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("try_login_activity", str);
        m52487b.m52516f(request.m52597b(), hashMap, enumC17250b, map, exc);
    }

    /* renamed from: g */
    public void m52504g(C33702Iy1 c33702Iy1, Collection<String> collection) {
        m52491t(new C17267d(c33702Iy1), mo52510a(collection));
    }

    /* renamed from: h */
    public void m52503h(Activity activity, Collection<String> collection) {
        m52491t(new C17266c(activity), mo52510a(collection));
    }

    /* renamed from: i */
    public void m52502i(Fragment fragment, Collection<String> collection) {
        m52504g(new C33702Iy1(fragment), collection);
    }

    /* renamed from: j */
    public void m52501j(androidx.fragment.app.Fragment fragment, Collection<String> collection) {
        m52504g(new C33702Iy1(fragment), collection);
    }

    /* renamed from: k */
    public void m52500k() {
        AccessToken.m52907q(null);
        Profile.m52760e(null);
        m52495p(false);
    }

    /* renamed from: l */
    public final void m52499l(Context context, LoginClient.Request request) {
        C17261c m52487b = C17268e.m52487b(context);
        if (m52487b != null && request != null) {
            m52487b.m52514h(request);
        }
    }

    /* renamed from: m */
    public final boolean m52498m(Intent intent) {
        return C17216a.m52741e().getPackageManager().resolveActivity(intent, 0) != null;
    }

    /* renamed from: n */
    public C17263d m52497n(String str) {
        this.f69579d = str;
        return this;
    }

    /* renamed from: o */
    public C17263d m52496o(EnumC48093rW0 enumC48093rW0) {
        this.f69577b = enumC48093rW0;
        return this;
    }

    /* renamed from: p */
    public final void m52495p(boolean z) {
        SharedPreferences.Editor edit = this.f69578c.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }

    /* renamed from: q */
    public C17263d m52494q(EnumC38273ay2 enumC38273ay2) {
        this.f69576a = enumC38273ay2;
        return this;
    }

    /* renamed from: r */
    public C17263d m52493r(String str) {
        this.f69580e = str;
        return this;
    }

    /* renamed from: s */
    public C17263d m52492s(boolean z) {
        this.f69581f = z;
        return this;
    }

    /* renamed from: t */
    public final void m52491t(GO5 go5, LoginClient.Request request) throws FacebookException {
        m52499l(go5.mo52489a(), request);
        M80.m95693b(M80.EnumC5210c.Login.m95691a(), new C17265b());
        if (m52490u(go5, request)) {
            return;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        m52505f(go5.mo52489a(), LoginClient.Result.EnumC17250b.ERROR, null, facebookException, false, request);
        throw facebookException;
    }

    /* renamed from: u */
    public final boolean m52490u(GO5 go5, LoginClient.Request request) {
        Intent m52509b = m52509b(request);
        if (!m52498m(m52509b)) {
            return false;
        }
        try {
            go5.startActivityForResult(m52509b, LoginClient.m52608q());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
