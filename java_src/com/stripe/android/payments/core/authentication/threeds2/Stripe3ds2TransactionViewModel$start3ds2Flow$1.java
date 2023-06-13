package com.stripe.android.payments.core.authentication.threeds2;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel", m28418f = "Stripe3ds2TransactionViewModel.kt", m28417i = {0}, m28416l = {79}, m28415m = "start3ds2Flow", m28414n = {"this"}, m28413s = {"L$0"})
/* loaded from: classes7.dex */
public final class Stripe3ds2TransactionViewModel$start3ds2Flow$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Stripe3ds2TransactionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2TransactionViewModel$start3ds2Flow$1(Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel, Continuation<? super Stripe3ds2TransactionViewModel$start3ds2Flow$1> continuation) {
        super(continuation);
        this.this$0 = stripe3ds2TransactionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.start3ds2Flow(this);
    }
}
