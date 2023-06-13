package com.stripe.android.payments.bankaccount.p044ui;

import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$initConnectionsPaymentsProxy$1 */
/* loaded from: classes7.dex */
public /* synthetic */ class CollectBankAccountActivity$initConnectionsPaymentsProxy$1 extends FunctionReferenceImpl implements Function1<FinancialConnectionsSheetResult, Unit> {
    public CollectBankAccountActivity$initConnectionsPaymentsProxy$1(Object obj) {
        super(1, obj, CollectBankAccountViewModel.class, "onConnectionsResult", "onConnectionsResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FinancialConnectionsSheetResult financialConnectionsSheetResult) {
        invoke2(financialConnectionsSheetResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FinancialConnectionsSheetResult p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CollectBankAccountViewModel) this.receiver).onConnectionsResult(p0);
    }
}
