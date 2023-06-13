package p000;

import android.os.Handler;
import android.os.Looper;
/* renamed from: XG2 */
/* loaded from: classes.dex */
public final class XG2 {

    /* renamed from: a */
    public static volatile Handler f42941a;

    private XG2() {
    }

    /* renamed from: a */
    public static Handler m77163a() {
        if (f42941a != null) {
            return f42941a;
        }
        synchronized (XG2.class) {
            if (f42941a == null) {
                f42941a = PE1.m90563a(Looper.getMainLooper());
            }
        }
        return f42941a;
    }
}
