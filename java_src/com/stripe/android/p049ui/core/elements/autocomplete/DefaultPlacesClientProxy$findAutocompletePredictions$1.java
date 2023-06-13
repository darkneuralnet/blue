package com.stripe.android.p049ui.core.elements.autocomplete;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.autocomplete.DefaultPlacesClientProxy", m28418f = "PlacesClientProxy.kt", m28417i = {0}, m28416l = {95}, m28415m = "findAutocompletePredictions-BWLJW6A", m28414n = {"limit"}, m28413s = {"I$0"})
/* renamed from: com.stripe.android.ui.core.elements.autocomplete.DefaultPlacesClientProxy$findAutocompletePredictions$1 */
/* loaded from: classes7.dex */
public final class DefaultPlacesClientProxy$findAutocompletePredictions$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultPlacesClientProxy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPlacesClientProxy$findAutocompletePredictions$1(DefaultPlacesClientProxy defaultPlacesClientProxy, Continuation<? super DefaultPlacesClientProxy$findAutocompletePredictions$1> continuation) {
        super(continuation);
        this.this$0 = defaultPlacesClientProxy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo116667findAutocompletePredictionsBWLJW6A = this.this$0.mo116667findAutocompletePredictionsBWLJW6A(null, null, 0, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return mo116667findAutocompletePredictionsBWLJW6A == coroutine_suspended ? mo116667findAutocompletePredictionsBWLJW6A : Result.m116782boximpl(mo116667findAutocompletePredictionsBWLJW6A);
    }
}
