package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: h1 */
/* loaded from: classes.dex */
public abstract class AbstractC22530h1<V> implements ListenableFuture<V> {

    /* renamed from: e */
    public static final boolean f84595e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f */
    public static final Logger f84596f = Logger.getLogger(AbstractC22530h1.class.getName());

    /* renamed from: g */
    public static final AbstractC22532b f84597g;

    /* renamed from: h */
    public static final Object f84598h;

    /* renamed from: b */
    public volatile Object f84599b;

    /* renamed from: c */
    public volatile C22536e f84600c;

    /* renamed from: d */
    public volatile C22540i f84601d;

    /* renamed from: h1$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC22532b {
        private AbstractC22532b() {
        }

        /* renamed from: a */
        public abstract boolean mo37211a(AbstractC22530h1<?> abstractC22530h1, C22536e c22536e, C22536e c22536e2);

        /* renamed from: b */
        public abstract boolean mo37210b(AbstractC22530h1<?> abstractC22530h1, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo37209c(AbstractC22530h1<?> abstractC22530h1, C22540i c22540i, C22540i c22540i2);

        /* renamed from: d */
        public abstract void mo37208d(C22540i c22540i, C22540i c22540i2);

        /* renamed from: e */
        public abstract void mo37207e(C22540i c22540i, Thread thread);
    }

    /* renamed from: h1$c */
    /* loaded from: classes.dex */
    public static final class C22533c {

        /* renamed from: c */
        public static final C22533c f84602c;

        /* renamed from: d */
        public static final C22533c f84603d;

        /* renamed from: a */
        public final boolean f84604a;

        /* renamed from: b */
        public final Throwable f84605b;

        static {
            if (AbstractC22530h1.f84595e) {
                f84603d = null;
                f84602c = null;
                return;
            }
            f84603d = new C22533c(false, null);
            f84602c = new C22533c(true, null);
        }

        public C22533c(boolean z, Throwable th) {
            this.f84604a = z;
            this.f84605b = th;
        }
    }

    /* renamed from: h1$d */
    /* loaded from: classes.dex */
    public static final class C22534d {

        /* renamed from: b */
        public static final C22534d f84606b = new C22534d(new C22535a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        public final Throwable f84607a;

        /* renamed from: h1$d$a */
        /* loaded from: classes.dex */
        public class C22535a extends Throwable {
            public C22535a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public C22534d(Throwable th) {
            this.f84607a = (Throwable) AbstractC22530h1.m37226d(th);
        }
    }

    /* renamed from: h1$e */
    /* loaded from: classes.dex */
    public static final class C22536e {

        /* renamed from: d */
        public static final C22536e f84608d = new C22536e(null, null);

        /* renamed from: a */
        public final Runnable f84609a;

        /* renamed from: b */
        public final Executor f84610b;

        /* renamed from: c */
        public C22536e f84611c;

        public C22536e(Runnable runnable, Executor executor) {
            this.f84609a = runnable;
            this.f84610b = executor;
        }
    }

    /* renamed from: h1$f */
    /* loaded from: classes.dex */
    public static final class C22537f extends AbstractC22532b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C22540i, Thread> f84612a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C22540i, C22540i> f84613b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractC22530h1, C22540i> f84614c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractC22530h1, C22536e> f84615d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractC22530h1, Object> f84616e;

        public C22537f(AtomicReferenceFieldUpdater<C22540i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C22540i, C22540i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC22530h1, C22540i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC22530h1, C22536e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC22530h1, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f84612a = atomicReferenceFieldUpdater;
            this.f84613b = atomicReferenceFieldUpdater2;
            this.f84614c = atomicReferenceFieldUpdater3;
            this.f84615d = atomicReferenceFieldUpdater4;
            this.f84616e = atomicReferenceFieldUpdater5;
        }

        @Override // p000.AbstractC22530h1.AbstractC22532b
        /* renamed from: a */
        public boolean mo37211a(AbstractC22530h1<?> abstractC22530h1, C22536e c22536e, C22536e c22536e2) {
            return C22859i1.m35391a(this.f84615d, abstractC22530h1, c22536e, c22536e2);
        }

        @Override // p000.AbstractC22530h1.AbstractC22532b
        /* renamed from: b */
        public boolean mo37210b(AbstractC22530h1<?> abstractC22530h1, Object obj, Object obj2) {
            return C22859i1.m35391a(this.f84616e, abstractC22530h1, obj, obj2);
        }

        @Override // p000.AbstractC22530h1.AbstractC22532b
        /* renamed from: c */
        public boolean mo37209c(AbstractC22530h1<?> abstractC22530h1, C22540i c22540i, C22540i c22540i2) {
            return C22859i1.m35391a(this.f84614c, abstractC22530h1, c22540i, c22540i2);
        }

        @Override // p000.AbstractC22530h1.AbstractC22532b
        /* renamed from: d */
        public void mo37208d(C22540i c22540i, C22540i c22540i2) {
            this.f84613b.lazySet(c22540i, c22540i2);
        }

        @Override // p000.AbstractC22530h1.AbstractC22532b
        /* renamed from: e */
        public void mo37207e(C22540i c22540i, Thread thread) {
            this.f84612a.lazySet(c22540i, thread);
        }
    }

