package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: y88  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52032y88 {

    /* renamed from: j */
    public static volatile C52032y88 f118810j;

    /* renamed from: a */
    public final String f118811a;

    /* renamed from: b */
    public final Clock f118812b;

    /* renamed from: c */
    public final ExecutorService f118813c;

    /* renamed from: d */
    public final C22416gj f118814d;

    /* renamed from: e */
    public final List f118815e;

    /* renamed from: f */
    public int f118816f;

    /* renamed from: g */
    public boolean f118817g;

    /* renamed from: h */
    public final String f118818h;

    /* renamed from: i */
    public volatile InterfaceC45683nR7 f118819i;

    public C52032y88(Context context, String str, String str2, String str3, Bundle bundle) {
        boolean z;
        if (str != null && m4053n(str2, str3)) {
            this.f118811a = str;
        } else {
            this.f118811a = "FA";
        }
        this.f118812b = DefaultClock.getInstance();
        FO7.m107259a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC37715a18(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f118813c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f118814d = new C22416gj(this);
        this.f118815e = new ArrayList();
        try {
            if (C43195jE8.m30953c(context, "google_app_id", C38742bl8.m64036a(context)) != null && !m4057j()) {
                this.f118818h = null;
                this.f118817g = true;
                Log.w(this.f118811a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!m4053n(str2, str3)) {
            this.f118818h = "fa";
            if (str2 != null && str3 != null) {
                Log.v(this.f118811a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            } else {
                if (str2 == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z ^ (str3 == null)) {
                    Log.w(this.f118811a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        } else {
            this.f118818h = str2;
        }
        m4054m(new XW7(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f118811a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C43139j88(this));
        }
    }

    /* renamed from: t */
    public static C52032y88 m4047t(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (f118810j == null) {
            synchronized (C52032y88.class) {
                if (f118810j == null) {
                    f118810j = new C52032y88(context, str, str2, str3, bundle);
                }
            }
        }
        return f118810j;
    }

    /* renamed from: A */
    public final Map m4075A(String str, String str2, boolean z) {
        BinderC43293jP7 binderC43293jP7 = new BinderC43293jP7();
        m4054m(new C43059j08(this, str, str2, z, binderC43293jP7));
        Bundle m30652d5 = binderC43293jP7.m30652d5(5000L);
        if (m30652d5 != null && m30652d5.size() != 0) {
            HashMap hashMap = new HashMap(m30652d5.size());
            for (String str3 : m30652d5.keySet()) {
                Object obj = m30652d5.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    /* renamed from: E */
    public final void m4071E(String str) {
        m4054m(new C45144mX7(this, str));
    }

    /* renamed from: F */
    public final void m4070F(String str, String str2, Bundle bundle) {
        m4054m(new DU7(this, str, str2, bundle));
    }

    /* renamed from: G */
    public final void m4069G(String str) {
        m4054m(new BX7(this, str));
    }

    /* renamed from: H */
    public final void m4068H(String str, Bundle bundle) {
        m4055l(null, str, bundle, false, true, null);
    }

    /* renamed from: I */
    public final void m4067I(String str, String str2, Bundle bundle) {
        m4055l(str, str2, bundle, true, true, null);
    }

    /* renamed from: a */
    public final void m4066a(int i, String str, Object obj, Object obj2, Object obj3) {
        m4054m(new C51952y08(this, false, 5, str, obj, null, null));
    }

    /* renamed from: b */
    public final void m4065b(InterfaceC41231fv8 interfaceC41231fv8) {
        Preconditions.checkNotNull(interfaceC41231fv8);
        synchronized (this.f118815e) {
            for (int i = 0; i < this.f118815e.size(); i++) {
                if (interfaceC41231fv8.equals(((Pair) this.f118815e.get(i)).first)) {
                    Log.w(this.f118811a, "OnEventListener already registered.");
                    return;
                }
            }
            U48 u48 = new U48(interfaceC41231fv8);
            this.f118815e.add(new Pair(interfaceC41231fv8, u48));
            if (this.f118819i != null) {
                try {
                    this.f118819i.registerOnMeasurementEventListener(u48);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f118811a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            m4054m(new C44275l38(this, u48));
        }
    }

    /* renamed from: c */
    public final void m4064c(Bundle bundle) {
        m4054m(new C48082rU7(this, bundle));
    }

    /* renamed from: d */
    public final void m4063d(Activity activity, String str, String str2) {
        m4054m(new C49276tV7(this, activity, str, str2));
    }

    /* renamed from: e */
    public final void m4062e(boolean z) {
        m4054m(new C49601u28(this, z));
    }

    /* renamed from: f */
    public final void m4061f(String str) {
        m4054m(new C40975fV7(this, str));
    }

    /* renamed from: g */
    public final void m4060g(String str, String str2, Object obj, boolean z) {
        m4054m(new C38338b48(this, str, str2, obj, z));
    }

    /* renamed from: j */
    public final boolean m4057j() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C52032y88.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: k */
    public final void m4056k(Exception exc, boolean z, boolean z2) {
        this.f118817g |= z;
        if (z) {
            Log.w(this.f118811a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            m4066a(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f118811a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: l */
    public final void m4055l(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m4054m(new M38(this, l, str, str2, bundle, z, z2));
    }

    /* renamed from: m */
    public final void m4054m(AbstractRunnableC46657p48 abstractRunnableC46657p48) {
        this.f118813c.execute(abstractRunnableC46657p48);
    }

    /* renamed from: n */
    public final boolean m4053n(String str, String str2) {
        return (str2 == null || str == null || m4057j()) ? false : true;
    }

    /* renamed from: o */
    public final int m4052o(String str) {
        BinderC43293jP7 binderC43293jP7 = new BinderC43293jP7();
        m4054m(new C46627p18(this, str, binderC43293jP7));
        Integer num = (Integer) BinderC43293jP7.m30649g5(binderC43293jP7.m30652d5(AbstractComponentTracker.LINGERING_TIMEOUT), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: p */
    public final long m4051p() {
        BinderC43293jP7 binderC43293jP7 = new BinderC43293jP7();
        m4054m(new C48719sZ7(this, binderC43293jP7));
        Long m30651e5 = binderC43293jP7.m30651e5(500L);
        if (m30651e5 == null) {
            long nextLong = new Random(System.nanoTime() ^ this.f118812b.currentTimeMillis()).nextLong();
            int i = this.f118816f + 1;
            this.f118816f = i;
            return nextLong + i;
        }
        return m30651e5.longValue();
    }

    /* renamed from: q */
    public final C22416gj m4050q() {
        return this.f118814d;
    }

    /* renamed from: s */
    public final InterfaceC45683nR7 m4048s(Context context, boolean z) {
        try {
            return YQ7.asInterface(DynamiteModule.m51591e(context, DynamiteModule.f70341e, ModuleDescriptor.MODULE_ID).m51592d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            m4056k(e, true, false);
            return null;
        }
    }

    /* renamed from: v */
    public final String m4045v() {
        BinderC43293jP7 binderC43293jP7 = new BinderC43293jP7();
        m4054m(new C40418eZ7(this, binderC43293jP7));
        return binderC43293jP7.m30650f5(50L);
    }

    /* renamed from: w */
    public final String m4044w() {
        BinderC43293jP7 binderC43293jP7 = new BinderC43293jP7();
        m4054m(new UZ7(this, binderC43293jP7));
        return binderC43293jP7.m30650f5(500L);
    }

    /* renamed from: x */
    public final String m4043x() {
        BinderC43293jP7 binderC43293jP7 = new BinderC43293jP7();
        m4054m(new GZ7(this, binderC43293jP7));
        return binderC43293jP7.m30650f5(500L);
    }

    /* renamed from: y */
    public final String m4042y() {
        BinderC43293jP7 binderC43293jP7 = new BinderC43293jP7();
        m4054m(new PY7(this, binderC43293jP7));
        return binderC43293jP7.m30650f5(500L);
    }

    /* renamed from: z */
    public final List m4041z(String str, String str2) {
        BinderC43293jP7 binderC43293jP7 = new BinderC43293jP7();
        m4054m(new RU7(this, str, str2, binderC43293jP7));
        List list = (List) BinderC43293jP7.m30649g5(binderC43293jP7.m30652d5(5000L), List.class);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }
}
