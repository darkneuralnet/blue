package com.stripe.android.financialconnections;

import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetViewModel$onStartApp2App$1 extends Lambda implements Function1<FinancialConnectionsSheetState, FinancialConnectionsSheetState> {
    final /* synthetic */ String $unwrappedUriString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetViewModel$onStartApp2App$1(String str) {
        super(1);
        this.$unwrappedUriString = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FinancialConnectionsSheetState invoke(FinancialConnectionsSheetState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetState.copy$default(setState, null, false, null, FinancialConnectionsSheetState.AuthFlowStatus.INTERMEDIATE_DEEPLINK, new FinancialConnectionsSheetViewEffect.OpenAuthFlowWithUrl(this.$unwrappedUriString), 5, null);
    }
}
