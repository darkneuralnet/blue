package com.stripe.android.financialconnections.repository;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J7\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\f\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ-\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "", "getOrFetchAccounts", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "clientSecret", "", "sessionId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAuthorizationSessionAccounts", "postAuthorizationSessionSelectedAccounts", "selectAccounts", "", "updateLocalCache", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postLinkAccountSessionPaymentAccount", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "paymentAccount", "Lcom/stripe/android/financialconnections/model/PaymentAccountParams;", "consumerSessionClientSecret", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface FinancialConnectionsAccountsRepository {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository$Companion;", "", "()V", "invoke", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "apiOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "logger", "Lcom/stripe/android/core/Logger;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final FinancialConnectionsAccountsRepository invoke(FinancialConnectionsRequestExecutor requestExecutor, ApiRequest.Factory apiRequestFactory, ApiRequest.Options apiOptions, Logger logger) {
            Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
            Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
            Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new FinancialConnectionsAccountsRepositoryImpl(requestExecutor, apiRequestFactory, apiOptions, logger);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object postLinkAccountSessionPaymentAccount$default(FinancialConnectionsAccountsRepository financialConnectionsAccountsRepository, String str, PaymentAccountParams paymentAccountParams, String str2, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                return financialConnectionsAccountsRepository.postLinkAccountSessionPaymentAccount(str, paymentAccountParams, str2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postLinkAccountSessionPaymentAccount");
        }
    }

    Object getOrFetchAccounts(String str, String str2, Continuation<? super PartnerAccountsList> continuation);

    Object postAuthorizationSessionAccounts(String str, String str2, Continuation<? super PartnerAccountsList> continuation);

    Object postAuthorizationSessionSelectedAccounts(String str, String str2, List<String> list, boolean z, Continuation<? super PartnerAccountsList> continuation);

    Object postLinkAccountSessionPaymentAccount(String str, PaymentAccountParams paymentAccountParams, String str2, Continuation<? super LinkAccountSessionPaymentAccount> continuation);
}
