package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.LinkHandler", m28418f = "LinkHandler.kt", m28417i = {}, m28416l = {213, 211}, m28415m = "completeLinkInlinePayment", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class LinkHandler$completeLinkInlinePayment$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkHandler$completeLinkInlinePayment$1(LinkHandler linkHandler, Continuation<? super LinkHandler$completeLinkInlinePayment$1> continuation) {
        super(continuation);
        this.this$0 = linkHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object completeLinkInlinePayment;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        completeLinkInlinePayment = this.this$0.completeLinkInlinePayment(null, null, false, this);
        return completeLinkInlinePayment;
    }
}
