package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.login.LoginClient;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.login.c */
/* loaded from: classes5.dex */
public class C17261c {

    /* renamed from: d */
    public static final ScheduledExecutorService f69568d = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a */
    public final C45485n62 f69569a;

    /* renamed from: b */
    public String f69570b;

    /* renamed from: c */
    public String f69571c;

    /* renamed from: com.facebook.login.c$a */
    /* loaded from: classes5.dex */
    public class RunnableC17262a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Bundle f69572b;

        public RunnableC17262a(Bundle bundle) {
            this.f69572b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                C17261c.m52521a(C17261c.this).m24338h("fb_mobile_login_heartbeat", this.f69572b);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    public C17261c(Context context, String str) {
        PackageInfo packageInfo;
        this.f69570b = str;
        this.f69569a = new C45485n62(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) != null) {
                this.f69571c = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public static /* synthetic */ C45485n62 m52521a(C17261c c17261c) {
        if (TD0.m84203d(C17261c.class)) {
            return null;
        }
        try {
            return c17261c.f69569a;
        } catch (Throwable th) {
            TD0.m84205b(th, C17261c.class);
            return null;
        }
    }

    /* renamed from: k */
    public static Bundle m52511k(String str) {
        if (TD0.m84203d(C17261c.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        } catch (Throwable th) {
            TD0.m84205b(th, C17261c.class);
            return null;
        }
    }

    /* renamed from: b */
    public String m52520b() {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            return this.f69570b;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: c */
    public void m52519c(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            Bundle m52511k = m52511k(str);
            if (str3 != null) {
                m52511k.putString("2_result", str3);
            }
            if (str4 != null) {
                m52511k.putString("5_error_message", str4);
            }
            if (str5 != null) {
                m52511k.putString("4_error_code", str5);
            }
            if (map != null && !map.isEmpty()) {
                m52511k.putString("6_extras", new JSONObject(map).toString());
            }
            m52511k.putString("3_method", str2);
            this.f69569a.m24338h("fb_mobile_login_method_complete", m52511k);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: d */
    public void m52518d(String str, String str2) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            Bundle m52511k = m52511k(str);
            m52511k.putString("3_method", str2);
            this.f69569a.m24338h("fb_mobile_login_method_not_tried", m52511k);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: e */
    public void m52517e(String str, String str2) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            Bundle m52511k = m52511k(str);
            m52511k.putString("3_method", str2);
            this.f69569a.m24338h("fb_mobile_login_method_start", m52511k);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: f */
    public void m52516f(String str, Map<String, String> map, LoginClient.Result.EnumC17250b enumC17250b, Map<String, String> map2, Exception exc) {
        JSONObject jSONObject;
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            Bundle m52511k = m52511k(str);
            if (enumC17250b != null) {
                m52511k.putString("2_result", enumC17250b.m52572a());
            }
            if (exc != null && exc.getMessage() != null) {
                m52511k.putString("5_error_message", exc.getMessage());
            }
            if (!map.isEmpty()) {
                jSONObject = new JSONObject(map);
            } else {
                jSONObject = null;
            }
            if (map2 != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                m52511k.putString("6_extras", jSONObject.toString());
            }
            this.f69569a.m24338h("fb_mobile_login_complete", m52511k);
            if (enumC17250b == LoginClient.Result.EnumC17250b.SUCCESS) {
                m52515g(str);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: g */
    public final void m52515g(String str) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            f69568d.schedule(new RunnableC17262a(m52511k(str)), 5L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: h */
    public void m52514h(LoginClient.Request request) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            Bundle m52511k = m52511k(request.m52597b());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_behavior", request.m52592h().toString());
                jSONObject.put("request_code", LoginClient.m52608q());
                jSONObject.put("permissions", TextUtils.join(",", request.m52590j()));
                jSONObject.put("default_audience", request.m52595d().toString());
                jSONObject.put("isReauthorize", request.m52587m());
                String str = this.f69571c;
                if (str != null) {
                    jSONObject.put("facebookVersion", str);
                }
                m52511k.putString("6_extras", jSONObject.toString());
            } catch (JSONException unused) {
            }
            this.f69569a.m24337i("fb_mobile_login_start", null, m52511k);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: i */
    public void m52513i(String str, String str2) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            m52512j(str, str2, "");
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: j */
    public void m52512j(String str, String str2, String str3) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            Bundle m52511k = m52511k("");
            m52511k.putString("2_result", LoginClient.Result.EnumC17250b.ERROR.m52572a());
            m52511k.putString("5_error_message", str2);
            m52511k.putString("3_method", str3);
            this.f69569a.m24338h(str, m52511k);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }
}
