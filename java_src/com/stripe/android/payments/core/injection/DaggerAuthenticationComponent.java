package com.stripe.android.payments.core.injection;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C11747p;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.core.networking.RetryDelaySupplier_Factory;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry_Factory;
import com.stripe.android.payments.core.authentication.NoOpIntentAuthenticator;
import com.stripe.android.payments.core.authentication.NoOpIntentAuthenticator_Factory;
import com.stripe.android.payments.core.authentication.OxxoAuthenticator;
import com.stripe.android.payments.core.authentication.OxxoAuthenticator_Factory;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.payments.core.authentication.SourceAuthenticator;
import com.stripe.android.payments.core.authentication.SourceAuthenticator_Factory;
import com.stripe.android.payments.core.authentication.UnsupportedAuthenticator;
import com.stripe.android.payments.core.authentication.UnsupportedAuthenticator_Factory;
import com.stripe.android.payments.core.authentication.WebIntentAuthenticator;
import com.stripe.android.payments.core.authentication.WebIntentAuthenticator_Factory;
import com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor;
import com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor_Factory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3DS2Authenticator;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3DS2Authenticator_Factory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2ChallengeResultProcessor;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory_MembersInjector;
import com.stripe.android.payments.core.injection.AuthenticationComponent;
import com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* loaded from: classes7.dex */
public final class DaggerAuthenticationComponent {

    /* loaded from: classes7.dex */
    public static final class AuthenticationComponentImpl implements AuthenticationComponent {
        private final AnalyticsRequestExecutor analyticsRequestExecutor;
        private Y94<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
        private final PaymentAnalyticsRequestFactory analyticsRequestFactory;
        private Y94<PaymentAnalyticsRequestFactory> analyticsRequestFactoryProvider;
        private final AuthenticationComponentImpl authenticationComponentImpl;
        private Y94<Context> contextProvider;
        private Y94<DefaultPaymentAuthenticatorRegistry> defaultPaymentAuthenticatorRegistryProvider;
        private Y94<DefaultStripe3ds2ChallengeResultProcessor> defaultStripe3ds2ChallengeResultProcessorProvider;
        private Y94<Boolean> enableLoggingProvider;
        private Y94<String> injectorKeyProvider;

        /* renamed from: intentAuthenticatorMapMapOfClassOfAndPaymentAuthenticatorOfStripeIntentProvider */
        private Y94<Map<Class<? extends StripeIntent.NextActionData>, PaymentAuthenticator<StripeIntent>>> f75400x21b1e314;
        private final Boolean isInstantApp;
        private Y94<Boolean> isInstantAppProvider;
        private Y94<NoOpIntentAuthenticator> noOpIntentAuthenticatorProvider;
        private Y94<OxxoAuthenticator> oxxoAuthenticatorProvider;
        private Y94<Set<String>> productUsageProvider;
        private Y94<DefaultReturnUrl> provideDefaultReturnUrlProvider;
        private Y94<Logger> provideLoggerProvider;
        private Y94<MessageVersionRegistry> provideMessageVersionRegistryProvider;
        private Y94<PaymentAuthConfig> providePaymentAuthConfigProvider;
        private Y94<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> providePaymentBrowserAuthStarterFactoryProvider;
        private Y94<Function1<AuthActivityStarterHost, PaymentRelayStarter>> providePaymentRelayStarterFactoryProvider;
        private Y94<StripeThreeDs2Service> provideStripeThreeDs2ServiceProvider;
        private Y94<PaymentAuthenticator<StripeIntent>> provideWeChatAuthenticator$payments_core_releaseProvider;
        private Y94<Function0<String>> publishableKeyProvider;
        private Y94<RetryDelaySupplier> retryDelaySupplierProvider;
        private Y94<SourceAuthenticator> sourceAuthenticatorProvider;
        private Y94<Stripe3DS2Authenticator> stripe3DS2AuthenticatorProvider;
        private final StripeRepository stripeRepository;
        private Y94<StripeRepository> stripeRepositoryProvider;
        private Y94<Map<String, String>> threeDs1IntentReturnUrlMapProvider;
        private Y94<CoroutineContext> uiContextProvider;
        private Y94<UnsupportedAuthenticator> unsupportedAuthenticatorProvider;
        private Y94<WebIntentAuthenticator> webIntentAuthenticatorProvider;
        private final CoroutineContext workContext;
        private Y94<CoroutineContext> workContextProvider;

