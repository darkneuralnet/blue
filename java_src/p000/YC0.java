package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.random.Random;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0003\u00064\u001eB+\u0012\u0006\u0010=\u001a\u00020\f\u0012\u0006\u0010>\u001a\u00020\f\u0012\b\b\u0002\u0010@\u001a\u00020\u0013\u0012\b\b\u0002\u0010C\u001a\u000207¢\u0006\u0004\bN\u0010OJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001c\u001a\u0004\u0018\u00010\u0003*\b\u0018\u00010\bR\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\nJ)\u0010!\u001a\u00020\u00102\n\u0010\u000b\u001a\u00060\bR\u00020\u00002\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\bR\u00020\u0000¢\u0006\u0004\b#\u0010$J\u001b\u0010(\u001a\u00020\u00102\n\u0010'\u001a\u00060%j\u0002`&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.J-\u00102\u001a\u00020\u00102\n\u0010/\u001a\u00060%j\u0002`&2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b2\u00103J!\u00104\u001a\u00020\u00032\n\u0010/\u001a\u00060%j\u0002`&2\u0006\u00101\u001a\u000200¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0010¢\u0006\u0004\b6\u0010+J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010<R\u0014\u0010>\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010<R\u0014\u0010@\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010?R\u0014\u0010C\u001a\u0002078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010ER\u0014\u0010H\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010ER\u001e\u0010L\u001a\f\u0012\b\u0012\u00060\bR\u00020\u00000I8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0011\u0010M\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bM\u0010\u0018¨\u0006P"}, m28432d2 = {"LYC0;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "LWY5;", "task", "", C17296a.f69688o, "(LWY5;)Z", "LYC0$c;", "k", "()LYC0$c;", "worker", "", "i", "(LYC0$c;)I", "skipUnpark", "", "q", "(Z)V", "", TransferTable.COLUMN_STATE, "u", "(J)Z", "y", "()Z", "b", "()I", "tailDispatch", "t", "(LYC0$c;LWY5;Z)LWY5;", DateTokenConverter.CONVERTER_KEY, "oldIndex", "newIndex", "m", "(LYC0$c;II)V", "l", "(LYC0$c;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", "p", "(J)V", "block", "LkZ5;", "taskContext", "f", "(Ljava/lang/Runnable;LkZ5;Z)V", "c", "(Ljava/lang/Runnable;LkZ5;)LWY5;", "r", "", "toString", "()Ljava/lang/String;", "n", "(LWY5;)V", "I", "corePoolSize", "maxPoolSize", "J", "idleWorkerKeepAliveNs", "e", "Ljava/lang/String;", "schedulerName", "LUC1;", "LUC1;", "globalCpuQueue", "g", "globalBlockingQueue", "LJL4;", "h", "LJL4;", "workers", "isTerminated", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: YC0 */
/* loaded from: classes8.dex */
public final class YC0 implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    @JvmField

    /* renamed from: b */
    public final int f44774b;
    @JvmField

    /* renamed from: c */
    public final int f44775c;
    volatile /* synthetic */ long controlState;
    @JvmField

    /* renamed from: d */
    public final long f44776d;
    @JvmField

    /* renamed from: e */
    public final String f44777e;
    @JvmField

    /* renamed from: f */
    public final UC1 f44778f;
    @JvmField

    /* renamed from: g */
    public final UC1 f44779g;
    @JvmField

    /* renamed from: h */
    public final JL4<C9703c> f44780h;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: i */
    public static final C9701a f44769i = new C9701a(null);
    @JvmField

    /* renamed from: m */
    public static final C49885uX5 f44773m = new C49885uX5("NOT_IN_STACK");

    /* renamed from: j */
    public static final /* synthetic */ AtomicLongFieldUpdater f44770j = AtomicLongFieldUpdater.newUpdater(YC0.class, "parkedWorkersStack");

    /* renamed from: k */
    public static final /* synthetic */ AtomicLongFieldUpdater f44771k = AtomicLongFieldUpdater.newUpdater(YC0.class, "controlState");

    /* renamed from: l */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f44772l = AtomicIntegerFieldUpdater.newUpdater(YC0.class, "_isTerminated");

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, m28432d2 = {"LYC0$a;", "", "", "BLOCKING_MASK", "J", "", "BLOCKING_SHIFT", "I", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "LuX5;", "NOT_IN_STACK", "LuX5;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: YC0$a */
    /* loaded from: classes8.dex */
    public static final class C9701a {
        public /* synthetic */ C9701a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C9701a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: YC0$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C9702b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC9704d.values().length];
            iArr[EnumC9704d.PARKING.ordinal()] = 1;
            iArr[EnumC9704d.BLOCKING.ordinal()] = 2;
            iArr[EnumC9704d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[EnumC9704d.DORMANT.ordinal()] = 4;
            iArr[EnumC9704d.TERMINATED.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"LYC0$d;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: YC0$d */
    /* loaded from: classes8.dex */
    public enum EnumC9704d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public YC0(int i, int i2, long j, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f44774b = i;
        this.f44775c = i2;
        this.f44776d = j;
        this.f44777e = str;
        if (i >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= 2097150) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (j > 0) {
                        this.f44778f = new UC1();
                        this.f44779g = new UC1();
                        this.parkedWorkersStack = 0L;
                        this.f44780h = new JL4<>(i + 1);
                        this.controlState = i << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
    }

    /* renamed from: g */
    public static /* synthetic */ void m75459g(YC0 yc0, Runnable runnable, InterfaceC43974kZ5 interfaceC43974kZ5, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC43974kZ5 = EZ5.f7705f;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        yc0.m75460f(runnable, interfaceC43974kZ5, z);
    }

    /* renamed from: x */
    public static /* synthetic */ boolean m75448x(YC0 yc0, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = yc0.controlState;
        }
        return yc0.m75449u(j);
    }

    /* renamed from: a */
    public final boolean m75464a(WY5 wy5) {
        boolean z = true;
        if (wy5.f41291c.mo27148b() != 1) {
            z = false;
        }
        if (z) {
            return this.f44779g.m43476a(wy5);
        }
        return this.f44778f.m43476a(wy5);
    }

    /* renamed from: b */
    public final int m75463b() {
        int coerceAtLeast;
        boolean z;
        synchronized (this.f44780h) {
            if (isTerminated()) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            boolean z2 = false;
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (coerceAtLeast >= this.f44774b) {
                return 0;
            }
            if (i >= this.f44775c) {
                return 0;
            }
            int i2 = ((int) (this.controlState & 2097151)) + 1;
            if (i2 > 0 && this.f44780h.m100660b(i2) == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C9703c c9703c = new C9703c(this, i2);
                this.f44780h.m100659c(i2, c9703c);
                if (i2 == ((int) (2097151 & f44771k.incrementAndGet(this)))) {
                    z2 = true;
                }
                if (z2) {
                    c9703c.start();
                    return coerceAtLeast + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: c */
    public final WY5 m75462c(Runnable runnable, InterfaceC43974kZ5 interfaceC43974kZ5) {
        long mo17464a = EZ5.f7704e.mo17464a();
        if (runnable instanceof WY5) {
            WY5 wy5 = (WY5) runnable;
            wy5.f41290b = mo17464a;
            wy5.f41291c = interfaceC43974kZ5;
            return wy5;
        }
        return new C46939pZ5(runnable, mo17464a, interfaceC43974kZ5);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m75453p(AbstractComponentTracker.LINGERING_TIMEOUT);
    }

    /* renamed from: d */
    public final C9703c m75461d() {
        C9703c c9703c;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C9703c) {
            c9703c = (C9703c) currentThread;
        } else {
            c9703c = null;
        }
        if (c9703c == null || !Intrinsics.areEqual(YC0.this, this)) {
            return null;
        }
        return c9703c;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m75459g(this, runnable, null, false, 6, null);
    }

    /* renamed from: f */
    public final void m75460f(Runnable runnable, InterfaceC43974kZ5 interfaceC43974kZ5, boolean z) {
        boolean z2;
        AbstractC28153s1 m13249a = C28498t1.m13249a();
        if (m13249a != null) {
            m13249a.m14886d();
        }
        WY5 m75462c = m75462c(runnable, interfaceC43974kZ5);
        C9703c m75461d = m75461d();
        WY5 m75450t = m75450t(m75461d, m75462c, z);
        if (m75450t != null && !m75464a(m75450t)) {
            throw new RejectedExecutionException(this.f44777e + " was terminated");
        }
        if (z && m75461d != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m75462c.f41291c.mo27148b() == 0) {
            if (z2) {
                return;
            }
            m75451r();
            return;
        }
        m75452q(z2);
    }

    /* renamed from: i */
    public final int m75458i(C9703c c9703c) {
        Object m75439h = c9703c.m75439h();
        while (m75439h != f44773m) {
            if (m75439h == null) {
                return 0;
            }
            C9703c c9703c2 = (C9703c) m75439h;
            int m75440g = c9703c2.m75440g();
            if (m75440g != 0) {
                return m75440g;
            }
            m75439h = c9703c2.m75439h();
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: k */
    public final C9703c m75457k() {
        while (true) {
            long j = this.parkedWorkersStack;
            C9703c m100660b = this.f44780h.m100660b((int) (2097151 & j));
            if (m100660b == null) {
                return null;
            }
            long j2 = (2097152 + j) & (-2097152);
            int m75458i = m75458i(m100660b);
            if (m75458i >= 0 && f44770j.compareAndSet(this, j, m75458i | j2)) {
                m100660b.m75431p(f44773m);
                return m100660b;
            }
        }
    }

    /* renamed from: l */
    public final boolean m75456l(C9703c c9703c) {
        long j;
        int m75440g;
        if (c9703c.m75439h() != f44773m) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            m75440g = c9703c.m75440g();
            c9703c.m75431p(this.f44780h.m100660b((int) (2097151 & j)));
        } while (!f44770j.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | m75440g));
        return true;
    }

    /* renamed from: m */
    public final void m75455m(C9703c c9703c, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    i3 = m75458i(c9703c);
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0 && f44770j.compareAndSet(this, j, j2 | i3)) {
                return;
            }
        }
    }

    /* renamed from: n */
    public final void m75454n(WY5 wy5) {
        try {
            wy5.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                AbstractC28153s1 m13249a = C28498t1.m13249a();
                if (m13249a == null) {
                }
            } finally {
                AbstractC28153s1 m13249a2 = C28498t1.m13249a();
                if (m13249a2 != null) {
                    m13249a2.m14885e();
                }
            }
        }
    }

    /* renamed from: p */
    public final void m75453p(long j) {
        int i;
        WY5 m43473d;
        if (!f44772l.compareAndSet(this, 0, 1)) {
            return;
        }
        C9703c m75461d = m75461d();
        synchronized (this.f44780h) {
            i = (int) (this.controlState & 2097151);
        }
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                C9703c m100660b = this.f44780h.m100660b(i2);
                Intrinsics.checkNotNull(m100660b);
                C9703c c9703c = m100660b;
                if (c9703c != m75461d) {
                    while (c9703c.isAlive()) {
                        LockSupport.unpark(c9703c);
                        c9703c.join(j);
                    }
                    c9703c.f44782b.m110621g(this.f44779g);
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        this.f44779g.m43475b();
        this.f44778f.m43475b();
        while (true) {
            if (m75461d != null) {
                m43473d = m75461d.m75441f(true);
                if (m43473d != null) {
                    continue;
                    m75454n(m43473d);
                }
            }
            m43473d = this.f44778f.m43473d();
            if (m43473d == null && (m43473d = this.f44779g.m43473d()) == null) {
                break;
            }
            m75454n(m43473d);
        }
        if (m75461d != null) {
            m75461d.m75428s(EnumC9704d.TERMINATED);
        }
        this.parkedWorkersStack = 0L;
        this.controlState = 0L;
    }

    /* renamed from: q */
    public final void m75452q(boolean z) {
        long addAndGet = f44771k.addAndGet(this, 2097152L);
        if (z || m75447y() || m75449u(addAndGet)) {
            return;
        }
        m75447y();
    }

    /* renamed from: r */
    public final void m75451r() {
        if (m75447y() || m75448x(this, 0L, 1, null)) {
            return;
        }
        m75447y();
    }

    /* renamed from: t */
    public final WY5 m75450t(C9703c c9703c, WY5 wy5, boolean z) {
        if (c9703c == null) {
            return wy5;
        }
        if (c9703c.f44783c == EnumC9704d.TERMINATED) {
            return wy5;
        }
        if (wy5.f41291c.mo27148b() == 0 && c9703c.f44783c == EnumC9704d.BLOCKING) {
            return wy5;
        }
        c9703c.f44787g = true;
        return c9703c.f44782b.m110627a(wy5, z);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int m100661a = this.f44780h.m100661a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < m100661a; i6++) {
            C9703c m100660b = this.f44780h.m100660b(i6);
            if (m100660b != null) {
                int m110622f = m100660b.f44782b.m110622f();
                int i7 = C9702b.$EnumSwitchMapping$0[m100660b.f44783c.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 == 5) {
                                    i5++;
                                }
                            } else {
                                i4++;
                                if (m110622f > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(m110622f);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i++;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m110622f);
                            sb2.append('c');
                            arrayList.add(sb2.toString());
                        }
                    } else {
                        i2++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m110622f);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i3++;
                }
            }
        }
        long j = this.controlState;
        return this.f44777e + '@' + C39783dV0.m44215b(this) + "[Pool Size {core = " + this.f44774b + ", max = " + this.f44775c + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f44778f.m43474c() + ", global blocking queue size = " + this.f44779g.m43474c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f44774b - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* renamed from: u */
    public final boolean m75449u(long j) {
        int coerceAtLeast;
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0);
        if (coerceAtLeast < this.f44774b) {
            int m75463b = m75463b();
            if (m75463b == 1 && this.f44774b > 1) {
                m75463b();
            }
            if (m75463b > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public final boolean m75447y() {
        C9703c m75457k;
        do {
            m75457k = m75457k();
            if (m75457k == null) {
                return false;
            }
        } while (!C9703c.f44781i.compareAndSet(m75457k, -1, 0));
        LockSupport.unpark(m75457k);
        return true;
    }

    @Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b@\u0010AB\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020\n¢\u0006\u0004\b@\u0010BJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\tJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\tJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u001cJ\u0019\u0010\"\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0011J\u0011\u0010#\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010\u0011R*\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u001cR\u0014\u0010/\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010.R\u0016\u00101\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00103R$\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010<\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00103R\u0016\u0010=\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010)R\u0016\u0010?\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u0010>¨\u0006C"}, m28432d2 = {"LYC0$c;", "Ljava/lang/Thread;", "LYC0$d;", "newState", "", "s", "(LYC0$d;)Z", "", "run", "()V", "", "upperBound", "k", "(I)I", "scanLocalQueue", "LWY5;", "f", "(Z)LWY5;", "q", "()Z", "n", "r", "j", "task", DateTokenConverter.CONVERTER_KEY, "(LWY5;)V", "taskMode", "c", "(I)V", "b", "l", "u", "mode", "i", "e", "m", "()LWY5;", "blockingOnly", "t", "index", "indexInArray", "I", "g", "()I", "o", "LDG6;", "LDG6;", "localQueue", "LYC0$d;", TransferTable.COLUMN_STATE, "", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "p", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "mayHaveLocalTasks", "<init>", "(LYC0;)V", "(LYC0;I)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: YC0$c */
    /* loaded from: classes8.dex */
    public final class C9703c extends Thread {

        /* renamed from: i */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f44781i = AtomicIntegerFieldUpdater.newUpdater(C9703c.class, "workerCtl");
        @JvmField

        /* renamed from: b */
        public final DG6 f44782b;
        @JvmField

        /* renamed from: c */
        public EnumC9704d f44783c;

        /* renamed from: d */
        public long f44784d;

        /* renamed from: e */
        public long f44785e;

        /* renamed from: f */
        public int f44786f;
        @JvmField

        /* renamed from: g */
        public boolean f44787g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        public C9703c() {
            setDaemon(true);
            this.f44782b = new DG6();
            this.f44783c = EnumC9704d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = YC0.f44773m;
            this.f44786f = Random.Default.nextInt();
        }

        /* renamed from: b */
        public final void m75445b(int i) {
            if (i == 0) {
                return;
            }
            YC0.f44771k.addAndGet(YC0.this, -2097152L);
            if (this.f44783c != EnumC9704d.TERMINATED) {
                this.f44783c = EnumC9704d.DORMANT;
            }
        }

        /* renamed from: c */
        public final void m75444c(int i) {
            if (i != 0 && m75428s(EnumC9704d.BLOCKING)) {
                YC0.this.m75451r();
            }
        }

        /* renamed from: d */
        public final void m75443d(WY5 wy5) {
            int mo27148b = wy5.f41291c.mo27148b();
            m75438i(mo27148b);
            m75444c(mo27148b);
            YC0.this.m75454n(wy5);
            m75445b(mo27148b);
        }

        /* renamed from: e */
        public final WY5 m75442e(boolean z) {
            boolean z2;
            WY5 m75434m;
            WY5 m75434m2;
            if (z) {
                if (m75436k(YC0.this.f44774b * 2) == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (m75434m2 = m75434m()) != null) {
                    return m75434m2;
                }
                WY5 m110620h = this.f44782b.m110620h();
                if (m110620h != null) {
                    return m110620h;
                }
                if (!z2 && (m75434m = m75434m()) != null) {
                    return m75434m;
                }
            } else {
                WY5 m75434m3 = m75434m();
                if (m75434m3 != null) {
                    return m75434m3;
                }
            }
            return m75427t(false);
        }

        /* renamed from: f */
        public final WY5 m75441f(boolean z) {
            WY5 m43473d;
            if (m75430q()) {
                return m75442e(z);
            }
            if (z) {
                m43473d = this.f44782b.m110620h();
                if (m43473d == null) {
                    m43473d = YC0.this.f44779g.m43473d();
                }
            } else {
                m43473d = YC0.this.f44779g.m43473d();
            }
            if (m43473d == null) {
                return m75427t(true);
            }
            return m43473d;
        }

        /* renamed from: g */
        public final int m75440g() {
            return this.indexInArray;
        }

        /* renamed from: h */
        public final Object m75439h() {
            return this.nextParkedWorker;
        }

        /* renamed from: i */
        public final void m75438i(int i) {
            this.f44784d = 0L;
            if (this.f44783c == EnumC9704d.PARKING) {
                this.f44783c = EnumC9704d.BLOCKING;
            }
        }

        /* renamed from: j */
        public final boolean m75437j() {
            return this.nextParkedWorker != YC0.f44773m;
        }

        /* renamed from: k */
        public final int m75436k(int i) {
            int i2 = this.f44786f;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f44786f = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: l */
        public final void m75435l() {
            if (this.f44784d == 0) {
                this.f44784d = System.nanoTime() + YC0.this.f44776d;
            }
            LockSupport.parkNanos(YC0.this.f44776d);
            if (System.nanoTime() - this.f44784d >= 0) {
                this.f44784d = 0L;
                m75426u();
            }
        }

        /* renamed from: m */
        public final WY5 m75434m() {
            if (m75436k(2) == 0) {
                WY5 m43473d = YC0.this.f44778f.m43473d();
                if (m43473d != null) {
                    return m43473d;
                }
                return YC0.this.f44779g.m43473d();
            }
            WY5 m43473d2 = YC0.this.f44779g.m43473d();
            if (m43473d2 != null) {
                return m43473d2;
            }
            return YC0.this.f44778f.m43473d();
        }

        /* renamed from: n */
        public final void m75433n() {
            loop0: while (true) {
                boolean z = false;
                while (!YC0.this.isTerminated() && this.f44783c != EnumC9704d.TERMINATED) {
                    WY5 m75441f = m75441f(this.f44787g);
                    if (m75441f != null) {
                        this.f44785e = 0L;
                        m75443d(m75441f);
                    } else {
                        this.f44787g = false;
                        if (this.f44785e != 0) {
                            if (!z) {
                                z = true;
                            } else {
                                m75428s(EnumC9704d.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f44785e);
                                this.f44785e = 0L;
                            }
                        } else {
                            m75429r();
                        }
                    }
                }
            }
            m75428s(EnumC9704d.TERMINATED);
        }

        /* renamed from: o */
        public final void m75432o(int i) {
            String valueOf;
            StringBuilder sb = new StringBuilder();
            sb.append(YC0.this.f44777e);
            sb.append("-worker-");
            if (i == 0) {
                valueOf = "TERMINATED";
            } else {
                valueOf = String.valueOf(i);
            }
            sb.append(valueOf);
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: p */
        public final void m75431p(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: q */
        public final boolean m75430q() {
            boolean z;
            if (this.f44783c == EnumC9704d.CPU_ACQUIRED) {
                return true;
            }
            YC0 yc0 = YC0.this;
            while (true) {
                long j = yc0.controlState;
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    z = false;
                    break;
                }
                if (YC0.f44771k.compareAndSet(yc0, j, j - 4398046511104L)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return false;
            }
            this.f44783c = EnumC9704d.CPU_ACQUIRED;
            return true;
        }

        /* renamed from: r */
        public final void m75429r() {
            if (!m75437j()) {
                YC0.this.m75456l(this);
                return;
            }
            this.workerCtl = -1;
            while (m75437j() && this.workerCtl == -1 && !YC0.this.isTerminated() && this.f44783c != EnumC9704d.TERMINATED) {
                m75428s(EnumC9704d.PARKING);
                Thread.interrupted();
                m75435l();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m75433n();
        }

        /* renamed from: s */
        public final boolean m75428s(EnumC9704d enumC9704d) {
            boolean z;
            EnumC9704d enumC9704d2 = this.f44783c;
            if (enumC9704d2 == EnumC9704d.CPU_ACQUIRED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                YC0.f44771k.addAndGet(YC0.this, 4398046511104L);
            }
            if (enumC9704d2 != enumC9704d) {
                this.f44783c = enumC9704d;
            }
            return z;
        }

        /* renamed from: t */
        public final WY5 m75427t(boolean z) {
            long m110616l;
            int i = (int) (YC0.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int m75436k = m75436k(i);
            YC0 yc0 = YC0.this;
            long j = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                m75436k++;
                if (m75436k > i) {
                    m75436k = 1;
                }
                C9703c m100660b = yc0.f44780h.m100660b(m75436k);
                if (m100660b != null && m100660b != this) {
                    if (z) {
                        m110616l = this.f44782b.m110617k(m100660b.f44782b);
                    } else {
                        m110616l = this.f44782b.m110616l(m100660b.f44782b);
                    }
                    if (m110616l == -1) {
                        return this.f44782b.m110620h();
                    }
                    if (m110616l > 0) {
                        j = Math.min(j, m110616l);
                    }
                }
            }
            if (j == LongCompanionObject.MAX_VALUE) {
                j = 0;
            }
            this.f44785e = j;
            return null;
        }

        /* renamed from: u */
        public final void m75426u() {
            YC0 yc0 = YC0.this;
            synchronized (yc0.f44780h) {
                if (yc0.isTerminated()) {
                    return;
                }
                if (((int) (yc0.controlState & 2097151)) <= yc0.f44774b) {
                    return;
                }
                if (!f44781i.compareAndSet(this, -1, 1)) {
                    return;
                }
                int i = this.indexInArray;
                m75432o(0);
                yc0.m75455m(this, i, 0);
                int andDecrement = (int) (YC0.f44771k.getAndDecrement(yc0) & 2097151);
                if (andDecrement != i) {
                    C9703c m100660b = yc0.f44780h.m100660b(andDecrement);
                    Intrinsics.checkNotNull(m100660b);
                    C9703c c9703c = m100660b;
                    yc0.f44780h.m100659c(i, c9703c);
                    c9703c.m75432o(i);
                    yc0.m75455m(c9703c, andDecrement, i);
                }
                yc0.f44780h.m100659c(andDecrement, null);
                Unit unit = Unit.INSTANCE;
                this.f44783c = EnumC9704d.TERMINATED;
            }
        }

        public C9703c(YC0 yc0, int i) {
            this();
            m75432o(i);
        }
    }
}
