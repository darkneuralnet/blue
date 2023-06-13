package com.stripe.android;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.StripeKtxKt", m28418f = "StripeKtx.kt", m28417i = {}, m28416l = {996}, m28415m = "retrievePossibleBrands", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class StripeKtxKt$retrievePossibleBrands$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public StripeKtxKt$retrievePossibleBrands$1(Continuation<? super StripeKtxKt$retrievePossibleBrands$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StripeKtxKt.retrievePossibleBrands(null, null, this);
    }
}
