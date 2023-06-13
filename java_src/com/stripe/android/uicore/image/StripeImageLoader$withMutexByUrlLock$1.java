package com.stripe.android.uicore.image;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.uicore.image.StripeImageLoader", m28418f = "StripeImageLoader.kt", m28417i = {0, 0, 0, 0, 1, 1, 1}, m28416l = {148, 122}, m28415m = "withMutexByUrlLock", m28414n = {"this", "url", "action", "$this$withLock_u24default$iv", "this", "url", "$this$withLock_u24default$iv"}, m28413s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes7.dex */
public final class StripeImageLoader$withMutexByUrlLock$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeImageLoader$withMutexByUrlLock$1(StripeImageLoader stripeImageLoader, Continuation<? super StripeImageLoader$withMutexByUrlLock$1> continuation) {
        super(continuation);
        this.this$0 = stripeImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object withMutexByUrlLock;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        withMutexByUrlLock = this.this$0.withMutexByUrlLock(null, null, this);
        return withMutexByUrlLock;
    }
}
