package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutCancellationException;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
@DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$2", m28418f = "StripeChallengeRequestExecutor.kt", m28417i = {}, m28416l = {62, 70}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class StripeChallengeRequestExecutor$execute$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super ChallengeRequestResult>, Object> {
    final /* synthetic */ ChallengeRequestData $creqData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StripeChallengeRequestExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeChallengeRequestExecutor$execute$2(StripeChallengeRequestExecutor stripeChallengeRequestExecutor, ChallengeRequestData challengeRequestData, Continuation<? super StripeChallengeRequestExecutor$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = stripeChallengeRequestExecutor;
        this.$creqData = challengeRequestData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StripeChallengeRequestExecutor$execute$2 stripeChallengeRequestExecutor$execute$2 = new StripeChallengeRequestExecutor$execute$2(this.this$0, this.$creqData, continuation);
        stripeChallengeRequestExecutor$execute$2.L$0 = obj;
        return stripeChallengeRequestExecutor$execute$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super ChallengeRequestResult> continuation) {
        return ((StripeChallengeRequestExecutor$execute$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        ChallengeResponseProcessor challengeResponseProcessor;
        ErrorReporter errorReporter;
        HttpClient httpClient;
        String requestBody;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return (ChallengeRequestResult) obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            ZC0 zc0 = (ZC0) this.L$0;
            StripeChallengeRequestExecutor stripeChallengeRequestExecutor = this.this$0;
            ChallengeRequestData challengeRequestData = this.$creqData;
            Result.Companion companion2 = Result.Companion;
            httpClient = stripeChallengeRequestExecutor.httpClient;
            requestBody = stripeChallengeRequestExecutor.getRequestBody(challengeRequestData.toJson$3ds2sdk_release());
            this.label = 1;
            obj = httpClient.doPostRequest(requestBody, "application/jose; charset=UTF-8", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        m116783constructorimpl = Result.m116783constructorimpl((HttpResponse) obj);
        StripeChallengeRequestExecutor stripeChallengeRequestExecutor2 = this.this$0;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
            errorReporter = stripeChallengeRequestExecutor2.errorReporter;
            errorReporter.reportError(m116786exceptionOrNullimpl);
        }
        StripeChallengeRequestExecutor stripeChallengeRequestExecutor3 = this.this$0;
        ChallengeRequestData challengeRequestData2 = this.$creqData;
        Throwable m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl2 == null) {
            challengeResponseProcessor = stripeChallengeRequestExecutor3.responseProcessor;
            this.label = 2;
            obj = challengeResponseProcessor.process(challengeRequestData2, (HttpResponse) m116783constructorimpl, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (ChallengeRequestResult) obj;
        } else if (m116786exceptionOrNullimpl2 instanceof TimeoutCancellationException) {
            return StripeChallengeRequestExecutor.Companion.createTimeoutResult(challengeRequestData2);
        } else {
            return new ChallengeRequestResult.RuntimeError(m116786exceptionOrNullimpl2);
        }
    }
}
