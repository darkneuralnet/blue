package com.google.common.util.concurrent;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class ThreadFactoryBuilder {
    private String nameFormat = null;
    private Boolean daemon = null;
    private Integer priority = null;
    private Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
    private ThreadFactory backingThreadFactory = null;

    private static ThreadFactory doBuild(ThreadFactoryBuilder threadFactoryBuilder) {
        AtomicLong atomicLong;
        final String str = threadFactoryBuilder.nameFormat;
        final Boolean bool = threadFactoryBuilder.daemon;
        final Integer num = threadFactoryBuilder.priority;
        final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadFactoryBuilder.uncaughtExceptionHandler;
        ThreadFactory threadFactory = threadFactoryBuilder.backingThreadFactory;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        final ThreadFactory threadFactory2 = threadFactory;
        if (str != null) {
            atomicLong = new AtomicLong(0L);
        } else {
            atomicLong = null;
        }
        final AtomicLong atomicLong2 = atomicLong;
        return new ThreadFactory() { // from class: com.google.common.util.concurrent.ThreadFactoryBuilder.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread newThread = threadFactory2.newThread(runnable);
                String str2 = str;
                if (str2 != null) {
                    AtomicLong atomicLong3 = atomicLong2;
                    Objects.requireNonNull(atomicLong3);
                    newThread.setName(ThreadFactoryBuilder.format(str2, Long.valueOf(atomicLong3.getAndIncrement())));
                }
                Boolean bool2 = bool;
                if (bool2 != null) {
                    newThread.setDaemon(bool2.booleanValue());
                }
                Integer num2 = num;
                if (num2 != null) {
                    newThread.setPriority(num2.intValue());
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandler;
                if (uncaughtExceptionHandler2 != null) {
                    newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler2);
                }
                return newThread;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String format(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory build() {
        return doBuild(this);
    }

    public ThreadFactoryBuilder setDaemon(boolean z) {
        this.daemon = Boolean.valueOf(z);
        return this;
    }

    public ThreadFactoryBuilder setNameFormat(String str) {
        format(str, 0);
        this.nameFormat = str;
        return this;
    }

    public ThreadFactoryBuilder setPriority(int i) {
        boolean z;
        boolean z2 = false;
        if (i >= 1) {
            z = true;
        } else {
            z = false;
        }
        EZ3.m108808g(z, "Thread priority (%s) must be >= %s", i, 1);
        if (i <= 10) {
            z2 = true;
        }
        EZ3.m108808g(z2, "Thread priority (%s) must be <= %s", i, 10);
        this.priority = Integer.valueOf(i);
        return this;
    }

    public ThreadFactoryBuilder setThreadFactory(ThreadFactory threadFactory) {
        this.backingThreadFactory = (ThreadFactory) EZ3.m108801n(threadFactory);
        return this;
    }

    public ThreadFactoryBuilder setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) EZ3.m108801n(uncaughtExceptionHandler);
        return this;
    }
}
