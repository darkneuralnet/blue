package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.b */
/* loaded from: classes5.dex */
public final class C17227b {

    /* renamed from: a */
    public static final String f69449a = "com.facebook.b";

    /* renamed from: b */
    public static AtomicBoolean f69450b = new AtomicBoolean(false);

    /* renamed from: c */
    public static AtomicBoolean f69451c = new AtomicBoolean(false);

    /* renamed from: d */
    public static C17229b f69452d = new C17229b(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: e */
    public static C17229b f69453e = new C17229b(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: f */
    public static C17229b f69454f = new C17229b(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: g */
    public static C17229b f69455g = new C17229b(false, "auto_event_setup_enabled");

    /* renamed from: h */
    public static C17229b f69456h = new C17229b(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: i */
    public static SharedPreferences f69457i;

    /* renamed from: com.facebook.b$a */
    /* loaded from: classes5.dex */
    public static class RunnableC17228a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ long f69458b;

        public RunnableC17228a(long j) {
            this.f69458b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            C34512Mk1 m93517o;
            String str;
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (C17227b.m52715a().m52695a() && (m93517o = C34746Nk1.m93517o(C17216a.m52740f(), false)) != null && m93517o.m94980b()) {
                    C29645vp m7991m = C29645vp.m7991m(C17216a.m52741e());
                    if (m7991m != null && m7991m.m7994j() != null) {
                        str = m7991m.m7994j();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("advertiser_id", m7991m.m7994j());
                        bundle.putString("fields", "auto_event_setup_enabled");
                        GraphRequest m52824w = GraphRequest.m52824w(null, C17216a.m52740f(), null);
                        m52824w.m52849D(true);
                        m52824w.m52850C(bundle);
                        JSONObject m78703c = m52824w.m52837j().m78703c();
                        if (m78703c != null) {
                            C17227b.m52714b().f69460b = Boolean.valueOf(m78703c.optBoolean("auto_event_setup_enabled", false));
                            C17227b.m52714b().f69462d = this.f69458b;
                            C17227b.m52713c(C17227b.m52714b());
                        }
                    }
                }
                C17227b.m52712d().set(false);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: com.facebook.b$b */
    /* loaded from: classes5.dex */
    public static class C17229b {

        /* renamed from: a */
        public String f69459a;

        /* renamed from: b */
        public Boolean f69460b;

        /* renamed from: c */
        public boolean f69461c;

        /* renamed from: d */
        public long f69462d;

        public C17229b(boolean z, String str) {
            this.f69461c = z;
            this.f69459a = str;
        }

        /* renamed from: a */
        public boolean m52695a() {
            Boolean bool = this.f69460b;
            return bool == null ? this.f69461c : bool.booleanValue();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ C17229b m52715a() {
        if (TD0.m84203d(C17227b.class)) {
            return null;
        }
        try {
            return f69454f;
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
            return null;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ C17229b m52714b() {
        if (TD0.m84203d(C17227b.class)) {
            return null;
        }
        try {
            return f69455g;
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
            return null;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m52713c(C17229b c17229b) {
        if (TD0.m84203d(C17227b.class)) {
            return;
        }
        try {
            m52696t(c17229b);
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ AtomicBoolean m52712d() {
        if (TD0.m84203d(C17227b.class)) {
            return null;
        }
        try {
            return f69451c;
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m52711e() {
        if (TD0.m84203d(C17227b.class)) {
            return false;
        }
        try {
            m52706j();
            return f69454f.m52695a();
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m52710f() {
        if (TD0.m84203d(C17227b.class)) {
            return false;
        }
        try {
            m52706j();
            return f69452d.m52695a();
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m52709g() {
        if (TD0.m84203d(C17227b.class)) {
            return false;
        }
        try {
            m52706j();
            return f69453e.m52695a();
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m52708h() {
        if (TD0.m84203d(C17227b.class)) {
            return false;
        }
        try {
            m52706j();
            return f69455g.m52695a();
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
            return false;
        }
    }

    /* renamed from: i */
    public static void m52707i() {
        if (TD0.m84203d(C17227b.class)) {
            return;
        }
        try {
            m52700p(f69455g);
            long currentTimeMillis = System.currentTimeMillis();
            C17229b c17229b = f69455g;
            if (c17229b.f69460b != null && currentTimeMillis - c17229b.f69462d < CoreConstants.MILLIS_IN_ONE_WEEK) {
                return;
            }
            c17229b.f69460b = null;
            c17229b.f69462d = 0L;
            if (!f69451c.compareAndSet(false, true)) {
                return;
            }
            C17216a.m52731o().execute(new RunnableC17228a(currentTimeMillis));
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
        }
    }

    /* renamed from: j */
    public static void m52706j() {
        if (TD0.m84203d(C17227b.class)) {
            return;
        }
        try {
            if (!C17216a.m52722x() || !f69450b.compareAndSet(false, true)) {
                return;
            }
            f69457i = C17216a.m52741e().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            m52705k(f69453e, f69454f, f69452d);
            m52707i();
            m52701o();
            m52702n();
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
        }
    }

    /* renamed from: k */
    public static void m52705k(C17229b... c17229bArr) {
        if (TD0.m84203d(C17227b.class)) {
            return;
        }
        for (C17229b c17229b : c17229bArr) {
            try {
                if (c17229b == f69455g) {
                    m52707i();
                } else if (c17229b.f69460b == null) {
                    m52700p(c17229b);
                    if (c17229b.f69460b == null) {
                        m52704l(c17229b);
                    }
                } else {
                    m52696t(c17229b);
                }
            } catch (Throwable th) {
                TD0.m84205b(th, C17227b.class);
                return;
            }
        }
    }

    /* renamed from: l */
    public static void m52704l(C17229b c17229b) {
        Bundle bundle;
        if (TD0.m84203d(C17227b.class)) {
            return;
        }
        try {
            m52697s();
            try {
                Context m52741e = C17216a.m52741e();
                ApplicationInfo applicationInfo = m52741e.getPackageManager().getApplicationInfo(m52741e.getPackageName(), 128);
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(c17229b.f69459a)) {
                    c17229b.f69460b = Boolean.valueOf(applicationInfo.metaData.getBoolean(c17229b.f69459a, c17229b.f69461c));
                }
            } catch (PackageManager.NameNotFoundException e) {
                C52364yi6.m2854X(f69449a, e);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
        }
    }

    /* renamed from: m */
    public static void m52703m() {
        Bundle bundle;
        if (TD0.m84203d(C17227b.class)) {
            return;
        }
        try {
            Context m52741e = C17216a.m52741e();
            ApplicationInfo applicationInfo = m52741e.getPackageManager().getApplicationInfo(m52741e.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                C45485n62 c45485n62 = new C45485n62(m52741e);
                Bundle bundle2 = new Bundle();
                if (!C52364yi6.m2867K()) {
                    bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                    Log.w(f69449a, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                }
                c45485n62.m24341e("fb_auto_applink", bundle2);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
        }
    }

    /* renamed from: n */
    public static void m52702n() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ApplicationInfo applicationInfo;
        int i6;
        if (TD0.m84203d(C17227b.class)) {
            return;
        }
        try {
            if (!f69450b.get() || !C17216a.m52722x()) {
                return;
            }
            Context m52741e = C17216a.m52741e();
            int i7 = 0;
            if (f69452d.m52695a()) {
                i = 1;
            } else {
                i = 0;
            }
            int i8 = (i << 0) | 0;
            if (f69453e.m52695a()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            int i9 = i8 | (i2 << 1);
            if (f69454f.m52695a()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i10 = i9 | (i3 << 2);
            if (f69456h.m52695a()) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            int i11 = i10 | (i4 << 3);
            int i12 = f69457i.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
            if (i12 != i11) {
                f69457i.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i11).commit();
                try {
                    applicationInfo = m52741e.getPackageManager().getApplicationInfo(m52741e.getPackageName(), 128);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                    boolean[] zArr = {true, true, true, true};
                    i5 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < 4; i14++) {
                        try {
                            if (applicationInfo.metaData.containsKey(strArr[i14])) {
                                i6 = 1;
                            } else {
                                i6 = 0;
                            }
                            i13 |= i6 << i14;
                            i5 |= (applicationInfo.metaData.getBoolean(strArr[i14], zArr[i14]) ? 1 : 0) << i14;
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                    i7 = i13;
                    C45485n62 c45485n62 = new C45485n62(m52741e);
                    Bundle bundle = new Bundle();
                    bundle.putInt(PaymentSheetEvent.FIELD_APPEARANCE_USAGE, i7);
                    bundle.putInt("initial", i5);
                    bundle.putInt("previous", i12);
                    bundle.putInt("current", i11);
                    c45485n62.m24343c(bundle);
                }
                i5 = 0;
                C45485n62 c45485n622 = new C45485n62(m52741e);
                Bundle bundle2 = new Bundle();
                bundle2.putInt(PaymentSheetEvent.FIELD_APPEARANCE_USAGE, i7);
                bundle2.putInt("initial", i5);
                bundle2.putInt("previous", i12);
                bundle2.putInt("current", i11);
                c45485n622.m24343c(bundle2);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
        }
    }

    /* renamed from: o */
    public static void m52701o() {
        Bundle bundle;
        if (TD0.m84203d(C17227b.class)) {
            return;
        }
        try {
            Context m52741e = C17216a.m52741e();
            ApplicationInfo applicationInfo = m52741e.getPackageManager().getApplicationInfo(m52741e.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                if (!bundle.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                    Log.w(f69449a, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(f69449a, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!m52711e()) {
                    Log.w(f69449a, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
        }
    }

    /* renamed from: p */
    public static void m52700p(C17229b c17229b) {
        if (TD0.m84203d(C17227b.class)) {
            return;
        }
        try {
            m52697s();
            try {
                String string = f69457i.getString(c17229b.f69459a, "");
                if (!string.isEmpty()) {
                    JSONObject jSONObject = new JSONObject(string);
                    c17229b.f69460b = Boolean.valueOf(jSONObject.getBoolean("value"));
                    c17229b.f69462d = jSONObject.getLong("last_timestamp");
                }
            } catch (JSONException e) {
                C52364yi6.m2854X(f69449a, e);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
        }
    }

    /* renamed from: q */
    public static void m52699q(boolean z) {
        if (TD0.m84203d(C17227b.class)) {
            return;
        }
        try {
            f69454f.f69460b = Boolean.valueOf(z);
            f69454f.f69462d = System.currentTimeMillis();
            if (f69450b.get()) {
                m52696t(f69454f);
            } else {
                m52706j();
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
        }
    }

    /* renamed from: r */
    public static void m52698r(boolean z) {
        if (TD0.m84203d(C17227b.class)) {
            return;
        }
        try {
            f69452d.f69460b = Boolean.valueOf(z);
            f69452d.f69462d = System.currentTimeMillis();
            if (f69450b.get()) {
                m52696t(f69452d);
            } else {
                m52706j();
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
        }
    }

    /* renamed from: s */
    public static void m52697s() {
        if (TD0.m84203d(C17227b.class)) {
            return;
        }
        try {
            if (f69450b.get()) {
                return;
            }
            throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
        }
    }

    /* renamed from: t */
    public static void m52696t(C17229b c17229b) {
        if (TD0.m84203d(C17227b.class)) {
            return;
        }
        try {
            m52697s();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", c17229b.f69460b);
                jSONObject.put("last_timestamp", c17229b.f69462d);
                f69457i.edit().putString(c17229b.f69459a, jSONObject.toString()).commit();
                m52702n();
            } catch (Exception e) {
                C52364yi6.m2854X(f69449a, e);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C17227b.class);
        }
    }
}
