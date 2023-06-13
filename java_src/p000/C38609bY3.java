package p000;

import android.annotation.SuppressLint;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: bY3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38609bY3 {

    /* renamed from: a */
    public static final InterfaceC33315Hh1 f57683a;

    /* renamed from: b */
    public static volatile InterfaceC33315Hh1 f57684b;

    /* renamed from: bY3$b */
    /* loaded from: classes6.dex */
    public static class C12443b implements InterfaceC33315Hh1 {
        private C12443b() {
        }

        @Override // p000.InterfaceC33315Hh1
        /* renamed from: a */
        public ExecutorService mo64379a(ThreadFactory threadFactory, C36 c36) {
            return m64378b(1, threadFactory, c36);
        }

        @SuppressLint({"ThreadPoolCreation"})
        /* renamed from: b */
        public ExecutorService m64378b(int i, ThreadFactory threadFactory, C36 c36) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C12443b c12443b = new C12443b();
        f57683a = c12443b;
        f57684b = c12443b;
    }

    private C38609bY3() {
    }

    /* renamed from: a */
    public static InterfaceC33315Hh1 m64380a() {
        return f57684b;
    }
}
