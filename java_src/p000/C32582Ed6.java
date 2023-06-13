package p000;

import ch.qos.logback.core.CoreConstants;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014R*\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"LEd6;", "T", "LUm5;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "oldValue", "", "h1", "", "g1", TransferTable.COLUMN_STATE, "b1", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "e", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Ed6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C32582Ed6<T> extends C36406Um5<T> {

    /* renamed from: e */
    public ThreadLocal<Pair<CoroutineContext, Object>> f7894e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C32582Ed6(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        super(r0, continuation);
        CoroutineContext coroutineContext2;
        C33050Gd6 c33050Gd6 = C33050Gd6.f12186b;
        if (coroutineContext.get(c33050Gd6) == null) {
            coroutineContext2 = coroutineContext.plus(c33050Gd6);
        } else {
            coroutineContext2 = coroutineContext;
        }
        this.f7894e = new ThreadLocal<>();
        if (!(continuation.getContext().get(ContinuationInterceptor.Key) instanceof SC0)) {
            Object m7521c = C50794w36.m7521c(coroutineContext, null);
            C50794w36.m7523a(coroutineContext, m7521c);
            m108634h1(coroutineContext, m7521c);
        }
    }

    @Override // p000.C36406Um5, p000.AbstractC27449q0
    /* renamed from: b1 */
    public void mo18341b1(Object obj) {
        Pair<CoroutineContext, Object> pair = this.f7894e.get();
        C32582Ed6<?> c32582Ed6 = null;
        if (pair != null) {
            C50794w36.m7523a(pair.component1(), pair.component2());
            this.f7894e.set(null);
        }
        Object m11550a = C49494ts0.m11550a(obj, this.f37977d);
        Continuation<T> continuation = this.f37977d;
        CoroutineContext context = continuation.getContext();
        Object m7521c = C50794w36.m7521c(context, null);
        if (m7521c != C50794w36.f115218a) {
            c32582Ed6 = RC0.m87208g(continuation, context, m7521c);
        }
        try {
            this.f37977d.resumeWith(m11550a);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (c32582Ed6 == null || c32582Ed6.m108635g1()) {
                C50794w36.m7523a(context, m7521c);
            }
        }
    }

    /* renamed from: g1 */
    public final boolean m108635g1() {
        if (this.f7894e.get() == null) {
            return false;
        }
        this.f7894e.set(null);
        return true;
    }

    /* renamed from: h1 */
    public final void m108634h1(CoroutineContext coroutineContext, Object obj) {
        this.f7894e.set(TuplesKt.m28425to(coroutineContext, obj));
    }
}
