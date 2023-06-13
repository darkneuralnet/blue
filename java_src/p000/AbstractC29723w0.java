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
/* renamed from: w0 */
/* loaded from: classes.dex */
public abstract class AbstractC29723w0<V> implements ListenableFuture<V> {

    /* renamed from: e */
    public static final boolean f115107e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f */
    public static final Logger f115108f = Logger.getLogger(AbstractC29723w0.class.getName());

    /* renamed from: g */
    public static final AbstractC29725b f115109g;

    /* renamed from: h */
    public static final Object f115110h;

    /* renamed from: b */
    public volatile Object f115111b;

    /* renamed from: c */
    public volatile C29729e f115112c;

    /* renamed from: d */
    public volatile C29733i f115113d;

    /* renamed from: w0$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC29725b {
        private AbstractC29725b() {
        }

        /* renamed from: a */
        public abstract boolean mo7590a(AbstractC29723w0<?> abstractC29723w0, C29729e c29729e, C29729e c29729e2);

        /* renamed from: b */
        public abstract boolean mo7589b(AbstractC29723w0<?> abstractC29723w0, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo7588c(AbstractC29723w0<?> abstractC29723w0, C29733i c29733i, C29733i c29733i2);

        /* renamed from: d */
        public abstract void mo7587d(C29733i c29733i, C29733i c29733i2);

        /* renamed from: e */
        public abstract void mo7586e(C29733i c29733i, Thread thread);
    }

    /* renamed from: w0$c */
    /* loaded from: classes.dex */
    public static final class C29726c {

        /* renamed from: c */
        public static final C29726c f115114c;

        /* renamed from: d */
        public static final C29726c f115115d;

        /* renamed from: a */
        public final boolean f115116a;

        /* renamed from: b */
        public final Throwable f115117b;

        static {
            if (AbstractC29723w0.f115107e) {
                f115115d = null;
                f115114c = null;
                return;
            }
            f115115d = new C29726c(false, null);
            f115114c = new C29726c(true, null);
        }

        public C29726c(boolean z, Throwable th) {
            this.f115116a = z;
            this.f115117b = th;
        }
    }

    /* renamed from: w0$d */
    /* loaded from: classes.dex */
    public static final class C29727d {

        /* renamed from: b */
        public static final C29727d f115118b = new C29727d(new C29728a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        public final Throwable f115119a;

        /* renamed from: w0$d$a */
        /* loaded from: classes.dex */
        public class C29728a extends Throwable {
            public C29728a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public C29727d(Throwable th) {
            this.f115119a = (Throwable) AbstractC29723w0.m7605d(th);
        }
    }

    /* renamed from: w0$e */
    /* loaded from: classes.dex */
    public static final class C29729e {

        /* renamed from: d */
        public static final C29729e f115120d = new C29729e(null, null);

        /* renamed from: a */
        public final Runnable f115121a;

        /* renamed from: b */
        public final Executor f115122b;

        /* renamed from: c */
        public C29729e f115123c;

        public C29729e(Runnable runnable, Executor executor) {
            this.f115121a = runnable;
            this.f115122b = executor;
        }
    }

    /* renamed from: w0$f */
    /* loaded from: classes.dex */
    public static final class C29730f extends AbstractC29725b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C29733i, Thread> f115124a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C29733i, C29733i> f115125b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractC29723w0, C29733i> f115126c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractC29723w0, C29729e> f115127d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractC29723w0, Object> f115128e;

        public C29730f(AtomicReferenceFieldUpdater<C29733i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C29733i, C29733i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC29723w0, C29733i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC29723w0, C29729e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC29723w0, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f115124a = atomicReferenceFieldUpdater;
            this.f115125b = atomicReferenceFieldUpdater2;
            this.f115126c = atomicReferenceFieldUpdater3;
            this.f115127d = atomicReferenceFieldUpdater4;
            this.f115128e = atomicReferenceFieldUpdater5;
        }

        @Override // p000.AbstractC29723w0.AbstractC29725b
        /* renamed from: a */
        public boolean mo7590a(AbstractC29723w0<?> abstractC29723w0, C29729e c29729e, C29729e c29729e2) {
            return C22859i1.m35391a(this.f115127d, abstractC29723w0, c29729e, c29729e2);
        }

        @Override // p000.AbstractC29723w0.AbstractC29725b
        /* renamed from: b */
        public boolean mo7589b(AbstractC29723w0<?> abstractC29723w0, Object obj, Object obj2) {
            return C22859i1.m35391a(this.f115128e, abstractC29723w0, obj, obj2);
        }

        @Override // p000.AbstractC29723w0.AbstractC29725b
        /* renamed from: c */
        public boolean mo7588c(AbstractC29723w0<?> abstractC29723w0, C29733i c29733i, C29733i c29733i2) {
            return C22859i1.m35391a(this.f115126c, abstractC29723w0, c29733i, c29733i2);
        }

        @Override // p000.AbstractC29723w0.AbstractC29725b
        /* renamed from: d */
        public void mo7587d(C29733i c29733i, C29733i c29733i2) {
            this.f115125b.lazySet(c29733i, c29733i2);
        }

        @Override // p000.AbstractC29723w0.AbstractC29725b
        /* renamed from: e */
        public void mo7586e(C29733i c29733i, Thread thread) {
            this.f115124a.lazySet(c29733i, thread);
        }
    }

