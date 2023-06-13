package p000;
/* renamed from: fQ3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40926fQ3 {

    /* renamed from: a */
    public C40333eQ3 f80083a;

    /* renamed from: b */
    public C40333eQ3 f80084b;

    /* renamed from: a */
    public synchronized void m41410a(C40333eQ3 c40333eQ3) {
        try {
            if (c40333eQ3 != null) {
                C40333eQ3 c40333eQ32 = this.f80084b;
                if (c40333eQ32 != null) {
                    c40333eQ32.f78387c = c40333eQ3;
                    this.f80084b = c40333eQ3;
                } else if (this.f80083a == null) {
                    this.f80084b = c40333eQ3;
                    this.f80083a = c40333eQ3;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } else {
                throw new NullPointerException("null cannot be enqueued");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public synchronized C40333eQ3 m41409b() {
        C40333eQ3 c40333eQ3;
        c40333eQ3 = this.f80083a;
        if (c40333eQ3 != null) {
            C40333eQ3 c40333eQ32 = c40333eQ3.f78387c;
            this.f80083a = c40333eQ32;
            if (c40333eQ32 == null) {
                this.f80084b = null;
            }
        }
        return c40333eQ3;
    }

    /* renamed from: c */
    public synchronized C40333eQ3 m41408c(int i) throws InterruptedException {
        if (this.f80083a == null) {
            wait(i);
        }
        return m41409b();
    }
}
