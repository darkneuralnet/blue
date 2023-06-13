package com.stripe.android.financialconnections.analytics;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;", "", "onPresented", "", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "onResult", "financialConnectionsSheetResult", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface FinancialConnectionsEventReporter {
    void onPresented(FinancialConnectionsSheet.Configuration configuration);

    void onResult(FinancialConnectionsSheet.Configuration configuration, FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult);
}
