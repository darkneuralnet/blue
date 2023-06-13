package p000;

import android.os.Handler;
import android.os.Looper;
/* renamed from: Q48 */
/* loaded from: classes6.dex */
public final class Q48 {

    /* renamed from: a */
    public static Thread f29807a;

    /* renamed from: b */
    public static volatile Handler f29808b;

    /* renamed from: a */
    public static Handler m88952a() {
        if (f29808b == null) {
            f29808b = new Handler(Looper.getMainLooper());
        }
        return f29808b;
    }

    /* renamed from: b */
    public static boolean m88951b() {
        if (f29807a == null) {
            f29807a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == f29807a) {
            return true;
        }
        return false;
    }
}
