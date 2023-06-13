package com.stripe.android;

import com.stripe.android.core.injection.NamedConstantsKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.DefaultIntentConfirmationInterceptor", m28418f = "IntentConfirmationInterceptor.kt", m28417i = {0, 0, 0}, m28416l = {163}, m28415m = "handleClientSideConfirmation", m28414n = {"this", "paymentMethod", NamedConstantsKt.SHIPPING_VALUES}, m28413s = {"L$0", "L$1", "L$2"})
/* renamed from: com.stripe.android.DefaultIntentConfirmationInterceptor$handleClientSideConfirmation$1 */
/* loaded from: classes6.dex */
public final class C18600x23f0671d extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultIntentConfirmationInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18600x23f0671d(DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor, Continuation<? super C18600x23f0671d> continuation) {
        super(continuation);
        this.this$0 = defaultIntentConfirmationInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleClientSideConfirmation;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleClientSideConfirmation = this.this$0.handleClientSideConfirmation(null, null, null, this);
        return handleClientSideConfirmation;
    }
}
