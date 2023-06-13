package p000;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.C18354a;
import java.io.IOException;
/* renamed from: P56 */
/* loaded from: classes6.dex */
public class P56 implements Runnable {

    /* renamed from: g */
    public static final Object f27878g = new Object();

    /* renamed from: h */
    public static Boolean f27879h;

    /* renamed from: i */
    public static Boolean f27880i;

    /* renamed from: b */
    public final Context f27881b;

    /* renamed from: c */
    public final ET2 f27882c;

    /* renamed from: d */
    public final PowerManager.WakeLock f27883d;

    /* renamed from: e */
    public final O56 f27884e;

    /* renamed from: f */
    public final long f27885f;

    /* renamed from: P56$a */
    /* loaded from: classes6.dex */
    public class C6240a extends BroadcastReceiver {

        /* renamed from: a */
        public P56 f27886a;

        public C6240a(P56 p56) {
            this.f27886a = p56;
        }

        /* renamed from: a */
        public void m90858a() {
            if (P56.m90859j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            P56.this.f27881b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            P56 p56 = this.f27886a;
            if (p56 == null) {
                return;
            }
            if (!p56.m90860i()) {
                return;
            }
            if (P56.m90859j()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.f27886a.f27884e.m92929m(this.f27886a, 0L);
            context.unregisterReceiver(this);
            this.f27886a = null;
        }
    }

    public P56(O56 o56, Context context, ET2 et2, long j) {
        this.f27884e = o56;
        this.f27881b = context;
        this.f27885f = j;
        this.f27882c = et2;
        this.f27883d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: e */
    public static String m90864e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* renamed from: f */
    public static boolean m90863f(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f27878g) {
            Boolean bool = f27880i;
            if (bool == null) {
                booleanValue = m90862g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f27880i = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* renamed from: g */
    public static boolean m90862g(Context context, String str, Boolean bool) {
        boolean z;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", m90864e(str));
        }
        return z;
    }

    /* renamed from: h */
    public static boolean m90861h(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f27878g) {
            Boolean bool = f27879h;
            if (bool == null) {
                booleanValue = m90862g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f27879h = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* renamed from: j */
    public static boolean m90859j() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final synchronized boolean m90860i() {
        NetworkInfo networkInfo;
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f27881b.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (m90861h(this.f27881b)) {
            this.f27883d.acquire(C18354a.f74334a);
        }
        try {
            try {
                try {
                    this.f27884e.m92927o(true);
                } catch (Throwable th) {
                    if (m90861h(this.f27881b)) {
                        try {
                            this.f27883d.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                this.f27884e.m92927o(false);
                if (m90861h(this.f27881b)) {
                    wakeLock = this.f27883d;
                } else {
                    return;
                }
            }
            if (!this.f27882c.m108936g()) {
                this.f27884e.m92927o(false);
                if (m90861h(this.f27881b)) {
                    try {
                        this.f27883d.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (m90863f(this.f27881b) && !m90860i()) {
                new C6240a(this).m90858a();
                if (m90861h(this.f27881b)) {
                    try {
                        this.f27883d.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                if (this.f27884e.m92923s()) {
                    this.f27884e.m92927o(false);
                } else {
                    this.f27884e.m92922t(this.f27885f);
                }
                if (m90861h(this.f27881b)) {
                    wakeLock = this.f27883d;
                    wakeLock.release();
                }
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
