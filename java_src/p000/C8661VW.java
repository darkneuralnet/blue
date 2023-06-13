package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"LVW;", "T", "Lq0;", "", TransferTable.COLUMN_STATE, "", "W", "f1", "()Ljava/lang/Object;", "Ljava/lang/Thread;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Thread;", "blockedThread", "LKg1;", "e", "LKg1;", "eventLoop", "", "x0", "()Z", "isScopedCoroutine", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;LKg1;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: VW */
/* loaded from: classes8.dex */
public final class C8661VW<T> extends AbstractC27449q0<T> {

    /* renamed from: d */
    public final Thread f39175d;

    /* renamed from: e */
    public final AbstractC34008Kg1 f39176e;

    public C8661VW(CoroutineContext coroutineContext, Thread thread, AbstractC34008Kg1 abstractC34008Kg1) {
        super(coroutineContext, true, true);
        this.f39175d = thread;
        this.f39176e = abstractC34008Kg1;
    }

    @Override // p000.C35890Sh2
    /* renamed from: W */
    public void mo79833W(Object obj) {
        Unit unit;
        if (!Intrinsics.areEqual(Thread.currentThread(), this.f39175d)) {
            Thread thread = this.f39175d;
            AbstractC28153s1 m13249a = C28498t1.m13249a();
            if (m13249a != null) {
                m13249a.m14884f(thread);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                LockSupport.unpark(thread);
            }
        }
    }

    /* renamed from: f1 */
    public final T m79832f1() {
        long j;
        Unit unit;
        AbstractC28153s1 m13249a = C28498t1.m13249a();
        if (m13249a != null) {
            m13249a.m14887c();
        }
        try {
            AbstractC34008Kg1 abstractC34008Kg1 = this.f39176e;
            C47716qs0 c47716qs0 = null;
            if (abstractC34008Kg1 != null) {
                AbstractC34008Kg1.m98568X(abstractC34008Kg1, false, 1, null);
            }
            while (!Thread.interrupted()) {
                AbstractC34008Kg1 abstractC34008Kg12 = this.f39176e;
                if (abstractC34008Kg12 != null) {
                    j = abstractC34008Kg12.mo96505c0();
                } else {
                    j = LongCompanionObject.MAX_VALUE;
                }
                if (!mo554c()) {
                    AbstractC28153s1 m13249a2 = C28498t1.m13249a();
                    if (m13249a2 != null) {
                        m13249a2.m14888b(this, j);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        LockSupport.parkNanos(this, j);
                    }
                } else {
                    AbstractC34008Kg1 abstractC34008Kg13 = this.f39176e;
                    if (abstractC34008Kg13 != null) {
                        AbstractC34008Kg1.m98572L(abstractC34008Kg13, false, 1, null);
                    }
                    T t = (T) C36124Th2.m83151h(m85077t0());
                    if (t instanceof C47716qs0) {
                        c47716qs0 = (C47716qs0) t;
                    }
                    if (c47716qs0 == null) {
                        return t;
                    }
                    throw c47716qs0.f105942a;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            m85094a0(interruptedException);
            throw interruptedException;
        } finally {
            AbstractC28153s1 m13249a3 = C28498t1.m13249a();
            if (m13249a3 != null) {
                m13249a3.m14883g();
            }
        }
    }

    @Override // p000.C35890Sh2
    /* renamed from: x0 */
    public boolean mo79831x0() {
        return true;
    }
}
