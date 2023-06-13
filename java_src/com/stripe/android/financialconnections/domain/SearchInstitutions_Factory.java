package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepository;
/* loaded from: classes7.dex */
public final class SearchInstitutions_Factory implements InterfaceC48812sj1<SearchInstitutions> {
    private final Y94<FinancialConnectionsInstitutionsRepository> repositoryProvider;

    public SearchInstitutions_Factory(Y94<FinancialConnectionsInstitutionsRepository> y94) {
        this.repositoryProvider = y94;
    }

    public static SearchInstitutions_Factory create(Y94<FinancialConnectionsInstitutionsRepository> y94) {
        return new SearchInstitutions_Factory(y94);
    }

    public static SearchInstitutions newInstance(FinancialConnectionsInstitutionsRepository financialConnectionsInstitutionsRepository) {
        return new SearchInstitutions(financialConnectionsInstitutionsRepository);
    }

    @Override // p000.Y94
    public SearchInstitutions get() {
        return newInstance(this.repositoryProvider.get());
    }
}
