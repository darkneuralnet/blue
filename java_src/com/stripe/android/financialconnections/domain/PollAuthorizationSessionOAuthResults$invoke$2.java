package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.utils.ErrorsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"", "exception", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.domain.PollAuthorizationSessionOAuthResults$invoke$2", m28418f = "PollAuthorizationSessionOAuthResults.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PollAuthorizationSessionOAuthResults$invoke$2 extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public PollAuthorizationSessionOAuthResults$invoke$2(Continuation<? super PollAuthorizationSessionOAuthResults$invoke$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PollAuthorizationSessionOAuthResults$invoke$2 pollAuthorizationSessionOAuthResults$invoke$2 = new PollAuthorizationSessionOAuthResults$invoke$2(continuation);
        pollAuthorizationSessionOAuthResults$invoke$2.L$0 = obj;
        return pollAuthorizationSessionOAuthResults$invoke$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(ErrorsKt.getShouldRetry((Throwable) this.L$0));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Boolean> continuation) {
        return ((PollAuthorizationSessionOAuthResults$invoke$2) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
