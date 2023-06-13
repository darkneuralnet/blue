package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.res.Resources;
import androidx.lifecycle.C11747p;
import com.stripe.android.DefaultIntentConfirmationInterceptor;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideUIContextFactory;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher_Factory;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory_Impl;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.LinkPaymentLauncher_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.p049ui.core.forms.resources.injection.ResourceRepositoryModule_ProvideResourcesFactory;
import com.stripe.android.p049ui.core.forms.resources.injection.ResourceRepositoryModule_ProvidesLpmRepositoryFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory_Impl;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncher_Factory;
import com.stripe.android.paymentsheet.LinkHandler;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.PaymentSheetViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter_Factory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.EventTimeProvider_Factory;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.forms.FormViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent;
import com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent;
import com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent;
import com.stripe.android.paymentsheet.model.StripeIntentValidator;
import com.stripe.android.paymentsheet.model.StripeIntentValidator_Factory;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository_Factory;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository_Api_Factory;
import com.stripe.android.paymentsheet.state.DefaultLinkAccountStatusProvider;
import com.stripe.android.paymentsheet.state.DefaultLinkAccountStatusProvider_Factory;
import com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader;
import com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader_Factory;
import com.stripe.android.paymentsheet.state.PaymentSheetLoader;
import com.stripe.android.uicore.address.AddressRepository;
import com.stripe.android.uicore.address.AddressRepository_Factory;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* loaded from: classes7.dex */
public final class DaggerPaymentSheetLauncherComponent {

    /* loaded from: classes7.dex */
    public static final class Builder implements PaymentSheetLauncherComponent.Builder {
        private Application application;
        private String injectorKey;

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent.Builder
        public PaymentSheetLauncherComponent build() {
            C51679xZ3.m5006a(this.application, Application.class);
            C51679xZ3.m5006a(this.injectorKey, String.class);
            return new PaymentSheetLauncherComponentImpl(new GooglePayLauncherModule(), new CoroutineContextModule(), new CoreCommonModule(), this.application, this.injectorKey);
        }

