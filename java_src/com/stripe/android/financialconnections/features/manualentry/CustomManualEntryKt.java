package com.stripe.android.financialconnections.features.manualentry;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m28432d2 = {"isCustomManualEntryError", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class CustomManualEntryKt {
    public static final boolean isCustomManualEntryError(FinancialConnectionsSession financialConnectionsSession) {
        FinancialConnectionsSession.StatusDetails.Cancelled.Reason reason;
        FinancialConnectionsSession.StatusDetails.Cancelled cancelled;
        Intrinsics.checkNotNullParameter(financialConnectionsSession, "<this>");
        FinancialConnectionsSession.StatusDetails statusDetails = financialConnectionsSession.getStatusDetails();
        if (statusDetails != null && (cancelled = statusDetails.getCancelled()) != null) {
            reason = cancelled.getReason();
        } else {
            reason = null;
        }
        if (reason == FinancialConnectionsSession.StatusDetails.Cancelled.Reason.CUSTOM_MANUAL_ENTRY) {
            return true;
        }
        return false;
    }
}
