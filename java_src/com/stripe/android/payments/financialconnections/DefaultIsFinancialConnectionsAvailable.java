package com.stripe.android.payments.financialconnections;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0096\u0002¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;", "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;", "()V", "invoke", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DefaultIsFinancialConnectionsAvailable implements IsFinancialConnectionsAvailable {
    public static final int $stable = 0;

    @Override // com.stripe.android.payments.financialconnections.IsFinancialConnectionsAvailable
    public boolean invoke() {
        try {
            FinancialConnectionsSheet.Companion companion = FinancialConnectionsSheet.Companion;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
