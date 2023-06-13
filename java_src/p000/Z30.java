package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aQ\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a]\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aW\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28432d2 = {"LZC0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "LbD0;", "start", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lzh2;", "c", "(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;)Lzh2;", "T", "LhZ0;", C17296a.f69688o, "(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;)LhZ0;", "e", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: Z30 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Z30 {
    /* renamed from: a */
    public static final <T> InterfaceC42190hZ0<T> m73803a(ZC0 zc0, CoroutineContext coroutineContext, EnumC38417bD0 enumC38417bD0, Function2<? super ZC0, ? super Continuation<? super T>, ? extends Object> function2) {
        C42783iZ0 c42783iZ0;
        CoroutineContext m87211d = RC0.m87211d(zc0, coroutineContext);
        if (enumC38417bD0.m64822c()) {
            c42783iZ0 = new C41145fn2(m87211d, function2);
        } else {
            c42783iZ0 = new C42783iZ0(m87211d, true);
        }
        ((AbstractC27449q0) c42783iZ0).m18338e1(enumC38417bD0, c42783iZ0, function2);
        return c42783iZ0;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC42190hZ0 m73802b(ZC0 zc0, CoroutineContext coroutineContext, EnumC38417bD0 enumC38417bD0, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            enumC38417bD0 = EnumC38417bD0.DEFAULT;
        }
        return X30.m77510a(zc0, coroutineContext, enumC38417bD0, function2);
    }

    /* renamed from: c */
    public static final InterfaceC52943zh2 m73801c(ZC0 zc0, CoroutineContext coroutineContext, EnumC38417bD0 enumC38417bD0, Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> function2) {
        AbstractC27449q0 c48026rO5;
        CoroutineContext m87211d = RC0.m87211d(zc0, coroutineContext);
        if (enumC38417bD0.m64822c()) {
            c48026rO5 = new C34783No2(m87211d, function2);
        } else {
            c48026rO5 = new C48026rO5(m87211d, true);
        }
        c48026rO5.m18338e1(enumC38417bD0, c48026rO5, function2);
        return c48026rO5;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC52943zh2 m73800d(ZC0 zc0, CoroutineContext coroutineContext, EnumC38417bD0 enumC38417bD0, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            enumC38417bD0 = EnumC38417bD0.DEFAULT;
        }
        return X30.m77508c(zc0, coroutineContext, enumC38417bD0, function2);
    }

    /* renamed from: e */
    public static final <T> Object m73799e(CoroutineContext coroutineContext, Function2<? super ZC0, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        Object m94398g1;
        Object coroutine_suspended;
        CoroutineContext context = continuation.getContext();
        CoroutineContext m87210e = RC0.m87210e(context, coroutineContext);
        C34018Kh2.m98499m(m87210e);
        if (m87210e == context) {
            C36406Um5 c36406Um5 = new C36406Um5(m87210e, continuation);
            m94398g1 = C32816Fd6.m106836c(c36406Um5, c36406Um5, function2);
        } else {
            ContinuationInterceptor.Key key = ContinuationInterceptor.Key;
            if (Intrinsics.areEqual(m87210e.get(key), context.get(key))) {
                C32582Ed6 c32582Ed6 = new C32582Ed6(m87210e, continuation);
                Object m7521c = C50794w36.m7521c(m87210e, null);
                try {
                    Object m106836c = C32816Fd6.m106836c(c32582Ed6, c32582Ed6, function2);
                    C50794w36.m7523a(m87210e, m7521c);
                    m94398g1 = m106836c;
                } catch (Throwable th) {
                    C50794w36.m7523a(m87210e, m7521c);
                    throw th;
                }
            } else {
                N41 n41 = new N41(m87210e, continuation);
                C38061ad0.m70996e(function2, n41, n41, null, 4, null);
                m94398g1 = n41.m94398g1();
            }
        }
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m94398g1 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m94398g1;
    }
}
