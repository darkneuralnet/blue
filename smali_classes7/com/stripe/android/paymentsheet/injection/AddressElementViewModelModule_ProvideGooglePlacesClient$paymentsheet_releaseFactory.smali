.class public final Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;",
        ">;"
    }
.end annotation


# instance fields
.field private final argsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final contextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory;->module:Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory;->contextProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory;->argsProvider:LY94;

    return-void
.end method

.method public static create(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;LY94;LY94;)Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory;-><init>(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;LY94;LY94;)V

    return-object v0
.end method

.method public static provideGooglePlacesClient$paymentsheet_release(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;Landroid/content/Context;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;)Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;->provideGooglePlacesClient$paymentsheet_release(Landroid/content/Context;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;)Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory;->module:Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory;->contextProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory;->argsProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory;->provideGooglePlacesClient$paymentsheet_release(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;Landroid/content/Context;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;)Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory;->get()Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

    move-result-object v0

    return-object v0
.end method
