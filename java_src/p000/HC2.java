package p000;
/* renamed from: HC2 */
/* loaded from: classes6.dex */
public final class HC2 {
    private HC2() {
    }

    /* renamed from: a */
    public static long m104179a(long j, long j2, long j3) {
        boolean z;
        if (j2 <= j3) {
            z = true;
        } else {
            z = false;
        }
        EZ3.m108806i(z, "min (%s) must be less than or equal to max (%s)", j2, j3);
        return Math.min(Math.max(j, j2), j3);
    }

    /* renamed from: b */
    public static int m104178b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
