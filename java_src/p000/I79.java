package p000;
/* renamed from: I79 */
/* loaded from: classes6.dex */
public final class I79 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ RunnableFutureC44027ke9 f14560b;

    /* renamed from: c */
    public final /* synthetic */ Md9 f14561c;

    /* renamed from: d */
    public final /* synthetic */ Mb9 f14562d;

    /* renamed from: e */
    public final /* synthetic */ Mb9 f14563e;

    /* renamed from: f */
    public final /* synthetic */ W79 f14564f;

    public I79(C44326l89 c44326l89, RunnableFutureC44027ke9 runnableFutureC44027ke9, Md9 md9, Mb9 mb9, Mb9 mb92, W79 w79) {
        this.f14560b = runnableFutureC44027ke9;
        this.f14561c = md9;
        this.f14562d = mb9;
        this.f14563e = mb92;
        this.f14564f = w79;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f14560b.isDone()) {
            this.f14561c.mo9251g(this.f14562d);
        } else if (this.f14563e.isCancelled() && this.f14564f.compareAndSet(O79.NOT_RUN, O79.CANCELLED)) {
            this.f14560b.cancel(false);
        }
    }
}
