package com.stripe.android.link.injection;

import android.content.Context;
import com.stripe.android.DefaultIntentConfirmationInterceptor;
import com.stripe.android.DefaultIntentConfirmationInterceptor_Factory;
import com.stripe.android.IntentConfirmationInterceptor;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLocaleFactory;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityViewModel;
import com.stripe.android.link.LinkActivityViewModel_Factory_MembersInjector;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.account.CookieStore;
import com.stripe.android.link.account.CookieStore_Factory;
import com.stripe.android.link.account.EncryptedStore;
import com.stripe.android.link.account.EncryptedStore_Factory;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.account.LinkAccountManager_Factory;
import com.stripe.android.link.analytics.DefaultLinkEventsReporter;
import com.stripe.android.link.analytics.DefaultLinkEventsReporter_Factory;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.confirmation.ConfirmationManager;
import com.stripe.android.link.confirmation.ConfirmationManager_Factory;
import com.stripe.android.link.injection.LinkComponent;
import com.stripe.android.link.injection.LinkPaymentLauncherComponent;
import com.stripe.android.link.injection.SignedInViewModelSubcomponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.link.model.Navigator_Factory;
import com.stripe.android.link.p042ui.cardedit.CardEditViewModel;
import com.stripe.android.link.p042ui.cardedit.CardEditViewModel_Factory_MembersInjector;
import com.stripe.android.link.p042ui.inline.InlineSignupViewModel;
import com.stripe.android.link.p042ui.inline.InlineSignupViewModel_Factory_MembersInjector;
import com.stripe.android.link.p042ui.paymentmethod.PaymentMethodViewModel;
import com.stripe.android.link.p042ui.paymentmethod.PaymentMethodViewModel_Factory_MembersInjector;
import com.stripe.android.link.p042ui.signup.SignUpViewModel;
import com.stripe.android.link.p042ui.signup.SignUpViewModel_Factory_MembersInjector;
import com.stripe.android.link.p042ui.verification.VerificationViewModel;
import com.stripe.android.link.p042ui.verification.VerificationViewModel_Factory_MembersInjector;
import com.stripe.android.link.p042ui.wallet.WalletViewModel;
import com.stripe.android.link.p042ui.wallet.WalletViewModel_Factory_MembersInjector;
import com.stripe.android.link.repositories.LinkApiRepository;
import com.stripe.android.link.repositories.LinkApiRepository_Factory;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.p049ui.core.FormController;
import com.stripe.android.p049ui.core.elements.LayoutSpec;
import com.stripe.android.p049ui.core.forms.TransformSpecToElements;
import com.stripe.android.p049ui.core.injection.FormControllerModule_ProvideTransformSpecToElementsFactory;
import com.stripe.android.p049ui.core.injection.FormControllerSubcomponent;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory_Impl;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncher_Factory;
import com.stripe.android.repository.ConsumersApiService;
import com.stripe.android.uicore.address.AddressRepository;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class DaggerLinkPaymentLauncherComponent {

    /* loaded from: classes7.dex */
    public static final class Builder implements LinkPaymentLauncherComponent.Builder {
        private AddressRepository addressRepository;
        private AnalyticsRequestExecutor analyticsRequestExecutor;
        private PaymentAnalyticsRequestFactory analyticsRequestFactory;
        private LinkPaymentLauncher.Configuration configuration;
        private Context context;
        private Boolean enableLogging;
        private CoroutineContext ioContext;
        private Set<String> productUsage;
        private Function0<String> publishableKeyProvider;
        private Function0<String> stripeAccountIdProvider;
        private StripeRepository stripeRepository;
        private CoroutineContext uiContext;

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public LinkPaymentLauncherComponent build() {
            C51679xZ3.m5006a(this.configuration, LinkPaymentLauncher.Configuration.class);
            C51679xZ3.m5006a(this.context, Context.class);
            C51679xZ3.m5006a(this.ioContext, CoroutineContext.class);
            C51679xZ3.m5006a(this.uiContext, CoroutineContext.class);
            C51679xZ3.m5006a(this.analyticsRequestFactory, PaymentAnalyticsRequestFactory.class);
            C51679xZ3.m5006a(this.analyticsRequestExecutor, AnalyticsRequestExecutor.class);
            C51679xZ3.m5006a(this.stripeRepository, StripeRepository.class);
            C51679xZ3.m5006a(this.addressRepository, AddressRepository.class);
            C51679xZ3.m5006a(this.enableLogging, Boolean.class);
            C51679xZ3.m5006a(this.publishableKeyProvider, Function0.class);
            C51679xZ3.m5006a(this.stripeAccountIdProvider, Function0.class);
            C51679xZ3.m5006a(this.productUsage, Set.class);
            return new LinkPaymentLauncherComponentImpl(new CoreCommonModule(), this.configuration, this.context, this.ioContext, this.uiContext, this.analyticsRequestFactory, this.analyticsRequestExecutor, this.stripeRepository, this.addressRepository, this.enableLogging, this.publishableKeyProvider, this.stripeAccountIdProvider, this.productUsage);
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public /* bridge */ /* synthetic */ LinkPaymentLauncherComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public /* bridge */ /* synthetic */ LinkPaymentLauncherComponent.Builder publishableKeyProvider(Function0 function0) {
            return publishableKeyProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public /* bridge */ /* synthetic */ LinkPaymentLauncherComponent.Builder stripeAccountIdProvider(Function0 function0) {
            return stripeAccountIdProvider((Function0<String>) function0);
        }

        private Builder() {
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder addressRepository(AddressRepository addressRepository) {
            this.addressRepository = (AddressRepository) C51679xZ3.m5005b(addressRepository);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder analyticsRequestExecutor(AnalyticsRequestExecutor analyticsRequestExecutor) {
            this.analyticsRequestExecutor = (AnalyticsRequestExecutor) C51679xZ3.m5005b(analyticsRequestExecutor);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder analyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
            this.analyticsRequestFactory = (PaymentAnalyticsRequestFactory) C51679xZ3.m5005b(paymentAnalyticsRequestFactory);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder configuration(LinkPaymentLauncher.Configuration configuration) {
            this.configuration = (LinkPaymentLauncher.Configuration) C51679xZ3.m5005b(configuration);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) C51679xZ3.m5005b(context);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder enableLogging(boolean z) {
            this.enableLogging = (Boolean) C51679xZ3.m5005b(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder ioContext(CoroutineContext coroutineContext) {
            this.ioContext = (CoroutineContext) C51679xZ3.m5005b(coroutineContext);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) C51679xZ3.m5005b(set);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder publishableKeyProvider(Function0<String> function0) {
            this.publishableKeyProvider = (Function0) C51679xZ3.m5005b(function0);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder stripeAccountIdProvider(Function0<String> function0) {
            this.stripeAccountIdProvider = (Function0) C51679xZ3.m5005b(function0);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder stripeRepository(StripeRepository stripeRepository) {
            this.stripeRepository = (StripeRepository) C51679xZ3.m5005b(stripeRepository);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder uiContext(CoroutineContext coroutineContext) {
            this.uiContext = (CoroutineContext) C51679xZ3.m5005b(coroutineContext);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class FormControllerSubcomponentBuilder implements FormControllerSubcomponent.Builder {
        private LayoutSpec formSpec;
        private Map<IdentifierSpec, String> initialValues;
        private final LinkComponentImpl linkComponentImpl;
        private final LinkPaymentLauncherComponentImpl linkPaymentLauncherComponentImpl;
        private String merchantName;
        private Map<IdentifierSpec, String> shippingValues;
        private StripeIntent stripeIntent;
        private ZC0 viewModelScope;
        private Set<IdentifierSpec> viewOnlyFields;

        @Override // com.stripe.android.p049ui.core.injection.FormControllerSubcomponent.Builder
        public FormControllerSubcomponent build() {
            C51679xZ3.m5006a(this.formSpec, LayoutSpec.class);
            C51679xZ3.m5006a(this.initialValues, Map.class);
            C51679xZ3.m5006a(this.viewOnlyFields, Set.class);
            C51679xZ3.m5006a(this.viewModelScope, ZC0.class);
            C51679xZ3.m5006a(this.merchantName, String.class);
            return new FormControllerSubcomponentImpl(this.linkPaymentLauncherComponentImpl, this.linkComponentImpl, this.formSpec, this.initialValues, this.shippingValues, this.viewOnlyFields, this.viewModelScope, this.stripeIntent, this.merchantName);
        }

        @Override // com.stripe.android.p049ui.core.injection.FormControllerSubcomponent.Builder
        public /* bridge */ /* synthetic */ FormControllerSubcomponent.Builder initialValues(Map map) {
            return initialValues((Map<IdentifierSpec, String>) map);
        }

        @Override // com.stripe.android.p049ui.core.injection.FormControllerSubcomponent.Builder
        public /* bridge */ /* synthetic */ FormControllerSubcomponent.Builder shippingValues(Map map) {
            return shippingValues((Map<IdentifierSpec, String>) map);
        }

        @Override // com.stripe.android.p049ui.core.injection.FormControllerSubcomponent.Builder
        public /* bridge */ /* synthetic */ FormControllerSubcomponent.Builder viewOnlyFields(Set set) {
            return viewOnlyFields((Set<IdentifierSpec>) set);
        }

        private FormControllerSubcomponentBuilder(LinkPaymentLauncherComponentImpl linkPaymentLauncherComponentImpl, LinkComponentImpl linkComponentImpl) {
            this.linkPaymentLauncherComponentImpl = linkPaymentLauncherComponentImpl;
            this.linkComponentImpl = linkComponentImpl;
        }

        @Override // com.stripe.android.p049ui.core.injection.FormControllerSubcomponent.Builder
        public FormControllerSubcomponentBuilder formSpec(LayoutSpec layoutSpec) {
            this.formSpec = (LayoutSpec) C51679xZ3.m5005b(layoutSpec);
            return this;
        }

        @Override // com.stripe.android.p049ui.core.injection.FormControllerSubcomponent.Builder
        public FormControllerSubcomponentBuilder initialValues(Map<IdentifierSpec, String> map) {
            this.initialValues = (Map) C51679xZ3.m5005b(map);
            return this;
        }

        @Override // com.stripe.android.p049ui.core.injection.FormControllerSubcomponent.Builder
        public FormControllerSubcomponentBuilder merchantName(String str) {
            this.merchantName = (String) C51679xZ3.m5005b(str);
            return this;
        }

        @Override // com.stripe.android.p049ui.core.injection.FormControllerSubcomponent.Builder
        public FormControllerSubcomponentBuilder shippingValues(Map<IdentifierSpec, String> map) {
            this.shippingValues = map;
            return this;
        }

        @Override // com.stripe.android.p049ui.core.injection.FormControllerSubcomponent.Builder
        public FormControllerSubcomponentBuilder stripeIntent(StripeIntent stripeIntent) {
            this.stripeIntent = stripeIntent;
            return this;
        }

        @Override // com.stripe.android.p049ui.core.injection.FormControllerSubcomponent.Builder
        public FormControllerSubcomponentBuilder viewModelScope(ZC0 zc0) {
            this.viewModelScope = (ZC0) C51679xZ3.m5005b(zc0);
            return this;
        }

        @Override // com.stripe.android.p049ui.core.injection.FormControllerSubcomponent.Builder
        public FormControllerSubcomponentBuilder viewOnlyFields(Set<IdentifierSpec> set) {
            this.viewOnlyFields = (Set) C51679xZ3.m5005b(set);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class FormControllerSubcomponentImpl implements FormControllerSubcomponent {
        private final FormControllerSubcomponentImpl formControllerSubcomponentImpl;
        private final LayoutSpec formSpec;
        private final Map<IdentifierSpec, String> initialValues;
        private final LinkComponentImpl linkComponentImpl;
        private final LinkPaymentLauncherComponentImpl linkPaymentLauncherComponentImpl;
        private final String merchantName;
        private final Map<IdentifierSpec, String> shippingValues;
        private final StripeIntent stripeIntent;
        private final Set<IdentifierSpec> viewOnlyFields;

        private TransformSpecToElements transformSpecToElements() {
            return FormControllerModule_ProvideTransformSpecToElementsFactory.provideTransformSpecToElements(this.linkPaymentLauncherComponentImpl.addressRepository, this.linkPaymentLauncherComponentImpl.context, this.merchantName, this.stripeIntent, this.initialValues, this.shippingValues, this.viewOnlyFields);
        }

        @Override // com.stripe.android.p049ui.core.injection.FormControllerSubcomponent
        public FormController getFormController() {
            return new FormController(this.formSpec, transformSpecToElements());
        }

        private FormControllerSubcomponentImpl(LinkPaymentLauncherComponentImpl linkPaymentLauncherComponentImpl, LinkComponentImpl linkComponentImpl, LayoutSpec layoutSpec, Map<IdentifierSpec, String> map, Map<IdentifierSpec, String> map2, Set<IdentifierSpec> set, ZC0 zc0, StripeIntent stripeIntent, String str) {
            this.formControllerSubcomponentImpl = this;
            this.linkPaymentLauncherComponentImpl = linkPaymentLauncherComponentImpl;
            this.linkComponentImpl = linkComponentImpl;
            this.formSpec = layoutSpec;
            this.merchantName = str;
            this.stripeIntent = stripeIntent;
            this.initialValues = map;
            this.shippingValues = map2;
            this.viewOnlyFields = set;
        }
    }

    /* loaded from: classes7.dex */
    public static final class LinkComponentBuilder implements LinkComponent.Builder {
        private final LinkPaymentLauncherComponentImpl linkPaymentLauncherComponentImpl;
        private LinkActivityContract.Args starterArgs;

        @Override // com.stripe.android.link.injection.LinkComponent.Builder
        public LinkComponent build() {
            C51679xZ3.m5006a(this.starterArgs, LinkActivityContract.Args.class);
            return new LinkComponentImpl(this.linkPaymentLauncherComponentImpl, this.starterArgs);
        }

        private LinkComponentBuilder(LinkPaymentLauncherComponentImpl linkPaymentLauncherComponentImpl) {
            this.linkPaymentLauncherComponentImpl = linkPaymentLauncherComponentImpl;
        }

        @Override // com.stripe.android.link.injection.LinkComponent.Builder
        public LinkComponentBuilder starterArgs(LinkActivityContract.Args args) {
            this.starterArgs = (LinkActivityContract.Args) C51679xZ3.m5005b(args);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class LinkComponentImpl extends LinkComponent {
        private Y94<FormControllerSubcomponent.Builder> formControllerSubcomponentBuilderProvider;
        private final LinkComponentImpl linkComponentImpl;
        private final LinkPaymentLauncherComponentImpl linkPaymentLauncherComponentImpl;
        private Y94<SignedInViewModelSubcomponent.Builder> signedInViewModelSubcomponentBuilderProvider;
        private final LinkActivityContract.Args starterArgs;

        private void initialize(LinkActivityContract.Args args) {
            this.signedInViewModelSubcomponentBuilderProvider = new Y94<SignedInViewModelSubcomponent.Builder>() { // from class: com.stripe.android.link.injection.DaggerLinkPaymentLauncherComponent.LinkComponentImpl.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.Y94
                public SignedInViewModelSubcomponent.Builder get() {
                    return new SignedInViewModelSubcomponentBuilder(LinkComponentImpl.this.linkPaymentLauncherComponentImpl, LinkComponentImpl.this.linkComponentImpl);
                }
            };
            this.formControllerSubcomponentBuilderProvider = new Y94<FormControllerSubcomponent.Builder>() { // from class: com.stripe.android.link.injection.DaggerLinkPaymentLauncherComponent.LinkComponentImpl.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.Y94
                public FormControllerSubcomponent.Builder get() {
                    return new FormControllerSubcomponentBuilder(LinkComponentImpl.this.linkPaymentLauncherComponentImpl, LinkComponentImpl.this.linkComponentImpl);
                }
            };
        }

        private LinkActivityViewModel.Factory injectFactory(LinkActivityViewModel.Factory factory) {
            LinkActivityViewModel_Factory_MembersInjector.injectViewModel(factory, linkActivityViewModel());
            return factory;
        }

        private SignUpViewModel.Factory injectFactory2(SignUpViewModel.Factory factory) {
            SignUpViewModel_Factory_MembersInjector.injectSignUpViewModel(factory, signUpViewModel());
            return factory;
        }

        private VerificationViewModel.Factory injectFactory3(VerificationViewModel.Factory factory) {
            VerificationViewModel_Factory_MembersInjector.injectViewModel(factory, this.linkPaymentLauncherComponentImpl.verificationViewModel());
            return factory;
        }

        private WalletViewModel.Factory injectFactory4(WalletViewModel.Factory factory) {
            WalletViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.signedInViewModelSubcomponentBuilderProvider);
            return factory;
        }

        private PaymentMethodViewModel.Factory injectFactory5(PaymentMethodViewModel.Factory factory) {
            PaymentMethodViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.signedInViewModelSubcomponentBuilderProvider);
            return factory;
        }

        private CardEditViewModel.Factory injectFactory6(CardEditViewModel.Factory factory) {
            CardEditViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.signedInViewModelSubcomponentBuilderProvider);
            return factory;
        }

        private LinkActivityViewModel linkActivityViewModel() {
            return new LinkActivityViewModel(this.starterArgs, (LinkAccountManager) this.linkPaymentLauncherComponentImpl.linkAccountManagerProvider.get(), (Navigator) this.linkPaymentLauncherComponentImpl.navigatorProvider.get(), (ConfirmationManager) this.linkPaymentLauncherComponentImpl.confirmationManagerProvider.get());
        }

        private SignUpViewModel signUpViewModel() {
            return new SignUpViewModel(this.starterArgs, (LinkAccountManager) this.linkPaymentLauncherComponentImpl.linkAccountManagerProvider.get(), (LinkEventsReporter) this.linkPaymentLauncherComponentImpl.bindLinkEventsReporterProvider.get(), (Navigator) this.linkPaymentLauncherComponentImpl.navigatorProvider.get(), (Logger) this.linkPaymentLauncherComponentImpl.provideLoggerProvider.get());
        }

        @Override // com.stripe.android.link.injection.LinkComponent
        public void inject(LinkActivityViewModel.Factory factory) {
            injectFactory(factory);
        }

        private LinkComponentImpl(LinkPaymentLauncherComponentImpl linkPaymentLauncherComponentImpl, LinkActivityContract.Args args) {
            this.linkComponentImpl = this;
            this.linkPaymentLauncherComponentImpl = linkPaymentLauncherComponentImpl;
            this.starterArgs = args;
            initialize(args);
        }

        @Override // com.stripe.android.link.injection.LinkComponent
        public void inject(SignUpViewModel.Factory factory) {
            injectFactory2(factory);
        }

        @Override // com.stripe.android.link.injection.LinkComponent
        public void inject(VerificationViewModel.Factory factory) {
            injectFactory3(factory);
        }

        @Override // com.stripe.android.link.injection.LinkComponent
        public void inject(WalletViewModel.Factory factory) {
            injectFactory4(factory);
        }

        @Override // com.stripe.android.link.injection.LinkComponent
        public void inject(PaymentMethodViewModel.Factory factory) {
            injectFactory5(factory);
        }

        @Override // com.stripe.android.link.injection.LinkComponent
        public void inject(CardEditViewModel.Factory factory) {
            injectFactory6(factory);
        }
    }

    /* loaded from: classes7.dex */
    public static final class LinkPaymentLauncherComponentImpl extends LinkPaymentLauncherComponent {
        private final AddressRepository addressRepository;
        private Y94<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
        private Y94<PaymentAnalyticsRequestFactory> analyticsRequestFactoryProvider;
        private Y94<IntentConfirmationInterceptor> bindIntentConfirmationInterceptorProvider;
        private Y94<LinkEventsReporter> bindLinkEventsReporterProvider;
        private final LinkPaymentLauncher.Configuration configuration;
        private Y94<LinkPaymentLauncher.Configuration> configurationProvider;
        private Y94<ConfirmationManager> confirmationManagerProvider;
        private final Context context;
        private Y94<Context> contextProvider;
        private Y94<CookieStore> cookieStoreProvider;
        private Y94<DefaultIntentConfirmationInterceptor> defaultIntentConfirmationInterceptorProvider;
        private Y94<DefaultLinkEventsReporter> defaultLinkEventsReporterProvider;
        private Y94<Boolean> enableLoggingProvider;
        private Y94<EncryptedStore> encryptedStoreProvider;
        private Y94<CoroutineContext> ioContextProvider;
        private Y94<LinkAccountManager> linkAccountManagerProvider;
        private Y94<LinkApiRepository> linkApiRepositoryProvider;
        private final LinkPaymentLauncherComponentImpl linkPaymentLauncherComponentImpl;
        private Y94<Navigator> navigatorProvider;
        private Y94<Set<String>> productUsageProvider;
        private Y94<ConsumersApiService> provideConsumersApiServiceProvider;
        private Y94<Locale> provideLocaleProvider;
        private Y94<Logger> provideLoggerProvider;
        private Y94<Function0<String>> publishableKeyProvider;
        private Y94<Function0<String>> stripeAccountIdProvider;
        private Y94<StripePaymentLauncherAssistedFactory> stripePaymentLauncherAssistedFactoryProvider;
        private StripePaymentLauncher_Factory stripePaymentLauncherProvider;
        private Y94<StripeRepository> stripeRepositoryProvider;
        private Y94<CoroutineContext> uiContextProvider;

        private void initialize(CoreCommonModule coreCommonModule, LinkPaymentLauncher.Configuration configuration, Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, StripeRepository stripeRepository, AddressRepository addressRepository, Boolean bool, Function0<String> function0, Function0<String> function02, Set<String> set) {
            this.configurationProvider = C39546d52.m44621a(configuration);
            this.publishableKeyProvider = C39546d52.m44621a(function0);
            this.stripeAccountIdProvider = C39546d52.m44621a(function02);
            this.stripeRepositoryProvider = C39546d52.m44621a(stripeRepository);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(bool);
            this.enableLoggingProvider = m44621a;
            this.provideLoggerProvider = V51.m80429b(CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, m44621a));
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(coroutineContext);
            this.ioContextProvider = m44621a2;
            this.provideConsumersApiServiceProvider = V51.m80429b(LinkCommonModule_Companion_ProvideConsumersApiServiceFactory.create(this.provideLoggerProvider, m44621a2));
            Y94<Locale> m80429b = V51.m80429b(CoreCommonModule_ProvideLocaleFactory.create(coreCommonModule));
            this.provideLocaleProvider = m80429b;
            this.linkApiRepositoryProvider = V51.m80429b(LinkApiRepository_Factory.create(this.publishableKeyProvider, this.stripeAccountIdProvider, this.stripeRepositoryProvider, this.provideConsumersApiServiceProvider, this.ioContextProvider, m80429b));
            InterfaceC48812sj1 m44621a3 = C39546d52.m44621a(context);
            this.contextProvider = m44621a3;
            Y94<EncryptedStore> m80429b2 = V51.m80429b(EncryptedStore_Factory.create(m44621a3));
            this.encryptedStoreProvider = m80429b2;
            this.cookieStoreProvider = V51.m80429b(CookieStore_Factory.create(m80429b2));
            this.analyticsRequestExecutorProvider = C39546d52.m44621a(analyticsRequestExecutor);
            InterfaceC48812sj1 m44621a4 = C39546d52.m44621a(paymentAnalyticsRequestFactory);
            this.analyticsRequestFactoryProvider = m44621a4;
            DefaultLinkEventsReporter_Factory create = DefaultLinkEventsReporter_Factory.create(this.analyticsRequestExecutorProvider, m44621a4, this.ioContextProvider, this.provideLoggerProvider);
            this.defaultLinkEventsReporterProvider = create;
            Y94<LinkEventsReporter> m80429b3 = V51.m80429b(create);
            this.bindLinkEventsReporterProvider = m80429b3;
            this.linkAccountManagerProvider = V51.m80429b(LinkAccountManager_Factory.create(this.configurationProvider, this.linkApiRepositoryProvider, this.cookieStoreProvider, m80429b3));
            this.navigatorProvider = V51.m80429b(Navigator_Factory.create());
            this.uiContextProvider = C39546d52.m44621a(coroutineContext2);
            InterfaceC48812sj1 m44621a5 = C39546d52.m44621a(set);
            this.productUsageProvider = m44621a5;
            StripePaymentLauncher_Factory create2 = StripePaymentLauncher_Factory.create(this.contextProvider, this.enableLoggingProvider, this.ioContextProvider, this.uiContextProvider, this.stripeRepositoryProvider, this.analyticsRequestFactoryProvider, m44621a5);
            this.stripePaymentLauncherProvider = create2;
            Y94<StripePaymentLauncherAssistedFactory> create3 = StripePaymentLauncherAssistedFactory_Impl.create(create2);
            this.stripePaymentLauncherAssistedFactoryProvider = create3;
            this.confirmationManagerProvider = V51.m80429b(ConfirmationManager_Factory.create(create3, this.publishableKeyProvider, this.stripeAccountIdProvider));
            DefaultIntentConfirmationInterceptor_Factory create4 = DefaultIntentConfirmationInterceptor_Factory.create(this.contextProvider, this.stripeRepositoryProvider, this.publishableKeyProvider, this.stripeAccountIdProvider);
            this.defaultIntentConfirmationInterceptorProvider = create4;
            this.bindIntentConfirmationInterceptorProvider = V51.m80429b(create4);
        }

        private VerificationViewModel.Factory injectFactory(VerificationViewModel.Factory factory) {
            VerificationViewModel_Factory_MembersInjector.injectViewModel(factory, verificationViewModel());
            return factory;
        }

        private InlineSignupViewModel.Factory injectFactory2(InlineSignupViewModel.Factory factory) {
            InlineSignupViewModel_Factory_MembersInjector.injectViewModel(factory, inlineSignupViewModel());
            return factory;
        }

        private InlineSignupViewModel inlineSignupViewModel() {
            return new InlineSignupViewModel(this.configuration, this.linkAccountManagerProvider.get(), this.bindLinkEventsReporterProvider.get(), this.provideLoggerProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public VerificationViewModel verificationViewModel() {
            return new VerificationViewModel(this.linkAccountManagerProvider.get(), this.bindLinkEventsReporterProvider.get(), this.navigatorProvider.get(), this.provideLoggerProvider.get());
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent
        public LinkPaymentLauncher.Configuration getConfiguration() {
            return this.configuration;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent
        public LinkAccountManager getLinkAccountManager() {
            return this.linkAccountManagerProvider.get();
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent
        public LinkComponent.Builder getLinkComponentBuilder() {
            return new LinkComponentBuilder(this.linkPaymentLauncherComponentImpl);
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent
        public LinkEventsReporter getLinkEventsReporter() {
            return this.bindLinkEventsReporterProvider.get();
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent
        public void inject(VerificationViewModel.Factory factory) {
            injectFactory(factory);
        }

        private LinkPaymentLauncherComponentImpl(CoreCommonModule coreCommonModule, LinkPaymentLauncher.Configuration configuration, Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, StripeRepository stripeRepository, AddressRepository addressRepository, Boolean bool, Function0<String> function0, Function0<String> function02, Set<String> set) {
            this.linkPaymentLauncherComponentImpl = this;
            this.configuration = configuration;
            this.addressRepository = addressRepository;
            this.context = context;
            initialize(coreCommonModule, configuration, context, coroutineContext, coroutineContext2, paymentAnalyticsRequestFactory, analyticsRequestExecutor, stripeRepository, addressRepository, bool, function0, function02, set);
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent
        public void inject(InlineSignupViewModel.Factory factory) {
            injectFactory2(factory);
        }
    }

    /* loaded from: classes7.dex */
    public static final class SignedInViewModelSubcomponentBuilder implements SignedInViewModelSubcomponent.Builder {
        private LinkAccount linkAccount;
        private final LinkComponentImpl linkComponentImpl;
        private final LinkPaymentLauncherComponentImpl linkPaymentLauncherComponentImpl;

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent.Builder
        public SignedInViewModelSubcomponent build() {
            C51679xZ3.m5006a(this.linkAccount, LinkAccount.class);
            return new SignedInViewModelSubcomponentImpl(this.linkPaymentLauncherComponentImpl, this.linkComponentImpl, this.linkAccount);
        }

        private SignedInViewModelSubcomponentBuilder(LinkPaymentLauncherComponentImpl linkPaymentLauncherComponentImpl, LinkComponentImpl linkComponentImpl) {
            this.linkPaymentLauncherComponentImpl = linkPaymentLauncherComponentImpl;
            this.linkComponentImpl = linkComponentImpl;
        }

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent.Builder
        public SignedInViewModelSubcomponentBuilder linkAccount(LinkAccount linkAccount) {
            this.linkAccount = (LinkAccount) C51679xZ3.m5005b(linkAccount);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class SignedInViewModelSubcomponentImpl implements SignedInViewModelSubcomponent {
        private final LinkAccount linkAccount;
        private final LinkComponentImpl linkComponentImpl;
        private final LinkPaymentLauncherComponentImpl linkPaymentLauncherComponentImpl;
        private final SignedInViewModelSubcomponentImpl signedInViewModelSubcomponentImpl;

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent
        public CardEditViewModel getCardEditViewModel() {
            return new CardEditViewModel(this.linkAccount, (LinkAccountManager) this.linkPaymentLauncherComponentImpl.linkAccountManagerProvider.get(), (Navigator) this.linkPaymentLauncherComponentImpl.navigatorProvider.get(), (Logger) this.linkPaymentLauncherComponentImpl.provideLoggerProvider.get(), this.linkComponentImpl.starterArgs, this.linkComponentImpl.formControllerSubcomponentBuilderProvider);
        }

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent
        public PaymentMethodViewModel getPaymentMethodViewModel() {
            return new PaymentMethodViewModel(this.linkComponentImpl.starterArgs, this.linkAccount, (LinkAccountManager) this.linkPaymentLauncherComponentImpl.linkAccountManagerProvider.get(), (Navigator) this.linkPaymentLauncherComponentImpl.navigatorProvider.get(), (ConfirmationManager) this.linkPaymentLauncherComponentImpl.confirmationManagerProvider.get(), (Logger) this.linkPaymentLauncherComponentImpl.provideLoggerProvider.get(), this.linkComponentImpl.formControllerSubcomponentBuilderProvider, (IntentConfirmationInterceptor) this.linkPaymentLauncherComponentImpl.bindIntentConfirmationInterceptorProvider.get());
        }

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent
        public WalletViewModel getWalletViewModel() {
            return new WalletViewModel(this.linkComponentImpl.starterArgs, (LinkAccountManager) this.linkPaymentLauncherComponentImpl.linkAccountManagerProvider.get(), (Navigator) this.linkPaymentLauncherComponentImpl.navigatorProvider.get(), (ConfirmationManager) this.linkPaymentLauncherComponentImpl.confirmationManagerProvider.get(), (Logger) this.linkPaymentLauncherComponentImpl.provideLoggerProvider.get(), (IntentConfirmationInterceptor) this.linkPaymentLauncherComponentImpl.bindIntentConfirmationInterceptorProvider.get());
        }

        private SignedInViewModelSubcomponentImpl(LinkPaymentLauncherComponentImpl linkPaymentLauncherComponentImpl, LinkComponentImpl linkComponentImpl, LinkAccount linkAccount) {
            this.signedInViewModelSubcomponentImpl = this;
            this.linkPaymentLauncherComponentImpl = linkPaymentLauncherComponentImpl;
            this.linkComponentImpl = linkComponentImpl;
            this.linkAccount = linkAccount;
        }
    }

    private DaggerLinkPaymentLauncherComponent() {
    }

    public static LinkPaymentLauncherComponent.Builder builder() {
        return new Builder();
    }
}
