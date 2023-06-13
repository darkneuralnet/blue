package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
@KeepForSdk
/* renamed from: zU2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C52819zU2 extends JI7 {

    /* renamed from: c */
    public static final ThreadLocal f121408c = new ThreadLocal();

    /* renamed from: b */
    public final ThreadPoolExecutor f121409b;

    public C52819zU2() {
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: eH8
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return defaultThreadFactory.newThread(new Runnable() { // from class: AA8
                    @Override // java.lang.Runnable
                    public final void run() {
                        C52819zU2.m1322d(runnable);
                    }
                });
            }
        });
        this.f121409b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* renamed from: d */
    public static /* synthetic */ void m1322d(Runnable runnable) {
        f121408c.set(new ArrayDeque());
        runnable.run();
    }

    /* renamed from: e */
    public static void m1321e(Deque deque, Runnable runnable) {
        Preconditions.checkNotNull(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // p000.JI7, p000.AbstractC37119Xn7
    /* renamed from: a */
    public final /* synthetic */ Object mo1325a() {
        return this.f121409b;
    }

    @Override // p000.JI7
    /* renamed from: b */
    public final ExecutorService mo1324b() {
        return this.f121409b;
    }

    @Override // p000.JI7, java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f121408c.get();
        if (deque != null && deque.size() <= 1) {
            m1321e(deque, runnable);
        } else {
            this.f121409b.execute(new Runnable() { // from class: GN8
                @Override // java.lang.Runnable
                public final void run() {
                    C52819zU2.m1321e((Deque) C52819zU2.f121408c.get(), runnable);
                }
            });
        }
    }
}
