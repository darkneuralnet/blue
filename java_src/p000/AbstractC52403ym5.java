package p000;

import android.app.job.JobInfo;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p000.C19887du;
/* renamed from: ym5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC52403ym5 {

    /* renamed from: ym5$a */
    /* loaded from: classes5.dex */
    public static class C30699a {

        /* renamed from: a */
        public InterfaceC38734bl0 f120155a;

        /* renamed from: b */
        public Map<N24, AbstractC30700b> f120156b = new HashMap();

        /* renamed from: a */
        public C30699a m2613a(N24 n24, AbstractC30700b abstractC30700b) {
            this.f120156b.put(n24, abstractC30700b);
            return this;
        }

        /* renamed from: b */
        public AbstractC52403ym5 m2612b() {
            if (this.f120155a != null) {
                if (this.f120156b.keySet().size() >= N24.values().length) {
                    Map<N24, AbstractC30700b> map = this.f120156b;
                    this.f120156b = new HashMap();
                    return AbstractC52403ym5.m2620d(this.f120155a, map);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
            throw new NullPointerException("missing required property: clock");
        }

        /* renamed from: c */
        public C30699a m2611c(InterfaceC38734bl0 interfaceC38734bl0) {
            this.f120155a = interfaceC38734bl0;
            return this;
        }
    }

    /* renamed from: ym5$b */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC30700b {

        /* renamed from: ym5$b$a */
        /* loaded from: classes5.dex */
        public static abstract class AbstractC30701a {
            /* renamed from: a */
            public abstract AbstractC30700b mo2606a();

            /* renamed from: b */
            public abstract AbstractC30701a mo2605b(long j);

            /* renamed from: c */
            public abstract AbstractC30701a mo2604c(Set<EnumC30702c> set);

            /* renamed from: d */
            public abstract AbstractC30701a mo2603d(long j);
        }

        /* renamed from: a */
        public static AbstractC30701a m2610a() {
            return new C19887du.C19889b().mo2604c(Collections.emptySet());
        }

        /* renamed from: b */
        public abstract long mo2609b();

        /* renamed from: c */
        public abstract Set<EnumC30702c> mo2608c();

        /* renamed from: d */
        public abstract long mo2607d();
    }

    /* renamed from: ym5$c */
    /* loaded from: classes5.dex */
    public enum EnumC30702c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: b */
    public static C30699a m2622b() {
        return new C30699a();
    }

    /* renamed from: d */
    public static AbstractC52403ym5 m2620d(InterfaceC38734bl0 interfaceC38734bl0, Map<N24, AbstractC30700b> map) {
        return new C19635cu(interfaceC38734bl0, map);
    }

    /* renamed from: f */
    public static AbstractC52403ym5 m2618f(InterfaceC38734bl0 interfaceC38734bl0) {
        return m2622b().m2613a(N24.DEFAULT, AbstractC30700b.m2610a().mo2605b(30000L).mo2603d(CoreConstants.MILLIS_IN_ONE_DAY).mo2606a()).m2613a(N24.HIGHEST, AbstractC30700b.m2610a().mo2605b(1000L).mo2603d(CoreConstants.MILLIS_IN_ONE_DAY).mo2606a()).m2613a(N24.VERY_LOW, AbstractC30700b.m2610a().mo2605b(CoreConstants.MILLIS_IN_ONE_DAY).mo2603d(CoreConstants.MILLIS_IN_ONE_DAY).mo2604c(m2615i(EnumC30702c.DEVICE_IDLE)).mo2606a()).m2611c(interfaceC38734bl0).m2612b();
    }

    /* renamed from: i */
    public static <T> Set<T> m2615i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: a */
    public final long m2623a(int i, long j) {
        long j2;
        int i2 = i - 1;
        if (j > 1) {
            j2 = j;
        } else {
            j2 = 2;
        }
        return (long) (Math.pow(3.0d, i2) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log(j2 * i2)));
    }

    /* renamed from: c */
    public JobInfo.Builder m2621c(JobInfo.Builder builder, N24 n24, long j, int i) {
        builder.setMinimumLatency(m2617g(n24, j, i));
        m2614j(builder, mo2616h().get(n24).mo2608c());
        return builder;
    }

    /* renamed from: e */
    public abstract InterfaceC38734bl0 mo2619e();

    /* renamed from: g */
    public long m2617g(N24 n24, long j, int i) {
        long mo64040a = j - mo2619e().mo64040a();
        AbstractC30700b abstractC30700b = mo2616h().get(n24);
        return Math.min(Math.max(m2623a(i, abstractC30700b.mo2609b()), mo64040a), abstractC30700b.mo2607d());
    }

    /* renamed from: h */
    public abstract Map<N24, AbstractC30700b> mo2616h();

    /* renamed from: j */
    public final void m2614j(JobInfo.Builder builder, Set<EnumC30702c> set) {
        if (set.contains(EnumC30702c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(EnumC30702c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(EnumC30702c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
