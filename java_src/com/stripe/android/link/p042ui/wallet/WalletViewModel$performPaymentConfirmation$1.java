package com.stripe.android.link.p042ui.wallet;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.link.ui.wallet.WalletViewModel", m28418f = "WalletViewModel.kt", m28417i = {0, 0, 0, 2}, m28416l = {135, 141, 158}, m28415m = "performPaymentConfirmation", m28414n = {"this", "selectedPaymentDetails", "linkAccount", "this"}, m28413s = {"L$0", "L$1", "L$2", "L$0"})
/* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$performPaymentConfirmation$1 */
/* loaded from: classes7.dex */
public final class WalletViewModel$performPaymentConfirmation$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WalletViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletViewModel$performPaymentConfirmation$1(WalletViewModel walletViewModel, Continuation<? super WalletViewModel$performPaymentConfirmation$1> continuation) {
        super(continuation);
        this.this$0 = walletViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object performPaymentConfirmation;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        performPaymentConfirmation = this.this$0.performPaymentConfirmation(null, null, this);
        return performPaymentConfirmation;
    }
}
