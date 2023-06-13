package p000;
/* renamed from: Ns4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC34821Ns4 {
    /* renamed from: d */
    public static AbstractC34821Ns4 m93251d(long j, long j2, AbstractC2954Gp abstractC2954Gp) {
        boolean z;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103736b(z, "duration must be positive value.");
        if (j2 < 0) {
            z2 = false;
        }
        HZ3.m103736b(z2, "bytes must be positive value.");
        return new C13324bu(j, j2, abstractC2954Gp);
    }

    /* renamed from: a */
    public abstract AbstractC2954Gp mo62170a();

    /* renamed from: b */
    public abstract long mo62169b();

    /* renamed from: c */
    public abstract long mo62168c();
}
