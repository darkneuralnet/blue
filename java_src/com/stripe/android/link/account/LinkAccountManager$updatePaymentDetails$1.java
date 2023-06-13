package com.stripe.android.link.account;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.link.account.LinkAccountManager", m28418f = "LinkAccountManager.kt", m28417i = {}, m28416l = {281}, m28415m = "updatePaymentDetails-gIAlu-s", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class LinkAccountManager$updatePaymentDetails$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkAccountManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountManager$updatePaymentDetails$1(LinkAccountManager linkAccountManager, Continuation<? super LinkAccountManager$updatePaymentDetails$1> continuation) {
        super(continuation);
        this.this$0 = linkAccountManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m116499updatePaymentDetailsgIAlus = this.this$0.m116499updatePaymentDetailsgIAlus(null, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m116499updatePaymentDetailsgIAlus == coroutine_suspended ? m116499updatePaymentDetailsgIAlus : Result.m116782boximpl(m116499updatePaymentDetailsgIAlus);
    }
}
