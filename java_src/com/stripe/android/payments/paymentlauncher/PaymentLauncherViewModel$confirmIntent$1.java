package com.stripe.android.payments.paymentlauncher;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel", m28418f = "PaymentLauncherViewModel.kt", m28417i = {}, m28416l = {146, 153}, m28415m = "confirmIntent", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PaymentLauncherViewModel$confirmIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLauncherViewModel$confirmIntent$1(PaymentLauncherViewModel paymentLauncherViewModel, Continuation<? super PaymentLauncherViewModel$confirmIntent$1> continuation) {
        super(continuation);
        this.this$0 = paymentLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object confirmIntent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        confirmIntent = this.this$0.confirmIntent(null, null, this);
        return confirmIntent;
    }
}
