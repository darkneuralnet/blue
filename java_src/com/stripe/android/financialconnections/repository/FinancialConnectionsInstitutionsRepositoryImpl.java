package com.stripe.android.financialconnections.repository;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ)\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl;", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "apiOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/networking/ApiRequest$Factory;)V", "featuredInstitutions", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "clientSecret", "", "limit", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchInstitutions", "query", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
final class FinancialConnectionsInstitutionsRepositoryImpl implements FinancialConnectionsInstitutionsRepository {
    public static final Companion Companion = new Companion(null);
    private static final String featuredInstitutionsUrl;
    private static final String institutionsUrl;
    private final ApiRequest.Options apiOptions;
    private final ApiRequest.Factory apiRequestFactory;
    private final FinancialConnectionsRequestExecutor requestExecutor;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl$Companion;", "", "()V", "featuredInstitutionsUrl", "", "getFeaturedInstitutionsUrl$financial_connections_release", "()Ljava/lang/String;", "institutionsUrl", "getInstitutionsUrl$financial_connections_release", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getFeaturedInstitutionsUrl$financial_connections_release() {
            return FinancialConnectionsInstitutionsRepositoryImpl.featuredInstitutionsUrl;
        }

        public final String getInstitutionsUrl$financial_connections_release() {
            return FinancialConnectionsInstitutionsRepositoryImpl.institutionsUrl;
        }

        private Companion() {
        }
    }

    static {
        ApiRequest.Companion companion = ApiRequest.Companion;
        institutionsUrl = companion.getAPI_HOST() + "/v1/connections/institutions";
        featuredInstitutionsUrl = companion.getAPI_HOST() + "/v1/connections/featured_institutions";
    }

    public FinancialConnectionsInstitutionsRepositoryImpl(FinancialConnectionsRequestExecutor requestExecutor, ApiRequest.Options apiOptions, ApiRequest.Factory apiRequestFactory) {
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
        Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
        this.requestExecutor = requestExecutor;
        this.apiOptions = apiOptions;
        this.apiRequestFactory = apiRequestFactory;
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepository
    public Object featuredInstitutions(String str, int i, Continuation<? super InstitutionResponse> continuation) {
        Map mapOf;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String str2 = featuredInstitutionsUrl;
        ApiRequest.Options options = this.apiOptions;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("client_secret", str), TuplesKt.m28425to("limit", Boxing.boxInt(i)));
        return this.requestExecutor.execute(ApiRequest.Factory.createGet$default(factory, str2, options, mapOf, false, 8, null), InstitutionResponse.Companion.serializer(), continuation);
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepository
    public Object searchInstitutions(String str, String str2, int i, Continuation<? super InstitutionResponse> continuation) {
        Map mapOf;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String str3 = institutionsUrl;
        ApiRequest.Options options = this.apiOptions;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("client_secret", str), TuplesKt.m28425to("query", str2), TuplesKt.m28425to("limit", Boxing.boxInt(i)));
        return this.requestExecutor.execute(ApiRequest.Factory.createGet$default(factory, str3, options, mapOf, false, 8, null), InstitutionResponse.Companion.serializer(), continuation);
    }
}