    /* renamed from: h1$g */
    /* loaded from: classes.dex */
    public static final class RunnableC22538g<V> implements Runnable {

        /* renamed from: b */
        public final AbstractC22530h1<V> f84617b;

        /* renamed from: c */
        public final ListenableFuture<? extends V> f84618c;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f84617b.f84599b != this) {
                return;
            }
            if (AbstractC22530h1.f84597g.mo37210b(this.f84617b, this, AbstractC22530h1.m37221i(this.f84618c))) {
                AbstractC22530h1.m37224f(this.f84617b);
            }
        }
    }

    /* renamed from: h1$h */
    /* loaded from: classes.dex */
    public static final class C22539h extends AbstractC22532b {
        public C22539h() {
            super();
        }

        @Override // p000.AbstractC22530h1.AbstractC22532b
        /* renamed from: a */
        public boolean mo37211a(AbstractC22530h1<?> abstractC22530h1, C22536e c22536e, C22536e c22536e2) {
            synchronized (abstractC22530h1) {
                if (abstractC22530h1.f84600c == c22536e) {
                    abstractC22530h1.f84600c = c22536e2;
                    return true;
                }
                return false;
            }
        }

        @Override // p000.AbstractC22530h1.AbstractC22532b
        /* renamed from: b */
        public boolean mo37210b(AbstractC22530h1<?> abstractC22530h1, Object obj, Object obj2) {
            synchronized (abstractC22530h1) {
                if (abstractC22530h1.f84599b == obj) {
                    abstractC22530h1.f84599b = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // p000.AbstractC22530h1.AbstractC22532b
        /* renamed from: c */
        public boolean mo37209c(AbstractC22530h1<?> abstractC22530h1, C22540i c22540i, C22540i c22540i2) {
            synchronized (abstractC22530h1) {
                if (abstractC22530h1.f84601d == c22540i) {
                    abstractC22530h1.f84601d = c22540i2;
                    return true;
                }
                return false;
            }
        }

        @Override // p000.AbstractC22530h1.AbstractC22532b
        /* renamed from: d */
        public void mo37208d(C22540i c22540i, C22540i c22540i2) {
            c22540i.f84621b = c22540i2;
        }

        @Override // p000.AbstractC22530h1.AbstractC22532b
        /* renamed from: e */
        public void mo37207e(C22540i c22540i, Thread thread) {
            c22540i.f84620a = thread;
        }
    }

    /* renamed from: h1$i */
    /* loaded from: classes.dex */
    public static final class C22540i {

        /* renamed from: c */
        public static final C22540i f84619c = new C22540i(false);

        /* renamed from: a */
        public volatile Thread f84620a;

        /* renamed from: b */
        public volatile C22540i f84621b;

        public C22540i(boolean z) {
        }

        /* renamed from: a */
        public void m37206a(C22540i c22540i) {
            AbstractC22530h1.f84597g.mo37208d(this, c22540i);
        }

        /* renamed from: b */
        public void m37205b() {
            Thread thread = this.f84620a;
            if (thread != null) {
                this.f84620a = null;
                LockSupport.unpark(thread);
            }
        }

        public C22540i() {
            AbstractC22530h1.f84597g.mo37207e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC22532b c22539h;
        try {
            c22539h = new C22537f(AtomicReferenceFieldUpdater.newUpdater(C22540i.class, Thread.class, C17296a.f69688o), AtomicReferenceFieldUpdater.newUpdater(C22540i.class, C22540i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC22530h1.class, C22540i.class, DateTokenConverter.CONVERTER_KEY), AtomicReferenceFieldUpdater.newUpdater(AbstractC22530h1.class, C22536e.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC22530h1.class, Object.class, "b"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c22539h = new C22539h();
        }
        f84597g = c22539h;
        if (th != null) {
            f84596f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f84598h = new Object();
    }

    /* renamed from: c */
    public static CancellationException m37227c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: d */
    static <T> T m37226d(T t) {
        t.getClass();
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [h1$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [h1<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [h1] */
    /* JADX WARN: Type inference failed for: r4v6, types: [h1<V>, h1] */
    /* renamed from: f */
    public static void m37224f(AbstractC22530h1<?> abstractC22530h1) {
        C22536e c22536e = null;
        while (true) {
            abstractC22530h1.m37217m();
            abstractC22530h1.mo37228b();
            C22536e m37225e = abstractC22530h1.m37225e(c22536e);
            while (m37225e != null) {
                c22536e = m37225e.f84611c;
                Runnable runnable = m37225e.f84609a;
                if (runnable instanceof RunnableC22538g) {
                    RunnableC22538g runnableC22538g = (RunnableC22538g) runnable;
                    abstractC22530h1 = runnableC22538g.f84617b;
                    if (abstractC22530h1.f84599b == runnableC22538g) {
                        if (f84597g.mo37210b(abstractC22530h1, runnableC22538g, m37221i(runnableC22538g.f84618c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m37223g(runnable, m37225e.f84610b);
                }
                m37225e = c22536e;
            }
            return;
        }
    }

    /* renamed from: g */
    public static void m37223g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f84596f;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: i */
    static Object m37221i(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof AbstractC22530h1) {
            Object obj = ((AbstractC22530h1) listenableFuture).f84599b;
            if (obj instanceof C22533c) {
                C22533c c22533c = (C22533c) obj;
                if (c22533c.f84604a) {
                    if (c22533c.f84605b != null) {
                        return new C22533c(false, c22533c.f84605b);
                    }
                    return C22533c.f84603d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!f84595e) & isCancelled) {
            return C22533c.f84603d;
        }
        try {
            Object m37220j = m37220j(listenableFuture);
            if (m37220j == null) {
                return f84598h;
            }
            return m37220j;
        } catch (CancellationException e) {
            if (!isCancelled) {
                return new C22534d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e));
            }
            return new C22533c(false, e);
        } catch (ExecutionException e2) {
            return new C22534d(e2.getCause());
        } catch (Throwable th) {
            return new C22534d(th);
        }
    }

    /* renamed from: j */
    static <V> V m37220j(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: a */
    public final void m37229a(StringBuilder sb) {
        try {
            Object m37220j = m37220j(this);
            sb.append("SUCCESS, result=[");
            sb.append(m37213r(m37220j));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        m37226d(runnable);
        m37226d(executor);
        C22536e c22536e = this.f84600c;
        if (c22536e != C22536e.f84608d) {
            C22536e c22536e2 = new C22536e(runnable, executor);
            do {
                c22536e2.f84611c = c22536e;
                if (f84597g.mo37211a(this, c22536e, c22536e2)) {
                    return;
                }
                c22536e = this.f84600c;
            } while (c22536e != C22536e.f84608d);
            m37223g(runnable, executor);
        }
        m37223g(runnable, executor);
    }

    /* renamed from: b */
    public void mo37228b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        C22533c c22533c;
        boolean z3;
        Object obj = this.f84599b;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | (obj instanceof RunnableC22538g))) {
            return false;
        }
        if (f84595e) {
            c22533c = new C22533c(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            c22533c = C22533c.f84602c;
        } else {
            c22533c = C22533c.f84603d;
        }
        AbstractC22530h1<V> abstractC22530h1 = this;
        boolean z4 = false;
        while (true) {
            if (f84597g.mo37210b(abstractC22530h1, obj, c22533c)) {
                if (z) {
                    abstractC22530h1.m37219k();
                }
                m37224f(abstractC22530h1);
                if (!(obj instanceof RunnableC22538g)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((RunnableC22538g) obj).f84618c;
                if (listenableFuture instanceof AbstractC22530h1) {
                    abstractC22530h1 = (AbstractC22530h1) listenableFuture;
                    obj = abstractC22530h1.f84599b;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!(z3 | (obj instanceof RunnableC22538g))) {
                        return true;
                    }
                    z4 = true;
                } else {
                    listenableFuture.cancel(z);
                    return true;
                }
            } else {
                obj = abstractC22530h1.f84599b;
                if (!(obj instanceof RunnableC22538g)) {
                    return z4;
                }
            }
        }
    }

    /* renamed from: e */
    public final C22536e m37225e(C22536e c22536e) {
        C22536e c22536e2;
        do {
            c22536e2 = this.f84600c;
        } while (!f84597g.mo37211a(this, c22536e2, C22536e.f84608d));
        C22536e c22536e3 = c22536e;
        C22536e c22536e4 = c22536e2;
        while (c22536e4 != null) {
            C22536e c22536e5 = c22536e4.f84611c;
            c22536e4.f84611c = c22536e3;
            c22536e3 = c22536e4;
            c22536e4 = c22536e5;
        }
        return c22536e3;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f84599b;
            if ((obj != null) & (!(obj instanceof RunnableC22538g))) {
                return m37222h(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C22540i c22540i = this.f84601d;
                if (c22540i != C22540i.f84619c) {
                    C22540i c22540i2 = new C22540i();
                    do {
                        c22540i2.m37206a(c22540i);
                        if (f84597g.mo37209c(this, c22540i, c22540i2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f84599b;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC22538g))) {
                                        return m37222h(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m37216n(c22540i2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m37216n(c22540i2);
                        } else {
                            c22540i = this.f84601d;
                        }
                    } while (c22540i != C22540i.f84619c);
                    return m37222h(this.f84599b);
                }
                return m37222h(this.f84599b);
            }
            while (nanos > 0) {
                Object obj3 = this.f84599b;
                if ((obj3 != null) & (!(obj3 instanceof RunnableC22538g))) {
                    return m37222h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC22530h1 = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + abstractC22530h1);
        }
        throw new InterruptedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final V m37222h(Object obj) throws ExecutionException {
        if (!(obj instanceof C22533c)) {
            if (!(obj instanceof C22534d)) {
                if (obj == f84598h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C22534d) obj).f84607a);
        }
        throw m37227c("Task was cancelled.", ((C22533c) obj).f84605b);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f84599b instanceof C22533c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj;
        boolean z;
        if (this.f84599b != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof RunnableC22538g)) & z;
    }

    /* renamed from: k */
    public void m37219k() {
    }

    /* renamed from: l */
    public String mo37218l() {
        Object obj = this.f84599b;
        if (obj instanceof RunnableC22538g) {
            return "setFuture=[" + m37213r(((RunnableC22538g) obj).f84618c) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    /* renamed from: m */
    public final void m37217m() {
        C22540i c22540i;
        do {
            c22540i = this.f84601d;
        } while (!f84597g.mo37209c(this, c22540i, C22540i.f84619c));
        while (c22540i != null) {
            c22540i.m37205b();
            c22540i = c22540i.f84621b;
        }
    }

    /* renamed from: n */
    public final void m37216n(C22540i c22540i) {
        c22540i.f84620a = null;
        while (true) {
            C22540i c22540i2 = this.f84601d;
            if (c22540i2 == C22540i.f84619c) {
                return;
            }
            C22540i c22540i3 = null;
            while (c22540i2 != null) {
                C22540i c22540i4 = c22540i2.f84621b;
                if (c22540i2.f84620a != null) {
                    c22540i3 = c22540i2;
                } else if (c22540i3 != null) {
                    c22540i3.f84621b = c22540i4;
                    if (c22540i3.f84620a == null) {
                        break;
                    }
                } else if (!f84597g.mo37209c(this, c22540i2, c22540i4)) {
                    break;
                }
                c22540i2 = c22540i4;
            }
            return;
        }
    }

    /* renamed from: p */
    public boolean mo37215p(V v) {
        if (v == null) {
            v = (V) f84598h;
        }
        if (f84597g.mo37210b(this, null, v)) {
            m37224f(this);
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean mo37214q(Throwable th) {
        if (f84597g.mo37210b(this, null, new C22534d((Throwable) m37226d(th)))) {
            m37224f(this);
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final String m37213r(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    /* renamed from: s */
    public final boolean m37212s() {
        Object obj = this.f84599b;
        if ((obj instanceof C22533c) && ((C22533c) obj).f84604a) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m37229a(sb);
        } else {
            try {
                str = mo37218l();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m37229a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f84599b;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC22538g))) {
                return m37222h(obj2);
            }
            C22540i c22540i = this.f84601d;
            if (c22540i != C22540i.f84619c) {
                C22540i c22540i2 = new C22540i();
                do {
                    c22540i2.m37206a(c22540i);
                    if (f84597g.mo37209c(this, c22540i, c22540i2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f84599b;
                            } else {
                                m37216n(c22540i2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC22538g))));
                        return m37222h(obj);
                    }
                    c22540i = this.f84601d;
                } while (c22540i != C22540i.f84619c);
                return m37222h(this.f84599b);
            }
            return m37222h(this.f84599b);
        }
        throw new InterruptedException();
    }
}
