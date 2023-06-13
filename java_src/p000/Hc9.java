package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* renamed from: Hc9 */
/* loaded from: classes6.dex */
public final class Hc9 {
    /* renamed from: a */
    public static Tb9 m103650a(ExecutorService executorService) {
        Tb9 c42228hc9;
        if (executorService instanceof Tb9) {
            return (Tb9) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            c42228hc9 = new Ac9((ScheduledExecutorService) executorService);
        } else {
            c42228hc9 = new C42228hc9(executorService);
        }
        return c42228hc9;
    }

    /* renamed from: b */
    public static Executor m103649b() {
        return EnumC44316l79.INSTANCE;
    }

    /* renamed from: c */
    public static Executor m103648c(Executor executor) {
        return new ExecutorC39256cd9(executor);
    }

    /* renamed from: d */
    public static Executor m103647d(Executor executor, AbstractC50204v39<?> abstractC50204v39) {
        executor.getClass();
        if (executor == EnumC44316l79.INSTANCE) {
            return executor;
        }
        return new ExecutorC38060ac9(executor, abstractC50204v39);
    }
}
