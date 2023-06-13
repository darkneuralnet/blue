package com.stripe.android.googlepaylauncher;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel", m28418f = "GooglePayPaymentMethodLauncherViewModel.kt", m28417i = {0}, m28416l = {91}, m28415m = "createLoadPaymentDataTask", m28414n = {"this"}, m28413s = {"L$0"})
/* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel$createLoadPaymentDataTask$1 */
/* loaded from: classes7.dex */
public final class C18953xf31ea2a8 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GooglePayPaymentMethodLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18953xf31ea2a8(GooglePayPaymentMethodLauncherViewModel googlePayPaymentMethodLauncherViewModel, Continuation<? super C18953xf31ea2a8> continuation) {
        super(continuation);
        this.this$0 = googlePayPaymentMethodLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createLoadPaymentDataTask(this);
    }
}
