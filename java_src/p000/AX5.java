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
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: AX5 */
/* loaded from: classes6.dex */
public class AX5 implements Runnable {

    /* renamed from: b */
    public final long f685b;

    /* renamed from: c */
    public final PowerManager.WakeLock f686c;

    /* renamed from: d */
    public final FirebaseMessaging f687d;
    @VisibleForTesting
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: e */
    public ExecutorService f688e = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    @VisibleForTesting
    /* renamed from: AX5$a */
    /* loaded from: classes6.dex */
    public static class C0121a extends BroadcastReceiver {

        /* renamed from: a */
        public AX5 f689a;

        public C0121a(AX5 ax5) {
            this.f689a = ax5;
        }

        /* renamed from: a */
        public void m115654a() {
            if (AX5.m115657c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f689a.m115658b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AX5 ax5 = this.f689a;
            if (ax5 == null || !ax5.m115656d()) {
                return;
            }
            if (AX5.m115657c()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.f689a.f687d.enqueueTaskWithDelaySeconds(this.f689a, 0L);
            this.f689a.m115658b().unregisterReceiver(this);
            this.f689a = null;
        }
    }

    @VisibleForTesting
    @SuppressLint({"InvalidWakeLockTag"})
    public AX5(FirebaseMessaging firebaseMessaging, long j) {
        this.f687d = firebaseMessaging;
        this.f685b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m115658b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f686c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    public static boolean m115657c() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public Context m115658b() {
        return this.f687d.getApplicationContext();
    }

    /* renamed from: d */
    public boolean m115656d() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) m115658b().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    /* renamed from: e */
    public boolean m115655e() throws IOException {
        try {
            if (this.f687d.blockingGetToken() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            } else {
                return true;
            }
        } catch (IOException e) {
            if (ZC1.m73625h(e.getMessage())) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (C42414hv5.m35493b().m35490e(m115658b())) {
            this.f686c.acquire();
        }
        try {
            try {
                this.f687d.setSyncScheduledOrRunning(true);
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                this.f687d.setSyncScheduledOrRunning(false);
                if (!C42414hv5.m35493b().m35490e(m115658b())) {
                    return;
                }
            }
            if (!this.f687d.isGmsCorePresent()) {
                this.f687d.setSyncScheduledOrRunning(false);
                if (C42414hv5.m35493b().m35490e(m115658b())) {
                    this.f686c.release();
                }
            } else if (C42414hv5.m35493b().m35491d(m115658b()) && !m115656d()) {
                new C0121a(this).m115654a();
                if (C42414hv5.m35493b().m35490e(m115658b())) {
                    this.f686c.release();
                }
            } else {
                if (m115655e()) {
                    this.f687d.setSyncScheduledOrRunning(false);
                } else {
                    this.f687d.syncWithDelaySecondsInternal(this.f685b);
                }
                if (!C42414hv5.m35493b().m35490e(m115658b())) {
                    return;
                }
                this.f686c.release();
            }
        } catch (Throwable th) {
            if (C42414hv5.m35493b().m35490e(m115658b())) {
                this.f686c.release();
            }
            throw th;
        }
    }
}
