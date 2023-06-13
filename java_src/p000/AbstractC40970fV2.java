package p000;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: fV2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40970fV2<Params, Progress, Result> {

    /* renamed from: g */
    public static final ThreadFactory f80219g;

    /* renamed from: h */
    public static final BlockingQueue<Runnable> f80220h;

    /* renamed from: i */
    public static final Executor f80221i;

    /* renamed from: j */
    public static HandlerC20437f f80222j;

    /* renamed from: k */
    public static volatile Executor f80223k;

    /* renamed from: b */
    public final AbstractCallableC20439h<Params, Result> f80224b;

    /* renamed from: c */
    public final FutureTask<Result> f80225c;

    /* renamed from: d */
    public volatile EnumC20438g f80226d = EnumC20438g.PENDING;

    /* renamed from: e */
    public final AtomicBoolean f80227e = new AtomicBoolean();

    /* renamed from: f */
    public final AtomicBoolean f80228f = new AtomicBoolean();

    /* renamed from: fV2$a */
    /* loaded from: classes.dex */
    public static class ThreadFactoryC20432a implements ThreadFactory {

        /* renamed from: b */
        public final AtomicInteger f80229b = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f80229b.getAndIncrement());
        }
    }

    /* renamed from: fV2$b */
    /* loaded from: classes.dex */
    public class C20433b extends AbstractCallableC20439h<Params, Result> {
        public C20433b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            AbstractC40970fV2.this.f80228f.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) AbstractC40970fV2.this.mo28397b(this.f80239b);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* renamed from: fV2$c */
    /* loaded from: classes.dex */
    public class C20434c extends FutureTask<Result> {
        public C20434c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                AbstractC40970fV2.this.m41271m(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException unused) {
                AbstractC40970fV2.this.m41271m(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: fV2$d */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C20435d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f80232a;

        static {
            int[] iArr = new int[EnumC20438g.values().length];
            f80232a = iArr;
            try {
                iArr[EnumC20438g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80232a[EnumC20438g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: fV2$e */
    /* loaded from: classes.dex */
    public static class C20436e<Data> {

        /* renamed from: a */
        public final AbstractC40970fV2 f80233a;

        /* renamed from: b */
        public final Data[] f80234b;

        public C20436e(AbstractC40970fV2 abstractC40970fV2, Data... dataArr) {
            this.f80233a = abstractC40970fV2;
            this.f80234b = dataArr;
        }
    }

    /* renamed from: fV2$f */
    /* loaded from: classes.dex */
    public static class HandlerC20437f extends Handler {
        public HandlerC20437f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C20436e c20436e = (C20436e) message.obj;
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    c20436e.f80233a.m41273k(c20436e.f80234b);
                    return;
                }
                return;
            }
            c20436e.f80233a.m41278d(c20436e.f80234b[0]);
        }
    }

    /* renamed from: fV2$g */
    /* loaded from: classes.dex */
    public enum EnumC20438g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: fV2$h */
    /* loaded from: classes.dex */
    public static abstract class AbstractCallableC20439h<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        public Params[] f80239b;
    }

    static {
        ThreadFactoryC20432a threadFactoryC20432a = new ThreadFactoryC20432a();
        f80219g = threadFactoryC20432a;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f80220h = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactoryC20432a);
        f80221i = threadPoolExecutor;
        f80223k = threadPoolExecutor;
    }

    public AbstractC40970fV2() {
        C20433b c20433b = new C20433b();
        this.f80224b = c20433b;
        this.f80225c = new C20434c(c20433b);
    }

    /* renamed from: e */
    public static Handler m41277e() {
        HandlerC20437f handlerC20437f;
        synchronized (AbstractC40970fV2.class) {
            if (f80222j == null) {
                f80222j = new HandlerC20437f();
            }
            handlerC20437f = f80222j;
        }
        return handlerC20437f;
    }

    /* renamed from: a */
    public final boolean m41280a(boolean z) {
        this.f80227e.set(true);
        return this.f80225c.cancel(z);
    }

    /* renamed from: b */
    public abstract Result mo28397b(Params... paramsArr);

    /* renamed from: c */
    public final AbstractC40970fV2<Params, Progress, Result> m41279c(Executor executor, Params... paramsArr) {
        if (this.f80226d != EnumC20438g.PENDING) {
            int i = C20435d.f80232a[this.f80226d.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        this.f80226d = EnumC20438g.RUNNING;
        m41274j();
        this.f80224b.f80239b = paramsArr;
        executor.execute(this.f80225c);
        return this;
    }

    /* renamed from: d */
    public void m41278d(Result result) {
        if (m41276f()) {
            mo28396h(result);
        } else {
            mo28395i(result);
        }
        this.f80226d = EnumC20438g.FINISHED;
    }

    /* renamed from: f */
    public final boolean m41276f() {
        return this.f80227e.get();
    }

    /* renamed from: g */
    public void m41275g() {
    }

    /* renamed from: h */
    public void mo28396h(Result result) {
        m41275g();
    }

    /* renamed from: i */
    public void mo28395i(Result result) {
    }

    /* renamed from: j */
    public void m41274j() {
    }

    /* renamed from: k */
    public void m41273k(Progress... progressArr) {
    }

    /* renamed from: l */
    public Result m41272l(Result result) {
        m41277e().obtainMessage(1, new C20436e(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: m */
    public void m41271m(Result result) {
        if (!this.f80228f.get()) {
            m41272l(result);
        }
    }
}
