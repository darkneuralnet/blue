package p000;

import android.os.Looper;
/* renamed from: N36 */
/* loaded from: classes.dex */
public final class N36 {
    private N36() {
    }

    /* renamed from: a */
    public static void m94404a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Must be invoked from the main thread.");
    }
}
