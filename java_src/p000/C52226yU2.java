package p000;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
@KeepForSdk
/* renamed from: yU2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C52226yU2 {

    /* renamed from: b */
    public static final Object f119596b = new Object();

    /* renamed from: c */
    public static C52226yU2 f119597c;

    /* renamed from: a */
    public C40610et0 f119598a;

    private C52226yU2() {
    }

    @KeepForSdk
    /* renamed from: c */
    public static C52226yU2 m3451c() {
        boolean z;
        C52226yU2 c52226yU2;
        synchronized (f119596b) {
            if (f119597c != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "MlKitContext has not been initialized");
            c52226yU2 = (C52226yU2) Preconditions.checkNotNull(f119597c);
        }
        return c52226yU2;
    }

    /* renamed from: d */
    public static C52226yU2 m3450d(Context context) {
        boolean z;
        C52226yU2 c52226yU2;
        synchronized (f119596b) {
            if (f119597c == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "MlKitContext is already initialized");
            C52226yU2 c52226yU22 = new C52226yU2();
            f119597c = c52226yU22;
            Context m3449e = m3449e(context);
            C40610et0 m42432e = C40610et0.m42448l(TaskExecutors.MAIN_THREAD).m42433d(C35987Ss0.m84730c(m3449e, MlKitComponentDiscoveryService.class).m84731b()).m42435b(C32711Es0.m108295s(m3449e, Context.class, new Class[0])).m42435b(C32711Es0.m108295s(c52226yU22, C52226yU2.class, new Class[0])).m42432e();
            c52226yU22.f119598a = m42432e;
            m42432e.m42445o(true);
            c52226yU2 = f119597c;
        }
        return c52226yU2;
    }

    /* renamed from: e */
    public static Context m3449e(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @KeepForSdk
    /* renamed from: a */
    public <T> T m3453a(Class<T> cls) {
        boolean z;
        if (f119597c == this) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.f119598a);
        return (T) this.f119598a.get(cls);
    }

    @KeepForSdk
    /* renamed from: b */
    public Context m3452b() {
        return (Context) m3453a(Context.class);
    }
}
