package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.amazonaws.services.p026s3.internal.Constants;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;
@KeepForSdk
/* renamed from: hv5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C42414hv5 {

    /* renamed from: e */
    public static C42414hv5 f86188e;

    /* renamed from: a */
    public String f86189a = null;

    /* renamed from: b */
    public Boolean f86190b = null;

    /* renamed from: c */
    public Boolean f86191c = null;

    /* renamed from: d */
    public final Queue<Intent> f86192d = new ArrayDeque();

    private C42414hv5() {
    }

    /* renamed from: b */
    public static synchronized C42414hv5 m35493b() {
        C42414hv5 c42414hv5;
        synchronized (C42414hv5.class) {
            if (f86188e == null) {
                f86188e = new C42414hv5();
            }
            c42414hv5 = f86188e;
        }
        return c42414hv5;
    }

    /* renamed from: a */
    public final int m35494a(Context context, Intent intent) {
        ComponentName startService;
        String m35489f = m35489f(context, intent);
        if (m35489f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + m35489f);
            }
            intent.setClassName(context.getPackageName(), m35489f);
        }
        try {
            if (m35490e(context)) {
                startService = C37199Xw6.m76031h(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                return Constants.NO_SUCH_BUCKET_STATUS_CODE;
            }
            return -1;
        } catch (IllegalStateException e) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
            return 402;
        } catch (SecurityException e2) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
            return 401;
        }
    }

    /* renamed from: c */
    public Intent m35492c() {
        return this.f86192d.poll();
    }

    /* renamed from: d */
    public boolean m35491d(Context context) {
        boolean z;
        if (this.f86191c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f86191c = Boolean.valueOf(z);
        }
        if (!this.f86190b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f86191c.booleanValue();
    }

    /* renamed from: e */
    public boolean m35490e(Context context) {
        boolean z;
        if (this.f86190b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f86190b = Boolean.valueOf(z);
        }
        if (!this.f86190b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f86190b.booleanValue();
    }

    /* renamed from: f */
    public final synchronized String m35489f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2 = this.f86189a;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(InstructionFileId.DOT)) {
                    this.f86189a = context.getPackageName() + serviceInfo.name;
                } else {
                    this.f86189a = serviceInfo.name;
                }
                return this.f86189a;
            }
            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* renamed from: g */
    public int m35488g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f86192d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m35494a(context, intent2);
    }
}
