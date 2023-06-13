package p000;

import android.os.Handler;
import android.os.Looper;
/* renamed from: O36 */
/* loaded from: classes.dex */
public final class O36 {
    private O36() {
    }

    /* renamed from: a */
    public static void m92961a() {
        HZ3.m103728j(m92959c(), "Not in application's main thread");
    }

    /* renamed from: b */
    public static Handler m92960b() {
        return new Handler(Looper.getMainLooper());
    }

    /* renamed from: c */
    public static boolean m92959c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: d */
    public static void m92958d(Runnable runnable) {
        if (m92959c()) {
            runnable.run();
        } else {
            HZ3.m103728j(m92960b().post(runnable), "Unable to post to main thread");
        }
    }
}
