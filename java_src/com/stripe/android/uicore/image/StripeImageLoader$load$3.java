package com.stripe.android.uicore.image;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.uicore.image.StripeImageLoader", m28418f = "StripeImageLoader.kt", m28417i = {}, m28416l = {57}, m28415m = "load-gIAlu-s", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class StripeImageLoader$load$3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeImageLoader$load$3(StripeImageLoader stripeImageLoader, Continuation<? super StripeImageLoader$load$3> continuation) {
        super(continuation);
        this.this$0 = stripeImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m116767loadgIAlus = this.this$0.m116767loadgIAlus(null, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m116767loadgIAlus == coroutine_suspended ? m116767loadgIAlus : Result.m116782boximpl(m116767loadgIAlus);
    }
}
