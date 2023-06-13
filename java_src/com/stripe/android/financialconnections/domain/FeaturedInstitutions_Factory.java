package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepository;
/* loaded from: classes7.dex */
public final class FeaturedInstitutions_Factory implements InterfaceC48812sj1<FeaturedInstitutions> {
    private final Y94<FinancialConnectionsInstitutionsRepository> repositoryProvider;

    public FeaturedInstitutions_Factory(Y94<FinancialConnectionsInstitutionsRepository> y94) {
        this.repositoryProvider = y94;
    }

    public static FeaturedInstitutions_Factory create(Y94<FinancialConnectionsInstitutionsRepository> y94) {
        return new FeaturedInstitutions_Factory(y94);
    }

    public static FeaturedInstitutions newInstance(FinancialConnectionsInstitutionsRepository financialConnectionsInstitutionsRepository) {
        return new FeaturedInstitutions(financialConnectionsInstitutionsRepository);
    }

    @Override // p000.Y94
    public FeaturedInstitutions get() {
        return newInstance(this.repositoryProvider.get());
    }
}
