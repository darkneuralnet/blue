package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.time.Duration;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u0019\u0010\b\u001a\u00020\u0000*\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, m28432d2 = {"", "timeMillis", "", C17296a.f69688o, "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/time/Duration;", "duration", "b", DateTokenConverter.CONVERTER_KEY, "(J)J", "Lkotlin/coroutines/CoroutineContext;", "LqZ0;", "c", "(Lkotlin/coroutines/CoroutineContext;)LqZ0;", "delay", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: rZ0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48120rZ0 {
    /* renamed from: a */
    public static final Object m15768a(long j, Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        if (j <= 0) {
            return Unit.INSTANCE;
        }
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.m76766u();
        if (j < LongCompanionObject.MAX_VALUE) {
            m15766c(c37013Xc0.getContext()).mo14152l(j, c37013Xc0);
        }
        Object m76770q = c37013Xc0.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended2) {
            return m76770q;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public static final Object m15767b(long j, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m15768a = m15768a(m15765d(j), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m15768a == coroutine_suspended ? m15768a : Unit.INSTANCE;
    }

    /* renamed from: c */
    public static final InterfaceC47527qZ0 m15766c(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.Key);
        InterfaceC47527qZ0 interfaceC47527qZ0 = element instanceof InterfaceC47527qZ0 ? (InterfaceC47527qZ0) element : null;
        return interfaceC47527qZ0 == null ? C38597bX0.m64484a() : interfaceC47527qZ0;
    }

    /* renamed from: d */
    public static final long m15765d(long j) {
        long coerceAtLeast;
        if (Duration.m118139compareToLRDsOJo(j, Duration.Companion.m118242getZEROUwyO8pc()) > 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Duration.m118158getInWholeMillisecondsimpl(j), 1L);
            return coerceAtLeast;
        }
        return 0L;
    }
}
