package com.stripe.android;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.DefaultIntentConfirmationInterceptor", m28418f = "IntentConfirmationInterceptor.kt", m28417i = {}, m28416l = {219}, m28415m = "retrieveStripeIntent-gIAlu-s", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultIntentConfirmationInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1(DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor, Continuation<? super DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1> continuation) {
        super(continuation);
        this.this$0 = defaultIntentConfirmationInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m116340retrieveStripeIntentgIAlus;
        Object coroutine_suspended;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m116340retrieveStripeIntentgIAlus = this.this$0.m116340retrieveStripeIntentgIAlus(null, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m116340retrieveStripeIntentgIAlus == coroutine_suspended ? m116340retrieveStripeIntentgIAlus : Result.m116782boximpl(m116340retrieveStripeIntentgIAlus);
    }
}
