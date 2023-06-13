package com.stripe.android.financialconnections.p040di;

import android.app.Application;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLocaleFactory;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel;
import com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter_Factory;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.debug.DebugConfiguration;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken;
import com.stripe.android.financialconnections.domain.FetchPaginatedAccountsForSession;
import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.domain.GetManifest_Factory;
import com.stripe.android.financialconnections.domain.NativeAuthFlowRouter;
import com.stripe.android.financialconnections.domain.SynchronizeFinancialConnectionsSession;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor_Factory;
import com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetComponent;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl_Factory;
import java.util.Locale;
import kotlin.coroutines.CoroutineContext;
/* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetComponent */
/* loaded from: classes7.dex */
public final class DaggerFinancialConnectionsSheetComponent {

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetComponent$Builder */
    /* loaded from: classes7.dex */
    public static final class Builder implements FinancialConnectionsSheetComponent.Builder {
        private Application application;
        private FinancialConnectionsSheet.Configuration configuration;
        private FinancialConnectionsSheetState initialState;

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetComponent.Builder
        public FinancialConnectionsSheetComponent build() {
            C51679xZ3.m5006a(this.application, Application.class);
            C51679xZ3.m5006a(this.initialState, FinancialConnectionsSheetState.class);
            C51679xZ3.m5006a(this.configuration, FinancialConnectionsSheet.Configuration.class);
            return new FinancialConnectionsSheetComponentImpl(new CoroutineContextModule(), new CoreCommonModule(), this.application, this.initialState, this.configuration);
        }

