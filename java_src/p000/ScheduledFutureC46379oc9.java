package p000;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* renamed from: oc9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ScheduledFutureC46379oc9<V> extends R89<V> implements ScheduledFuture<V> {

    /* renamed from: c */
    public final ScheduledFuture<?> f102201c;

    public ScheduledFutureC46379oc9(Mb9<V> mb9, ScheduledFuture<?> scheduledFuture) {
        super(mb9);
        this.f102201c = scheduledFuture;
    }

    @Override // p000.J89, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = mo75540b().cancel(z);
        if (cancel) {
            this.f102201c.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f102201c.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f102201c.getDelay(timeUnit);
    }
}
