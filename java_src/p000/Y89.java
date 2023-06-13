package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* renamed from: Y89 */
/* loaded from: classes6.dex */
public abstract class Y89<V> extends J89<V> implements Mb9<V> {
    @Override // p000.J89
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Future mo75540b() {
        throw null;
    }

    /* renamed from: c */
    public abstract Mb9<? extends V> mo75539c();

    @Override // p000.Mb9
    /* renamed from: o */
    public final void mo9243o(Runnable runnable, Executor executor) {
        mo75539c().mo9243o(runnable, executor);
    }
}
