package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import androidx.lifecycle.C11747p;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.GooglePayJsonFactory_Factory;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository_Factory;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory_Factory;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent {

    /* loaded from: classes7.dex */
    public static final class Builder implements GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder {
        private Context context;
        private Boolean enableLogging;
        private GooglePayPaymentMethodLauncher.Config googlePayConfig;
        private Set<String> productUsage;
        private Function0<String> publishableKeyProvider;
        private Function0<String> stripeAccountIdProvider;

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public GooglePayPaymentMethodLauncherViewModelFactoryComponent build() {
            C51679xZ3.m5006a(this.context, Context.class);
            C51679xZ3.m5006a(this.enableLogging, Boolean.class);
            C51679xZ3.m5006a(this.publishableKeyProvider, Function0.class);
            C51679xZ3.m5006a(this.stripeAccountIdProvider, Function0.class);
            C51679xZ3.m5006a(this.productUsage, Set.class);
            C51679xZ3.m5006a(this.googlePayConfig, GooglePayPaymentMethodLauncher.Config.class);
            return new GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl(new CoroutineContextModule(), new CoreCommonModule(), this.context, this.enableLogging, this.publishableKeyProvider, this.stripeAccountIdProvider, this.productUsage, this.googlePayConfig);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder publishableKeyProvider(Function0 function0) {
            return publishableKeyProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder stripeAccountIdProvider(Function0 function0) {
            return stripeAccountIdProvider((Function0<String>) function0);
        }

        private Builder() {
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) C51679xZ3.m5005b(context);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder enableLogging(boolean z) {
            this.enableLogging = (Boolean) C51679xZ3.m5005b(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder googlePayConfig(GooglePayPaymentMethodLauncher.Config config) {
            this.googlePayConfig = (GooglePayPaymentMethodLauncher.Config) C51679xZ3.m5005b(config);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) C51679xZ3.m5005b(set);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder publishableKeyProvider(Function0<String> function0) {
            this.publishableKeyProvider = (Function0) C51679xZ3.m5005b(function0);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder stripeAccountIdProvider(Function0<String> function0) {
            this.stripeAccountIdProvider = (Function0) C51679xZ3.m5005b(function0);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl implements GooglePayPaymentMethodLauncherViewModelFactoryComponent {
        private final Context context;
        private Y94<Context> contextProvider;
        private Y94<DefaultGooglePayRepository> defaultGooglePayRepositoryProvider;
        private Y94<Boolean> enableLoggingProvider;
        private Y94<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;
        private Y94<GooglePayJsonFactory> googlePayJsonFactoryProvider;
        private final GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl googlePayPaymentMethodLauncherViewModelFactoryComponentImpl;
        private Y94<PaymentsClientFactory> paymentsClientFactoryProvider;
        private final Set<String> productUsage;
        private Y94<Logger> provideLoggerProvider;
        private Y94<EP3> providePaymentsClientProvider;
        private Y94<CoroutineContext> provideWorkContextProvider;
        private final Function0<String> publishableKeyProvider;
        private Y94<Function0<String>> publishableKeyProvider2;
        private final Function0<String> stripeAccountIdProvider;
        private Y94<Function0<String>> stripeAccountIdProvider2;

        private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.provideWorkContextProvider.get());
        }

        private void initialize(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Boolean bool, Function0<String> function0, Function0<String> function02, Set<String> set, GooglePayPaymentMethodLauncher.Config config) {
            this.contextProvider = C39546d52.m44621a(context);
            this.googlePayConfigProvider = C39546d52.m44621a(config);
            PaymentsClientFactory_Factory create = PaymentsClientFactory_Factory.create(this.contextProvider);
            this.paymentsClientFactoryProvider = create;
            this.providePaymentsClientProvider = V51.m80429b(C18955x4898f21f.create(this.contextProvider, this.googlePayConfigProvider, create));
            this.provideWorkContextProvider = V51.m80429b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(bool);
            this.enableLoggingProvider = m44621a;
            this.provideLoggerProvider = V51.m80429b(CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, m44621a));
            this.publishableKeyProvider2 = C39546d52.m44621a(function0);
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(function02);
            this.stripeAccountIdProvider2 = m44621a2;
            this.googlePayJsonFactoryProvider = V51.m80429b(GooglePayJsonFactory_Factory.create(this.publishableKeyProvider2, m44621a2, this.googlePayConfigProvider));
            this.defaultGooglePayRepositoryProvider = V51.m80429b(DefaultGooglePayRepository_Factory.create(this.contextProvider, this.googlePayConfigProvider, this.provideLoggerProvider));
        }

        private GooglePayPaymentMethodLauncherViewModel.Factory injectFactory(GooglePayPaymentMethodLauncherViewModel.Factory factory) {
            GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector.injectSubComponentBuilder(factory, new GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder(this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl));
            return factory;
        }

        private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(this.context, this.publishableKeyProvider, this.productUsage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public StripeApiRepository stripeApiRepository() {
            return new StripeApiRepository(this.context, this.publishableKeyProvider, this.provideWorkContextProvider.get(), this.productUsage, paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.get());
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent
        public void inject(GooglePayPaymentMethodLauncherViewModel.Factory factory) {
            injectFactory(factory);
        }

        private GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Boolean bool, Function0<String> function0, Function0<String> function02, Set<String> set, GooglePayPaymentMethodLauncher.Config config) {
            this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl = this;
            this.publishableKeyProvider = function0;
            this.stripeAccountIdProvider = function02;
            this.context = context;
            this.productUsage = set;
            initialize(coroutineContextModule, coreCommonModule, context, bool, function0, function02, set, config);
        }
    }

    /* loaded from: classes7.dex */
    public static final class GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder implements GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder {
        private GooglePayPaymentMethodLauncherContract.Args args;
        private final GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl googlePayPaymentMethodLauncherViewModelFactoryComponentImpl;
        private C11747p savedStateHandle;

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder
        public GooglePayPaymentMethodLauncherViewModelSubcomponent build() {
            C51679xZ3.m5006a(this.args, GooglePayPaymentMethodLauncherContract.Args.class);
            C51679xZ3.m5006a(this.savedStateHandle, C11747p.class);
            return new GooglePayPaymentMethodLauncherViewModelSubcomponentImpl(this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl, this.args, this.savedStateHandle);
        }

        private GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder(GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl googlePayPaymentMethodLauncherViewModelFactoryComponentImpl) {
            this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl = googlePayPaymentMethodLauncherViewModelFactoryComponentImpl;
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
        private final GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl googlePayPaymentMethodLauncherViewModelFactoryComponentImpl;
        private final GooglePayPaymentMethodLauncherViewModelSubcomponentImpl googlePayPaymentMethodLauncherViewModelSubcomponentImpl;
        private final C11747p savedStateHandle;

        private ApiRequest.Options options() {
            return new ApiRequest.Options(this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl.publishableKeyProvider, this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl.stripeAccountIdProvider);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent
        public GooglePayPaymentMethodLauncherViewModel getViewModel() {
            return new GooglePayPaymentMethodLauncherViewModel((EP3) this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl.providePaymentsClientProvider.get(), options(), this.args, this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl.stripeApiRepository(), (GooglePayJsonFactory) this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl.googlePayJsonFactoryProvider.get(), (GooglePayRepository) this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl.defaultGooglePayRepositoryProvider.get(), this.savedStateHandle);
        }

        private GooglePayPaymentMethodLauncherViewModelSubcomponentImpl(GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl googlePayPaymentMethodLauncherViewModelFactoryComponentImpl, GooglePayPaymentMethodLauncherContract.Args args, C11747p c11747p) {
            this.googlePayPaymentMethodLauncherViewModelSubcomponentImpl = this;
            this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl = googlePayPaymentMethodLauncherViewModelFactoryComponentImpl;
            this.args = args;
            this.savedStateHandle = c11747p;
        }
    }

    private DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent() {
    }

    public static GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder builder() {
        return new Builder();
    }
}
