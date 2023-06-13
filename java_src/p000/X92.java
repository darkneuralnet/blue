package p000;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: X92 */
/* loaded from: classes.dex */
public final class X92 implements Executor {

    /* renamed from: c */
    public static volatile Executor f42730c;

    /* renamed from: b */
    public final ExecutorService f42731b = Executors.newFixedThreadPool(2, new ThreadFactoryC9335a());

    /* renamed from: X92$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC9335a implements ThreadFactory {

        /* renamed from: b */
        public final AtomicInteger f42732b = new AtomicInteger(0);

        public ThreadFactoryC9335a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f42732b.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: a */
    public static Executor m77277a() {
        if (f42730c != null) {
            return f42730c;
        }
        synchronized (X92.class) {
            if (f42730c == null) {
                f42730c = new X92();
            }
        }
        return f42730c;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f42731b.execute(runnable);
    }
}
