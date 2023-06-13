package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* renamed from: Ac9 */
/* loaded from: classes6.dex */
public final class Ac9 extends C42228hc9 implements ScheduledExecutorService {

    /* renamed from: c */
    public final ScheduledExecutorService f876c;

    public Ac9(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f876c = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableFutureC44027ke9 m28702D = RunnableFutureC44027ke9.m28702D(runnable, null);
        return new ScheduledFutureC46379oc9(m28702D, this.f876c.schedule(m28702D, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC49936uc9 runnableC49936uc9 = new RunnableC49936uc9(runnable);
        return new ScheduledFutureC46379oc9(runnableC49936uc9, this.f876c.scheduleAtFixedRate(runnableC49936uc9, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC49936uc9 runnableC49936uc9 = new RunnableC49936uc9(runnable);
        return new ScheduledFutureC46379oc9(runnableC49936uc9, this.f876c.scheduleWithFixedDelay(runnableC49936uc9, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC44027ke9 runnableFutureC44027ke9 = new RunnableFutureC44027ke9(callable);
        return new ScheduledFutureC46379oc9(runnableFutureC44027ke9, this.f876c.schedule(runnableFutureC44027ke9, j, timeUnit));
    }
}
