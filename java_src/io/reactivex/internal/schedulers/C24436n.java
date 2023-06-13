package io.reactivex.internal.schedulers;

import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.schedulers.n */
/* loaded from: classes8.dex */
public final class C24436n {

    /* renamed from: a */
    public static final boolean f90991a;

    /* renamed from: b */
    public static final int f90992b;

    /* renamed from: c */
    public static final AtomicReference<ScheduledExecutorService> f90993c = new AtomicReference<>();

    /* renamed from: d */
    public static final Map<ScheduledThreadPoolExecutor, Object> f90994d = new ConcurrentHashMap();

    /* renamed from: io.reactivex.internal.schedulers.n$a */
    /* loaded from: classes8.dex */
    public static final class RunnableC24437a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(C24436n.f90994d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C24436n.f90994d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.n$b */
    /* loaded from: classes8.dex */
    public static final class C24438b implements InterfaceC23492o<String, String> {
        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public String apply(String str) throws Exception {
            return System.getProperty(str);
        }
    }

    static {
        C24438b c24438b = new C24438b();
        boolean m32332b = m32332b(true, "rx2.purge-enabled", true, true, c24438b);
        f90991a = m32332b;
        f90992b = m32331c(m32332b, "rx2.purge-period-seconds", 1, 1, c24438b);
        m32330d();
    }

    private C24436n() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static ScheduledExecutorService m32333a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m32329e(f90991a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    /* renamed from: b */
    public static boolean m32332b(boolean z, String str, boolean z2, boolean z3, InterfaceC23492o<String, String> interfaceC23492o) {
        if (z) {
            try {
                String apply = interfaceC23492o.apply(str);
                if (apply == null) {
                    return z2;
                }
                return "true".equals(apply);
            } catch (Throwable unused) {
                return z2;
            }
        }
        return z3;
    }

    /* renamed from: c */
    public static int m32331c(boolean z, String str, int i, int i2, InterfaceC23492o<String, String> interfaceC23492o) {
        if (z) {
            try {
                String apply = interfaceC23492o.apply(str);
                if (apply == null) {
                    return i;
                }
                return Integer.parseInt(apply);
            } catch (Throwable unused) {
                return i;
            }
        }
        return i2;
    }

    /* renamed from: d */
    public static void m32330d() {
        m32328f(f90991a);
    }

    /* renamed from: e */
    public static void m32329e(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f90994d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    /* renamed from: f */
    public static void m32328f(boolean z) {
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f90993c;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactoryC24431j("RxSchedulerPurge"));
            if (C42482i24.m35337a(atomicReference, scheduledExecutorService, newScheduledThreadPool)) {
                RunnableC24437a runnableC24437a = new RunnableC24437a();
                int i = f90992b;
                newScheduledThreadPool.scheduleAtFixedRate(runnableC24437a, i, i, TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }
}
