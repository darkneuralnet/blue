.class public final Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideEventReporterFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;",
        ">;"
    }
.end annotation


# instance fields
.field private final defaultAddressLauncherEventReporterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/analytics/DefaultAddressLauncherEventReporter;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/analytics/DefaultAddressLauncherEventReporter;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideEventReporterFactory;->module:Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideEventReporterFactory;->defaultAddressLauncherEventReporterProvider:LY94;

    return-void
.end method

.method public static create(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;LY94;)Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideEventReporterFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/analytics/DefaultAddressLauncherEventReporter;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideEventReporterFactory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideEventReporterFactory;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideEventReporterFactory;-><init>(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;LY94;)V

    return-object v0
.end method

.method public static provideEventReporter(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;Lcom/stripe/android/paymentsheet/addresselement/analytics/DefaultAddressLauncherEventReporter;)Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;->provideEventReporter(Lcom/stripe/android/paymentsheet/addresselement/analytics/DefaultAddressLauncherEventReporter;)Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideEventReporterFactory;->module:Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideEventReporterFactory;->defaultAddressLauncherEventReporterProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/addresselement/analytics/DefaultAddressLauncherEventReporter;

    invoke-static {v0, v1}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideEventReporterFactory;->provideEventReporter(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;Lcom/stripe/android/paymentsheet/addresselement/analytics/DefaultAddressLauncherEventReporter;)Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvideEventReporterFactory;->get()Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;

    move-result-object v0

    return-object v0
.end method
