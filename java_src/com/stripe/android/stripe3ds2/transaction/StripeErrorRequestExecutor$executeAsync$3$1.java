package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
@DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor$executeAsync$3$1", m28418f = "StripeErrorRequestExecutor.kt", m28417i = {}, m28416l = {33}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class StripeErrorRequestExecutor$executeAsync$3$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $requestBody;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StripeErrorRequestExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeErrorRequestExecutor$executeAsync$3$1(StripeErrorRequestExecutor stripeErrorRequestExecutor, String str, Continuation<? super StripeErrorRequestExecutor$executeAsync$3$1> continuation) {
        super(2, continuation);
        this.this$0 = stripeErrorRequestExecutor;
        this.$requestBody = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StripeErrorRequestExecutor$executeAsync$3$1 stripeErrorRequestExecutor$executeAsync$3$1 = new StripeErrorRequestExecutor$executeAsync$3$1(this.this$0, this.$requestBody, continuation);
        stripeErrorRequestExecutor$executeAsync$3$1.L$0 = obj;
        return stripeErrorRequestExecutor$executeAsync$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((StripeErrorRequestExecutor$executeAsync$3$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        ErrorReporter errorReporter;
        HttpClient httpClient;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ZC0 zc0 = (ZC0) this.L$0;
                StripeErrorRequestExecutor stripeErrorRequestExecutor = this.this$0;
                String requestBody = this.$requestBody;
                Result.Companion companion = Result.Companion;
                httpClient = stripeErrorRequestExecutor.httpClient;
                Intrinsics.checkNotNullExpressionValue(requestBody, "requestBody");
                this.label = 1;
                obj = httpClient.doPostRequest(requestBody, "application/json; charset=utf-8", this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            m116783constructorimpl = Result.m116783constructorimpl((HttpResponse) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        StripeErrorRequestExecutor stripeErrorRequestExecutor2 = this.this$0;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
            errorReporter = stripeErrorRequestExecutor2.errorReporter;
            errorReporter.reportError(m116786exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
