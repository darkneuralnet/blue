package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.TimeoutCancellationException;
@Metadata(m28433d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aT\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aT\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a[\u0010\u000e\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0005\u001a\u00028\u00012'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a[\u0010\u0010\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0005\u001a\u00028\u00012'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"R", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "receiver", "completion", "", "b", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", C17296a.f69688o, "LUm5;", "Lkotlin/ExtensionFunctionType;", "block", "c", "(LUm5;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: Fd6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C32816Fd6 {
    /* renamed from: a */
    public static final <R, T> void m106838a(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation) {
        Object coroutine_suspended;
        Continuation probeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            CoroutineContext context = continuation.getContext();
            Object m7521c = C50794w36.m7521c(context, null);
            Object invoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, probeCoroutineCreated);
            C50794w36.m7523a(context, m7521c);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (invoke != coroutine_suspended) {
                probeCoroutineCreated.resumeWith(Result.m116783constructorimpl(invoke));
            }
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            probeCoroutineCreated.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(th)));
        }
    }

    /* renamed from: b */
    public static final <R, T> void m106837b(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation) {
        Object coroutine_suspended;
        Continuation probeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            Object invoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, probeCoroutineCreated);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (invoke != coroutine_suspended) {
                probeCoroutineCreated.resumeWith(Result.m116783constructorimpl(invoke));
            }
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            probeCoroutineCreated.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(th)));
        }
    }

    /* renamed from: c */
    public static final <T, R> Object m106836c(C36406Um5<? super T> c36406Um5, R r, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        Object c47716qs0;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        try {
            c47716qs0 = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, c36406Um5);
        } catch (Throwable th) {
            c47716qs0 = new C47716qs0(th, false, 2, null);
        }
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (c47716qs0 == coroutine_suspended) {
            coroutine_suspended3 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return coroutine_suspended3;
        }
        Object m85121C0 = c36406Um5.m85121C0(c47716qs0);
        if (m85121C0 == C36124Th2.f35877b) {
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return coroutine_suspended2;
        } else if (!(m85121C0 instanceof C47716qs0)) {
            return C36124Th2.m83151h(m85121C0);
        } else {
            throw ((C47716qs0) m85121C0).f105942a;
        }
    }

    /* renamed from: d */
    public static final <T, R> Object m106835d(C36406Um5<? super T> c36406Um5, R r, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        Object c47716qs0;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        boolean z = false;
        try {
            c47716qs0 = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, c36406Um5);
        } catch (Throwable th) {
            c47716qs0 = new C47716qs0(th, false, 2, null);
        }
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (c47716qs0 == coroutine_suspended) {
            coroutine_suspended3 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return coroutine_suspended3;
        }
        Object m85121C0 = c36406Um5.m85121C0(c47716qs0);
        if (m85121C0 == C36124Th2.f35877b) {
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return coroutine_suspended2;
        }
        if (m85121C0 instanceof C47716qs0) {
            Throwable th2 = ((C47716qs0) m85121C0).f105942a;
            if (!(((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).f95028b == c36406Um5) ? true : true)) {
                if (c47716qs0 instanceof C47716qs0) {
                    throw ((C47716qs0) c47716qs0).f105942a;
                }
            } else {
                throw th2;
            }
        } else {
            c47716qs0 = C36124Th2.m83151h(m85121C0);
        }
        return c47716qs0;
    }
}
