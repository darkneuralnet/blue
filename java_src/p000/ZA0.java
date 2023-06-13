package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m28432d2 = {"LZA0;", "LZC0;", "", "toString", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "K", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: ZA0 */
/* loaded from: classes8.dex */
public final class ZA0 implements ZC0 {

    /* renamed from: b */
    public final CoroutineContext f47902b;

    public ZA0(CoroutineContext coroutineContext) {
        this.f47902b = coroutineContext;
    }

    @Override // p000.ZC0
    /* renamed from: K */
    public CoroutineContext mo18342K() {
        return this.f47902b;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + mo18342K() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
