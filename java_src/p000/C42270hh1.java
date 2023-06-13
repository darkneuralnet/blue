package p000;

import com.facebook.share.internal.C17296a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\n\u0010\u0007\"\u00020\u00042\u00020\u0004¨\u0006\b"}, m28432d2 = {"", "message", "", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", C17296a.f69688o, "CancellationException", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: hh1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42270hh1 {
    /* renamed from: a */
    public static final CancellationException m36097a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
