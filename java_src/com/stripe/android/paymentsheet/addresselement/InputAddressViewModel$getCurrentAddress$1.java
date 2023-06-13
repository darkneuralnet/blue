package com.stripe.android.paymentsheet.addresselement;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.addresselement.InputAddressViewModel", m28418f = "InputAddressViewModel.kt", m28417i = {}, m28416l = {83}, m28415m = "getCurrentAddress", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class InputAddressViewModel$getCurrentAddress$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InputAddressViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputAddressViewModel$getCurrentAddress$1(InputAddressViewModel inputAddressViewModel, Continuation<? super InputAddressViewModel$getCurrentAddress$1> continuation) {
        super(continuation);
        this.this$0 = inputAddressViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object currentAddress;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        currentAddress = this.this$0.getCurrentAddress(this);
        return currentAddress;
    }
}
