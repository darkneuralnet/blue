package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J/\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/SelectAccounts;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V", "invoke", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "selectedAccountIds", "", "", "sessionId", "updateLocalCache", "", "(Ljava/util/Set;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class SelectAccounts {
    private final FinancialConnectionsSheet.Configuration configuration;
    private final FinancialConnectionsAccountsRepository repository;

    public SelectAccounts(FinancialConnectionsAccountsRepository repository, FinancialConnectionsSheet.Configuration configuration) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.repository = repository;
        this.configuration = configuration;
    }

    public final Object invoke(Set<String> set, String str, boolean z, Continuation<? super PartnerAccountsList> continuation) {
        List<String> list;
        FinancialConnectionsAccountsRepository financialConnectionsAccountsRepository = this.repository;
        String financialConnectionsSessionClientSecret = this.configuration.getFinancialConnectionsSessionClientSecret();
        list = CollectionsKt___CollectionsKt.toList(set);
        return financialConnectionsAccountsRepository.postAuthorizationSessionSelectedAccounts(financialConnectionsSessionClientSecret, str, list, z, continuation);
    }
}
