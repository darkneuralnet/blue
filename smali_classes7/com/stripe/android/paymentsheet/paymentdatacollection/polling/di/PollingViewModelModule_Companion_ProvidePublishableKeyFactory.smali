.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidePublishableKeyFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final appContextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidePublishableKeyFactory;->appContextProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidePublishableKeyFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidePublishableKeyFactory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidePublishableKeyFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidePublishableKeyFactory;-><init>(LY94;)V

    return-object v0
.end method

.method public static providePublishableKey(Landroid/content/Context;)Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule;->Companion:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule$Companion;->providePublishableKey(Landroid/content/Context;)Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/jvm/functions/Function0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidePublishableKeyFactory;->get()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    return-object v0
.end method

.method public get()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidePublishableKeyFactory;->appContextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidePublishableKeyFactory;->providePublishableKey(Landroid/content/Context;)Lkotlin/jvm/functions/Function0;

    move-result-object v0

    return-object v0
.end method
