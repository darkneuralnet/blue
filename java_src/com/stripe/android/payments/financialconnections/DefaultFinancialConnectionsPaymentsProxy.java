package com.stripe.android.payments.financialconnections;

import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/payments/financialconnections/DefaultFinancialConnectionsPaymentsProxy;", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;", "financialConnectionsSheet", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;)V", "present", "", "financialConnectionsSessionClientSecret", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DefaultFinancialConnectionsPaymentsProxy implements FinancialConnectionsPaymentsProxy {
    private final FinancialConnectionsSheet financialConnectionsSheet;

    public DefaultFinancialConnectionsPaymentsProxy(FinancialConnectionsSheet financialConnectionsSheet) {
        Intrinsics.checkNotNullParameter(financialConnectionsSheet, "financialConnectionsSheet");
        this.financialConnectionsSheet = financialConnectionsSheet;
    }

    @Override // com.stripe.android.payments.financialconnections.FinancialConnectionsPaymentsProxy
    public void present(String financialConnectionsSessionClientSecret, String publishableKey, String str) {
        Intrinsics.checkNotNullParameter(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        this.financialConnectionsSheet.present(new FinancialConnectionsSheet.Configuration(financialConnectionsSessionClientSecret, publishableKey, str));
    }
}
