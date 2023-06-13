package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.LinkHandler", m28418f = "LinkHandler.kt", m28417i = {0, 0}, m28416l = {197}, m28415m = "setupLinkWithVerification", m28414n = {"this", "configuration"}, m28413s = {"L$0", "L$1"})
/* loaded from: classes7.dex */
public final class LinkHandler$setupLinkWithVerification$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkHandler$setupLinkWithVerification$1(LinkHandler linkHandler, Continuation<? super LinkHandler$setupLinkWithVerification$1> continuation) {
        super(continuation);
        this.this$0 = linkHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        obj2 = this.this$0.setupLinkWithVerification(null, this);
        return obj2;
    }
}
