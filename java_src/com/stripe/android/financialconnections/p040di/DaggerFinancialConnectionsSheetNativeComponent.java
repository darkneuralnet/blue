package com.stripe.android.financialconnections.p040di;

import android.app.Application;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLocaleFactory;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.AcceptConsent;
import com.stripe.android.financialconnections.domain.CancelAuthorizationSession;
import com.stripe.android.financialconnections.domain.CompleteAuthorizationSession;
import com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.FeaturedInstitutions;
import com.stripe.android.financialconnections.domain.FetchPaginatedAccountsForSession;
import com.stripe.android.financialconnections.domain.GetAuthorizationSessionAccounts;
import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.domain.GetManifest_Factory;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.GoNext;
import com.stripe.android.financialconnections.domain.LinkMoreAccounts;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator_Factory;
import com.stripe.android.financialconnections.domain.PollAttachPaymentAccount;
import com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts;
import com.stripe.android.financialconnections.domain.PollAuthorizationSessionOAuthResults;
import com.stripe.android.financialconnections.domain.PostAuthSessionEvent;
import com.stripe.android.financialconnections.domain.PostAuthorizationSession;
import com.stripe.android.financialconnections.domain.SearchInstitutions;
import com.stripe.android.financialconnections.domain.SelectAccounts;
import com.stripe.android.financialconnections.domain.UpdateLocalManifest;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerSubcomponent;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentState;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentSubcomponent;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.features.consent.ConsentSubcomponent;
import com.stripe.android.financialconnections.features.consent.ConsentViewModel;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerSubcomponent;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryState;
import com.stripe.android.financialconnections.features.manualentry.ManualEntrySubcomponent;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessState;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessSubcomponent;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessViewModel;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthState;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthSubcomponent;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import com.stripe.android.financialconnections.features.reset.ResetState;
import com.stripe.android.financialconnections.features.reset.ResetSubcomponent;
import com.stripe.android.financialconnections.features.reset.ResetViewModel;
import com.stripe.android.financialconnections.features.success.SuccessState;
import com.stripe.android.financialconnections.features.success.SuccessSubcomponent;
import com.stripe.android.financialconnections.features.success.SuccessViewModel;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.NavigationManager;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor_Factory;
import com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity_MembersInjector;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl_Factory;
import com.stripe.android.financialconnections.utils.UriUtils;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.Locale;
import kotlin.coroutines.CoroutineContext;
/* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent */
/* loaded from: classes7.dex */
public final class DaggerFinancialConnectionsSheetNativeComponent {

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$AccountPickerSubcomponentBuilder */
    /* loaded from: classes7.dex */
    public static final class AccountPickerSubcomponentBuilder implements AccountPickerSubcomponent.Builder {
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private AccountPickerState initialState;

        @Override // com.stripe.android.financialconnections.features.accountpicker.AccountPickerSubcomponent.Builder
        public AccountPickerSubcomponent build() {
            C51679xZ3.m5006a(this.initialState, AccountPickerState.class);
            return new AccountPickerSubcomponentImpl(this.financialConnectionsSheetNativeComponentImpl, this.initialState);
        }

        private AccountPickerSubcomponentBuilder(FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl) {
            this.financialConnectionsSheetNativeComponentImpl = financialConnectionsSheetNativeComponentImpl;
        }

