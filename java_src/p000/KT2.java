package p000;

import android.app.Activity;
import com.facebook.C17216a;
/* renamed from: KT2 */
/* loaded from: classes5.dex */
public final class KT2 {

    /* renamed from: a */
    public static final String f19666a = "KT2";

    /* renamed from: b */
    public static Boolean f19667b = Boolean.FALSE;

    /* renamed from: KT2$a */
    /* loaded from: classes5.dex */
    public static class RunnableC4450a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (!C29645vp.m7989o(C17216a.m52741e())) {
                    KT2.m98854a();
                    KT2.m98853b(Boolean.TRUE);
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m98854a() {
        if (TD0.m84203d(KT2.class)) {
            return;
        }
        try {
            m98850e();
        } catch (Throwable th) {
            TD0.m84205b(th, KT2.class);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ Boolean m98853b(Boolean bool) {
        if (TD0.m84203d(KT2.class)) {
            return null;
        }
        try {
            f19667b = bool;
            return bool;
        } catch (Throwable th) {
            TD0.m84205b(th, KT2.class);
            return null;
        }
    }

    /* renamed from: c */
    public static void m98852c() {
        try {
            if (TD0.m84203d(KT2.class)) {
                return;
            }
            try {
                C17216a.m52731o().execute(new RunnableC4450a());
            } catch (Exception e) {
                C52364yi6.m2854X(f19666a, e);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, KT2.class);
        }
    }

    /* renamed from: d */
    public static void m98851d(Activity activity) {
        if (TD0.m84203d(KT2.class)) {
            return;
        }
        try {
            if (f19667b.booleanValue() && !PT2.m90213e().isEmpty()) {
                QT2.m88482h(activity);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            TD0.m84205b(th, KT2.class);
        }
    }

    /* renamed from: e */
    public static void m98850e() {
        String m94972j;
        if (TD0.m84203d(KT2.class)) {
            return;
        }
        try {
            C34512Mk1 m93517o = C34746Nk1.m93517o(C17216a.m52740f(), false);
            if (m93517o == null || (m94972j = m93517o.m94972j()) == null) {
                return;
            }
            PT2.m90211g(m94972j);
        } catch (Throwable th) {
            TD0.m84205b(th, KT2.class);
        }
    }
}
