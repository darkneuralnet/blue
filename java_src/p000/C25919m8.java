package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
@KeepForSdk
/* renamed from: m8 */
/* loaded from: classes5.dex */
public class C25919m8 {

    /* renamed from: a */
    public BlockingServiceConnection f97383a;

    /* renamed from: b */
    public InterfaceC35869Se8 f97384b;

    /* renamed from: c */
    public boolean f97385c;

    /* renamed from: d */
    public final Object f97386d = new Object();

    /* renamed from: e */
    public QC7 f97387e;

    /* renamed from: f */
    public final Context f97388f;

    /* renamed from: g */
    public final long f97389g;

    @KeepForSdkWithMembers
    /* renamed from: m8$a */
    /* loaded from: classes5.dex */
    public static final class C25920a {

        /* renamed from: a */
        public final String f97390a;

        /* renamed from: b */
        public final boolean f97391b;

        @Deprecated
        public C25920a(String str, boolean z) {
            this.f97390a = str;
            this.f97391b = z;
        }

        /* renamed from: a */
        public String m26300a() {
            return this.f97390a;
        }

        /* renamed from: b */
        public boolean m26299b() {
            return this.f97391b;
        }

        public String toString() {
            String str = this.f97390a;
            boolean z = this.f97391b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    @VisibleForTesting
    public C25919m8(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        Preconditions.checkNotNull(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f97388f = context;
        this.f97385c = false;
        this.f97389g = j;
    }

    @KeepForSdk
    /* renamed from: a */
    public static C25920a m26307a(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        C25919m8 c25919m8 = new C25919m8(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c25919m8.m26304d(false);
            C25920a m26302f = c25919m8.m26302f(-1);
            c25919m8.m26303e(m26302f, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return m26302f;
        } finally {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: b */
    public static void m26306b(boolean z) {
    }

    /* renamed from: c */
    public final void m26305c() {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f97388f != null && this.f97383a != null) {
                if (this.f97385c) {
                    ConnectionTracker.getInstance().unbindService(this.f97388f, this.f97383a);
                }
                this.f97385c = false;
                this.f97384b = null;
                this.f97383a = null;
            }
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    public final void m26304d(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f97385c) {
                m26305c();
            }
            Context context = this.f97388f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                if (isGooglePlayServicesAvailable != 0 && isGooglePlayServicesAvailable != 2) {
                    throw new IOException("Google Play services not available");
                }
                BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                    this.f97383a = blockingServiceConnection;
                    try {
                        this.f97384b = L68.m97762c5(blockingServiceConnection.getServiceWithTimeout(AbstractComponentTracker.LINGERING_TIMEOUT, TimeUnit.MILLISECONDS));
                        this.f97385c = true;
                        if (z) {
                            m26301g();
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new GooglePlayServicesNotAvailableException(9);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: e */
    public final boolean m26303e(C25920a c25920a, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str2 = "1";
            hashMap.put("app_context", "1");
            if (c25920a != null) {
                if (true != c25920a.m26299b()) {
                    str2 = "0";
                }
                hashMap.put("limit_ad_tracking", str2);
                String m26300a = c25920a.m26300a();
                if (m26300a != null) {
                    hashMap.put("ad_id_size", Integer.toString(m26300a.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new C50556vf7(this, hashMap).start();
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final C25920a m26302f(int i) throws IOException {
        C25920a c25920a;
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f97385c) {
                synchronized (this.f97386d) {
                    QC7 qc7 = this.f97387e;
                    if (qc7 == null || !qc7.f30034e) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m26304d(false);
                    if (!this.f97385c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            Preconditions.checkNotNull(this.f97383a);
            Preconditions.checkNotNull(this.f97384b);
            try {
                c25920a = new C25920a(this.f97384b.zzc(), this.f97384b.mo85160H(true));
            } catch (RemoteException e2) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                throw new IOException("Remote exception");
            }
        }
        m26301g();
        return c25920a;
    }

    public final void finalize() throws Throwable {
        m26305c();
        super.finalize();
    }

    /* renamed from: g */
    public final void m26301g() {
        synchronized (this.f97386d) {
            QC7 qc7 = this.f97387e;
            if (qc7 != null) {
                qc7.f30033d.countDown();
                try {
                    this.f97387e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.f97389g;
            if (j > 0) {
                this.f97387e = new QC7(this, j);
            }
        }
    }
}
