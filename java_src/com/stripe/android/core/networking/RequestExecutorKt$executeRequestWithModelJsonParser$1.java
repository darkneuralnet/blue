package com.stripe.android.core.networking;

import com.stripe.android.core.model.StripeModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.core.networking.RequestExecutorKt", m28418f = "RequestExecutor.kt", m28417i = {0, 0, 0}, m28416l = {20}, m28415m = "executeRequestWithModelJsonParser", m28414n = {"stripeErrorJsonParser", "request", "responseJsonParser"}, m28413s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class RequestExecutorKt$executeRequestWithModelJsonParser$1<Response extends StripeModel> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public RequestExecutorKt$executeRequestWithModelJsonParser$1(Continuation<? super RequestExecutorKt$executeRequestWithModelJsonParser$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RequestExecutorKt.executeRequestWithModelJsonParser(null, null, null, null, this);
    }
}
