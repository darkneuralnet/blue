package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import androidx.lifecycle.C11747p;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.GooglePayJsonFactory_Factory;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository_Factory;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory_Factory;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class DaggerGooglePayPaymentMethodLauncherComponent {

    /* loaded from: classes7.dex */
    public static final class Builder implements GooglePayPaymentMethodLauncherComponent.Builder {
        private PaymentAnalyticsRequestFactory analyticsRequestFactory;
        private Context context;
        private Boolean enableLogging;
        private GooglePayPaymentMethodLauncher.Config googlePayConfig;
        private CoroutineContext ioContext;
        private Function0<String> publishableKeyProvider;
        private Function0<String> stripeAccountIdProvider;
        private StripeRepository stripeRepository;

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public GooglePayPaymentMethodLauncherComponent build() {
            C51679xZ3.m5006a(this.context, Context.class);
            C51679xZ3.m5006a(this.ioContext, CoroutineContext.class);
            C51679xZ3.m5006a(this.analyticsRequestFactory, PaymentAnalyticsRequestFactory.class);
            C51679xZ3.m5006a(this.stripeRepository, StripeRepository.class);
            C51679xZ3.m5006a(this.googlePayConfig, GooglePayPaymentMethodLauncher.Config.class);
            C51679xZ3.m5006a(this.enableLogging, Boolean.class);
            C51679xZ3.m5006a(this.publishableKeyProvider, Function0.class);
            C51679xZ3.m5006a(this.stripeAccountIdProvider, Function0.class);
            return new GooglePayPaymentMethodLauncherComponentImpl(new CoreCommonModule(), this.context, this.ioContext, this.analyticsRequestFactory, this.stripeRepository, this.googlePayConfig, this.enableLogging, this.publishableKeyProvider, this.stripeAccountIdProvider);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public /* bridge */ /* synthetic */ GooglePayPaymentMethodLauncherComponent.Builder publishableKeyProvider(Function0 function0) {
            return publishableKeyProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public /* bridge */ /* synthetic */ GooglePayPaymentMethodLauncherComponent.Builder stripeAccountIdProvider(Function0 function0) {
            return stripeAccountIdProvider((Function0<String>) function0);
        }

        private Builder() {
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public Builder analyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
            this.analyticsRequestFactory = (PaymentAnalyticsRequestFactory) C51679xZ3.m5005b(paymentAnalyticsRequestFactory);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) C51679xZ3.m5005b(context);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public Builder enableLogging(boolean z) {
            this.enableLogging = (Boolean) C51679xZ3.m5005b(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public Builder googlePayConfig(GooglePayPaymentMethodLauncher.Config config) {
            this.googlePayConfig = (GooglePayPaymentMethodLauncher.Config) C51679xZ3.m5005b(config);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public Builder ioContext(CoroutineContext coroutineContext) {
            this.ioContext = (CoroutineContext) C51679xZ3.m5005b(coroutineContext);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public Builder publishableKeyProvider(Function0<String> function0) {
            this.publishableKeyProvider = (Function0) C51679xZ3.m5005b(function0);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public Builder stripeAccountIdProvider(Function0<String> function0) {
            this.stripeAccountIdProvider = (Function0) C51679xZ3.m5005b(function0);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public Builder stripeRepository(StripeRepository stripeRepository) {
            this.stripeRepository = (StripeRepository) C51679xZ3.m5005b(stripeRepository);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class GooglePayPaymentMethodLauncherComponentImpl extends GooglePayPaymentMethodLauncherComponent {
        private Y94<Context> contextProvider;
        private Y94<DefaultGooglePayRepository> defaultGooglePayRepositoryProvider;
        private Y94<Boolean> enableLoggingProvider;
        private Y94<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;
        private Y94<GooglePayJsonFactory> googlePayJsonFactoryProvider;
        private final GooglePayPaymentMethodLauncherComponentImpl googlePayPaymentMethodLauncherComponentImpl;
        private Y94<PaymentsClientFactory> paymentsClientFactoryProvider;
        private Y94<Logger> provideLoggerProvider;
        private Y94<EP3> providePaymentsClientProvider;
        private final Function0<String> publishableKeyProvider;
        private Y94<Function0<String>> publishableKeyProvider2;
        private final Function0<String> stripeAccountIdProvider;
        private Y94<Function0<String>> stripeAccountIdProvider2;
        private final StripeRepository stripeRepository;

        private void initialize(CoreCommonModule coreCommonModule, Context context, CoroutineContext coroutineContext, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, StripeRepository stripeRepository, GooglePayPaymentMethodLauncher.Config config, Boolean bool, Function0<String> function0, Function0<String> function02) {
            this.contextProvider = C39546d52.m44621a(context);
            this.googlePayConfigProvider = C39546d52.m44621a(config);
            PaymentsClientFactory_Factory create = PaymentsClientFactory_Factory.create(this.contextProvider);
            this.paymentsClientFactoryProvider = create;
            this.providePaymentsClientProvider = V51.m80429b(C18955x4898f21f.create(this.contextProvider, this.googlePayConfigProvider, create));
            this.publishableKeyProvider2 = C39546d52.m44621a(function0);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(function02);
            this.stripeAccountIdProvider2 = m44621a;
            this.googlePayJsonFactoryProvider = V51.m80429b(GooglePayJsonFactory_Factory.create(this.publishableKeyProvider2, m44621a, this.googlePayConfigProvider));
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(bool);
            this.enableLoggingProvider = m44621a2;
            Y94<Logger> m80429b = V51.m80429b(CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, m44621a2));
            this.provideLoggerProvider = m80429b;
            this.defaultGooglePayRepositoryProvider = V51.m80429b(DefaultGooglePayRepository_Factory.create(this.contextProvider, this.googlePayConfigProvider, m80429b));
        }

        private GooglePayPaymentMethodLauncherViewModel.Factory injectFactory(GooglePayPaymentMethodLauncherViewModel.Factory factory) {
            GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector.injectSubComponentBuilder(factory, new GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder(this.googlePayPaymentMethodLauncherComponentImpl));
            return factory;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent
        public void inject(GooglePayPaymentMethodLauncherViewModel.Factory factory) {
            injectFactory(factory);
        }

        private GooglePayPaymentMethodLauncherComponentImpl(CoreCommonModule coreCommonModule, Context context, CoroutineContext coroutineContext, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, StripeRepository stripeRepository, GooglePayPaymentMethodLauncher.Config config, Boolean bool, Function0<String> function0, Function0<String> function02) {
            this.googlePayPaymentMethodLauncherComponentImpl = this;
            this.publishableKeyProvider = function0;
            this.stripeAccountIdProvider = function02;
            this.stripeRepository = stripeRepository;
            initialize(coreCommonModule, context, coroutineContext, paymentAnalyticsRequestFactory, stripeRepository, config, bool, function0, function02);
        }
    }

    /* loaded from: classes7.dex */
    public static final class GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder implements GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder {
        private GooglePayPaymentMethodLauncherContract.Args args;
        private final GooglePayPaymentMethodLauncherComponentImpl googlePayPaymentMethodLauncherComponentImpl;
        private C11747p savedStateHandle;

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder
        public GooglePayPaymentMethodLauncherViewModelSubcomponent build() {
            C51679xZ3.m5006a(this.args, GooglePayPaymentMethodLauncherContract.Args.class);
            C51679xZ3.m5006a(this.savedStateHandle, C11747p.class);
            return new GooglePayPaymentMethodLauncherViewModelSubcomponentImpl(this.googlePayPaymentMethodLauncherComponentImpl, this.args, this.savedStateHandle);
        }

        private GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder(GooglePayPaymentMethodLauncherComponentImpl googlePayPaymentMethodLauncherComponentImpl) {
            this.googlePayPaymentMethodLauncherComponentImpl = googlePayPaymentMethodLauncherComponentImpl;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder
        public GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder args(GooglePayPaymentMethodLauncherContract.Args args) {
            this.args = (GooglePayPaymentMethodLauncherContract.Args) C51679xZ3.m5005b(args);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder
        public GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder savedStateHandle(C11747p c11747p) {
            this.savedStateHandle = (C11747p) C51679xZ3.m5005b(c11747p);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class GooglePayPaymentMethodLauncherViewModelSubcomponentImpl implements GooglePayPaymentMethodLauncherViewModelSubcomponent {
        private final GooglePayPaymentMethodLauncherContract.Args args;
        private final GooglePayPaymentMethodLauncherComponentImpl googlePayPaymentMethodLauncherComponentImpl;
        private final GooglePayPaymentMethodLauncherViewModelSubcomponentImpl googlePayPaymentMethodLauncherViewModelSubcomponentImpl;
        private final C11747p savedStateHandle;

        private ApiRequest.Options options() {
            return new ApiRequest.Options(this.googlePayPaymentMethodLauncherComponentImpl.publishableKeyProvider, this.googlePayPaymentMethodLauncherComponentImpl.stripeAccountIdProvider);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent
        public GooglePayPaymentMethodLauncherViewModel getViewModel() {
            return new GooglePayPaymentMethodLauncherViewModel((EP3) this.googlePayPaymentMethodLauncherComponentImpl.providePaymentsClientProvider.get(), options(), this.args, this.googlePayPaymentMethodLauncherComponentImpl.stripeRepository, (GooglePayJsonFactory) this.googlePayPaymentMethodLauncherComponentImpl.googlePayJsonFactoryProvider.get(), (GooglePayRepository) this.googlePayPaymentMethodLauncherComponentImpl.defaultGooglePayRepositoryProvider.get(), this.savedStateHandle);
        }

        private GooglePayPaymentMethodLauncherViewModelSubcomponentImpl(GooglePayPaymentMethodLauncherComponentImpl googlePayPaymentMethodLauncherComponentImpl, GooglePayPaymentMethodLauncherContract.Args args, C11747p c11747p) {
            this.googlePayPaymentMethodLauncherViewModelSubcomponentImpl = this;
            this.googlePayPaymentMethodLauncherComponentImpl = googlePayPaymentMethodLauncherComponentImpl;
            this.args = args;
            this.savedStateHandle = c11747p;
        }
    }

    private DaggerGooglePayPaymentMethodLauncherComponent() {
    }

    public static GooglePayPaymentMethodLauncherComponent.Builder builder() {
        return new Builder();
    }
}
