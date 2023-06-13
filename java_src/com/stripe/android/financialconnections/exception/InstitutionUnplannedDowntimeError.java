package com.stripe.android.financialconnections.exception;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;", "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "allowManualEntry", "", "stripeException", "Lcom/stripe/android/core/exception/StripeException;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZLcom/stripe/android/core/exception/StripeException;)V", "getAllowManualEntry", "()Z", "getInstitution", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionUnplannedDowntimeError extends FinancialConnectionsError {
    private final boolean allowManualEntry;
    private final FinancialConnectionsInstitution institution;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionUnplannedDowntimeError(FinancialConnectionsInstitution institution, boolean z, StripeException stripeException) {
        super("InstitutionUnplannedDowntimeError", stripeException);
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(stripeException, "stripeException");
        this.institution = institution;
        this.allowManualEntry = z;
    }

    public final boolean getAllowManualEntry() {
        return this.allowManualEntry;
    }

    public final FinancialConnectionsInstitution getInstitution() {
        return this.institution;
    }
}
