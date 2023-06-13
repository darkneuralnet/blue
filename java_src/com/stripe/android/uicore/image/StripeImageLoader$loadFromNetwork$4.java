package com.stripe.android.uicore.image;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.uicore.image.StripeImageLoader", m28418f = "StripeImageLoader.kt", m28417i = {0, 0}, m28416l = {110}, m28415m = "loadFromNetwork-gIAlu-s", m28414n = {"this", "url"}, m28413s = {"L$0", "L$1"})
/* loaded from: classes7.dex */
public final class StripeImageLoader$loadFromNetwork$4 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeImageLoader$loadFromNetwork$4(StripeImageLoader stripeImageLoader, Continuation<? super StripeImageLoader$loadFromNetwork$4> continuation) {
        super(continuation);
        this.this$0 = stripeImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m116765loadFromNetworkgIAlus;
        Object coroutine_suspended;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m116765loadFromNetworkgIAlus = this.this$0.m116765loadFromNetworkgIAlus(null, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m116765loadFromNetworkgIAlus == coroutine_suspended ? m116765loadFromNetworkgIAlus : Result.m116782boximpl(m116765loadFromNetworkgIAlus);
    }
}
