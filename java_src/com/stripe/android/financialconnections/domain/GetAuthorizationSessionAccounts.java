package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "getRepository", "()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "invoke", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "authSessionId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class GetAuthorizationSessionAccounts {
    private final FinancialConnectionsSheet.Configuration configuration;
    private final FinancialConnectionsAccountsRepository repository;

    public GetAuthorizationSessionAccounts(FinancialConnectionsAccountsRepository repository, FinancialConnectionsSheet.Configuration configuration) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.repository = repository;
        this.configuration = configuration;
    }

    public final FinancialConnectionsSheet.Configuration getConfiguration() {
        return this.configuration;
    }

    public final FinancialConnectionsAccountsRepository getRepository() {
        return this.repository;
    }

    public final Object invoke(String str, Continuation<? super PartnerAccountsList> continuation) {
        return this.repository.getOrFetchAccounts(this.configuration.getFinancialConnectionsSessionClientSecret(), str, continuation);
    }
}
