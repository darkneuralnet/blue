package io.reactivex.internal.schedulers;

import io.reactivex.AbstractC23437E;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.C23505h;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.disposables.InterfaceC23500c;
import io.reactivex.internal.queue.C24406a;
import io.reactivex.plugins.C24508a;
import io.reactivex.schedulers.C24542a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.schedulers.d */
/* loaded from: classes8.dex */
public final class C24416d extends AbstractC23437E {

    /* renamed from: f */
    public static final AbstractC23437E f90933f = C24542a.m31931d();

    /* renamed from: d */
    public final boolean f90934d;

    /* renamed from: e */
    public final Executor f90935e;

    /* renamed from: io.reactivex.internal.schedulers.d$a */
    /* loaded from: classes8.dex */
    public final class RunnableC24417a implements Runnable {

        /* renamed from: b */
        public final RunnableC24418b f90936b;

        public RunnableC24417a(RunnableC24418b runnableC24418b) {
            this.f90936b = runnableC24418b;
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC24418b runnableC24418b = this.f90936b;
            runnableC24418b.f90939c.m32981a(C24416d.this.mo32324d(runnableC24418b));
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.d$b */
    /* loaded from: classes8.dex */
    public static final class RunnableC24418b extends AtomicReference<Runnable> implements Runnable, InterfaceC23465c {
        private static final long serialVersionUID = -4101336210206799084L;

        /* renamed from: b */
        public final C23505h f90938b;

        /* renamed from: c */
        public final C23505h f90939c;

        public RunnableC24418b(Runnable runnable) {
            super(runnable);
            this.f90938b = new C23505h();
            this.f90939c = new C23505h();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (getAndSet(null) != null) {
                this.f90938b.dispose();
                this.f90939c.dispose();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet(null);
                    C23505h c23505h = this.f90938b;
                    EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
                    c23505h.lazySet(enumC23501d);
                    this.f90939c.lazySet(enumC23501d);
                } catch (Throwable th) {
                    lazySet(null);
                    this.f90938b.lazySet(EnumC23501d.DISPOSED);
                    this.f90939c.lazySet(EnumC23501d.DISPOSED);
                    throw th;
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.d$c */
    /* loaded from: classes8.dex */
    public static final class RunnableC24419c extends AbstractC23437E.AbstractC23440c implements Runnable {

        /* renamed from: b */
        public final boolean f90940b;

        /* renamed from: c */
        public final Executor f90941c;

        /* renamed from: e */
        public volatile boolean f90943e;

        /* renamed from: f */
        public final AtomicInteger f90944f = new AtomicInteger();

        /* renamed from: g */
        public final C23464b f90945g = new C23464b();

        /* renamed from: d */
        public final C24406a<Runnable> f90942d = new C24406a<>();

        /* renamed from: io.reactivex.internal.schedulers.d$c$a */
        /* loaded from: classes8.dex */
        public static final class RunnableC24420a extends AtomicBoolean implements Runnable, InterfaceC23465c {
            private static final long serialVersionUID = -2421395018820541164L;

            /* renamed from: b */
            public final Runnable f90946b;

            public RunnableC24420a(Runnable runnable) {
                this.f90946b = runnable;
            }

            @Override // io.reactivex.disposables.InterfaceC23465c
            public void dispose() {
                lazySet(true);
            }

            @Override // io.reactivex.disposables.InterfaceC23465c
            /* renamed from: e */
            public boolean mo1769e() {
                return get();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f90946b.run();
                } finally {
                    lazySet(true);
                }
            }
        }

        /* renamed from: io.reactivex.internal.schedulers.d$c$b */
        /* loaded from: classes8.dex */
        public static final class RunnableC24421b extends AtomicInteger implements Runnable, InterfaceC23465c {
            private static final long serialVersionUID = -3603436687413320876L;

            /* renamed from: b */
            public final Runnable f90947b;

            /* renamed from: c */
            public final InterfaceC23500c f90948c;

            /* renamed from: d */
            public volatile Thread f90949d;

            public RunnableC24421b(Runnable runnable, InterfaceC23500c interfaceC23500c) {
                this.f90947b = runnable;
                this.f90948c = interfaceC23500c;
            }

            /* renamed from: a */
            public void m32351a() {
                InterfaceC23500c interfaceC23500c = this.f90948c;
                if (interfaceC23500c != null) {
                    interfaceC23500c.mo32984b(this);
                }
            }

            @Override // io.reactivex.disposables.InterfaceC23465c
            public void dispose() {
                while (true) {
                    int i = get();
                    if (i < 2) {
                        if (i == 0) {
                            if (compareAndSet(0, 4)) {
                                m32351a();
                                return;
                            }
                        } else if (compareAndSet(1, 3)) {
                            Thread thread = this.f90949d;
                            if (thread != null) {
                                thread.interrupt();
                                this.f90949d = null;
                            }
                            set(4);
                            m32351a();
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }

            @Override // io.reactivex.disposables.InterfaceC23465c
            /* renamed from: e */
            public boolean mo1769e() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.f90949d = Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.f90947b.run();
                            this.f90949d = null;
                            if (compareAndSet(1, 2)) {
                                m32351a();
                                return;
                            }
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                            return;
                        } catch (Throwable th) {
                            this.f90949d = null;
                            if (!compareAndSet(1, 2)) {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            } else {
                                m32351a();
                            }
                            throw th;
                        }
                    }
                    this.f90949d = null;
                }
            }
        }

        /* renamed from: io.reactivex.internal.schedulers.d$c$c */
        /* loaded from: classes8.dex */
        public final class RunnableC24422c implements Runnable {

            /* renamed from: b */
            public final C23505h f90950b;

            /* renamed from: c */
            public final Runnable f90951c;

            public RunnableC24422c(C23505h c23505h, Runnable runnable) {
                this.f90950b = c23505h;
                this.f90951c = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f90950b.m32981a(RunnableC24419c.this.mo32320b(this.f90951c));
            }
        }

        public RunnableC24419c(Executor executor, boolean z) {
            this.f90941c = executor;
            this.f90940b = z;
        }

        @Override // io.reactivex.AbstractC23437E.AbstractC23440c
        /* renamed from: b */
        public InterfaceC23465c mo32320b(Runnable runnable) {
            InterfaceC23465c runnableC24420a;
            if (this.f90943e) {
                return EnumC23502e.INSTANCE;
            }
            Runnable m31986w = C24508a.m31986w(runnable);
            if (this.f90940b) {
                runnableC24420a = new RunnableC24421b(m31986w, this.f90945g);
                this.f90945g.mo32983c(runnableC24420a);
            } else {
                runnableC24420a = new RunnableC24420a(m31986w);
            }
            this.f90942d.offer(runnableC24420a);
            if (this.f90944f.getAndIncrement() == 0) {
                try {
                    this.f90941c.execute(this);
                } catch (RejectedExecutionException e) {
                    this.f90943e = true;
                    this.f90942d.clear();
                    C24508a.m31988u(e);
                    return EnumC23502e.INSTANCE;
                }
            }
            return runnableC24420a;
        }

        @Override // io.reactivex.AbstractC23437E.AbstractC23440c
        /* renamed from: c */
        public InterfaceC23465c mo32319c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return mo32320b(runnable);
            }
            if (this.f90943e) {
                return EnumC23502e.INSTANCE;
            }
            C23505h c23505h = new C23505h();
            C23505h c23505h2 = new C23505h(c23505h);
            RunnableC24435m runnableC24435m = new RunnableC24435m(new RunnableC24422c(c23505h2, C24508a.m31986w(runnable)), this.f90945g);
            this.f90945g.mo32983c(runnableC24435m);
            Executor executor = this.f90941c;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    runnableC24435m.m32334a(((ScheduledExecutorService) executor).schedule((Callable) runnableC24435m, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.f90943e = true;
                    C24508a.m31988u(e);
                    return EnumC23502e.INSTANCE;
                }
            } else {
                runnableC24435m.m32334a(new FutureC24415c(C24416d.f90933f.mo32323e(runnableC24435m, j, timeUnit)));
            }
            c23505h.m32981a(runnableC24435m);
            return c23505h2;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f90943e) {
                this.f90943e = true;
                this.f90945g.dispose();
                if (this.f90944f.getAndIncrement() == 0) {
                    this.f90942d.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90943e;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
            if (r3.f90943e == false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
            r0.clear();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
            r1 = r3.f90944f.addAndGet(-r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
            if (r1 != 0) goto L2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            C24406a<Runnable> c24406a = this.f90942d;
            int i = 1;
            while (!this.f90943e) {
                while (true) {
                    Runnable poll = c24406a.poll();
                    if (poll == null) {
                        break;
                    }
                    poll.run();
                    if (this.f90943e) {
                        c24406a.clear();
                        return;
                    }
                }
            }
            c24406a.clear();
        }
    }

    public C24416d(Executor executor, boolean z) {
        this.f90935e = executor;
        this.f90934d = z;
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: b */
    public AbstractC23437E.AbstractC23440c mo8041b() {
        return new RunnableC24419c(this.f90935e, this.f90934d);
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: d */
    public InterfaceC23465c mo32324d(Runnable runnable) {
        Runnable m31986w = C24508a.m31986w(runnable);
        try {
            if (this.f90935e instanceof ExecutorService) {
                CallableC24434l callableC24434l = new CallableC24434l(m31986w);
                callableC24434l.m32356a(((ExecutorService) this.f90935e).submit(callableC24434l));
                return callableC24434l;
            } else if (this.f90934d) {
                RunnableC24419c.RunnableC24421b runnableC24421b = new RunnableC24419c.RunnableC24421b(m31986w, null);
                this.f90935e.execute(runnableC24421b);
                return runnableC24421b;
            } else {
                RunnableC24419c.RunnableC24420a runnableC24420a = new RunnableC24419c.RunnableC24420a(m31986w);
                this.f90935e.execute(runnableC24420a);
                return runnableC24420a;
            }
        } catch (RejectedExecutionException e) {
            C24508a.m31988u(e);
            return EnumC23502e.INSTANCE;
        }
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: e */
    public InterfaceC23465c mo32323e(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable m31986w = C24508a.m31986w(runnable);
        if (this.f90935e instanceof ScheduledExecutorService) {
            try {
                CallableC24434l callableC24434l = new CallableC24434l(m31986w);
                callableC24434l.m32356a(((ScheduledExecutorService) this.f90935e).schedule(callableC24434l, j, timeUnit));
                return callableC24434l;
            } catch (RejectedExecutionException e) {
                C24508a.m31988u(e);
                return EnumC23502e.INSTANCE;
            }
        }
        RunnableC24418b runnableC24418b = new RunnableC24418b(m31986w);
        runnableC24418b.f90938b.m32981a(f90933f.mo32323e(new RunnableC24417a(runnableC24418b), j, timeUnit));
        return runnableC24418b;
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: f */
    public InterfaceC23465c mo32326f(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (this.f90935e instanceof ScheduledExecutorService) {
            try {
                RunnableC24433k runnableC24433k = new RunnableC24433k(C24508a.m31986w(runnable));
                runnableC24433k.m32356a(((ScheduledExecutorService) this.f90935e).scheduleAtFixedRate(runnableC24433k, j, j2, timeUnit));
                return runnableC24433k;
            } catch (RejectedExecutionException e) {
                C24508a.m31988u(e);
                return EnumC23502e.INSTANCE;
            }
        }
        return super.mo32326f(runnable, j, j2, timeUnit);
    }
}
