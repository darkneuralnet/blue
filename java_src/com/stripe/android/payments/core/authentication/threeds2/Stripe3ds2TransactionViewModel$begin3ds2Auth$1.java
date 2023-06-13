package com.stripe.android.payments.core.authentication.threeds2;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel", m28418f = "Stripe3ds2TransactionViewModel.kt", m28417i = {0, 0, 0, 0}, m28416l = {115, 123}, m28415m = "begin3ds2Auth", m28414n = {"this", "stripe3ds2Fingerprint", "transaction", "timeout"}, m28413s = {"L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes7.dex */
public final class Stripe3ds2TransactionViewModel$begin3ds2Auth$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Stripe3ds2TransactionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2TransactionViewModel$begin3ds2Auth$1(Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel, Continuation<? super Stripe3ds2TransactionViewModel$begin3ds2Auth$1> continuation) {
        super(continuation);
        this.this$0 = stripe3ds2TransactionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object begin3ds2Auth;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        begin3ds2Auth = this.this$0.begin3ds2Auth(null, this);
        return begin3ds2Auth;
    }
}
