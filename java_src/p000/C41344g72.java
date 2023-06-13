package p000;
/* renamed from: g72  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41344g72 extends AbstractC41937h72 {
    private C41344g72() {
    }

    /* renamed from: a */
    public static int m39992a(int i, int i2, int i3) {
        boolean z;
        if (i2 <= i3) {
            z = true;
        } else {
            z = false;
        }
        EZ3.m108808g(z, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: b */
    public static int m39991b(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
