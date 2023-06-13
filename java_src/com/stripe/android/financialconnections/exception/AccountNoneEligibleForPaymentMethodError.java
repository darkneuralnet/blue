package com.stripe.android.financialconnections.exception;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;", "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "allowManualEntry", "", "accountsCount", "", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "merchantName", "", "stripeException", "Lcom/stripe/android/core/exception/StripeException;", "(ZILcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V", "getAccountsCount", "()I", "getAllowManualEntry", "()Z", "getInstitution", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "getMerchantName", "()Ljava/lang/String;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccountNoneEligibleForPaymentMethodError extends FinancialConnectionsError {
    private final int accountsCount;
    private final boolean allowManualEntry;
    private final FinancialConnectionsInstitution institution;
    private final String merchantName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountNoneEligibleForPaymentMethodError(boolean z, int i, FinancialConnectionsInstitution institution, String merchantName, StripeException stripeException) {
        super("AccountNoneEligibleForPaymentMethodError", stripeException);
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(stripeException, "stripeException");
        this.allowManualEntry = z;
        this.accountsCount = i;
        this.institution = institution;
        this.merchantName = merchantName;
    }

    public final int getAccountsCount() {
        return this.accountsCount;
    }

    public final boolean getAllowManualEntry() {
        return this.allowManualEntry;
    }

    public final FinancialConnectionsInstitution getInstitution() {
        return this.institution;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }
}
