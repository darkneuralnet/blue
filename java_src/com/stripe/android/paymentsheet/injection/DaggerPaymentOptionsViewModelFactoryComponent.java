package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.C11747p;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideUIContextFactory;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.LinkPaymentLauncher_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.p049ui.core.forms.resources.injection.ResourceRepositoryModule_ProvideResourcesFactory;
import com.stripe.android.p049ui.core.forms.resources.injection.ResourceRepositoryModule_ProvidesLpmRepositoryFactory;
import com.stripe.android.paymentsheet.LinkHandler;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter_Factory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.EventTimeProvider_Factory;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.forms.FormViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent;
import com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent;
import com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository_Factory;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.uicore.address.AddressRepository;
import com.stripe.android.uicore.address.AddressRepository_Factory;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* loaded from: classes7.dex */
public final class DaggerPaymentOptionsViewModelFactoryComponent {

    /* loaded from: classes7.dex */
    public static final class Builder implements PaymentOptionsViewModelFactoryComponent.Builder {
        private Context context;
        private Set<String> productUsage;

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent.Builder
        public PaymentOptionsViewModelFactoryComponent build() {
            C51679xZ3.m5006a(this.context, Context.class);
            C51679xZ3.m5006a(this.productUsage, Set.class);
            return new PaymentOptionsViewModelFactoryComponentImpl(new PaymentOptionsViewModelModule(), new CoroutineContextModule(), new CoreCommonModule(), this.context, this.productUsage);
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ PaymentOptionsViewModelFactoryComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        private Builder() {
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) C51679xZ3.m5005b(context);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) C51679xZ3.m5005b(set);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class FormViewModelSubcomponentBuilder implements FormViewModelSubcomponent.Builder {
        private FormArguments formArguments;
        private final PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl;
        private InterfaceC32730Eu1<Boolean> showCheckboxFlow;

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.Builder
        public FormViewModelSubcomponent build() {
            C51679xZ3.m5006a(this.formArguments, FormArguments.class);
            C51679xZ3.m5006a(this.showCheckboxFlow, InterfaceC32730Eu1.class);
            return new FormViewModelSubcomponentImpl(this.paymentOptionsViewModelFactoryComponentImpl, this.formArguments, this.showCheckboxFlow);
        }

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.Builder
        public /* bridge */ /* synthetic */ FormViewModelSubcomponent.Builder showCheckboxFlow(InterfaceC32730Eu1 interfaceC32730Eu1) {
            return showCheckboxFlow((InterfaceC32730Eu1<Boolean>) interfaceC32730Eu1);
        }

        private FormViewModelSubcomponentBuilder(PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl) {
            this.paymentOptionsViewModelFactoryComponentImpl = paymentOptionsViewModelFactoryComponentImpl;
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
        private final FormArguments formArguments;
        private final FormViewModelSubcomponentImpl formViewModelSubcomponentImpl;
        private final PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl;
        private final InterfaceC32730Eu1<Boolean> showCheckboxFlow;

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent
        public FormViewModel getViewModel() {
            return new FormViewModel(this.paymentOptionsViewModelFactoryComponentImpl.context, this.formArguments, (LpmRepository) this.paymentOptionsViewModelFactoryComponentImpl.providesLpmRepositoryProvider.get(), (AddressRepository) this.paymentOptionsViewModelFactoryComponentImpl.addressRepositoryProvider.get(), this.showCheckboxFlow);
        }

        private FormViewModelSubcomponentImpl(PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl, FormArguments formArguments, InterfaceC32730Eu1<Boolean> interfaceC32730Eu1) {
            this.formViewModelSubcomponentImpl = this;
            this.paymentOptionsViewModelFactoryComponentImpl = paymentOptionsViewModelFactoryComponentImpl;
            this.formArguments = formArguments;
            this.showCheckboxFlow = interfaceC32730Eu1;
        }
    }

    /* loaded from: classes7.dex */
    public static final class PaymentOptionsViewModelFactoryComponentImpl extends PaymentOptionsViewModelFactoryComponent {
        private Y94<AddressRepository> addressRepositoryProvider;
        private final Context context;
        private Y94<Context> contextProvider;
        private Y94<CustomerApiRepository> customerApiRepositoryProvider;
        private Y94<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Y94<DefaultEventReporter> defaultEventReporterProvider;
        private Y94<FormViewModelSubcomponent.Builder> formViewModelSubcomponentBuilderProvider;
        private Y94<LinkPaymentLauncher> linkPaymentLauncherProvider;
        private Y94<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private final PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl;
        private Y94<PaymentOptionsViewModelSubcomponent.Builder> paymentOptionsViewModelSubcomponentBuilderProvider;
        private Y94<Set<String>> productUsageProvider;
        private Y94<Boolean> provideEnabledLoggingProvider;
        private Y94<EventReporter.Mode> provideEventReporterModeProvider;
        private Y94<Logger> provideLoggerProvider;
        private Y94<PaymentConfiguration> providePaymentConfigurationProvider;
        private Y94<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> providePrefsRepositoryFactoryProvider;
        private Y94<Function0<String>> providePublishableKeyProvider;
        private Y94<Resources> provideResourcesProvider;
        private Y94<Function0<String>> provideStripeAccountIdProvider;
        private Y94<CoroutineContext> provideUIContextProvider;
        private Y94<CoroutineContext> provideWorkContextProvider;
        private Y94<LpmRepository> providesLpmRepositoryProvider;
        private Y94<StripeApiRepository> stripeApiRepositoryProvider;

        private void initialize(PaymentOptionsViewModelModule paymentOptionsViewModelModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Set<String> set) {
            this.paymentOptionsViewModelSubcomponentBuilderProvider = new Y94<PaymentOptionsViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerPaymentOptionsViewModelFactoryComponent.PaymentOptionsViewModelFactoryComponentImpl.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.Y94
                public PaymentOptionsViewModelSubcomponent.Builder get() {
                    return new PaymentOptionsViewModelSubcomponentBuilder(PaymentOptionsViewModelFactoryComponentImpl.this.paymentOptionsViewModelFactoryComponentImpl);
                }
            };
            this.formViewModelSubcomponentBuilderProvider = new Y94<FormViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerPaymentOptionsViewModelFactoryComponent.PaymentOptionsViewModelFactoryComponentImpl.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.Y94
                public FormViewModelSubcomponent.Builder get() {
                    return new FormViewModelSubcomponentBuilder(PaymentOptionsViewModelFactoryComponentImpl.this.paymentOptionsViewModelFactoryComponentImpl);
                }
            };
            this.contextProvider = C39546d52.m44621a(context);
            Y94<CoroutineContext> m80429b = V51.m80429b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            this.provideWorkContextProvider = m80429b;
            this.providePrefsRepositoryFactoryProvider = V51.m80429b(C19229x55c689fb.create(this.contextProvider, m80429b));
            this.provideEventReporterModeProvider = V51.m80429b(PaymentOptionsViewModelModule_ProvideEventReporterModeFactory.create(paymentOptionsViewModelModule));
            Y94<Boolean> m80429b2 = V51.m80429b(PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory.create());
            this.provideEnabledLoggingProvider = m80429b2;
            Y94<Logger> m80429b3 = V51.m80429b(CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, m80429b2));
            this.provideLoggerProvider = m80429b3;
            this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(m80429b3, this.provideWorkContextProvider);
            C19228xcc094b3b create = C19228xcc094b3b.create(this.contextProvider);
            this.providePaymentConfigurationProvider = create;
            this.providePublishableKeyProvider = PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.create(create);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(set);
            this.productUsageProvider = m44621a;
            PaymentAnalyticsRequestFactory_Factory create2 = PaymentAnalyticsRequestFactory_Factory.create(this.contextProvider, this.providePublishableKeyProvider, m44621a);
            this.paymentAnalyticsRequestFactoryProvider = create2;
            this.defaultEventReporterProvider = V51.m80429b(DefaultEventReporter_Factory.create(this.provideEventReporterModeProvider, this.defaultAnalyticsRequestExecutorProvider, create2, EventTimeProvider_Factory.create(), this.provideWorkContextProvider));
            StripeApiRepository_Factory create3 = StripeApiRepository_Factory.create(this.contextProvider, this.providePublishableKeyProvider, this.provideWorkContextProvider, this.productUsageProvider, this.paymentAnalyticsRequestFactoryProvider, this.defaultAnalyticsRequestExecutorProvider, this.provideLoggerProvider);
            this.stripeApiRepositoryProvider = create3;
            this.customerApiRepositoryProvider = V51.m80429b(CustomerApiRepository_Factory.create(create3, this.providePaymentConfigurationProvider, this.provideLoggerProvider, this.provideWorkContextProvider, this.productUsageProvider));
            Y94<Resources> m80429b4 = V51.m80429b(ResourceRepositoryModule_ProvideResourcesFactory.create(this.contextProvider));
            this.provideResourcesProvider = m80429b4;
            this.providesLpmRepositoryProvider = V51.m80429b(ResourceRepositoryModule_ProvidesLpmRepositoryFactory.create(m80429b4));
            this.provideStripeAccountIdProvider = PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory.create(this.providePaymentConfigurationProvider);
            this.provideUIContextProvider = V51.m80429b(CoroutineContextModule_ProvideUIContextFactory.create(coroutineContextModule));
            Y94<AddressRepository> m80429b5 = V51.m80429b(AddressRepository_Factory.create(this.provideResourcesProvider, this.provideWorkContextProvider));
            this.addressRepositoryProvider = m80429b5;
            this.linkPaymentLauncherProvider = V51.m80429b(LinkPaymentLauncher_Factory.create(this.contextProvider, this.productUsageProvider, this.providePublishableKeyProvider, this.provideStripeAccountIdProvider, this.provideEnabledLoggingProvider, this.provideWorkContextProvider, this.provideUIContextProvider, this.paymentAnalyticsRequestFactoryProvider, this.defaultAnalyticsRequestExecutorProvider, this.stripeApiRepositoryProvider, m80429b5));
        }

