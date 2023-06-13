package p000;

import android.content.Context;
import java.util.concurrent.Executors;
/* renamed from: DQ7 */
/* loaded from: classes6.dex */
public final class DQ7 {

    /* renamed from: b */
    public static volatile DQ7 f5690b;

    /* renamed from: a */
    public final C39355cn8 f5691a;

    public DQ7(Context context) {
        C46488on8 c46488on8 = new C46488on8();
        Ch9.m111870a();
        c46488on8.m20484c(Executors.unconfigurableExecutorService(Executors.newCachedThreadPool()));
        c46488on8.m20483d(new P78(ZP8.m73206A(Z88.m73658i(context).m99149b())));
        c46488on8.m20485b(C47704qq8.m16923d());
        this.f5691a = c46488on8.m20486a();
    }

    /* renamed from: a */
    public static C39355cn8 m110472a(Context context) {
        return m110471b(context).f5691a;
    }

    /* renamed from: b */
    public static synchronized DQ7 m110471b(Context context) {
        DQ7 dq7;
        synchronized (DQ7.class) {
            if (f5690b == null) {
                f5690b = new DQ7(context.getApplicationContext());
            }
            dq7 = f5690b;
        }
        return dq7;
    }
}
