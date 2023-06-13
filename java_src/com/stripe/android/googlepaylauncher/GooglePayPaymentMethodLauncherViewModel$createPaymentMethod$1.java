package com.stripe.android.googlepaylauncher;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel", m28418f = "GooglePayPaymentMethodLauncherViewModel.kt", m28417i = {}, m28416l = {108}, m28415m = "createPaymentMethod", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GooglePayPaymentMethodLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1(GooglePayPaymentMethodLauncherViewModel googlePayPaymentMethodLauncherViewModel, Continuation<? super GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1> continuation) {
        super(continuation);
        this.this$0 = googlePayPaymentMethodLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createPaymentMethod(null, this);
    }
}
