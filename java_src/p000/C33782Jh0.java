package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a]\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b0\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m28432d2 = {"T", "LGu1;", "Lkotlin/coroutines/CoroutineContext;", "emitContext", DateTokenConverter.CONVERTER_KEY, "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "b", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: Jh0 */
/* loaded from: classes8.dex */
public final class C33782Jh0 {
    /* renamed from: a */
    public static final /* synthetic */ InterfaceC33198Gu1 m100025a(InterfaceC33198Gu1 interfaceC33198Gu1, CoroutineContext coroutineContext) {
        return m100022d(interfaceC33198Gu1, coroutineContext);
    }

    /* renamed from: b */
    public static final <T, V> Object m100024b(CoroutineContext coroutineContext, V v, Object obj, Function2<? super V, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        Object coroutine_suspended;
        Object m7521c = C50794w36.m7521c(coroutineContext, obj);
        try {
            Object invoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(v, new C46247oO5(continuation, coroutineContext));
            C50794w36.m7523a(coroutineContext, m7521c);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (invoke == coroutine_suspended) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return invoke;
        } catch (Throwable th) {
            C50794w36.m7523a(coroutineContext, m7521c);
            throw th;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ Object m100023c(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = C50794w36.m7522b(coroutineContext);
        }
        return m100024b(coroutineContext, obj, obj2, function2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static final <T> InterfaceC33198Gu1<T> m100022d(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, CoroutineContext coroutineContext) {
        boolean z;
        if (interfaceC33198Gu1 instanceof C32248Cs5) {
            z = true;
        } else {
            z = interfaceC33198Gu1 instanceof K93;
        }
        if (!z) {
            return new C32348Dd6(interfaceC33198Gu1, coroutineContext);
        }
        return interfaceC33198Gu1;
    }
}
