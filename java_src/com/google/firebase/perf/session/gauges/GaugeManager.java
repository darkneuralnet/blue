package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p000.C41382gB1;
@Keep
/* loaded from: classes6.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private EnumC23350im applicationProcessState;
    private final C32036Bv0 configResolver;
    private final C37339Ym2<PD0> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final C37339Ym2<ScheduledExecutorService> gaugeManagerExecutor;
    private C40789fB1 gaugeMetadataManager;
    private final C37339Ym2<SP2> memoryGaugeCollector;
    private String sessionId;
    private final C41612ga6 transportManager;
    private static final C10776ad logger = C10776ad.m71007e();
    private static final GaugeManager instance = new GaugeManager();

    /* renamed from: com.google.firebase.perf.session.gauges.GaugeManager$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18373a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74402a;

        static {
            int[] iArr = new int[EnumC23350im.values().length];
            f74402a = iArr;
            try {
                iArr[EnumC23350im.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74402a[EnumC23350im.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new C37339Ym2(new X94() { // from class: bB1
            @Override // p000.X94
            public final Object get() {
                return Executors.newSingleThreadScheduledExecutor();
            }
        }), C41612ga6.m39128k(), C32036Bv0.m113351g(), null, new C37339Ym2(new X94() { // from class: cB1
            @Override // p000.X94
            public final Object get() {
                PD0 lambda$new$0;
                lambda$new$0 = GaugeManager.lambda$new$0();
                return lambda$new$0;
            }
        }), new C37339Ym2(new X94() { // from class: dB1
            @Override // p000.X94
            public final Object get() {
                SP2 lambda$new$1;
                lambda$new$1 = GaugeManager.lambda$new$1();
                return lambda$new$1;
            }
        }));
    }

    private long getCpuGaugeCollectionFrequencyMs(EnumC23350im enumC23350im) {
        long m113333y;
        int i = C18373a.f74402a[enumC23350im.ordinal()];
        if (i != 1) {
            if (i != 2) {
                m113333y = -1;
            } else {
                m113333y = this.configResolver.m113332z();
            }
        } else {
            m113333y = this.configResolver.m113333y();
        }
        if (PD0.m90577f(m113333y)) {
            return -1L;
        }
        return m113333y;
    }

    private C40196eB1 getGaugeMetadata() {
        return C40196eB1.m43145Z().m43141M(this.gaugeMetadataManager.m41756a()).m43140N(this.gaugeMetadataManager.m41755b()).m43139O(this.gaugeMetadataManager.m41754c()).build();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(EnumC23350im enumC23350im) {
        long m113372B;
        int i = C18373a.f74402a[enumC23350im.ordinal()];
        if (i != 1) {
            if (i != 2) {
                m113372B = -1;
            } else {
                m113372B = this.configResolver.m113371C();
            }
        } else {
            m113372B = this.configResolver.m113372B();
        }
        if (SP2.m85490e(m113372B)) {
            return -1L;
        }
        return m113372B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ PD0 lambda$new$0() {
        return new PD0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SP2 lambda$new$1() {
        return new SP2();
    }

    private boolean startCollectingCpuMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.m71011a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        this.cpuGaugeCollector.get().m90572k(j, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.m71011a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        this.memoryGaugeCollector.get().m85485j(j, timer);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncFlush */
    public void lambda$stopCollectingGauges$3(String str, EnumC23350im enumC23350im) {
        C41382gB1.C20770b m39933i0 = C41382gB1.m39933i0();
        while (!this.cpuGaugeCollector.get().f28118a.isEmpty()) {
            m39933i0.m39929N(this.cpuGaugeCollector.get().f28118a.poll());
        }
        while (!this.memoryGaugeCollector.get().f33628b.isEmpty()) {
            m39933i0.m39930M(this.memoryGaugeCollector.get().f33628b.poll());
        }
        m39933i0.m39927P(str);
        this.transportManager.m39146A(m39933i0.build(), enumC23350im);
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), timer);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new C40789fB1(context);
    }

    public boolean logGaugeMetadata(String str, EnumC23350im enumC23350im) {
        if (this.gaugeMetadataManager != null) {
            this.transportManager.m39146A(C41382gB1.m39933i0().m39927P(str).m39928O(getGaugeMetadata()).build(), enumC23350im);
            return true;
        }
        return false;
    }

    public void startCollectingGauges(PerfSession perfSession, final EnumC23350im enumC23350im) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(enumC23350im, perfSession.m47052d());
        if (startCollectingGauges == -1) {
            logger.m71002j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String m47048i = perfSession.m47048i();
        this.sessionId = m47048i;
        this.applicationProcessState = enumC23350im;
        try {
            long j = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new Runnable() { // from class: aB1
                @Override // java.lang.Runnable
                public final void run() {
                    GaugeManager.this.lambda$startCollectingGauges$2(m47048i, enumC23350im);
                }
            }, j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C10776ad c10776ad = logger;
            c10776ad.m71002j("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final EnumC23350im enumC23350im = this.applicationProcessState;
        this.cpuGaugeCollector.get().m90571l();
        this.memoryGaugeCollector.get().m85484k();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new Runnable() { // from class: ZA1
            @Override // java.lang.Runnable
            public final void run() {
                GaugeManager.this.lambda$stopCollectingGauges$3(str, enumC23350im);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = EnumC23350im.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private static void collectGaugeMetricOnce(PD0 pd0, SP2 sp2, Timer timer) {
        pd0.m90580c(timer);
        sp2.m85492c(timer);
    }

    public GaugeManager(C37339Ym2<ScheduledExecutorService> c37339Ym2, C41612ga6 c41612ga6, C32036Bv0 c32036Bv0, C40789fB1 c40789fB1, C37339Ym2<PD0> c37339Ym22, C37339Ym2<SP2> c37339Ym23) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = EnumC23350im.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = c37339Ym2;
        this.transportManager = c41612ga6;
        this.configResolver = c32036Bv0;
        this.gaugeMetadataManager = c40789fB1;
        this.cpuGaugeCollector = c37339Ym22;
        this.memoryGaugeCollector = c37339Ym23;
    }

    private long startCollectingGauges(EnumC23350im enumC23350im, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(enumC23350im);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(enumC23350im);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}
