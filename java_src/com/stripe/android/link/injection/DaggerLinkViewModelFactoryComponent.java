package com.stripe.android.link.injection;

import android.content.Context;
import android.content.res.Resources;
import com.stripe.android.DefaultIntentConfirmationInterceptor;
import com.stripe.android.DefaultIntentConfirmationInterceptor_Factory;
import com.stripe.android.IntentConfirmationInterceptor;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLocaleFactory;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideUIContextFactory;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
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
import com.stripe.android.link.injection.LinkViewModelFactoryComponent;
import com.stripe.android.link.injection.SignedInViewModelSubcomponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.link.model.Navigator_Factory;
import com.stripe.android.link.p042ui.cardedit.CardEditViewModel;
import com.stripe.android.link.p042ui.cardedit.CardEditViewModel_Factory_MembersInjector;
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
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.p049ui.core.FormController;
import com.stripe.android.p049ui.core.elements.LayoutSpec;
import com.stripe.android.p049ui.core.forms.TransformSpecToElements;
import com.stripe.android.p049ui.core.forms.resources.injection.ResourceRepositoryModule_ProvideResourcesFactory;
import com.stripe.android.p049ui.core.injection.FormControllerModule_ProvideTransformSpecToElementsFactory;
import com.stripe.android.p049ui.core.injection.FormControllerSubcomponent;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory_Impl;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncher_Factory;
import com.stripe.android.repository.ConsumersApiService;
import com.stripe.android.uicore.address.AddressRepository;
import com.stripe.android.uicore.address.AddressRepository_Factory;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class DaggerLinkViewModelFactoryComponent {

    /* loaded from: classes7.dex */
    public static final class Builder implements LinkViewModelFactoryComponent.Builder {
        private Context context;
        private Boolean enableLogging;
        private Set<String> productUsage;
        private Function0<String> publishableKeyProvider;
        private LinkActivityContract.Args starterArgs;
        private Function0<String> stripeAccountIdProvider;

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public LinkViewModelFactoryComponent build() {
            C51679xZ3.m5006a(this.context, Context.class);
            C51679xZ3.m5006a(this.enableLogging, Boolean.class);
            C51679xZ3.m5006a(this.publishableKeyProvider, Function0.class);
            C51679xZ3.m5006a(this.stripeAccountIdProvider, Function0.class);
            C51679xZ3.m5006a(this.productUsage, Set.class);
            C51679xZ3.m5006a(this.starterArgs, LinkActivityContract.Args.class);
            return new LinkViewModelFactoryComponentImpl(new CoroutineContextModule(), new CoreCommonModule(), this.context, this.enableLogging, this.publishableKeyProvider, this.stripeAccountIdProvider, this.productUsage, this.starterArgs);
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ LinkViewModelFactoryComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ LinkViewModelFactoryComponent.Builder publishableKeyProvider(Function0 function0) {
            return publishableKeyProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ LinkViewModelFactoryComponent.Builder stripeAccountIdProvider(Function0 function0) {
            return stripeAccountIdProvider((Function0<String>) function0);
        }

        private Builder() {
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) C51679xZ3.m5005b(context);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public Builder enableLogging(boolean z) {
            this.enableLogging = (Boolean) C51679xZ3.m5005b(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) C51679xZ3.m5005b(set);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public Builder publishableKeyProvider(Function0<String> function0) {
            this.publishableKeyProvider = (Function0) C51679xZ3.m5005b(function0);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public Builder starterArgs(LinkActivityContract.Args args) {
            this.starterArgs = (LinkActivityContract.Args) C51679xZ3.m5005b(args);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public Builder stripeAccountIdProvider(Function0<String> function0) {
            this.stripeAccountIdProvider = (Function0) C51679xZ3.m5005b(function0);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class FormControllerSubcomponentBuilder implements FormControllerSubcomponent.Builder {
        private LayoutSpec formSpec;
        private Map<IdentifierSpec, String> initialValues;
        private final LinkViewModelFactoryComponentImpl linkViewModelFactoryComponentImpl;
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
            return new FormControllerSubcomponentImpl(this.linkViewModelFactoryComponentImpl, this.formSpec, this.initialValues, this.shippingValues, this.viewOnlyFields, this.viewModelScope, this.stripeIntent, this.merchantName);
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

        private FormControllerSubcomponentBuilder(LinkViewModelFactoryComponentImpl linkViewModelFactoryComponentImpl) {
            this.linkViewModelFactoryComponentImpl = linkViewModelFactoryComponentImpl;
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
        private final LinkViewModelFactoryComponentImpl linkViewModelFactoryComponentImpl;
        private final String merchantName;
        private final Map<IdentifierSpec, String> shippingValues;
        private final StripeIntent stripeIntent;
        private final Set<IdentifierSpec> viewOnlyFields;

        private TransformSpecToElements transformSpecToElements() {
            return FormControllerModule_ProvideTransformSpecToElementsFactory.provideTransformSpecToElements((AddressRepository) this.linkViewModelFactoryComponentImpl.addressRepositoryProvider.get(), this.linkViewModelFactoryComponentImpl.context, this.merchantName, this.stripeIntent, this.initialValues, this.shippingValues, this.viewOnlyFields);
        }

        @Override // com.stripe.android.p049ui.core.injection.FormControllerSubcomponent
        public FormController getFormController() {
            return new FormController(this.formSpec, transformSpecToElements());
        }

        private FormControllerSubcomponentImpl(LinkViewModelFactoryComponentImpl linkViewModelFactoryComponentImpl, LayoutSpec layoutSpec, Map<IdentifierSpec, String> map, Map<IdentifierSpec, String> map2, Set<IdentifierSpec> set, ZC0 zc0, StripeIntent stripeIntent, String str) {
            this.formControllerSubcomponentImpl = this;
            this.linkViewModelFactoryComponentImpl = linkViewModelFactoryComponentImpl;
            this.formSpec = layoutSpec;
            this.merchantName = str;
            this.stripeIntent = stripeIntent;
            this.initialValues = map;
            this.shippingValues = map2;
            this.viewOnlyFields = set;
        }
    }

    /* loaded from: classes7.dex */
    public static final class LinkViewModelFactoryComponentImpl extends LinkViewModelFactoryComponent {
        private Y94<AddressRepository> addressRepositoryProvider;
        private Y94<IntentConfirmationInterceptor> bindIntentConfirmationInterceptorProvider;
        private Y94<LinkEventsReporter> bindLinkEventsReporterProvider;
        private Y94<ConfirmationManager> confirmationManagerProvider;
        private final Context context;
        private Y94<Context> contextProvider;
        private Y94<CookieStore> cookieStoreProvider;
        private Y94<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Y94<DefaultIntentConfirmationInterceptor> defaultIntentConfirmationInterceptorProvider;
        private Y94<DefaultLinkEventsReporter> defaultLinkEventsReporterProvider;
        private Y94<Boolean> enableLoggingProvider;
        private Y94<EncryptedStore> encryptedStoreProvider;
        private Y94<FormControllerSubcomponent.Builder> formControllerSubcomponentBuilderProvider;
        private Y94<LinkAccountManager> linkAccountManagerProvider;
        private Y94<LinkApiRepository> linkApiRepositoryProvider;
        private final LinkViewModelFactoryComponentImpl linkViewModelFactoryComponentImpl;
        private Y94<Navigator> navigatorProvider;
        private Y94<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private Y94<Set<String>> productUsageProvider;
        private Y94<LinkPaymentLauncher.Configuration> provideConfigurationProvider;
        private Y94<ConsumersApiService> provideConsumersApiServiceProvider;
        private Y94<Locale> provideLocaleProvider;
        private Y94<Logger> provideLoggerProvider;
        private Y94<Resources> provideResourcesProvider;
        private Y94<CoroutineContext> provideUIContextProvider;
        private Y94<CoroutineContext> provideWorkContextProvider;
        private Y94<Function0<String>> publishableKeyProvider;
        private Y94<SignedInViewModelSubcomponent.Builder> signedInViewModelSubcomponentBuilderProvider;
        private final LinkActivityContract.Args starterArgs;
        private Y94<LinkActivityContract.Args> starterArgsProvider;
        private Y94<Function0<String>> stripeAccountIdProvider;
        private Y94<StripeApiRepository> stripeApiRepositoryProvider;
        private Y94<StripePaymentLauncherAssistedFactory> stripePaymentLauncherAssistedFactoryProvider;
        private StripePaymentLauncher_Factory stripePaymentLauncherProvider;

        private void initialize(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Boolean bool, Function0<String> function0, Function0<String> function02, Set<String> set, LinkActivityContract.Args args) {
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(args);
            this.starterArgsProvider = m44621a;
            this.provideConfigurationProvider = V51.m80429b(C18986x95336a07.create(m44621a));
            this.publishableKeyProvider = C39546d52.m44621a(function0);
            this.stripeAccountIdProvider = C39546d52.m44621a(function02);
            this.contextProvider = C39546d52.m44621a(context);
            this.provideWorkContextProvider = V51.m80429b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(set);
            this.productUsageProvider = m44621a2;
            this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(this.contextProvider, this.publishableKeyProvider, m44621a2);
            InterfaceC48812sj1 m44621a3 = C39546d52.m44621a(bool);
            this.enableLoggingProvider = m44621a3;
            Y94<Logger> m80429b = V51.m80429b(CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, m44621a3));
            this.provideLoggerProvider = m80429b;
            DefaultAnalyticsRequestExecutor_Factory create = DefaultAnalyticsRequestExecutor_Factory.create(m80429b, this.provideWorkContextProvider);
            this.defaultAnalyticsRequestExecutorProvider = create;
            this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(this.contextProvider, this.publishableKeyProvider, this.provideWorkContextProvider, this.productUsageProvider, this.paymentAnalyticsRequestFactoryProvider, create, this.provideLoggerProvider);
            this.provideConsumersApiServiceProvider = V51.m80429b(LinkCommonModule_Companion_ProvideConsumersApiServiceFactory.create(this.provideLoggerProvider, this.provideWorkContextProvider));
            Y94<Locale> m80429b2 = V51.m80429b(CoreCommonModule_ProvideLocaleFactory.create(coreCommonModule));
            this.provideLocaleProvider = m80429b2;
            this.linkApiRepositoryProvider = V51.m80429b(LinkApiRepository_Factory.create(this.publishableKeyProvider, this.stripeAccountIdProvider, this.stripeApiRepositoryProvider, this.provideConsumersApiServiceProvider, this.provideWorkContextProvider, m80429b2));
            Y94<EncryptedStore> m80429b3 = V51.m80429b(EncryptedStore_Factory.create(this.contextProvider));
            this.encryptedStoreProvider = m80429b3;
            this.cookieStoreProvider = V51.m80429b(CookieStore_Factory.create(m80429b3));
            DefaultLinkEventsReporter_Factory create2 = DefaultLinkEventsReporter_Factory.create(this.defaultAnalyticsRequestExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, this.provideWorkContextProvider, this.provideLoggerProvider);
            this.defaultLinkEventsReporterProvider = create2;
            Y94<LinkEventsReporter> m80429b4 = V51.m80429b(create2);
            this.bindLinkEventsReporterProvider = m80429b4;
            this.linkAccountManagerProvider = V51.m80429b(LinkAccountManager_Factory.create(this.provideConfigurationProvider, this.linkApiRepositoryProvider, this.cookieStoreProvider, m80429b4));
            this.navigatorProvider = V51.m80429b(Navigator_Factory.create());
            Y94<CoroutineContext> m80429b5 = V51.m80429b(CoroutineContextModule_ProvideUIContextFactory.create(coroutineContextModule));
            this.provideUIContextProvider = m80429b5;
            StripePaymentLauncher_Factory create3 = StripePaymentLauncher_Factory.create(this.contextProvider, this.enableLoggingProvider, this.provideWorkContextProvider, m80429b5, this.stripeApiRepositoryProvider, this.paymentAnalyticsRequestFactoryProvider, this.productUsageProvider);
            this.stripePaymentLauncherProvider = create3;
            Y94<StripePaymentLauncherAssistedFactory> create4 = StripePaymentLauncherAssistedFactory_Impl.create(create3);
            this.stripePaymentLauncherAssistedFactoryProvider = create4;
            this.confirmationManagerProvider = V51.m80429b(ConfirmationManager_Factory.create(create4, this.publishableKeyProvider, this.stripeAccountIdProvider));
            this.signedInViewModelSubcomponentBuilderProvider = new Y94<SignedInViewModelSubcomponent.Builder>() { // from class: com.stripe.android.link.injection.DaggerLinkViewModelFactoryComponent.LinkViewModelFactoryComponentImpl.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.Y94
                public SignedInViewModelSubcomponent.Builder get() {
                    return new SignedInViewModelSubcomponentBuilder(LinkViewModelFactoryComponentImpl.this.linkViewModelFactoryComponentImpl);
                }
            };
            DefaultIntentConfirmationInterceptor_Factory create5 = DefaultIntentConfirmationInterceptor_Factory.create(this.contextProvider, this.stripeApiRepositoryProvider, this.publishableKeyProvider, this.stripeAccountIdProvider);
            this.defaultIntentConfirmationInterceptorProvider = create5;
            this.bindIntentConfirmationInterceptorProvider = V51.m80429b(create5);
            this.formControllerSubcomponentBuilderProvider = new Y94<FormControllerSubcomponent.Builder>() { // from class: com.stripe.android.link.injection.DaggerLinkViewModelFactoryComponent.LinkViewModelFactoryComponentImpl.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.Y94
                public FormControllerSubcomponent.Builder get() {
                    return new FormControllerSubcomponentBuilder(LinkViewModelFactoryComponentImpl.this.linkViewModelFactoryComponentImpl);
                }
            };
            Y94<Resources> m80429b6 = V51.m80429b(ResourceRepositoryModule_ProvideResourcesFactory.create(this.contextProvider));
            this.provideResourcesProvider = m80429b6;
            this.addressRepositoryProvider = V51.m80429b(AddressRepository_Factory.create(m80429b6, this.provideWorkContextProvider));
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
            VerificationViewModel_Factory_MembersInjector.injectViewModel(factory, verificationViewModel());
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
            return new LinkActivityViewModel(this.starterArgs, this.linkAccountManagerProvider.get(), this.navigatorProvider.get(), this.confirmationManagerProvider.get());
        }

        private SignUpViewModel signUpViewModel() {
            return new SignUpViewModel(this.starterArgs, this.linkAccountManagerProvider.get(), this.bindLinkEventsReporterProvider.get(), this.navigatorProvider.get(), this.provideLoggerProvider.get());
        }

        private VerificationViewModel verificationViewModel() {
            return new VerificationViewModel(this.linkAccountManagerProvider.get(), this.bindLinkEventsReporterProvider.get(), this.navigatorProvider.get(), this.provideLoggerProvider.get());
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent
        public void inject(LinkActivityViewModel.Factory factory) {
            injectFactory(factory);
        }

        private LinkViewModelFactoryComponentImpl(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Boolean bool, Function0<String> function0, Function0<String> function02, Set<String> set, LinkActivityContract.Args args) {
            this.linkViewModelFactoryComponentImpl = this;
            this.starterArgs = args;
            this.context = context;
            initialize(coroutineContextModule, coreCommonModule, context, bool, function0, function02, set, args);
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent
        public void inject(SignUpViewModel.Factory factory) {
            injectFactory2(factory);
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent
        public void inject(VerificationViewModel.Factory factory) {
            injectFactory3(factory);
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent
        public void inject(WalletViewModel.Factory factory) {
            injectFactory4(factory);
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent
        public void inject(PaymentMethodViewModel.Factory factory) {
            injectFactory5(factory);
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent
        public void inject(CardEditViewModel.Factory factory) {
            injectFactory6(factory);
        }
    }

    /* loaded from: classes7.dex */
    public static final class SignedInViewModelSubcomponentBuilder implements SignedInViewModelSubcomponent.Builder {
        private LinkAccount linkAccount;
        private final LinkViewModelFactoryComponentImpl linkViewModelFactoryComponentImpl;

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent.Builder
        public SignedInViewModelSubcomponent build() {
            C51679xZ3.m5006a(this.linkAccount, LinkAccount.class);
            return new SignedInViewModelSubcomponentImpl(this.linkViewModelFactoryComponentImpl, this.linkAccount);
        }

        private SignedInViewModelSubcomponentBuilder(LinkViewModelFactoryComponentImpl linkViewModelFactoryComponentImpl) {
            this.linkViewModelFactoryComponentImpl = linkViewModelFactoryComponentImpl;
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
        private final LinkViewModelFactoryComponentImpl linkViewModelFactoryComponentImpl;
        private final SignedInViewModelSubcomponentImpl signedInViewModelSubcomponentImpl;

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent
        public CardEditViewModel getCardEditViewModel() {
            return new CardEditViewModel(this.linkAccount, (LinkAccountManager) this.linkViewModelFactoryComponentImpl.linkAccountManagerProvider.get(), (Navigator) this.linkViewModelFactoryComponentImpl.navigatorProvider.get(), (Logger) this.linkViewModelFactoryComponentImpl.provideLoggerProvider.get(), this.linkViewModelFactoryComponentImpl.starterArgs, this.linkViewModelFactoryComponentImpl.formControllerSubcomponentBuilderProvider);
        }

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent
        public PaymentMethodViewModel getPaymentMethodViewModel() {
            return new PaymentMethodViewModel(this.linkViewModelFactoryComponentImpl.starterArgs, this.linkAccount, (LinkAccountManager) this.linkViewModelFactoryComponentImpl.linkAccountManagerProvider.get(), (Navigator) this.linkViewModelFactoryComponentImpl.navigatorProvider.get(), (ConfirmationManager) this.linkViewModelFactoryComponentImpl.confirmationManagerProvider.get(), (Logger) this.linkViewModelFactoryComponentImpl.provideLoggerProvider.get(), this.linkViewModelFactoryComponentImpl.formControllerSubcomponentBuilderProvider, (IntentConfirmationInterceptor) this.linkViewModelFactoryComponentImpl.bindIntentConfirmationInterceptorProvider.get());
        }

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent
        public WalletViewModel getWalletViewModel() {
            return new WalletViewModel(this.linkViewModelFactoryComponentImpl.starterArgs, (LinkAccountManager) this.linkViewModelFactoryComponentImpl.linkAccountManagerProvider.get(), (Navigator) this.linkViewModelFactoryComponentImpl.navigatorProvider.get(), (ConfirmationManager) this.linkViewModelFactoryComponentImpl.confirmationManagerProvider.get(), (Logger) this.linkViewModelFactoryComponentImpl.provideLoggerProvider.get(), (IntentConfirmationInterceptor) this.linkViewModelFactoryComponentImpl.bindIntentConfirmationInterceptorProvider.get());
        }

        private SignedInViewModelSubcomponentImpl(LinkViewModelFactoryComponentImpl linkViewModelFactoryComponentImpl, LinkAccount linkAccount) {
            this.signedInViewModelSubcomponentImpl = this;
            this.linkViewModelFactoryComponentImpl = linkViewModelFactoryComponentImpl;
            this.linkAccount = linkAccount;
        }
    }

    private DaggerLinkViewModelFactoryComponent() {
    }

    public static LinkViewModelFactoryComponent.Builder builder() {
        return new Builder();
    }
}
