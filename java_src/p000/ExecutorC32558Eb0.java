package p000;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: Eb0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ExecutorC32558Eb0 implements Executor {

    /* renamed from: d */
    public static final ThreadFactory f7757d = new ThreadFactoryC1897a();

    /* renamed from: b */
    public final Object f7758b = new Object();

    /* renamed from: c */
    public ThreadPoolExecutor f7759c = m108740b();

    /* renamed from: Eb0$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC1897a implements ThreadFactory {

        /* renamed from: b */
        public final AtomicInteger f7760b = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f7760b.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: b */
    public static ThreadPoolExecutor m108740b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f7757d);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: Db0
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                C33928Jx2.m99531c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    /* renamed from: c */
    public void m108739c(InterfaceC32792Fb0 interfaceC32792Fb0) {
        ThreadPoolExecutor threadPoolExecutor;
        HZ3.m103731g(interfaceC32792Fb0);
        synchronized (this.f7758b) {
            if (this.f7759c.isShutdown()) {
                this.f7759c = m108740b();
            }
            threadPoolExecutor = this.f7759c;
        }
        int max = Math.max(1, interfaceC32792Fb0.mo10789b().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        HZ3.m103731g(runnable);
        synchronized (this.f7758b) {
            this.f7759c.execute(runnable);
        }
    }
}
