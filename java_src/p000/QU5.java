package p000;

import android.app.Activity;
import com.facebook.C17216a;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.C37988aV2;
/* renamed from: QU5 */
/* loaded from: classes5.dex */
public final class QU5 {

    /* renamed from: a */
    public static final AtomicBoolean f30439a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final Set<String> f30440b = new HashSet();

    /* renamed from: c */
    public static final Set<String> f30441c = new HashSet();

    /* renamed from: QU5$a */
    /* loaded from: classes5.dex */
    public static class RunnableC6783a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (QU5.m88470a().get()) {
                    return;
                }
                QU5.m88470a().set(true);
                QU5.m88469b();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ AtomicBoolean m88470a() {
        if (TD0.m84203d(QU5.class)) {
            return null;
        }
        try {
            return f30439a;
        } catch (Throwable th) {
            TD0.m84205b(th, QU5.class);
            return null;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m88469b() {
        if (TD0.m84203d(QU5.class)) {
            return;
        }
        try {
            m88467d();
        } catch (Throwable th) {
            TD0.m84205b(th, QU5.class);
        }
    }

    /* renamed from: c */
    public static synchronized void m88468c() {
        synchronized (QU5.class) {
            if (TD0.m84203d(QU5.class)) {
                return;
            }
            C17216a.m52731o().execute(new RunnableC6783a());
        }
    }

    /* renamed from: d */
    public static void m88467d() {
        String m94967o;
        File m71304j;
        if (TD0.m84203d(QU5.class)) {
            return;
        }
        try {
            C34512Mk1 m93517o = C34746Nk1.m93517o(C17216a.m52740f(), false);
            if (m93517o == null || (m94967o = m93517o.m94967o()) == null) {
                return;
            }
            m88464g(m94967o);
            if ((f30440b.isEmpty() && f30441c.isEmpty()) || (m71304j = C37988aV2.m71304j(C37988aV2.EnumC10718a.MTML_APP_EVENT_PREDICTION)) == null) {
                return;
            }
            C31938Bk1.m113560d(m71304j);
            Activity m40176p = C20715g4.m40176p();
            if (m40176p != null) {
                m88463h(m40176p);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            TD0.m84205b(th, QU5.class);
        }
    }

    /* renamed from: e */
    public static boolean m88466e(String str) {
        if (TD0.m84203d(QU5.class)) {
            return false;
        }
        try {
            return f30441c.contains(str);
        } catch (Throwable th) {
            TD0.m84205b(th, QU5.class);
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m88465f(String str) {
        if (TD0.m84203d(QU5.class)) {
            return false;
        }
        try {
            return f30440b.contains(str);
        } catch (Throwable th) {
            TD0.m84205b(th, QU5.class);
            return false;
        }
    }

    /* renamed from: g */
    public static void m88464g(String str) {
        if (TD0.m84203d(QU5.class)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                for (int i = 0; i < jSONArray.length(); i++) {
                    f30440b.add(jSONArray.getString(i));
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    f30441c.add(jSONArray2.getString(i2));
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            TD0.m84205b(th, QU5.class);
        }
    }

    /* renamed from: h */
    public static void m88463h(Activity activity) {
        if (TD0.m84203d(QU5.class)) {
            return;
        }
        try {
            if (f30439a.get() && C31938Bk1.m113558f() && (!f30440b.isEmpty() || !f30441c.isEmpty())) {
                ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6.m72389d(activity);
            } else {
                ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6.m72387f(activity);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            TD0.m84205b(th, QU5.class);
        }
    }
}
