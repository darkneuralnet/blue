package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
/* renamed from: ke9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableFutureC44027ke9<V> extends C49069t89<V> implements RunnableFuture<V> {

    /* renamed from: i */
    public volatile Fb9<?> f94711i;

    public RunnableFutureC44027ke9(InterfaceC38952c69<V> interfaceC38952c69) {
        this.f94711i = new Ud9(this, interfaceC38952c69);
    }

    /* renamed from: D */
    public static <V> RunnableFutureC44027ke9<V> m28702D(Runnable runnable, V v) {
        return new RunnableFutureC44027ke9<>(Executors.callable(runnable, v));
    }

    @Override // p000.AbstractC50204v39
    /* renamed from: e */
    public final String mo9253e() {
        Fb9<?> fb9 = this.f94711i;
        if (fb9 != null) {
            String valueOf = String.valueOf(fb9);
            StringBuilder sb = new StringBuilder(valueOf.length() + 7);
            sb.append("task=[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        return super.mo9253e();
    }

    @Override // p000.AbstractC50204v39
    /* renamed from: f */
    public final void mo9252f() {
        Fb9<?> fb9;
        if (m9233y() && (fb9 = this.f94711i) != null) {
            fb9.m106914g();
        }
        this.f94711i = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        Fb9<?> fb9 = this.f94711i;
        if (fb9 != null) {
            fb9.run();
        }
        this.f94711i = null;
    }

    public RunnableFutureC44027ke9(Callable<V> callable) {
        this.f94711i = new C39266ce9(this, callable);
    }
}
