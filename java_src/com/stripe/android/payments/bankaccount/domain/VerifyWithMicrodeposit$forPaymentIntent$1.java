package com.stripe.android.payments.bankaccount.domain;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit", m28418f = "VerifyWithMicrodeposit.kt", m28417i = {}, m28416l = {24}, m28415m = "forPaymentIntent-yxL6bBk", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class VerifyWithMicrodeposit$forPaymentIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VerifyWithMicrodeposit this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyWithMicrodeposit$forPaymentIntent$1(VerifyWithMicrodeposit verifyWithMicrodeposit, Continuation<? super VerifyWithMicrodeposit$forPaymentIntent$1> continuation) {
        super(continuation);
        this.this$0 = verifyWithMicrodeposit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m116586forPaymentIntentyxL6bBk = this.this$0.m116586forPaymentIntentyxL6bBk(null, null, 0, 0, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m116586forPaymentIntentyxL6bBk == coroutine_suspended ? m116586forPaymentIntentyxL6bBk : Result.m116782boximpl(m116586forPaymentIntentyxL6bBk);
    }
}