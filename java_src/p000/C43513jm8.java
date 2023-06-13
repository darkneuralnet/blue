package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: jm8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43513jm8 implements InterfaceC48177re8 {
    private C43513jm8() {
    }

    @Override // p000.InterfaceC48177re8
    /* renamed from: f */
    public final ExecutorService mo15624f(int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
