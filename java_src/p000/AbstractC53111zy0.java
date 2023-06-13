package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: zy0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC53111zy0<T> extends FutureTask<T> {

    /* renamed from: c */
    public static final String f122521c = C50139ux2.m9434c();

    /* renamed from: b */
    public final long f122522b;

    public AbstractC53111zy0(AbstractCallableC41253fy0<T> abstractCallableC41253fy0) {
        this(abstractCallableC41253fy0, 0L);
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        String str = f122521c;
        C32290Cx2.m111214a(str, "cancel - " + z);
        return super.cancel(z);
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        if (this.f122522b > 0) {
            String str = f122521c;
            C32290Cx2.m111214a(str, "run with timeout - " + this.f122522b);
        }
        super.run();
        long j = this.f122522b;
        if (j > 0) {
            try {
                get(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                C32290Cx2.m111213b(f122521c, "InterruptedException", e);
            } catch (ExecutionException e2) {
                C32290Cx2.m111213b(f122521c, "ExecutionException", e2);
            } catch (TimeoutException unused) {
                String str2 = f122521c;
                C32290Cx2.m111212c(str2, "Task timed out after " + this.f122522b + " milliseconds.");
                cancel(true);
            }
        }
    }

    public AbstractC53111zy0(AbstractCallableC41253fy0<T> abstractCallableC41253fy0, long j) {
        super(abstractCallableC41253fy0);
        this.f122522b = j;
    }
}
