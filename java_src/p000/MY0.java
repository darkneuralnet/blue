package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: MY0 */
/* loaded from: classes.dex */
public class MY0 extends AbstractC45753nZ5 {

    /* renamed from: a */
    public final Object f23233a = new Object();

    /* renamed from: b */
    public final ExecutorService f23234b = Executors.newFixedThreadPool(4, new ThreadFactoryC5310a());

    /* renamed from: c */
    public volatile Handler f23235c;

    /* renamed from: MY0$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC5310a implements ThreadFactory {

        /* renamed from: b */
        public final AtomicInteger f23236b = new AtomicInteger(0);

        public ThreadFactoryC5310a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f23236b.getAndIncrement());
            return thread;
        }
    }

    /* renamed from: MY0$b */
    /* loaded from: classes.dex */
    public static class C5311b {
        private C5311b() {
        }

        /* renamed from: a */
        public static Handler m95173a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* renamed from: e */
    public static Handler m95174e(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C5311b.m95173a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p000.AbstractC45753nZ5
    /* renamed from: a */
    public void mo23536a(Runnable runnable) {
        this.f23234b.execute(runnable);
    }

    @Override // p000.AbstractC45753nZ5
    /* renamed from: c */
    public boolean mo23534c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p000.AbstractC45753nZ5
    /* renamed from: d */
    public void mo23533d(Runnable runnable) {
        if (this.f23235c == null) {
            synchronized (this.f23233a) {
                if (this.f23235c == null) {
                    this.f23235c = m95174e(Looper.getMainLooper());
                }
            }
        }
        this.f23235c.post(runnable);
    }
}
