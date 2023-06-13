package p000;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C18357c;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.C38054ac3;
import p000.C52428yp0;
/* renamed from: j51  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C43102j51 {

    /* renamed from: a */
    public final ExecutorService f92120a;

    /* renamed from: b */
    public final Context f92121b;

    /* renamed from: c */
    public final C18357c f92122c;

    public C43102j51(Context context, C18357c c18357c, ExecutorService executorService) {
        this.f92120a = executorService;
        this.f92121b = context;
        this.f92122c = c18357c;
    }

    /* renamed from: a */
    public boolean m31150a() {
        if (this.f92122c.m47171a("gcm.n.noui")) {
            return true;
        }
        if (m31149b()) {
            return false;
        }
        C48103rX1 m31147d = m31147d();
        C52428yp0.C30707a m2545e = C52428yp0.m2545e(this.f92121b, this.f92122c);
        m31146e(m2545e.f120223a, m31147d);
        m31148c(m2545e);
        return true;
    }

    /* renamed from: b */
    public final boolean m31149b() {
        if (((KeyguardManager) this.f92121b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f92121b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                if (runningAppProcessInfo.importance != 100) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void m31148c(C52428yp0.C30707a c30707a) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f92121b.getSystemService(TransferService.INTENT_KEY_NOTIFICATION)).notify(c30707a.f120224b, c30707a.f120225c, c30707a.f120223a.m71057c());
    }

    /* renamed from: d */
    public final C48103rX1 m31147d() {
        C48103rX1 m15822d = C48103rX1.m15822d(this.f92122c.m47156p("gcm.n.image"));
        if (m15822d != null) {
            m15822d.m15819i(this.f92120a);
        }
        return m15822d;
    }

    /* renamed from: e */
    public final void m31146e(C38054ac3.C10770e c10770e, C48103rX1 c48103rX1) {
        if (c48103rX1 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(c48103rX1.m15821f(), 5L, TimeUnit.SECONDS);
            c10770e.m71041s(bitmap);
            c10770e.m71065D(new C38054ac3.C10764b().m71081i(bitmap).m71082h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            c48103rX1.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            c48103rX1.close();
        }
    }
}
