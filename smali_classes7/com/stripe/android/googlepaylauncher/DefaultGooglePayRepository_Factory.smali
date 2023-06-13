.class public final Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;",
        ">;"
    }
.end annotation


# instance fields
.field private final contextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final googlePayConfigProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;",
            ">;"
        }
    .end annotation
.end field

.field private final loggerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository_Factory;->contextProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository_Factory;->googlePayConfigProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository_Factory;->loggerProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;)Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;)",
            "Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository_Factory;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository_Factory;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;
    .locals 1

    new-instance v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;-><init>(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/core/Logger;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository_Factory;->contextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository_Factory;->googlePayConfigProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;

    iget-object v2, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository_Factory;->loggerProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/core/Logger;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository_Factory;->newInstance(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository_Factory;->get()Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;

    move-result-object v0

    return-object v0
.end method
