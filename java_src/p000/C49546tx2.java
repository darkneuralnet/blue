package p000;

import android.annotation.TargetApi;
import android.os.SystemClock;
/* renamed from: tx2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49546tx2 {

    /* renamed from: a */
    public static final double f111404a = 1.0d / Math.pow(10.0d, 6.0d);

    private C49546tx2() {
    }

    /* renamed from: a */
    public static double m11169a(long j) {
        return (m11168b() - j) * f111404a;
    }

    @TargetApi(17)
    /* renamed from: b */
    public static long m11168b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
