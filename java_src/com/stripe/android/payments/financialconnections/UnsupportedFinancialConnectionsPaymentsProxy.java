package com.stripe.android.payments.financialconnections;

import com.stripe.android.core.injection.NamedConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/payments/financialconnections/UnsupportedFinancialConnectionsPaymentsProxy;", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;", "()V", "present", "", "financialConnectionsSessionClientSecret", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class UnsupportedFinancialConnectionsPaymentsProxy implements FinancialConnectionsPaymentsProxy {
    @Override // com.stripe.android.payments.financialconnections.FinancialConnectionsPaymentsProxy
    public void present(String financialConnectionsSessionClientSecret, String publishableKey, String str) {
        Intrinsics.checkNotNullParameter(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
    }
}