        private PaymentOptionsViewModel.Factory injectFactory(PaymentOptionsViewModel.Factory factory) {
            PaymentOptionsViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.paymentOptionsViewModelSubcomponentBuilderProvider);
            return factory;
        }

        private FormViewModel.Factory injectFactory2(FormViewModel.Factory factory) {
            FormViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.formViewModelSubcomponentBuilderProvider);
            return factory;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent
        public void inject(PaymentOptionsViewModel.Factory factory) {
            injectFactory(factory);
        }

        private PaymentOptionsViewModelFactoryComponentImpl(PaymentOptionsViewModelModule paymentOptionsViewModelModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Set<String> set) {
            this.paymentOptionsViewModelFactoryComponentImpl = this;
            this.context = context;
            initialize(paymentOptionsViewModelModule, coroutineContextModule, coreCommonModule, context, set);
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent
        public void inject(FormViewModel.Factory factory) {
            injectFactory2(factory);
        }
    }

    /* loaded from: classes7.dex */
    public static final class PaymentOptionsViewModelSubcomponentBuilder implements PaymentOptionsViewModelSubcomponent.Builder {
        private Application application;
        private PaymentOptionContract.Args args;
        private final PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl;
        private C11747p savedStateHandle;

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent.Builder
        public PaymentOptionsViewModelSubcomponent build() {
            C51679xZ3.m5006a(this.application, Application.class);
            C51679xZ3.m5006a(this.savedStateHandle, C11747p.class);
            C51679xZ3.m5006a(this.args, PaymentOptionContract.Args.class);
            return new PaymentOptionsViewModelSubcomponentImpl(this.paymentOptionsViewModelFactoryComponentImpl, this.application, this.savedStateHandle, this.args);
        }

        private PaymentOptionsViewModelSubcomponentBuilder(PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl) {
            this.paymentOptionsViewModelFactoryComponentImpl = paymentOptionsViewModelFactoryComponentImpl;
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
        private final PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl;
        private final PaymentOptionsViewModelSubcomponentImpl paymentOptionsViewModelSubcomponentImpl;
        private final C11747p savedStateHandle;

        private LinkHandler linkHandler() {
            return new LinkHandler((LinkPaymentLauncher) this.paymentOptionsViewModelFactoryComponentImpl.linkPaymentLauncherProvider.get(), this.savedStateHandle);
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent
        public PaymentOptionsViewModel getViewModel() {
            return new PaymentOptionsViewModel(this.args, (Function1) this.paymentOptionsViewModelFactoryComponentImpl.providePrefsRepositoryFactoryProvider.get(), (EventReporter) this.paymentOptionsViewModelFactoryComponentImpl.defaultEventReporterProvider.get(), (CustomerRepository) this.paymentOptionsViewModelFactoryComponentImpl.customerApiRepositoryProvider.get(), (CoroutineContext) this.paymentOptionsViewModelFactoryComponentImpl.provideWorkContextProvider.get(), this.application, (Logger) this.paymentOptionsViewModelFactoryComponentImpl.provideLoggerProvider.get(), (LpmRepository) this.paymentOptionsViewModelFactoryComponentImpl.providesLpmRepositoryProvider.get(), this.savedStateHandle, linkHandler());
        }

        private PaymentOptionsViewModelSubcomponentImpl(PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl, Application application, C11747p c11747p, PaymentOptionContract.Args args) {
            this.paymentOptionsViewModelSubcomponentImpl = this;
            this.paymentOptionsViewModelFactoryComponentImpl = paymentOptionsViewModelFactoryComponentImpl;
            this.args = args;
            this.application = application;
            this.savedStateHandle = c11747p;
        }
    }

    private DaggerPaymentOptionsViewModelFactoryComponent() {
    }

    public static PaymentOptionsViewModelFactoryComponent.Builder builder() {
        return new Builder();
    }
}
