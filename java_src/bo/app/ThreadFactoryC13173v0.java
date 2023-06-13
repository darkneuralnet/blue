package bo.app;

import java.lang.Thread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: bo.app.v0 */
/* loaded from: classes.dex */
public class ThreadFactoryC13173v0 implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f59366a;

    /* renamed from: b */
    private final String f59367b;

    /* renamed from: c */
    private Thread.UncaughtExceptionHandler f59368c;

    public ThreadFactoryC13173v0() {
        this.f59366a = new AtomicInteger(1);
        this.f59367b = ThreadFactoryC13173v0.class.getSimpleName();
    }

    /* renamed from: a */
    public void m62879a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f59368c = uncaughtExceptionHandler;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f59367b + " #" + this.f59366a.getAndIncrement());
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f59368c;
        if (uncaughtExceptionHandler != null) {
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        return thread;
    }

    public ThreadFactoryC13173v0(String str) {
        this.f59366a = new AtomicInteger(1);
        this.f59367b = str;
    }
}
