package p000;
/* renamed from: Lc6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C34211Lc6 {
    /* renamed from: a */
    public static /* synthetic */ long m96583a(long j, long j2) {
        if (j2 < 0) {
            return (j ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? j : j - j2;
        } else if (j >= 0) {
            return j % j2;
        } else {
            long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
            if ((j3 ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE)) {
                j2 = 0;
            }
            return j3 - j2;
        }
    }
}
