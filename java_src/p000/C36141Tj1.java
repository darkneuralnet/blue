package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.ServiceConnectionC18364g;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
@KeepForSdk
/* renamed from: Tj1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36141Tj1 {

    /* renamed from: c */
    public static final Object f35983c = new Object();

    /* renamed from: d */
    public static ServiceConnectionC18364g f35984d;

    /* renamed from: a */
    public final Context f35985a;

    /* renamed from: b */
    public final Executor f35986b = new ExecutorC49647u74();

    public C36141Tj1(Context context) {
        this.f35985a = context;
    }

    /* renamed from: d */
    public static Task<Integer> m83071d(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (C42414hv5.m35493b().m35490e(context)) {
            C37199Xw6.m76033f(context, m83070e(context, "com.google.firebase.MESSAGING_EVENT"), intent);
        } else {
            m83070e(context, "com.google.firebase.MESSAGING_EVENT").m47126c(intent);
        }
        return Tasks.forResult(-1);
    }

    /* renamed from: e */
    public static ServiceConnectionC18364g m83070e(Context context, String str) {
        ServiceConnectionC18364g serviceConnectionC18364g;
        synchronized (f35983c) {
            if (f35984d == null) {
                f35984d = new ServiceConnectionC18364g(context, str);
            }
            serviceConnectionC18364g = f35984d;
        }
        return serviceConnectionC18364g;
    }

    /* renamed from: f */
    public static /* synthetic */ Integer m83069f(Context context, Intent intent) throws Exception {
        return Integer.valueOf(C42414hv5.m35493b().m35488g(context, intent));
    }

    /* renamed from: h */
    public static /* synthetic */ Task m83067h(Context context, Intent intent, Task task) throws Exception {
        if (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) {
            return m83071d(context, intent).continueWith(new ExecutorC49647u74(), new Continuation() { // from class: Sj1
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Integer valueOf;
                    valueOf = Integer.valueOf((int) Constants.BUCKET_ACCESS_FORBIDDEN_STATUS_CODE);
                    return valueOf;
                }
            });
        }
        return task;
    }

    @KeepForSdk
    /* renamed from: i */
    public Task<Integer> m83066i(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return m83065j(this.f35985a, intent);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: j */
    public Task<Integer> m83065j(final Context context, final Intent intent) {
        boolean z;
        boolean z2 = true;
        if (PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        } else {
            z = false;
        }
        if ((intent.getFlags() & 268435456) == 0) {
            z2 = false;
        }
        if (z && !z2) {
            return m83071d(context, intent);
        }
        return Tasks.call(this.f35986b, new Callable() { // from class: Qj1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer m83069f;
                m83069f = C36141Tj1.m83069f(context, intent);
                return m83069f;
            }
        }).continueWithTask(this.f35986b, new Continuation() { // from class: Rj1
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m83067h;
                m83067h = C36141Tj1.m83067h(context, intent, task);
                return m83067h;
            }
        });
    }
}
