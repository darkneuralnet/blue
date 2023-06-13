.class final Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private addressRepository:Lcom/stripe/android/uicore/address/AddressRepository;

.field private analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

.field private analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

.field private configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

.field private context:Landroid/content/Context;

.field private enableLogging:Ljava/lang/Boolean;

.field private ioContext:Lkotlin/coroutines/CoroutineContext;

.field private productUsage:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private publishableKeyProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private stripeRepository:Lcom/stripe/android/networking/StripeRepository;

.field private uiContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LxL0;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public addressRepository(Lcom/stripe/android/uicore/address/AddressRepository;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/address/AddressRepository;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->addressRepository:Lcom/stripe/android/uicore/address/AddressRepository;

    return-object p0
.end method

.method public bridge synthetic addressRepository(Lcom/stripe/android/uicore/address/AddressRepository;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->addressRepository(Lcom/stripe/android/uicore/address/AddressRepository;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public analyticsRequestExecutor(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    return-object p0
.end method

.method public bridge synthetic analyticsRequestExecutor(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->analyticsRequestExecutor(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public analyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    return-object p0
.end method

.method public bridge synthetic analyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->analyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public build()Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    const-class v2, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    invoke-static {v1, v2}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->context:Landroid/content/Context;

    const-class v2, Landroid/content/Context;

    invoke-static {v1, v2}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->ioContext:Lkotlin/coroutines/CoroutineContext;

    const-class v2, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v1, v2}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->uiContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v1, v2}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    const-class v2, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    invoke-static {v1, v2}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    const-class v2, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    invoke-static {v1, v2}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    const-class v2, Lcom/stripe/android/networking/StripeRepository;

    invoke-static {v1, v2}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->addressRepository:Lcom/stripe/android/uicore/address/AddressRepository;

    const-class v2, Lcom/stripe/android/uicore/address/AddressRepository;

    invoke-static {v1, v2}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->enableLogging:Ljava/lang/Boolean;

    const-class v2, Ljava/lang/Boolean;

    invoke-static {v1, v2}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    const-class v2, Lkotlin/jvm/functions/Function0;

    invoke-static {v1, v2}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-static {v1, v2}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->productUsage:Ljava/util/Set;

    const-class v2, Ljava/util/Set;

    invoke-static {v1, v2}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v1, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

    new-instance v4, Lcom/stripe/android/core/injection/CoreCommonModule;

    invoke-direct {v4}, Lcom/stripe/android/core/injection/CoreCommonModule;-><init>()V

    iget-object v5, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iget-object v6, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->context:Landroid/content/Context;

    iget-object v7, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->ioContext:Lkotlin/coroutines/CoroutineContext;

    iget-object v8, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->uiContext:Lkotlin/coroutines/CoroutineContext;

    iget-object v9, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iget-object v10, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iget-object v11, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    iget-object v12, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->addressRepository:Lcom/stripe/android/uicore/address/AddressRepository;

    iget-object v13, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->enableLogging:Ljava/lang/Boolean;

    iget-object v14, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    iget-object v15, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    iget-object v2, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->productUsage:Ljava/util/Set;

    const/16 v17, 0x0

    move-object v3, v1

    move-object/from16 v16, v2

    invoke-direct/range {v3 .. v17}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/Set;LCL0;)V

    return-object v1
.end method

.method public configuration(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    return-object p0
.end method

.method public bridge synthetic configuration(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->configuration(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public context(Landroid/content/Context;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->context:Landroid/content/Context;

    return-object p0
.end method

.method public bridge synthetic context(Landroid/content/Context;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->context(Landroid/content/Context;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public enableLogging(Z)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->enableLogging:Ljava/lang/Boolean;

    return-object p0
.end method

.method public bridge synthetic enableLogging(Z)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->enableLogging(Z)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public ioContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->ioContext:Lkotlin/coroutines/CoroutineContext;

    return-object p0
.end method

.method public bridge synthetic ioContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->ioContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public productUsage(Ljava/util/Set;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;"
        }
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->productUsage:Ljava/util/Set;

    return-object p0
.end method

.method public bridge synthetic productUsage(Ljava/util/Set;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->productUsage(Ljava/util/Set;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;"
        }
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function0;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public bridge synthetic publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;"
        }
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function0;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public bridge synthetic stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public stripeRepository(Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/networking/StripeRepository;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    return-object p0
.end method

.method public bridge synthetic stripeRepository(Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->stripeRepository(Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public uiContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->uiContext:Lkotlin/coroutines/CoroutineContext;

    return-object p0
.end method

.method public bridge synthetic uiContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;->uiContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method
