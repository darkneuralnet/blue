package p000;

import android.os.SystemClock;
/* renamed from: H39 */
/* loaded from: classes5.dex */
public final class H39 {
    /* renamed from: a */
    public static void m104456a(C48999t19 c48999t19, int i, int i2, long j, int i3, int i4, int i5, int i6) {
        c48999t19.m13212c(m104455b(i, i2, j, i3, i4, i5, i6), GF8.INPUT_IMAGE_CONSTRUCTION);
    }

    /* renamed from: b */
    public static C51983y39 m104455b(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        return new C51983y39(i, i2, i5, i3, i4, SystemClock.elapsedRealtime() - j, i6);
    }
}
