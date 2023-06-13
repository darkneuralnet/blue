package com.stripe.android.financialconnections.repository;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.analytics.AuthSessionEvent;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.network.NetworkConstants;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m28433d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000 O2\u00020\u0001:\u0001OB9\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010A\u001a\u00020@\u0012\b\u0010L\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bM\u0010NJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J#\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010\"\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00022\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0016J-\u0010&\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0019J\u001c\u0010+\u001a\u00020\n2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120)H\u0016R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00102\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u00107\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010<\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010A\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010F\u001a\u00020E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006P"}, m28432d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "", NamedConstantsKt.APPLICATION_ID, "clientSecret", "Lcom/stripe/android/core/networking/ApiRequest;", "synchronizeRequest", Stripe3ds2AuthParams.FIELD_SOURCE, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "institution", "", "updateActiveInstitution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "authSession", "updateCachedActiveAuthSession", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "synchronizeSessionResponse", "updateCachedSynchronizeSessionResponse", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "manifest", "updateCachedManifest", "getOrFetchSynchronizeFinancialConnectionsSession", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "synchronizeFinancialConnectionsSession", "markConsentAcquired", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAuthorizationSession", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/Date;", "clientTimestamp", "sessionId", "", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", "authSessionEvents", "postAuthorizationSessionEvent", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelAuthorizationSession", "publicToken", "completeAuthorizationSession", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postMarkLinkingMoreAccounts", "Lkotlin/Function1;", "block", "updateLocalManifest", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "getRequestExecutor", "()Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "getApiRequestFactory", "()Lcom/stripe/android/core/networking/ApiRequest$Factory;", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "apiOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "getApiOptions", "()Lcom/stripe/android/core/networking/ApiRequest$Options;", "Ljava/util/Locale;", "locale", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "getLogger", "()Lcom/stripe/android/core/Logger;", "LSX2;", "mutex", "LSX2;", "getMutex", "()LSX2;", "cachedSynchronizeSessionResponse", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "initialSync", "<init>", "(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Locale;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFinancialConnectionsManifestRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsManifestRepository.kt\ncom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,390:1\n107#2,8:391\n116#2:400\n115#2:401\n107#2,10:402\n107#2,10:412\n1#3:399\n1559#4:422\n1590#4,4:423\n515#5:427\n500#5,6:428\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsManifestRepository.kt\ncom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl\n*L\n161#1:391,8\n161#1:400\n161#1:401\n174#1:402,10\n202#1:412,10\n255#1:422\n255#1:423,4\n297#1:427\n297#1:428,6\n*E\n"})
/* loaded from: classes7.dex */
public final class FinancialConnectionsManifestRepositoryImpl implements FinancialConnectionsManifestRepository {
    public static final Companion Companion = new Companion(null);
    public static final String PARAMS_FULLSCREEN = "fullscreen";
    public static final String PARAMS_HIDE_CLOSE_BUTTON = "hide_close_button";
    private static final String cancelAuthSessionUrl;
    private static final String consentAcquiredUrl;
    private static final String eventsAuthSessionUrl;
    private static final String linkMoreAccountsUrl;
    private static final String synchronizeSessionUrl;
    private final ApiRequest.Options apiOptions;
    private final ApiRequest.Factory apiRequestFactory;
    private SynchronizeSessionResponse cachedSynchronizeSessionResponse;
    private final Locale locale;
    private final Logger logger;
    private final SX2 mutex;
    private final FinancialConnectionsRequestExecutor requestExecutor;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$Companion;", "", "()V", "PARAMS_FULLSCREEN", "", "PARAMS_HIDE_CLOSE_BUTTON", "cancelAuthSessionUrl", "getCancelAuthSessionUrl$financial_connections_release", "()Ljava/lang/String;", "consentAcquiredUrl", "getConsentAcquiredUrl$financial_connections_release", "eventsAuthSessionUrl", "getEventsAuthSessionUrl$financial_connections_release", "linkMoreAccountsUrl", "getLinkMoreAccountsUrl$financial_connections_release", "synchronizeSessionUrl", "getSynchronizeSessionUrl$financial_connections_release", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getCancelAuthSessionUrl$financial_connections_release() {
            return FinancialConnectionsManifestRepositoryImpl.cancelAuthSessionUrl;
        }

        public final String getConsentAcquiredUrl$financial_connections_release() {
            return FinancialConnectionsManifestRepositoryImpl.consentAcquiredUrl;
        }

        public final String getEventsAuthSessionUrl$financial_connections_release() {
            return FinancialConnectionsManifestRepositoryImpl.eventsAuthSessionUrl;
        }

        public final String getLinkMoreAccountsUrl$financial_connections_release() {
            return FinancialConnectionsManifestRepositoryImpl.linkMoreAccountsUrl;
        }

        public final String getSynchronizeSessionUrl$financial_connections_release() {
            return FinancialConnectionsManifestRepositoryImpl.synchronizeSessionUrl;
        }

        private Companion() {
        }
    }

    static {
        ApiRequest.Companion companion = ApiRequest.Companion;
        synchronizeSessionUrl = companion.getAPI_HOST() + "/v1/financial_connections/sessions/synchronize";
        cancelAuthSessionUrl = companion.getAPI_HOST() + "/v1/connections/auth_sessions/cancel";
        eventsAuthSessionUrl = companion.getAPI_HOST() + "/v1/connections/auth_sessions/events";
        consentAcquiredUrl = companion.getAPI_HOST() + "/v1/link_account_sessions/consent_acquired";
        linkMoreAccountsUrl = companion.getAPI_HOST() + "/v1/link_account_sessions/link_more_accounts";
    }

    public FinancialConnectionsManifestRepositoryImpl(FinancialConnectionsRequestExecutor requestExecutor, ApiRequest.Factory apiRequestFactory, ApiRequest.Options apiOptions, Locale locale, Logger logger, SynchronizeSessionResponse synchronizeSessionResponse) {
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
        Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.requestExecutor = requestExecutor;
        this.apiRequestFactory = apiRequestFactory;
        this.apiOptions = apiOptions;
        this.locale = locale;
        this.logger = logger;
        this.mutex = UX2.m81380b(false, 1, null);
        this.cachedSynchronizeSessionResponse = synchronizeSessionResponse;
    }

    private final ApiRequest synchronizeRequest(String str, String str2) {
        List listOf;
        Map mapOf;
        Map mapOf2;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String str3 = synchronizeSessionUrl;
        ApiRequest.Options options = this.apiOptions;
        listOf = CollectionsKt__CollectionsJVMKt.listOf("manifest.active_auth_session");
        Boolean bool = Boolean.TRUE;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(PARAMS_FULLSCREEN, bool), TuplesKt.m28425to(PARAMS_HIDE_CLOSE_BUTTON, bool), TuplesKt.m28425to(NetworkConstants.PARAMS_APPLICATION_ID, str));
        mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("expand", listOf), TuplesKt.m28425to("locale", this.locale.toLanguageTag()), TuplesKt.m28425to("mobile", mapOf), TuplesKt.m28425to("client_secret", str2));
        return ApiRequest.Factory.createPost$default(factory, str3, options, mapOf2, false, 8, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
        r1 = r2.copy((r60 & 1) != 0 ? r2.allowManualEntry : false, (r60 & 2) != 0 ? r2.consentRequired : false, (r60 & 4) != 0 ? r2.customManualEntryHandling : false, (r60 & 8) != 0 ? r2.disableLinkMoreAccounts : false, (r60 & 16) != 0 ? r2.f75311id : null, (r60 & 32) != 0 ? r2.instantVerificationDisabled : false, (r60 & 64) != 0 ? r2.institutionSearchDisabled : false, (r60 & 128) != 0 ? r2.livemode : false, (r60 & 256) != 0 ? r2.manualEntryUsesMicrodeposits : false, (r60 & 512) != 0 ? r2.mobileHandoffEnabled : false, (r60 & 1024) != 0 ? r2.nextPane : null, (r60 & 2048) != 0 ? r2.manualEntryMode : null, (r60 & 4096) != 0 ? r2.permissions : null, (r60 & 8192) != 0 ? r2.product : null, (r60 & 16384) != 0 ? r2.singleAccount : false, (r60 & net.danlew.android.joda.DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r2.useSingleSortSearch : false, (r60 & 65536) != 0 ? r2.accountDisconnectionMethod : null, (r60 & net.danlew.android.joda.DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r2.accountholderCustomerEmailAddress : null, (r60 & net.danlew.android.joda.DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r2.accountholderIsLinkConsumer : null, (r60 & 524288) != 0 ? r2.accountholderPhoneNumber : null, (r60 & 1048576) != 0 ? r2.accountholderToken : null, (r60 & 2097152) != 0 ? r2.activeAuthSession : null, (r60 & 4194304) != 0 ? r2.activeInstitution : r50, (r60 & 8388608) != 0 ? r2.assignmentEventId : null, (r60 & okhttp3.internal.http2.Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r2.businessName : null, (r60 & 33554432) != 0 ? r2.cancelUrl : null, (r60 & 67108864) != 0 ? r2.connectPlatformName : null, (r60 & 134217728) != 0 ? r2.connectedAccountName : null, (r60 & 268435456) != 0 ? r2.experimentAssignments : null, (r60 & 536870912) != 0 ? r2.features : null, (r60 & 1073741824) != 0 ? r2.hostedAuthUrl : null, (r60 & Integer.MIN_VALUE) != 0 ? r2.initialInstitution : null, (r61 & 1) != 0 ? r2.isEndUserFacing : null, (r61 & 2) != 0 ? r2.isLinkWithStripe : null, (r61 & 4) != 0 ? r2.isNetworkingUserFlow : null, (r61 & 8) != 0 ? r2.isStripeDirect : null, (r61 & 16) != 0 ? r2.linkAccountSessionCancellationBehavior : null, (r61 & 32) != 0 ? r2.modalCustomization : null, (r61 & 64) != 0 ? r2.paymentMethodType : null, (r61 & 128) != 0 ? r2.stepUpAuthenticationRequired : null, (r61 & 256) != 0 ? r2.successUrl : null, (r61 & 512) != 0 ? r2.skipSuccessPane : null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateActiveInstitution(String str, FinancialConnectionsInstitution financialConnectionsInstitution) {
        FinancialConnectionsSessionManifest copy;
        Logger logger = this.logger;
        logger.debug("SYNC_CACHE: updating local active institution from " + str);
        SynchronizeSessionResponse synchronizeSessionResponse = this.cachedSynchronizeSessionResponse;
        if (synchronizeSessionResponse != null && (r2 = synchronizeSessionResponse.getManifest()) != null && copy != null) {
            updateCachedManifest("updating active institution", copy);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
        r1 = r2.copy((r60 & 1) != 0 ? r2.allowManualEntry : false, (r60 & 2) != 0 ? r2.consentRequired : false, (r60 & 4) != 0 ? r2.customManualEntryHandling : false, (r60 & 8) != 0 ? r2.disableLinkMoreAccounts : false, (r60 & 16) != 0 ? r2.f75311id : null, (r60 & 32) != 0 ? r2.instantVerificationDisabled : false, (r60 & 64) != 0 ? r2.institutionSearchDisabled : false, (r60 & 128) != 0 ? r2.livemode : false, (r60 & 256) != 0 ? r2.manualEntryUsesMicrodeposits : false, (r60 & 512) != 0 ? r2.mobileHandoffEnabled : false, (r60 & 1024) != 0 ? r2.nextPane : null, (r60 & 2048) != 0 ? r2.manualEntryMode : null, (r60 & 4096) != 0 ? r2.permissions : null, (r60 & 8192) != 0 ? r2.product : null, (r60 & 16384) != 0 ? r2.singleAccount : false, (r60 & net.danlew.android.joda.DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r2.useSingleSortSearch : false, (r60 & 65536) != 0 ? r2.accountDisconnectionMethod : null, (r60 & net.danlew.android.joda.DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r2.accountholderCustomerEmailAddress : null, (r60 & net.danlew.android.joda.DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r2.accountholderIsLinkConsumer : null, (r60 & 524288) != 0 ? r2.accountholderPhoneNumber : null, (r60 & 1048576) != 0 ? r2.accountholderToken : null, (r60 & 2097152) != 0 ? r2.activeAuthSession : r50, (r60 & 4194304) != 0 ? r2.activeInstitution : null, (r60 & 8388608) != 0 ? r2.assignmentEventId : null, (r60 & okhttp3.internal.http2.Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r2.businessName : null, (r60 & 33554432) != 0 ? r2.cancelUrl : null, (r60 & 67108864) != 0 ? r2.connectPlatformName : null, (r60 & 134217728) != 0 ? r2.connectedAccountName : null, (r60 & 268435456) != 0 ? r2.experimentAssignments : null, (r60 & 536870912) != 0 ? r2.features : null, (r60 & 1073741824) != 0 ? r2.hostedAuthUrl : null, (r60 & Integer.MIN_VALUE) != 0 ? r2.initialInstitution : null, (r61 & 1) != 0 ? r2.isEndUserFacing : null, (r61 & 2) != 0 ? r2.isLinkWithStripe : null, (r61 & 4) != 0 ? r2.isNetworkingUserFlow : null, (r61 & 8) != 0 ? r2.isStripeDirect : null, (r61 & 16) != 0 ? r2.linkAccountSessionCancellationBehavior : null, (r61 & 32) != 0 ? r2.modalCustomization : null, (r61 & 64) != 0 ? r2.paymentMethodType : null, (r61 & 128) != 0 ? r2.stepUpAuthenticationRequired : null, (r61 & 256) != 0 ? r2.successUrl : null, (r61 & 512) != 0 ? r2.skipSuccessPane : null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateCachedActiveAuthSession(String str, FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession) {
        FinancialConnectionsSessionManifest copy;
        Logger logger = this.logger;
        logger.debug("SYNC_CACHE: updating local active auth session from " + str);
        SynchronizeSessionResponse synchronizeSessionResponse = this.cachedSynchronizeSessionResponse;
        if (synchronizeSessionResponse != null && (r2 = synchronizeSessionResponse.getManifest()) != null && copy != null) {
            updateCachedManifest("updating active auth session", copy);
        }
    }

    private final void updateCachedManifest(String str, FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        SynchronizeSessionResponse synchronizeSessionResponse;
        Logger logger = this.logger;
        logger.debug("SYNC_CACHE: updating local manifest from " + str);
        SynchronizeSessionResponse synchronizeSessionResponse2 = this.cachedSynchronizeSessionResponse;
        if (synchronizeSessionResponse2 != null) {
            synchronizeSessionResponse = SynchronizeSessionResponse.copy$default(synchronizeSessionResponse2, financialConnectionsSessionManifest, null, null, 6, null);
        } else {
            synchronizeSessionResponse = null;
        }
        this.cachedSynchronizeSessionResponse = synchronizeSessionResponse;
    }

    private final void updateCachedSynchronizeSessionResponse(String str, SynchronizeSessionResponse synchronizeSessionResponse) {
        Logger logger = this.logger;
        logger.debug("SYNC_CACHE: updating local sync object from " + str);
        this.cachedSynchronizeSessionResponse = synchronizeSessionResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object] */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object cancelAuthorizationSession(String str, String str2, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) {
        C18905x8be063a3 c18905x8be063a3;
        Object coroutine_suspended;
        int i;
        Map mapOf;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        if (continuation instanceof C18905x8be063a3) {
            c18905x8be063a3 = (C18905x8be063a3) continuation;
            int i2 = c18905x8be063a3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c18905x8be063a3.label = i2 - Integer.MIN_VALUE;
                Object obj = c18905x8be063a3.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c18905x8be063a3.label;
                if (i == 0) {
                    if (i == 1) {
                        financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c18905x8be063a3.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ApiRequest.Factory factory = this.apiRequestFactory;
                    String str3 = cancelAuthSessionUrl;
                    ApiRequest.Options options = this.apiOptions;
                    mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("id", str2), TuplesKt.m28425to("client_secret", str));
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(factory, str3, options, mapOf, false, 8, null);
                    FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor = this.requestExecutor;
                    InterfaceC34036Kj2<FinancialConnectionsAuthorizationSession> serializer = FinancialConnectionsAuthorizationSession.Companion.serializer();
                    c18905x8be063a3.L$0 = this;
                    c18905x8be063a3.label = 1;
                    obj = financialConnectionsRequestExecutor.execute(createPost$default, serializer, c18905x8be063a3);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    financialConnectionsManifestRepositoryImpl = this;
                }
                financialConnectionsManifestRepositoryImpl.updateCachedActiveAuthSession("cancelAuthorizationSession", obj);
                return obj;
            }
        }
        c18905x8be063a3 = new C18905x8be063a3(this, continuation);
        Object obj2 = c18905x8be063a3.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c18905x8be063a3.label;
        if (i == 0) {
        }
        financialConnectionsManifestRepositoryImpl.updateCachedActiveAuthSession("cancelAuthorizationSession", obj2);
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object] */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object completeAuthorizationSession(String str, String str2, String str3, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) {
        C18906x16d8e162 c18906x16d8e162;
        Object coroutine_suspended;
        int i;
        Map mapOf;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        boolean z;
        if (continuation instanceof C18906x16d8e162) {
            c18906x16d8e162 = (C18906x16d8e162) continuation;
            int i2 = c18906x16d8e162.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c18906x16d8e162.label = i2 - Integer.MIN_VALUE;
                Object obj = c18906x16d8e162.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c18906x16d8e162.label;
                if (i == 0) {
                    if (i == 1) {
                        financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c18906x16d8e162.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ApiRequest.Factory factory = this.apiRequestFactory;
                    String authorizeSessionUrl$financial_connections_release = FinancialConnectionsRepositoryImpl.Companion.getAuthorizeSessionUrl$financial_connections_release();
                    ApiRequest.Options options = this.apiOptions;
                    mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("id", str2), TuplesKt.m28425to("client_secret", str), TuplesKt.m28425to("public_token", str3));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : mapOf.entrySet()) {
                        if (entry.getValue() != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(factory, authorizeSessionUrl$financial_connections_release, options, linkedHashMap, false, 8, null);
                    FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor = this.requestExecutor;
                    InterfaceC34036Kj2<FinancialConnectionsAuthorizationSession> serializer = FinancialConnectionsAuthorizationSession.Companion.serializer();
                    c18906x16d8e162.L$0 = this;
                    c18906x16d8e162.label = 1;
                    obj = financialConnectionsRequestExecutor.execute(createPost$default, serializer, c18906x16d8e162);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    financialConnectionsManifestRepositoryImpl = this;
                }
                financialConnectionsManifestRepositoryImpl.updateCachedActiveAuthSession("completeAuthorizationSession", obj);
                return obj;
            }
        }
        c18906x16d8e162 = new C18906x16d8e162(this, continuation);
        Object obj2 = c18906x16d8e162.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c18906x16d8e162.label;
        if (i == 0) {
        }
        financialConnectionsManifestRepositoryImpl.updateCachedActiveAuthSession("completeAuthorizationSession", obj2);
        return obj2;
    }

    public final ApiRequest.Options getApiOptions() {
        return this.apiOptions;
    }

    public final ApiRequest.Factory getApiRequestFactory() {
        return this.apiRequestFactory;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final SX2 getMutex() {
        return this.mutex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0031, B:29:0x0093, B:24:0x0072, B:26:0x0076), top: B:36:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1, types: [SX2] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v4, types: [SX2] */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getOrFetchSynchronizeFinancialConnectionsSession(String str, String str2, Continuation<? super SynchronizeSessionResponse> continuation) {
        C18907x92610227 c18907x92610227;
        Object coroutine_suspended;
        int i;
        String str3;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        String str4;
        SX2 sx2;
        SynchronizeSessionResponse synchronizeSessionResponse;
        try {
            if (continuation instanceof C18907x92610227) {
                c18907x92610227 = (C18907x92610227) continuation;
                int i2 = c18907x92610227.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c18907x92610227.label = i2 - Integer.MIN_VALUE;
                    Object obj = c18907x92610227.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c18907x92610227.label;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c18907x92610227.L$1;
                                SX2 sx22 = (SX2) c18907x92610227.L$0;
                                ResultKt.throwOnFailure(obj);
                                str2 = sx22;
                                financialConnectionsManifestRepositoryImpl.updateCachedSynchronizeSessionResponse("get/fetch", obj);
                                return obj;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str3 = (String) c18907x92610227.L$1;
                        ResultKt.throwOnFailure(obj);
                        str4 = (String) c18907x92610227.L$2;
                        sx2 = (SX2) c18907x92610227.L$3;
                        financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c18907x92610227.L$0;
                    } else {
                        ResultKt.throwOnFailure(obj);
                        SX2 sx23 = this.mutex;
                        c18907x92610227.L$0 = this;
                        c18907x92610227.L$1 = str;
                        c18907x92610227.L$2 = str2;
                        c18907x92610227.L$3 = sx23;
                        c18907x92610227.label = 1;
                        if (sx23.mo83452a(null, c18907x92610227) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str3 = str;
                        financialConnectionsManifestRepositoryImpl = this;
                        str4 = str2;
                        sx2 = sx23;
                    }
                    synchronizeSessionResponse = financialConnectionsManifestRepositoryImpl.cachedSynchronizeSessionResponse;
                    if (synchronizeSessionResponse != null) {
                        FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor = financialConnectionsManifestRepositoryImpl.requestExecutor;
                        ApiRequest synchronizeRequest = financialConnectionsManifestRepositoryImpl.synchronizeRequest(str4, str3);
                        InterfaceC34036Kj2<SynchronizeSessionResponse> serializer = SynchronizeSessionResponse.Companion.serializer();
                        c18907x92610227.L$0 = sx2;
                        c18907x92610227.L$1 = financialConnectionsManifestRepositoryImpl;
                        c18907x92610227.L$2 = null;
                        c18907x92610227.L$3 = null;
                        c18907x92610227.label = 2;
                        obj = financialConnectionsRequestExecutor.execute(synchronizeRequest, serializer, c18907x92610227);
                        str2 = sx2;
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        financialConnectionsManifestRepositoryImpl.updateCachedSynchronizeSessionResponse("get/fetch", obj);
                        return obj;
                    }
                    return synchronizeSessionResponse;
                }
            }
            if (i == 0) {
            }
            synchronizeSessionResponse = financialConnectionsManifestRepositoryImpl.cachedSynchronizeSessionResponse;
            if (synchronizeSessionResponse != null) {
            }
        } finally {
            str2.mo83451b(null);
        }
        c18907x92610227 = new C18907x92610227(this, continuation);
        Object obj2 = c18907x92610227.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c18907x92610227.label;
    }

    public final FinancialConnectionsRequestExecutor getRequestExecutor() {
        return this.requestExecutor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object markConsentAcquired(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
        FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1 financialConnectionsManifestRepositoryImpl$markConsentAcquired$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        String str2;
        SX2 sx2;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        SX2 sx22;
        List listOf;
        Map mapOf;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl2;
        try {
            if (continuation instanceof FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1) {
                financialConnectionsManifestRepositoryImpl$markConsentAcquired$1 = (FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1) continuation;
                int i2 = financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.label = i2 - Integer.MIN_VALUE;
                    obj = financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                sx22 = (SX2) financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$1;
                                financialConnectionsManifestRepositoryImpl2 = (FinancialConnectionsManifestRepositoryImpl) financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    financialConnectionsManifestRepositoryImpl2.updateCachedManifest("consent acquired", obj);
                                    sx22.mo83451b(null);
                                    return obj;
                                } catch (Throwable th) {
                                    th = th;
                                    sx22.mo83451b(null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str3 = (String) financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$1;
                        financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        sx2 = (SX2) financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$2;
                        str2 = str3;
                    } else {
                        ResultKt.throwOnFailure(obj);
                        SX2 sx23 = this.mutex;
                        financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$0 = this;
                        str2 = str;
                        financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$1 = str2;
                        financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$2 = sx23;
                        financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.label = 1;
                        if (sx23.mo83452a(null, financialConnectionsManifestRepositoryImpl$markConsentAcquired$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sx2 = sx23;
                        financialConnectionsManifestRepositoryImpl = this;
                    }
                    ApiRequest.Factory factory = financialConnectionsManifestRepositoryImpl.apiRequestFactory;
                    String str4 = consentAcquiredUrl;
                    ApiRequest.Options options = financialConnectionsManifestRepositoryImpl.apiOptions;
                    listOf = CollectionsKt__CollectionsJVMKt.listOf("active_auth_session");
                    mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("expand", listOf), TuplesKt.m28425to("client_secret", str2));
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(factory, str4, options, mapOf, false, 8, null);
                    FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor = financialConnectionsManifestRepositoryImpl.requestExecutor;
                    InterfaceC34036Kj2<FinancialConnectionsSessionManifest> serializer = FinancialConnectionsSessionManifest.Companion.serializer();
                    financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$0 = financialConnectionsManifestRepositoryImpl;
                    financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$1 = sx2;
                    financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$2 = null;
                    financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.label = 2;
                    obj = financialConnectionsRequestExecutor.execute(createPost$default, serializer, financialConnectionsManifestRepositoryImpl$markConsentAcquired$1);
                    if (obj != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sx22 = sx2;
                    financialConnectionsManifestRepositoryImpl2 = financialConnectionsManifestRepositoryImpl;
                    financialConnectionsManifestRepositoryImpl2.updateCachedManifest("consent acquired", obj);
                    sx22.mo83451b(null);
                    return obj;
                }
            }
            ApiRequest.Factory factory2 = financialConnectionsManifestRepositoryImpl.apiRequestFactory;
            String str42 = consentAcquiredUrl;
            ApiRequest.Options options2 = financialConnectionsManifestRepositoryImpl.apiOptions;
            listOf = CollectionsKt__CollectionsJVMKt.listOf("active_auth_session");
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("expand", listOf), TuplesKt.m28425to("client_secret", str2));
            ApiRequest createPost$default2 = ApiRequest.Factory.createPost$default(factory2, str42, options2, mapOf, false, 8, null);
            FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor2 = financialConnectionsManifestRepositoryImpl.requestExecutor;
            InterfaceC34036Kj2<FinancialConnectionsSessionManifest> serializer2 = FinancialConnectionsSessionManifest.Companion.serializer();
            financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$0 = financialConnectionsManifestRepositoryImpl;
            financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$1 = sx2;
            financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$2 = null;
            financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.label = 2;
            obj = financialConnectionsRequestExecutor2.execute(createPost$default2, serializer2, financialConnectionsManifestRepositoryImpl$markConsentAcquired$1);
            if (obj != coroutine_suspended) {
            }
        } catch (Throwable th2) {
            th = th2;
            sx22 = sx2;
            sx22.mo83451b(null);
            throw th;
        }
        financialConnectionsManifestRepositoryImpl$markConsentAcquired$1 = new FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1(this, continuation);
        obj = financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object] */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object postAuthorizationSession(String str, String str2, FinancialConnectionsInstitution financialConnectionsInstitution, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) {
        C18908x8b165909 c18908x8b165909;
        Object coroutine_suspended;
        int i;
        Map mapOf;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        if (continuation instanceof C18908x8b165909) {
            c18908x8b165909 = (C18908x8b165909) continuation;
            int i2 = c18908x8b165909.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c18908x8b165909.label = i2 - Integer.MIN_VALUE;
                Object obj = c18908x8b165909.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c18908x8b165909.label;
                if (i == 0) {
                    if (i == 1) {
                        financialConnectionsInstitution = (FinancialConnectionsInstitution) c18908x8b165909.L$1;
                        financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c18908x8b165909.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ApiRequest.Factory factory = this.apiRequestFactory;
                    String authorizationSessionUrl$financial_connections_release = FinancialConnectionsRepositoryImpl.Companion.getAuthorizationSessionUrl$financial_connections_release();
                    ApiRequest.Options options = this.apiOptions;
                    mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("client_secret", str), TuplesKt.m28425to("use_mobile_handoff", Boxing.boxBoolean(false)), TuplesKt.m28425to("use_abstract_flow", Boxing.boxBoolean(true)), TuplesKt.m28425to("return_url", "auth-redirect/" + str2), TuplesKt.m28425to("institution", financialConnectionsInstitution.getId()));
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(factory, authorizationSessionUrl$financial_connections_release, options, mapOf, false, 8, null);
                    FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor = this.requestExecutor;
                    InterfaceC34036Kj2<FinancialConnectionsAuthorizationSession> serializer = FinancialConnectionsAuthorizationSession.Companion.serializer();
                    c18908x8b165909.L$0 = this;
                    c18908x8b165909.L$1 = financialConnectionsInstitution;
                    c18908x8b165909.label = 1;
                    obj = financialConnectionsRequestExecutor.execute(createPost$default, serializer, c18908x8b165909);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    financialConnectionsManifestRepositoryImpl = this;
                }
                financialConnectionsManifestRepositoryImpl.updateActiveInstitution("postAuthorizationSession", financialConnectionsInstitution);
                financialConnectionsManifestRepositoryImpl.updateCachedActiveAuthSession("postAuthorizationSession", obj);
                return obj;
            }
        }
        c18908x8b165909 = new C18908x8b165909(this, continuation);
        Object obj2 = c18908x8b165909.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c18908x8b165909.label;
        if (i == 0) {
        }
        financialConnectionsManifestRepositoryImpl.updateActiveInstitution("postAuthorizationSession", financialConnectionsInstitution);
        financialConnectionsManifestRepositoryImpl.updateCachedActiveAuthSession("postAuthorizationSession", obj2);
        return obj2;
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    public Object postAuthorizationSessionEvent(String str, Date date, String str2, List<? extends AuthSessionEvent> list, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) {
        Map mapOf;
        int collectionSizeOrDefault;
        Map plus;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String str3 = eventsAuthSessionUrl;
        ApiRequest.Options options = this.apiOptions;
        int i = 0;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("client_secret", str), TuplesKt.m28425to("client_timestamp", String.valueOf(date.getTime())), TuplesKt.m28425to("id", str2));
        List<? extends AuthSessionEvent> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(TuplesKt.m28425to("frontend_events[" + i + "]", ((AuthSessionEvent) obj).toMap()));
            i = i2;
        }
        plus = MapsKt__MapsKt.plus(mapOf, arrayList);
        return this.requestExecutor.execute(ApiRequest.Factory.createPost$default(factory, str3, options, plus, false, 8, null), FinancialConnectionsAuthorizationSession.Companion.serializer(), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object postMarkLinkingMoreAccounts(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
        C18909xed2016e4 c18909xed2016e4;
        Object coroutine_suspended;
        int i;
        List listOf;
        Map mapOf;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        if (continuation instanceof C18909xed2016e4) {
            c18909xed2016e4 = (C18909xed2016e4) continuation;
            int i2 = c18909xed2016e4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c18909xed2016e4.label = i2 - Integer.MIN_VALUE;
                Object obj = c18909xed2016e4.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c18909xed2016e4.label;
                if (i == 0) {
                    if (i == 1) {
                        financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c18909xed2016e4.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ApiRequest.Factory factory = this.apiRequestFactory;
                    String str2 = linkMoreAccountsUrl;
                    ApiRequest.Options options = this.apiOptions;
                    listOf = CollectionsKt__CollectionsJVMKt.listOf("active_auth_session");
                    mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("expand", listOf), TuplesKt.m28425to("client_secret", str));
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(factory, str2, options, mapOf, false, 8, null);
                    FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor = this.requestExecutor;
                    InterfaceC34036Kj2<FinancialConnectionsSessionManifest> serializer = FinancialConnectionsSessionManifest.Companion.serializer();
                    c18909xed2016e4.L$0 = this;
                    c18909xed2016e4.label = 1;
                    obj = financialConnectionsRequestExecutor.execute(createPost$default, serializer, c18909xed2016e4);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    financialConnectionsManifestRepositoryImpl = this;
                }
                financialConnectionsManifestRepositoryImpl.updateCachedManifest("postMarkLinkingMoreAccounts", obj);
                return obj;
            }
        }
        c18909xed2016e4 = new C18909xed2016e4(this, continuation);
        Object obj2 = c18909xed2016e4.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c18909xed2016e4.label;
        if (i == 0) {
        }
        financialConnectionsManifestRepositoryImpl.updateCachedManifest("postMarkLinkingMoreAccounts", obj2);
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object synchronizeFinancialConnectionsSession(String str, String str2, Continuation<? super SynchronizeSessionResponse> continuation) {
        C18910xd65ba366 c18910xd65ba366;
        Object coroutine_suspended;
        int i;
        SX2 sx2;
        String str3;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        SX2 sx22;
        Object execute;
        try {
            if (continuation instanceof C18910xd65ba366) {
                c18910xd65ba366 = (C18910xd65ba366) continuation;
                int i2 = c18910xd65ba366.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c18910xd65ba366.label = i2 - Integer.MIN_VALUE;
                    Object obj = c18910xd65ba366.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c18910xd65ba366.label;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                sx22 = (SX2) c18910xd65ba366.L$1;
                                financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c18910xd65ba366.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    financialConnectionsManifestRepositoryImpl.updateCachedSynchronizeSessionResponse("synchronize", obj);
                                    sx22.mo83451b(null);
                                    return obj;
                                } catch (Throwable th) {
                                    th = th;
                                    sx22.mo83451b(null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        sx2 = (SX2) c18910xd65ba366.L$3;
                        str = (String) c18910xd65ba366.L$1;
                        str3 = (String) c18910xd65ba366.L$2;
                        financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c18910xd65ba366.L$0;
                    } else {
                        ResultKt.throwOnFailure(obj);
                        sx2 = this.mutex;
                        c18910xd65ba366.L$0 = this;
                        c18910xd65ba366.L$1 = str;
                        c18910xd65ba366.L$2 = str2;
                        c18910xd65ba366.L$3 = sx2;
                        c18910xd65ba366.label = 1;
                        if (sx2.mo83452a(null, c18910xd65ba366) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str3 = str2;
                        financialConnectionsManifestRepositoryImpl = this;
                    }
                    ApiRequest synchronizeRequest = financialConnectionsManifestRepositoryImpl.synchronizeRequest(str3, str);
                    FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor = financialConnectionsManifestRepositoryImpl.requestExecutor;
                    InterfaceC34036Kj2<SynchronizeSessionResponse> serializer = SynchronizeSessionResponse.Companion.serializer();
                    c18910xd65ba366.L$0 = financialConnectionsManifestRepositoryImpl;
                    c18910xd65ba366.L$1 = sx2;
                    c18910xd65ba366.L$2 = null;
                    c18910xd65ba366.L$3 = null;
                    c18910xd65ba366.label = 2;
                    execute = financialConnectionsRequestExecutor.execute(synchronizeRequest, serializer, c18910xd65ba366);
                    if (execute != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    SX2 sx23 = sx2;
                    obj = execute;
                    sx22 = sx23;
                    financialConnectionsManifestRepositoryImpl.updateCachedSynchronizeSessionResponse("synchronize", obj);
                    sx22.mo83451b(null);
                    return obj;
                }
            }
            ApiRequest synchronizeRequest2 = financialConnectionsManifestRepositoryImpl.synchronizeRequest(str3, str);
            FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor2 = financialConnectionsManifestRepositoryImpl.requestExecutor;
            InterfaceC34036Kj2<SynchronizeSessionResponse> serializer2 = SynchronizeSessionResponse.Companion.serializer();
            c18910xd65ba366.L$0 = financialConnectionsManifestRepositoryImpl;
            c18910xd65ba366.L$1 = sx2;
            c18910xd65ba366.L$2 = null;
            c18910xd65ba366.L$3 = null;
            c18910xd65ba366.label = 2;
            execute = financialConnectionsRequestExecutor2.execute(synchronizeRequest2, serializer2, c18910xd65ba366);
            if (execute != coroutine_suspended) {
            }
        } catch (Throwable th2) {
            th = th2;
            sx22 = sx2;
            sx22.mo83451b(null);
            throw th;
        }
        c18910xd65ba366 = new C18910xd65ba366(this, continuation);
        Object obj2 = c18910xd65ba366.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c18910xd65ba366.label;
        if (i == 0) {
        }
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    public void updateLocalManifest(Function1<? super FinancialConnectionsSessionManifest, FinancialConnectionsSessionManifest> block) {
        FinancialConnectionsSessionManifest manifest;
        FinancialConnectionsSessionManifest invoke;
        Intrinsics.checkNotNullParameter(block, "block");
        SynchronizeSessionResponse synchronizeSessionResponse = this.cachedSynchronizeSessionResponse;
        if (synchronizeSessionResponse != null && (manifest = synchronizeSessionResponse.getManifest()) != null && (invoke = block.invoke(manifest)) != null) {
            updateCachedManifest("updateLocalManifest", invoke);
        }
    }
}
