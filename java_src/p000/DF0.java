package p000;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: DF0 */
/* loaded from: classes6.dex */
public class DF0 implements ThreadFactory {

    /* renamed from: f */
    public static final ThreadFactory f5430f = Executors.defaultThreadFactory();

    /* renamed from: b */
    public final AtomicLong f5431b = new AtomicLong();

    /* renamed from: c */
    public final String f5432c;

    /* renamed from: d */
    public final int f5433d;

    /* renamed from: e */
    public final StrictMode.ThreadPolicy f5434e;

    public DF0(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f5432c = str;
        this.f5433d = i;
        this.f5434e = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m110644b(Runnable runnable) {
        Process.setThreadPriority(this.f5433d);
        StrictMode.ThreadPolicy threadPolicy = this.f5434e;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f5430f.newThread(new Runnable() { // from class: CF0
            @Override // java.lang.Runnable
            public final void run() {
                DF0.this.m110644b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f5432c, Long.valueOf(this.f5431b.getAndIncrement())));
        return newThread;
    }
}
