package p000;
/* renamed from: h39  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC41904h39<V> implements Runnable {

    /* renamed from: b */
    public final AbstractC50204v39<V> f84672b;

    /* renamed from: c */
    public final Mb9<? extends V> f84673c;

    public RunnableC41904h39(AbstractC50204v39<V> abstractC50204v39, Mb9<? extends V> mb9) {
        this.f84672b = abstractC50204v39;
        this.f84673c = mb9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object m9250h;
        AbstractC38922c39 abstractC38922c39;
        obj = this.f84672b.f113458b;
        if (obj != this) {
            return;
        }
        m9250h = AbstractC50204v39.m9250h(this.f84673c);
        abstractC38922c39 = AbstractC50204v39.f113456g;
        if (abstractC38922c39.mo26403d(this.f84672b, this, m9250h)) {
            AbstractC50204v39.m9258C(this.f84672b);
        }
    }
}
