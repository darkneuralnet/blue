package p000;

import com.facebook.share.internal.C17296a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007*\f\b\u0007\u0010\b\"\u00020\u00012\u00020\u0001¨\u0006\t"}, m28432d2 = {"Ljava/util/concurrent/ExecutorService;", "LEh1;", "b", "(Ljava/util/concurrent/ExecutorService;)LEh1;", "Ljava/util/concurrent/Executor;", "LSC0;", C17296a.f69688o, "(Ljava/util/concurrent/Executor;)LSC0;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: Kh1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34017Kh1 {
    @JvmName(name = "from")
    /* renamed from: a */
    public static final SC0 m98513a(Executor executor) {
        SC0 sc0;
        R41 r41 = executor instanceof R41 ? (R41) executor : null;
        return (r41 == null || (sc0 = r41.f31468b) == null) ? new C32847Fh1(executor) : sc0;
    }

    @JvmName(name = "from")
    /* renamed from: b */
    public static final AbstractC32613Eh1 m98512b(ExecutorService executorService) {
        return new C32847Fh1(executorService);
    }
}
