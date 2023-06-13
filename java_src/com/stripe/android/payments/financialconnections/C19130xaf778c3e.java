package com.stripe.android.payments.financialconnections;

import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.payments.financialconnections.FinancialConnectionsPaymentsProxy$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0 */
/* loaded from: classes7.dex */
public final class C19130xaf778c3e implements FinancialConnectionsSheetResultCallback, FunctionAdapter {
    private final /* synthetic */ Function1 function;

    public C19130xaf778c3e(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FinancialConnectionsSheetResultCallback) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback
    public final /* synthetic */ void onFinancialConnectionsSheetResult(FinancialConnectionsSheetResult financialConnectionsSheetResult) {
        this.function.invoke(financialConnectionsSheetResult);
    }
}
