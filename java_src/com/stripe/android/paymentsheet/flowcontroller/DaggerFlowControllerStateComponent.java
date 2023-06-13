package com.stripe.android.paymentsheet.flowcontroller;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.C11747p;
import com.stripe.android.DefaultIntentConfirmationInterceptor;
import com.stripe.android.DefaultIntentConfirmationInterceptor_Factory;
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
import com.stripe.android.paymentsheet.PaymentOptionCallback;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter_Factory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.EventTimeProvider_Factory;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.forms.FormViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.injection.C19228xcc094b3b;
import com.stripe.android.paymentsheet.injection.C19229x55c689fb;
import com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent;
import com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent;
import com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule_Companion_ProvideAppNameFactory;
import com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory;
import com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory;
import com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory;
import com.stripe.android.paymentsheet.model.PaymentOptionFactory;
import com.stripe.android.paymentsheet.model.PaymentOptionFactory_Factory;
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
import com.stripe.android.uicore.address.AddressRepository;
import com.stripe.android.uicore.address.AddressRepository_Factory;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* loaded from: classes7.dex */
public final class DaggerFlowControllerStateComponent {

    /* loaded from: classes7.dex */
    public static final class Builder implements FlowControllerStateComponent.Builder {
        private Context appContext;
        private FlowControllerViewModel flowControllerViewModel;

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent.Builder
        public FlowControllerStateComponent build() {
            C51679xZ3.m5006a(this.appContext, Context.class);
            C51679xZ3.m5006a(this.flowControllerViewModel, FlowControllerViewModel.class);
            return new FlowControllerStateComponentImpl(new GooglePayLauncherModule(), new CoroutineContextModule(), new CoreCommonModule(), this.appContext, this.flowControllerViewModel);
        }

