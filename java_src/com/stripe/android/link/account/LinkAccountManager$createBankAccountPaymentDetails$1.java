package com.stripe.android.link.account;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.link.account.LinkAccountManager", m28418f = "LinkAccountManager.kt", m28417i = {}, m28416l = {252}, m28415m = "createBankAccountPaymentDetails-gIAlu-s", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class LinkAccountManager$createBankAccountPaymentDetails$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkAccountManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountManager$createBankAccountPaymentDetails$1(LinkAccountManager linkAccountManager, Continuation<? super LinkAccountManager$createBankAccountPaymentDetails$1> continuation) {
        super(continuation);
        this.this$0 = linkAccountManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m116489createBankAccountPaymentDetailsgIAlus = this.this$0.m116489createBankAccountPaymentDetailsgIAlus(null, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m116489createBankAccountPaymentDetailsgIAlus == coroutine_suspended ? m116489createBankAccountPaymentDetailsgIAlus : Result.m116782boximpl(m116489createBankAccountPaymentDetailsgIAlus);
    }
}