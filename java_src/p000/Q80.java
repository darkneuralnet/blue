package p000;

import android.os.Handler;
import android.os.Looper;
/* renamed from: Q80 */
/* loaded from: classes.dex */
public class Q80 {
    private Q80() {
    }

    /* renamed from: a */
    public static Handler m88897a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
