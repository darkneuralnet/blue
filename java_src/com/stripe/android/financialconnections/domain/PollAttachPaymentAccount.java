package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.exception.AccountNumberRetrievalError;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J+\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V", "invoke", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "allowManualEntry", "", "activeInstitution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "params", "Lcom/stripe/android/financialconnections/model/PaymentAccountParams;", "(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toDomainException", "Lcom/stripe/android/core/exception/StripeException;", "institution", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PollAttachPaymentAccount {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final int MAX_TRIES = 180;
    @Deprecated
    private static final long POLLING_TIME_MS = 250;
    private final FinancialConnectionsSheet.Configuration configuration;
    private final FinancialConnectionsAccountsRepository repository;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$Companion;", "", "()V", "MAX_TRIES", "", "POLLING_TIME_MS", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PollAttachPaymentAccount(FinancialConnectionsAccountsRepository repository, FinancialConnectionsSheet.Configuration configuration) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.repository = repository;
        this.configuration = configuration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StripeException toDomainException(StripeException stripeException, FinancialConnectionsInstitution financialConnectionsInstitution, boolean z) {
        String str;
        Map<String, String> extraFields;
        if (financialConnectionsInstitution != null) {
            StripeError stripeError = stripeException.getStripeError();
            if (stripeError != null && (extraFields = stripeError.getExtraFields()) != null) {
                str = extraFields.get("reason");
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, "account_number_retrieval_failed")) {
                return new AccountNumberRetrievalError(z, financialConnectionsInstitution, stripeException);
            }
            return stripeException;
        }
        return stripeException;
    }

    public final Object invoke(boolean z, FinancialConnectionsInstitution financialConnectionsInstitution, PaymentAccountParams paymentAccountParams, Continuation<? super LinkAccountSessionPaymentAccount> continuation) {
        Object retryOnException;
        retryOnException = ErrorsKt.retryOnException((r17 & 1) != 0 ? Integer.MAX_VALUE : MAX_TRIES, (r17 & 2) != 0 ? 0L : 0L, (r17 & 4) != 0 ? 100L : 250L, new PollAttachPaymentAccount$invoke$2(null), new PollAttachPaymentAccount$invoke$3(this, paymentAccountParams, financialConnectionsInstitution, z, null), continuation);
        return retryOnException;
    }
}
