package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u0015\u0010\u001d\u001a\u00020\u0011*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010%\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006*"}, m28432d2 = {"LDG6;", "", "LWY5;", "h", "()LWY5;", "task", "", "fair", C17296a.f69688o, "(LWY5;Z)LWY5;", "victim", "", "l", "(LDG6;)J", "k", "LUC1;", "globalQueue", "", "g", "(LUC1;)V", "c", "(LWY5;)LWY5;", "blockingOnly", "m", "(LDG6;Z)J", "queue", "j", "(LUC1;)Z", "i", DateTokenConverter.CONVERTER_KEY, "(LWY5;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "", "e", "()I", "bufferSize", "f", "size", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: DG6 */
/* loaded from: classes8.dex */
public final class DG6 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5477b = AtomicReferenceFieldUpdater.newUpdater(DG6.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5478c = AtomicIntegerFieldUpdater.newUpdater(DG6.class, "producerIndex");

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5479d = AtomicIntegerFieldUpdater.newUpdater(DG6.class, "consumerIndex");

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5480e = AtomicIntegerFieldUpdater.newUpdater(DG6.class, "blockingTasksInBuffer");

    /* renamed from: a */
    public final AtomicReferenceArray<WY5> f5481a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    /* renamed from: b */
    public static /* synthetic */ WY5 m110626b(DG6 dg6, WY5 wy5, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return dg6.m110627a(wy5, z);
    }

    /* renamed from: a */
    public final WY5 m110627a(WY5 wy5, boolean z) {
        if (z) {
            return m110625c(wy5);
        }
        WY5 wy52 = (WY5) f5477b.getAndSet(this, wy5);
        if (wy52 == null) {
            return null;
        }
        return m110625c(wy52);
    }

    /* renamed from: c */
    public final WY5 m110625c(WY5 wy5) {
        boolean z = true;
        if (wy5.f41291c.mo27148b() != 1) {
            z = false;
        }
        if (z) {
            f5480e.incrementAndGet(this);
        }
        if (m110623e() == 127) {
            return wy5;
        }
        int i = this.producerIndex & 127;
        while (this.f5481a.get(i) != null) {
            Thread.yield();
        }
        this.f5481a.lazySet(i, wy5);
        f5478c.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    public final void m110624d(WY5 wy5) {
        if (wy5 != null) {
            boolean z = true;
            if (wy5.f41291c.mo27148b() != 1) {
                z = false;
            }
            if (z) {
                f5480e.decrementAndGet(this);
            }
        }
    }

    /* renamed from: e */
    public final int m110623e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int m110622f() {
        return this.lastScheduledTask != null ? m110623e() + 1 : m110623e();
    }

    /* renamed from: g */
    public final void m110621g(UC1 uc1) {
        WY5 wy5 = (WY5) f5477b.getAndSet(this, null);
        if (wy5 != null) {
            uc1.m43476a(wy5);
        }
        do {
        } while (m110618j(uc1));
    }

    /* renamed from: h */
    public final WY5 m110620h() {
        WY5 wy5 = (WY5) f5477b.getAndSet(this, null);
        return wy5 == null ? m110619i() : wy5;
    }

    /* renamed from: i */
    public final WY5 m110619i() {
        WY5 andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f5479d.compareAndSet(this, i, i + 1) && (andSet = this.f5481a.getAndSet(i2, null)) != null) {
                m110624d(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    public final boolean m110618j(UC1 uc1) {
        WY5 m110619i = m110619i();
        if (m110619i == null) {
            return false;
        }
        uc1.m43476a(m110619i);
        return true;
    }

    /* renamed from: k */
    public final long m110617k(DG6 dg6) {
        int i = dg6.consumerIndex;
        int i2 = dg6.producerIndex;
        AtomicReferenceArray<WY5> atomicReferenceArray = dg6.f5481a;
        while (true) {
            boolean z = true;
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (dg6.blockingTasksInBuffer == 0) {
                break;
            }
            WY5 wy5 = atomicReferenceArray.get(i3);
            if (wy5 != null) {
                if (wy5.f41291c.mo27148b() != 1) {
                    z = false;
                }
                if (z && JS5.m100428a(atomicReferenceArray, i3, wy5, null)) {
                    f5480e.decrementAndGet(dg6);
                    m110626b(this, wy5, false, 2, null);
                    return -1L;
                }
            }
            i++;
        }
        return m110615m(dg6, true);
    }

    /* renamed from: l */
    public final long m110616l(DG6 dg6) {
        WY5 m110619i = dg6.m110619i();
        if (m110619i != null) {
            m110626b(this, m110619i, false, 2, null);
            return -1L;
        }
        return m110615m(dg6, false);
    }

    /* renamed from: m */
    public final long m110615m(DG6 dg6, boolean z) {
        WY5 wy5;
        do {
            wy5 = (WY5) dg6.lastScheduledTask;
            if (wy5 == null) {
                return -2L;
            }
            if (z) {
                boolean z2 = true;
                if (wy5.f41291c.mo27148b() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2L;
                }
            }
            long mo17464a = EZ5.f7704e.mo17464a() - wy5.f41290b;
            long j = EZ5.f7700a;
            if (mo17464a < j) {
                return j - mo17464a;
            }
        } while (!C22859i1.m35391a(f5477b, dg6, wy5, null));
        m110626b(this, wy5, false, 2, null);
        return -1L;
    }
}
