package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aV\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function2;", "LZC0;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", C17296a.f69688o, "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: Y30 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Y30 {
    /* renamed from: a */
    public static final <T> T m75795a(CoroutineContext coroutineContext, Function2<? super ZC0, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        AbstractC34008Kg1 abstractC34008Kg1;
        AbstractC34008Kg1 m5889a;
        CoroutineContext m87211d;
        Thread currentThread = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.Key);
        if (continuationInterceptor == null) {
            m5889a = C51387x36.f117057a.m5888b();
            m87211d = RC0.m87211d(VC1.f38731b, coroutineContext.plus(m5889a));
        } else {
            AbstractC34008Kg1 abstractC34008Kg12 = null;
            if (continuationInterceptor instanceof AbstractC34008Kg1) {
                abstractC34008Kg1 = (AbstractC34008Kg1) continuationInterceptor;
            } else {
                abstractC34008Kg1 = null;
            }
            if (abstractC34008Kg1 != null) {
                if (abstractC34008Kg1.m98564h0()) {
                    abstractC34008Kg12 = abstractC34008Kg1;
                }
                if (abstractC34008Kg12 != null) {
                    m5889a = abstractC34008Kg12;
                    m87211d = RC0.m87211d(VC1.f38731b, coroutineContext);
                }
            }
            m5889a = C51387x36.f117057a.m5889a();
            m87211d = RC0.m87211d(VC1.f38731b, coroutineContext);
        }
        C8661VW c8661vw = new C8661VW(m87211d, currentThread, m5889a);
        c8661vw.m18338e1(EnumC38417bD0.DEFAULT, c8661vw, function2);
        return (T) c8661vw.m79832f1();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m75794b(CoroutineContext coroutineContext, Function2 function2, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return X30.m77506e(coroutineContext, function2);
    }
}
