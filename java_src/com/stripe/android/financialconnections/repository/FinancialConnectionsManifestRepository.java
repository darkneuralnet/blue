package com.stripe.android.financialconnections.repository;

import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.analytics.AuthSessionEvent;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000 \"2\u00020\u0001:\u0001\"J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J-\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J)\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J7\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J!\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001c\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0!H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "", "cancelAuthorizationSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "clientSecret", "", "sessionId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeAuthorizationSession", "publicToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrFetchSynchronizeFinancialConnectionsSession", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", NamedConstantsKt.APPLICATION_ID, "markConsentAcquired", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAuthorizationSession", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAuthorizationSessionEvent", "clientTimestamp", "Ljava/util/Date;", "authSessionEvents", "", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postMarkLinkingMoreAccounts", "synchronizeFinancialConnectionsSession", "updateLocalManifest", "", "block", "Lkotlin/Function1;", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface FinancialConnectionsManifestRepository {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J;\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0086\u0002¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository$Companion;", "", "()V", "invoke", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "apiOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "logger", "Lcom/stripe/android/core/Logger;", "locale", "Ljava/util/Locale;", "initialSync", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final FinancialConnectionsManifestRepository invoke(FinancialConnectionsRequestExecutor requestExecutor, ApiRequest.Factory apiRequestFactory, ApiRequest.Options apiOptions, Logger logger, Locale locale, SynchronizeSessionResponse synchronizeSessionResponse) {
            Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
            Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
            Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(locale, "locale");
            return new FinancialConnectionsManifestRepositoryImpl(requestExecutor, apiRequestFactory, apiOptions, locale, logger, synchronizeSessionResponse);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object completeAuthorizationSession$default(FinancialConnectionsManifestRepository financialConnectionsManifestRepository, String str, String str2, String str3, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = null;
                }
                return financialConnectionsManifestRepository.completeAuthorizationSession(str, str2, str3, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: completeAuthorizationSession");
        }
    }

    Object cancelAuthorizationSession(String str, String str2, Continuation<? super FinancialConnectionsAuthorizationSession> continuation);

    Object completeAuthorizationSession(String str, String str2, String str3, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    Object getOrFetchSynchronizeFinancialConnectionsSession(String str, String str2, Continuation<? super SynchronizeSessionResponse> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    Object markConsentAcquired(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    Object postAuthorizationSession(String str, String str2, FinancialConnectionsInstitution financialConnectionsInstitution, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    Object postAuthorizationSessionEvent(String str, Date date, String str2, List<? extends AuthSessionEvent> list, Continuation<? super FinancialConnectionsAuthorizationSession> continuation);

    Object postMarkLinkingMoreAccounts(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    Object synchronizeFinancialConnectionsSession(String str, String str2, Continuation<? super SynchronizeSessionResponse> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    void updateLocalManifest(Function1<? super FinancialConnectionsSessionManifest, FinancialConnectionsSessionManifest> function1);
}
