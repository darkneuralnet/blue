package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001aO\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\"\u001b\u0010\u0018\u001a\u00020\u0013*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m28432d2 = {"LZC0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "g", "b", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "e", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", C17296a.f69688o, "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "c", "", "f", "(LZC0;)Z", "isActive$annotations", "(LZC0;)V", "isActive", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: aD0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C37824aD0 {
    /* renamed from: a */
    public static final ZC0 m71790a(CoroutineContext coroutineContext) {
        InterfaceC45344ms0 m95045b;
        if (coroutineContext.get(InterfaceC52943zh2.f122077a0) == null) {
            m95045b = C34486Mh2.m95045b(null, 1, null);
            coroutineContext = coroutineContext.plus(m95045b);
        }
        return new ZA0(coroutineContext);
    }

    /* renamed from: b */
    public static final ZC0 m71789b() {
        return new ZA0(XU5.m76946b(null, 1, null).plus(T41.m84376c()));
    }

    /* renamed from: c */
    public static final void m71788c(ZC0 zc0, CancellationException cancellationException) {
        InterfaceC52943zh2 interfaceC52943zh2 = (InterfaceC52943zh2) zc0.mo18342K().get(InterfaceC52943zh2.f122077a0);
        if (interfaceC52943zh2 != null) {
            interfaceC52943zh2.mo552f(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + zc0).toString());
    }

    /* renamed from: d */
    public static /* synthetic */ void m71787d(ZC0 zc0, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m71788c(zc0, cancellationException);
    }

    /* renamed from: e */
    public static final <R> Object m71786e(Function2<? super ZC0, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        Object coroutine_suspended;
        C36406Um5 c36406Um5 = new C36406Um5(continuation.getContext(), continuation);
        Object m106836c = C32816Fd6.m106836c(c36406Um5, c36406Um5, function2);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m106836c == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m106836c;
    }

    /* renamed from: f */
    public static final boolean m71785f(ZC0 zc0) {
        InterfaceC52943zh2 interfaceC52943zh2 = (InterfaceC52943zh2) zc0.mo18342K().get(InterfaceC52943zh2.f122077a0);
        if (interfaceC52943zh2 != null) {
            return interfaceC52943zh2.mo555b();
        }
        return true;
    }

    /* renamed from: g */
    public static final ZC0 m71784g(ZC0 zc0, CoroutineContext coroutineContext) {
        return new ZA0(zc0.mo18342K().plus(coroutineContext));
    }
}
