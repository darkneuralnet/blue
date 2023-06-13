package com.stripe.android.financialconnections.repository;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000 62\u00020\u0001:\u00016B'\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b4\u00105J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J#\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, m28432d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "", Stripe3ds2AuthParams.FIELD_SOURCE, "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "accounts", "", "updateCachedAccounts", "clientSecret", "sessionId", "getOrFetchAccounts", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAuthorizationSessionAccounts", "Lcom/stripe/android/financialconnections/model/PaymentAccountParams;", "paymentAccount", "consumerSessionClientSecret", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "postLinkAccountSessionPaymentAccount", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "selectAccounts", "", "updateLocalCache", "postAuthorizationSessionSelectedAccounts", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "getRequestExecutor", "()Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "getApiRequestFactory", "()Lcom/stripe/android/core/networking/ApiRequest$Factory;", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "apiOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "getApiOptions", "()Lcom/stripe/android/core/networking/ApiRequest$Options;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "getLogger", "()Lcom/stripe/android/core/Logger;", "LSX2;", "mutex", "LSX2;", "getMutex", "()LSX2;", "cachedAccounts", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "<init>", "(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/Logger;)V", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFinancialConnectionsAccountsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsAccountsRepository.kt\ncom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,164:1\n107#2,10:165\n1559#3:175\n1590#3,4:176\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsAccountsRepository.kt\ncom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl\n*L\n77#1:165,10\n133#1:175\n133#1:176,4\n*E\n"})
/* loaded from: classes7.dex */
final class FinancialConnectionsAccountsRepositoryImpl implements FinancialConnectionsAccountsRepository {
    public static final Companion Companion = new Companion(null);
    public static final String PARAM_SELECTED_ACCOUNTS = "selected_accounts";
    private static final String accountsSessionUrl;
    private static final String attachPaymentAccountUrl;
    private static final String authorizationSessionSelectedAccountsUrl;
    private final ApiRequest.Options apiOptions;
    private final ApiRequest.Factory apiRequestFactory;
    private PartnerAccountsList cachedAccounts;
    private final Logger logger;
    private final SX2 mutex;
    private final FinancialConnectionsRequestExecutor requestExecutor;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$Companion;", "", "()V", "PARAM_SELECTED_ACCOUNTS", "", "accountsSessionUrl", "getAccountsSessionUrl$financial_connections_release", "()Ljava/lang/String;", "attachPaymentAccountUrl", "getAttachPaymentAccountUrl$financial_connections_release", "authorizationSessionSelectedAccountsUrl", "getAuthorizationSessionSelectedAccountsUrl$financial_connections_release", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getAccountsSessionUrl$financial_connections_release() {
            return FinancialConnectionsAccountsRepositoryImpl.accountsSessionUrl;
        }

        public final String getAttachPaymentAccountUrl$financial_connections_release() {
            return FinancialConnectionsAccountsRepositoryImpl.attachPaymentAccountUrl;
        }

        /* renamed from: getAuthorizationSessionSelectedAccountsUrl$financial_connections_release */
        public final String m45517x6e182e3e() {
            return FinancialConnectionsAccountsRepositoryImpl.authorizationSessionSelectedAccountsUrl;
        }

        private Companion() {
        }
    }

    static {
        ApiRequest.Companion companion = ApiRequest.Companion;
        accountsSessionUrl = companion.getAPI_HOST() + "/v1/connections/auth_sessions/accounts";
        attachPaymentAccountUrl = companion.getAPI_HOST() + "/v1/link_account_sessions/attach_payment_account";
        authorizationSessionSelectedAccountsUrl = companion.getAPI_HOST() + "/v1/connections/auth_sessions/selected_accounts";
    }

    public FinancialConnectionsAccountsRepositoryImpl(FinancialConnectionsRequestExecutor requestExecutor, ApiRequest.Factory apiRequestFactory, ApiRequest.Options apiOptions, Logger logger) {
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
        Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.requestExecutor = requestExecutor;
        this.apiRequestFactory = apiRequestFactory;
        this.apiOptions = apiOptions;
        this.logger = logger;
        this.mutex = UX2.m81380b(false, 1, null);
    }

    private final void updateCachedAccounts(String str, PartnerAccountsList partnerAccountsList) {
        Logger logger = this.logger;
        logger.debug("updating local partner accounts from " + str);
        this.cachedAccounts = partnerAccountsList;
    }

    public final ApiRequest.Options getApiOptions() {
        return this.apiOptions;
    }

    public final ApiRequest.Factory getApiRequestFactory() {
        return this.apiRequestFactory;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final SX2 getMutex() {
        return this.mutex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:29:0x007d, B:24:0x0068, B:26:0x006c), top: B:34:0x0023 }] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [SX2] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getOrFetchAccounts(String str, String str2, Continuation<? super PartnerAccountsList> continuation) {
        FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1 financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;
        Object coroutine_suspended;
        int i;
        FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl;
        String str3;
        SX2 sx2;
        PartnerAccountsList partnerAccountsList;
        SX2 sx22;
        try {
            if (continuation instanceof FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1) {
                financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1 = (FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1) continuation;
                int i2 = financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                SX2 sx23 = (SX2) financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                str = sx23;
                                partnerAccountsList = (PartnerAccountsList) obj;
                                sx22 = str;
                                return partnerAccountsList;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sx2 = (SX2) financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.L$3;
                        str2 = (String) financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.L$2;
                        str3 = (String) financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.L$1;
                        financialConnectionsAccountsRepositoryImpl = (FinancialConnectionsAccountsRepositoryImpl) financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        ResultKt.throwOnFailure(obj);
                        SX2 sx24 = this.mutex;
                        financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.L$0 = this;
                        financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.L$1 = str;
                        financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.L$2 = str2;
                        financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.L$3 = sx24;
                        financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.label = 1;
                        if (sx24.mo83452a(null, financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        financialConnectionsAccountsRepositoryImpl = this;
                        str3 = str;
                        sx2 = sx24;
                    }
                    partnerAccountsList = financialConnectionsAccountsRepositoryImpl.cachedAccounts;
                    sx22 = sx2;
                    if (partnerAccountsList == null) {
                        financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.L$0 = sx2;
                        financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.L$1 = null;
                        financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.L$2 = null;
                        financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.L$3 = null;
                        financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.label = 2;
                        obj = financialConnectionsAccountsRepositoryImpl.postAuthorizationSessionAccounts(str3, str2, financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1);
                        str = sx2;
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        partnerAccountsList = (PartnerAccountsList) obj;
                        sx22 = str;
                    }
                    return partnerAccountsList;
                }
            }
            if (i == 0) {
            }
            partnerAccountsList = financialConnectionsAccountsRepositoryImpl.cachedAccounts;
            sx22 = sx2;
            if (partnerAccountsList == null) {
            }
            return partnerAccountsList;
        } finally {
            str.mo83451b(null);
        }
        financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1 = new FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1(this, continuation);
        Object obj2 = financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = financialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1.label;
    }

    public final FinancialConnectionsRequestExecutor getRequestExecutor() {
        return this.requestExecutor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object] */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object postAuthorizationSessionAccounts(String str, String str2, Continuation<? super PartnerAccountsList> continuation) {
        C18903xec0926b8 c18903xec0926b8;
        Object coroutine_suspended;
        int i;
        Map mapOf;
        FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl;
        if (continuation instanceof C18903xec0926b8) {
            c18903xec0926b8 = (C18903xec0926b8) continuation;
            int i2 = c18903xec0926b8.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c18903xec0926b8.label = i2 - Integer.MIN_VALUE;
                Object obj = c18903xec0926b8.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c18903xec0926b8.label;
                if (i == 0) {
                    if (i == 1) {
                        financialConnectionsAccountsRepositoryImpl = (FinancialConnectionsAccountsRepositoryImpl) c18903xec0926b8.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ApiRequest.Factory factory = this.apiRequestFactory;
                    String str3 = accountsSessionUrl;
                    ApiRequest.Options options = this.apiOptions;
                    mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("id", str2), TuplesKt.m28425to("client_secret", str));
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(factory, str3, options, mapOf, false, 8, null);
                    FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor = this.requestExecutor;
                    InterfaceC34036Kj2<PartnerAccountsList> serializer = PartnerAccountsList.Companion.serializer();
                    c18903xec0926b8.L$0 = this;
                    c18903xec0926b8.label = 1;
                    obj = financialConnectionsRequestExecutor.execute(createPost$default, serializer, c18903xec0926b8);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    financialConnectionsAccountsRepositoryImpl = this;
                }
                financialConnectionsAccountsRepositoryImpl.updateCachedAccounts("getOrFetchAccounts", obj);
                return obj;
            }
        }
        c18903xec0926b8 = new C18903xec0926b8(this, continuation);
        Object obj2 = c18903xec0926b8.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c18903xec0926b8.label;
        if (i == 0) {
        }
        financialConnectionsAccountsRepositoryImpl.updateCachedAccounts("getOrFetchAccounts", obj2);
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object postAuthorizationSessionSelectedAccounts(String str, String str2, List<String> list, boolean z, Continuation<? super PartnerAccountsList> continuation) {
        C18904x80051ab3 c18904x80051ab3;
        Object coroutine_suspended;
        int i;
        Map mapOf;
        int collectionSizeOrDefault;
        Map plus;
        FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl;
        boolean z2;
        if (continuation instanceof C18904x80051ab3) {
            c18904x80051ab3 = (C18904x80051ab3) continuation;
            int i2 = c18904x80051ab3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c18904x80051ab3.label = i2 - Integer.MIN_VALUE;
                Object obj = c18904x80051ab3.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c18904x80051ab3.label;
                if (i == 0) {
                    if (i == 1) {
                        z2 = c18904x80051ab3.Z$0;
                        financialConnectionsAccountsRepositoryImpl = (FinancialConnectionsAccountsRepositoryImpl) c18904x80051ab3.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ApiRequest.Factory factory = this.apiRequestFactory;
                    String str3 = authorizationSessionSelectedAccountsUrl;
                    ApiRequest.Options options = this.apiOptions;
                    int i3 = 0;
                    mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("id", str2), TuplesKt.m28425to("client_secret", str));
                    List<String> list2 = list;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    for (Object obj2 : list2) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        arrayList.add(TuplesKt.m28425to("selected_accounts[" + i3 + "]", (String) obj2));
                        i3 = i4;
                    }
                    plus = MapsKt__MapsKt.plus(mapOf, arrayList);
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(factory, str3, options, plus, false, 8, null);
                    FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor = this.requestExecutor;
                    InterfaceC34036Kj2<PartnerAccountsList> serializer = PartnerAccountsList.Companion.serializer();
                    c18904x80051ab3.L$0 = this;
                    c18904x80051ab3.Z$0 = z;
                    c18904x80051ab3.label = 1;
                    obj = financialConnectionsRequestExecutor.execute(createPost$default, serializer, c18904x80051ab3);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    financialConnectionsAccountsRepositoryImpl = this;
                    z2 = z;
                }
                PartnerAccountsList partnerAccountsList = obj;
                if (z2) {
                    financialConnectionsAccountsRepositoryImpl.updateCachedAccounts("postAuthorizationSessionSelectedAccounts", partnerAccountsList);
                }
                return obj;
            }
        }
        c18904x80051ab3 = new C18904x80051ab3(this, continuation);
        Object obj3 = c18904x80051ab3.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c18904x80051ab3.label;
        if (i == 0) {
        }
        PartnerAccountsList partnerAccountsList2 = obj3;
        if (z2) {
        }
        return obj3;
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository
    public Object postLinkAccountSessionPaymentAccount(String str, PaymentAccountParams paymentAccountParams, String str2, Continuation<? super LinkAccountSessionPaymentAccount> continuation) {
        Map mapOf;
        Map plus;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String str3 = attachPaymentAccountUrl;
        ApiRequest.Options options = this.apiOptions;
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("client_secret", str));
        plus = MapsKt__MapsKt.plus(mapOf, paymentAccountParams.toParamMap());
        return this.requestExecutor.execute(ApiRequest.Factory.createPost$default(factory, str3, options, plus, false, 8, null), LinkAccountSessionPaymentAccount.Companion.serializer(), continuation);
    }
}
