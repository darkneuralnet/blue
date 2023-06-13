package p000;
/* renamed from: n49  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC45472n49 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Mb9 f99310b;

    /* renamed from: c */
    public final /* synthetic */ int f99311c;

    /* renamed from: d */
    public final /* synthetic */ D49 f99312d;

    public RunnableC45472n49(D49 d49, Mb9 mb9, int i) {
        this.f99312d = d49;
        this.f99310b = mb9;
        this.f99311c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f99310b.isCancelled()) {
                this.f99312d.f5186m = null;
                this.f99312d.cancel(false);
            } else {
                D49.m110960P(this.f99312d, this.f99311c, this.f99310b);
            }
        } finally {
            D49.m110959Q(this.f99312d, null);
        }
    }
}
