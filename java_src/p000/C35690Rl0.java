package p000;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.C17216a;
import com.facebook.GraphRequest;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.C48897sr6;
/* renamed from: Rl0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35690Rl0 {

    /* renamed from: b */
    public static SensorManager f32541b;

    /* renamed from: c */
    public static C48305rr6 f32542c;

    /* renamed from: d */
    public static String f32543d;

    /* renamed from: a */
    public static final C48897sr6 f32540a = new C48897sr6();

    /* renamed from: e */
    public static final AtomicBoolean f32544e = new AtomicBoolean(true);

    /* renamed from: f */
    public static final AtomicBoolean f32545f = new AtomicBoolean(false);

    /* renamed from: g */
    public static volatile Boolean f32546g = Boolean.FALSE;

    /* renamed from: h */
    public static InterfaceC7266d f32547h = new C7263a();

    /* renamed from: Rl0$a */
    /* loaded from: classes5.dex */
    public static class C7263a implements InterfaceC7266d {
        @Override // p000.C35690Rl0.InterfaceC7266d
        /* renamed from: a */
        public void mo86335a(String str) {
            C35690Rl0.m86345f(str);
        }
    }

    /* renamed from: Rl0$b */
    /* loaded from: classes5.dex */
    public static class C7264b implements C48897sr6.InterfaceC28416a {

        /* renamed from: a */
        public final /* synthetic */ C34512Mk1 f32548a;

        /* renamed from: b */
        public final /* synthetic */ String f32549b;

        public C7264b(C34512Mk1 c34512Mk1, String str) {
            this.f32548a = c34512Mk1;
            this.f32549b = str;
        }

        @Override // p000.C48897sr6.InterfaceC28416a
        /* renamed from: a */
        public void mo13568a() {
            boolean z;
            C34512Mk1 c34512Mk1 = this.f32548a;
            boolean z2 = true;
            if (c34512Mk1 != null && c34512Mk1.m94980b()) {
                z = true;
            } else {
                z = false;
            }
            if (!C17216a.m52732n()) {
                z2 = false;
            }
            if (z && z2) {
                C35690Rl0.m86350a().mo86335a(this.f32549b);
            }
        }
    }

    /* renamed from: Rl0$c */
    /* loaded from: classes5.dex */
    public static class RunnableC7265c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f32550b;

        public RunnableC7265c(String str) {
            this.f32550b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "0";
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                boolean z = true;
                GraphRequest m52823x = GraphRequest.m52823x(null, String.format(Locale.US, "%s/app_indexing_session", this.f32550b), null, null);
                Bundle m52829r = m52823x.m52829r();
                if (m52829r == null) {
                    m52829r = new Bundle();
                }
                C29645vp m7991m = C29645vp.m7991m(C17216a.m52741e());
                JSONArray jSONArray = new JSONArray();
                String str2 = Build.MODEL;
                if (str2 == null) {
                    str2 = "";
                }
                jSONArray.put(str2);
                if (m7991m != null && m7991m.m7994j() != null) {
                    jSONArray.put(m7991m.m7994j());
                } else {
                    jSONArray.put("");
                }
                jSONArray.put("0");
                if (C9155Wi.m77974f()) {
                    str = "1";
                }
                jSONArray.put(str);
                Locale m2809v = C52364yi6.m2809v();
                jSONArray.put(m2809v.getLanguage() + "_" + m2809v.getCountry());
                String jSONArray2 = jSONArray.toString();
                m52829r.putString("device_session_id", C35690Rl0.m86342i());
                m52829r.putString("extinfo", jSONArray2);
                m52823x.m52850C(m52829r);
                JSONObject m78703c = m52823x.m52837j().m78703c();
                AtomicBoolean m86349b = C35690Rl0.m86349b();
                if (m78703c == null || !m78703c.optBoolean("is_app_indexing_enabled", false)) {
                    z = false;
                }
                m86349b.set(z);
                if (!C35690Rl0.m86349b().get()) {
                    C35690Rl0.m86348c(null);
                } else if (C35690Rl0.m86347d() != null) {
                    C35690Rl0.m86347d().m15158k();
                }
                C35690Rl0.m86346e(Boolean.FALSE);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: Rl0$d */
    /* loaded from: classes5.dex */
    public interface InterfaceC7266d {
        /* renamed from: a */
        void mo86335a(String str);
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC7266d m86350a() {
        if (TD0.m84203d(C35690Rl0.class)) {
            return null;
        }
        try {
            return f32547h;
        } catch (Throwable th) {
            TD0.m84205b(th, C35690Rl0.class);
            return null;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ AtomicBoolean m86349b() {
        if (TD0.m84203d(C35690Rl0.class)) {
            return null;
        }
        try {
            return f32545f;
        } catch (Throwable th) {
            TD0.m84205b(th, C35690Rl0.class);
            return null;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ String m86348c(String str) {
        if (TD0.m84203d(C35690Rl0.class)) {
            return null;
        }
        try {
            f32543d = str;
            return str;
        } catch (Throwable th) {
            TD0.m84205b(th, C35690Rl0.class);
            return null;
        }
    }

    /* renamed from: d */
    public static /* synthetic */ C48305rr6 m86347d() {
        if (TD0.m84203d(C35690Rl0.class)) {
            return null;
        }
        try {
            return f32542c;
        } catch (Throwable th) {
            TD0.m84205b(th, C35690Rl0.class);
            return null;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ Boolean m86346e(Boolean bool) {
        if (TD0.m84203d(C35690Rl0.class)) {
            return null;
        }
        try {
            f32546g = bool;
            return bool;
        } catch (Throwable th) {
            TD0.m84205b(th, C35690Rl0.class);
            return null;
        }
    }

    /* renamed from: f */
    public static void m86345f(String str) {
        if (TD0.m84203d(C35690Rl0.class)) {
            return;
        }
        try {
            if (f32546g.booleanValue()) {
                return;
            }
            f32546g = Boolean.TRUE;
            C17216a.m52731o().execute(new RunnableC7265c(str));
        } catch (Throwable th) {
            TD0.m84205b(th, C35690Rl0.class);
        }
    }

    /* renamed from: g */
    public static void m86344g() {
        if (TD0.m84203d(C35690Rl0.class)) {
            return;
        }
        try {
            f32544e.set(false);
        } catch (Throwable th) {
            TD0.m84205b(th, C35690Rl0.class);
        }
    }

    /* renamed from: h */
    public static void m86343h() {
        if (TD0.m84203d(C35690Rl0.class)) {
            return;
        }
        try {
            f32544e.set(true);
        } catch (Throwable th) {
            TD0.m84205b(th, C35690Rl0.class);
        }
    }

    /* renamed from: i */
    public static String m86342i() {
        if (TD0.m84203d(C35690Rl0.class)) {
            return null;
        }
        try {
            if (f32543d == null) {
                f32543d = UUID.randomUUID().toString();
            }
            return f32543d;
        } catch (Throwable th) {
            TD0.m84205b(th, C35690Rl0.class);
            return null;
        }
    }

    /* renamed from: j */
    public static boolean m86341j() {
        if (TD0.m84203d(C35690Rl0.class)) {
            return false;
        }
        try {
            return f32545f.get();
        } catch (Throwable th) {
            TD0.m84205b(th, C35690Rl0.class);
            return false;
        }
    }

    /* renamed from: k */
    public static boolean m86340k() {
        TD0.m84203d(C35690Rl0.class);
        return false;
    }

    /* renamed from: l */
    public static void m86339l(Activity activity) {
        if (TD0.m84203d(C35690Rl0.class)) {
            return;
        }
        try {
            C35924Sl0.m84903e().m84904d(activity);
        } catch (Throwable th) {
            TD0.m84205b(th, C35690Rl0.class);
        }
    }

    /* renamed from: m */
    public static void m86338m(Activity activity) {
        if (TD0.m84203d(C35690Rl0.class)) {
            return;
        }
        try {
            if (!f32544e.get()) {
                return;
            }
            C35924Sl0.m84903e().m84900h(activity);
            C48305rr6 c48305rr6 = f32542c;
            if (c48305rr6 != null) {
                c48305rr6.m15156m();
            }
            SensorManager sensorManager = f32541b;
            if (sensorManager != null) {
                sensorManager.unregisterListener(f32540a);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C35690Rl0.class);
        }
    }

    /* renamed from: n */
    public static void m86337n(Activity activity) {
        if (TD0.m84203d(C35690Rl0.class)) {
            return;
        }
        try {
            if (!f32544e.get()) {
                return;
            }
            C35924Sl0.m84903e().m84905c(activity);
            Context applicationContext = activity.getApplicationContext();
            String m52740f = C17216a.m52740f();
            C34512Mk1 m93522j = C34746Nk1.m93522j(m52740f);
            if ((m93522j != null && m93522j.m94980b()) || m86340k()) {
                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                f32541b = sensorManager;
                if (sensorManager == null) {
                    return;
                }
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                f32542c = new C48305rr6(activity);
                C48897sr6 c48897sr6 = f32540a;
                c48897sr6.m13569a(new C7264b(m93522j, m52740f));
                f32541b.registerListener(c48897sr6, defaultSensor, 2);
                if (m93522j != null && m93522j.m94980b()) {
                    f32542c.m15158k();
                }
            }
            if (m86340k() && !f32545f.get()) {
                f32547h.mo86335a(m52740f);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C35690Rl0.class);
        }
    }

    /* renamed from: o */
    public static void m86336o(Boolean bool) {
        if (TD0.m84203d(C35690Rl0.class)) {
            return;
        }
        try {
            f32545f.set(bool.booleanValue());
        } catch (Throwable th) {
            TD0.m84205b(th, C35690Rl0.class);
        }
    }
}
