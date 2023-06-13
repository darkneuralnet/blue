.class public final Lcom/stripe/android/payments/core/injection/PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final module:Lcom/stripe/android/payments/core/injection/PaymentLauncherModule;


# direct methods
.method public constructor <init>(Lcom/stripe/android/payments/core/injection/PaymentLauncherModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory;->module:Lcom/stripe/android/payments/core/injection/PaymentLauncherModule;

    return-void
.end method

.method public static create(Lcom/stripe/android/payments/core/injection/PaymentLauncherModule;)Lcom/stripe/android/payments/core/injection/PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory;
    .locals 1

    new-instance v0, Lcom/stripe/android/payments/core/injection/PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/core/injection/PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory;-><init>(Lcom/stripe/android/payments/core/injection/PaymentLauncherModule;)V

    return-object v0
.end method

.method public static provideThreeDs1IntentReturnUrlMap(Lcom/stripe/android/payments/core/injection/PaymentLauncherModule;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/injection/PaymentLauncherModule;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/stripe/android/payments/core/injection/PaymentLauncherModule;->provideThreeDs1IntentReturnUrlMap()Ljava/util/Map;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/payments/core/injection/PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory;->get()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/payments/core/injection/PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory;->module:Lcom/stripe/android/payments/core/injection/PaymentLauncherModule;

    invoke-static {v0}, Lcom/stripe/android/payments/core/injection/PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory;->provideThreeDs1IntentReturnUrlMap(Lcom/stripe/android/payments/core/injection/PaymentLauncherModule;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
