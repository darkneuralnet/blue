package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.exception.AccountNoneEligibleForPaymentMethodError;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\rJ0\u0010\u000e\u001a\u00020\u000f*\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V", "invoke", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "canRetry", "", "manifest", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toDomainException", "Lcom/stripe/android/core/exception/StripeException;", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "businessName", "", "allowManualEntry", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PollAuthorizationSessionAccounts {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final int MAX_TRIES = 10;
    @Deprecated
    private static final long POLLING_TIME_MS = 2000;
    private final FinancialConnectionsSheet.Configuration configuration;
    private final FinancialConnectionsAccountsRepository repository;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$Companion;", "", "()V", "MAX_TRIES", "", "POLLING_TIME_MS", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PollAuthorizationSessionAccounts(FinancialConnectionsAccountsRepository repository, FinancialConnectionsSheet.Configuration configuration) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.repository = repository;
        this.configuration = configuration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StripeException toDomainException(StripeException stripeException, FinancialConnectionsInstitution financialConnectionsInstitution, String str, boolean z, boolean z2) {
        String str2;
        StripeException accountLoadError;
        int i;
        Map<String, String> extraFields;
        String str3;
        Map<String, String> extraFields2;
        if (financialConnectionsInstitution != null) {
            StripeError stripeError = stripeException.getStripeError();
            if (stripeError != null && (extraFields2 = stripeError.getExtraFields()) != null) {
                str2 = extraFields2.get("reason");
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual(str2, "no_supported_payment_method_type_accounts_found")) {
                StripeError stripeError2 = stripeException.getStripeError();
                if (stripeError2 != null && (extraFields = stripeError2.getExtraFields()) != null && (str3 = extraFields.get("total_accounts_count")) != null) {
                    i = Integer.parseInt(str3);
                } else {
                    i = 0;
                }
                int i2 = i;
                if (str == null) {
                    str = "";
                }
                accountLoadError = new AccountNoneEligibleForPaymentMethodError(z2, i2, financialConnectionsInstitution, str, stripeException);
            } else {
                accountLoadError = new AccountLoadError(z2, z, financialConnectionsInstitution, stripeException);
            }
            return accountLoadError;
        }
        return stripeException;
    }

    public final Object invoke(boolean z, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, Continuation<? super PartnerAccountsList> continuation) {
        Object retryOnException;
        retryOnException = ErrorsKt.retryOnException((r17 & 1) != 0 ? Integer.MAX_VALUE : 10, (r17 & 2) != 0 ? 0L : 0L, (r17 & 4) != 0 ? 100L : POLLING_TIME_MS, new PollAuthorizationSessionAccounts$invoke$2(null), new PollAuthorizationSessionAccounts$invoke$3(financialConnectionsSessionManifest, this, z, null), continuation);
        return retryOnException;
    }
}