    /* renamed from: w0$g */
    /* loaded from: classes.dex */
    public static final class RunnableC29731g<V> implements Runnable {

        /* renamed from: b */
        public final AbstractC29723w0<V> f115129b;

        /* renamed from: c */
        public final ListenableFuture<? extends V> f115130c;

        public RunnableC29731g(AbstractC29723w0<V> abstractC29723w0, ListenableFuture<? extends V> listenableFuture) {
            this.f115129b = abstractC29723w0;
            this.f115130c = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f115129b.f115111b != this) {
                return;
            }
            if (AbstractC29723w0.f115109g.mo7589b(this.f115129b, this, AbstractC29723w0.m7600i(this.f115130c))) {
                AbstractC29723w0.m7603f(this.f115129b);
            }
        }
    }

    /* renamed from: w0$h */
    /* loaded from: classes.dex */
    public static final class C29732h extends AbstractC29725b {
        public C29732h() {
            super();
        }

        @Override // p000.AbstractC29723w0.AbstractC29725b
        /* renamed from: a */
        public boolean mo7590a(AbstractC29723w0<?> abstractC29723w0, C29729e c29729e, C29729e c29729e2) {
            synchronized (abstractC29723w0) {
                if (abstractC29723w0.f115112c == c29729e) {
                    abstractC29723w0.f115112c = c29729e2;
                    return true;
                }
                return false;
            }
        }

