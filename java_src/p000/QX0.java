package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0016J\u001c\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0017J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LQX0;", "LEh1;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "", "execute", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlinx/coroutines/Runnable;", "block", "y", "A", "close", "", "toString", "LSC0;", "e", "LSC0;", "default", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: QX0 */
/* loaded from: classes8.dex */
public final class QX0 extends AbstractC32613Eh1 implements Executor {

    /* renamed from: d */
    public static final QX0 f30471d = new QX0();

    /* renamed from: e */
    public static final SC0 f30472e;

    static {
        int coerceAtLeast;
        int m28846d;
        C45803ne6 c45803ne6 = C45803ne6.f100272c;
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(64, C42779iY5.m33826a());
        m28846d = C43965kY5.m28846d("kotlinx.coroutines.io.parallelism", coerceAtLeast, 0, 0, 12, null);
        f30472e = c45803ne6.m85853C(m28846d);
    }

    private QX0() {
    }

    @Override // p000.SC0
    /* renamed from: A */
    public void mo23366A(CoroutineContext coroutineContext, Runnable runnable) {
        f30472e.mo23366A(coroutineContext, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mo14150y(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // p000.SC0
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // p000.SC0
    /* renamed from: y */
    public void mo14150y(CoroutineContext coroutineContext, Runnable runnable) {
        f30472e.mo14150y(coroutineContext, runnable);
    }
}
