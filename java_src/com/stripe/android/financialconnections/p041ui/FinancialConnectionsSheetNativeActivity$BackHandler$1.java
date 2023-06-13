package com.stripe.android.financialconnections.p041ui;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$BackHandler$1 */
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeActivity$BackHandler$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OY2 $navController;
    final /* synthetic */ FinancialConnectionsSessionManifest.Pane $pane;
    final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetNativeActivity$BackHandler$1(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, FinancialConnectionsSessionManifest.Pane pane, OY2 oy2) {
        super(0);
        this.this$0 = financialConnectionsSheetNativeActivity;
        this.$pane = pane;
        this.$navController = oy2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.getViewModel().onBackClick(this.$pane);
        if (this.$navController.m110243S()) {
            return;
        }
        this.this$0.getOnBackPressedDispatcher().m70494f();
    }
}
