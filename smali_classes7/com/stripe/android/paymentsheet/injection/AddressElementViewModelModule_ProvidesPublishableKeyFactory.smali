.class public final Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesPublishableKeyFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ljava/lang/String;",
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

.field private final module:Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesPublishableKeyFactory;->module:Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesPublishableKeyFactory;->argsProvider:LY94;

    return-void
.end method

.method public static create(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;LY94;)Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesPublishableKeyFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesPublishableKeyFactory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesPublishableKeyFactory;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesPublishableKeyFactory;-><init>(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;LY94;)V

    return-object v0
.end method

.method public static providesPublishableKey(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;->providesPublishableKey(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesPublishableKeyFactory;->get()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesPublishableKeyFactory;->module:Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesPublishableKeyFactory;->argsProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    invoke-static {v0, v1}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesPublishableKeyFactory;->providesPublishableKey(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
