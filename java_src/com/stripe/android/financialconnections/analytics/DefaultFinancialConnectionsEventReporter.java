package com.stripe.android.financialconnections.analytics;

import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.utils.CollectionsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/networking/AnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;)V", "fireEvent", "", "event", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "onPresented", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "onResult", "financialConnectionsSheetResult", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DefaultFinancialConnectionsEventReporter implements FinancialConnectionsEventReporter {
    public static final Companion Companion = new Companion(null);
    public static final String PARAM_CLIENT_SECRET = "las_client_secret";
    public static final String PARAM_SESSION_RESULT = "session_result";
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final AnalyticsRequestFactory analyticsRequestFactory;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Companion;", "", "()V", "PARAM_CLIENT_SECRET", "", "PARAM_SESSION_RESULT", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DefaultFinancialConnectionsEventReporter(AnalyticsRequestExecutor analyticsRequestExecutor, AnalyticsRequestFactory analyticsRequestFactory, @IOContext CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(analyticsRequestFactory, "analyticsRequestFactory");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.analyticsRequestFactory = analyticsRequestFactory;
        this.workContext = workContext;
    }

    private final void fireEvent(FinancialConnectionsAnalyticsEvent financialConnectionsAnalyticsEvent) {
        Z30.m73800d(C37824aD0.m71790a(this.workContext), null, null, new DefaultFinancialConnectionsEventReporter$fireEvent$1(this, financialConnectionsAnalyticsEvent, null), 3, null);
    }

    @Override // com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter
    public void onPresented(FinancialConnectionsSheet.Configuration configuration) {
        Map mapOf;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        FinancialConnectionsAnalyticsEvent.Code code = FinancialConnectionsAnalyticsEvent.Code.SheetPresented;
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_CLIENT_SECRET, configuration.getFinancialConnectionsSessionClientSecret()));
        fireEvent(new FinancialConnectionsAnalyticsEvent(code, mapOf));
    }

    @Override // com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter
    public void onResult(FinancialConnectionsSheet.Configuration configuration, FinancialConnectionsSheetActivityResult financialConnectionsSheetResult) {
        Map mapOf;
        Map plus;
        FinancialConnectionsAnalyticsEvent financialConnectionsAnalyticsEvent;
        Map mapOf2;
        Map mapOf3;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(financialConnectionsSheetResult, "financialConnectionsSheetResult");
        if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetActivityResult.Completed) {
            FinancialConnectionsAnalyticsEvent.Code code = FinancialConnectionsAnalyticsEvent.Code.SheetClosed;
            mapOf3 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(PARAM_CLIENT_SECRET, configuration.getFinancialConnectionsSessionClientSecret()), TuplesKt.m28425to(PARAM_SESSION_RESULT, "completed"));
            financialConnectionsAnalyticsEvent = new FinancialConnectionsAnalyticsEvent(code, mapOf3);
        } else if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetActivityResult.Canceled) {
            FinancialConnectionsAnalyticsEvent.Code code2 = FinancialConnectionsAnalyticsEvent.Code.SheetClosed;
            mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(PARAM_CLIENT_SECRET, configuration.getFinancialConnectionsSessionClientSecret()), TuplesKt.m28425to(PARAM_SESSION_RESULT, "cancelled"));
            financialConnectionsAnalyticsEvent = new FinancialConnectionsAnalyticsEvent(code2, mapOf2);
        } else if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetActivityResult.Failed) {
            FinancialConnectionsAnalyticsEvent.Code code3 = FinancialConnectionsAnalyticsEvent.Code.SheetFailed;
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(PARAM_CLIENT_SECRET, configuration.getFinancialConnectionsSessionClientSecret()), TuplesKt.m28425to(PARAM_SESSION_RESULT, "failure"));
            plus = MapsKt__MapsKt.plus(mapOf, CollectionsKt.filterNotNullValues(AnalyticsMappersKt.toEventParams(((FinancialConnectionsSheetActivityResult.Failed) financialConnectionsSheetResult).getError())));
            financialConnectionsAnalyticsEvent = new FinancialConnectionsAnalyticsEvent(code3, plus);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        fireEvent(financialConnectionsAnalyticsEvent);
    }
}
