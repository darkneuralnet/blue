package com.stripe.android.paymentsheet.flowcontroller;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.flowcontroller.FlowControllerConfigurationHandler", m28418f = "FlowControllerConfigurationHandler.kt", m28417i = {0, 0, 0, 0}, m28416l = {45, 49}, m28415m = "configure", m28414n = {"this", "initializationMode", "callback", "elementsSessionParams"}, m28413s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes7.dex */
public final class FlowControllerConfigurationHandler$configure$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowControllerConfigurationHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowControllerConfigurationHandler$configure$1(FlowControllerConfigurationHandler flowControllerConfigurationHandler, Continuation<? super FlowControllerConfigurationHandler$configure$1> continuation) {
        super(continuation);
        this.this$0 = flowControllerConfigurationHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.configure(null, null, null, this);
    }
}
