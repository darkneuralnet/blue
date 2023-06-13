package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;
/* renamed from: ZG2 */
/* loaded from: classes.dex */
public final class ZG2 {

    /* renamed from: a */
    public static volatile ScheduledExecutorService f48138a;

    private ZG2() {
    }

    /* renamed from: a */
    public static ScheduledExecutorService m73378a() {
        if (f48138a != null) {
            return f48138a;
        }
        synchronized (ZG2.class) {
            if (f48138a == null) {
                f48138a = new VE1(new Handler(Looper.getMainLooper()));
            }
        }
        return f48138a;
    }
}