        private Builder() {
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) C51679xZ3.m5005b(application);
            return this;
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetComponent.Builder
        public Builder configuration(FinancialConnectionsSheet.Configuration configuration) {
            this.configuration = (FinancialConnectionsSheet.Configuration) C51679xZ3.m5005b(configuration);
            return this;
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetComponent.Builder
        public Builder initialState(FinancialConnectionsSheetState financialConnectionsSheetState) {
            this.initialState = (FinancialConnectionsSheetState) C51679xZ3.m5005b(financialConnectionsSheetState);
            return this;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetComponent$FinancialConnectionsSheetComponentImpl */
    /* loaded from: classes7.dex */
    public static final class FinancialConnectionsSheetComponentImpl implements FinancialConnectionsSheetComponent {
        private final Application application;
        private Y94<Application> applicationProvider;
        private Y94<FinancialConnectionsSheet.Configuration> configurationProvider;
        private Y94<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Y94<DefaultFinancialConnectionsEventReporter> defaultFinancialConnectionsEventReporterProvider;
        private Y94<FinancialConnectionsRepositoryImpl> financialConnectionsRepositoryImplProvider;
        private Y94<FinancialConnectionsRequestExecutor> financialConnectionsRequestExecutorProvider;
        private final FinancialConnectionsSheetComponentImpl financialConnectionsSheetComponentImpl;
        private Y94<GetManifest> getManifestProvider;
        private final FinancialConnectionsSheetState initialState;

        /* renamed from: provideAnalyticsRequestFactory$financial_connections_releaseProvider */
        private Y94<AnalyticsRequestFactory> f75300x417aec94;
        private Y94<FinancialConnectionsRepository> provideConnectionsRepositoryProvider;
        private Y94<FinancialConnectionsEventReporter> provideEventReporterProvider;
        private Y94<Locale> provideLocaleProvider;
        private Y94<Logger> provideLoggerProvider;
        private Y94<StripeNetworkClient> provideStripeNetworkClientProvider;
        private Y94<CoroutineContext> provideWorkContextProvider;

        /* renamed from: providesAnalyticsRequestExecutor$financial_connections_releaseProvider */
        private Y94<AnalyticsRequestExecutor> f75301x61e07d82;
        private Y94<FinancialConnectionsAnalyticsTracker> providesAnalyticsTrackerProvider;
        private Y94<ApiRequest.Options> providesApiOptions$financial_connections_releaseProvider;
        private Y94<ApiRequest.Factory> providesApiRequestFactoryProvider;
        private Y94<String> providesApplicationIdProvider;
        private Y94<Boolean> providesEnableLoggingProvider;
        private Y94<FinancialConnectionsManifestRepository> providesFinancialConnectionsManifestRepositoryProvider;
        private Y94<AbstractC38706bi2> providesJson$financial_connections_releaseProvider;
        private Y94<String> providesPublishableKeyProvider;
        private Y94<String> providesStripeAccountIdProvider;

        private DebugConfiguration debugConfiguration() {
            return new DebugConfiguration(this.application);
        }

        private FetchFinancialConnectionsSession fetchFinancialConnectionsSession() {
            return new FetchFinancialConnectionsSession(fetchPaginatedAccountsForSession(), this.provideConnectionsRepositoryProvider.get());
        }

        private FetchFinancialConnectionsSessionForToken fetchFinancialConnectionsSessionForToken() {
            return new FetchFinancialConnectionsSessionForToken(this.provideConnectionsRepositoryProvider.get());
        }

        private FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession() {
            return new FetchPaginatedAccountsForSession(this.provideConnectionsRepositoryProvider.get());
        }

        private void initialize(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Application application, FinancialConnectionsSheetState financialConnectionsSheetState, FinancialConnectionsSheet.Configuration configuration) {
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(application);
            this.applicationProvider = m44621a;
            this.providesApplicationIdProvider = V51.m80429b(C18638x7ea6f701.create(m44621a));
            this.provideWorkContextProvider = V51.m80429b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            Y94<Boolean> m80429b = V51.m80429b(C18639x28e5e010.create());
            this.providesEnableLoggingProvider = m80429b;
            Y94<Logger> m80429b2 = V51.m80429b(CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, m80429b));
            this.provideLoggerProvider = m80429b2;
            this.provideStripeNetworkClientProvider = V51.m80429b(C18650xe2bf8364.create(this.provideWorkContextProvider, m80429b2));
            Y94<AbstractC38706bi2> m80429b3 = V51.m80429b(C18655x886d97d2.create());
            this.providesJson$financial_connections_releaseProvider = m80429b3;
            this.financialConnectionsRequestExecutorProvider = FinancialConnectionsRequestExecutor_Factory.create(this.provideStripeNetworkClientProvider, m80429b3);
            this.providesApiRequestFactoryProvider = V51.m80429b(C18654x4bd4d9c2.create());
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(configuration);
            this.configurationProvider = m44621a2;
            this.providesPublishableKeyProvider = V51.m80429b(C18640xe20d86b2.create(m44621a2));
            Y94<String> m80429b4 = V51.m80429b(C18641xdfed4cb1.create(this.configurationProvider));
            this.providesStripeAccountIdProvider = m80429b4;
            this.providesApiOptions$financial_connections_releaseProvider = V51.m80429b(C18653xfb8744d6.create(this.providesPublishableKeyProvider, m80429b4));
            Y94<Locale> m80429b5 = V51.m80429b(CoreCommonModule_ProvideLocaleFactory.create(coreCommonModule));
            this.provideLocaleProvider = m80429b5;
            this.providesFinancialConnectionsManifestRepositoryProvider = V51.m80429b(C18642x814556f3.create(this.financialConnectionsRequestExecutorProvider, this.providesApiRequestFactoryProvider, this.providesApiOptions$financial_connections_releaseProvider, m80429b5, this.provideLoggerProvider));
            FinancialConnectionsRepositoryImpl_Factory create = FinancialConnectionsRepositoryImpl_Factory.create(this.financialConnectionsRequestExecutorProvider, this.providesApiOptions$financial_connections_releaseProvider, this.providesApiRequestFactoryProvider);
            this.financialConnectionsRepositoryImplProvider = create;
            this.provideConnectionsRepositoryProvider = V51.m80429b(C18648xf9c8e051.create(create));
            DefaultAnalyticsRequestExecutor_Factory create2 = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, this.provideWorkContextProvider);
            this.defaultAnalyticsRequestExecutorProvider = create2;
            this.f75301x61e07d82 = V51.m80429b(C18651xbcea0d9e.create(create2));
            Y94<AnalyticsRequestFactory> m80429b6 = V51.m80429b(C18647xc674418c.create(this.applicationProvider, this.providesPublishableKeyProvider));
            this.f75300x417aec94 = m80429b6;
            DefaultFinancialConnectionsEventReporter_Factory create3 = DefaultFinancialConnectionsEventReporter_Factory.create(this.f75301x61e07d82, m80429b6, this.provideWorkContextProvider);
            this.defaultFinancialConnectionsEventReporterProvider = create3;
            this.provideEventReporterProvider = V51.m80429b(C18649xe46e3bb5.create(create3));
            GetManifest_Factory create4 = GetManifest_Factory.create(this.providesFinancialConnectionsManifestRepositoryProvider, this.configurationProvider, this.providesApplicationIdProvider);
            this.getManifestProvider = create4;
            this.providesAnalyticsTrackerProvider = V51.m80429b(C18652x1619f8b.create(this.applicationProvider, this.provideLoggerProvider, create4, this.provideLocaleProvider, this.configurationProvider, this.provideStripeNetworkClientProvider));
        }

        private NativeAuthFlowRouter nativeAuthFlowRouter() {
            return new NativeAuthFlowRouter(this.providesAnalyticsTrackerProvider.get(), debugConfiguration());
        }

        private SynchronizeFinancialConnectionsSession synchronizeFinancialConnectionsSession() {
            return new SynchronizeFinancialConnectionsSession(this.providesFinancialConnectionsManifestRepositoryProvider.get());
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetComponent
        public FinancialConnectionsSheetViewModel getViewModel() {
            return new FinancialConnectionsSheetViewModel(this.providesApplicationIdProvider.get(), synchronizeFinancialConnectionsSession(), fetchFinancialConnectionsSession(), fetchFinancialConnectionsSessionForToken(), this.provideLoggerProvider.get(), this.provideEventReporterProvider.get(), nativeAuthFlowRouter(), this.initialState);
        }

        private FinancialConnectionsSheetComponentImpl(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Application application, FinancialConnectionsSheetState financialConnectionsSheetState, FinancialConnectionsSheet.Configuration configuration) {
            this.financialConnectionsSheetComponentImpl = this;
            this.application = application;
            this.initialState = financialConnectionsSheetState;
            initialize(coroutineContextModule, coreCommonModule, application, financialConnectionsSheetState, configuration);
        }
    }

    private DaggerFinancialConnectionsSheetComponent() {
    }

    public static FinancialConnectionsSheetComponent.Builder builder() {
        return new Builder();
    }
}
