package p000;
/* renamed from: lC7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44362lC7 {

    /* renamed from: b */
    public final Object f95715b = new Object();

    /* renamed from: c */
    public long f95716c = Long.MIN_VALUE;

    /* renamed from: a */
    public final long f95714a = Math.round(30000.0d);

    public C44362lC7(double d) {
    }

    /* renamed from: a */
    public final boolean m27670a() {
        synchronized (this.f95715b) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f95716c + this.f95714a > currentTimeMillis) {
                return false;
            }
            this.f95716c = currentTimeMillis;
            return true;
        }
    }
}
