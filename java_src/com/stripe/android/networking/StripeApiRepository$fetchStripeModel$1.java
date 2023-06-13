package com.stripe.android.networking;

import com.stripe.android.core.model.StripeModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.networking.StripeApiRepository", m28418f = "StripeApiRepository.kt", m28417i = {}, m28416l = {1702}, m28415m = "fetchStripeModel", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class StripeApiRepository$fetchStripeModel$1<ModelType extends StripeModel> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$fetchStripeModel$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$fetchStripeModel$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchStripeModel;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchStripeModel = this.this$0.fetchStripeModel(null, null, null, this);
        return fetchStripeModel;
    }
}
