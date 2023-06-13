package p000;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.C17216a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: HZ1 */
/* loaded from: classes5.dex */
public class HZ1 {

    /* renamed from: a */
    public static final String f13541a = "HZ1";

    /* renamed from: b */
    public static final AtomicBoolean f13542b = new AtomicBoolean(false);

    /* renamed from: c */
    public static Boolean f13543c = null;

    /* renamed from: d */
    public static Boolean f13544d = null;

    /* renamed from: e */
    public static ServiceConnection f13545e;

    /* renamed from: f */
    public static Application.ActivityLifecycleCallbacks f13546f;

    /* renamed from: g */
    public static Intent f13547g;

    /* renamed from: h */
    public static Object f13548h;

    /* renamed from: HZ1$a */
    /* loaded from: classes5.dex */
    public static class ServiceConnectionC3162a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Object unused = HZ1.f13548h = KZ1.m98755a(C17216a.m52741e(), iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: HZ1$b */
    /* loaded from: classes5.dex */
    public static class C3163b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: HZ1$b$a */
        /* loaded from: classes5.dex */
        public class RunnableC3164a implements Runnable {
            public RunnableC3164a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (TD0.m84203d(this)) {
                    return;
                }
                try {
                    Context m52741e = C17216a.m52741e();
                    HZ1.m103740f(m52741e, KZ1.m98747i(m52741e, HZ1.f13548h), false);
                    HZ1.m103740f(m52741e, KZ1.m98746j(m52741e, HZ1.f13548h), true);
                } catch (Throwable th) {
                    TD0.m84205b(th, this);
                }
            }
        }

        /* renamed from: HZ1$b$b */
        /* loaded from: classes5.dex */
        public class RunnableC3165b implements Runnable {
            public RunnableC3165b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (TD0.m84203d(this)) {
                    return;
                }
                try {
                    Context m52741e = C17216a.m52741e();
                    ArrayList<String> m98747i = KZ1.m98747i(m52741e, HZ1.f13548h);
                    if (m98747i.isEmpty()) {
                        m98747i = KZ1.m98749g(m52741e, HZ1.f13548h);
                    }
                    HZ1.m103740f(m52741e, m98747i, false);
                } catch (Throwable th) {
                    TD0.m84205b(th, this);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            try {
                C17216a.m52731o().execute(new RunnableC3164a());
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            try {
                if (HZ1.f13544d.booleanValue() && activity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity")) {
                    C17216a.m52731o().execute(new RunnableC3165b());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public static void m103741e() {
        if (f13543c != null) {
            return;
        }
        try {
            Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
            Boolean bool = Boolean.TRUE;
            f13543c = bool;
            try {
                Class.forName("com.android.billingclient.api.ProxyBillingActivity");
                f13544d = bool;
            } catch (ClassNotFoundException unused) {
                f13544d = Boolean.FALSE;
            }
            KZ1.m98754b();
            f13547g = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
            f13545e = new ServiceConnectionC3162a();
            f13546f = new C3163b();
        } catch (ClassNotFoundException unused2) {
            f13543c = Boolean.FALSE;
        }
    }

    /* renamed from: f */
    public static void m103740f(Context context, ArrayList<String> arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                String string = new JSONObject(next).getString("productId");
                hashMap.put(string, next);
                arrayList2.add(string);
            } catch (JSONException e) {
                Log.e(f13541a, "Error parsing in-app purchase data.", e);
            }
        }
        for (Map.Entry<String, String> entry : KZ1.m98745k(context, arrayList2, f13548h, z).entrySet()) {
            C7580Su.m84661f((String) hashMap.get(entry.getKey()), entry.getValue(), z);
        }
    }

    /* renamed from: g */
    public static void m103739g() {
        m103741e();
        if (f13543c.booleanValue() && C7580Su.m84664c()) {
            m103738h();
        }
    }

    /* renamed from: h */
    public static void m103738h() {
        if (!f13542b.compareAndSet(false, true)) {
            return;
        }
        Context m52741e = C17216a.m52741e();
        if (m52741e instanceof Application) {
            ((Application) m52741e).registerActivityLifecycleCallbacks(f13546f);
            m52741e.bindService(f13547g, f13545e, 1);
        }
    }
}
