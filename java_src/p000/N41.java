package p000;

import ch.qos.logback.core.CoreConstants;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0015"}, m28432d2 = {"LN41;", "T", "LUm5;", "", TransferTable.COLUMN_STATE, "", "W", "(Ljava/lang/Object;)V", "b1", "g1", "()Ljava/lang/Object;", "", "i1", "()Z", "h1", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: N41 */
/* loaded from: classes8.dex */
public final class N41<T> extends C36406Um5<T> {

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24100e = AtomicIntegerFieldUpdater.newUpdater(N41.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public N41(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
        this._decision = 0;
    }

    @Override // p000.C36406Um5, p000.C35890Sh2
    /* renamed from: W */
    public void mo79833W(Object obj) {
        mo18341b1(obj);
    }

    @Override // p000.C36406Um5, p000.AbstractC27449q0
    /* renamed from: b1 */
    public void mo18341b1(Object obj) {
        Continuation intercepted;
        if (m94397h1()) {
            return;
        }
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.f37977d);
        M41.m95847c(intercepted, C49494ts0.m11550a(obj, this.f37977d), null, 2, null);
    }

    /* renamed from: g1 */
    public final Object m94398g1() {
        Object coroutine_suspended;
        if (m94396i1()) {
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return coroutine_suspended;
        }
        Object m83151h = C36124Th2.m83151h(m85077t0());
        if (!(m83151h instanceof C47716qs0)) {
            return m83151h;
        }
        throw ((C47716qs0) m83151h).f105942a;
    }

    /* renamed from: h1 */
    public final boolean m94397h1() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f24100e.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: i1 */
    public final boolean m94396i1() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f24100e.compareAndSet(this, 0, 1));
        return true;
    }
}
