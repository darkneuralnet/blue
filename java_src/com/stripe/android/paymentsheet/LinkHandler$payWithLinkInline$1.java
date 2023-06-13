package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.LinkHandler", m28418f = "LinkHandler.kt", m28417i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 6, 6, 6, 6, 7, 8, 9}, m28416l = {138, 142, 145, 153, 156, 163, 170, 173, 180, 182, 187}, m28415m = "payWithLinkInline", m28414n = {"this", "userInput", "paymentSelection", "params", "shouldCompleteLinkInlineFlow", "this", "userInput", "paymentSelection", "params", "configuration", "shouldCompleteLinkInlineFlow", "this", "userInput", "params", "configuration", "shouldCompleteLinkInlineFlow", "this", "userInput", "paymentSelection", "shouldCompleteLinkInlineFlow", "this", "this", "this"}, m28413s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$0", "L$0"})
/* loaded from: classes7.dex */
public final class LinkHandler$payWithLinkInline$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkHandler$payWithLinkInline$1(LinkHandler linkHandler, Continuation<? super LinkHandler$payWithLinkInline$1> continuation) {
        super(continuation);
        this.this$0 = linkHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.payWithLinkInline(null, null, false, this);
    }
}
