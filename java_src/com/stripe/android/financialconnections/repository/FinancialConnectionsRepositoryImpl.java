package com.stripe.android.financialconnections.repository;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccountList;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.GetFinancialConnectionsAcccountsParams;
import com.stripe.android.financialconnections.model.MixedOAuthParams;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.utils.CollectionsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J!\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J#\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "apiOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/networking/ApiRequest$Factory;)V", "getFinancialConnectionsAccounts", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "getFinancialConnectionsAcccountsParams", "Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;", "(Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFinancialConnectionsSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "clientSecret", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAuthorizationSessionOAuthResults", "Lcom/stripe/android/financialconnections/model/MixedOAuthParams;", "sessionId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postCompleteFinancialConnectionsSessions", "terminalError", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FinancialConnectionsRepositoryImpl implements FinancialConnectionsRepository {
    public static final Companion Companion = new Companion(null);
    private static final String authorizationSessionOAuthResultsUrl;
    private static final String authorizationSessionUrl;
    private static final String authorizeSessionUrl;
    private static final String completeUrl;
    private static final String listAccountsUrl;
    private static final String sessionReceiptUrl;
    private final ApiRequest.Options apiOptions;
    private final ApiRequest.Factory apiRequestFactory;
    private final FinancialConnectionsRequestExecutor requestExecutor;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl$Companion;", "", "()V", "authorizationSessionOAuthResultsUrl", "", "getAuthorizationSessionOAuthResultsUrl$financial_connections_release", "()Ljava/lang/String;", "authorizationSessionUrl", "getAuthorizationSessionUrl$financial_connections_release", "authorizeSessionUrl", "getAuthorizeSessionUrl$financial_connections_release", "completeUrl", "getCompleteUrl$financial_connections_release", "listAccountsUrl", "getListAccountsUrl$financial_connections_release", "sessionReceiptUrl", "getSessionReceiptUrl$financial_connections_release", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAuthorizationSessionOAuthResultsUrl$financial_connections_release */
        public final String m45516xf3dbfae0() {
            return FinancialConnectionsRepositoryImpl.authorizationSessionOAuthResultsUrl;
        }

        public final String getAuthorizationSessionUrl$financial_connections_release() {
            return FinancialConnectionsRepositoryImpl.authorizationSessionUrl;
        }

        public final String getAuthorizeSessionUrl$financial_connections_release() {
            return FinancialConnectionsRepositoryImpl.authorizeSessionUrl;
        }

        public final String getCompleteUrl$financial_connections_release() {
            return FinancialConnectionsRepositoryImpl.completeUrl;
        }

        public final String getListAccountsUrl$financial_connections_release() {
            return FinancialConnectionsRepositoryImpl.listAccountsUrl;
        }

        public final String getSessionReceiptUrl$financial_connections_release() {
            return FinancialConnectionsRepositoryImpl.sessionReceiptUrl;
        }

        private Companion() {
        }
    }

    static {
        ApiRequest.Companion companion = ApiRequest.Companion;
        listAccountsUrl = companion.getAPI_HOST() + "/v1/link_account_sessions/list_accounts";
        sessionReceiptUrl = companion.getAPI_HOST() + "/v1/link_account_sessions/session_receipt";
        authorizationSessionUrl = companion.getAPI_HOST() + "/v1/connections/auth_sessions";
        completeUrl = companion.getAPI_HOST() + "/v1/link_account_sessions/complete";
        authorizationSessionOAuthResultsUrl = companion.getAPI_HOST() + "/v1/connections/auth_sessions/oauth_results";
        authorizeSessionUrl = companion.getAPI_HOST() + "/v1/connections/auth_sessions/authorized";
    }

    public FinancialConnectionsRepositoryImpl(FinancialConnectionsRequestExecutor requestExecutor, ApiRequest.Options apiOptions, ApiRequest.Factory apiRequestFactory) {
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
        Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
        this.requestExecutor = requestExecutor;
        this.apiOptions = apiOptions;
        this.apiRequestFactory = apiRequestFactory;
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsRepository
    public Object getFinancialConnectionsAccounts(GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams, Continuation<? super FinancialConnectionsAccountList> continuation) {
        return this.requestExecutor.execute(ApiRequest.Factory.createGet$default(this.apiRequestFactory, listAccountsUrl, this.apiOptions, getFinancialConnectionsAcccountsParams.toParamMap(), false, 8, null), FinancialConnectionsAccountList.Companion.serializer(), continuation);
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsRepository
    public Object getFinancialConnectionsSession(String str, Continuation<? super FinancialConnectionsSession> continuation) {
        Map mapOf;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String str2 = sessionReceiptUrl;
        ApiRequest.Options options = this.apiOptions;
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("client_secret", str));
        return this.requestExecutor.execute(ApiRequest.Factory.createGet$default(factory, str2, options, mapOf, false, 8, null), FinancialConnectionsSession.Companion.serializer(), continuation);
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsRepository
    public Object postAuthorizationSessionOAuthResults(String str, String str2, Continuation<? super MixedOAuthParams> continuation) {
        Map mapOf;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String str3 = authorizationSessionOAuthResultsUrl;
        ApiRequest.Options options = this.apiOptions;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("id", str2), TuplesKt.m28425to("client_secret", str));
        return this.requestExecutor.execute(ApiRequest.Factory.createPost$default(factory, str3, options, mapOf, false, 8, null), MixedOAuthParams.Companion.serializer(), continuation);
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsRepository
    public Object postCompleteFinancialConnectionsSessions(String str, String str2, Continuation<? super FinancialConnectionsSession> continuation) {
        Map mapOf;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String str3 = completeUrl;
        ApiRequest.Options options = this.apiOptions;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("client_secret", str), TuplesKt.m28425to("terminal_error", str2));
        return this.requestExecutor.execute(ApiRequest.Factory.createPost$default(factory, str3, options, CollectionsKt.filterNotNullValues(mapOf), false, 8, null), FinancialConnectionsSession.Companion.serializer(), continuation);
    }
}
