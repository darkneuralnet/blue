package com.stripe.android.payments.core.injection;

import android.content.Context;
import androidx.lifecycle.C11747p;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideUIContextFactory;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.ApiRequest_Options_Factory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor_Factory;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor_Factory;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent;
import com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel_Factory_MembersInjector;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class DaggerPaymentLauncherViewModelFactoryComponent {

    /* loaded from: classes7.dex */
    public static final class Builder implements PaymentLauncherViewModelFactoryComponent.Builder {
        private Context context;
        private Boolean enableLogging;
        private Set<String> productUsage;
        private Function0<String> publishableKeyProvider;
        private Function0<String> stripeAccountIdProvider;

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public PaymentLauncherViewModelFactoryComponent build() {
            C51679xZ3.m5006a(this.context, Context.class);
            C51679xZ3.m5006a(this.enableLogging, Boolean.class);
            C51679xZ3.m5006a(this.publishableKeyProvider, Function0.class);
            C51679xZ3.m5006a(this.stripeAccountIdProvider, Function0.class);
            C51679xZ3.m5006a(this.productUsage, Set.class);
            return new PaymentLauncherViewModelFactoryComponentImpl(new PaymentLauncherModule(), new CoroutineContextModule(), new CoreCommonModule(), this.context, this.enableLogging, this.publishableKeyProvider, this.stripeAccountIdProvider, this.productUsage);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ PaymentLauncherViewModelFactoryComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ PaymentLauncherViewModelFactoryComponent.Builder publishableKeyProvider(Function0 function0) {
            return publishableKeyProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ PaymentLauncherViewModelFactoryComponent.Builder stripeAccountIdProvider(Function0 function0) {
            return stripeAccountIdProvider((Function0<String>) function0);
        }

        private Builder() {
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) C51679xZ3.m5005b(context);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public Builder enableLogging(boolean z) {
            this.enableLogging = (Boolean) C51679xZ3.m5005b(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) C51679xZ3.m5005b(set);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public Builder publishableKeyProvider(Function0<String> function0) {
            this.publishableKeyProvider = (Function0) C51679xZ3.m5005b(function0);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public Builder stripeAccountIdProvider(Function0<String> function0) {
            this.stripeAccountIdProvider = (Function0) C51679xZ3.m5005b(function0);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class PaymentLauncherViewModelFactoryComponentImpl implements PaymentLauncherViewModelFactoryComponent {
        private final Context context;
        private Y94<Context> contextProvider;
        private Y94<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Y94<Boolean> enableLoggingProvider;
        private Y94<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private Y94<PaymentIntentFlowResultProcessor> paymentIntentFlowResultProcessorProvider;
        private final PaymentLauncherModule paymentLauncherModule;
        private final PaymentLauncherViewModelFactoryComponentImpl paymentLauncherViewModelFactoryComponentImpl;
        private Y94<PaymentLauncherViewModelSubcomponent.Builder> paymentLauncherViewModelSubcomponentBuilderProvider;
        private final Set<String> productUsage;
        private Y94<Set<String>> productUsageProvider;
        private Y94<DefaultReturnUrl> provideDefaultReturnUrlProvider;
        private Y94<Boolean> provideIsInstantAppProvider;
        private Y94<Logger> provideLoggerProvider;
        private Y94<PaymentAuthenticatorRegistry> providePaymentAuthenticatorRegistryProvider;
        private Y94<Map<String, String>> provideThreeDs1IntentReturnUrlMapProvider;
        private Y94<CoroutineContext> provideUIContextProvider;
        private Y94<CoroutineContext> provideWorkContextProvider;
        private final Function0<String> publishableKeyProvider;
        private Y94<Function0<String>> publishableKeyProvider2;
        private Y94<SetupIntentFlowResultProcessor> setupIntentFlowResultProcessorProvider;
        private Y94<Function0<String>> stripeAccountIdProvider;
        private Y94<StripeApiRepository> stripeApiRepositoryProvider;

        /* JADX INFO: Access modifiers changed from: private */
        public DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.provideWorkContextProvider.get());
        }

        private void initialize(PaymentLauncherModule paymentLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Boolean bool, Function0<String> function0, Function0<String> function02, Set<String> set) {
            this.paymentLauncherViewModelSubcomponentBuilderProvider = new Y94<PaymentLauncherViewModelSubcomponent.Builder>() { // from class: com.stripe.android.payments.core.injection.DaggerPaymentLauncherViewModelFactoryComponent.PaymentLauncherViewModelFactoryComponentImpl.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.Y94
                public PaymentLauncherViewModelSubcomponent.Builder get() {
                    return new PaymentLauncherViewModelSubcomponentBuilder(PaymentLauncherViewModelFactoryComponentImpl.this.paymentLauncherViewModelFactoryComponentImpl);
                }
            };
            this.provideWorkContextProvider = V51.m80429b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(bool);
            this.enableLoggingProvider = m44621a;
            this.provideLoggerProvider = V51.m80429b(CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, m44621a));
            this.contextProvider = C39546d52.m44621a(context);
            this.publishableKeyProvider2 = C39546d52.m44621a(function0);
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(set);
            this.productUsageProvider = m44621a2;
            this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(this.contextProvider, this.publishableKeyProvider2, m44621a2);
            DefaultAnalyticsRequestExecutor_Factory create = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, this.provideWorkContextProvider);
            this.defaultAnalyticsRequestExecutorProvider = create;
            this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(this.contextProvider, this.publishableKeyProvider2, this.provideWorkContextProvider, this.productUsageProvider, this.paymentAnalyticsRequestFactoryProvider, create, this.provideLoggerProvider);
            this.provideUIContextProvider = V51.m80429b(CoroutineContextModule_ProvideUIContextFactory.create(coroutineContextModule));
            this.provideThreeDs1IntentReturnUrlMapProvider = V51.m80429b(PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory.create(paymentLauncherModule));
            PaymentLauncherModule_ProvideIsInstantAppFactory create2 = PaymentLauncherModule_ProvideIsInstantAppFactory.create(paymentLauncherModule, this.contextProvider);
            this.provideIsInstantAppProvider = create2;
            this.providePaymentAuthenticatorRegistryProvider = V51.m80429b(PaymentLauncherModule_ProvidePaymentAuthenticatorRegistryFactory.create(paymentLauncherModule, this.contextProvider, this.stripeApiRepositoryProvider, this.enableLoggingProvider, this.provideWorkContextProvider, this.provideUIContextProvider, this.provideThreeDs1IntentReturnUrlMapProvider, this.defaultAnalyticsRequestExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, this.publishableKeyProvider2, this.productUsageProvider, create2));
            this.provideDefaultReturnUrlProvider = V51.m80429b(PaymentLauncherModule_ProvideDefaultReturnUrlFactory.create(paymentLauncherModule, this.contextProvider));
            this.stripeAccountIdProvider = C39546d52.m44621a(function02);
            this.paymentIntentFlowResultProcessorProvider = V51.m80429b(PaymentIntentFlowResultProcessor_Factory.create(this.contextProvider, this.publishableKeyProvider2, this.stripeApiRepositoryProvider, this.provideLoggerProvider, this.provideWorkContextProvider));
            this.setupIntentFlowResultProcessorProvider = V51.m80429b(SetupIntentFlowResultProcessor_Factory.create(this.contextProvider, this.publishableKeyProvider2, this.stripeApiRepositoryProvider, this.provideLoggerProvider, this.provideWorkContextProvider));
        }

        private PaymentLauncherViewModel.Factory injectFactory(PaymentLauncherViewModel.Factory factory) {
            PaymentLauncherViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.paymentLauncherViewModelSubcomponentBuilderProvider);
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean namedBoolean() {
            return this.paymentLauncherModule.provideIsInstantApp(this.context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(this.context, this.publishableKeyProvider, this.productUsage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public StripeApiRepository stripeApiRepository() {
            return new StripeApiRepository(this.context, this.publishableKeyProvider, this.provideWorkContextProvider.get(), this.productUsage, paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.get());
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent
        public void inject(PaymentLauncherViewModel.Factory factory) {
            injectFactory(factory);
        }

        private PaymentLauncherViewModelFactoryComponentImpl(PaymentLauncherModule paymentLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Boolean bool, Function0<String> function0, Function0<String> function02, Set<String> set) {
            this.paymentLauncherViewModelFactoryComponentImpl = this;
            this.context = context;
            this.publishableKeyProvider = function0;
            this.productUsage = set;
            this.paymentLauncherModule = paymentLauncherModule;
            initialize(paymentLauncherModule, coroutineContextModule, coreCommonModule, context, bool, function0, function02, set);
        }
    }

    /* loaded from: classes7.dex */
    public static final class PaymentLauncherViewModelSubcomponentBuilder implements PaymentLauncherViewModelSubcomponent.Builder {
        private Boolean isPaymentIntent;
        private final PaymentLauncherViewModelFactoryComponentImpl paymentLauncherViewModelFactoryComponentImpl;
        private C11747p savedStateHandle;

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.Builder
        public PaymentLauncherViewModelSubcomponent build() {
            C51679xZ3.m5006a(this.isPaymentIntent, Boolean.class);
            C51679xZ3.m5006a(this.savedStateHandle, C11747p.class);
            return new PaymentLauncherViewModelSubcomponentImpl(this.paymentLauncherViewModelFactoryComponentImpl, this.isPaymentIntent, this.savedStateHandle);
        }

        private PaymentLauncherViewModelSubcomponentBuilder(PaymentLauncherViewModelFactoryComponentImpl paymentLauncherViewModelFactoryComponentImpl) {
            this.paymentLauncherViewModelFactoryComponentImpl = paymentLauncherViewModelFactoryComponentImpl;
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
        private final PaymentLauncherViewModelFactoryComponentImpl paymentLauncherViewModelFactoryComponentImpl;
        private final PaymentLauncherViewModelSubcomponentImpl paymentLauncherViewModelSubcomponentImpl;
        private final C11747p savedStateHandle;

        private void initialize(Boolean bool, C11747p c11747p) {
            this.optionsProvider = ApiRequest_Options_Factory.create(this.paymentLauncherViewModelFactoryComponentImpl.publishableKeyProvider2, this.paymentLauncherViewModelFactoryComponentImpl.stripeAccountIdProvider);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent
        public PaymentLauncherViewModel getViewModel() {
            return new PaymentLauncherViewModel(this.isPaymentIntent.booleanValue(), this.paymentLauncherViewModelFactoryComponentImpl.stripeApiRepository(), (PaymentAuthenticatorRegistry) this.paymentLauncherViewModelFactoryComponentImpl.providePaymentAuthenticatorRegistryProvider.get(), (DefaultReturnUrl) this.paymentLauncherViewModelFactoryComponentImpl.provideDefaultReturnUrlProvider.get(), this.optionsProvider, (Map) this.paymentLauncherViewModelFactoryComponentImpl.provideThreeDs1IntentReturnUrlMapProvider.get(), V51.m80430a(this.paymentLauncherViewModelFactoryComponentImpl.paymentIntentFlowResultProcessorProvider), V51.m80430a(this.paymentLauncherViewModelFactoryComponentImpl.setupIntentFlowResultProcessorProvider), this.paymentLauncherViewModelFactoryComponentImpl.defaultAnalyticsRequestExecutor(), this.paymentLauncherViewModelFactoryComponentImpl.paymentAnalyticsRequestFactory(), (CoroutineContext) this.paymentLauncherViewModelFactoryComponentImpl.provideUIContextProvider.get(), this.savedStateHandle, this.paymentLauncherViewModelFactoryComponentImpl.namedBoolean());
        }

        private PaymentLauncherViewModelSubcomponentImpl(PaymentLauncherViewModelFactoryComponentImpl paymentLauncherViewModelFactoryComponentImpl, Boolean bool, C11747p c11747p) {
            this.paymentLauncherViewModelSubcomponentImpl = this;
            this.paymentLauncherViewModelFactoryComponentImpl = paymentLauncherViewModelFactoryComponentImpl;
            this.isPaymentIntent = bool;
            this.savedStateHandle = c11747p;
            initialize(bool, c11747p);
        }
    }

    private DaggerPaymentLauncherViewModelFactoryComponent() {
    }

    public static PaymentLauncherViewModelFactoryComponent.Builder builder() {
        return new Builder();
    }
}
