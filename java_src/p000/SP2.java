package p000;

import android.annotation.SuppressLint;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* renamed from: SP2 */
/* loaded from: classes6.dex */
public class SP2 {

    /* renamed from: f */
    public static final C10776ad f33626f = C10776ad.m71007e();

    /* renamed from: a */
    public final ScheduledExecutorService f33627a;

    /* renamed from: b */
    public final ConcurrentLinkedQueue<C13607cd> f33628b;

    /* renamed from: c */
    public final Runtime f33629c;

    /* renamed from: d */
    public ScheduledFuture f33630d;

    /* renamed from: e */
    public long f33631e;

    @SuppressLint({"ThreadPoolCreation"})
    public SP2() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    /* renamed from: e */
    public static boolean m85490e(long j) {
        return j <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m85489f(Timer timer) {
        C13607cd m85483l = m85483l(timer);
        if (m85483l != null) {
            this.f33628b.add(m85483l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m85488g(Timer timer) {
        C13607cd m85483l = m85483l(timer);
        if (m85483l != null) {
            this.f33628b.add(m85483l);
        }
    }

    /* renamed from: c */
    public void m85492c(Timer timer) {
        m85487h(timer);
    }

    /* renamed from: d */
    public final int m85491d() {
        return C35435Qi6.m88156c(EnumC42123hR5.f85238g.m36396a(this.f33629c.totalMemory() - this.f33629c.freeMemory()));
    }

    /* renamed from: h */
    public final synchronized void m85487h(final Timer timer) {
        try {
            this.f33627a.schedule(new Runnable() { // from class: RP2
                @Override // java.lang.Runnable
                public final void run() {
                    SP2.this.m85489f(timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C10776ad c10776ad = f33626f;
            c10776ad.m71002j("Unable to collect Memory Metric: " + e.getMessage());
        }
    }

    /* renamed from: i */
    public final synchronized void m85486i(long j, final Timer timer) {
        this.f33631e = j;
        try {
            this.f33630d = this.f33627a.scheduleAtFixedRate(new Runnable() { // from class: QP2
                @Override // java.lang.Runnable
                public final void run() {
                    SP2.this.m85488g(timer);
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C10776ad c10776ad = f33626f;
            c10776ad.m71002j("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    /* renamed from: j */
    public void m85485j(long j, Timer timer) {
        if (m85490e(j)) {
            return;
        }
        if (this.f33630d != null) {
            if (this.f33631e != j) {
                m85484k();
                m85486i(j, timer);
                return;
            }
            return;
        }
        m85486i(j, timer);
    }

    /* renamed from: k */
    public void m85484k() {
        ScheduledFuture scheduledFuture = this.f33630d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f33630d = null;
        this.f33631e = -1L;
    }

    /* renamed from: l */
    public final C13607cd m85483l(Timer timer) {
        if (timer == null) {
            return null;
        }
        return C13607cd.m61166W().m61163M(timer.m47037b()).m61162N(m85491d()).build();
    }

    public SP2(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f33630d = null;
        this.f33631e = -1L;
        this.f33627a = scheduledExecutorService;
        this.f33628b = new ConcurrentLinkedQueue<>();
        this.f33629c = runtime;
    }
}
