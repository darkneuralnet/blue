package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* renamed from: P69 */
/* loaded from: classes6.dex */
public final class P69 extends X69 {

    /* renamed from: f */
    public final Callable f27906f;

    /* renamed from: g */
    public final /* synthetic */ C40165e79 f27907g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P69(C40165e79 c40165e79, Callable callable, Executor executor) {
        super(c40165e79, executor);
        this.f27907g = c40165e79;
        callable.getClass();
        this.f27906f = callable;
    }

    @Override // p000.Fb9
    /* renamed from: a */
    public final Object mo61097a() throws Exception {
        return this.f27906f.call();
    }

    @Override // p000.Fb9
    /* renamed from: b */
    public final String mo61096b() {
        return this.f27906f.toString();
    }

    @Override // p000.X69
    /* renamed from: h */
    public final void mo77369h(Object obj) {
        this.f27907g.mo9235w(obj);
    }
}
