.class public final Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002Jv\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00132\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00162\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0019\u001a\u00020\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry$Companion;",
        "",
        "()V",
        "createInstance",
        "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;",
        "context",
        "Landroid/content/Context;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "enableLogging",
        "",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "uiContext",
        "threeDs1IntentReturnUrlMap",
        "",
        "",
        "publishableKeyProvider",
        "Lkotlin/Function0;",
        "productUsage",
        "",
        "isInstantApp",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final createInstance(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;ZLkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Z)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Z",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z)",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiContext"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threeDs1IntentReturnUrlMap"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsage"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->INSTANCE:Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;

    const-class v1, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->nextKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent;->builder()Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;

    move-result-object v2

    invoke-interface {v2, p1}, Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;->context(Landroid/content/Context;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;->stripeRepository(Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p3}, Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;->analyticsRequestExecutor(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p4}, Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;->analyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p5}, Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;->enableLogging(Z)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p6}, Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;->workContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p7}, Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;->uiContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p8}, Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;->threeDs1IntentReturnUrlMap(Ljava/util/Map;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;

    move-result-object p1

    invoke-interface {p1, v1}, Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;->injectorKey(Ljava/lang/String;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p9}, Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;->publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p10}, Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;->productUsage(Ljava/util/Set;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p11}, Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;->isInstantApp(Z)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;->build()Lcom/stripe/android/payments/core/injection/AuthenticationComponent;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/payments/core/injection/AuthenticationComponent;->getRegistry()Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->setAuthenticationComponent(Lcom/stripe/android/payments/core/injection/AuthenticationComponent;)V

    invoke-virtual {v0, p2, v1}, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->register(Lcom/stripe/android/core/injection/Injector;Ljava/lang/String;)V

    return-object p2

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
