package com.stripe.android.financialconnections;

import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetViewModel$handleOnNewIntent$1$1$1 extends Lambda implements Function1<FinancialConnectionsSheetState, FinancialConnectionsSheetState> {
    public static final FinancialConnectionsSheetViewModel$handleOnNewIntent$1$1$1 INSTANCE = new FinancialConnectionsSheetViewModel$handleOnNewIntent$1$1$1();

    public FinancialConnectionsSheetViewModel$handleOnNewIntent$1$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FinancialConnectionsSheetState invoke(FinancialConnectionsSheetState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetState.copy$default(setState, null, false, null, FinancialConnectionsSheetState.AuthFlowStatus.NONE, null, 23, null);
    }
}
