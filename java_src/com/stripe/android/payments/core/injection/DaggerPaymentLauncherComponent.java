package com.stripe.android.payments.core.injection;

import android.content.Context;
import androidx.lifecycle.C11747p;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.ApiRequest_Options_Factory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor_Factory;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor_Factory;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import com.stripe.android.payments.core.injection.PaymentLauncherComponent;
import com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel_Factory_MembersInjector;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class DaggerPaymentLauncherComponent {

    /* loaded from: classes7.dex */
    public static final class Builder implements PaymentLauncherComponent.Builder {
        private PaymentAnalyticsRequestFactory analyticsRequestFactory;
        private Context context;
        private Boolean enableLogging;
        private CoroutineContext ioContext;
        private Set<String> productUsage;
        private Function0<String> publishableKeyProvider;
        private Function0<String> stripeAccountIdProvider;
        private StripeRepository stripeRepository;
        private CoroutineContext uiContext;

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public PaymentLauncherComponent build() {
            C51679xZ3.m5006a(this.context, Context.class);
            C51679xZ3.m5006a(this.enableLogging, Boolean.class);
            C51679xZ3.m5006a(this.ioContext, CoroutineContext.class);
            C51679xZ3.m5006a(this.uiContext, CoroutineContext.class);
            C51679xZ3.m5006a(this.stripeRepository, StripeRepository.class);
            C51679xZ3.m5006a(this.analyticsRequestFactory, PaymentAnalyticsRequestFactory.class);
            C51679xZ3.m5006a(this.publishableKeyProvider, Function0.class);
            C51679xZ3.m5006a(this.stripeAccountIdProvider, Function0.class);
            C51679xZ3.m5006a(this.productUsage, Set.class);
            return new PaymentLauncherComponentImpl(new PaymentLauncherModule(), new CoreCommonModule(), this.context, this.enableLogging, this.ioContext, this.uiContext, this.stripeRepository, this.analyticsRequestFactory, this.publishableKeyProvider, this.stripeAccountIdProvider, this.productUsage);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public /* bridge */ /* synthetic */ PaymentLauncherComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public /* bridge */ /* synthetic */ PaymentLauncherComponent.Builder publishableKeyProvider(Function0 function0) {
            return publishableKeyProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public /* bridge */ /* synthetic */ PaymentLauncherComponent.Builder stripeAccountIdProvider(Function0 function0) {
            return stripeAccountIdProvider((Function0<String>) function0);
        }

        private Builder() {
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public Builder analyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
            this.analyticsRequestFactory = (PaymentAnalyticsRequestFactory) C51679xZ3.m5005b(paymentAnalyticsRequestFactory);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) C51679xZ3.m5005b(context);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public Builder enableLogging(boolean z) {
            this.enableLogging = (Boolean) C51679xZ3.m5005b(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public Builder ioContext(CoroutineContext coroutineContext) {
            this.ioContext = (CoroutineContext) C51679xZ3.m5005b(coroutineContext);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) C51679xZ3.m5005b(set);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public Builder publishableKeyProvider(Function0<String> function0) {
            this.publishableKeyProvider = (Function0) C51679xZ3.m5005b(function0);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public Builder stripeAccountIdProvider(Function0<String> function0) {
            this.stripeAccountIdProvider = (Function0) C51679xZ3.m5005b(function0);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public Builder stripeRepository(StripeRepository stripeRepository) {
            this.stripeRepository = (StripeRepository) C51679xZ3.m5005b(stripeRepository);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public Builder uiContext(CoroutineContext coroutineContext) {
            this.uiContext = (CoroutineContext) C51679xZ3.m5005b(coroutineContext);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class PaymentLauncherComponentImpl implements PaymentLauncherComponent {
        private final PaymentAnalyticsRequestFactory analyticsRequestFactory;
        private Y94<PaymentAnalyticsRequestFactory> analyticsRequestFactoryProvider;
        private final Context context;
        private Y94<Context> contextProvider;
        private Y94<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Y94<Boolean> enableLoggingProvider;
        private final CoroutineContext ioContext;
        private Y94<CoroutineContext> ioContextProvider;
        private Y94<PaymentIntentFlowResultProcessor> paymentIntentFlowResultProcessorProvider;
        private final PaymentLauncherComponentImpl paymentLauncherComponentImpl;
        private final PaymentLauncherModule paymentLauncherModule;
        private Y94<PaymentLauncherViewModelSubcomponent.Builder> paymentLauncherViewModelSubcomponentBuilderProvider;
        private Y94<Set<String>> productUsageProvider;
        private Y94<DefaultReturnUrl> provideDefaultReturnUrlProvider;
        private Y94<Boolean> provideIsInstantAppProvider;
        private Y94<Logger> provideLoggerProvider;
        private Y94<PaymentAuthenticatorRegistry> providePaymentAuthenticatorRegistryProvider;
        private Y94<Map<String, String>> provideThreeDs1IntentReturnUrlMapProvider;
        private Y94<Function0<String>> publishableKeyProvider;
        private Y94<SetupIntentFlowResultProcessor> setupIntentFlowResultProcessorProvider;
        private Y94<Function0<String>> stripeAccountIdProvider;
        private final StripeRepository stripeRepository;
        private Y94<StripeRepository> stripeRepositoryProvider;
        private final CoroutineContext uiContext;
        private Y94<CoroutineContext> uiContextProvider;

        /* JADX INFO: Access modifiers changed from: private */
        public DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.ioContext);
        }

        private void initialize(PaymentLauncherModule paymentLauncherModule, CoreCommonModule coreCommonModule, Context context, Boolean bool, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, StripeRepository stripeRepository, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Function0<String> function0, Function0<String> function02, Set<String> set) {
            this.contextProvider = C39546d52.m44621a(context);
            this.stripeRepositoryProvider = C39546d52.m44621a(stripeRepository);
            this.enableLoggingProvider = C39546d52.m44621a(bool);
            this.ioContextProvider = C39546d52.m44621a(coroutineContext);
            this.uiContextProvider = C39546d52.m44621a(coroutineContext2);
            this.provideThreeDs1IntentReturnUrlMapProvider = V51.m80429b(PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory.create(paymentLauncherModule));
            Y94<Logger> m80429b = V51.m80429b(CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, this.enableLoggingProvider));
            this.provideLoggerProvider = m80429b;
            this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(m80429b, this.ioContextProvider);
            this.analyticsRequestFactoryProvider = C39546d52.m44621a(paymentAnalyticsRequestFactory);
            this.publishableKeyProvider = C39546d52.m44621a(function0);
            this.productUsageProvider = C39546d52.m44621a(set);
            PaymentLauncherModule_ProvideIsInstantAppFactory create = PaymentLauncherModule_ProvideIsInstantAppFactory.create(paymentLauncherModule, this.contextProvider);
            this.provideIsInstantAppProvider = create;
            this.providePaymentAuthenticatorRegistryProvider = V51.m80429b(PaymentLauncherModule_ProvidePaymentAuthenticatorRegistryFactory.create(paymentLauncherModule, this.contextProvider, this.stripeRepositoryProvider, this.enableLoggingProvider, this.ioContextProvider, this.uiContextProvider, this.provideThreeDs1IntentReturnUrlMapProvider, this.defaultAnalyticsRequestExecutorProvider, this.analyticsRequestFactoryProvider, this.publishableKeyProvider, this.productUsageProvider, create));
            this.paymentLauncherViewModelSubcomponentBuilderProvider = new Y94<PaymentLauncherViewModelSubcomponent.Builder>() { // from class: com.stripe.android.payments.core.injection.DaggerPaymentLauncherComponent.PaymentLauncherComponentImpl.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.Y94
                public PaymentLauncherViewModelSubcomponent.Builder get() {
                    return new PaymentLauncherViewModelSubcomponentBuilder(PaymentLauncherComponentImpl.this.paymentLauncherComponentImpl);
                }
            };
            this.provideDefaultReturnUrlProvider = V51.m80429b(PaymentLauncherModule_ProvideDefaultReturnUrlFactory.create(paymentLauncherModule, this.contextProvider));
            this.stripeAccountIdProvider = C39546d52.m44621a(function02);
            this.paymentIntentFlowResultProcessorProvider = V51.m80429b(PaymentIntentFlowResultProcessor_Factory.create(this.contextProvider, this.publishableKeyProvider, this.stripeRepositoryProvider, this.provideLoggerProvider, this.ioContextProvider));
            this.setupIntentFlowResultProcessorProvider = V51.m80429b(SetupIntentFlowResultProcessor_Factory.create(this.contextProvider, this.publishableKeyProvider, this.stripeRepositoryProvider, this.provideLoggerProvider, this.ioContextProvider));
        }

        private PaymentLauncherViewModel.Factory injectFactory(PaymentLauncherViewModel.Factory factory) {
            PaymentLauncherViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.paymentLauncherViewModelSubcomponentBuilderProvider);
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean namedBoolean() {
            return this.paymentLauncherModule.provideIsInstantApp(this.context);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent
        public PaymentAuthenticatorRegistry getAuthenticatorRegistry() {
            return this.providePaymentAuthenticatorRegistryProvider.get();
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent
        public void inject(PaymentLauncherViewModel.Factory factory) {
            injectFactory(factory);
        }

        private PaymentLauncherComponentImpl(PaymentLauncherModule paymentLauncherModule, CoreCommonModule coreCommonModule, Context context, Boolean bool, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, StripeRepository stripeRepository, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Function0<String> function0, Function0<String> function02, Set<String> set) {
            this.paymentLauncherComponentImpl = this;
            this.stripeRepository = stripeRepository;
            this.ioContext = coroutineContext;
            this.analyticsRequestFactory = paymentAnalyticsRequestFactory;
            this.uiContext = coroutineContext2;
            this.context = context;
            this.paymentLauncherModule = paymentLauncherModule;
            initialize(paymentLauncherModule, coreCommonModule, context, bool, coroutineContext, coroutineContext2, stripeRepository, paymentAnalyticsRequestFactory, function0, function02, set);
        }
    }

    /* loaded from: classes7.dex */
    public static final class PaymentLauncherViewModelSubcomponentBuilder implements PaymentLauncherViewModelSubcomponent.Builder {
        private Boolean isPaymentIntent;
        private final PaymentLauncherComponentImpl paymentLauncherComponentImpl;
        private C11747p savedStateHandle;

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.Builder
        public PaymentLauncherViewModelSubcomponent build() {
            C51679xZ3.m5006a(this.isPaymentIntent, Boolean.class);
            C51679xZ3.m5006a(this.savedStateHandle, C11747p.class);
            return new PaymentLauncherViewModelSubcomponentImpl(this.paymentLauncherComponentImpl, this.isPaymentIntent, this.savedStateHandle);
        }

        private PaymentLauncherViewModelSubcomponentBuilder(PaymentLauncherComponentImpl paymentLauncherComponentImpl) {
            this.paymentLauncherComponentImpl = paymentLauncherComponentImpl;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.Builder
        public PaymentLauncherViewModelSubcomponentBuilder isPaymentIntent(boolean z) {
            this.isPaymentIntent = (Boolean) C51679xZ3.m5005b(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.Builder
        public PaymentLauncherViewModelSubcomponentBuilder savedStateHandle(C11747p c11747p) {
            this.savedStateHandle = (C11747p) C51679xZ3.m5005b(c11747p);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class PaymentLauncherViewModelSubcomponentImpl implements PaymentLauncherViewModelSubcomponent {
        private final Boolean isPaymentIntent;
        private Y94<ApiRequest.Options> optionsProvider;
        private final PaymentLauncherComponentImpl paymentLauncherComponentImpl;
        private final PaymentLauncherViewModelSubcomponentImpl paymentLauncherViewModelSubcomponentImpl;
        private final C11747p savedStateHandle;

        private void initialize(Boolean bool, C11747p c11747p) {
            this.optionsProvider = ApiRequest_Options_Factory.create(this.paymentLauncherComponentImpl.publishableKeyProvider, this.paymentLauncherComponentImpl.stripeAccountIdProvider);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent
        public PaymentLauncherViewModel getViewModel() {
            return new PaymentLauncherViewModel(this.isPaymentIntent.booleanValue(), this.paymentLauncherComponentImpl.stripeRepository, (PaymentAuthenticatorRegistry) this.paymentLauncherComponentImpl.providePaymentAuthenticatorRegistryProvider.get(), (DefaultReturnUrl) this.paymentLauncherComponentImpl.provideDefaultReturnUrlProvider.get(), this.optionsProvider, (Map) this.paymentLauncherComponentImpl.provideThreeDs1IntentReturnUrlMapProvider.get(), V51.m80430a(this.paymentLauncherComponentImpl.paymentIntentFlowResultProcessorProvider), V51.m80430a(this.paymentLauncherComponentImpl.setupIntentFlowResultProcessorProvider), this.paymentLauncherComponentImpl.defaultAnalyticsRequestExecutor(), this.paymentLauncherComponentImpl.analyticsRequestFactory, this.paymentLauncherComponentImpl.uiContext, this.savedStateHandle, this.paymentLauncherComponentImpl.namedBoolean());
        }

        private PaymentLauncherViewModelSubcomponentImpl(PaymentLauncherComponentImpl paymentLauncherComponentImpl, Boolean bool, C11747p c11747p) {
            this.paymentLauncherViewModelSubcomponentImpl = this;
            this.paymentLauncherComponentImpl = paymentLauncherComponentImpl;
            this.isPaymentIntent = bool;
            this.savedStateHandle = c11747p;
            initialize(bool, c11747p);
        }
    }

    private DaggerPaymentLauncherComponent() {
    }

    public static PaymentLauncherComponent.Builder builder() {
        return new Builder();
    }
}
