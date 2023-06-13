package p000;

import android.os.SystemClock;
/* renamed from: pP5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC46849pP5 {
    /* renamed from: a */
    public static AbstractC46849pP5 m19336a(long j, long j2, long j3) {
        return new C20619fu(j, j2, j3);
    }

    /* renamed from: e */
    public static AbstractC46849pP5 m19332e() {
        return m19336a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    /* renamed from: b */
    public abstract long mo19335b();

    /* renamed from: c */
    public abstract long mo19334c();

    /* renamed from: d */
    public abstract long mo19333d();
}
