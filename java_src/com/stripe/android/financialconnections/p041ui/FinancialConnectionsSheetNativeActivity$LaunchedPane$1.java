package com.stripe.android.financialconnections.p041ui;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$LaunchedPane$1", m28418f = "FinancialConnectionsSheetNativeActivity.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$LaunchedPane$1 */
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeActivity$LaunchedPane$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FinancialConnectionsSessionManifest.Pane $pane;
    int label;
    final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetNativeActivity$LaunchedPane$1(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, FinancialConnectionsSessionManifest.Pane pane, Continuation<? super FinancialConnectionsSheetNativeActivity$LaunchedPane$1> continuation) {
        super(2, continuation);
        this.this$0 = financialConnectionsSheetNativeActivity;
        this.$pane = pane;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinancialConnectionsSheetNativeActivity$LaunchedPane$1(this.this$0, this.$pane, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((FinancialConnectionsSheetNativeActivity$LaunchedPane$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.getViewModel().onPaneLaunched(this.$pane);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
