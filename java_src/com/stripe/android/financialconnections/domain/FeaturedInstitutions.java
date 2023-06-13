package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;)V", "invoke", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "clientSecret", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FeaturedInstitutions {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final int SEARCH_INSTITUTIONS_LIMIT = 10;
    private final FinancialConnectionsInstitutionsRepository repository;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions$Companion;", "", "()V", "SEARCH_INSTITUTIONS_LIMIT", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FeaturedInstitutions(FinancialConnectionsInstitutionsRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    public final Object invoke(String str, Continuation<? super InstitutionResponse> continuation) {
        return this.repository.featuredInstitutions(str, 10, continuation);
    }
}
