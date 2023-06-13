package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, m28432d2 = {"LAl0;", "Ljava/io/Closeable;", "LZC0;", "", "close", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "K", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "lifecycle-viewmodel-ktx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Al0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31712Al0 implements Closeable, ZC0 {

    /* renamed from: b */
    public final CoroutineContext f1025b;

    public C31712Al0(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f1025b = context;
    }

    @Override // p000.ZC0
    /* renamed from: K */
    public CoroutineContext mo18342K() {
        return this.f1025b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C34486Mh2.m95041f(mo18342K(), null, 1, null);
    }
}
