.class public final Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;",
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

.field private final eventReporterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;",
            ">;"
        }
    .end annotation
.end field

.field private final formControllerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
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


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
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
            "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel_Factory;->argsProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel_Factory;->navigatorProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel_Factory;->eventReporterProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel_Factory;->formControllerProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;)Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel_Factory;
    .locals 1
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
            "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel_Factory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;LY94;)Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;",
            "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;",
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;LY94;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel_Factory;->argsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel_Factory;->navigatorProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel_Factory;->eventReporterProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel_Factory;->formControllerProvider:LY94;

    invoke-static {v0, v1, v2, v3}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel_Factory;->newInstance(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;LY94;)Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel_Factory;->get()Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;

    move-result-object v0

    return-object v0
.end method