        @Override // p000.AbstractC29723w0.AbstractC29725b
        /* renamed from: b */
        public boolean mo7589b(AbstractC29723w0<?> abstractC29723w0, Object obj, Object obj2) {
            synchronized (abstractC29723w0) {
                if (abstractC29723w0.f115111b == obj) {
                    abstractC29723w0.f115111b = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // p000.AbstractC29723w0.AbstractC29725b
        /* renamed from: c */
        public boolean mo7588c(AbstractC29723w0<?> abstractC29723w0, C29733i c29733i, C29733i c29733i2) {
            synchronized (abstractC29723w0) {
                if (abstractC29723w0.f115113d == c29733i) {
                    abstractC29723w0.f115113d = c29733i2;
                    return true;
                }
                return false;
            }
        }

        @Override // p000.AbstractC29723w0.AbstractC29725b
        /* renamed from: d */
        public void mo7587d(C29733i c29733i, C29733i c29733i2) {
            c29733i.f115133b = c29733i2;
        }

        @Override // p000.AbstractC29723w0.AbstractC29725b
        /* renamed from: e */
        public void mo7586e(C29733i c29733i, Thread thread) {
            c29733i.f115132a = thread;
        }
    }

    /* renamed from: w0$i */
    /* loaded from: classes.dex */
    public static final class C29733i {

        /* renamed from: c */
        public static final C29733i f115131c = new C29733i(false);

        /* renamed from: a */
        public volatile Thread f115132a;

        /* renamed from: b */
        public volatile C29733i f115133b;

        public C29733i(boolean z) {
        }

        /* renamed from: a */
        public void m7585a(C29733i c29733i) {
            AbstractC29723w0.f115109g.mo7587d(this, c29733i);
        }

        /* renamed from: b */
        public void m7584b() {
            Thread thread = this.f115132a;
            if (thread != null) {
                this.f115132a = null;
                LockSupport.unpark(thread);
            }
        }

        public C29733i() {
            AbstractC29723w0.f115109g.mo7586e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC29725b c29732h;
        try {
            c29732h = new C29730f(AtomicReferenceFieldUpdater.newUpdater(C29733i.class, Thread.class, C17296a.f69688o), AtomicReferenceFieldUpdater.newUpdater(C29733i.class, C29733i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC29723w0.class, C29733i.class, DateTokenConverter.CONVERTER_KEY), AtomicReferenceFieldUpdater.newUpdater(AbstractC29723w0.class, C29729e.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC29723w0.class, Object.class, "b"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c29732h = new C29732h();
        }
        f115109g = c29732h;
        if (th != null) {
            f115108f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f115110h = new Object();
    }

    /* renamed from: c */
    public static CancellationException m7606c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: d */
    public static <T> T m7605d(T t) {
        t.getClass();
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [w0$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [w0<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [w0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [w0<V>, w0] */
    /* renamed from: f */
    public static void m7603f(AbstractC29723w0<?> abstractC29723w0) {
        C29729e c29729e = null;
        while (true) {
            abstractC29723w0.m7596m();
            abstractC29723w0.m7607b();
            C29729e m7604e = abstractC29723w0.m7604e(c29729e);
            while (m7604e != null) {
                c29729e = m7604e.f115123c;
                Runnable runnable = m7604e.f115121a;
                if (runnable instanceof RunnableC29731g) {
                    RunnableC29731g runnableC29731g = (RunnableC29731g) runnable;
                    abstractC29723w0 = runnableC29731g.f115129b;
                    if (abstractC29723w0.f115111b == runnableC29731g) {
                        if (f115109g.mo7589b(abstractC29723w0, runnableC29731g, m7600i(runnableC29731g.f115130c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m7602g(runnable, m7604e.f115122b);
                }
                m7604e = c29729e;
            }
            return;
        }
    }

    /* renamed from: g */
    public static void m7602g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f115108f;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: i */
    public static Object m7600i(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof AbstractC29723w0) {
            Object obj = ((AbstractC29723w0) listenableFuture).f115111b;
            if (obj instanceof C29726c) {
                C29726c c29726c = (C29726c) obj;
                if (c29726c.f115116a) {
                    if (c29726c.f115117b != null) {
                        return new C29726c(false, c29726c.f115117b);
                    }
                    return C29726c.f115115d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!f115107e) & isCancelled) {
            return C29726c.f115115d;
        }
        try {
            Object m7599j = m7599j(listenableFuture);
            if (m7599j == null) {
                return f115110h;
            }
            return m7599j;
        } catch (CancellationException e) {
            if (!isCancelled) {
                return new C29727d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e));
            }
            return new C29726c(false, e);
        } catch (ExecutionException e2) {
            return new C29727d(e2.getCause());
        } catch (Throwable th) {
            return new C29727d(th);
        }
    }

    /* renamed from: j */
    public static <V> V m7599j(Future<V> future) throws ExecutionException {
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
    public final void m7608a(StringBuilder sb) {
        try {
            Object m7599j = m7599j(this);
            sb.append("SUCCESS, result=[");
            sb.append(m7591s(m7599j));
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
        m7605d(runnable);
        m7605d(executor);
        C29729e c29729e = this.f115112c;
        if (c29729e != C29729e.f115120d) {
            C29729e c29729e2 = new C29729e(runnable, executor);
            do {
                c29729e2.f115123c = c29729e;
                if (f115109g.mo7590a(this, c29729e, c29729e2)) {
                    return;
                }
                c29729e = this.f115112c;
            } while (c29729e != C29729e.f115120d);
            m7602g(runnable, executor);
        }
        m7602g(runnable, executor);
    }

    /* renamed from: b */
    public void m7607b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        C29726c c29726c;
        boolean z3;
        Object obj = this.f115111b;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | (obj instanceof RunnableC29731g))) {
            return false;
        }
        if (f115107e) {
            c29726c = new C29726c(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            c29726c = C29726c.f115114c;
        } else {
            c29726c = C29726c.f115115d;
        }
        AbstractC29723w0<V> abstractC29723w0 = this;
        boolean z4 = false;
        while (true) {
            if (f115109g.mo7589b(abstractC29723w0, obj, c29726c)) {
                if (z) {
                    abstractC29723w0.m7598k();
                }
                m7603f(abstractC29723w0);
                if (!(obj instanceof RunnableC29731g)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((RunnableC29731g) obj).f115130c;
                if (listenableFuture instanceof AbstractC29723w0) {
                    abstractC29723w0 = (AbstractC29723w0) listenableFuture;
                    obj = abstractC29723w0.f115111b;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!(z3 | (obj instanceof RunnableC29731g))) {
                        return true;
                    }
                    z4 = true;
                } else {
                    listenableFuture.cancel(z);
                    return true;
                }
            } else {
                obj = abstractC29723w0.f115111b;
                if (!(obj instanceof RunnableC29731g)) {
                    return z4;
                }
            }
        }
    }

    /* renamed from: e */
    public final C29729e m7604e(C29729e c29729e) {
        C29729e c29729e2;
        do {
            c29729e2 = this.f115112c;
        } while (!f115109g.mo7590a(this, c29729e2, C29729e.f115120d));
        C29729e c29729e3 = c29729e;
        C29729e c29729e4 = c29729e2;
        while (c29729e4 != null) {
            C29729e c29729e5 = c29729e4.f115123c;
            c29729e4.f115123c = c29729e3;
            c29729e3 = c29729e4;
            c29729e4 = c29729e5;
        }
        return c29729e3;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f115111b;
            if ((obj != null) & (!(obj instanceof RunnableC29731g))) {
                return m7601h(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C29733i c29733i = this.f115113d;
                if (c29733i != C29733i.f115131c) {
                    C29733i c29733i2 = new C29733i();
                    do {
                        c29733i2.m7585a(c29733i);
                        if (f115109g.mo7588c(this, c29733i, c29733i2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f115111b;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC29731g))) {
                                        return m7601h(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m7595n(c29733i2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m7595n(c29733i2);
                        } else {
                            c29733i = this.f115113d;
                        }
                    } while (c29733i != C29733i.f115131c);
                    return m7601h(this.f115111b);
                }
                return m7601h(this.f115111b);
            }
            while (nanos > 0) {
                Object obj3 = this.f115111b;
                if ((obj3 != null) & (!(obj3 instanceof RunnableC29731g))) {
                    return m7601h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC29723w0 = toString();
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
            throw new TimeoutException(str + " for " + abstractC29723w0);
        }
        throw new InterruptedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final V m7601h(Object obj) throws ExecutionException {
        if (!(obj instanceof C29726c)) {
            if (!(obj instanceof C29727d)) {
                if (obj == f115110h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C29727d) obj).f115119a);
        }
        throw m7606c("Task was cancelled.", ((C29726c) obj).f115117b);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f115111b instanceof C29726c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj;
        boolean z;
        if (this.f115111b != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof RunnableC29731g)) & z;
    }

    /* renamed from: k */
    public void m7598k() {
    }

    /* renamed from: l */
    public String m7597l() {
        Object obj = this.f115111b;
        if (obj instanceof RunnableC29731g) {
            return "setFuture=[" + m7591s(((RunnableC29731g) obj).f115130c) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    /* renamed from: m */
    public final void m7596m() {
        C29733i c29733i;
        do {
            c29733i = this.f115113d;
        } while (!f115109g.mo7588c(this, c29733i, C29733i.f115131c));
        while (c29733i != null) {
            c29733i.m7584b();
            c29733i = c29733i.f115133b;
        }
    }

    /* renamed from: n */
    public final void m7595n(C29733i c29733i) {
        c29733i.f115132a = null;
        while (true) {
            C29733i c29733i2 = this.f115113d;
            if (c29733i2 == C29733i.f115131c) {
                return;
            }
            C29733i c29733i3 = null;
            while (c29733i2 != null) {
                C29733i c29733i4 = c29733i2.f115133b;
                if (c29733i2.f115132a != null) {
                    c29733i3 = c29733i2;
                } else if (c29733i3 != null) {
                    c29733i3.f115133b = c29733i4;
                    if (c29733i3.f115132a == null) {
                        break;
                    }
                } else if (!f115109g.mo7588c(this, c29733i2, c29733i4)) {
                    break;
                }
                c29733i2 = c29733i4;
            }
            return;
        }
    }

    /* renamed from: p */
    public boolean mo7594p(V v) {
        if (v == null) {
            v = (V) f115110h;
        }
        if (f115109g.mo7589b(this, null, v)) {
            m7603f(this);
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean mo7593q(Throwable th) {
        if (f115109g.mo7589b(this, null, new C29727d((Throwable) m7605d(th)))) {
            m7603f(this);
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean mo7592r(ListenableFuture<? extends V> listenableFuture) {
        C29727d c29727d;
        m7605d(listenableFuture);
        Object obj = this.f115111b;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f115109g.mo7589b(this, null, m7600i(listenableFuture))) {
                    return false;
                }
                m7603f(this);
                return true;
            }
            RunnableC29731g runnableC29731g = new RunnableC29731g(this, listenableFuture);
            if (f115109g.mo7589b(this, null, runnableC29731g)) {
                try {
                    listenableFuture.addListener(runnableC29731g, EnumC41313g41.INSTANCE);
                } catch (Throwable th) {
                    try {
                        c29727d = new C29727d(th);
                    } catch (Throwable unused) {
                        c29727d = C29727d.f115118b;
                    }
                    f115109g.mo7589b(this, runnableC29731g, c29727d);
                }
                return true;
            }
            obj = this.f115111b;
        }
        if (obj instanceof C29726c) {
            listenableFuture.cancel(((C29726c) obj).f115116a);
        }
        return false;
    }

    /* renamed from: s */
    public final String m7591s(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m7608a(sb);
        } else {
            try {
                str = m7597l();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m7608a(sb);
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
            Object obj2 = this.f115111b;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC29731g))) {
                return m7601h(obj2);
            }
            C29733i c29733i = this.f115113d;
            if (c29733i != C29733i.f115131c) {
                C29733i c29733i2 = new C29733i();
                do {
                    c29733i2.m7585a(c29733i);
                    if (f115109g.mo7588c(this, c29733i, c29733i2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f115111b;
                            } else {
                                m7595n(c29733i2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC29731g))));
                        return m7601h(obj);
                    }
                    c29733i = this.f115113d;
                } while (c29733i != C29733i.f115131c);
                return m7601h(this.f115111b);
            }
            return m7601h(this.f115111b);
        }
        throw new InterruptedException();
    }
}
