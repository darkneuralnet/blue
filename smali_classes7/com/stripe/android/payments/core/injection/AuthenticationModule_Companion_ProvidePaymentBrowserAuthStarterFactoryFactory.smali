.class public final Lcom/stripe/android/payments/core/injection/AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/view/AuthActivityStarterHost;",
        "Lcom/stripe/android/PaymentBrowserAuthStarter;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final defaultReturnUrlProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/DefaultReturnUrl;",
            ">;"
        }
    .end annotation
.end field

.field private final registryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/payments/DefaultReturnUrl;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;->registryProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/payments/core/injection/AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;->defaultReturnUrlProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;)Lcom/stripe/android/payments/core/injection/AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/payments/DefaultReturnUrl;",
            ">;)",
            "Lcom/stripe/android/payments/core/injection/AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/payments/core/injection/AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/payments/core/injection/AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static providePaymentBrowserAuthStarterFactory(Ldagger/Lazy;Lcom/stripe/android/payments/DefaultReturnUrl;)Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/Lazy<",
            "Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;",
            ">;",
            "Lcom/stripe/android/payments/DefaultReturnUrl;",
            ")",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/PaymentBrowserAuthStarter;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/payments/core/injection/AuthenticationModule;->Companion:Lcom/stripe/android/payments/core/injection/AuthenticationModule$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/stripe/android/payments/core/injection/AuthenticationModule$Companion;->providePaymentBrowserAuthStarterFactory(Ldagger/Lazy;Lcom/stripe/android/payments/DefaultReturnUrl;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/jvm/functions/Function1;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/payments/core/injection/AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;->get()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public get()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/PaymentBrowserAuthStarter;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/payments/core/injection/AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;->registryProvider:LY94;

    invoke-static {v0}, LV51;->a(LY94;)Ldagger/Lazy;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/payments/core/injection/AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;->defaultReturnUrlProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/payments/DefaultReturnUrl;

    invoke-static {v0, v1}, Lcom/stripe/android/payments/core/injection/AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;->providePaymentBrowserAuthStarterFactory(Ldagger/Lazy;Lcom/stripe/android/payments/DefaultReturnUrl;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method
