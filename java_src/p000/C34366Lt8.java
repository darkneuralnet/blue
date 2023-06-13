package p000;

import android.annotation.TargetApi;
import ch.qos.logback.core.spi.ComponentTracker;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@VisibleForTesting
/* renamed from: Lt8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34366Lt8 {

    /* renamed from: a */
    public final TN8 f22209a;

    /* renamed from: b */
    public final Clock f22210b;

    /* renamed from: c */
    public boolean f22211c;

    /* renamed from: d */
    public long f22212d;

    /* renamed from: e */
    public long f22213e;

    /* renamed from: f */
    public long f22214f;

    /* renamed from: g */
    public long f22215g;

    /* renamed from: h */
    public long f22216h;

    /* renamed from: i */
    public boolean f22217i;

    /* renamed from: j */
    public final Map<Class<? extends AbstractC47966rH8>, AbstractC47966rH8> f22218j;

    /* renamed from: k */
    public final List<Zq9> f22219k;

    public C34366Lt8(C34366Lt8 c34366Lt8) {
        this.f22209a = c34366Lt8.f22209a;
        this.f22210b = c34366Lt8.f22210b;
        this.f22212d = c34366Lt8.f22212d;
        this.f22213e = c34366Lt8.f22213e;
        this.f22214f = c34366Lt8.f22214f;
        this.f22215g = c34366Lt8.f22215g;
        this.f22216h = c34366Lt8.f22216h;
        this.f22219k = new ArrayList(c34366Lt8.f22219k);
        this.f22218j = new HashMap(c34366Lt8.f22218j.size());
        for (Map.Entry<Class<? extends AbstractC47966rH8>, AbstractC47966rH8> entry : c34366Lt8.f22218j.entrySet()) {
            AbstractC47966rH8 m96219n = m96219n(entry.getKey());
            entry.getValue().zzc(m96219n);
            this.f22218j.put(entry.getKey(), m96219n);
        }
    }

    @TargetApi(19)
    /* renamed from: n */
    public static <T extends AbstractC47966rH8> T m96219n(Class<T> cls) {
        try {
            return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            if (!(e instanceof InstantiationException)) {
                if (!(e instanceof IllegalAccessException)) {
                    if (e instanceof ReflectiveOperationException) {
                        throw new IllegalArgumentException("Linkage exception", e);
                    }
                    throw new RuntimeException(e);
                }
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            }
            throw new IllegalArgumentException("dataType doesn't have default constructor", e);
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    public final long m96232a() {
        return this.f22212d;
    }

    @VisibleForTesting
    /* renamed from: b */
    public final <T extends AbstractC47966rH8> T m96231b(Class<T> cls) {
        T t = (T) this.f22218j.get(cls);
        if (t == null) {
            T t2 = (T) m96219n(cls);
            this.f22218j.put(cls, t2);
            return t2;
        }
        return t;
    }

    @VisibleForTesting
    /* renamed from: c */
    public final <T extends AbstractC47966rH8> T m96230c(Class<T> cls) {
        return (T) this.f22218j.get(cls);
    }

    /* renamed from: d */
    public final TN8 m96229d() {
        return this.f22209a;
    }

    @VisibleForTesting
    /* renamed from: e */
    public final Collection<AbstractC47966rH8> m96228e() {
        return this.f22218j.values();
    }

    /* renamed from: f */
    public final List<Zq9> m96227f() {
        return this.f22219k;
    }

    @VisibleForTesting
    /* renamed from: g */
    public final void m96226g(AbstractC47966rH8 abstractC47966rH8) {
        Preconditions.checkNotNull(abstractC47966rH8);
        Class<?> cls = abstractC47966rH8.getClass();
        if (cls.getSuperclass() == AbstractC47966rH8.class) {
            abstractC47966rH8.zzc(m96231b(cls));
            return;
        }
        throw new IllegalArgumentException();
    }

    @VisibleForTesting
    /* renamed from: h */
    public final void m96225h() {
        this.f22217i = true;
    }

    @VisibleForTesting
    /* renamed from: i */
    public final void m96224i() {
        this.f22214f = this.f22210b.elapsedRealtime();
        long j = this.f22213e;
        if (j != 0) {
            this.f22212d = j;
        } else {
            this.f22212d = this.f22210b.currentTimeMillis();
        }
        this.f22211c = true;
    }

    @VisibleForTesting
    /* renamed from: j */
    public final void m96223j(long j) {
        this.f22213e = j;
    }

    @VisibleForTesting
    /* renamed from: k */
    public final void m96222k() {
        this.f22209a.m83705b().m87993k(this);
    }

    @VisibleForTesting
    /* renamed from: l */
    public final boolean m96221l() {
        return this.f22217i;
    }

    @VisibleForTesting
    /* renamed from: m */
    public final boolean m96220m() {
        return this.f22211c;
    }

    @VisibleForTesting
    public C34366Lt8(TN8 tn8, Clock clock) {
        Preconditions.checkNotNull(tn8);
        Preconditions.checkNotNull(clock);
        this.f22209a = tn8;
        this.f22210b = clock;
        this.f22215g = ComponentTracker.DEFAULT_TIMEOUT;
        this.f22216h = 3024000000L;
        this.f22218j = new HashMap();
        this.f22219k = new ArrayList();
    }
}
