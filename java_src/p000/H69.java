package p000;

import java.util.concurrent.Executor;
/* renamed from: H69 */
/* loaded from: classes6.dex */
public final class H69 extends X69<Mb9> {

    /* renamed from: f */
    public final InterfaceC38952c69 f12861f;

    /* renamed from: g */
    public final /* synthetic */ C40165e79 f12862g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H69(C40165e79 c40165e79, InterfaceC38952c69 interfaceC38952c69, Executor executor) {
        super(c40165e79, executor);
        this.f12862g = c40165e79;
        this.f12861f = interfaceC38952c69;
    }

    @Override // p000.Fb9
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo61097a() throws Exception {
        Mb9 zza = this.f12861f.zza();
        C52142yK8.m3661d(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f12861f);
        return zza;
    }

    @Override // p000.Fb9
    /* renamed from: b */
    public final String mo61096b() {
        return this.f12861f.toString();
    }

    @Override // p000.X69
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo77369h(Mb9 mb9) {
        this.f12862g.mo9251g(mb9);
    }
}
