package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;)V", "getRepository", "()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "invoke", "", "block", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class UpdateLocalManifest {
    private final FinancialConnectionsManifestRepository repository;

    public UpdateLocalManifest(FinancialConnectionsManifestRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    public final FinancialConnectionsManifestRepository getRepository() {
        return this.repository;
    }

    public final void invoke(Function1<? super FinancialConnectionsSessionManifest, FinancialConnectionsSessionManifest> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.repository.updateLocalManifest(block);
    }
}
