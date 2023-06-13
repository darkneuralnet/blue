package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.repositories.ElementsSessionRepository$Api", m28418f = "ElementsSessionRepository.kt", m28417i = {0, 0}, m28416l = {69, 75}, m28415m = "get", m28414n = {"this", "params"}, m28413s = {"L$0", "L$1"})
/* loaded from: classes7.dex */
public final class ElementsSessionRepository$Api$get$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ElementsSessionRepository.Api this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElementsSessionRepository$Api$get$1(ElementsSessionRepository.Api api, Continuation<? super ElementsSessionRepository$Api$get$1> continuation) {
        super(continuation);
        this.this$0 = api;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.get(null, null, this);
    }
}
