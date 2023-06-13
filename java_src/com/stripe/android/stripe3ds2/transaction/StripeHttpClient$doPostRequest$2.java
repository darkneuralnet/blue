package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
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
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
@DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.transaction.StripeHttpClient$doPostRequest$2", m28418f = "StripeHttpClient.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class StripeHttpClient$doPostRequest$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super HttpResponse>, Object> {
    final /* synthetic */ String $contentType;
    final /* synthetic */ String $requestBody;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StripeHttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeHttpClient$doPostRequest$2(StripeHttpClient stripeHttpClient, String str, String str2, Continuation<? super StripeHttpClient$doPostRequest$2> continuation) {
        super(2, continuation);
        this.this$0 = stripeHttpClient;
        this.$requestBody = str;
        this.$contentType = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StripeHttpClient$doPostRequest$2 stripeHttpClient$doPostRequest$2 = new StripeHttpClient$doPostRequest$2(this.this$0, this.$requestBody, this.$contentType, continuation);
        stripeHttpClient$doPostRequest$2.L$0 = obj;
        return stripeHttpClient$doPostRequest$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super HttpResponse> continuation) {
        return ((StripeHttpClient$doPostRequest$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m116783constructorimpl;
        ErrorReporter errorReporter;
        HttpResponse doPostRequestInternal;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ZC0 zc0 = (ZC0) this.L$0;
            StripeHttpClient stripeHttpClient = this.this$0;
            String str = this.$requestBody;
            String str2 = this.$contentType;
            try {
                Result.Companion companion = Result.Companion;
                doPostRequestInternal = stripeHttpClient.doPostRequestInternal(str, str2);
                m116783constructorimpl = Result.m116783constructorimpl(doPostRequestInternal);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            StripeHttpClient stripeHttpClient2 = this.this$0;
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl != null) {
                errorReporter = stripeHttpClient2.errorReporter;
                errorReporter.reportError(m116786exceptionOrNullimpl);
            }
            Throwable m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl2 == null) {
                return m116783constructorimpl;
            }
            throw new SDKRuntimeException(m116786exceptionOrNullimpl2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
