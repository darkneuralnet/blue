package io.reactivex.internal.schedulers;

import io.reactivex.AbstractC23437E;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23502e;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.schedulers.f */
/* loaded from: classes8.dex */
public final class C24424f extends AbstractC23437E {

    /* renamed from: f */
    public static final ThreadFactoryC24431j f90959f;

    /* renamed from: g */
    public static final ThreadFactoryC24431j f90960g;

    /* renamed from: j */
    public static final C24427c f90963j;

    /* renamed from: k */
    public static boolean f90964k;

    /* renamed from: l */
    public static final RunnableC24425a f90965l;

    /* renamed from: d */
    public final ThreadFactory f90966d;

    /* renamed from: e */
    public final AtomicReference<RunnableC24425a> f90967e;

    /* renamed from: i */
    public static final TimeUnit f90962i = TimeUnit.SECONDS;

    /* renamed from: h */
    public static final long f90961h = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: io.reactivex.internal.schedulers.f$a */
    /* loaded from: classes8.dex */
    public static final class RunnableC24425a implements Runnable {

        /* renamed from: b */
        public final long f90968b;

        /* renamed from: c */
        public final ConcurrentLinkedQueue<C24427c> f90969c;

        /* renamed from: d */
        public final C23464b f90970d;

        /* renamed from: e */
        public final ScheduledExecutorService f90971e;

        /* renamed from: f */
        public final Future<?> f90972f;

        /* renamed from: g */
        public final ThreadFactory f90973g;

        public RunnableC24425a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long j2;
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            long j3 = j2;
            this.f90968b = j3;
            this.f90969c = new ConcurrentLinkedQueue<>();
            this.f90970d = new C23464b();
            this.f90973g = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C24424f.f90960g);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j3, j3, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.f90971e = scheduledExecutorService;
            this.f90972f = scheduledFuture;
        }

        /* renamed from: a */
        public void m32346a() {
            if (!this.f90969c.isEmpty()) {
                long m32344c = m32344c();
                Iterator<C24427c> it = this.f90969c.iterator();
                while (it.hasNext()) {
                    C24427c next = it.next();
                    if (next.m32341k() <= m32344c) {
                        if (this.f90969c.remove(next)) {
                            this.f90970d.mo32985a(next);
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public C24427c m32345b() {
            if (this.f90970d.mo1769e()) {
                return C24424f.f90963j;
            }
            while (!this.f90969c.isEmpty()) {
                C24427c poll = this.f90969c.poll();
                if (poll != null) {
                    return poll;
                }
            }
            C24427c c24427c = new C24427c(this.f90973g);
            this.f90970d.mo32983c(c24427c);
            return c24427c;
        }

        /* renamed from: c */
        public long m32344c() {
            return System.nanoTime();
        }

        /* renamed from: d */
        public void m32343d(C24427c c24427c) {
            c24427c.m32340l(m32344c() + this.f90968b);
            this.f90969c.offer(c24427c);
        }

        /* renamed from: e */
        public void m32342e() {
            this.f90970d.dispose();
            Future<?> future = this.f90972f;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f90971e;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            m32346a();
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.f$b */
    /* loaded from: classes8.dex */
    public static final class RunnableC24426b extends AbstractC23437E.AbstractC23440c implements Runnable {

        /* renamed from: c */
        public final RunnableC24425a f90975c;

        /* renamed from: d */
        public final C24427c f90976d;

        /* renamed from: e */
        public final AtomicBoolean f90977e = new AtomicBoolean();

        /* renamed from: b */
        public final C23464b f90974b = new C23464b();

        public RunnableC24426b(RunnableC24425a runnableC24425a) {
            this.f90975c = runnableC24425a;
            this.f90976d = runnableC24425a.m32345b();
        }

        @Override // io.reactivex.AbstractC23437E.AbstractC23440c
        /* renamed from: c */
        public InterfaceC23465c mo32319c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f90974b.mo1769e()) {
                return EnumC23502e.INSTANCE;
            }
            return this.f90976d.m32339g(runnable, j, timeUnit, this.f90974b);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (this.f90977e.compareAndSet(false, true)) {
                this.f90974b.dispose();
                if (C24424f.f90964k) {
                    this.f90976d.m32339g(this, 0L, TimeUnit.NANOSECONDS, null);
                } else {
                    this.f90975c.m32343d(this.f90976d);
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90977e.get();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f90975c.m32343d(this.f90976d);
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.f$c */
    /* loaded from: classes8.dex */
    public static final class C24427c extends C24429h {

        /* renamed from: d */
        public long f90978d;

        public C24427c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f90978d = 0L;
        }

        /* renamed from: k */
        public long m32341k() {
            return this.f90978d;
        }

        /* renamed from: l */
        public void m32340l(long j) {
            this.f90978d = j;
        }
    }

    static {
        C24427c c24427c = new C24427c(new ThreadFactoryC24431j("RxCachedThreadSchedulerShutdown"));
        f90963j = c24427c;
        c24427c.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        ThreadFactoryC24431j threadFactoryC24431j = new ThreadFactoryC24431j("RxCachedThreadScheduler", max);
        f90959f = threadFactoryC24431j;
        f90960g = new ThreadFactoryC24431j("RxCachedWorkerPoolEvictor", max);
        f90964k = Boolean.getBoolean("rx2.io-scheduled-release");
        RunnableC24425a runnableC24425a = new RunnableC24425a(0L, null, threadFactoryC24431j);
        f90965l = runnableC24425a;
        runnableC24425a.m32342e();
    }

    public C24424f() {
        this(f90959f);
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: b */
    public AbstractC23437E.AbstractC23440c mo8041b() {
        return new RunnableC24426b(this.f90967e.get());
    }

    /* renamed from: g */
    public void m32347g() {
        RunnableC24425a runnableC24425a = new RunnableC24425a(f90961h, f90962i, this.f90966d);
        if (!C42482i24.m35337a(this.f90967e, f90965l, runnableC24425a)) {
            runnableC24425a.m32342e();
        }
    }

    @Override // io.reactivex.AbstractC23437E
    public void shutdown() {
        RunnableC24425a runnableC24425a;
        RunnableC24425a runnableC24425a2;
        do {
            runnableC24425a = this.f90967e.get();
            runnableC24425a2 = f90965l;
            if (runnableC24425a == runnableC24425a2) {
                return;
            }
        } while (!C42482i24.m35337a(this.f90967e, runnableC24425a, runnableC24425a2));
        runnableC24425a.m32342e();
    }

    public C24424f(ThreadFactory threadFactory) {
        this.f90966d = threadFactory;
        this.f90967e = new AtomicReference<>(f90965l);
        m32347g();
    }
}
