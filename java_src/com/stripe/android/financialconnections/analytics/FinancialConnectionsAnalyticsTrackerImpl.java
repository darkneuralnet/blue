package com.stripe.android.financialconnections.analytics;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.core.networking.AnalyticsRequestV2Factory;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "getManifest", "Lcom/stripe/android/financialconnections/domain/GetManifest;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "logger", "Lcom/stripe/android/core/Logger;", "locale", "Ljava/util/Locale;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/core/Logger;Ljava/util/Locale;Landroid/content/Context;)V", "requestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;", "commonParams", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "track", "Lkotlin/Result;", "", "event", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "track-gIAlu-s", "(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FinancialConnectionsAnalyticsTrackerImpl implements FinancialConnectionsAnalyticsTracker {
    public static final String CLIENT_ID = "mobile-clients-linked-accounts";
    public static final Companion Companion = new Companion(null);
    public static final String ORIGIN = "stripe-linked-accounts-android";
    private final FinancialConnectionsSheet.Configuration configuration;
    private final GetManifest getManifest;
    private final Locale locale;
    private final Logger logger;
    private final AnalyticsRequestV2Factory requestFactory;
    private final StripeNetworkClient stripeNetworkClient;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$Companion;", "", "()V", "CLIENT_ID", "", "ORIGIN", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FinancialConnectionsAnalyticsTrackerImpl(StripeNetworkClient stripeNetworkClient, GetManifest getManifest, FinancialConnectionsSheet.Configuration configuration, Logger logger, Locale locale, Context context) {
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(getManifest, "getManifest");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(context, "context");
        this.stripeNetworkClient = stripeNetworkClient;
        this.getManifest = getManifest;
        this.configuration = configuration;
        this.logger = logger;
        this.locale = locale;
        this.requestFactory = new AnalyticsRequestV2Factory(context, CLIENT_ID, ORIGIN, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object commonParams(Continuation<? super Map<String, String>> continuation) {
        FinancialConnectionsAnalyticsTrackerImpl$commonParams$1 financialConnectionsAnalyticsTrackerImpl$commonParams$1;
        Object coroutine_suspended;
        int i;
        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl;
        Map mapOf;
        if (continuation instanceof FinancialConnectionsAnalyticsTrackerImpl$commonParams$1) {
            financialConnectionsAnalyticsTrackerImpl$commonParams$1 = (FinancialConnectionsAnalyticsTrackerImpl$commonParams$1) continuation;
            int i2 = financialConnectionsAnalyticsTrackerImpl$commonParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                financialConnectionsAnalyticsTrackerImpl$commonParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = financialConnectionsAnalyticsTrackerImpl$commonParams$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = financialConnectionsAnalyticsTrackerImpl$commonParams$1.label;
                if (i == 0) {
                    if (i == 1) {
                        financialConnectionsAnalyticsTrackerImpl = (FinancialConnectionsAnalyticsTrackerImpl) financialConnectionsAnalyticsTrackerImpl$commonParams$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    GetManifest getManifest = this.getManifest;
                    financialConnectionsAnalyticsTrackerImpl$commonParams$1.L$0 = this;
                    financialConnectionsAnalyticsTrackerImpl$commonParams$1.label = 1;
                    obj = getManifest.invoke(financialConnectionsAnalyticsTrackerImpl$commonParams$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    financialConnectionsAnalyticsTrackerImpl = this;
                }
                FinancialConnectionsSessionManifest financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) obj;
                mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(DefaultFinancialConnectionsEventReporter.PARAM_CLIENT_SECRET, financialConnectionsAnalyticsTrackerImpl.configuration.getFinancialConnectionsSessionClientSecret()), TuplesKt.m28425to("key", financialConnectionsAnalyticsTrackerImpl.configuration.getPublishableKey()), TuplesKt.m28425to("stripe_account", financialConnectionsAnalyticsTrackerImpl.configuration.getStripeAccountId()), TuplesKt.m28425to("navigator_language", financialConnectionsAnalyticsTrackerImpl.locale.toLanguageTag()), TuplesKt.m28425to("is_webview", "false"), TuplesKt.m28425to("livemode", String.valueOf(financialConnectionsSessionManifest.getLivemode())), TuplesKt.m28425to("product", financialConnectionsSessionManifest.getProduct().getValue()), TuplesKt.m28425to("is_stripe_direct", String.valueOf(financialConnectionsSessionManifest.isStripeDirect())), TuplesKt.m28425to("single_account", String.valueOf(financialConnectionsSessionManifest.getSingleAccount())), TuplesKt.m28425to("allow_manual_entry", String.valueOf(financialConnectionsSessionManifest.getAllowManualEntry())), TuplesKt.m28425to("account_holder_id", financialConnectionsSessionManifest.getAccountholderToken()));
                return mapOf;
            }
        }
        financialConnectionsAnalyticsTrackerImpl$commonParams$1 = new FinancialConnectionsAnalyticsTrackerImpl$commonParams$1(this, continuation);
        Object obj2 = financialConnectionsAnalyticsTrackerImpl$commonParams$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = financialConnectionsAnalyticsTrackerImpl$commonParams$1.label;
        if (i == 0) {
        }
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) obj2;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(DefaultFinancialConnectionsEventReporter.PARAM_CLIENT_SECRET, financialConnectionsAnalyticsTrackerImpl.configuration.getFinancialConnectionsSessionClientSecret()), TuplesKt.m28425to("key", financialConnectionsAnalyticsTrackerImpl.configuration.getPublishableKey()), TuplesKt.m28425to("stripe_account", financialConnectionsAnalyticsTrackerImpl.configuration.getStripeAccountId()), TuplesKt.m28425to("navigator_language", financialConnectionsAnalyticsTrackerImpl.locale.toLanguageTag()), TuplesKt.m28425to("is_webview", "false"), TuplesKt.m28425to("livemode", String.valueOf(financialConnectionsSessionManifest2.getLivemode())), TuplesKt.m28425to("product", financialConnectionsSessionManifest2.getProduct().getValue()), TuplesKt.m28425to("is_stripe_direct", String.valueOf(financialConnectionsSessionManifest2.isStripeDirect())), TuplesKt.m28425to("single_account", String.valueOf(financialConnectionsSessionManifest2.getSingleAccount())), TuplesKt.m28425to("allow_manual_entry", String.valueOf(financialConnectionsSessionManifest2.getAllowManualEntry())), TuplesKt.m28425to("account_holder_id", financialConnectionsSessionManifest2.getAccountholderToken()));
        return mapOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    @Override // com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker
    /* renamed from: track-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo116345trackgIAlus(FinancialConnectionsEvent financialConnectionsEvent, Continuation<? super Result<Unit>> continuation) {
        FinancialConnectionsAnalyticsTrackerImpl$track$1 financialConnectionsAnalyticsTrackerImpl$track$1;
        Object coroutine_suspended;
        int i;
        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl;
        Map<String, String> params;
        Object commonParams;
        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl2;
        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl3;
        Map<String, ? extends Object> plus;
        AnalyticsRequestV2 createRequest;
        StripeNetworkClient stripeNetworkClient;
        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl4;
        Object m116783constructorimpl;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof FinancialConnectionsAnalyticsTrackerImpl$track$1) {
            financialConnectionsAnalyticsTrackerImpl$track$1 = (FinancialConnectionsAnalyticsTrackerImpl$track$1) continuation;
            int i2 = financialConnectionsAnalyticsTrackerImpl$track$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                financialConnectionsAnalyticsTrackerImpl$track$1.label = i2 - Integer.MIN_VALUE;
                Object obj = financialConnectionsAnalyticsTrackerImpl$track$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = financialConnectionsAnalyticsTrackerImpl$track$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            createRequest = (AnalyticsRequestV2) financialConnectionsAnalyticsTrackerImpl$track$1.L$2;
                            financialConnectionsAnalyticsTrackerImpl4 = (FinancialConnectionsAnalyticsTrackerImpl) financialConnectionsAnalyticsTrackerImpl$track$1.L$1;
                            financialConnectionsAnalyticsTrackerImpl = (FinancialConnectionsAnalyticsTrackerImpl) financialConnectionsAnalyticsTrackerImpl$track$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                Logger logger = financialConnectionsAnalyticsTrackerImpl4.logger;
                                String eventName = createRequest.getEventName();
                                Map<String, ?> params2 = createRequest.getParams();
                                logger.debug("EVENT: " + eventName + ": " + params2);
                                m116783constructorimpl = Result.m116783constructorimpl(Unit.INSTANCE);
                            } catch (Throwable th) {
                                th = th;
                                Result.Companion companion = Result.Companion;
                                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                                if (m116786exceptionOrNullimpl != null) {
                                }
                                return m116783constructorimpl;
                            }
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl != null) {
                                financialConnectionsAnalyticsTrackerImpl.logger.error("Exception while making analytics request", m116786exceptionOrNullimpl);
                            }
                            return m116783constructorimpl;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Map<String, String> map = (Map) financialConnectionsAnalyticsTrackerImpl$track$1.L$3;
                    FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl5 = (FinancialConnectionsAnalyticsTrackerImpl) financialConnectionsAnalyticsTrackerImpl$track$1.L$2;
                    FinancialConnectionsEvent financialConnectionsEvent2 = (FinancialConnectionsEvent) financialConnectionsAnalyticsTrackerImpl$track$1.L$1;
                    financialConnectionsAnalyticsTrackerImpl3 = (FinancialConnectionsAnalyticsTrackerImpl) financialConnectionsAnalyticsTrackerImpl$track$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        params = map;
                        financialConnectionsEvent = financialConnectionsEvent2;
                        financialConnectionsAnalyticsTrackerImpl2 = financialConnectionsAnalyticsTrackerImpl5;
                        commonParams = obj;
                    } catch (Throwable th2) {
                        th = th2;
                        financialConnectionsAnalyticsTrackerImpl = financialConnectionsAnalyticsTrackerImpl3;
                        Result.Companion companion2 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        return m116783constructorimpl;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion3 = Result.Companion;
                        params = financialConnectionsEvent.getParams();
                        if (params == null) {
                            params = MapsKt__MapsKt.emptyMap();
                        }
                        financialConnectionsAnalyticsTrackerImpl$track$1.L$0 = this;
                        financialConnectionsAnalyticsTrackerImpl$track$1.L$1 = financialConnectionsEvent;
                        financialConnectionsAnalyticsTrackerImpl$track$1.L$2 = this;
                        financialConnectionsAnalyticsTrackerImpl$track$1.L$3 = params;
                        financialConnectionsAnalyticsTrackerImpl$track$1.label = 1;
                        commonParams = commonParams(financialConnectionsAnalyticsTrackerImpl$track$1);
                        if (commonParams == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        financialConnectionsAnalyticsTrackerImpl2 = this;
                        financialConnectionsAnalyticsTrackerImpl3 = financialConnectionsAnalyticsTrackerImpl2;
                    } catch (Throwable th3) {
                        th = th3;
                        financialConnectionsAnalyticsTrackerImpl = this;
                        Result.Companion companion22 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        return m116783constructorimpl;
                    }
                }
                AnalyticsRequestV2Factory analyticsRequestV2Factory = financialConnectionsAnalyticsTrackerImpl2.requestFactory;
                String eventName2 = financialConnectionsEvent.getEventName();
                plus = MapsKt__MapsKt.plus(params, (Map) commonParams);
                createRequest = analyticsRequestV2Factory.createRequest(eventName2, plus, true);
                stripeNetworkClient = financialConnectionsAnalyticsTrackerImpl2.stripeNetworkClient;
                financialConnectionsAnalyticsTrackerImpl$track$1.L$0 = financialConnectionsAnalyticsTrackerImpl3;
                financialConnectionsAnalyticsTrackerImpl$track$1.L$1 = financialConnectionsAnalyticsTrackerImpl2;
                financialConnectionsAnalyticsTrackerImpl$track$1.L$2 = createRequest;
                financialConnectionsAnalyticsTrackerImpl$track$1.L$3 = null;
                financialConnectionsAnalyticsTrackerImpl$track$1.label = 2;
                if (stripeNetworkClient.executeRequest(createRequest, financialConnectionsAnalyticsTrackerImpl$track$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                financialConnectionsAnalyticsTrackerImpl4 = financialConnectionsAnalyticsTrackerImpl2;
                financialConnectionsAnalyticsTrackerImpl = financialConnectionsAnalyticsTrackerImpl3;
                Logger logger2 = financialConnectionsAnalyticsTrackerImpl4.logger;
                String eventName3 = createRequest.getEventName();
                Map<String, ?> params22 = createRequest.getParams();
                logger2.debug("EVENT: " + eventName3 + ": " + params22);
                m116783constructorimpl = Result.m116783constructorimpl(Unit.INSTANCE);
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                }
                return m116783constructorimpl;
            }
        }
        financialConnectionsAnalyticsTrackerImpl$track$1 = new FinancialConnectionsAnalyticsTrackerImpl$track$1(this, continuation);
        Object obj2 = financialConnectionsAnalyticsTrackerImpl$track$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = financialConnectionsAnalyticsTrackerImpl$track$1.label;
        if (i == 0) {
        }
        AnalyticsRequestV2Factory analyticsRequestV2Factory2 = financialConnectionsAnalyticsTrackerImpl2.requestFactory;
        String eventName22 = financialConnectionsEvent.getEventName();
        plus = MapsKt__MapsKt.plus(params, (Map) commonParams);
        createRequest = analyticsRequestV2Factory2.createRequest(eventName22, plus, true);
        stripeNetworkClient = financialConnectionsAnalyticsTrackerImpl2.stripeNetworkClient;
        financialConnectionsAnalyticsTrackerImpl$track$1.L$0 = financialConnectionsAnalyticsTrackerImpl3;
        financialConnectionsAnalyticsTrackerImpl$track$1.L$1 = financialConnectionsAnalyticsTrackerImpl2;
        financialConnectionsAnalyticsTrackerImpl$track$1.L$2 = createRequest;
        financialConnectionsAnalyticsTrackerImpl$track$1.L$3 = null;
        financialConnectionsAnalyticsTrackerImpl$track$1.label = 2;
        if (stripeNetworkClient.executeRequest(createRequest, financialConnectionsAnalyticsTrackerImpl$track$1) != coroutine_suspended) {
        }
    }
}