        private void initialize(WeChatPayAuthenticatorModule weChatPayAuthenticatorModule, CoreCommonModule coreCommonModule, Context context, StripeRepository stripeRepository, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Boolean bool, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Map<String, String> map, String str, Function0<String> function0, Set<String> set, Boolean bool2) {
            C52269yZ0 c52269yZ0 = new C52269yZ0();
            this.defaultPaymentAuthenticatorRegistryProvider = c52269yZ0;
            Y94<Function1<AuthActivityStarterHost, PaymentRelayStarter>> m80429b = V51.m80429b(C19122x9513de11.create(c52269yZ0));
            this.providePaymentRelayStarterFactoryProvider = m80429b;
            this.noOpIntentAuthenticatorProvider = V51.m80429b(NoOpIntentAuthenticator_Factory.create(m80429b));
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(context);
            this.contextProvider = m44621a;
            Y94<DefaultReturnUrl> m80429b2 = V51.m80429b(AuthenticationModule_Companion_ProvideDefaultReturnUrlFactory.create(m44621a));
            this.provideDefaultReturnUrlProvider = m80429b2;
            this.providePaymentBrowserAuthStarterFactoryProvider = V51.m80429b(C19121xba4dded2.create(this.defaultPaymentAuthenticatorRegistryProvider, m80429b2));
            this.analyticsRequestExecutorProvider = C39546d52.m44621a(analyticsRequestExecutor);
            this.analyticsRequestFactoryProvider = C39546d52.m44621a(paymentAnalyticsRequestFactory);
            this.enableLoggingProvider = C39546d52.m44621a(bool);
            this.uiContextProvider = C39546d52.m44621a(coroutineContext2);
            this.publishableKeyProvider = C39546d52.m44621a(function0);
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(bool2);
            this.isInstantAppProvider = m44621a2;
            this.sourceAuthenticatorProvider = V51.m80429b(SourceAuthenticator_Factory.create(this.providePaymentBrowserAuthStarterFactoryProvider, this.providePaymentRelayStarterFactoryProvider, this.analyticsRequestExecutorProvider, this.analyticsRequestFactoryProvider, this.enableLoggingProvider, this.uiContextProvider, this.publishableKeyProvider, m44621a2));
            Y94<UnsupportedAuthenticator> m80429b3 = V51.m80429b(UnsupportedAuthenticator_Factory.create(this.providePaymentRelayStarterFactoryProvider));
            this.unsupportedAuthenticatorProvider = m80429b3;
            this.provideWeChatAuthenticator$payments_core_releaseProvider = C19129x9cb01267.create(weChatPayAuthenticatorModule, m80429b3);
            InterfaceC48812sj1 m44621a3 = C39546d52.m44621a(map);
            this.threeDs1IntentReturnUrlMapProvider = m44621a3;
            Y94<WebIntentAuthenticator> m80429b4 = V51.m80429b(WebIntentAuthenticator_Factory.create(this.providePaymentBrowserAuthStarterFactoryProvider, this.analyticsRequestExecutorProvider, this.analyticsRequestFactoryProvider, this.enableLoggingProvider, this.uiContextProvider, m44621a3, this.publishableKeyProvider, this.isInstantAppProvider, this.provideDefaultReturnUrlProvider));
            this.webIntentAuthenticatorProvider = m80429b4;
            this.oxxoAuthenticatorProvider = V51.m80429b(OxxoAuthenticator_Factory.create(m80429b4, this.noOpIntentAuthenticatorProvider));
            this.providePaymentAuthConfigProvider = V51.m80429b(C19125x7280dc93.create());
            this.injectorKeyProvider = C39546d52.m44621a(str);
            InterfaceC48812sj1 m44621a4 = C39546d52.m44621a(set);
            this.productUsageProvider = m44621a4;
            this.stripe3DS2AuthenticatorProvider = V51.m80429b(Stripe3DS2Authenticator_Factory.create(this.providePaymentAuthConfigProvider, this.enableLoggingProvider, this.injectorKeyProvider, this.publishableKeyProvider, m44621a4));
            C47394qK2 m17608b = C47394qK2.m17610b(7).m17607c(StripeIntent.NextActionData.WeChatPayRedirect.class, this.provideWeChatAuthenticator$payments_core_releaseProvider).m17607c(StripeIntent.NextActionData.SdkData.Use3DS1.class, this.webIntentAuthenticatorProvider).m17607c(StripeIntent.NextActionData.RedirectToUrl.class, this.webIntentAuthenticatorProvider).m17607c(StripeIntent.NextActionData.AlipayRedirect.class, this.webIntentAuthenticatorProvider).m17607c(StripeIntent.NextActionData.DisplayOxxoDetails.class, this.oxxoAuthenticatorProvider).m17607c(StripeIntent.NextActionData.CashAppRedirect.class, this.webIntentAuthenticatorProvider).m17607c(StripeIntent.NextActionData.SdkData.Use3DS2.class, this.stripe3DS2AuthenticatorProvider).m17608b();
            this.f75400x21b1e314 = m17608b;
            C52269yZ0.m3261a(this.defaultPaymentAuthenticatorRegistryProvider, V51.m80429b(DefaultPaymentAuthenticatorRegistry_Factory.create(this.noOpIntentAuthenticatorProvider, this.sourceAuthenticatorProvider, m17608b)));
            InterfaceC48812sj1 m44621a5 = C39546d52.m44621a(coroutineContext);
            this.workContextProvider = m44621a5;
            this.provideStripeThreeDs2ServiceProvider = V51.m80429b(C19127xd3c74c43.create(this.contextProvider, this.enableLoggingProvider, m44621a5));
            this.provideMessageVersionRegistryProvider = V51.m80429b(C19126x9e4b19e0.create());
            this.stripeRepositoryProvider = C39546d52.m44621a(stripeRepository);
            this.retryDelaySupplierProvider = V51.m80429b(RetryDelaySupplier_Factory.create());
            Y94<Logger> m80429b5 = V51.m80429b(CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, this.enableLoggingProvider));
            this.provideLoggerProvider = m80429b5;
            this.defaultStripe3ds2ChallengeResultProcessorProvider = V51.m80429b(DefaultStripe3ds2ChallengeResultProcessor_Factory.create(this.stripeRepositoryProvider, this.analyticsRequestExecutorProvider, this.analyticsRequestFactoryProvider, this.retryDelaySupplierProvider, m80429b5, this.workContextProvider));
        }

