.class public final Lcom/stripe/android/GooglePayJsonFactory_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/GooglePayJsonFactory;",
        ">;"
    }
.end annotation


# instance fields
.field private final googlePayConfigProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;",
            ">;"
        }
    .end annotation
.end field

.field private final publishableKeyProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final stripeAccountIdProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;"
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
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/GooglePayJsonFactory_Factory;->publishableKeyProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/GooglePayJsonFactory_Factory;->stripeAccountIdProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/GooglePayJsonFactory_Factory;->googlePayConfigProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;)Lcom/stripe/android/GooglePayJsonFactory_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;",
            ">;)",
            "Lcom/stripe/android/GooglePayJsonFactory_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/GooglePayJsonFactory_Factory;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/GooglePayJsonFactory_Factory;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;)Lcom/stripe/android/GooglePayJsonFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;",
            ")",
            "Lcom/stripe/android/GooglePayJsonFactory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/GooglePayJsonFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/GooglePayJsonFactory;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/GooglePayJsonFactory;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/GooglePayJsonFactory_Factory;->publishableKeyProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Lcom/stripe/android/GooglePayJsonFactory_Factory;->stripeAccountIdProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/stripe/android/GooglePayJsonFactory_Factory;->googlePayConfigProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/GooglePayJsonFactory_Factory;->newInstance(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;)Lcom/stripe/android/GooglePayJsonFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/GooglePayJsonFactory_Factory;->get()Lcom/stripe/android/GooglePayJsonFactory;

    move-result-object v0

    return-object v0
.end method
