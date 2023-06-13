package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.analytics.TraceKeyKt;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import p000.AbstractC34242Lg1;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b,\u0010 J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014J\b\u0010\f\u001a\u00020\u0005H\u0016J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00072\n\u0010\u000e\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0002R\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00158TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(¨\u0006-"}, m28432d2 = {"LaX0;", "LLg1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "o0", "", "now", "LLg1$c;", "delayedTask", "j0", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lo51;", "t", "run", "J0", "Ljava/lang/Thread;", "D0", "", "I0", "C0", "i", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "()V", "", "debugStatus", "I", "i0", "()Ljava/lang/Thread;", TraceKeyKt.IS_MAIN_THREAD, "E0", "()Z", "isShutDown", "H0", "isShutdownRequested", "<init>", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: aX0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC38004aX0 extends AbstractC34242Lg1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: h */
    public static final RunnableC38004aX0 f50615h;

    /* renamed from: i */
    public static final long f50616i;

    static {
        Long l;
        RunnableC38004aX0 runnableC38004aX0 = new RunnableC38004aX0();
        f50615h = runnableC38004aX0;
        AbstractC34008Kg1.m98568X(runnableC38004aX0, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f50616i = timeUnit.toNanos(l.longValue());
    }

    private RunnableC38004aX0() {
    }

    /* renamed from: C0 */
    public final synchronized void m71249C0() {
        if (!m71246H0()) {
            return;
        }
        debugStatus = 3;
        m96498u0();
        notifyAll();
    }

    /* renamed from: D0 */
    public final synchronized Thread m71248D0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: E0 */
    public final boolean m71247E0() {
        return debugStatus == 4;
    }

    /* renamed from: H0 */
    public final boolean m71246H0() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: I0 */
    public final synchronized boolean m71245I0() {
        if (m71246H0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: J0 */
    public final void m71244J0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p000.AbstractC34476Mg1
    /* renamed from: i0 */
    public Thread mo71243i0() {
        Thread thread = _thread;
        return thread == null ? m71248D0() : thread;
    }

    @Override // p000.AbstractC34476Mg1
    /* renamed from: j0 */
    public void mo71242j0(long j, AbstractC34242Lg1.AbstractRunnableC5059c abstractRunnableC5059c) {
        m71244J0();
    }

    @Override // p000.AbstractC34242Lg1
    /* renamed from: o0 */
    public void mo71241o0(Runnable runnable) {
        if (m71247E0()) {
            m71244J0();
        }
        super.mo71241o0(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Unit unit;
        long nanoTime;
        boolean m96500r0;
        C51387x36.f117057a.m5886d(this);
        AbstractC28153s1 m13249a = C28498t1.m13249a();
        if (m13249a != null) {
            m13249a.m14887c();
        }
        try {
            if (!m71245I0()) {
                if (!m96500r0) {
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long mo96505c0 = mo96505c0();
                if (mo96505c0 == LongCompanionObject.MAX_VALUE) {
                    AbstractC28153s1 m13249a2 = C28498t1.m13249a();
                    if (m13249a2 != null) {
                        nanoTime = m13249a2.m14889a();
                    } else {
                        nanoTime = System.nanoTime();
                    }
                    if (j == LongCompanionObject.MAX_VALUE) {
                        j = f50616i + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 > 0) {
                        mo96505c0 = RangesKt___RangesKt.coerceAtMost(mo96505c0, j2);
                    } else {
                        _thread = null;
                        m71249C0();
                        AbstractC28153s1 m13249a3 = C28498t1.m13249a();
                        if (m13249a3 != null) {
                            m13249a3.m14883g();
                        }
                        if (!m96500r0()) {
                            mo71243i0();
                            return;
                        }
                        return;
                    }
                } else {
                    j = Long.MAX_VALUE;
                }
                if (mo96505c0 > 0) {
                    if (m71246H0()) {
                        _thread = null;
                        m71249C0();
                        AbstractC28153s1 m13249a4 = C28498t1.m13249a();
                        if (m13249a4 != null) {
                            m13249a4.m14883g();
                        }
                        if (!m96500r0()) {
                            mo71243i0();
                            return;
                        }
                        return;
                    }
                    AbstractC28153s1 m13249a5 = C28498t1.m13249a();
                    if (m13249a5 != null) {
                        m13249a5.m14888b(this, mo96505c0);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        LockSupport.parkNanos(this, mo96505c0);
                    }
                }
            }
        } finally {
            _thread = null;
            m71249C0();
            AbstractC28153s1 m13249a6 = C28498t1.m13249a();
            if (m13249a6 != null) {
                m13249a6.m14883g();
            }
            if (!m96500r0()) {
                mo71243i0();
            }
        }
    }

    @Override // p000.AbstractC34242Lg1, p000.AbstractC34008Kg1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p000.AbstractC34242Lg1, p000.InterfaceC47527qZ0
    /* renamed from: t */
    public InterfaceC46067o51 mo14151t(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return m96495y0(j, runnable);
    }
}
