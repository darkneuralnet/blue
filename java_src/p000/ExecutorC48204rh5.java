package p000;

import java.util.concurrent.Executor;
/* renamed from: rh5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class ExecutorC48204rh5 implements Executor {

    /* renamed from: b */
    public final Executor f107500b;

    /* renamed from: rh5$a */
    /* loaded from: classes5.dex */
    public static class RunnableC27980a implements Runnable {

        /* renamed from: b */
        public final Runnable f107501b;

        public RunnableC27980a(Runnable runnable) {
            this.f107501b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f107501b.run();
            } catch (Exception e) {
                C35800Rx2.m86170d("Executor", "Background execution failure.", e);
            }
        }
    }

    public ExecutorC48204rh5(Executor executor) {
        this.f107500b = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f107500b.execute(new RunnableC27980a(runnable));
    }
}
