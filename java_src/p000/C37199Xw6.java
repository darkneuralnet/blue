package p000;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.ServiceConnectionC18364g;
import java.util.concurrent.TimeUnit;
/* renamed from: Xw6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37199Xw6 {

    /* renamed from: a */
    public static final long f44267a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public static final Object f44268b = new Object();

    /* renamed from: c */
    public static C36731Vw6 f44269c;

    /* renamed from: b */
    public static void m76037b(Context context) {
        if (f44269c == null) {
            C36731Vw6 c36731Vw6 = new C36731Vw6(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f44269c = c36731Vw6;
            c36731Vw6.m79096d(true);
        }
    }

    /* renamed from: c */
    public static void m76036c(Intent intent) {
        synchronized (f44268b) {
            if (f44269c != null && m76035d(intent)) {
                m76032g(intent, false);
                f44269c.m79097c();
            }
        }
    }

    /* renamed from: d */
    public static boolean m76035d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: f */
    public static void m76033f(Context context, ServiceConnectionC18364g serviceConnectionC18364g, final Intent intent) {
        synchronized (f44268b) {
            m76037b(context);
            boolean m76035d = m76035d(intent);
            m76032g(intent, true);
            if (!m76035d) {
                f44269c.m79099a(f44267a);
            }
            serviceConnectionC18364g.m47126c(intent).addOnCompleteListener(new OnCompleteListener() { // from class: Ww6
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C37199Xw6.m76036c(intent);
                }
            });
        }
    }

    /* renamed from: g */
    public static void m76032g(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* renamed from: h */
    public static ComponentName m76031h(Context context, Intent intent) {
        synchronized (f44268b) {
            m76037b(context);
            boolean m76035d = m76035d(intent);
            m76032g(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!m76035d) {
                f44269c.m79099a(f44267a);
            }
            return startService;
        }
    }
}
