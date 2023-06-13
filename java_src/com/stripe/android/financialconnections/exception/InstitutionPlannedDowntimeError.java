package com.stripe.android.financialconnections.exception;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\r¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;", "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "allowManualEntry", "", "isToday", "backUpAt", "", "stripeException", "Lcom/stripe/android/core/exception/StripeException;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZJLcom/stripe/android/core/exception/StripeException;)V", "getAllowManualEntry", "()Z", "getBackUpAt", "()J", "getInstitution", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPlannedDowntimeError extends FinancialConnectionsError {
    private final boolean allowManualEntry;
    private final long backUpAt;
    private final FinancialConnectionsInstitution institution;
    private final boolean isToday;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionPlannedDowntimeError(FinancialConnectionsInstitution institution, boolean z, boolean z2, long j, StripeException stripeException) {
        super("InstitutionPlannedDowntimeError", stripeException);
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(stripeException, "stripeException");
        this.institution = institution;
        this.allowManualEntry = z;
        this.isToday = z2;
        this.backUpAt = j;
    }

    public final boolean getAllowManualEntry() {
        return this.allowManualEntry;
    }

    public final long getBackUpAt() {
        return this.backUpAt;
    }

    public final FinancialConnectionsInstitution getInstitution() {
        return this.institution;
    }

    public final boolean isToday() {
        return this.isToday;
    }
}
