package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class PollingViewModel$observePollingResults$4 implements InterfaceC33198Gu1, FunctionAdapter {
    final /* synthetic */ PollingViewModel $tmp0;

    public PollingViewModel$observePollingResults$4(PollingViewModel pollingViewModel) {
        this.$tmp0 = pollingViewModel;
    }

    public final Object emit(PollingState pollingState, Continuation<? super Unit> continuation) {
        Object observePollingResults$updatePollingState;
        Object coroutine_suspended;
        observePollingResults$updatePollingState = PollingViewModel.observePollingResults$updatePollingState(this.$tmp0, pollingState, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return observePollingResults$updatePollingState == coroutine_suspended ? observePollingResults$updatePollingState : Unit.INSTANCE;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC33198Gu1) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return new AdaptedFunctionReference(2, this.$tmp0, PollingViewModel.class, "updatePollingState", "updatePollingState(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // p000.InterfaceC33198Gu1
    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return emit((PollingState) obj, (Continuation<? super Unit>) continuation);
    }
}
