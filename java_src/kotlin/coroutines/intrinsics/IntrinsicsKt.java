package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt", "kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsKt"}, m28431k = 4, m28430mv = {1, 8, 0}, m28428xi = 49)
/* loaded from: classes8.dex */
public final class IntrinsicsKt extends IntrinsicsKt__IntrinsicsKt {
    private IntrinsicsKt() {
    }

    public static /* bridge */ /* synthetic */ Object getCOROUTINE_SUSPENDED() {
        return IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    @SinceKotlin(version = "1.3")
    public static /* bridge */ /* synthetic */ Continuation intercepted(Continuation continuation) {
        return IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
    }

    @SinceKotlin(version = "1.3")
    public static /* bridge */ /* synthetic */ Continuation createCoroutineUnintercepted(Function2 function2, Object obj, Continuation continuation) {
        return IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function2, obj, continuation);
    }
}
