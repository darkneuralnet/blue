package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* renamed from: ha9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42208ha9<V> {

    /* renamed from: a */
    public final boolean f85495a;

    /* renamed from: b */
    public final ZP8<Mb9<? extends V>> f85496b;

    public /* synthetic */ C42208ha9(boolean z, ZP8 zp8, T99 t99) {
        this.f85495a = z;
        this.f85496b = zp8;
    }

    /* renamed from: a */
    public final <C> Mb9<C> m36177a(Callable<C> callable, Executor executor) {
        return new C40165e79(this.f85496b, this.f85495a, executor, callable);
    }

    /* renamed from: b */
    public final <C> Mb9<C> m36176b(InterfaceC38952c69<C> interfaceC38952c69, Executor executor) {
        return new C40165e79(this.f85496b, this.f85495a, executor, interfaceC38952c69);
    }
}
