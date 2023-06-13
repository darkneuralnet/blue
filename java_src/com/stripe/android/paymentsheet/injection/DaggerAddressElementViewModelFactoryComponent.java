package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.FormController;
import com.stripe.android.p049ui.core.elements.LayoutSpec;
import com.stripe.android.p049ui.core.elements.autocomplete.PlacesClientProxy;
import com.stripe.android.p049ui.core.forms.TransformSpecToElements;
import com.stripe.android.p049ui.core.forms.resources.injection.ResourceRepositoryModule_ProvideResourcesFactory;
import com.stripe.android.p049ui.core.injection.FormControllerModule_ProvideTransformSpecToElementsFactory;
import com.stripe.android.p049ui.core.injection.FormControllerSubcomponent;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.AddressElementNavigator;
import com.stripe.android.paymentsheet.addresselement.AddressElementNavigator_Factory;
import com.stripe.android.paymentsheet.addresselement.AddressElementViewModel;
import com.stripe.android.paymentsheet.addresselement.AddressElementViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel;
import com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.addresselement.InputAddressViewModel;
import com.stripe.android.paymentsheet.addresselement.InputAddressViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter;
import com.stripe.android.paymentsheet.addresselement.analytics.DefaultAddressLauncherEventReporter;
import com.stripe.android.paymentsheet.addresselement.analytics.DefaultAddressLauncherEventReporter_Factory;
import com.stripe.android.paymentsheet.injection.AddressElementViewModelFactoryComponent;
import com.stripe.android.paymentsheet.injection.AutocompleteViewModelSubcomponent;
import com.stripe.android.paymentsheet.injection.InputAddressViewModelSubcomponent;
import com.stripe.android.uicore.address.AddressRepository;
import com.stripe.android.uicore.address.AddressRepository_Factory;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
/* loaded from: classes7.dex */
public final class DaggerAddressElementViewModelFactoryComponent {

    /* loaded from: classes7.dex */
    public static final class AddressElementViewModelFactoryComponentImpl extends AddressElementViewModelFactoryComponent {
        private Y94<AddressElementNavigator> addressElementNavigatorProvider;
        private final AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl;
        private Y94<AddressRepository> addressRepositoryProvider;
        private Y94<AutocompleteViewModelSubcomponent.Builder> autocompleteViewModelSubcomponentBuilderProvider;
        private final Context context;
        private Y94<Context> contextProvider;
        private Y94<DefaultAddressLauncherEventReporter> defaultAddressLauncherEventReporterProvider;
        private Y94<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Y94<FormControllerSubcomponent.Builder> formControllerSubcomponentBuilderProvider;
        private Y94<InputAddressViewModelSubcomponent.Builder> inputAddressViewModelSubcomponentBuilderProvider;
        private Y94<AnalyticsRequestFactory> provideAnalyticsRequestFactory$paymentsheet_releaseProvider;
        private Y94<Boolean> provideEnabledLoggingProvider;
        private Y94<AddressLauncherEventReporter> provideEventReporterProvider;
        private Y94<PlacesClientProxy> provideGooglePlacesClient$paymentsheet_releaseProvider;
        private Y94<Logger> provideLoggerProvider;
        private Y94<Resources> provideResourcesProvider;
        private Y94<CoroutineContext> provideWorkContextProvider;
        private Y94<String> providesPublishableKeyProvider;
        private final AddressElementActivityContract.Args starterArgs;
        private Y94<AddressElementActivityContract.Args> starterArgsProvider;

        private AddressElementViewModel addressElementViewModel() {
            return new AddressElementViewModel(this.addressElementNavigatorProvider.get());
        }

