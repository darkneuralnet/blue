package com.stripe.android;

import androidx.recyclerview.widget.C11925l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.CustomerSessionOperationExecutor", m28418f = "CustomerSessionOperationExecutor.kt", m28417i = {0, 0, 2, 2, 4, 4, 6, 6, 8, 8, 10, 10, 12, 12, 14, 14}, m28416l = {27, 32, 39, 51, 66, 77, 92, 103, 118, 128, 142, 155, 170, 182, 189, C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION}, m28415m = "execute$payments_core_release", m28414n = {"this", "operation", "this", "operation", "this", "operation", "this", "operation", "this", "operation", "this", "operation", "this", "operation", "this", "operation"}, m28413s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class CustomerSessionOperationExecutor$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CustomerSessionOperationExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerSessionOperationExecutor$execute$1(CustomerSessionOperationExecutor customerSessionOperationExecutor, Continuation<? super CustomerSessionOperationExecutor$execute$1> continuation) {
        super(continuation);
        this.this$0 = customerSessionOperationExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute$payments_core_release(null, null, this);
    }
}
