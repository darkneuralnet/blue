package p000;
/* renamed from: Ud9 */
/* loaded from: classes6.dex */
public final class Ud9 extends Fb9<Mb9> {

    /* renamed from: d */
    public final InterfaceC38952c69 f37705d;

    /* renamed from: e */
    public final /* synthetic */ RunnableFutureC44027ke9 f37706e;

    public Ud9(RunnableFutureC44027ke9 runnableFutureC44027ke9, InterfaceC38952c69 interfaceC38952c69) {
        this.f37706e = runnableFutureC44027ke9;
        interfaceC38952c69.getClass();
        this.f37705d = interfaceC38952c69;
    }

    @Override // p000.Fb9
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Mb9 mo61097a() throws Exception {
        Mb9 zza = this.f37705d.zza();
        C52142yK8.m3661d(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f37705d);
        return zza;
    }

    @Override // p000.Fb9
    /* renamed from: b */
    public final String mo61096b() {
        return this.f37705d.toString();
    }

    @Override // p000.Fb9
    /* renamed from: d */
    public final void mo61095d(Throwable th) {
        this.f37706e.m9234x(th);
    }

    @Override // p000.Fb9
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo61094e(Mb9 mb9) {
        this.f37706e.mo9251g(mb9);
    }

    @Override // p000.Fb9
    /* renamed from: f */
    public final boolean mo61093f() {
        return this.f37706e.isDone();
    }
}
