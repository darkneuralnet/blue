package com.stripe.android.financialconnections.p041ui;

import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$onCreate$1", m28418f = "FinancialConnectionsSheetNativeActivity.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$onCreate$1 */
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeActivity$onCreate$1 extends SuspendLambda implements Function2<FinancialConnectionsSheetNativeState, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetNativeActivity$onCreate$1(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, Continuation<? super FinancialConnectionsSheetNativeActivity$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = financialConnectionsSheetNativeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinancialConnectionsSheetNativeActivity$onCreate$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState, Continuation<? super Unit> continuation) {
        return ((FinancialConnectionsSheetNativeActivity$onCreate$1) create(financialConnectionsSheetNativeState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.postInvalidate();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
