package com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di;

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
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di.USBankAccountFormComponent;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di.USBankAccountFormViewModelSubcomponent;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.di.DaggerUSBankAccountFormComponent */
/* loaded from: classes7.dex */
public final class DaggerUSBankAccountFormComponent {

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.di.DaggerUSBankAccountFormComponent$Builder */
    /* loaded from: classes7.dex */
    public static final class Builder implements USBankAccountFormComponent.Builder {
        private Application application;
        private String injectorKey;

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di.USBankAccountFormComponent.Builder
        public USBankAccountFormComponent build() {
            C51679xZ3.m5006a(this.application, Application.class);
            C51679xZ3.m5006a(this.injectorKey, String.class);
            return new USBankAccountFormComponentImpl(new CoroutineContextModule(), new USBankAccountFormViewModelModule(), new CoreCommonModule(), this.application, this.injectorKey);
        }

        private Builder() {
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di.USBankAccountFormComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) C51679xZ3.m5005b(application);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di.USBankAccountFormComponent.Builder
        public Builder injectorKey(String str) {
            this.injectorKey = (String) C51679xZ3.m5005b(str);
            return this;
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.di.DaggerUSBankAccountFormComponent$USBankAccountFormComponentImpl */
    /* loaded from: classes7.dex */
    public static final class USBankAccountFormComponentImpl implements USBankAccountFormComponent {
        private final Application application;
        private Y94<Application> applicationProvider;
        private Y94<Logger> provideLoggerProvider;
        private Y94<PaymentConfiguration> providePaymentConfigurationProvider;
        private Y94<CoroutineContext> provideWorkContextProvider;
        private Y94<Context> providesAppContextProvider;
        private Y94<Boolean> providesEnableLoggingProvider;
        private final USBankAccountFormComponentImpl uSBankAccountFormComponentImpl;
        private final USBankAccountFormViewModelModule uSBankAccountFormViewModelModule;
        private Y94<USBankAccountFormViewModelSubcomponent.Builder> uSBankAccountFormViewModelSubcomponentBuilderProvider;

        private Context context() {
            return USBankAccountFormViewModelModule_ProvidesAppContextFactory.providesAppContext(this.uSBankAccountFormViewModelModule, this.application);
        }

        private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.provideWorkContextProvider.get());
        }

