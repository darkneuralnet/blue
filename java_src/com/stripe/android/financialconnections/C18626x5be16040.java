package com.stripe.android.financialconnections;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.FinancialConnectionsSheetComposeKt$rememberFinancialConnectionsSheet$activityResultLauncher$1$1 */
/* loaded from: classes7.dex */
public final class C18626x5be16040 extends Lambda implements Function1<FinancialConnectionsSheetResult, Unit> {
    final /* synthetic */ Function1<FinancialConnectionsSheetResult, Unit> $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C18626x5be16040(Function1<? super FinancialConnectionsSheetResult, Unit> function1) {
        super(1);
        this.$callback = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FinancialConnectionsSheetResult financialConnectionsSheetResult) {
        invoke2(financialConnectionsSheetResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FinancialConnectionsSheetResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$callback.invoke(it);
    }
}
