package io.reactivex.internal.schedulers;

import io.reactivex.AbstractC23437E;
import io.reactivex.disposables.C23466d;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.schedulers.p */
/* loaded from: classes8.dex */
public final class C24441p extends AbstractC23437E {

    /* renamed from: d */
    public static final C24441p f91002d = new C24441p();

    /* renamed from: io.reactivex.internal.schedulers.p$a */
    /* loaded from: classes8.dex */
    public static final class RunnableC24442a implements Runnable {

        /* renamed from: b */
        public final Runnable f91003b;

        /* renamed from: c */
        public final C24444c f91004c;

        /* renamed from: d */
        public final long f91005d;

        public RunnableC24442a(Runnable runnable, C24444c c24444c, long j) {
            this.f91003b = runnable;
            this.f91004c = c24444c;
            this.f91005d = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f91004c.f91013e) {
                long m33167a = this.f91004c.m33167a(TimeUnit.MILLISECONDS);
                long j = this.f91005d;
                if (j > m33167a) {
                    try {
                        Thread.sleep(j - m33167a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        C24508a.m31988u(e);
                        return;
                    }
                }
                if (!this.f91004c.f91013e) {
                    this.f91003b.run();
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.p$b */
    /* loaded from: classes8.dex */
    public static final class C24443b implements Comparable<C24443b> {

        /* renamed from: b */
        public final Runnable f91006b;

        /* renamed from: c */
        public final long f91007c;

        /* renamed from: d */
        public final int f91008d;

        /* renamed from: e */
        public volatile boolean f91009e;

        public C24443b(Runnable runnable, Long l, int i) {
            this.f91006b = runnable;
            this.f91007c = l.longValue();
            this.f91008d = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C24443b c24443b) {
            int m32926b = C23544b.m32926b(this.f91007c, c24443b.f91007c);
            if (m32926b == 0) {
                return C23544b.m32927a(this.f91008d, c24443b.f91008d);
            }
            return m32926b;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.p$c */
    /* loaded from: classes8.dex */
    public static final class C24444c extends AbstractC23437E.AbstractC23440c {

        /* renamed from: b */
        public final PriorityBlockingQueue<C24443b> f91010b = new PriorityBlockingQueue<>();

        /* renamed from: c */
        public final AtomicInteger f91011c = new AtomicInteger();

        /* renamed from: d */
        public final AtomicInteger f91012d = new AtomicInteger();

        /* renamed from: e */
        public volatile boolean f91013e;

        /* renamed from: io.reactivex.internal.schedulers.p$c$a */
        /* loaded from: classes8.dex */
        public final class RunnableC24445a implements Runnable {

            /* renamed from: b */
            public final C24443b f91014b;

            public RunnableC24445a(C24443b c24443b) {
                this.f91014b = c24443b;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f91014b.f91009e = true;
                C24444c.this.f91010b.remove(this.f91014b);
            }
        }

        @Override // io.reactivex.AbstractC23437E.AbstractC23440c
        /* renamed from: b */
        public InterfaceC23465c mo32320b(Runnable runnable) {
            return m32318g(runnable, m33167a(TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.AbstractC23437E.AbstractC23440c
        /* renamed from: c */
        public InterfaceC23465c mo32319c(Runnable runnable, long j, TimeUnit timeUnit) {
            long m33167a = m33167a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return m32318g(new RunnableC24442a(runnable, this, m33167a), m33167a);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f91013e = true;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f91013e;
        }

        /* renamed from: g */
        public InterfaceC23465c m32318g(Runnable runnable, long j) {
            if (this.f91013e) {
                return EnumC23502e.INSTANCE;
            }
            C24443b c24443b = new C24443b(runnable, Long.valueOf(j), this.f91012d.incrementAndGet());
            this.f91010b.add(c24443b);
            if (this.f91011c.getAndIncrement() == 0) {
                int i = 1;
                while (!this.f91013e) {
                    C24443b poll = this.f91010b.poll();
                    if (poll == null) {
                        i = this.f91011c.addAndGet(-i);
                        if (i == 0) {
                            return EnumC23502e.INSTANCE;
                        }
                    } else if (!poll.f91009e) {
                        poll.f91006b.run();
                    }
                }
                this.f91010b.clear();
                return EnumC23502e.INSTANCE;
            }
            return C23466d.m33020d(new RunnableC24445a(c24443b));
        }
    }

    /* renamed from: g */
    public static C24441p m32322g() {
        return f91002d;
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: b */
    public AbstractC23437E.AbstractC23440c mo8041b() {
        return new C24444c();
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: d */
    public InterfaceC23465c mo32324d(Runnable runnable) {
        C24508a.m31986w(runnable).run();
        return EnumC23502e.INSTANCE;
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: e */
    public InterfaceC23465c mo32323e(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C24508a.m31986w(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C24508a.m31988u(e);
        }
        return EnumC23502e.INSTANCE;
    }
}
