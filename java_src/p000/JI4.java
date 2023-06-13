package p000;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: JI4 */
/* loaded from: classes.dex */
public class JI4 {

    /* renamed from: JI4$a */
    /* loaded from: classes.dex */
    public static class ThreadFactoryC4009a implements ThreadFactory {

        /* renamed from: b */
        public String f17322b;

        /* renamed from: c */
        public int f17323c;

        /* renamed from: JI4$a$a */
        /* loaded from: classes.dex */
        public static class C4010a extends Thread {

            /* renamed from: b */
            public final int f17324b;

            public C4010a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f17324b = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f17324b);
                super.run();
            }
        }

        public ThreadFactoryC4009a(String str, int i) {
            this.f17322b = str;
            this.f17323c = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C4010a(runnable, this.f17322b, this.f17323c);
        }
    }

    /* renamed from: JI4$b */
    /* loaded from: classes.dex */
    public static class RunnableC4011b<T> implements Runnable {

        /* renamed from: b */
        public Callable<T> f17325b;

        /* renamed from: c */
        public InterfaceC48378rz0<T> f17326c;

        /* renamed from: d */
        public Handler f17327d;

        /* renamed from: JI4$b$a */
        /* loaded from: classes.dex */
        public class RunnableC4012a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC48378rz0 f17328b;

            /* renamed from: c */
            public final /* synthetic */ Object f17329c;

            public RunnableC4012a(InterfaceC48378rz0 interfaceC48378rz0, Object obj) {
                this.f17328b = interfaceC48378rz0;
                this.f17329c = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f17328b.accept(this.f17329c);
            }
        }

        public RunnableC4011b(Handler handler, Callable<T> callable, InterfaceC48378rz0<T> interfaceC48378rz0) {
            this.f17325b = callable;
            this.f17326c = interfaceC48378rz0;
            this.f17327d = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t;
            try {
                t = this.f17325b.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f17327d.post(new RunnableC4012a(this.f17326c, t));
        }
    }

    private JI4() {
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m100724a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC4009a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public static <T> void m100723b(Executor executor, Callable<T> callable, InterfaceC48378rz0<T> interfaceC48378rz0) {
        executor.execute(new RunnableC4011b(Q80.m88897a(), callable, interfaceC48378rz0));
    }

    /* renamed from: c */
    public static <T> T m100722c(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
