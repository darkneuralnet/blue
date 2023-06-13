package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¨\u0006\t"}, m28432d2 = {"Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "exception", "", C17296a.f69688o, "originalException", "thrownException", "b", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: VC0 */
/* loaded from: classes8.dex */
public final class VC0 {
    /* renamed from: a */
    public static final void m80237a(CoroutineContext coroutineContext, Throwable th) {
        try {
            TC0 tc0 = (TC0) coroutineContext.get(TC0.f34895N);
            if (tc0 != null) {
                tc0.mo3742u(coroutineContext, th);
            } else {
                UC0.m81879a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            UC0.m81879a(coroutineContext, m80236b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m80236b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        ExceptionsKt__ExceptionsKt.addSuppressed(runtimeException, th);
        return runtimeException;
    }
}
