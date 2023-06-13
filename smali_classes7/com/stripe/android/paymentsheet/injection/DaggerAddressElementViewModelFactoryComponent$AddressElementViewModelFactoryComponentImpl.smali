.class final Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;
.super Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelFactoryComponent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AddressElementViewModelFactoryComponentImpl"
.end annotation


# instance fields
.field private addressElementNavigatorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;",
            ">;"
        }
    .end annotation
.end field

.field private final addressElementViewModelFactoryComponentImpl:Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;

.field private addressRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/uicore/address/AddressRepository;",
            ">;"
        }
    .end annotation
.end field

.field private autocompleteViewModelSubcomponentBuilderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private contextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private defaultAddressLauncherEventReporterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/analytics/DefaultAddressLauncherEventReporter;",
            ">;"
        }
    .end annotation
.end field

.field private defaultAnalyticsRequestExecutorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;",
            ">;"
        }
    .end annotation
.end field

.field private formControllerSubcomponentBuilderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
            ">;"
        }
    .end annotation
.end field

.field private inputAddressViewModelSubcomponentBuilderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/injection/InputAddressViewModelSubcomponent$Builder;",
            ">;"
        }
    .end annotation
.end field

.field private provideAnalyticsRequestFactory$paymentsheet_releaseProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideEnabledLoggingProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private provideEventReporterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;",
            ">;"
        }
    .end annotation
.end field

.field private provideGooglePlacesClient$paymentsheet_releaseProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;",
            ">;"
        }
    .end annotation
.end field

.field private provideLoggerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;"
        }
    .end annotation
.end field

.field private provideResourcesProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/res/Resources;",
            ">;"
        }
    .end annotation
.end field

.field private provideWorkContextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;"
        }
    .end annotation
.end field

.field private providesPublishableKeyProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final starterArgs:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

.field private starterArgsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;Landroid/content/Context;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelFactoryComponent;-><init>()V

    iput-object p0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->addressElementViewModelFactoryComponentImpl:Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->starterArgs:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->context:Landroid/content/Context;

    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->initialize(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;Landroid/content/Context;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;Landroid/content/Context;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;LwG0;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;Landroid/content/Context;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;)V

    return-void
.end method

.method public static bridge synthetic a(Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->addressElementNavigatorProvider:LY94;

    return-object p0
.end method

.method private addressElementViewModel()Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->addressElementNavigatorProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;)V

    return-object v0
.end method

.method public static bridge synthetic b(Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;)Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->addressElementViewModelFactoryComponentImpl:Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->addressRepositoryProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->context:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->formControllerSubcomponentBuilderProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->provideEventReporterProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->provideGooglePlacesClient$paymentsheet_releaseProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic h(Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->starterArgs:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    return-object p0
.end method

.method private initialize(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;Landroid/content/Context;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;)V
    .locals 1

    invoke-static {}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator_Factory;->create()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator_Factory;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->addressElementNavigatorProvider:LY94;

    new-instance v0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl$1;-><init>(Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;)V

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->inputAddressViewModelSubcomponentBuilderProvider:LY94;

    new-instance v0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl$2;-><init>(Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;)V

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->autocompleteViewModelSubcomponentBuilderProvider:LY94;

    invoke-static {}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory;->create()Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->provideEnabledLoggingProvider:LY94;

    invoke-static {p2, v0}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;->create(Lcom/stripe/android/core/injection/CoreCommonModule;LY94;)Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;

    move-result-object p2

    invoke-static {p2}, LV51;->b(LY94;)LY94;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->provideLoggerProvider:LY94;

    invoke-static {p1}, Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;->create(Lcom/stripe/android/core/injection/CoroutineContextModule;)Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->provideWorkContextProvider:LY94;

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->provideLoggerProvider:LY94;

    invoke-static {p2, p1}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor_Factory;->create(LY94;LY94;)Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->defaultAnalyticsRequestExecutorProvider:LY94;

    invoke-static {p4}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->contextProvider:LY94;

    invoke-static {p5}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->starterArgsProvider:LY94;

    invoke-static {p3, p1}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesPublishableKeyFactory;->create(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;LY94;)Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesPublishableKeyFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->providesPublishableKeyProvider:LY94;

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->contextProvider:LY94;

    invoke-static {p3, p2, p1}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideAnalyticsRequestFactory$paymentsheet_releaseFactory;->create(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;LY94;LY94;)Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideAnalyticsRequestFactory$paymentsheet_releaseFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->provideAnalyticsRequestFactory$paymentsheet_releaseProvider:LY94;

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->defaultAnalyticsRequestExecutorProvider:LY94;

    iget-object p4, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->provideWorkContextProvider:LY94;

    invoke-static {p2, p1, p4}, Lcom/stripe/android/paymentsheet/addresselement/analytics/DefaultAddressLauncherEventReporter_Factory;->create(LY94;LY94;LY94;)Lcom/stripe/android/paymentsheet/addresselement/analytics/DefaultAddressLauncherEventReporter_Factory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->defaultAddressLauncherEventReporterProvider:LY94;

    invoke-static {p3, p1}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideEventReporterFactory;->create(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;LY94;)Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideEventReporterFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->provideEventReporterProvider:LY94;

    new-instance p1, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl$3;

    invoke-direct {p1, p0}, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl$3;-><init>(Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->formControllerSubcomponentBuilderProvider:LY94;

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->contextProvider:LY94;

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->starterArgsProvider:LY94;

    invoke-static {p3, p1, p2}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory;->create(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;LY94;LY94;)Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->provideGooglePlacesClient$paymentsheet_releaseProvider:LY94;

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->contextProvider:LY94;

    invoke-static {p1}, Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule_ProvideResourcesFactory;->create(LY94;)Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule_ProvideResourcesFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->provideResourcesProvider:LY94;

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->provideWorkContextProvider:LY94;

    invoke-static {p1, p2}, Lcom/stripe/android/uicore/address/AddressRepository_Factory;->create(LY94;LY94;)Lcom/stripe/android/uicore/address/AddressRepository_Factory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->addressRepositoryProvider:LY94;

    return-void
.end method

.method private injectFactory(Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel$Factory;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel$Factory;
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->addressElementViewModel()Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel_Factory_MembersInjector;->injectViewModel(Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel$Factory;Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;)V

    return-object p1
.end method

.method private injectFactory2(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$Factory;)Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$Factory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->inputAddressViewModelSubcomponentBuilderProvider:LY94;

    invoke-static {p1, v0}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel_Factory_MembersInjector;->injectSubComponentBuilderProvider(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$Factory;LY94;)V

    return-object p1
.end method

.method private injectFactory3(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;)Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->autocompleteViewModelSubcomponentBuilderProvider:LY94;

    invoke-static {p1, v0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory_MembersInjector;->injectSubComponentBuilderProvider(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;LY94;)V

    return-object p1
.end method


# virtual methods
.method public inject(Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel$Factory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->injectFactory(Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel$Factory;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel$Factory;

    return-void
.end method

.method public inject(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->injectFactory3(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;)Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;

    return-void
.end method

.method public inject(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$Factory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;->injectFactory2(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$Factory;)Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$Factory;

    return-void
.end method