        private Builder() {
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) C51679xZ3.m5005b(application);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent.Builder
        public Builder injectorKey(String str) {
            this.injectorKey = (String) C51679xZ3.m5005b(str);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class FormViewModelSubcomponentBuilder implements FormViewModelSubcomponent.Builder {
        private FormArguments formArguments;
        private final PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl;
        private InterfaceC32730Eu1<Boolean> showCheckboxFlow;

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.Builder
        public FormViewModelSubcomponent build() {
            C51679xZ3.m5006a(this.formArguments, FormArguments.class);
            C51679xZ3.m5006a(this.showCheckboxFlow, InterfaceC32730Eu1.class);
            return new FormViewModelSubcomponentImpl(this.paymentSheetLauncherComponentImpl, this.formArguments, this.showCheckboxFlow);
        }

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.Builder
        public /* bridge */ /* synthetic */ FormViewModelSubcomponent.Builder showCheckboxFlow(InterfaceC32730Eu1 interfaceC32730Eu1) {
            return showCheckboxFlow((InterfaceC32730Eu1<Boolean>) interfaceC32730Eu1);
        }

        private FormViewModelSubcomponentBuilder(PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl) {
            this.paymentSheetLauncherComponentImpl = paymentSheetLauncherComponentImpl;
        }

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.Builder
        public FormViewModelSubcomponentBuilder formArguments(FormArguments formArguments) {
            this.formArguments = (FormArguments) C51679xZ3.m5005b(formArguments);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.Builder
        public FormViewModelSubcomponentBuilder showCheckboxFlow(InterfaceC32730Eu1<Boolean> interfaceC32730Eu1) {
            this.showCheckboxFlow = (InterfaceC32730Eu1) C51679xZ3.m5005b(interfaceC32730Eu1);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class FormViewModelSubcomponentImpl implements FormViewModelSubcomponent {
        private final FormArguments formArguments;
        private final FormViewModelSubcomponentImpl formViewModelSubcomponentImpl;
        private final PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl;
        private final InterfaceC32730Eu1<Boolean> showCheckboxFlow;

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent
        public FormViewModel getViewModel() {
            return new FormViewModel(this.paymentSheetLauncherComponentImpl.application, this.formArguments, (LpmRepository) this.paymentSheetLauncherComponentImpl.providesLpmRepositoryProvider.get(), (AddressRepository) this.paymentSheetLauncherComponentImpl.addressRepositoryProvider.get(), this.showCheckboxFlow);
        }

        private FormViewModelSubcomponentImpl(PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl, FormArguments formArguments, InterfaceC32730Eu1<Boolean> interfaceC32730Eu1) {
            this.formViewModelSubcomponentImpl = this;
            this.paymentSheetLauncherComponentImpl = paymentSheetLauncherComponentImpl;
            this.formArguments = formArguments;
            this.showCheckboxFlow = interfaceC32730Eu1;
        }
    }

    /* loaded from: classes7.dex */
    public static final class PaymentSheetLauncherComponentImpl extends PaymentSheetLauncherComponent {
        private Y94<AddressRepository> addressRepositoryProvider;
        private Y94<ElementsSessionRepository.Api> apiProvider;
        private final Application application;
        private Y94<Application> applicationProvider;
        private Y94<CustomerApiRepository> customerApiRepositoryProvider;
        private Y94<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Y94<DefaultEventReporter> defaultEventReporterProvider;
        private Y94<DefaultLinkAccountStatusProvider> defaultLinkAccountStatusProvider;
        private Y94<DefaultPaymentSheetLoader> defaultPaymentSheetLoaderProvider;
        private Y94<FormViewModelSubcomponent.Builder> formViewModelSubcomponentBuilderProvider;
        private Y94<LinkPaymentLauncher> linkPaymentLauncherProvider;
        private Y94<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private final PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl;
        private Y94<PaymentSheetViewModelSubcomponent.Builder> paymentSheetViewModelSubcomponentBuilderProvider;
        private Y94<String> provideAppNameProvider;
        private Y94<Boolean> provideEnabledLoggingProvider;
        private Y94<EventReporter.Mode> provideEventReporterModeProvider;
        private Y94<Function1<GooglePayEnvironment, GooglePayRepository>> provideGooglePayRepositoryFactoryProvider;
        private Y94<Logger> provideLoggerProvider;
        private Y94<PaymentConfiguration> providePaymentConfigurationProvider;
        private Y94<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> providePrefsRepositoryFactoryProvider;
        private Y94<Set<String>> provideProductUsageTokensProvider;
        private Y94<Function0<String>> providePublishableKeyProvider;
        private Y94<Resources> provideResourcesProvider;
        private Y94<Function0<String>> provideStripeAccountIdProvider;
        private Y94<CoroutineContext> provideUIContextProvider;
        private Y94<CoroutineContext> provideWorkContextProvider;
        private Y94<LpmRepository> providesLpmRepositoryProvider;
        private Y94<StripeApiRepository> stripeApiRepositoryProvider;

        /* JADX INFO: Access modifiers changed from: private */
        public ElementsSessionRepository.Api api() {
            return new ElementsSessionRepository.Api(stripeApiRepository(), this.providePaymentConfigurationProvider, this.provideWorkContextProvider.get());
        }

        private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.provideWorkContextProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor() {
            return new DefaultIntentConfirmationInterceptor(this.application, stripeApiRepository(), namedFunction0OfString(), namedFunction0OfString2());
        }

        private void initialize(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Application application, String str) {
            this.paymentSheetViewModelSubcomponentBuilderProvider = new Y94<PaymentSheetViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerPaymentSheetLauncherComponent.PaymentSheetLauncherComponentImpl.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.Y94
                public PaymentSheetViewModelSubcomponent.Builder get() {
                    return new PaymentSheetViewModelSubcomponentBuilder(PaymentSheetLauncherComponentImpl.this.paymentSheetLauncherComponentImpl);
                }
            };
            this.formViewModelSubcomponentBuilderProvider = new Y94<FormViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerPaymentSheetLauncherComponent.PaymentSheetLauncherComponentImpl.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.Y94
                public FormViewModelSubcomponent.Builder get() {
                    return new FormViewModelSubcomponentBuilder(PaymentSheetLauncherComponentImpl.this.paymentSheetLauncherComponentImpl);
                }
            };
            this.provideEventReporterModeProvider = V51.m80429b(C19230x57ef1980.create());
            Y94<Boolean> m80429b = V51.m80429b(PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory.create());
            this.provideEnabledLoggingProvider = m80429b;
            this.provideLoggerProvider = V51.m80429b(CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, m80429b));
            Y94<CoroutineContext> m80429b2 = V51.m80429b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            this.provideWorkContextProvider = m80429b2;
            this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, m80429b2);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(application);
            this.applicationProvider = m44621a;
            C19228xcc094b3b create = C19228xcc094b3b.create(m44621a);
            this.providePaymentConfigurationProvider = create;
            this.providePublishableKeyProvider = PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.create(create);
            Y94<Set<String>> m80429b3 = V51.m80429b(C19231x13cda38a.create());
            this.provideProductUsageTokensProvider = m80429b3;
            PaymentAnalyticsRequestFactory_Factory create2 = PaymentAnalyticsRequestFactory_Factory.create(this.applicationProvider, this.providePublishableKeyProvider, m80429b3);
            this.paymentAnalyticsRequestFactoryProvider = create2;
            this.defaultEventReporterProvider = V51.m80429b(DefaultEventReporter_Factory.create(this.provideEventReporterModeProvider, this.defaultAnalyticsRequestExecutorProvider, create2, EventTimeProvider_Factory.create(), this.provideWorkContextProvider));
            this.provideAppNameProvider = V51.m80429b(PaymentSheetCommonModule_Companion_ProvideAppNameFactory.create(this.applicationProvider));
            this.providePrefsRepositoryFactoryProvider = V51.m80429b(C19229x55c689fb.create(this.applicationProvider, this.provideWorkContextProvider));
            this.provideGooglePayRepositoryFactoryProvider = V51.m80429b(GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory.create(googlePayLauncherModule, this.applicationProvider, this.provideLoggerProvider));
            StripeApiRepository_Factory create3 = StripeApiRepository_Factory.create(this.applicationProvider, this.providePublishableKeyProvider, this.provideWorkContextProvider, this.provideProductUsageTokensProvider, this.paymentAnalyticsRequestFactoryProvider, this.defaultAnalyticsRequestExecutorProvider, this.provideLoggerProvider);
            this.stripeApiRepositoryProvider = create3;
            this.apiProvider = ElementsSessionRepository_Api_Factory.create(create3, this.providePaymentConfigurationProvider, this.provideWorkContextProvider);
            this.customerApiRepositoryProvider = V51.m80429b(CustomerApiRepository_Factory.create(this.stripeApiRepositoryProvider, this.providePaymentConfigurationProvider, this.provideLoggerProvider, this.provideWorkContextProvider, this.provideProductUsageTokensProvider));
            Y94<Resources> m80429b4 = V51.m80429b(ResourceRepositoryModule_ProvideResourcesFactory.create(this.applicationProvider));
            this.provideResourcesProvider = m80429b4;
            this.providesLpmRepositoryProvider = V51.m80429b(ResourceRepositoryModule_ProvidesLpmRepositoryFactory.create(m80429b4));
            this.provideStripeAccountIdProvider = PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory.create(this.providePaymentConfigurationProvider);
            this.provideUIContextProvider = V51.m80429b(CoroutineContextModule_ProvideUIContextFactory.create(coroutineContextModule));
            Y94<AddressRepository> m80429b5 = V51.m80429b(AddressRepository_Factory.create(this.provideResourcesProvider, this.provideWorkContextProvider));
            this.addressRepositoryProvider = m80429b5;
            Y94<LinkPaymentLauncher> m80429b6 = V51.m80429b(LinkPaymentLauncher_Factory.create(this.applicationProvider, this.provideProductUsageTokensProvider, this.providePublishableKeyProvider, this.provideStripeAccountIdProvider, this.provideEnabledLoggingProvider, this.provideWorkContextProvider, this.provideUIContextProvider, this.paymentAnalyticsRequestFactoryProvider, this.defaultAnalyticsRequestExecutorProvider, this.stripeApiRepositoryProvider, m80429b5));
            this.linkPaymentLauncherProvider = m80429b6;
            this.defaultLinkAccountStatusProvider = DefaultLinkAccountStatusProvider_Factory.create(m80429b6);
            this.defaultPaymentSheetLoaderProvider = V51.m80429b(DefaultPaymentSheetLoader_Factory.create(this.provideAppNameProvider, this.providePrefsRepositoryFactoryProvider, this.provideGooglePayRepositoryFactoryProvider, this.apiProvider, StripeIntentValidator_Factory.create(), this.customerApiRepositoryProvider, this.providesLpmRepositoryProvider, this.provideLoggerProvider, this.defaultEventReporterProvider, this.provideWorkContextProvider, this.defaultLinkAccountStatusProvider));
        }

        private PaymentSheetViewModel.Factory injectFactory(PaymentSheetViewModel.Factory factory) {
            PaymentSheetViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.paymentSheetViewModelSubcomponentBuilderProvider);
            return factory;
        }

