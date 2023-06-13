package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, m28432d2 = {"", C17296a.f69688o, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: fI6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40857fI6 {
    /* renamed from: a */
    public static final Object m41600a(Continuation<? super Unit> continuation) {
        Continuation intercepted;
        L41 l41;
        Object obj;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        CoroutineContext context = continuation.getContext();
        C34018Kh2.m98499m(context);
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        if (intercepted instanceof L41) {
            l41 = (L41) intercepted;
        } else {
            l41 = null;
        }
        if (l41 == null) {
            obj = Unit.INSTANCE;
        } else {
            if (l41.f20670e.mo14157B(context)) {
                l41.m97877j(context, Unit.INSTANCE);
            } else {
                C40264eI6 c40264eI6 = new C40264eI6();
                CoroutineContext plus = context.plus(c40264eI6);
                Unit unit = Unit.INSTANCE;
                l41.m97877j(plus, unit);
                if (c40264eI6.f78219b) {
                    if (M41.m95846d(l41)) {
                        obj = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    } else {
                        obj = unit;
                    }
                }
            }
            obj = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (obj == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (obj == coroutine_suspended2) {
            return obj;
        }
        return Unit.INSTANCE;
    }
}
