package com.stripe.android.googlepaylauncher;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel", m28418f = "GooglePayLauncherViewModel.kt", m28417i = {0, 0, 1, 1}, m28416l = {80, 94}, m28415m = "createPaymentDataRequest", m28414n = {"this", "args", "this", "args"}, m28413s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes7.dex */
public final class GooglePayLauncherViewModel$createPaymentDataRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GooglePayLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncherViewModel$createPaymentDataRequest$1(GooglePayLauncherViewModel googlePayLauncherViewModel, Continuation<? super GooglePayLauncherViewModel$createPaymentDataRequest$1> continuation) {
        super(continuation);
        this.this$0 = googlePayLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createPaymentDataRequest(null, this);
    }
}
