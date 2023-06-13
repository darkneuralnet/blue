package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, m28432d2 = {"LCd6;", "LSC0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "B", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "y", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Cd6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C32114Cd6 extends SC0 {

    /* renamed from: c */
    public static final C32114Cd6 f4418c = new C32114Cd6();

    private C32114Cd6() {
    }

    @Override // p000.SC0
    /* renamed from: B */
    public boolean mo14157B(CoroutineContext coroutineContext) {
        return false;
    }

    @Override // p000.SC0
    public String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // p000.SC0
    /* renamed from: y */
    public void mo14150y(CoroutineContext coroutineContext, Runnable runnable) {
        C40264eI6 c40264eI6 = (C40264eI6) coroutineContext.get(C40264eI6.f78218c);
        if (c40264eI6 != null) {
            c40264eI6.f78219b = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
}
