package com.stripe.android.financialconnections;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.FinancialConnectionsSheetComposeKt$rememberFinancialConnectionsSheetForToken$activityResultLauncher$1$1 */
/* loaded from: classes7.dex */
public final class C18627x959170 extends Lambda implements Function1<FinancialConnectionsSheetForTokenResult, Unit> {
    final /* synthetic */ Function1<FinancialConnectionsSheetForTokenResult, Unit> $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C18627x959170(Function1<? super FinancialConnectionsSheetForTokenResult, Unit> function1) {
        super(1);
        this.$callback = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FinancialConnectionsSheetForTokenResult financialConnectionsSheetForTokenResult) {
        invoke2(financialConnectionsSheetForTokenResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FinancialConnectionsSheetForTokenResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$callback.invoke(it);
    }
}
