package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016J$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J.\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b*\u00020\u001a2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, m28432d2 = {"LFh1;", "LEh1;", "LqZ0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "y", "", "timeMillis", "LWc0;", "continuation", "l", "Lo51;", "t", "close", "", "toString", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledFuture;", "S", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "G", "Ljava/util/concurrent/Executor;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/Executor;", "L", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Fh1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C32847Fh1 extends AbstractC32613Eh1 implements InterfaceC47527qZ0 {

    /* renamed from: d */
    public final Executor f9958d;

    public C32847Fh1(Executor executor) {
        this.f9958d = executor;
        C53071zu0.m148a(m106748L());
    }

    /* renamed from: G */
    public final void m106749G(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        C34018Kh2.m98508d(coroutineContext, C42270hh1.m36097a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: L */
    public Executor m106748L() {
        return this.f9958d;
    }

    /* renamed from: S */
    public final ScheduledFuture<?> m106747S(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            m106749G(coroutineContext, e);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor m106748L = m106748L();
        ExecutorService executorService = m106748L instanceof ExecutorService ? (ExecutorService) m106748L : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C32847Fh1) && ((C32847Fh1) obj).m106748L() == m106748L();
    }

    public int hashCode() {
        return System.identityHashCode(m106748L());
    }

    @Override // p000.InterfaceC47527qZ0
    /* renamed from: l */
    public void mo14152l(long j, InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0) {
        ScheduledExecutorService scheduledExecutorService;
        Executor m106748L = m106748L();
        ScheduledFuture<?> scheduledFuture = null;
        if (m106748L instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) m106748L;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = m106747S(scheduledExecutorService, new RunnableC44458lN4(this, interfaceC36779Wc0), interfaceC36779Wc0.getContext(), j);
        }
        if (scheduledFuture != null) {
            C34018Kh2.m98502j(interfaceC36779Wc0, scheduledFuture);
        } else {
            RunnableC38004aX0.f50615h.mo14152l(j, interfaceC36779Wc0);
        }
    }

    @Override // p000.InterfaceC47527qZ0
    /* renamed from: t */
    public InterfaceC46067o51 mo14151t(long j, Runnable runnable, CoroutineContext coroutineContext) {
        ScheduledExecutorService scheduledExecutorService;
        Executor m106748L = m106748L();
        ScheduledFuture<?> scheduledFuture = null;
        if (m106748L instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) m106748L;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = m106747S(scheduledExecutorService, runnable, coroutineContext, j);
        }
        if (scheduledFuture != null) {
            return new C45474n51(scheduledFuture);
        }
        return RunnableC38004aX0.f50615h.mo14151t(j, runnable, coroutineContext);
    }

    @Override // p000.SC0
    public String toString() {
        return m106748L().toString();
    }

    @Override // p000.SC0
    /* renamed from: y */
    public void mo14150y(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnable2;
        try {
            Executor m106748L = m106748L();
            AbstractC28153s1 m13249a = C28498t1.m13249a();
            if (m13249a == null || (runnable2 = m13249a.m14882h(runnable)) == null) {
                runnable2 = runnable;
            }
            m106748L.execute(runnable2);
        } catch (RejectedExecutionException e) {
            AbstractC28153s1 m13249a2 = C28498t1.m13249a();
            if (m13249a2 != null) {
                m13249a2.m14885e();
            }
            m106749G(coroutineContext, e);
            T41.m84377b().mo14150y(coroutineContext, runnable);
        }
    }
}
