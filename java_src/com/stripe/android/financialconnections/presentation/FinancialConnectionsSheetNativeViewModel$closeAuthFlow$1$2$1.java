package com.stripe.android.financialconnections.presentation;

import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewEffect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$2$1 extends Lambda implements Function1<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {
    final /* synthetic */ FinancialConnectionsSheetActivityResult.Failed $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$2$1(FinancialConnectionsSheetActivityResult.Failed failed) {
        super(1);
        this.$result = failed;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetNativeState.copy$default(setState, null, false, null, false, false, new FinancialConnectionsSheetNativeViewEffect.Finish(this.$result), null, 95, null);
    }
}
