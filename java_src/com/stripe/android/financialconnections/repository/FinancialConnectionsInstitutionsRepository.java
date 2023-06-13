package com.stripe.android.financialconnections.repository;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b`\u0018\u0000 \f2\u00020\u0001:\u0001\fJ!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ)\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;", "", "featuredInstitutions", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "clientSecret", "", "limit", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchInstitutions", "query", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface FinancialConnectionsInstitutionsRepository {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086\u0002¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository$Companion;", "", "()V", "invoke", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "apiOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final FinancialConnectionsInstitutionsRepository invoke(FinancialConnectionsRequestExecutor requestExecutor, ApiRequest.Options apiOptions, ApiRequest.Factory apiRequestFactory) {
            Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
            Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
            Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
            return new FinancialConnectionsInstitutionsRepositoryImpl(requestExecutor, apiOptions, apiRequestFactory);
        }
    }

    Object featuredInstitutions(String str, int i, Continuation<? super InstitutionResponse> continuation);

    Object searchInstitutions(String str, String str2, int i, Continuation<? super InstitutionResponse> continuation);
}
