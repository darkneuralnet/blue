package io.reactivex.internal.schedulers;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: io.reactivex.internal.schedulers.j */
/* loaded from: classes8.dex */
public final class ThreadFactoryC24431j extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* renamed from: b */
    public final String f90983b;

    /* renamed from: c */
    public final int f90984c;

    /* renamed from: d */
    public final boolean f90985d;

    /* renamed from: io.reactivex.internal.schedulers.j$a */
    /* loaded from: classes8.dex */
    public static final class C24432a extends Thread implements InterfaceC24430i {
        public C24432a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public ThreadFactoryC24431j(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread;
        String str = this.f90983b + CoreConstants.DASH_CHAR + incrementAndGet();
        if (this.f90985d) {
            thread = new C24432a(runnable, str);
        } else {
            thread = new Thread(runnable, str);
        }
        thread.setPriority(this.f90984c);
        thread.setDaemon(true);
        return thread;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f90983b + "]";
    }

    public ThreadFactoryC24431j(String str, int i) {
        this(str, i, false);
    }

    public ThreadFactoryC24431j(String str, int i, boolean z) {
        this.f90983b = str;
        this.f90984c = i;
        this.f90985d = z;
    }
}
