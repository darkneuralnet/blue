package com.stripe.android.financialconnections;

import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetViewModel$onNativeAuthFlowResult$2 extends Lambda implements Function1<FinancialConnectionsSheetState, Unit> {
    final /* synthetic */ FinancialConnectionsSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetViewModel$onNativeAuthFlowResult$2(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel) {
        super(1);
        this.this$0 = financialConnectionsSheetViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FinancialConnectionsSheetState financialConnectionsSheetState) {
        invoke2(financialConnectionsSheetState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FinancialConnectionsSheetState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.finishWithResult(it, FinancialConnectionsSheetActivityResult.Canceled.INSTANCE);
    }
}