        private void initialize(CoroutineContextModule coroutineContextModule, USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, CoreCommonModule coreCommonModule, Application application, String str) {
            this.uSBankAccountFormViewModelSubcomponentBuilderProvider = new Y94<USBankAccountFormViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.di.DaggerUSBankAccountFormComponent.USBankAccountFormComponentImpl.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.Y94
                public USBankAccountFormViewModelSubcomponent.Builder get() {
                    return new USBankAccountFormViewModelSubcomponentBuilder(USBankAccountFormComponentImpl.this.uSBankAccountFormComponentImpl);
                }
            };
            this.provideWorkContextProvider = V51.m80429b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            USBankAccountFormViewModelModule_ProvidesEnableLoggingFactory create = USBankAccountFormViewModelModule_ProvidesEnableLoggingFactory.create(uSBankAccountFormViewModelModule);
            this.providesEnableLoggingProvider = create;
            this.provideLoggerProvider = V51.m80429b(CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, create));
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(application);
            this.applicationProvider = m44621a;
            USBankAccountFormViewModelModule_ProvidesAppContextFactory create2 = USBankAccountFormViewModelModule_ProvidesAppContextFactory.create(uSBankAccountFormViewModelModule, m44621a);
            this.providesAppContextProvider = create2;
            this.providePaymentConfigurationProvider = C19274xe44a13f.create(uSBankAccountFormViewModelModule, create2);
        }

        private USBankAccountFormViewModel.Factory injectFactory(USBankAccountFormViewModel.Factory factory) {
            USBankAccountFormViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.uSBankAccountFormViewModelSubcomponentBuilderProvider);
            return factory;
        }

        private Function0<String> namedFunction0OfString() {
            return USBankAccountFormViewModelModule_ProvidePublishableKeyFactory.providePublishableKey(this.uSBankAccountFormViewModelModule, context());
        }

        private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(context(), namedFunction0OfString(), USBankAccountFormViewModelModule_ProvidesProductUsageFactory.providesProductUsage(this.uSBankAccountFormViewModelModule));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public StripeApiRepository stripeApiRepository() {
            return new StripeApiRepository(context(), namedFunction0OfString(), this.provideWorkContextProvider.get(), USBankAccountFormViewModelModule_ProvidesProductUsageFactory.providesProductUsage(this.uSBankAccountFormViewModelModule), paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.get());
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di.USBankAccountFormComponent
        public void inject(USBankAccountFormViewModel.Factory factory) {
            injectFactory(factory);
        }

        private USBankAccountFormComponentImpl(CoroutineContextModule coroutineContextModule, USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, CoreCommonModule coreCommonModule, Application application, String str) {
            this.uSBankAccountFormComponentImpl = this;
            this.application = application;
            this.uSBankAccountFormViewModelModule = uSBankAccountFormViewModelModule;
            initialize(coroutineContextModule, uSBankAccountFormViewModelModule, coreCommonModule, application, str);
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.di.DaggerUSBankAccountFormComponent$USBankAccountFormViewModelSubcomponentBuilder */
    /* loaded from: classes7.dex */
    public static final class USBankAccountFormViewModelSubcomponentBuilder implements USBankAccountFormViewModelSubcomponent.Builder {
        private USBankAccountFormViewModel.Args configuration;
        private C11747p savedStateHandle;
        private final USBankAccountFormComponentImpl uSBankAccountFormComponentImpl;

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di.USBankAccountFormViewModelSubcomponent.Builder
        public USBankAccountFormViewModelSubcomponent build() {
            C51679xZ3.m5006a(this.savedStateHandle, C11747p.class);
            C51679xZ3.m5006a(this.configuration, USBankAccountFormViewModel.Args.class);
            return new USBankAccountFormViewModelSubcomponentImpl(this.uSBankAccountFormComponentImpl, this.savedStateHandle, this.configuration);
        }

        private USBankAccountFormViewModelSubcomponentBuilder(USBankAccountFormComponentImpl uSBankAccountFormComponentImpl) {
            this.uSBankAccountFormComponentImpl = uSBankAccountFormComponentImpl;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di.USBankAccountFormViewModelSubcomponent.Builder
        public USBankAccountFormViewModelSubcomponentBuilder configuration(USBankAccountFormViewModel.Args args) {
            this.configuration = (USBankAccountFormViewModel.Args) C51679xZ3.m5005b(args);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di.USBankAccountFormViewModelSubcomponent.Builder
        public USBankAccountFormViewModelSubcomponentBuilder savedStateHandle(C11747p c11747p) {
            this.savedStateHandle = (C11747p) C51679xZ3.m5005b(c11747p);
            return this;
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.di.DaggerUSBankAccountFormComponent$USBankAccountFormViewModelSubcomponentImpl */
    /* loaded from: classes7.dex */
    public static final class USBankAccountFormViewModelSubcomponentImpl implements USBankAccountFormViewModelSubcomponent {
        private final USBankAccountFormViewModel.Args configuration;
        private final C11747p savedStateHandle;
        private final USBankAccountFormComponentImpl uSBankAccountFormComponentImpl;
        private final USBankAccountFormViewModelSubcomponentImpl uSBankAccountFormViewModelSubcomponentImpl;

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di.USBankAccountFormViewModelSubcomponent
        public USBankAccountFormViewModel getViewModel() {
            return new USBankAccountFormViewModel(this.configuration, this.uSBankAccountFormComponentImpl.application, this.uSBankAccountFormComponentImpl.stripeApiRepository(), this.uSBankAccountFormComponentImpl.providePaymentConfigurationProvider, this.savedStateHandle);
        }

        private USBankAccountFormViewModelSubcomponentImpl(USBankAccountFormComponentImpl uSBankAccountFormComponentImpl, C11747p c11747p, USBankAccountFormViewModel.Args args) {
            this.uSBankAccountFormViewModelSubcomponentImpl = this;
            this.uSBankAccountFormComponentImpl = uSBankAccountFormComponentImpl;
            this.configuration = args;
            this.savedStateHandle = c11747p;
        }
    }

    private DaggerUSBankAccountFormComponent() {
    }

    public static USBankAccountFormComponent.Builder builder() {
        return new Builder();
    }
}
