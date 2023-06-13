package p000;

import android.os.StrictMode;
import java.util.concurrent.Callable;
/* renamed from: X58 */
/* loaded from: classes5.dex */
public final class X58 {
    /* renamed from: a */
    public static <T> T m77406a(Callable<T> callable) throws Exception {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
