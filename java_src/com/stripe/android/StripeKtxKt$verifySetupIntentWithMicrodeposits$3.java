package com.stripe.android;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.StripeKtxKt", m28418f = "StripeKtx.kt", m28417i = {}, m28416l = {965}, m28415m = "verifySetupIntentWithMicrodeposits", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class StripeKtxKt$verifySetupIntentWithMicrodeposits$3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public StripeKtxKt$verifySetupIntentWithMicrodeposits$3(Continuation<? super StripeKtxKt$verifySetupIntentWithMicrodeposits$3> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StripeKtxKt.verifySetupIntentWithMicrodeposits(null, null, null, this);
    }
}
