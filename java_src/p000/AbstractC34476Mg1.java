package p000;

import co.bird.android.model.analytics.TraceKeyKt;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import p000.AbstractC34242Lg1;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\f\u001a\u00020\t8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LMg1;", "LKg1;", "", "k0", "", "now", "LLg1$c;", "delayedTask", "j0", "Ljava/lang/Thread;", "i0", "()Ljava/lang/Thread;", TraceKeyKt.IS_MAIN_THREAD, "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Mg1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC34476Mg1 extends AbstractC34008Kg1 {
    /* renamed from: i0 */
    public abstract Thread mo71243i0();

    /* renamed from: j0 */
    public void mo71242j0(long j, AbstractC34242Lg1.AbstractRunnableC5059c abstractRunnableC5059c) {
        RunnableC38004aX0.f50615h.m96497v0(j, abstractRunnableC5059c);
    }

    /* renamed from: k0 */
    public final void m95068k0() {
        Unit unit;
        Thread mo71243i0 = mo71243i0();
        if (Thread.currentThread() != mo71243i0) {
            AbstractC28153s1 m13249a = C28498t1.m13249a();
            if (m13249a != null) {
                m13249a.m14884f(mo71243i0);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                LockSupport.unpark(mo71243i0);
            }
        }
    }
}
