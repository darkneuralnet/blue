package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: yu0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C52478yu0 {

    /* renamed from: yu0$a */
    /* loaded from: classes.dex */
    public static class C30770a {
        private C30770a() {
        }

        /* renamed from: a */
        public static Handler m2310a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    private C52478yu0() {
    }

    /* renamed from: b */
    public static ThreadPoolExecutor m2313b(final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: xu0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m2312c;
                m2312c = C52478yu0.m2312c(str, runnable);
                return m2312c;
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: c */
    public static /* synthetic */ Thread m2312c(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    /* renamed from: d */
    public static Handler m2311d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C30770a.m2310a(Looper.getMainLooper());
        }
        return new Handler(Looper.getMainLooper());
    }
}
