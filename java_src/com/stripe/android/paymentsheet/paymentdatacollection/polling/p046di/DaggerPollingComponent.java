package com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C11747p;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.DefaultTimeProvider;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di.PollingComponent;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di.PollingViewModelSubcomponent;
import com.stripe.android.polling.DefaultIntentStatusPoller;
import com.stripe.android.polling.IntentStatusPoller;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.di.DaggerPollingComponent */
/* loaded from: classes7.dex */
public final class DaggerPollingComponent {

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.di.DaggerPollingComponent$Builder */
    /* loaded from: classes7.dex */
    public static final class Builder implements PollingComponent.Builder {
        private Application application;
        private IntentStatusPoller.Config config;
        private String injectorKey;
        private SC0 ioDispatcher;

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di.PollingComponent.Builder
        public PollingComponent build() {
            C51679xZ3.m5006a(this.application, Application.class);
            C51679xZ3.m5006a(this.config, IntentStatusPoller.Config.class);
            C51679xZ3.m5006a(this.ioDispatcher, SC0.class);
            C51679xZ3.m5006a(this.injectorKey, String.class);
            return new PollingComponentImpl(new CoroutineContextModule(), new CoreCommonModule(), this.application, this.config, this.ioDispatcher, this.injectorKey);
        }

        private Builder() {
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di.PollingComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) C51679xZ3.m5005b(application);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di.PollingComponent.Builder
        public Builder config(IntentStatusPoller.Config config) {
            this.config = (IntentStatusPoller.Config) C51679xZ3.m5005b(config);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di.PollingComponent.Builder
        public Builder injectorKey(String str) {
            this.injectorKey = (String) C51679xZ3.m5005b(str);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di.PollingComponent.Builder
        public Builder ioDispatcher(SC0 sc0) {
            this.ioDispatcher = (SC0) C51679xZ3.m5005b(sc0);
            return this;
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.di.DaggerPollingComponent$PollingComponentImpl */
    /* loaded from: classes7.dex */
    public static final class PollingComponentImpl implements PollingComponent {
        private final Application application;
        private Y94<Application> applicationProvider;
        private final IntentStatusPoller.Config config;
        private final SC0 ioDispatcher;
        private final PollingComponentImpl pollingComponentImpl;
        private Y94<PollingViewModelSubcomponent.Builder> pollingViewModelSubcomponentBuilderProvider;
        private Y94<Logger> provideLoggerProvider;
        private Y94<PaymentConfiguration> providePaymentConfigurationProvider;
        private Y94<CoroutineContext> provideWorkContextProvider;
        private Y94<Context> providesAppContextProvider;

        private Context context() {
            return PollingViewModelModule_Companion_ProvidesAppContextFactory.providesAppContext(this.application);
        }

        private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.provideWorkContextProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DefaultIntentStatusPoller defaultIntentStatusPoller() {
            return new DefaultIntentStatusPoller(stripeApiRepository(), this.providePaymentConfigurationProvider, this.config, this.ioDispatcher);
        }

        private void initialize(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Application application, IntentStatusPoller.Config config, SC0 sc0, String str) {
            this.pollingViewModelSubcomponentBuilderProvider = new Y94<PollingViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.di.DaggerPollingComponent.PollingComponentImpl.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.Y94
                public PollingViewModelSubcomponent.Builder get() {
                    return new PollingViewModelSubcomponentBuilder(PollingComponentImpl.this.pollingComponentImpl);
                }
            };
            this.provideWorkContextProvider = V51.m80429b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            this.provideLoggerProvider = V51.m80429b(CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, PollingViewModelModule_Companion_ProvidesEnableLoggingFactory.create()));
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(application);
            this.applicationProvider = m44621a;
            PollingViewModelModule_Companion_ProvidesAppContextFactory create = PollingViewModelModule_Companion_ProvidesAppContextFactory.create(m44621a);
            this.providesAppContextProvider = create;
            this.providePaymentConfigurationProvider = C19290xfafb9b5e.create(create);
        }

        private PollingViewModel.Factory injectFactory(PollingViewModel.Factory factory) {
            PollingViewModel_Factory_MembersInjector.injectSubcomponentBuilderProvider(factory, this.pollingViewModelSubcomponentBuilderProvider);
            return factory;
        }

        private Function0<String> namedFunction0OfString() {
            return PollingViewModelModule_Companion_ProvidePublishableKeyFactory.providePublishableKey(context());
        }

        private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(context(), namedFunction0OfString(), PollingViewModelModule_Companion_ProvidesProductUsageFactory.providesProductUsage());
        }

        private StripeApiRepository stripeApiRepository() {
            return new StripeApiRepository(context(), namedFunction0OfString(), this.provideWorkContextProvider.get(), PollingViewModelModule_Companion_ProvidesProductUsageFactory.providesProductUsage(), paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.get());
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di.PollingComponent
        public void inject(PollingViewModel.Factory factory) {
            injectFactory(factory);
        }

        private PollingComponentImpl(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Application application, IntentStatusPoller.Config config, SC0 sc0, String str) {
            this.pollingComponentImpl = this;
            this.application = application;
            this.config = config;
            this.ioDispatcher = sc0;
            initialize(coroutineContextModule, coreCommonModule, application, config, sc0, str);
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.di.DaggerPollingComponent$PollingViewModelSubcomponentBuilder */
    /* loaded from: classes7.dex */
    public static final class PollingViewModelSubcomponentBuilder implements PollingViewModelSubcomponent.Builder {
        private PollingViewModel.Args args;
        private final PollingComponentImpl pollingComponentImpl;
        private C11747p savedStateHandle;

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di.PollingViewModelSubcomponent.Builder
        public PollingViewModelSubcomponent build() {
            C51679xZ3.m5006a(this.savedStateHandle, C11747p.class);
            C51679xZ3.m5006a(this.args, PollingViewModel.Args.class);
            return new PollingViewModelSubcomponentImpl(this.pollingComponentImpl, this.savedStateHandle, this.args);
        }

        private PollingViewModelSubcomponentBuilder(PollingComponentImpl pollingComponentImpl) {
            this.pollingComponentImpl = pollingComponentImpl;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di.PollingViewModelSubcomponent.Builder
        public PollingViewModelSubcomponentBuilder args(PollingViewModel.Args args) {
            this.args = (PollingViewModel.Args) C51679xZ3.m5005b(args);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di.PollingViewModelSubcomponent.Builder
        public PollingViewModelSubcomponentBuilder savedStateHandle(C11747p c11747p) {
            this.savedStateHandle = (C11747p) C51679xZ3.m5005b(c11747p);
            return this;
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.di.DaggerPollingComponent$PollingViewModelSubcomponentImpl */
    /* loaded from: classes7.dex */
    public static final class PollingViewModelSubcomponentImpl implements PollingViewModelSubcomponent {
        private final PollingViewModel.Args args;
        private final PollingComponentImpl pollingComponentImpl;
        private final PollingViewModelSubcomponentImpl pollingViewModelSubcomponentImpl;
        private final C11747p savedStateHandle;

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di.PollingViewModelSubcomponent
        public PollingViewModel getViewModel() {
            return new PollingViewModel(this.args, this.pollingComponentImpl.defaultIntentStatusPoller(), new DefaultTimeProvider(), this.pollingComponentImpl.ioDispatcher, this.savedStateHandle);
        }

        private PollingViewModelSubcomponentImpl(PollingComponentImpl pollingComponentImpl, C11747p c11747p, PollingViewModel.Args args) {
            this.pollingViewModelSubcomponentImpl = this;
            this.pollingComponentImpl = pollingComponentImpl;
            this.args = args;
            this.savedStateHandle = c11747p;
        }
    }

    private DaggerPollingComponent() {
    }

    public static PollingComponent.Builder builder() {
        return new Builder();
    }
}