        private Stripe3ds2TransactionViewModelFactory injectStripe3ds2TransactionViewModelFactory(Stripe3ds2TransactionViewModelFactory stripe3ds2TransactionViewModelFactory) {
            Stripe3ds2TransactionViewModelFactory_MembersInjector.injectSubComponentBuilder(stripe3ds2TransactionViewModelFactory, new Stripe3ds2TransactionViewModelSubcomponentBuilder(this.authenticationComponentImpl));
            return stripe3ds2TransactionViewModelFactory;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent
        public DefaultPaymentAuthenticatorRegistry getRegistry() {
            return this.defaultPaymentAuthenticatorRegistryProvider.get();
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent
        public void inject(Stripe3ds2TransactionViewModelFactory stripe3ds2TransactionViewModelFactory) {
            injectStripe3ds2TransactionViewModelFactory(stripe3ds2TransactionViewModelFactory);
        }

        private AuthenticationComponentImpl(WeChatPayAuthenticatorModule weChatPayAuthenticatorModule, CoreCommonModule coreCommonModule, Context context, StripeRepository stripeRepository, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Boolean bool, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Map<String, String> map, String str, Function0<String> function0, Set<String> set, Boolean bool2) {
            this.authenticationComponentImpl = this;
            this.stripeRepository = stripeRepository;
            this.analyticsRequestExecutor = analyticsRequestExecutor;
            this.analyticsRequestFactory = paymentAnalyticsRequestFactory;
            this.workContext = coroutineContext;
            this.isInstantApp = bool2;
            initialize(weChatPayAuthenticatorModule, coreCommonModule, context, stripeRepository, analyticsRequestExecutor, paymentAnalyticsRequestFactory, bool, coroutineContext, coroutineContext2, map, str, function0, set, bool2);
        }
    }

    /* loaded from: classes7.dex */
    public static final class Builder implements AuthenticationComponent.Builder {
        private AnalyticsRequestExecutor analyticsRequestExecutor;
        private PaymentAnalyticsRequestFactory analyticsRequestFactory;
        private Context context;
        private Boolean enableLogging;
        private String injectorKey;
        private Boolean isInstantApp;
        private Set<String> productUsage;
        private Function0<String> publishableKeyProvider;
        private StripeRepository stripeRepository;
        private Map<String, String> threeDs1IntentReturnUrlMap;
        private CoroutineContext uiContext;
        private CoroutineContext workContext;

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public AuthenticationComponent build() {
            C51679xZ3.m5006a(this.context, Context.class);
            C51679xZ3.m5006a(this.stripeRepository, StripeRepository.class);
            C51679xZ3.m5006a(this.analyticsRequestExecutor, AnalyticsRequestExecutor.class);
            C51679xZ3.m5006a(this.analyticsRequestFactory, PaymentAnalyticsRequestFactory.class);
            C51679xZ3.m5006a(this.enableLogging, Boolean.class);
            C51679xZ3.m5006a(this.workContext, CoroutineContext.class);
            C51679xZ3.m5006a(this.uiContext, CoroutineContext.class);
            C51679xZ3.m5006a(this.threeDs1IntentReturnUrlMap, Map.class);
            C51679xZ3.m5006a(this.injectorKey, String.class);
            C51679xZ3.m5006a(this.publishableKeyProvider, Function0.class);
            C51679xZ3.m5006a(this.productUsage, Set.class);
            C51679xZ3.m5006a(this.isInstantApp, Boolean.class);
            return new AuthenticationComponentImpl(new WeChatPayAuthenticatorModule(), new CoreCommonModule(), this.context, this.stripeRepository, this.analyticsRequestExecutor, this.analyticsRequestFactory, this.enableLogging, this.workContext, this.uiContext, this.threeDs1IntentReturnUrlMap, this.injectorKey, this.publishableKeyProvider, this.productUsage, this.isInstantApp);
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public /* bridge */ /* synthetic */ AuthenticationComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public /* bridge */ /* synthetic */ AuthenticationComponent.Builder publishableKeyProvider(Function0 function0) {
            return publishableKeyProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public /* bridge */ /* synthetic */ AuthenticationComponent.Builder threeDs1IntentReturnUrlMap(Map map) {
            return threeDs1IntentReturnUrlMap((Map<String, String>) map);
        }

        private Builder() {
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder analyticsRequestExecutor(AnalyticsRequestExecutor analyticsRequestExecutor) {
            this.analyticsRequestExecutor = (AnalyticsRequestExecutor) C51679xZ3.m5005b(analyticsRequestExecutor);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder analyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
            this.analyticsRequestFactory = (PaymentAnalyticsRequestFactory) C51679xZ3.m5005b(paymentAnalyticsRequestFactory);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) C51679xZ3.m5005b(context);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder enableLogging(boolean z) {
            this.enableLogging = (Boolean) C51679xZ3.m5005b(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder injectorKey(String str) {
            this.injectorKey = (String) C51679xZ3.m5005b(str);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder isInstantApp(boolean z) {
            this.isInstantApp = (Boolean) C51679xZ3.m5005b(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) C51679xZ3.m5005b(set);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder publishableKeyProvider(Function0<String> function0) {
            this.publishableKeyProvider = (Function0) C51679xZ3.m5005b(function0);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder stripeRepository(StripeRepository stripeRepository) {
            this.stripeRepository = (StripeRepository) C51679xZ3.m5005b(stripeRepository);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder threeDs1IntentReturnUrlMap(Map<String, String> map) {
            this.threeDs1IntentReturnUrlMap = (Map) C51679xZ3.m5005b(map);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder uiContext(CoroutineContext coroutineContext) {
            this.uiContext = (CoroutineContext) C51679xZ3.m5005b(coroutineContext);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder workContext(CoroutineContext coroutineContext) {
            this.workContext = (CoroutineContext) C51679xZ3.m5005b(coroutineContext);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class Stripe3ds2TransactionViewModelSubcomponentBuilder implements Stripe3ds2TransactionViewModelSubcomponent.Builder {
        private Application application;
        private Stripe3ds2TransactionContract.Args args;
        private final AuthenticationComponentImpl authenticationComponentImpl;
        private C11747p savedStateHandle;

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder
        public Stripe3ds2TransactionViewModelSubcomponent build() {
            C51679xZ3.m5006a(this.args, Stripe3ds2TransactionContract.Args.class);
            C51679xZ3.m5006a(this.savedStateHandle, C11747p.class);
            C51679xZ3.m5006a(this.application, Application.class);
            return new Stripe3ds2TransactionViewModelSubcomponentImpl(this.authenticationComponentImpl, new Stripe3dsTransactionViewModelModule(), this.args, this.savedStateHandle, this.application);
        }

        private Stripe3ds2TransactionViewModelSubcomponentBuilder(AuthenticationComponentImpl authenticationComponentImpl) {
            this.authenticationComponentImpl = authenticationComponentImpl;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder
        public Stripe3ds2TransactionViewModelSubcomponentBuilder application(Application application) {
            this.application = (Application) C51679xZ3.m5005b(application);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder
        public Stripe3ds2TransactionViewModelSubcomponentBuilder args(Stripe3ds2TransactionContract.Args args) {
            this.args = (Stripe3ds2TransactionContract.Args) C51679xZ3.m5005b(args);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder
        public Stripe3ds2TransactionViewModelSubcomponentBuilder savedStateHandle(C11747p c11747p) {
            this.savedStateHandle = (C11747p) C51679xZ3.m5005b(c11747p);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class Stripe3ds2TransactionViewModelSubcomponentImpl implements Stripe3ds2TransactionViewModelSubcomponent {
        private final Application application;
        private final Stripe3ds2TransactionContract.Args args;
        private final AuthenticationComponentImpl authenticationComponentImpl;
        private final C11747p savedStateHandle;
        private final Stripe3ds2TransactionViewModelSubcomponentImpl stripe3ds2TransactionViewModelSubcomponentImpl;
        private final Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule;

        private InitChallengeRepository initChallengeRepository() {
            return C19128x3d138ab7.providesInitChallengeRepository(this.stripe3dsTransactionViewModelModule, this.application, this.args, this.authenticationComponentImpl.workContext);
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent
        public Stripe3ds2TransactionViewModel getViewModel() {
            return new Stripe3ds2TransactionViewModel(this.args, this.authenticationComponentImpl.stripeRepository, this.authenticationComponentImpl.analyticsRequestExecutor, this.authenticationComponentImpl.analyticsRequestFactory, (StripeThreeDs2Service) this.authenticationComponentImpl.provideStripeThreeDs2ServiceProvider.get(), (MessageVersionRegistry) this.authenticationComponentImpl.provideMessageVersionRegistryProvider.get(), (Stripe3ds2ChallengeResultProcessor) this.authenticationComponentImpl.defaultStripe3ds2ChallengeResultProcessorProvider.get(), initChallengeRepository(), this.authenticationComponentImpl.workContext, this.savedStateHandle, this.authenticationComponentImpl.isInstantApp.booleanValue());
        }

        private Stripe3ds2TransactionViewModelSubcomponentImpl(AuthenticationComponentImpl authenticationComponentImpl, Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule, Stripe3ds2TransactionContract.Args args, C11747p c11747p, Application application) {
            this.stripe3ds2TransactionViewModelSubcomponentImpl = this;
            this.authenticationComponentImpl = authenticationComponentImpl;
            this.args = args;
            this.stripe3dsTransactionViewModelModule = stripe3dsTransactionViewModelModule;
            this.application = application;
            this.savedStateHandle = c11747p;
        }
    }

    private DaggerAuthenticationComponent() {
    }

    public static AuthenticationComponent.Builder builder() {
        return new Builder();
    }
}
