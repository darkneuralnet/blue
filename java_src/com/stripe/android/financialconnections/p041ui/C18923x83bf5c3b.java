package com.stripe.android.financialconnections.p041ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavigationEffect$1$1$emit$2 */
/* loaded from: classes7.dex */
public final class C18923x83bf5c3b extends Lambda implements Function1<UY2, Unit> {
    final /* synthetic */ OY2 $navController;
    final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18923x83bf5c3b(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, OY2 oy2) {
        super(1);
        this.this$0 = financialConnectionsSheetNativeActivity;
        this.$navController = oy2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UY2 uy2) {
        invoke2(uy2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(UY2 navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        navigate.m81360e(true);
        this.this$0.popUpIfNotBackwardsNavigable(navigate, this.$navController);
    }
}
