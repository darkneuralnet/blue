package io.reactivex;

import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.C23505h;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.schedulers.C24429h;
import io.reactivex.internal.util.C24475k;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.TimeUnit;
/* renamed from: io.reactivex.E */
/* loaded from: classes6.dex */
public abstract class AbstractC23437E {

    /* renamed from: b */
    public static boolean f88190b = Boolean.getBoolean("rx2.scheduler.use-nanotime");

    /* renamed from: c */
    public static final long f88191c = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: io.reactivex.E$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC23438a implements InterfaceC23465c, Runnable {

        /* renamed from: b */
        public final Runnable f88192b;

        /* renamed from: c */
        public final AbstractC23440c f88193c;

        /* renamed from: d */
        public Thread f88194d;

        public RunnableC23438a(Runnable runnable, AbstractC23440c abstractC23440c) {
            this.f88192b = runnable;
            this.f88193c = abstractC23440c;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (this.f88194d == Thread.currentThread()) {
                AbstractC23440c abstractC23440c = this.f88193c;
                if (abstractC23440c instanceof C24429h) {
                    ((C24429h) abstractC23440c).m32336j();
                    return;
                }
            }
            this.f88193c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88193c.mo1769e();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f88194d = Thread.currentThread();
            try {
                this.f88192b.run();
            } finally {
                dispose();
                this.f88194d = null;
            }
        }
    }

    /* renamed from: io.reactivex.E$b */
    /* loaded from: classes6.dex */
    public static final class RunnableC23439b implements InterfaceC23465c, Runnable {

        /* renamed from: b */
        public final Runnable f88195b;

        /* renamed from: c */
        public final AbstractC23440c f88196c;

        /* renamed from: d */
        public volatile boolean f88197d;

        public RunnableC23439b(Runnable runnable, AbstractC23440c abstractC23440c) {
            this.f88195b = runnable;
            this.f88196c = abstractC23440c;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f88197d = true;
            this.f88196c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88197d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f88197d) {
                try {
                    this.f88195b.run();
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    this.f88196c.dispose();
                    throw C24475k.m32256e(th);
                }
            }
        }
    }

    /* renamed from: io.reactivex.E$c */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC23440c implements InterfaceC23465c {

        /* renamed from: io.reactivex.E$c$a */
        /* loaded from: classes6.dex */
        public final class RunnableC23441a implements Runnable {

            /* renamed from: b */
            public final Runnable f88198b;

            /* renamed from: c */
            public final C23505h f88199c;

            /* renamed from: d */
            public final long f88200d;

            /* renamed from: e */
            public long f88201e;

            /* renamed from: f */
            public long f88202f;

            /* renamed from: g */
            public long f88203g;

            public RunnableC23441a(long j, Runnable runnable, long j2, C23505h c23505h, long j3) {
                this.f88198b = runnable;
                this.f88199c = c23505h;
                this.f88200d = j3;
                this.f88202f = j2;
                this.f88203g = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                long j;
                this.f88198b.run();
                if (!this.f88199c.mo1769e()) {
                    AbstractC23440c abstractC23440c = AbstractC23440c.this;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long m33167a = abstractC23440c.m33167a(timeUnit);
                    long j2 = AbstractC23437E.f88191c;
                    long j3 = this.f88202f;
                    if (m33167a + j2 >= j3) {
                        long j4 = this.f88200d;
                        if (m33167a < j3 + j4 + j2) {
                            long j5 = this.f88203g;
                            long j6 = this.f88201e + 1;
                            this.f88201e = j6;
                            j = j5 + (j6 * j4);
                            this.f88202f = m33167a;
                            this.f88199c.m32981a(AbstractC23440c.this.mo32319c(this, j - m33167a, timeUnit));
                        }
                    }
                    long j7 = this.f88200d;
                    long j8 = m33167a + j7;
                    long j9 = this.f88201e + 1;
                    this.f88201e = j9;
                    this.f88203g = j8 - (j7 * j9);
                    j = j8;
                    this.f88202f = m33167a;
                    this.f88199c.m32981a(AbstractC23440c.this.mo32319c(this, j - m33167a, timeUnit));
                }
            }
        }

        /* renamed from: a */
        public long m33167a(TimeUnit timeUnit) {
            return AbstractC23437E.m33169a(timeUnit);
        }

        /* renamed from: b */
        public InterfaceC23465c mo32320b(Runnable runnable) {
            return mo32319c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        /* renamed from: c */
        public abstract InterfaceC23465c mo32319c(Runnable runnable, long j, TimeUnit timeUnit);

        /* renamed from: d */
        public InterfaceC23465c m33166d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            C23505h c23505h = new C23505h();
            C23505h c23505h2 = new C23505h(c23505h);
            Runnable m31986w = C24508a.m31986w(runnable);
            long nanos = timeUnit.toNanos(j2);
            long m33167a = m33167a(TimeUnit.NANOSECONDS);
            InterfaceC23465c mo32319c = mo32319c(new RunnableC23441a(m33167a + timeUnit.toNanos(j), m31986w, m33167a, c23505h2, nanos), j, timeUnit);
            if (mo32319c == EnumC23502e.INSTANCE) {
                return mo32319c;
            }
            c23505h.m32981a(mo32319c);
            return c23505h2;
        }
    }

    /* renamed from: a */
    public static long m33169a(TimeUnit timeUnit) {
        if (!f88190b) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
        return timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    /* renamed from: b */
    public abstract AbstractC23440c mo8041b();

    /* renamed from: c */
    public long m33168c(TimeUnit timeUnit) {
        return m33169a(timeUnit);
    }

    /* renamed from: d */
    public InterfaceC23465c mo32324d(Runnable runnable) {
        return mo32323e(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    /* renamed from: e */
    public InterfaceC23465c mo32323e(Runnable runnable, long j, TimeUnit timeUnit) {
        AbstractC23440c mo8041b = mo8041b();
        RunnableC23438a runnableC23438a = new RunnableC23438a(C24508a.m31986w(runnable), mo8041b);
        mo8041b.mo32319c(runnableC23438a, j, timeUnit);
        return runnableC23438a;
    }

    /* renamed from: f */
    public InterfaceC23465c mo32326f(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        AbstractC23440c mo8041b = mo8041b();
        RunnableC23439b runnableC23439b = new RunnableC23439b(C24508a.m31986w(runnable), mo8041b);
        InterfaceC23465c m33166d = mo8041b.m33166d(runnableC23439b, j, j2, timeUnit);
        if (m33166d == EnumC23502e.INSTANCE) {
            return m33166d;
        }
        return runnableC23439b;
    }

    public void shutdown() {
    }
}