        @Override // com.stripe.android.financialconnections.features.accountpicker.AccountPickerSubcomponent.Builder
        public AccountPickerSubcomponentBuilder initialState(AccountPickerState accountPickerState) {
            this.initialState = (AccountPickerState) C51679xZ3.m5005b(accountPickerState);
            return this;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$AccountPickerSubcomponentImpl */
    /* loaded from: classes7.dex */
    public static final class AccountPickerSubcomponentImpl implements AccountPickerSubcomponent {
        private final AccountPickerSubcomponentImpl accountPickerSubcomponentImpl;
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private final AccountPickerState initialState;

        private GoNext goNext() {
            return new GoNext((NavigationManager) this.financialConnectionsSheetNativeComponentImpl.providesNavigationManagerProvider.get(), (Logger) this.financialConnectionsSheetNativeComponentImpl.provideLoggerProvider.get());
        }

        private PollAuthorizationSessionAccounts pollAuthorizationSessionAccounts() {
            return new PollAuthorizationSessionAccounts((FinancialConnectionsAccountsRepository) this.financialConnectionsSheetNativeComponentImpl.providesFinancialConnectionsAccountsRepositoryProvider.get(), this.financialConnectionsSheetNativeComponentImpl.configuration);
        }

        private SelectAccounts selectAccounts() {
            return new SelectAccounts((FinancialConnectionsAccountsRepository) this.financialConnectionsSheetNativeComponentImpl.providesFinancialConnectionsAccountsRepositoryProvider.get(), this.financialConnectionsSheetNativeComponentImpl.configuration);
        }

        @Override // com.stripe.android.financialconnections.features.accountpicker.AccountPickerSubcomponent
        public AccountPickerViewModel getViewModel() {
            return new AccountPickerViewModel(this.initialState, (FinancialConnectionsAnalyticsTracker) this.financialConnectionsSheetNativeComponentImpl.providesAnalyticsTrackerProvider.get(), selectAccounts(), this.financialConnectionsSheetNativeComponentImpl.getManifest(), goNext(), (Locale) this.financialConnectionsSheetNativeComponentImpl.provideLocaleProvider.get(), (NavigationManager) this.financialConnectionsSheetNativeComponentImpl.providesNavigationManagerProvider.get(), (Logger) this.financialConnectionsSheetNativeComponentImpl.provideLoggerProvider.get(), pollAuthorizationSessionAccounts());
        }

        private AccountPickerSubcomponentImpl(FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl, AccountPickerState accountPickerState) {
            this.accountPickerSubcomponentImpl = this;
            this.financialConnectionsSheetNativeComponentImpl = financialConnectionsSheetNativeComponentImpl;
            this.initialState = accountPickerState;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$AttachPaymentSubcomponentBuilder */
    /* loaded from: classes7.dex */
    public static final class AttachPaymentSubcomponentBuilder implements AttachPaymentSubcomponent.Builder {
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private AttachPaymentState initialState;

        @Override // com.stripe.android.financialconnections.features.attachpayment.AttachPaymentSubcomponent.Builder
        public AttachPaymentSubcomponent build() {
            C51679xZ3.m5006a(this.initialState, AttachPaymentState.class);
            return new AttachPaymentSubcomponentImpl(this.financialConnectionsSheetNativeComponentImpl, this.initialState);
        }

        private AttachPaymentSubcomponentBuilder(FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl) {
            this.financialConnectionsSheetNativeComponentImpl = financialConnectionsSheetNativeComponentImpl;
        }

        @Override // com.stripe.android.financialconnections.features.attachpayment.AttachPaymentSubcomponent.Builder
        public AttachPaymentSubcomponentBuilder initialState(AttachPaymentState attachPaymentState) {
            this.initialState = (AttachPaymentState) C51679xZ3.m5005b(attachPaymentState);
            return this;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$AttachPaymentSubcomponentImpl */
    /* loaded from: classes7.dex */
    public static final class AttachPaymentSubcomponentImpl implements AttachPaymentSubcomponent {
        private final AttachPaymentSubcomponentImpl attachPaymentSubcomponentImpl;
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private final AttachPaymentState initialState;

        private GetAuthorizationSessionAccounts getAuthorizationSessionAccounts() {
            return new GetAuthorizationSessionAccounts((FinancialConnectionsAccountsRepository) this.financialConnectionsSheetNativeComponentImpl.providesFinancialConnectionsAccountsRepositoryProvider.get(), this.financialConnectionsSheetNativeComponentImpl.configuration);
        }

        private GoNext goNext() {
            return new GoNext((NavigationManager) this.financialConnectionsSheetNativeComponentImpl.providesNavigationManagerProvider.get(), (Logger) this.financialConnectionsSheetNativeComponentImpl.provideLoggerProvider.get());
        }

        private PollAttachPaymentAccount pollAttachPaymentAccount() {
            return new PollAttachPaymentAccount((FinancialConnectionsAccountsRepository) this.financialConnectionsSheetNativeComponentImpl.providesFinancialConnectionsAccountsRepositoryProvider.get(), this.financialConnectionsSheetNativeComponentImpl.configuration);
        }

        @Override // com.stripe.android.financialconnections.features.attachpayment.AttachPaymentSubcomponent
        public AttachPaymentViewModel getViewModel() {
            return new AttachPaymentViewModel(this.initialState, pollAttachPaymentAccount(), (FinancialConnectionsAnalyticsTracker) this.financialConnectionsSheetNativeComponentImpl.providesAnalyticsTrackerProvider.get(), getAuthorizationSessionAccounts(), (NavigationManager) this.financialConnectionsSheetNativeComponentImpl.providesNavigationManagerProvider.get(), this.financialConnectionsSheetNativeComponentImpl.getManifest(), goNext(), (Logger) this.financialConnectionsSheetNativeComponentImpl.provideLoggerProvider.get());
        }

        private AttachPaymentSubcomponentImpl(FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl, AttachPaymentState attachPaymentState) {
            this.attachPaymentSubcomponentImpl = this;
            this.financialConnectionsSheetNativeComponentImpl = financialConnectionsSheetNativeComponentImpl;
            this.initialState = attachPaymentState;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$Builder */
    /* loaded from: classes7.dex */
    public static final class Builder implements FinancialConnectionsSheetNativeComponent.Builder {
        private Application application;
        private FinancialConnectionsSheet.Configuration configuration;
        private FinancialConnectionsSheetNativeState initialState;
        private SynchronizeSessionResponse initialSyncResponse;

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent.Builder
        public FinancialConnectionsSheetNativeComponent build() {
            C51679xZ3.m5006a(this.application, Application.class);
            C51679xZ3.m5006a(this.initialState, FinancialConnectionsSheetNativeState.class);
            C51679xZ3.m5006a(this.configuration, FinancialConnectionsSheet.Configuration.class);
            return new FinancialConnectionsSheetNativeComponentImpl(new FinancialConnectionsSheetNativeModule(), new CoreCommonModule(), new CoroutineContextModule(), this.initialSyncResponse, this.application, this.initialState, this.configuration);
        }

        private Builder() {
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) C51679xZ3.m5005b(application);
            return this;
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent.Builder
        public Builder configuration(FinancialConnectionsSheet.Configuration configuration) {
            this.configuration = (FinancialConnectionsSheet.Configuration) C51679xZ3.m5005b(configuration);
            return this;
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent.Builder
        public Builder initialState(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState) {
            this.initialState = (FinancialConnectionsSheetNativeState) C51679xZ3.m5005b(financialConnectionsSheetNativeState);
            return this;
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent.Builder
        public Builder initialSyncResponse(SynchronizeSessionResponse synchronizeSessionResponse) {
            this.initialSyncResponse = synchronizeSessionResponse;
            return this;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$ConsentSubcomponentBuilder */
    /* loaded from: classes7.dex */
    public static final class ConsentSubcomponentBuilder implements ConsentSubcomponent.Builder {
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private ConsentState initialState;

        @Override // com.stripe.android.financialconnections.features.consent.ConsentSubcomponent.Builder
        public ConsentSubcomponent build() {
            C51679xZ3.m5006a(this.initialState, ConsentState.class);
            return new ConsentSubcomponentImpl(this.financialConnectionsSheetNativeComponentImpl, this.initialState);
        }

        private ConsentSubcomponentBuilder(FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl) {
            this.financialConnectionsSheetNativeComponentImpl = financialConnectionsSheetNativeComponentImpl;
        }

        @Override // com.stripe.android.financialconnections.features.consent.ConsentSubcomponent.Builder
        public ConsentSubcomponentBuilder initialState(ConsentState consentState) {
            this.initialState = (ConsentState) C51679xZ3.m5005b(consentState);
            return this;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$ConsentSubcomponentImpl */
    /* loaded from: classes7.dex */
    public static final class ConsentSubcomponentImpl implements ConsentSubcomponent {
        private final ConsentSubcomponentImpl consentSubcomponentImpl;
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private final ConsentState initialState;

        private AcceptConsent acceptConsent() {
            return new AcceptConsent((FinancialConnectionsManifestRepository) this.financialConnectionsSheetNativeComponentImpl.providesFinancialConnectionsManifestRepositoryProvider.get(), this.financialConnectionsSheetNativeComponentImpl.configuration);
        }

        private GetOrFetchSync getOrFetchSync() {
            return new GetOrFetchSync((FinancialConnectionsManifestRepository) this.financialConnectionsSheetNativeComponentImpl.providesFinancialConnectionsManifestRepositoryProvider.get(), this.financialConnectionsSheetNativeComponentImpl.configuration, (String) this.financialConnectionsSheetNativeComponentImpl.providesApplicationIdProvider.get());
        }

        private GoNext goNext() {
            return new GoNext((NavigationManager) this.financialConnectionsSheetNativeComponentImpl.providesNavigationManagerProvider.get(), (Logger) this.financialConnectionsSheetNativeComponentImpl.provideLoggerProvider.get());
        }

        @Override // com.stripe.android.financialconnections.features.consent.ConsentSubcomponent
        public ConsentViewModel getViewModel() {
            return new ConsentViewModel(this.initialState, acceptConsent(), goNext(), getOrFetchSync(), (NavigationManager) this.financialConnectionsSheetNativeComponentImpl.providesNavigationManagerProvider.get(), (FinancialConnectionsAnalyticsTracker) this.financialConnectionsSheetNativeComponentImpl.providesAnalyticsTrackerProvider.get(), this.financialConnectionsSheetNativeComponentImpl.uriUtils(), (Logger) this.financialConnectionsSheetNativeComponentImpl.provideLoggerProvider.get());
        }

        private ConsentSubcomponentImpl(FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl, ConsentState consentState) {
            this.consentSubcomponentImpl = this;
            this.financialConnectionsSheetNativeComponentImpl = financialConnectionsSheetNativeComponentImpl;
            this.initialState = consentState;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl */
    /* loaded from: classes7.dex */
    public static final class FinancialConnectionsSheetNativeComponentImpl implements FinancialConnectionsSheetNativeComponent {
        private Y94<Application> applicationProvider;
        private final FinancialConnectionsSheet.Configuration configuration;
        private Y94<FinancialConnectionsSheet.Configuration> configurationProvider;
        private Y94<FinancialConnectionsRepositoryImpl> financialConnectionsRepositoryImplProvider;
        private Y94<FinancialConnectionsRequestExecutor> financialConnectionsRequestExecutorProvider;
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private Y94<GetManifest> getManifestProvider;
        private final FinancialConnectionsSheetNativeState initialState;
        private Y94<SynchronizeSessionResponse> initialSyncResponseProvider;
        private Y94<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
        private Y94<FinancialConnectionsRepository> provideConnectionsRepositoryProvider;
        private Y94<Locale> provideLocaleProvider;
        private Y94<Logger> provideLoggerProvider;
        private Y94<StripeNetworkClient> provideStripeNetworkClientProvider;
        private Y94<CoroutineContext> provideWorkContextProvider;
        private Y94<FinancialConnectionsAnalyticsTracker> providesAnalyticsTrackerProvider;
        private Y94<ApiRequest.Options> providesApiOptions$financial_connections_releaseProvider;
        private Y94<ApiRequest.Factory> providesApiRequestFactoryProvider;
        private Y94<String> providesApplicationIdProvider;
        private Y94<Boolean> providesEnableLoggingProvider;
        private Y94<FinancialConnectionsAccountsRepository> providesFinancialConnectionsAccountsRepositoryProvider;
        private Y94<FinancialConnectionsInstitutionsRepository> providesFinancialConnectionsInstitutionsRepositoryProvider;
        private Y94<FinancialConnectionsManifestRepository> providesFinancialConnectionsManifestRepositoryProvider;
        private Y94<StripeImageLoader> providesImageLoaderProvider;
        private Y94<AbstractC38706bi2> providesJson$financial_connections_releaseProvider;
        private Y94<NavigationManager> providesNavigationManagerProvider;
        private Y94<String> providesPublishableKeyProvider;
        private Y94<String> providesStripeAccountIdProvider;

        /* JADX INFO: Access modifiers changed from: private */
        public CompleteFinancialConnectionsSession completeFinancialConnectionsSession() {
            return new CompleteFinancialConnectionsSession(this.provideConnectionsRepositoryProvider.get(), fetchPaginatedAccountsForSession(), this.configuration);
        }

        private FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession() {
            return new FetchPaginatedAccountsForSession(this.provideConnectionsRepositoryProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public GetManifest getManifest() {
            return new GetManifest(this.providesFinancialConnectionsManifestRepositoryProvider.get(), this.configuration, this.providesApplicationIdProvider.get());
        }

        private void initialize(FinancialConnectionsSheetNativeModule financialConnectionsSheetNativeModule, CoreCommonModule coreCommonModule, CoroutineContextModule coroutineContextModule, SynchronizeSessionResponse synchronizeSessionResponse, Application application, FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState, FinancialConnectionsSheet.Configuration configuration) {
            this.providesNavigationManagerProvider = V51.m80429b(C18646x100f468c.create(financialConnectionsSheetNativeModule));
            Y94<Boolean> m80429b = V51.m80429b(C18639x28e5e010.create());
            this.providesEnableLoggingProvider = m80429b;
            this.provideLoggerProvider = V51.m80429b(CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, m80429b));
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(application);
            this.applicationProvider = m44621a;
            this.providesImageLoaderProvider = V51.m80429b(FinancialConnectionsSheetNativeModule_ProvidesImageLoaderFactory.create(financialConnectionsSheetNativeModule, m44621a));
            this.nativeAuthFlowCoordinatorProvider = V51.m80429b(NativeAuthFlowCoordinator_Factory.create());
            Y94<CoroutineContext> m80429b2 = V51.m80429b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            this.provideWorkContextProvider = m80429b2;
            this.provideStripeNetworkClientProvider = V51.m80429b(C18650xe2bf8364.create(m80429b2, this.provideLoggerProvider));
            Y94<AbstractC38706bi2> m80429b3 = V51.m80429b(C18655x886d97d2.create());
            this.providesJson$financial_connections_releaseProvider = m80429b3;
            this.financialConnectionsRequestExecutorProvider = FinancialConnectionsRequestExecutor_Factory.create(this.provideStripeNetworkClientProvider, m80429b3);
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(configuration);
            this.configurationProvider = m44621a2;
            this.providesPublishableKeyProvider = V51.m80429b(C18640xe20d86b2.create(m44621a2));
            Y94<String> m80429b4 = V51.m80429b(C18641xdfed4cb1.create(this.configurationProvider));
            this.providesStripeAccountIdProvider = m80429b4;
            this.providesApiOptions$financial_connections_releaseProvider = V51.m80429b(C18653xfb8744d6.create(this.providesPublishableKeyProvider, m80429b4));
            Y94<ApiRequest.Factory> m80429b5 = V51.m80429b(C18654x4bd4d9c2.create());
            this.providesApiRequestFactoryProvider = m80429b5;
            FinancialConnectionsRepositoryImpl_Factory create = FinancialConnectionsRepositoryImpl_Factory.create(this.financialConnectionsRequestExecutorProvider, this.providesApiOptions$financial_connections_releaseProvider, m80429b5);
            this.financialConnectionsRepositoryImplProvider = create;
            this.provideConnectionsRepositoryProvider = V51.m80429b(C18648xf9c8e051.create(create));
            this.provideLocaleProvider = V51.m80429b(CoreCommonModule_ProvideLocaleFactory.create(coreCommonModule));
            InterfaceC48812sj1 m44620b = C39546d52.m44620b(synchronizeSessionResponse);
            this.initialSyncResponseProvider = m44620b;
            this.providesFinancialConnectionsManifestRepositoryProvider = V51.m80429b(C18645x1c42b46a.create(financialConnectionsSheetNativeModule, this.financialConnectionsRequestExecutorProvider, this.providesApiRequestFactoryProvider, this.providesApiOptions$financial_connections_releaseProvider, this.provideLocaleProvider, this.provideLoggerProvider, m44620b));
            Y94<String> m80429b6 = V51.m80429b(C18638x7ea6f701.create(this.applicationProvider));
            this.providesApplicationIdProvider = m80429b6;
            GetManifest_Factory create2 = GetManifest_Factory.create(this.providesFinancialConnectionsManifestRepositoryProvider, this.configurationProvider, m80429b6);
            this.getManifestProvider = create2;
            this.providesAnalyticsTrackerProvider = V51.m80429b(C18652x1619f8b.create(this.applicationProvider, this.provideLoggerProvider, create2, this.provideLocaleProvider, this.configurationProvider, this.provideStripeNetworkClientProvider));
            this.providesFinancialConnectionsInstitutionsRepositoryProvider = V51.m80429b(C18644xc967f5de.create(financialConnectionsSheetNativeModule, this.financialConnectionsRequestExecutorProvider, this.providesApiRequestFactoryProvider, this.providesApiOptions$financial_connections_releaseProvider));
            this.providesFinancialConnectionsAccountsRepositoryProvider = V51.m80429b(C18643xc3c26b93.create(financialConnectionsSheetNativeModule, this.financialConnectionsRequestExecutorProvider, this.providesApiOptions$financial_connections_releaseProvider, this.providesApiRequestFactoryProvider, this.provideLoggerProvider));
        }

        private FinancialConnectionsSheetNativeActivity injectFinancialConnectionsSheetNativeActivity(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity) {
            FinancialConnectionsSheetNativeActivity_MembersInjector.injectNavigationManager(financialConnectionsSheetNativeActivity, this.providesNavigationManagerProvider.get());
            FinancialConnectionsSheetNativeActivity_MembersInjector.injectLogger(financialConnectionsSheetNativeActivity, this.provideLoggerProvider.get());
            FinancialConnectionsSheetNativeActivity_MembersInjector.injectImageLoader(financialConnectionsSheetNativeActivity, this.providesImageLoaderProvider.get());
            return financialConnectionsSheetNativeActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public UriUtils uriUtils() {
            return new UriUtils(this.provideLoggerProvider.get());
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent
        public AccountPickerSubcomponent.Builder getAccountPickerBuilder() {
            return new AccountPickerSubcomponentBuilder(this.financialConnectionsSheetNativeComponentImpl);
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent
        public AttachPaymentSubcomponent.Builder getAttachPaymentSubcomponent() {
            return new AttachPaymentSubcomponentBuilder(this.financialConnectionsSheetNativeComponentImpl);
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent
        public ConsentSubcomponent.Builder getConsentBuilder() {
            return new ConsentSubcomponentBuilder(this.financialConnectionsSheetNativeComponentImpl);
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent
        public InstitutionPickerSubcomponent.Builder getInstitutionPickerBuilder() {
            return new InstitutionPickerSubcomponentBuilder(this.financialConnectionsSheetNativeComponentImpl);
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent
        public ManualEntrySubcomponent.Builder getManualEntryBuilder() {
            return new ManualEntrySubcomponentBuilder(this.financialConnectionsSheetNativeComponentImpl);
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent
        public ManualEntrySuccessSubcomponent.Builder getManualEntrySuccessBuilder() {
            return new ManualEntrySuccessSubcomponentBuilder(this.financialConnectionsSheetNativeComponentImpl);
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent
        public PartnerAuthSubcomponent.Builder getPartnerAuthSubcomponent() {
            return new PartnerAuthSubcomponentBuilder(this.financialConnectionsSheetNativeComponentImpl);
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent
        public ResetSubcomponent.Builder getResetSubcomponent() {
            return new ResetSubcomponentBuilder(this.financialConnectionsSheetNativeComponentImpl);
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent
        public SuccessSubcomponent.Builder getSuccessSubcomponent() {
            return new SuccessSubcomponentBuilder(this.financialConnectionsSheetNativeComponentImpl);
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent
        public FinancialConnectionsSheetNativeViewModel getViewModel() {
            return new FinancialConnectionsSheetNativeViewModel(this, this.nativeAuthFlowCoordinatorProvider.get(), uriUtils(), completeFinancialConnectionsSession(), this.providesAnalyticsTrackerProvider.get(), this.provideLoggerProvider.get(), this.providesApplicationIdProvider.get(), this.initialState);
        }

        @Override // com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent
        public void inject(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity) {
            injectFinancialConnectionsSheetNativeActivity(financialConnectionsSheetNativeActivity);
        }

        private FinancialConnectionsSheetNativeComponentImpl(FinancialConnectionsSheetNativeModule financialConnectionsSheetNativeModule, CoreCommonModule coreCommonModule, CoroutineContextModule coroutineContextModule, SynchronizeSessionResponse synchronizeSessionResponse, Application application, FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState, FinancialConnectionsSheet.Configuration configuration) {
            this.financialConnectionsSheetNativeComponentImpl = this;
            this.configuration = configuration;
            this.initialState = financialConnectionsSheetNativeState;
            initialize(financialConnectionsSheetNativeModule, coreCommonModule, coroutineContextModule, synchronizeSessionResponse, application, financialConnectionsSheetNativeState, configuration);
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$InstitutionPickerSubcomponentBuilder */
    /* loaded from: classes7.dex */
    public static final class InstitutionPickerSubcomponentBuilder implements InstitutionPickerSubcomponent.Builder {
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private InstitutionPickerState initialState;

        @Override // com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerSubcomponent.Builder
        public InstitutionPickerSubcomponent build() {
            C51679xZ3.m5006a(this.initialState, InstitutionPickerState.class);
            return new InstitutionPickerSubcomponentImpl(this.financialConnectionsSheetNativeComponentImpl, this.initialState);
        }

        private InstitutionPickerSubcomponentBuilder(FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl) {
            this.financialConnectionsSheetNativeComponentImpl = financialConnectionsSheetNativeComponentImpl;
        }

        @Override // com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerSubcomponent.Builder
        public InstitutionPickerSubcomponentBuilder initialState(InstitutionPickerState institutionPickerState) {
            this.initialState = (InstitutionPickerState) C51679xZ3.m5005b(institutionPickerState);
            return this;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$InstitutionPickerSubcomponentImpl */
    /* loaded from: classes7.dex */
    public static final class InstitutionPickerSubcomponentImpl implements InstitutionPickerSubcomponent {
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private final InstitutionPickerState initialState;
        private final InstitutionPickerSubcomponentImpl institutionPickerSubcomponentImpl;

        private FeaturedInstitutions featuredInstitutions() {
            return new FeaturedInstitutions((FinancialConnectionsInstitutionsRepository) this.financialConnectionsSheetNativeComponentImpl.providesFinancialConnectionsInstitutionsRepositoryProvider.get());
        }

        private SearchInstitutions searchInstitutions() {
            return new SearchInstitutions((FinancialConnectionsInstitutionsRepository) this.financialConnectionsSheetNativeComponentImpl.providesFinancialConnectionsInstitutionsRepositoryProvider.get());
        }

        private UpdateLocalManifest updateLocalManifest() {
            return new UpdateLocalManifest((FinancialConnectionsManifestRepository) this.financialConnectionsSheetNativeComponentImpl.providesFinancialConnectionsManifestRepositoryProvider.get());
        }

        @Override // com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerSubcomponent
        public InstitutionPickerViewModel getViewModel() {
            return new InstitutionPickerViewModel(this.financialConnectionsSheetNativeComponentImpl.configuration, searchInstitutions(), featuredInstitutions(), this.financialConnectionsSheetNativeComponentImpl.getManifest(), (FinancialConnectionsAnalyticsTracker) this.financialConnectionsSheetNativeComponentImpl.providesAnalyticsTrackerProvider.get(), (NavigationManager) this.financialConnectionsSheetNativeComponentImpl.providesNavigationManagerProvider.get(), updateLocalManifest(), (Logger) this.financialConnectionsSheetNativeComponentImpl.provideLoggerProvider.get(), this.initialState);
        }

        private InstitutionPickerSubcomponentImpl(FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl, InstitutionPickerState institutionPickerState) {
            this.institutionPickerSubcomponentImpl = this;
            this.financialConnectionsSheetNativeComponentImpl = financialConnectionsSheetNativeComponentImpl;
            this.initialState = institutionPickerState;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySubcomponentBuilder */
    /* loaded from: classes7.dex */
    public static final class ManualEntrySubcomponentBuilder implements ManualEntrySubcomponent.Builder {
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private ManualEntryState initialState;

        @Override // com.stripe.android.financialconnections.features.manualentry.ManualEntrySubcomponent.Builder
        public ManualEntrySubcomponent build() {
            C51679xZ3.m5006a(this.initialState, ManualEntryState.class);
            return new ManualEntrySubcomponentImpl(this.financialConnectionsSheetNativeComponentImpl, this.initialState);
        }

        private ManualEntrySubcomponentBuilder(FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl) {
            this.financialConnectionsSheetNativeComponentImpl = financialConnectionsSheetNativeComponentImpl;
        }

        @Override // com.stripe.android.financialconnections.features.manualentry.ManualEntrySubcomponent.Builder
        public ManualEntrySubcomponentBuilder initialState(ManualEntryState manualEntryState) {
            this.initialState = (ManualEntryState) C51679xZ3.m5005b(manualEntryState);
            return this;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySubcomponentImpl */
    /* loaded from: classes7.dex */
    public static final class ManualEntrySubcomponentImpl implements ManualEntrySubcomponent {
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private final ManualEntryState initialState;
        private final ManualEntrySubcomponentImpl manualEntrySubcomponentImpl;

        private GoNext goNext() {
            return new GoNext((NavigationManager) this.financialConnectionsSheetNativeComponentImpl.providesNavigationManagerProvider.get(), (Logger) this.financialConnectionsSheetNativeComponentImpl.provideLoggerProvider.get());
        }

        private PollAttachPaymentAccount pollAttachPaymentAccount() {
            return new PollAttachPaymentAccount((FinancialConnectionsAccountsRepository) this.financialConnectionsSheetNativeComponentImpl.providesFinancialConnectionsAccountsRepositoryProvider.get(), this.financialConnectionsSheetNativeComponentImpl.configuration);
        }

        @Override // com.stripe.android.financialconnections.features.manualentry.ManualEntrySubcomponent
        public ManualEntryViewModel getViewModel() {
            return new ManualEntryViewModel(this.initialState, (NativeAuthFlowCoordinator) this.financialConnectionsSheetNativeComponentImpl.nativeAuthFlowCoordinatorProvider.get(), pollAttachPaymentAccount(), (FinancialConnectionsAnalyticsTracker) this.financialConnectionsSheetNativeComponentImpl.providesAnalyticsTrackerProvider.get(), this.financialConnectionsSheetNativeComponentImpl.getManifest(), goNext(), (Logger) this.financialConnectionsSheetNativeComponentImpl.provideLoggerProvider.get());
        }

        private ManualEntrySubcomponentImpl(FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl, ManualEntryState manualEntryState) {
            this.manualEntrySubcomponentImpl = this;
            this.financialConnectionsSheetNativeComponentImpl = financialConnectionsSheetNativeComponentImpl;
            this.initialState = manualEntryState;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySuccessSubcomponentBuilder */
    /* loaded from: classes7.dex */
    public static final class ManualEntrySuccessSubcomponentBuilder implements ManualEntrySuccessSubcomponent.Builder {
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private ManualEntrySuccessState initialState;

        @Override // com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessSubcomponent.Builder
        public ManualEntrySuccessSubcomponent build() {
            C51679xZ3.m5006a(this.initialState, ManualEntrySuccessState.class);
            return new ManualEntrySuccessSubcomponentImpl(this.financialConnectionsSheetNativeComponentImpl, this.initialState);
        }

        private ManualEntrySuccessSubcomponentBuilder(FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl) {
            this.financialConnectionsSheetNativeComponentImpl = financialConnectionsSheetNativeComponentImpl;
        }

        @Override // com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessSubcomponent.Builder
        public ManualEntrySuccessSubcomponentBuilder initialState(ManualEntrySuccessState manualEntrySuccessState) {
            this.initialState = (ManualEntrySuccessState) C51679xZ3.m5005b(manualEntrySuccessState);
            return this;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySuccessSubcomponentImpl */
    /* loaded from: classes7.dex */
    public static final class ManualEntrySuccessSubcomponentImpl implements ManualEntrySuccessSubcomponent {
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private final ManualEntrySuccessState initialState;
        private final ManualEntrySuccessSubcomponentImpl manualEntrySuccessSubcomponentImpl;

        @Override // com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessSubcomponent
        public ManualEntrySuccessViewModel getViewModel() {
            return new ManualEntrySuccessViewModel(this.initialState, this.financialConnectionsSheetNativeComponentImpl.completeFinancialConnectionsSession(), (FinancialConnectionsAnalyticsTracker) this.financialConnectionsSheetNativeComponentImpl.providesAnalyticsTrackerProvider.get(), (NativeAuthFlowCoordinator) this.financialConnectionsSheetNativeComponentImpl.nativeAuthFlowCoordinatorProvider.get(), (Logger) this.financialConnectionsSheetNativeComponentImpl.provideLoggerProvider.get());
        }

        private ManualEntrySuccessSubcomponentImpl(FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl, ManualEntrySuccessState manualEntrySuccessState) {
            this.manualEntrySuccessSubcomponentImpl = this;
            this.financialConnectionsSheetNativeComponentImpl = financialConnectionsSheetNativeComponentImpl;
            this.initialState = manualEntrySuccessState;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$PartnerAuthSubcomponentBuilder */
    /* loaded from: classes7.dex */
    public static final class PartnerAuthSubcomponentBuilder implements PartnerAuthSubcomponent.Builder {
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private PartnerAuthState initialState;

        @Override // com.stripe.android.financialconnections.features.partnerauth.PartnerAuthSubcomponent.Builder
        public PartnerAuthSubcomponent build() {
            C51679xZ3.m5006a(this.initialState, PartnerAuthState.class);
            return new PartnerAuthSubcomponentImpl(this.financialConnectionsSheetNativeComponentImpl, this.initialState);
        }

        private PartnerAuthSubcomponentBuilder(FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl) {
            this.financialConnectionsSheetNativeComponentImpl = financialConnectionsSheetNativeComponentImpl;
        }

        @Override // com.stripe.android.financialconnections.features.partnerauth.PartnerAuthSubcomponent.Builder
        public PartnerAuthSubcomponentBuilder initialState(PartnerAuthState partnerAuthState) {
            this.initialState = (PartnerAuthState) C51679xZ3.m5005b(partnerAuthState);
            return this;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$PartnerAuthSubcomponentImpl */
    /* loaded from: classes7.dex */
    public static final class PartnerAuthSubcomponentImpl implements PartnerAuthSubcomponent {
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private final PartnerAuthState initialState;
        private final PartnerAuthSubcomponentImpl partnerAuthSubcomponentImpl;

        private CancelAuthorizationSession cancelAuthorizationSession() {
            return new CancelAuthorizationSession((NativeAuthFlowCoordinator) this.financialConnectionsSheetNativeComponentImpl.nativeAuthFlowCoordinatorProvider.get(), (FinancialConnectionsManifestRepository) this.financialConnectionsSheetNativeComponentImpl.providesFinancialConnectionsManifestRepositoryProvider.get(), this.financialConnectionsSheetNativeComponentImpl.configuration);
        }

        private CompleteAuthorizationSession completeAuthorizationSession() {
            return new CompleteAuthorizationSession((NativeAuthFlowCoordinator) this.financialConnectionsSheetNativeComponentImpl.nativeAuthFlowCoordinatorProvider.get(), (FinancialConnectionsManifestRepository) this.financialConnectionsSheetNativeComponentImpl.providesFinancialConnectionsManifestRepositoryProvider.get(), this.financialConnectionsSheetNativeComponentImpl.configuration);
        }

        private GoNext goNext() {
            return new GoNext((NavigationManager) this.financialConnectionsSheetNativeComponentImpl.providesNavigationManagerProvider.get(), (Logger) this.financialConnectionsSheetNativeComponentImpl.provideLoggerProvider.get());
        }

        private PollAuthorizationSessionOAuthResults pollAuthorizationSessionOAuthResults() {
            return new PollAuthorizationSessionOAuthResults((FinancialConnectionsRepository) this.financialConnectionsSheetNativeComponentImpl.provideConnectionsRepositoryProvider.get(), this.financialConnectionsSheetNativeComponentImpl.configuration);
        }

        private PostAuthSessionEvent postAuthSessionEvent() {
            return new PostAuthSessionEvent((FinancialConnectionsManifestRepository) this.financialConnectionsSheetNativeComponentImpl.providesFinancialConnectionsManifestRepositoryProvider.get(), (Logger) this.financialConnectionsSheetNativeComponentImpl.provideLoggerProvider.get(), this.financialConnectionsSheetNativeComponentImpl.configuration);
        }

        private PostAuthorizationSession postAuthorizationSession() {
            return new PostAuthorizationSession((FinancialConnectionsManifestRepository) this.financialConnectionsSheetNativeComponentImpl.providesFinancialConnectionsManifestRepositoryProvider.get(), this.financialConnectionsSheetNativeComponentImpl.configuration, (String) this.financialConnectionsSheetNativeComponentImpl.providesApplicationIdProvider.get());
        }

        @Override // com.stripe.android.financialconnections.features.partnerauth.PartnerAuthSubcomponent
        public PartnerAuthViewModel getViewModel() {
            return new PartnerAuthViewModel(completeAuthorizationSession(), postAuthorizationSession(), cancelAuthorizationSession(), (FinancialConnectionsAnalyticsTracker) this.financialConnectionsSheetNativeComponentImpl.providesAnalyticsTrackerProvider.get(), (String) this.financialConnectionsSheetNativeComponentImpl.providesApplicationIdProvider.get(), this.financialConnectionsSheetNativeComponentImpl.uriUtils(), postAuthSessionEvent(), this.financialConnectionsSheetNativeComponentImpl.getManifest(), goNext(), (NavigationManager) this.financialConnectionsSheetNativeComponentImpl.providesNavigationManagerProvider.get(), pollAuthorizationSessionOAuthResults(), (Logger) this.financialConnectionsSheetNativeComponentImpl.provideLoggerProvider.get(), this.initialState);
        }

        private PartnerAuthSubcomponentImpl(FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl, PartnerAuthState partnerAuthState) {
            this.partnerAuthSubcomponentImpl = this;
            this.financialConnectionsSheetNativeComponentImpl = financialConnectionsSheetNativeComponentImpl;
            this.initialState = partnerAuthState;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$ResetSubcomponentBuilder */
    /* loaded from: classes7.dex */
    public static final class ResetSubcomponentBuilder implements ResetSubcomponent.Builder {
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private ResetState initialState;

        @Override // com.stripe.android.financialconnections.features.reset.ResetSubcomponent.Builder
        public ResetSubcomponent build() {
            C51679xZ3.m5006a(this.initialState, ResetState.class);
            return new ResetSubcomponentImpl(this.financialConnectionsSheetNativeComponentImpl, this.initialState);
        }

        private ResetSubcomponentBuilder(FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl) {
            this.financialConnectionsSheetNativeComponentImpl = financialConnectionsSheetNativeComponentImpl;
        }

        @Override // com.stripe.android.financialconnections.features.reset.ResetSubcomponent.Builder
        public ResetSubcomponentBuilder initialState(ResetState resetState) {
            this.initialState = (ResetState) C51679xZ3.m5005b(resetState);
            return this;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$ResetSubcomponentImpl */
    /* loaded from: classes7.dex */
    public static final class ResetSubcomponentImpl implements ResetSubcomponent {
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private final ResetState initialState;
        private final ResetSubcomponentImpl resetSubcomponentImpl;

        private GoNext goNext() {
            return new GoNext((NavigationManager) this.financialConnectionsSheetNativeComponentImpl.providesNavigationManagerProvider.get(), (Logger) this.financialConnectionsSheetNativeComponentImpl.provideLoggerProvider.get());
        }

        private LinkMoreAccounts linkMoreAccounts() {
            return new LinkMoreAccounts((FinancialConnectionsManifestRepository) this.financialConnectionsSheetNativeComponentImpl.providesFinancialConnectionsManifestRepositoryProvider.get(), this.financialConnectionsSheetNativeComponentImpl.configuration);
        }

        @Override // com.stripe.android.financialconnections.features.reset.ResetSubcomponent
        public ResetViewModel getViewModel() {
            return new ResetViewModel(this.initialState, linkMoreAccounts(), (NativeAuthFlowCoordinator) this.financialConnectionsSheetNativeComponentImpl.nativeAuthFlowCoordinatorProvider.get(), (FinancialConnectionsAnalyticsTracker) this.financialConnectionsSheetNativeComponentImpl.providesAnalyticsTrackerProvider.get(), goNext(), (Logger) this.financialConnectionsSheetNativeComponentImpl.provideLoggerProvider.get());
        }

        private ResetSubcomponentImpl(FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl, ResetState resetState) {
            this.resetSubcomponentImpl = this;
            this.financialConnectionsSheetNativeComponentImpl = financialConnectionsSheetNativeComponentImpl;
            this.initialState = resetState;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$SuccessSubcomponentBuilder */
    /* loaded from: classes7.dex */
    public static final class SuccessSubcomponentBuilder implements SuccessSubcomponent.Builder {
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private SuccessState initialState;

        @Override // com.stripe.android.financialconnections.features.success.SuccessSubcomponent.Builder
        public SuccessSubcomponent build() {
            C51679xZ3.m5006a(this.initialState, SuccessState.class);
            return new SuccessSubcomponentImpl(this.financialConnectionsSheetNativeComponentImpl, this.initialState);
        }

        private SuccessSubcomponentBuilder(FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl) {
            this.financialConnectionsSheetNativeComponentImpl = financialConnectionsSheetNativeComponentImpl;
        }

        @Override // com.stripe.android.financialconnections.features.success.SuccessSubcomponent.Builder
        public SuccessSubcomponentBuilder initialState(SuccessState successState) {
            this.initialState = (SuccessState) C51679xZ3.m5005b(successState);
            return this;
        }
    }

    /* renamed from: com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$SuccessSubcomponentImpl */
    /* loaded from: classes7.dex */
    public static final class SuccessSubcomponentImpl implements SuccessSubcomponent {
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private final SuccessState initialState;
        private final SuccessSubcomponentImpl successSubcomponentImpl;

        private GetAuthorizationSessionAccounts getAuthorizationSessionAccounts() {
            return new GetAuthorizationSessionAccounts((FinancialConnectionsAccountsRepository) this.financialConnectionsSheetNativeComponentImpl.providesFinancialConnectionsAccountsRepositoryProvider.get(), this.financialConnectionsSheetNativeComponentImpl.configuration);
        }

        @Override // com.stripe.android.financialconnections.features.success.SuccessSubcomponent
        public SuccessViewModel getViewModel() {
            return new SuccessViewModel(this.initialState, getAuthorizationSessionAccounts(), this.financialConnectionsSheetNativeComponentImpl.getManifest(), (FinancialConnectionsAnalyticsTracker) this.financialConnectionsSheetNativeComponentImpl.providesAnalyticsTrackerProvider.get(), (Logger) this.financialConnectionsSheetNativeComponentImpl.provideLoggerProvider.get(), (NavigationManager) this.financialConnectionsSheetNativeComponentImpl.providesNavigationManagerProvider.get(), this.financialConnectionsSheetNativeComponentImpl.completeFinancialConnectionsSession(), (NativeAuthFlowCoordinator) this.financialConnectionsSheetNativeComponentImpl.nativeAuthFlowCoordinatorProvider.get());
        }

        private SuccessSubcomponentImpl(FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl, SuccessState successState) {
            this.successSubcomponentImpl = this;
            this.financialConnectionsSheetNativeComponentImpl = financialConnectionsSheetNativeComponentImpl;
            this.initialState = successState;
        }
    }

    private DaggerFinancialConnectionsSheetNativeComponent() {
    }

    public static FinancialConnectionsSheetNativeComponent.Builder builder() {
        return new Builder();
    }
}
