package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* renamed from: Ko9 */
/* loaded from: classes5.dex */
public final class Ko9 {

    /* renamed from: e */
    public static Ko9 f20255e;

    /* renamed from: a */
    public final Context f20256a;

    /* renamed from: b */
    public final ScheduledExecutorService f20257b;

    /* renamed from: c */
    public ServiceConnectionC45756nZ8 f20258c = new ServiceConnectionC45756nZ8(this, null);

    /* renamed from: d */
    public int f20259d = 1;

    public Ko9(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f20257b = scheduledExecutorService;
        this.f20256a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Context m98270a(Ko9 ko9) {
        return ko9.f20256a;
    }

    /* renamed from: b */
    public static synchronized Ko9 m98269b(Context context) {
        Ko9 ko9;
        synchronized (Ko9.class) {
            if (f20255e == null) {
                P68.m90798a();
                f20255e = new Ko9(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
            ko9 = f20255e;
        }
        return ko9;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ ScheduledExecutorService m98266e(Ko9 ko9) {
        return ko9.f20257b;
    }

    /* renamed from: c */
    public final Task<Void> m98268c(int i, Bundle bundle) {
        return m98264g(new C44336l99(m98265f(), 2, bundle));
    }

    /* renamed from: d */
    public final Task<Bundle> m98267d(int i, Bundle bundle) {
        return m98264g(new C52990zl9(m98265f(), 1, bundle));
    }

    /* renamed from: f */
    public final synchronized int m98265f() {
        int i;
        i = this.f20259d;
        this.f20259d = i + 1;
        return i;
    }

    /* renamed from: g */
    public final synchronized <T> Task<T> m98264g(AbstractC46389od9<T> abstractC46389od9) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(abstractC46389od9);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f20258c.m23507g(abstractC46389od9)) {
            ServiceConnectionC45756nZ8 serviceConnectionC45756nZ8 = new ServiceConnectionC45756nZ8(this, null);
            this.f20258c = serviceConnectionC45756nZ8;
            serviceConnectionC45756nZ8.m23507g(abstractC46389od9);
        }
        return abstractC46389od9.f102232b.getTask();
    }
}
