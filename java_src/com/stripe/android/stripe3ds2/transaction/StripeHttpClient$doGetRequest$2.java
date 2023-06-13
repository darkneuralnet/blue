package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.io.InputStream;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Ljava/io/InputStream;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
@DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.transaction.StripeHttpClient$doGetRequest$2", m28418f = "StripeHttpClient.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class StripeHttpClient$doGetRequest$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super InputStream>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StripeHttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeHttpClient$doGetRequest$2(StripeHttpClient stripeHttpClient, Continuation<? super StripeHttpClient$doGetRequest$2> continuation) {
        super(2, continuation);
        this.this$0 = stripeHttpClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StripeHttpClient$doGetRequest$2 stripeHttpClient$doGetRequest$2 = new StripeHttpClient$doGetRequest$2(this.this$0, continuation);
        stripeHttpClient$doGetRequest$2.L$0 = obj;
        return stripeHttpClient$doGetRequest$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super InputStream> continuation) {
        return ((StripeHttpClient$doGetRequest$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m116783constructorimpl;
        ErrorReporter errorReporter;
        HttpURLConnection createGetConnection;
        InputStream inputStream;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ZC0 zc0 = (ZC0) this.L$0;
            StripeHttpClient stripeHttpClient = this.this$0;
            try {
                Result.Companion companion = Result.Companion;
                createGetConnection = stripeHttpClient.createGetConnection();
                createGetConnection.connect();
                if (createGetConnection.getResponseCode() == 200) {
                    inputStream = createGetConnection.getInputStream();
                } else {
                    inputStream = null;
                }
                m116783constructorimpl = Result.m116783constructorimpl(inputStream);
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
            if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                return null;
            }
            return m116783constructorimpl;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