        private Builder() {
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent.Builder
        public Builder appContext(Context context) {
            this.appContext = (Context) C51679xZ3.m5005b(context);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent.Builder
        public Builder flowControllerViewModel(FlowControllerViewModel flowControllerViewModel) {
            this.flowControllerViewModel = (FlowControllerViewModel) C51679xZ3.m5005b(flowControllerViewModel);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class FlowControllerComponentBuilder implements FlowControllerComponent.Builder {
        private InterfaceC29050u5 activityResultCaller;
        private final FlowControllerStateComponentImpl flowControllerStateComponentImpl;
        private String injectorKey;
        private LifecycleOwner lifeCycleOwner;
        private PaymentOptionCallback paymentOptionCallback;
        private PaymentSheetResultCallback paymentResultCallback;
        private Function0<Integer> statusBarColor;

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent.Builder
        public FlowControllerComponent build() {
            C51679xZ3.m5006a(this.lifeCycleOwner, LifecycleOwner.class);
            C51679xZ3.m5006a(this.activityResultCaller, InterfaceC29050u5.class);
            C51679xZ3.m5006a(this.statusBarColor, Function0.class);
            C51679xZ3.m5006a(this.paymentOptionCallback, PaymentOptionCallback.class);
            C51679xZ3.m5006a(this.paymentResultCallback, PaymentSheetResultCallback.class);
            C51679xZ3.m5006a(this.injectorKey, String.class);
            return new FlowControllerComponentImpl(this.flowControllerStateComponentImpl, this.lifeCycleOwner, this.activityResultCaller, this.statusBarColor, this.paymentOptionCallback, this.paymentResultCallback, this.injectorKey);
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent.Builder
        public /* bridge */ /* synthetic */ FlowControllerComponent.Builder statusBarColor(Function0 function0) {
            return statusBarColor((Function0<Integer>) function0);
        }

        private FlowControllerComponentBuilder(FlowControllerStateComponentImpl flowControllerStateComponentImpl) {
            this.flowControllerStateComponentImpl = flowControllerStateComponentImpl;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent.Builder
        public FlowControllerComponentBuilder activityResultCaller(InterfaceC29050u5 interfaceC29050u5) {
            this.activityResultCaller = (InterfaceC29050u5) C51679xZ3.m5005b(interfaceC29050u5);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent.Builder
        public FlowControllerComponentBuilder injectorKey(String str) {
            this.injectorKey = (String) C51679xZ3.m5005b(str);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent.Builder
        public FlowControllerComponentBuilder lifeCycleOwner(LifecycleOwner lifecycleOwner) {
            this.lifeCycleOwner = (LifecycleOwner) C51679xZ3.m5005b(lifecycleOwner);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent.Builder
        public FlowControllerComponentBuilder paymentOptionCallback(PaymentOptionCallback paymentOptionCallback) {
            this.paymentOptionCallback = (PaymentOptionCallback) C51679xZ3.m5005b(paymentOptionCallback);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent.Builder
        public FlowControllerComponentBuilder paymentResultCallback(PaymentSheetResultCallback paymentSheetResultCallback) {
            this.paymentResultCallback = (PaymentSheetResultCallback) C51679xZ3.m5005b(paymentSheetResultCallback);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent.Builder
        public FlowControllerComponentBuilder statusBarColor(Function0<Integer> function0) {
            this.statusBarColor = (Function0) C51679xZ3.m5005b(function0);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class FlowControllerComponentImpl implements FlowControllerComponent {
        private Y94<InterfaceC29050u5> activityResultCallerProvider;
        private Y94<DefaultFlowController> defaultFlowControllerProvider;
        private final FlowControllerComponentImpl flowControllerComponentImpl;
        private final FlowControllerStateComponentImpl flowControllerStateComponentImpl;
        private Y94<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider;
        private GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncherProvider;
        private Y94<String> injectorKeyProvider;
        private Y94<LifecycleOwner> lifeCycleOwnerProvider;
        private Y94<PaymentOptionCallback> paymentOptionCallbackProvider;
        private Y94<PaymentOptionFactory> paymentOptionFactoryProvider;
        private Y94<PaymentSheetResultCallback> paymentResultCallbackProvider;
        private Y94<Function0<Integer>> statusBarColorProvider;
        private Y94<StripePaymentLauncherAssistedFactory> stripePaymentLauncherAssistedFactoryProvider;
        private StripePaymentLauncher_Factory stripePaymentLauncherProvider;

        private void initialize(LifecycleOwner lifecycleOwner, InterfaceC29050u5 interfaceC29050u5, Function0<Integer> function0, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentSheetResultCallback, String str) {
            this.lifeCycleOwnerProvider = C39546d52.m44621a(lifecycleOwner);
            this.statusBarColorProvider = C39546d52.m44621a(function0);
            this.paymentOptionFactoryProvider = PaymentOptionFactory_Factory.create(this.flowControllerStateComponentImpl.provideResourcesProvider, this.flowControllerStateComponentImpl.provideStripeImageLoaderProvider);
            this.paymentOptionCallbackProvider = C39546d52.m44621a(paymentOptionCallback);
            this.paymentResultCallbackProvider = C39546d52.m44621a(paymentSheetResultCallback);
            this.activityResultCallerProvider = C39546d52.m44621a(interfaceC29050u5);
            this.injectorKeyProvider = C39546d52.m44621a(str);
            StripePaymentLauncher_Factory create = StripePaymentLauncher_Factory.create(this.flowControllerStateComponentImpl.appContextProvider, this.flowControllerStateComponentImpl.provideEnabledLoggingProvider, this.flowControllerStateComponentImpl.provideWorkContextProvider, this.flowControllerStateComponentImpl.provideUIContextProvider, this.flowControllerStateComponentImpl.stripeApiRepositoryProvider, this.flowControllerStateComponentImpl.paymentAnalyticsRequestFactoryProvider, this.flowControllerStateComponentImpl.provideProductUsageTokensProvider);
            this.stripePaymentLauncherProvider = create;
            this.stripePaymentLauncherAssistedFactoryProvider = StripePaymentLauncherAssistedFactory_Impl.create(create);
            GooglePayPaymentMethodLauncher_Factory create2 = GooglePayPaymentMethodLauncher_Factory.create(this.flowControllerStateComponentImpl.appContextProvider, this.flowControllerStateComponentImpl.provideGooglePayRepositoryFactoryProvider, this.flowControllerStateComponentImpl.provideProductUsageTokensProvider, this.flowControllerStateComponentImpl.providePublishableKeyProvider, this.flowControllerStateComponentImpl.provideStripeAccountIdProvider, this.flowControllerStateComponentImpl.provideEnabledLoggingProvider, this.flowControllerStateComponentImpl.provideWorkContextProvider, this.flowControllerStateComponentImpl.paymentAnalyticsRequestFactoryProvider, this.flowControllerStateComponentImpl.defaultAnalyticsRequestExecutorProvider, this.flowControllerStateComponentImpl.stripeApiRepositoryProvider);
            this.googlePayPaymentMethodLauncherProvider = create2;
            this.googlePayPaymentMethodLauncherFactoryProvider = GooglePayPaymentMethodLauncherFactory_Impl.create(create2);
            this.defaultFlowControllerProvider = V51.m80429b(DefaultFlowController_Factory.create(this.flowControllerStateComponentImpl.provideViewModelScopeProvider, this.lifeCycleOwnerProvider, this.statusBarColorProvider, this.paymentOptionFactoryProvider, this.paymentOptionCallbackProvider, this.paymentResultCallbackProvider, this.activityResultCallerProvider, this.injectorKeyProvider, this.flowControllerStateComponentImpl.defaultEventReporterProvider, this.flowControllerStateComponentImpl.flowControllerViewModelProvider, this.stripePaymentLauncherAssistedFactoryProvider, this.flowControllerStateComponentImpl.providePaymentConfigurationProvider, this.flowControllerStateComponentImpl.provideEnabledLoggingProvider, this.flowControllerStateComponentImpl.provideProductUsageTokensProvider, this.googlePayPaymentMethodLauncherFactoryProvider, this.flowControllerStateComponentImpl.linkPaymentLauncherProvider, this.flowControllerStateComponentImpl.flowControllerConfigurationHandlerProvider, this.flowControllerStateComponentImpl.defaultIntentConfirmationInterceptorProvider));
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent
        public DefaultFlowController getFlowController() {
            return this.defaultFlowControllerProvider.get();
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent
        public FlowControllerStateComponent getStateComponent() {
            return this.flowControllerStateComponentImpl;
        }

        private FlowControllerComponentImpl(FlowControllerStateComponentImpl flowControllerStateComponentImpl, LifecycleOwner lifecycleOwner, InterfaceC29050u5 interfaceC29050u5, Function0<Integer> function0, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentSheetResultCallback, String str) {
            this.flowControllerComponentImpl = this;
            this.flowControllerStateComponentImpl = flowControllerStateComponentImpl;
            initialize(lifecycleOwner, interfaceC29050u5, function0, paymentOptionCallback, paymentSheetResultCallback, str);
        }
    }

    /* loaded from: classes7.dex */
    public static final class FlowControllerStateComponentImpl implements FlowControllerStateComponent {
        private Y94<AddressRepository> addressRepositoryProvider;
        private Y94<ElementsSessionRepository.Api> apiProvider;
        private final Context appContext;
        private Y94<Context> appContextProvider;
        private Y94<CustomerApiRepository> customerApiRepositoryProvider;
        private Y94<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Y94<DefaultEventReporter> defaultEventReporterProvider;
        private Y94<DefaultIntentConfirmationInterceptor> defaultIntentConfirmationInterceptorProvider;
        private Y94<DefaultLinkAccountStatusProvider> defaultLinkAccountStatusProvider;
        private Y94<DefaultPaymentSheetLoader> defaultPaymentSheetLoaderProvider;
        private Y94<FlowControllerConfigurationHandler> flowControllerConfigurationHandlerProvider;
        private final FlowControllerStateComponentImpl flowControllerStateComponentImpl;
        private Y94<FlowControllerViewModel> flowControllerViewModelProvider;
        private Y94<FormViewModelSubcomponent.Builder> formViewModelSubcomponentBuilderProvider;
        private Y94<LinkPaymentLauncher> linkPaymentLauncherProvider;
        private Y94<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private Y94<PaymentOptionsViewModelSubcomponent.Builder> paymentOptionsViewModelSubcomponentBuilderProvider;
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
        private Y94<StripeImageLoader> provideStripeImageLoaderProvider;
        private Y94<CoroutineContext> provideUIContextProvider;
        private Y94<ZC0> provideViewModelScopeProvider;
        private Y94<CoroutineContext> provideWorkContextProvider;
        private Y94<LpmRepository> providesLpmRepositoryProvider;
        private Y94<StripeApiRepository> stripeApiRepositoryProvider;

        private void initialize(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, FlowControllerViewModel flowControllerViewModel) {
            this.paymentOptionsViewModelSubcomponentBuilderProvider = new Y94<PaymentOptionsViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.flowcontroller.DaggerFlowControllerStateComponent.FlowControllerStateComponentImpl.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.Y94
                public PaymentOptionsViewModelSubcomponent.Builder get() {
                    return new PaymentOptionsViewModelSubcomponentBuilder(FlowControllerStateComponentImpl.this.flowControllerStateComponentImpl);
                }
            };
            this.formViewModelSubcomponentBuilderProvider = new Y94<FormViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.flowcontroller.DaggerFlowControllerStateComponent.FlowControllerStateComponentImpl.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.Y94
                public FormViewModelSubcomponent.Builder get() {
                    return new FormViewModelSubcomponentBuilder(FlowControllerStateComponentImpl.this.flowControllerStateComponentImpl);
                }
            };
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(flowControllerViewModel);
            this.flowControllerViewModelProvider = m44621a;
            this.provideViewModelScopeProvider = V51.m80429b(FlowControllerModule_ProvideViewModelScopeFactory.create(m44621a));
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(context);
            this.appContextProvider = m44621a2;
            this.provideResourcesProvider = V51.m80429b(ResourceRepositoryModule_ProvideResourcesFactory.create(m44621a2));
            this.provideStripeImageLoaderProvider = V51.m80429b(FlowControllerModule_ProvideStripeImageLoaderFactory.create(this.appContextProvider));
            this.provideEventReporterModeProvider = V51.m80429b(FlowControllerModule_ProvideEventReporterModeFactory.create());
            Y94<Boolean> m80429b = V51.m80429b(PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory.create());
            this.provideEnabledLoggingProvider = m80429b;
            this.provideLoggerProvider = V51.m80429b(CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, m80429b));
            Y94<CoroutineContext> m80429b2 = V51.m80429b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            this.provideWorkContextProvider = m80429b2;
            this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, m80429b2);
            C19228xcc094b3b create = C19228xcc094b3b.create(this.appContextProvider);
            this.providePaymentConfigurationProvider = create;
            this.providePublishableKeyProvider = PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.create(create);
            Y94<Set<String>> m80429b3 = V51.m80429b(FlowControllerModule_ProvideProductUsageTokensFactory.create());
            this.provideProductUsageTokensProvider = m80429b3;
            PaymentAnalyticsRequestFactory_Factory create2 = PaymentAnalyticsRequestFactory_Factory.create(this.appContextProvider, this.providePublishableKeyProvider, m80429b3);
            this.paymentAnalyticsRequestFactoryProvider = create2;
            this.defaultEventReporterProvider = V51.m80429b(DefaultEventReporter_Factory.create(this.provideEventReporterModeProvider, this.defaultAnalyticsRequestExecutorProvider, create2, EventTimeProvider_Factory.create(), this.provideWorkContextProvider));
            this.provideUIContextProvider = V51.m80429b(CoroutineContextModule_ProvideUIContextFactory.create(coroutineContextModule));
            this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(this.appContextProvider, this.providePublishableKeyProvider, this.provideWorkContextProvider, this.provideProductUsageTokensProvider, this.paymentAnalyticsRequestFactoryProvider, this.defaultAnalyticsRequestExecutorProvider, this.provideLoggerProvider);
            this.provideGooglePayRepositoryFactoryProvider = V51.m80429b(GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory.create(googlePayLauncherModule, this.appContextProvider, this.provideLoggerProvider));
            this.provideStripeAccountIdProvider = PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory.create(this.providePaymentConfigurationProvider);
            Y94<AddressRepository> m80429b4 = V51.m80429b(AddressRepository_Factory.create(this.provideResourcesProvider, this.provideWorkContextProvider));
            this.addressRepositoryProvider = m80429b4;
            this.linkPaymentLauncherProvider = V51.m80429b(LinkPaymentLauncher_Factory.create(this.appContextProvider, this.provideProductUsageTokensProvider, this.providePublishableKeyProvider, this.provideStripeAccountIdProvider, this.provideEnabledLoggingProvider, this.provideWorkContextProvider, this.provideUIContextProvider, this.paymentAnalyticsRequestFactoryProvider, this.defaultAnalyticsRequestExecutorProvider, this.stripeApiRepositoryProvider, m80429b4));
            this.provideAppNameProvider = V51.m80429b(PaymentSheetCommonModule_Companion_ProvideAppNameFactory.create(this.appContextProvider));
            this.providePrefsRepositoryFactoryProvider = V51.m80429b(C19229x55c689fb.create(this.appContextProvider, this.provideWorkContextProvider));
            this.apiProvider = ElementsSessionRepository_Api_Factory.create(this.stripeApiRepositoryProvider, this.providePaymentConfigurationProvider, this.provideWorkContextProvider);
            this.customerApiRepositoryProvider = V51.m80429b(CustomerApiRepository_Factory.create(this.stripeApiRepositoryProvider, this.providePaymentConfigurationProvider, this.provideLoggerProvider, this.provideWorkContextProvider, this.provideProductUsageTokensProvider));
            this.providesLpmRepositoryProvider = V51.m80429b(ResourceRepositoryModule_ProvidesLpmRepositoryFactory.create(this.provideResourcesProvider));
            this.defaultLinkAccountStatusProvider = DefaultLinkAccountStatusProvider_Factory.create(this.linkPaymentLauncherProvider);
            Y94<DefaultPaymentSheetLoader> m80429b5 = V51.m80429b(DefaultPaymentSheetLoader_Factory.create(this.provideAppNameProvider, this.providePrefsRepositoryFactoryProvider, this.provideGooglePayRepositoryFactoryProvider, this.apiProvider, StripeIntentValidator_Factory.create(), this.customerApiRepositoryProvider, this.providesLpmRepositoryProvider, this.provideLoggerProvider, this.defaultEventReporterProvider, this.provideWorkContextProvider, this.defaultLinkAccountStatusProvider));
            this.defaultPaymentSheetLoaderProvider = m80429b5;
            this.flowControllerConfigurationHandlerProvider = V51.m80429b(FlowControllerConfigurationHandler_Factory.create(m80429b5, this.provideUIContextProvider, this.defaultEventReporterProvider, this.flowControllerViewModelProvider));
            this.defaultIntentConfirmationInterceptorProvider = DefaultIntentConfirmationInterceptor_Factory.create(this.appContextProvider, this.stripeApiRepositoryProvider, this.providePublishableKeyProvider, this.provideStripeAccountIdProvider);
        }

        private PaymentOptionsViewModel.Factory injectFactory(PaymentOptionsViewModel.Factory factory) {
            PaymentOptionsViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.paymentOptionsViewModelSubcomponentBuilderProvider);
            return factory;
        }

        private FormViewModel.Factory injectFactory2(FormViewModel.Factory factory) {
            FormViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.formViewModelSubcomponentBuilderProvider);
            return factory;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent
        public FlowControllerComponent.Builder getFlowControllerComponentBuilder() {
            return new FlowControllerComponentBuilder(this.flowControllerStateComponentImpl);
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent
        public void inject(PaymentOptionsViewModel.Factory factory) {
            injectFactory(factory);
        }

        private FlowControllerStateComponentImpl(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, FlowControllerViewModel flowControllerViewModel) {
            this.flowControllerStateComponentImpl = this;
            this.appContext = context;
            initialize(googlePayLauncherModule, coroutineContextModule, coreCommonModule, context, flowControllerViewModel);
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent
        public void inject(FormViewModel.Factory factory) {
            injectFactory2(factory);
        }
    }

    /* loaded from: classes7.dex */
    public static final class FormViewModelSubcomponentBuilder implements FormViewModelSubcomponent.Builder {
        private final FlowControllerStateComponentImpl flowControllerStateComponentImpl;
        private FormArguments formArguments;
        private InterfaceC32730Eu1<Boolean> showCheckboxFlow;

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.Builder
        public FormViewModelSubcomponent build() {
            C51679xZ3.m5006a(this.formArguments, FormArguments.class);
            C51679xZ3.m5006a(this.showCheckboxFlow, InterfaceC32730Eu1.class);
            return new FormViewModelSubcomponentImpl(this.flowControllerStateComponentImpl, this.formArguments, this.showCheckboxFlow);
        }

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.Builder
        public /* bridge */ /* synthetic */ FormViewModelSubcomponent.Builder showCheckboxFlow(InterfaceC32730Eu1 interfaceC32730Eu1) {
            return showCheckboxFlow((InterfaceC32730Eu1<Boolean>) interfaceC32730Eu1);
        }

        private FormViewModelSubcomponentBuilder(FlowControllerStateComponentImpl flowControllerStateComponentImpl) {
            this.flowControllerStateComponentImpl = flowControllerStateComponentImpl;
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
        private final FlowControllerStateComponentImpl flowControllerStateComponentImpl;
        private final FormArguments formArguments;
        private final FormViewModelSubcomponentImpl formViewModelSubcomponentImpl;
        private final InterfaceC32730Eu1<Boolean> showCheckboxFlow;

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent
        public FormViewModel getViewModel() {
            return new FormViewModel(this.flowControllerStateComponentImpl.appContext, this.formArguments, (LpmRepository) this.flowControllerStateComponentImpl.providesLpmRepositoryProvider.get(), (AddressRepository) this.flowControllerStateComponentImpl.addressRepositoryProvider.get(), this.showCheckboxFlow);
        }

        private FormViewModelSubcomponentImpl(FlowControllerStateComponentImpl flowControllerStateComponentImpl, FormArguments formArguments, InterfaceC32730Eu1<Boolean> interfaceC32730Eu1) {
            this.formViewModelSubcomponentImpl = this;
            this.flowControllerStateComponentImpl = flowControllerStateComponentImpl;
            this.formArguments = formArguments;
            this.showCheckboxFlow = interfaceC32730Eu1;
        }
    }

    /* loaded from: classes7.dex */
    public static final class PaymentOptionsViewModelSubcomponentBuilder implements PaymentOptionsViewModelSubcomponent.Builder {
        private Application application;
        private PaymentOptionContract.Args args;
        private final FlowControllerStateComponentImpl flowControllerStateComponentImpl;
        private C11747p savedStateHandle;

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent.Builder
        public PaymentOptionsViewModelSubcomponent build() {
            C51679xZ3.m5006a(this.application, Application.class);
            C51679xZ3.m5006a(this.savedStateHandle, C11747p.class);
            C51679xZ3.m5006a(this.args, PaymentOptionContract.Args.class);
            return new PaymentOptionsViewModelSubcomponentImpl(this.flowControllerStateComponentImpl, this.application, this.savedStateHandle, this.args);
        }

        private PaymentOptionsViewModelSubcomponentBuilder(FlowControllerStateComponentImpl flowControllerStateComponentImpl) {
            this.flowControllerStateComponentImpl = flowControllerStateComponentImpl;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent.Builder
        public PaymentOptionsViewModelSubcomponentBuilder application(Application application) {
            this.application = (Application) C51679xZ3.m5005b(application);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent.Builder
        public PaymentOptionsViewModelSubcomponentBuilder args(PaymentOptionContract.Args args) {
            this.args = (PaymentOptionContract.Args) C51679xZ3.m5005b(args);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent.Builder
        public PaymentOptionsViewModelSubcomponentBuilder savedStateHandle(C11747p c11747p) {
            this.savedStateHandle = (C11747p) C51679xZ3.m5005b(c11747p);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class PaymentOptionsViewModelSubcomponentImpl implements PaymentOptionsViewModelSubcomponent {
        private final Application application;
        private final PaymentOptionContract.Args args;
        private final FlowControllerStateComponentImpl flowControllerStateComponentImpl;
        private final PaymentOptionsViewModelSubcomponentImpl paymentOptionsViewModelSubcomponentImpl;
        private final C11747p savedStateHandle;

        private LinkHandler linkHandler() {
            return new LinkHandler((LinkPaymentLauncher) this.flowControllerStateComponentImpl.linkPaymentLauncherProvider.get(), this.savedStateHandle);
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent
        public PaymentOptionsViewModel getViewModel() {
            return new PaymentOptionsViewModel(this.args, (Function1) this.flowControllerStateComponentImpl.providePrefsRepositoryFactoryProvider.get(), (EventReporter) this.flowControllerStateComponentImpl.defaultEventReporterProvider.get(), (CustomerRepository) this.flowControllerStateComponentImpl.customerApiRepositoryProvider.get(), (CoroutineContext) this.flowControllerStateComponentImpl.provideWorkContextProvider.get(), this.application, (Logger) this.flowControllerStateComponentImpl.provideLoggerProvider.get(), (LpmRepository) this.flowControllerStateComponentImpl.providesLpmRepositoryProvider.get(), this.savedStateHandle, linkHandler());
        }

        private PaymentOptionsViewModelSubcomponentImpl(FlowControllerStateComponentImpl flowControllerStateComponentImpl, Application application, C11747p c11747p, PaymentOptionContract.Args args) {
            this.paymentOptionsViewModelSubcomponentImpl = this;
            this.flowControllerStateComponentImpl = flowControllerStateComponentImpl;
            this.args = args;
            this.application = application;
            this.savedStateHandle = c11747p;
        }
    }

    private DaggerFlowControllerStateComponent() {
    }

    public static FlowControllerStateComponent.Builder builder() {
        return new Builder();
    }
}
