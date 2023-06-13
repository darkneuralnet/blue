package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* renamed from: NM1 */
/* loaded from: classes.dex */
public final class NM1 implements Executor {

    /* renamed from: c */
    public static volatile Executor f24480c;

    /* renamed from: b */
    public final ExecutorService f24481b = Executors.newSingleThreadExecutor(new ThreadFactoryC5560a());

    /* renamed from: NM1$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC5560a implements ThreadFactory {
        public ThreadFactoryC5560a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    /* renamed from: a */
    public static Executor m94031a() {
        if (f24480c != null) {
            return f24480c;
        }
        synchronized (NM1.class) {
            if (f24480c == null) {
                f24480c = new NM1();
            }
        }
        return f24480c;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f24481b.execute(runnable);
    }
}
