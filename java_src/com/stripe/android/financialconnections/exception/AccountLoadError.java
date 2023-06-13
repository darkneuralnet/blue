package com.stripe.android.financialconnections.exception;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/exception/AccountLoadError;", "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "allowManualEntry", "", "canRetry", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "stripeException", "Lcom/stripe/android/core/exception/StripeException;", "(ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/core/exception/StripeException;)V", "getAllowManualEntry", "()Z", "getCanRetry", "getInstitution", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccountLoadError extends FinancialConnectionsError {
    private final boolean allowManualEntry;
    private final boolean canRetry;
    private final FinancialConnectionsInstitution institution;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountLoadError(boolean z, boolean z2, FinancialConnectionsInstitution institution, StripeException stripeException) {
        super("AccountLoadError", stripeException);
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(stripeException, "stripeException");
        this.allowManualEntry = z;
        this.canRetry = z2;
        this.institution = institution;
    }

    public final boolean getAllowManualEntry() {
        return this.allowManualEntry;
    }

    public final boolean getCanRetry() {
        return this.canRetry;
    }

    public final FinancialConnectionsInstitution getInstitution() {
        return this.institution;
    }
}
