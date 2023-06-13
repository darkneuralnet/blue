package p000;

import android.annotation.SuppressLint;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* renamed from: PD0 */
/* loaded from: classes6.dex */
public class PD0 {

    /* renamed from: g */
    public static final C10776ad f28116g = C10776ad.m71007e();

    /* renamed from: h */
    public static final long f28117h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: c */
    public final String f28120c;

    /* renamed from: d */
    public final long f28121d;

    /* renamed from: e */
    public ScheduledFuture f28122e = null;

    /* renamed from: f */
    public long f28123f = -1;

    /* renamed from: a */
    public final ConcurrentLinkedQueue<QD0> f28118a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    public final ScheduledExecutorService f28119b = Executors.newSingleThreadScheduledExecutor();

    @SuppressLint({"ThreadPoolCreation"})
    public PD0() {
        int myPid = Process.myPid();
        this.f28120c = "/proc/" + Integer.toString(myPid) + "/stat";
        this.f28121d = m90578e();
    }

    /* renamed from: f */
    public static boolean m90577f(long j) {
        return j <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m90576g(Timer timer) {
        QD0 m90570m = m90570m(timer);
        if (m90570m != null) {
            this.f28118a.add(m90570m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m90575h(Timer timer) {
        QD0 m90570m = m90570m(timer);
        if (m90570m != null) {
            this.f28118a.add(m90570m);
        }
    }

    /* renamed from: c */
    public void m90580c(Timer timer) {
        m90574i(timer);
    }

    /* renamed from: d */
    public final long m90579d(long j) {
        return Math.round((j / this.f28121d) * f28117h);
    }

    /* renamed from: e */
    public final long m90578e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    /* renamed from: i */
    public final synchronized void m90574i(final Timer timer) {
        try {
            this.f28119b.schedule(new Runnable() { // from class: OD0
                @Override // java.lang.Runnable
                public final void run() {
                    PD0.this.m90576g(timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C10776ad c10776ad = f28116g;
            c10776ad.m71002j("Unable to collect Cpu Metric: " + e.getMessage());
        }
    }

    /* renamed from: j */
    public final synchronized void m90573j(long j, final Timer timer) {
        this.f28123f = j;
        try {
            this.f28122e = this.f28119b.scheduleAtFixedRate(new Runnable() { // from class: ND0
                @Override // java.lang.Runnable
                public final void run() {
                    PD0.this.m90575h(timer);
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C10776ad c10776ad = f28116g;
            c10776ad.m71002j("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
    }

    /* renamed from: k */
    public void m90572k(long j, Timer timer) {
        long j2 = this.f28121d;
        if (j2 == -1 || j2 == 0 || m90577f(j)) {
            return;
        }
        if (this.f28122e != null) {
            if (this.f28123f != j) {
                m90571l();
                m90573j(j, timer);
                return;
            }
            return;
        }
        m90573j(j, timer);
    }

    /* renamed from: l */
    public void m90571l() {
        ScheduledFuture scheduledFuture = this.f28122e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f28122e = null;
        this.f28123f = -1L;
    }

    /* renamed from: m */
    public final QD0 m90570m(Timer timer) {
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f28120c));
            try {
                long m47037b = timer.m47037b();
                String[] split = bufferedReader.readLine().split(" ");
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[15]);
                QD0 build = QD0.m88743X().m88739M(m47037b).m88738N(m90579d(Long.parseLong(split[14]) + Long.parseLong(split[16]))).m88737O(m90579d(parseLong + parseLong2)).build();
                bufferedReader.close();
                return build;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            C10776ad c10776ad = f28116g;
            c10776ad.m71002j("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            C10776ad c10776ad2 = f28116g;
            c10776ad2.m71002j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            C10776ad c10776ad22 = f28116g;
            c10776ad22.m71002j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e4) {
            e = e4;
            C10776ad c10776ad222 = f28116g;
            c10776ad222.m71002j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }
}
