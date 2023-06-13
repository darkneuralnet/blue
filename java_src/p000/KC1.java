package p000;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: KC1 */
/* loaded from: classes5.dex */
public final class KC1 implements ExecutorService {

    /* renamed from: c */
    public static final long f19250c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: d */
    public static volatile int f19251d;

    /* renamed from: b */
    public final ExecutorService f19252b;

    /* renamed from: KC1$b */
    /* loaded from: classes5.dex */
    public static final class C4371b {

        /* renamed from: a */
        public final boolean f19253a;

        /* renamed from: b */
        public int f19254b;

        /* renamed from: c */
        public int f19255c;

        /* renamed from: d */
        public final ThreadFactory f19256d = new ThreadFactoryC4372c();

        /* renamed from: e */
        public InterfaceC4376e f19257e = InterfaceC4376e.f19271d;

        /* renamed from: f */
        public String f19258f;

        /* renamed from: g */
        public long f19259g;

        public C4371b(boolean z) {
            this.f19253a = z;
        }

        /* renamed from: a */
        public KC1 m99092a() {
            if (!TextUtils.isEmpty(this.f19258f)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f19254b, this.f19255c, this.f19259g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC4374d(this.f19256d, this.f19258f, this.f19257e, this.f19253a));
                if (this.f19259g != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new KC1(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f19258f);
        }

        /* renamed from: b */
        public C4371b m99091b(String str) {
            this.f19258f = str;
            return this;
        }

        /* renamed from: c */
        public C4371b m99090c(int i) {
            this.f19254b = i;
            this.f19255c = i;
            return this;
        }
    }

    /* renamed from: KC1$c */
    /* loaded from: classes5.dex */
    public static final class ThreadFactoryC4372c implements ThreadFactory {

        /* renamed from: KC1$c$a */
        /* loaded from: classes5.dex */
        public class C4373a extends Thread {
            public C4373a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private ThreadFactoryC4372c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C4373a(runnable);
        }
    }

    /* renamed from: KC1$d */
    /* loaded from: classes5.dex */
    public static final class ThreadFactoryC4374d implements ThreadFactory {

        /* renamed from: b */
        public final ThreadFactory f19261b;

        /* renamed from: c */
        public final String f19262c;

        /* renamed from: d */
        public final InterfaceC4376e f19263d;

        /* renamed from: e */
        public final boolean f19264e;

        /* renamed from: f */
        public final AtomicInteger f19265f = new AtomicInteger();

        /* renamed from: KC1$d$a */
        /* loaded from: classes5.dex */
        public class RunnableC4375a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Runnable f19266b;

            public RunnableC4375a(Runnable runnable) {
                this.f19266b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (ThreadFactoryC4374d.this.f19264e) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f19266b.run();
                } catch (Throwable th) {
                    ThreadFactoryC4374d.this.f19263d.mo99089a(th);
                }
            }
        }

        public ThreadFactoryC4374d(ThreadFactory threadFactory, String str, InterfaceC4376e interfaceC4376e, boolean z) {
            this.f19261b = threadFactory;
            this.f19262c = str;
            this.f19263d = interfaceC4376e;
            this.f19264e = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f19261b.newThread(new RunnableC4375a(runnable));
            newThread.setName("glide-" + this.f19262c + "-thread-" + this.f19265f.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: KC1$e */
    /* loaded from: classes5.dex */
    public interface InterfaceC4376e {

        /* renamed from: a */
        public static final InterfaceC4376e f19268a = new C4377a();

        /* renamed from: b */
        public static final InterfaceC4376e f19269b;

        /* renamed from: c */
        public static final InterfaceC4376e f19270c;

        /* renamed from: d */
        public static final InterfaceC4376e f19271d;

        /* renamed from: KC1$e$a */
        /* loaded from: classes5.dex */
        public class C4377a implements InterfaceC4376e {
            @Override // p000.KC1.InterfaceC4376e
            /* renamed from: a */
            public void mo99089a(Throwable th) {
            }
        }

        /* renamed from: KC1$e$b */
        /* loaded from: classes5.dex */
        public class C4378b implements InterfaceC4376e {
            @Override // p000.KC1.InterfaceC4376e
            /* renamed from: a */
            public void mo99089a(Throwable th) {
                if (th != null && Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        /* renamed from: KC1$e$c */
        /* loaded from: classes5.dex */
        public class C4379c implements InterfaceC4376e {
            @Override // p000.KC1.InterfaceC4376e
            /* renamed from: a */
            public void mo99089a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C4378b c4378b = new C4378b();
            f19269b = c4378b;
            f19270c = new C4379c();
            f19271d = c4378b;
        }

        /* renamed from: a */
        void mo99089a(Throwable th);
    }

    public KC1(ExecutorService executorService) {
        this.f19252b = executorService;
    }

    /* renamed from: a */
    public static int m99100a() {
        if (f19251d == 0) {
            f19251d = Math.min(4, C42234hd5.m36130a());
        }
        return f19251d;
    }

    /* renamed from: b */
    public static C4371b m99099b() {
        int i;
        if (m99100a() >= 4) {
            i = 2;
        } else {
            i = 1;
        }
        return new C4371b(true).m99090c(i).m99091b("animation");
    }

    /* renamed from: c */
    public static KC1 m99098c() {
        return m99099b().m99092a();
    }

    /* renamed from: d */
    public static C4371b m99097d() {
        return new C4371b(true).m99090c(1).m99091b("disk-cache");
    }

    /* renamed from: e */
    public static KC1 m99096e() {
        return m99097d().m99092a();
    }

    /* renamed from: f */
    public static C4371b m99095f() {
        return new C4371b(false).m99090c(m99100a()).m99091b(Stripe3ds2AuthParams.FIELD_SOURCE);
    }

    /* renamed from: g */
    public static KC1 m99094g() {
        return m99095f().m99092a();
    }

    /* renamed from: h */
    public static KC1 m99093h() {
        return new KC1(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f19250c, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ThreadFactoryC4374d(new ThreadFactoryC4372c(), "source-unlimited", InterfaceC4376e.f19271d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f19252b.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f19252b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f19252b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f19252b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f19252b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f19252b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f19252b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f19252b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f19252b.submit(runnable);
    }

    public String toString() {
        return this.f19252b.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f19252b.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f19252b.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f19252b.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f19252b.submit(callable);
    }
}
