package com.stripe.android.link.p042ui.wallet;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.link.ui.wallet.WalletViewModel", m28418f = "WalletViewModel.kt", m28417i = {}, m28416l = {211}, m28415m = "performPaymentDetailsUpdate-gIAlu-s", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$performPaymentDetailsUpdate$1 */
/* loaded from: classes7.dex */
public final class WalletViewModel$performPaymentDetailsUpdate$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WalletViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletViewModel$performPaymentDetailsUpdate$1(WalletViewModel walletViewModel, Continuation<? super WalletViewModel$performPaymentDetailsUpdate$1> continuation) {
        super(continuation);
        this.this$0 = walletViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m116573performPaymentDetailsUpdategIAlus;
        Object coroutine_suspended;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m116573performPaymentDetailsUpdategIAlus = this.this$0.m116573performPaymentDetailsUpdategIAlus(null, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m116573performPaymentDetailsUpdategIAlus == coroutine_suspended ? m116573performPaymentDetailsUpdategIAlus : Result.m116782boximpl(m116573performPaymentDetailsUpdategIAlus);
    }
}
