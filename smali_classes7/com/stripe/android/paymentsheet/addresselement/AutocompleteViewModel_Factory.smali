.class public final Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final applicationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private final argsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final autocompleteArgsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final eventReporterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;",
            ">;"
        }
    .end annotation
.end field

.field private final navigatorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;",
            ">;"
        }
    .end annotation
.end field

.field private final placesClientProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;",
            ">;",
            "LY94<",
            "Landroid/app/Application;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;->argsProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;->navigatorProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;->placesClientProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;->autocompleteArgsProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;->eventReporterProvider:LY94;

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;->applicationProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;",
            ">;",
            "LY94<",
            "Landroid/app/Application;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;"
        }
    .end annotation

    new-instance v7, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static newInstance(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;Landroid/app/Application;)Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;
    .locals 8

    new-instance v7, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;Landroid/app/Application;)V

    return-object v7
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;->argsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;->navigatorProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;->placesClientProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;->autocompleteArgsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;->eventReporterProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;->applicationProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/app/Application;

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;->newInstance(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;Landroid/app/Application;)Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel_Factory;->get()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    move-result-object v0

    return-object v0
.end method
