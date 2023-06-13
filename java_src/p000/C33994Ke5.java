package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0006"}, m28432d2 = {"", "cause", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "kotlinx-coroutines-rx2"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: Ke5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C33994Ke5 {
    /* renamed from: a */
    public static final void m98628a(Throwable th, CoroutineContext coroutineContext) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            C24508a.m31988u(th);
        } catch (Throwable th2) {
            ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
            VC0.m80237a(coroutineContext, th);
        }
    }
}
