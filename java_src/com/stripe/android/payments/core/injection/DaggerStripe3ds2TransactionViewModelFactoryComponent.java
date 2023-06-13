package com.stripe.android.payments.core.injection;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C11747p;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.core.networking.RetryDelaySupplier_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor;
import com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor_Factory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2ChallengeResultProcessor;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory_MembersInjector;
import com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent;
import com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class DaggerStripe3ds2TransactionViewModelFactoryComponent {

    /* loaded from: classes7.dex */
    public static final class Builder implements Stripe3ds2TransactionViewModelFactoryComponent.Builder {
        private Context context;
        private Boolean enableLogging;
        private Boolean isInstantApp;
        private Set<String> productUsage;
        private Function0<String> publishableKeyProvider;

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public Stripe3ds2TransactionViewModelFactoryComponent build() {
            C51679xZ3.m5006a(this.context, Context.class);
            C51679xZ3.m5006a(this.enableLogging, Boolean.class);
            C51679xZ3.m5006a(this.publishableKeyProvider, Function0.class);
            C51679xZ3.m5006a(this.productUsage, Set.class);
            C51679xZ3.m5006a(this.isInstantApp, Boolean.class);
            return new Stripe3ds2TransactionViewModelFactoryComponentImpl(new CoroutineContextModule(), new CoreCommonModule(), this.context, this.enableLogging, this.publishableKeyProvider, this.productUsage, this.isInstantApp);
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ Stripe3ds2TransactionViewModelFactoryComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ Stripe3ds2TransactionViewModelFactoryComponent.Builder publishableKeyProvider(Function0 function0) {
            return publishableKeyProvider((Function0<String>) function0);
        }

        private Builder() {
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) C51679xZ3.m5005b(context);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public Builder enableLogging(boolean z) {
            this.enableLogging = (Boolean) C51679xZ3.m5005b(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public Builder isInstantApp(boolean z) {
            this.isInstantApp = (Boolean) C51679xZ3.m5005b(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) C51679xZ3.m5005b(set);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public Builder publishableKeyProvider(Function0<String> function0) {
            this.publishableKeyProvider = (Function0) C51679xZ3.m5005b(function0);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class Stripe3ds2TransactionViewModelFactoryComponentImpl implements Stripe3ds2TransactionViewModelFactoryComponent {
        private final Context context;
        private Y94<Context> contextProvider;
        private Y94<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Y94<DefaultStripe3ds2ChallengeResultProcessor> defaultStripe3ds2ChallengeResultProcessorProvider;
        private Y94<Boolean> enableLoggingProvider;
        private final Boolean isInstantApp;
        private Y94<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private final Set<String> productUsage;
        private Y94<Set<String>> productUsageProvider;
        private Y94<Logger> provideLoggerProvider;
        private Y94<MessageVersionRegistry> provideMessageVersionRegistryProvider;
        private Y94<StripeThreeDs2Service> provideStripeThreeDs2ServiceProvider;
        private Y94<CoroutineContext> provideWorkContextProvider;
        private final Function0<String> publishableKeyProvider;
        private Y94<Function0<String>> publishableKeyProvider2;
        private Y94<RetryDelaySupplier> retryDelaySupplierProvider;
        private final Stripe3ds2TransactionViewModelFactoryComponentImpl stripe3ds2TransactionViewModelFactoryComponentImpl;
        private Y94<StripeApiRepository> stripeApiRepositoryProvider;

        /* JADX INFO: Access modifiers changed from: private */
        public DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.provideWorkContextProvider.get());
        }

        private void initialize(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Boolean bool, Function0<String> function0, Set<String> set, Boolean bool2) {
            this.provideWorkContextProvider = V51.m80429b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(bool);
            this.enableLoggingProvider = m44621a;
            this.provideLoggerProvider = V51.m80429b(CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, m44621a));
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(context);
            this.contextProvider = m44621a2;
            this.provideStripeThreeDs2ServiceProvider = V51.m80429b(C19127xd3c74c43.create(m44621a2, this.enableLoggingProvider, this.provideWorkContextProvider));
            this.provideMessageVersionRegistryProvider = V51.m80429b(C19126x9e4b19e0.create());
            this.publishableKeyProvider2 = C39546d52.m44621a(function0);
            InterfaceC48812sj1 m44621a3 = C39546d52.m44621a(set);
            this.productUsageProvider = m44621a3;
            this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(this.contextProvider, this.publishableKeyProvider2, m44621a3);
            DefaultAnalyticsRequestExecutor_Factory create = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, this.provideWorkContextProvider);
            this.defaultAnalyticsRequestExecutorProvider = create;
            this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(this.contextProvider, this.publishableKeyProvider2, this.provideWorkContextProvider, this.productUsageProvider, this.paymentAnalyticsRequestFactoryProvider, create, this.provideLoggerProvider);
            Y94<RetryDelaySupplier> m80429b = V51.m80429b(RetryDelaySupplier_Factory.create());
            this.retryDelaySupplierProvider = m80429b;
            this.defaultStripe3ds2ChallengeResultProcessorProvider = V51.m80429b(DefaultStripe3ds2ChallengeResultProcessor_Factory.create(this.stripeApiRepositoryProvider, this.defaultAnalyticsRequestExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, m80429b, this.provideLoggerProvider, this.provideWorkContextProvider));
        }

        private Stripe3ds2TransactionViewModelFactory injectStripe3ds2TransactionViewModelFactory(Stripe3ds2TransactionViewModelFactory stripe3ds2TransactionViewModelFactory) {
            Stripe3ds2TransactionViewModelFactory_MembersInjector.injectSubComponentBuilder(stripe3ds2TransactionViewModelFactory, new Stripe3ds2TransactionViewModelSubcomponentBuilder(this.stripe3ds2TransactionViewModelFactoryComponentImpl));
            return stripe3ds2TransactionViewModelFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(this.context, this.publishableKeyProvider, this.productUsage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public StripeApiRepository stripeApiRepository() {
            return new StripeApiRepository(this.context, this.publishableKeyProvider, this.provideWorkContextProvider.get(), this.productUsage, paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.get());
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent
        public void inject(Stripe3ds2TransactionViewModelFactory stripe3ds2TransactionViewModelFactory) {
            injectStripe3ds2TransactionViewModelFactory(stripe3ds2TransactionViewModelFactory);
        }

        private Stripe3ds2TransactionViewModelFactoryComponentImpl(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Boolean bool, Function0<String> function0, Set<String> set, Boolean bool2) {
            this.stripe3ds2TransactionViewModelFactoryComponentImpl = this;
            this.context = context;
            this.publishableKeyProvider = function0;
            this.productUsage = set;
            this.isInstantApp = bool2;
            initialize(coroutineContextModule, coreCommonModule, context, bool, function0, set, bool2);
        }
    }

    /* loaded from: classes7.dex */
    public static final class Stripe3ds2TransactionViewModelSubcomponentBuilder implements Stripe3ds2TransactionViewModelSubcomponent.Builder {
        private Application application;
        private Stripe3ds2TransactionContract.Args args;
        private C11747p savedStateHandle;
        private final Stripe3ds2TransactionViewModelFactoryComponentImpl stripe3ds2TransactionViewModelFactoryComponentImpl;

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder
        public Stripe3ds2TransactionViewModelSubcomponent build() {
            C51679xZ3.m5006a(this.args, Stripe3ds2TransactionContract.Args.class);
            C51679xZ3.m5006a(this.savedStateHandle, C11747p.class);
            C51679xZ3.m5006a(this.application, Application.class);
            return new Stripe3ds2TransactionViewModelSubcomponentImpl(this.stripe3ds2TransactionViewModelFactoryComponentImpl, new Stripe3dsTransactionViewModelModule(), this.args, this.savedStateHandle, this.application);
        }

        private Stripe3ds2TransactionViewModelSubcomponentBuilder(Stripe3ds2TransactionViewModelFactoryComponentImpl stripe3ds2TransactionViewModelFactoryComponentImpl) {
            this.stripe3ds2TransactionViewModelFactoryComponentImpl = stripe3ds2TransactionViewModelFactoryComponentImpl;
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
        private final C11747p savedStateHandle;
        private final Stripe3ds2TransactionViewModelFactoryComponentImpl stripe3ds2TransactionViewModelFactoryComponentImpl;
        private final Stripe3ds2TransactionViewModelSubcomponentImpl stripe3ds2TransactionViewModelSubcomponentImpl;
        private final Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule;

        private InitChallengeRepository initChallengeRepository() {
            return C19128x3d138ab7.providesInitChallengeRepository(this.stripe3dsTransactionViewModelModule, this.application, this.args, (CoroutineContext) this.stripe3ds2TransactionViewModelFactoryComponentImpl.provideWorkContextProvider.get());
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent
        public Stripe3ds2TransactionViewModel getViewModel() {
            return new Stripe3ds2TransactionViewModel(this.args, this.stripe3ds2TransactionViewModelFactoryComponentImpl.stripeApiRepository(), this.stripe3ds2TransactionViewModelFactoryComponentImpl.defaultAnalyticsRequestExecutor(), this.stripe3ds2TransactionViewModelFactoryComponentImpl.paymentAnalyticsRequestFactory(), (StripeThreeDs2Service) this.stripe3ds2TransactionViewModelFactoryComponentImpl.provideStripeThreeDs2ServiceProvider.get(), (MessageVersionRegistry) this.stripe3ds2TransactionViewModelFactoryComponentImpl.provideMessageVersionRegistryProvider.get(), (Stripe3ds2ChallengeResultProcessor) this.stripe3ds2TransactionViewModelFactoryComponentImpl.defaultStripe3ds2ChallengeResultProcessorProvider.get(), initChallengeRepository(), (CoroutineContext) this.stripe3ds2TransactionViewModelFactoryComponentImpl.provideWorkContextProvider.get(), this.savedStateHandle, this.stripe3ds2TransactionViewModelFactoryComponentImpl.isInstantApp.booleanValue());
        }

        private Stripe3ds2TransactionViewModelSubcomponentImpl(Stripe3ds2TransactionViewModelFactoryComponentImpl stripe3ds2TransactionViewModelFactoryComponentImpl, Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule, Stripe3ds2TransactionContract.Args args, C11747p c11747p, Application application) {
            this.stripe3ds2TransactionViewModelSubcomponentImpl = this;
            this.stripe3ds2TransactionViewModelFactoryComponentImpl = stripe3ds2TransactionViewModelFactoryComponentImpl;
            this.args = args;
            this.stripe3dsTransactionViewModelModule = stripe3dsTransactionViewModelModule;
            this.application = application;
            this.savedStateHandle = c11747p;
        }
    }

    private DaggerStripe3ds2TransactionViewModelFactoryComponent() {
    }

    public static Stripe3ds2TransactionViewModelFactoryComponent.Builder builder() {
        return new Builder();
    }
}