        private void initialize(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, AddressElementViewModelModule addressElementViewModelModule, Context context, AddressElementActivityContract.Args args) {
            this.addressElementNavigatorProvider = V51.m80429b(AddressElementNavigator_Factory.create());
            this.inputAddressViewModelSubcomponentBuilderProvider = new Y94<InputAddressViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerAddressElementViewModelFactoryComponent.AddressElementViewModelFactoryComponentImpl.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.Y94
                public InputAddressViewModelSubcomponent.Builder get() {
                    return new InputAddressViewModelSubcomponentBuilder(AddressElementViewModelFactoryComponentImpl.this.addressElementViewModelFactoryComponentImpl);
                }
            };
            this.autocompleteViewModelSubcomponentBuilderProvider = new Y94<AutocompleteViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerAddressElementViewModelFactoryComponent.AddressElementViewModelFactoryComponentImpl.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.Y94
                public AutocompleteViewModelSubcomponent.Builder get() {
                    return new AutocompleteViewModelSubcomponentBuilder(AddressElementViewModelFactoryComponentImpl.this.addressElementViewModelFactoryComponentImpl);
                }
            };
            Y94<Boolean> m80429b = V51.m80429b(PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory.create());
            this.provideEnabledLoggingProvider = m80429b;
            this.provideLoggerProvider = V51.m80429b(CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, m80429b));
            Y94<CoroutineContext> m80429b2 = V51.m80429b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            this.provideWorkContextProvider = m80429b2;
            this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, m80429b2);
            this.contextProvider = C39546d52.m44621a(context);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(args);
            this.starterArgsProvider = m44621a;
            Y94<String> m80429b3 = V51.m80429b(AddressElementViewModelModule_ProvidesPublishableKeyFactory.create(addressElementViewModelModule, m44621a));
            this.providesPublishableKeyProvider = m80429b3;
            Y94<AnalyticsRequestFactory> m80429b4 = V51.m80429b(C19218xf9404c5c.create(addressElementViewModelModule, this.contextProvider, m80429b3));
            this.provideAnalyticsRequestFactory$paymentsheet_releaseProvider = m80429b4;
            Y94<DefaultAddressLauncherEventReporter> m80429b5 = V51.m80429b(DefaultAddressLauncherEventReporter_Factory.create(this.defaultAnalyticsRequestExecutorProvider, m80429b4, this.provideWorkContextProvider));
            this.defaultAddressLauncherEventReporterProvider = m80429b5;
            this.provideEventReporterProvider = V51.m80429b(AddressElementViewModelModule_ProvideEventReporterFactory.create(addressElementViewModelModule, m80429b5));
            this.formControllerSubcomponentBuilderProvider = new Y94<FormControllerSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerAddressElementViewModelFactoryComponent.AddressElementViewModelFactoryComponentImpl.3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.Y94
                public FormControllerSubcomponent.Builder get() {
                    return new FormControllerSubcomponentBuilder(AddressElementViewModelFactoryComponentImpl.this.addressElementViewModelFactoryComponentImpl);
                }
            };
            this.provideGooglePlacesClient$paymentsheet_releaseProvider = V51.m80429b(C19219x1b637b9f.create(addressElementViewModelModule, this.contextProvider, this.starterArgsProvider));
            Y94<Resources> m80429b6 = V51.m80429b(ResourceRepositoryModule_ProvideResourcesFactory.create(this.contextProvider));
            this.provideResourcesProvider = m80429b6;
            this.addressRepositoryProvider = V51.m80429b(AddressRepository_Factory.create(m80429b6, this.provideWorkContextProvider));
        }

        private AddressElementViewModel.Factory injectFactory(AddressElementViewModel.Factory factory) {
            AddressElementViewModel_Factory_MembersInjector.injectViewModel(factory, addressElementViewModel());
            return factory;
        }

        private InputAddressViewModel.Factory injectFactory2(InputAddressViewModel.Factory factory) {
            InputAddressViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.inputAddressViewModelSubcomponentBuilderProvider);
            return factory;
        }

        private AutocompleteViewModel.Factory injectFactory3(AutocompleteViewModel.Factory factory) {
            AutocompleteViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.autocompleteViewModelSubcomponentBuilderProvider);
            return factory;
        }

        @Override // com.stripe.android.paymentsheet.injection.AddressElementViewModelFactoryComponent
        public void inject(AddressElementViewModel.Factory factory) {
            injectFactory(factory);
        }

        private AddressElementViewModelFactoryComponentImpl(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, AddressElementViewModelModule addressElementViewModelModule, Context context, AddressElementActivityContract.Args args) {
            this.addressElementViewModelFactoryComponentImpl = this;
            this.starterArgs = args;
            this.context = context;
            initialize(coroutineContextModule, coreCommonModule, addressElementViewModelModule, context, args);
        }

        @Override // com.stripe.android.paymentsheet.injection.AddressElementViewModelFactoryComponent
        public void inject(InputAddressViewModel.Factory factory) {
            injectFactory2(factory);
        }

        @Override // com.stripe.android.paymentsheet.injection.AddressElementViewModelFactoryComponent
        public void inject(AutocompleteViewModel.Factory factory) {
            injectFactory3(factory);
        }
    }

    /* loaded from: classes7.dex */
    public static final class AutocompleteViewModelSubcomponentBuilder implements AutocompleteViewModelSubcomponent.Builder {
        private final AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl;
        private Application application;
        private AutocompleteViewModel.Args configuration;

        @Override // com.stripe.android.paymentsheet.injection.AutocompleteViewModelSubcomponent.Builder
        public AutocompleteViewModelSubcomponent build() {
            C51679xZ3.m5006a(this.application, Application.class);
            C51679xZ3.m5006a(this.configuration, AutocompleteViewModel.Args.class);
            return new AutocompleteViewModelSubcomponentImpl(this.addressElementViewModelFactoryComponentImpl, this.application, this.configuration);
        }

        private AutocompleteViewModelSubcomponentBuilder(AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl) {
            this.addressElementViewModelFactoryComponentImpl = addressElementViewModelFactoryComponentImpl;
        }

        @Override // com.stripe.android.paymentsheet.injection.AutocompleteViewModelSubcomponent.Builder
        public AutocompleteViewModelSubcomponentBuilder application(Application application) {
            this.application = (Application) C51679xZ3.m5005b(application);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.AutocompleteViewModelSubcomponent.Builder
        public AutocompleteViewModelSubcomponentBuilder configuration(AutocompleteViewModel.Args args) {
            this.configuration = (AutocompleteViewModel.Args) C51679xZ3.m5005b(args);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class AutocompleteViewModelSubcomponentImpl implements AutocompleteViewModelSubcomponent {
        private final AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl;
        private final Application application;
        private final AutocompleteViewModelSubcomponentImpl autocompleteViewModelSubcomponentImpl;
        private final AutocompleteViewModel.Args configuration;

        @Override // com.stripe.android.paymentsheet.injection.AutocompleteViewModelSubcomponent
        public AutocompleteViewModel getAutoCompleteViewModel() {
            return new AutocompleteViewModel(this.addressElementViewModelFactoryComponentImpl.starterArgs, (AddressElementNavigator) this.addressElementViewModelFactoryComponentImpl.addressElementNavigatorProvider.get(), (PlacesClientProxy) this.addressElementViewModelFactoryComponentImpl.provideGooglePlacesClient$paymentsheet_releaseProvider.get(), this.configuration, (AddressLauncherEventReporter) this.addressElementViewModelFactoryComponentImpl.provideEventReporterProvider.get(), this.application);
        }

        private AutocompleteViewModelSubcomponentImpl(AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl, Application application, AutocompleteViewModel.Args args) {
            this.autocompleteViewModelSubcomponentImpl = this;
            this.addressElementViewModelFactoryComponentImpl = addressElementViewModelFactoryComponentImpl;
            this.configuration = args;
            this.application = application;
        }
    }

    /* loaded from: classes7.dex */
    public static final class Builder implements AddressElementViewModelFactoryComponent.Builder {
        private Context context;
        private AddressElementActivityContract.Args starterArgs;

        @Override // com.stripe.android.paymentsheet.injection.AddressElementViewModelFactoryComponent.Builder
        public AddressElementViewModelFactoryComponent build() {
            C51679xZ3.m5006a(this.context, Context.class);
            C51679xZ3.m5006a(this.starterArgs, AddressElementActivityContract.Args.class);
            return new AddressElementViewModelFactoryComponentImpl(new CoroutineContextModule(), new CoreCommonModule(), new AddressElementViewModelModule(), this.context, this.starterArgs);
        }

        private Builder() {
        }

        @Override // com.stripe.android.paymentsheet.injection.AddressElementViewModelFactoryComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) C51679xZ3.m5005b(context);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.AddressElementViewModelFactoryComponent.Builder
        public Builder starterArgs(AddressElementActivityContract.Args args) {
            this.starterArgs = (AddressElementActivityContract.Args) C51679xZ3.m5005b(args);
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class FormControllerSubcomponentBuilder implements FormControllerSubcomponent.Builder {
        private final AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl;
        private LayoutSpec formSpec;
        private Map<IdentifierSpec, String> initialValues;
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
            return new FormControllerSubcomponentImpl(this.addressElementViewModelFactoryComponentImpl, this.formSpec, this.initialValues, this.shippingValues, this.viewOnlyFields, this.viewModelScope, this.stripeIntent, this.merchantName);
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

        private FormControllerSubcomponentBuilder(AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl) {
            this.addressElementViewModelFactoryComponentImpl = addressElementViewModelFactoryComponentImpl;
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
        private final AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl;
        private final FormControllerSubcomponentImpl formControllerSubcomponentImpl;
        private final LayoutSpec formSpec;
        private final Map<IdentifierSpec, String> initialValues;
        private final String merchantName;
        private final Map<IdentifierSpec, String> shippingValues;
        private final StripeIntent stripeIntent;
        private final Set<IdentifierSpec> viewOnlyFields;

        private TransformSpecToElements transformSpecToElements() {
            return FormControllerModule_ProvideTransformSpecToElementsFactory.provideTransformSpecToElements((AddressRepository) this.addressElementViewModelFactoryComponentImpl.addressRepositoryProvider.get(), this.addressElementViewModelFactoryComponentImpl.context, this.merchantName, this.stripeIntent, this.initialValues, this.shippingValues, this.viewOnlyFields);
        }

        @Override // com.stripe.android.p049ui.core.injection.FormControllerSubcomponent
        public FormController getFormController() {
            return new FormController(this.formSpec, transformSpecToElements());
        }

        private FormControllerSubcomponentImpl(AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl, LayoutSpec layoutSpec, Map<IdentifierSpec, String> map, Map<IdentifierSpec, String> map2, Set<IdentifierSpec> set, ZC0 zc0, StripeIntent stripeIntent, String str) {
            this.formControllerSubcomponentImpl = this;
            this.addressElementViewModelFactoryComponentImpl = addressElementViewModelFactoryComponentImpl;
            this.formSpec = layoutSpec;
            this.merchantName = str;
            this.stripeIntent = stripeIntent;
            this.initialValues = map;
            this.shippingValues = map2;
            this.viewOnlyFields = set;
        }
    }

    /* loaded from: classes7.dex */
    public static final class InputAddressViewModelSubcomponentBuilder implements InputAddressViewModelSubcomponent.Builder {
        private final AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl;

        @Override // com.stripe.android.paymentsheet.injection.InputAddressViewModelSubcomponent.Builder
        public InputAddressViewModelSubcomponent build() {
            return new InputAddressViewModelSubcomponentImpl(this.addressElementViewModelFactoryComponentImpl);
        }

        private InputAddressViewModelSubcomponentBuilder(AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl) {
            this.addressElementViewModelFactoryComponentImpl = addressElementViewModelFactoryComponentImpl;
        }
    }

    /* loaded from: classes7.dex */
    public static final class InputAddressViewModelSubcomponentImpl implements InputAddressViewModelSubcomponent {
        private final AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl;
        private final InputAddressViewModelSubcomponentImpl inputAddressViewModelSubcomponentImpl;

        @Override // com.stripe.android.paymentsheet.injection.InputAddressViewModelSubcomponent
        public InputAddressViewModel getInputAddressViewModel() {
            return new InputAddressViewModel(this.addressElementViewModelFactoryComponentImpl.starterArgs, (AddressElementNavigator) this.addressElementViewModelFactoryComponentImpl.addressElementNavigatorProvider.get(), (AddressLauncherEventReporter) this.addressElementViewModelFactoryComponentImpl.provideEventReporterProvider.get(), this.addressElementViewModelFactoryComponentImpl.formControllerSubcomponentBuilderProvider);
        }

        private InputAddressViewModelSubcomponentImpl(AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl) {
            this.inputAddressViewModelSubcomponentImpl = this;
            this.addressElementViewModelFactoryComponentImpl = addressElementViewModelFactoryComponentImpl;
        }
    }

    private DaggerAddressElementViewModelFactoryComponent() {
    }

    public static AddressElementViewModelFactoryComponent.Builder builder() {
        return new Builder();
    }
}
