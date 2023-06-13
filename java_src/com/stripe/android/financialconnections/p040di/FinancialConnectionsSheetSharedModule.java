package com.stripe.android.financialconnections.p040di;

import android.app.Application;
import android.content.pm.PackageManager;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.core.utils.ContextUtils;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import dagger.Module;
import dagger.Provides;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u00103J%\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J:\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011H\u0007J\b\u0010\u001e\u001a\u00020\u001dH\u0007J\u0010\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0007J\u0010\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0007J\u0017\u0010,\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b*\u0010+J!\u00101\u001a\u00020.2\u0006\u0010-\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b/\u00100¨\u00064"}, m28432d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;", "", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "Lcom/stripe/android/core/networking/ApiRequest$Options;", "providesApiOptions$financial_connections_release", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/networking/ApiRequest$Options;", "providesApiOptions", "Lbi2;", "providesJson$financial_connections_release", "()Lbi2;", "providesJson", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "provideStripeNetworkClient", "Landroid/app/Application;", "Lcom/stripe/android/financialconnections/domain/GetManifest;", "getManifest", "Ljava/util/Locale;", "locale", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "configuration", "stripeNetworkClient", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "providesAnalyticsTracker", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "providesApiRequestFactory", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;", "provideConnectionsRepository", "Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;", "defaultFinancialConnectionsEventReporter", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;", "provideEventReporter", "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;", "executor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "providesAnalyticsRequestExecutor$financial_connections_release", "(Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "providesAnalyticsRequestExecutor", "application", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "provideAnalyticsRequestFactory$financial_connections_release", "(Landroid/app/Application;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "provideAnalyticsRequestFactory", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module(includes = {FinancialConnectionsSheetConfigurationModule.class})
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule */
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetSharedModule {
    public static final FinancialConnectionsSheetSharedModule INSTANCE = new FinancialConnectionsSheetSharedModule();

    private FinancialConnectionsSheetSharedModule() {
    }

    @Provides
    public final AnalyticsRequestFactory provideAnalyticsRequestFactory$financial_connections_release(Application application, final String publishableKey) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        PackageManager packageManager = application.getPackageManager();
        String packageName = application.getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        return new AnalyticsRequestFactory(packageManager, ContextUtils.INSTANCE.getPackageInfo(application), packageName, new Y94() { // from class: im1
            @Override // p000.Y94
            public final Object get() {
                String checkNotNullParameter;
                checkNotNullParameter = Intrinsics.checkNotNullParameter(publishableKey, "$publishableKey");
                return checkNotNullParameter;
            }
        });
    }

    @Provides
    public final FinancialConnectionsRepository provideConnectionsRepository(FinancialConnectionsRepositoryImpl repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        return repository;
    }

    @Provides
    public final FinancialConnectionsEventReporter provideEventReporter(DefaultFinancialConnectionsEventReporter defaultFinancialConnectionsEventReporter) {
        Intrinsics.checkNotNullParameter(defaultFinancialConnectionsEventReporter, "defaultFinancialConnectionsEventReporter");
        return defaultFinancialConnectionsEventReporter;
    }

    @Provides
    public final StripeNetworkClient provideStripeNetworkClient(@IOContext CoroutineContext context, Logger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new DefaultStripeNetworkClient(context, null, null, 0, logger, 14, null);
    }

    @Provides
    public final AnalyticsRequestExecutor providesAnalyticsRequestExecutor$financial_connections_release(DefaultAnalyticsRequestExecutor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        return executor;
    }

    @Provides
    public final FinancialConnectionsAnalyticsTracker providesAnalyticsTracker(Application context, Logger logger, GetManifest getManifest, Locale locale, FinancialConnectionsSheet.Configuration configuration, StripeNetworkClient stripeNetworkClient) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(getManifest, "getManifest");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Locale locale2 = locale;
        Intrinsics.checkNotNullExpressionValue(locale2, "locale ?: Locale.getDefault()");
        return new FinancialConnectionsAnalyticsTrackerImpl(stripeNetworkClient, getManifest, configuration, logger, locale2, context);
    }

    @Provides
    public final ApiRequest.Options providesApiOptions$financial_connections_release(String publishableKey, String str) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        return new ApiRequest.Options(publishableKey, str, null, 4, null);
    }

    @Provides
    public final ApiRequest.Factory providesApiRequestFactory() {
        Set of;
        of = SetsKt__SetsJVMKt.setOf("financial_connections_client_api_beta=v1");
        return new ApiRequest.Factory(null, new ApiVersion(of).getCode(), null, 5, null);
    }

    @Provides
    public final AbstractC38706bi2 providesJson$financial_connections_release() {
        return C33793Ji2.m99925b(null, FinancialConnectionsSheetSharedModule$providesJson$1.INSTANCE, 1, null);
    }
}