        private FormViewModel.Factory injectFactory2(FormViewModel.Factory factory) {
            FormViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.formViewModelSubcomponentBuilderProvider);
            return factory;
        }

        private Function0<String> namedFunction0OfString() {
            return PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.providePublishableKey(this.providePaymentConfigurationProvider);
        }

        private Function0<String> namedFunction0OfString2() {
            return PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory.provideStripeAccountId(this.providePaymentConfigurationProvider);
        }

        private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(this.application, namedFunction0OfString(), this.provideProductUsageTokensProvider.get());
        }

        private StripeApiRepository stripeApiRepository() {
            return new StripeApiRepository(this.application, namedFunction0OfString(), this.provideWorkContextProvider.get(), this.provideProductUsageTokensProvider.get(), paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.get());
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent
        public void inject(PaymentSheetViewModel.Factory factory) {
            injectFactory(factory);
        }

        private PaymentSheetLauncherComponentImpl(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Application application, String str) {
            this.paymentSheetLauncherComponentImpl = this;
            this.application = application;
            initialize(googlePayLauncherModule, coroutineContextModule, coreCommonModule, application, str);
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent
        public void inject(FormViewModel.Factory factory) {
            injectFactory2(factory);
        }
    }

    /* loaded from: classes7.dex */
    public static final class PaymentSheetViewModelSubcomponentBuilder implements PaymentSheetViewModelSubcomponent.Builder {
        private final PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl;
        private PaymentSheetViewModelModule paymentSheetViewModelModule;
        private C11747p savedStateHandle;

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent.Builder
        public PaymentSheetViewModelSubcomponent build() {
            C51679xZ3.m5006a(this.paymentSheetViewModelModule, PaymentSheetViewModelModule.class);
            C51679xZ3.m5006a(this.savedStateHandle, C11747p.class);
            return new PaymentSheetViewModelSubcomponentImpl(this.paymentSheetLauncherComponentImpl, this.paymentSheetViewModelModule, this.savedStateHandle);
        }

        private PaymentSheetViewModelSubcomponentBuilder(PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl) {
            this.paymentSheetLauncherComponentImpl = paymentSheetLauncherComponentImpl;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent.Builder
        public PaymentSheetViewModelSubcomponentBuilder paymentSheetViewModelModule(PaymentSheetViewModelModule paymentSheetViewModelModule) {
            this.paymentSheetViewModelModule = (PaymentSheetViewModelModule) C51679xZ3.m5005b(paymentSheetViewModelModule);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent.Builder
        public PaymentSheetViewModelSubcomponentBuilder savedStateHandle(C11747p c11747p) {
            this.savedStateHandle = (C11747p) C51679xZ3.m5005b(c11747p);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class PaymentSheetViewModelSubcomponentImpl implements PaymentSheetViewModelSubcomponent {
        private Y94<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider;
        private GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncherProvider;
        private final PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl;
        private final PaymentSheetViewModelModule paymentSheetViewModelModule;
        private final PaymentSheetViewModelSubcomponentImpl paymentSheetViewModelSubcomponentImpl;
        private final C11747p savedStateHandle;
        private Y94<StripePaymentLauncherAssistedFactory> stripePaymentLauncherAssistedFactoryProvider;
        private StripePaymentLauncher_Factory stripePaymentLauncherProvider;

        private void initialize(PaymentSheetViewModelModule paymentSheetViewModelModule, C11747p c11747p) {
            StripePaymentLauncher_Factory create = StripePaymentLauncher_Factory.create(this.paymentSheetLauncherComponentImpl.applicationProvider, this.paymentSheetLauncherComponentImpl.provideEnabledLoggingProvider, this.paymentSheetLauncherComponentImpl.provideWorkContextProvider, this.paymentSheetLauncherComponentImpl.provideUIContextProvider, this.paymentSheetLauncherComponentImpl.stripeApiRepositoryProvider, this.paymentSheetLauncherComponentImpl.paymentAnalyticsRequestFactoryProvider, this.paymentSheetLauncherComponentImpl.provideProductUsageTokensProvider);
            this.stripePaymentLauncherProvider = create;
            this.stripePaymentLauncherAssistedFactoryProvider = StripePaymentLauncherAssistedFactory_Impl.create(create);
            GooglePayPaymentMethodLauncher_Factory create2 = GooglePayPaymentMethodLauncher_Factory.create(this.paymentSheetLauncherComponentImpl.applicationProvider, this.paymentSheetLauncherComponentImpl.provideGooglePayRepositoryFactoryProvider, this.paymentSheetLauncherComponentImpl.provideProductUsageTokensProvider, this.paymentSheetLauncherComponentImpl.providePublishableKeyProvider, this.paymentSheetLauncherComponentImpl.provideStripeAccountIdProvider, this.paymentSheetLauncherComponentImpl.provideEnabledLoggingProvider, this.paymentSheetLauncherComponentImpl.provideWorkContextProvider, this.paymentSheetLauncherComponentImpl.paymentAnalyticsRequestFactoryProvider, this.paymentSheetLauncherComponentImpl.defaultAnalyticsRequestExecutorProvider, this.paymentSheetLauncherComponentImpl.stripeApiRepositoryProvider);
            this.googlePayPaymentMethodLauncherProvider = create2;
            this.googlePayPaymentMethodLauncherFactoryProvider = GooglePayPaymentMethodLauncherFactory_Impl.create(create2);
        }

        private LinkHandler linkHandler() {
            return new LinkHandler((LinkPaymentLauncher) this.paymentSheetLauncherComponentImpl.linkPaymentLauncherProvider.get(), this.savedStateHandle);
        }

        private PrefsRepository prefsRepository() {
            return PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory.providePrefsRepository(this.paymentSheetViewModelModule, this.paymentSheetLauncherComponentImpl.application, (CoroutineContext) this.paymentSheetLauncherComponentImpl.provideWorkContextProvider.get());
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent
        public PaymentSheetViewModel getViewModel() {
            return new PaymentSheetViewModel(this.paymentSheetLauncherComponentImpl.application, PaymentSheetViewModelModule_ProvideArgsFactory.provideArgs(this.paymentSheetViewModelModule), (EventReporter) this.paymentSheetLauncherComponentImpl.defaultEventReporterProvider.get(), V51.m80430a(this.paymentSheetLauncherComponentImpl.providePaymentConfigurationProvider), this.paymentSheetLauncherComponentImpl.api(), new StripeIntentValidator(), (PaymentSheetLoader) this.paymentSheetLauncherComponentImpl.defaultPaymentSheetLoaderProvider.get(), (CustomerRepository) this.paymentSheetLauncherComponentImpl.customerApiRepositoryProvider.get(), prefsRepository(), (LpmRepository) this.paymentSheetLauncherComponentImpl.providesLpmRepositoryProvider.get(), this.stripePaymentLauncherAssistedFactoryProvider.get(), this.googlePayPaymentMethodLauncherFactoryProvider.get(), (Logger) this.paymentSheetLauncherComponentImpl.provideLoggerProvider.get(), (CoroutineContext) this.paymentSheetLauncherComponentImpl.provideWorkContextProvider.get(), this.savedStateHandle, linkHandler(), this.paymentSheetLauncherComponentImpl.defaultIntentConfirmationInterceptor());
        }

        private PaymentSheetViewModelSubcomponentImpl(PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl, PaymentSheetViewModelModule paymentSheetViewModelModule, C11747p c11747p) {
            this.paymentSheetViewModelSubcomponentImpl = this;
            this.paymentSheetLauncherComponentImpl = paymentSheetLauncherComponentImpl;
            this.paymentSheetViewModelModule = paymentSheetViewModelModule;
            this.savedStateHandle = c11747p;
            initialize(paymentSheetViewModelModule, c11747p);
        }
    }

    private DaggerPaymentSheetLauncherComponent() {
    }

    public static PaymentSheetLauncherComponent.Builder builder() {
        return new Builder();
    }
}
