package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: oQ6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46266oQ6 implements InterfaceC45080mQ6 {
    private C46266oQ6() {
    }

    public /* synthetic */ C46266oQ6(C45673nQ6 c45673nQ6) {
    }

    @Override // p000.InterfaceC45080mQ6
    /* renamed from: a */
    public final ExecutorService mo21087a(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // p000.InterfaceC45080mQ6
    /* renamed from: b */
    public final ExecutorService mo21086b(int i, int i2) {
        return mo21087a(4, Executors.defaultThreadFactory(), 2);
    }

    @Override // p000.InterfaceC45080mQ6
    /* renamed from: c */
    public final ExecutorService mo21085c(ThreadFactory threadFactory, int i) {
        return mo21087a(1, threadFactory, 1);
    }
}
