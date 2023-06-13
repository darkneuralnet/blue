package com.stripe.android.payments.bankaccount.domain;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit", m28418f = "VerifyWithMicrodeposit.kt", m28417i = {}, m28416l = {81}, m28415m = "forSetupIntent-BWLJW6A", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class VerifyWithMicrodeposit$forSetupIntent$4 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VerifyWithMicrodeposit this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyWithMicrodeposit$forSetupIntent$4(VerifyWithMicrodeposit verifyWithMicrodeposit, Continuation<? super VerifyWithMicrodeposit$forSetupIntent$4> continuation) {
        super(continuation);
        this.this$0 = verifyWithMicrodeposit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m116587forSetupIntentBWLJW6A = this.this$0.m116587forSetupIntentBWLJW6A(null, null, null, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m116587forSetupIntentBWLJW6A == coroutine_suspended ? m116587forSetupIntentBWLJW6A : Result.m116782boximpl(m116587forSetupIntentBWLJW6A);
    }
}
