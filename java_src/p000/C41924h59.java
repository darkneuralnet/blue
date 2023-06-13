package p000;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: h59  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41924h59 extends ThreadPoolExecutor {

    /* renamed from: b */
    public final /* synthetic */ Ql9 f84700b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41924h59(Ql9 ql9) {
        super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.f84700b = ql9;
        setThreadFactory(new Fd9(null));
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new JZ8(this, runnable, t);
    }
}
