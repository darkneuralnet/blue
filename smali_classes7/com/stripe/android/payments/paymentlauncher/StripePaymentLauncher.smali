.class public final Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
.implements Lcom/stripe/android/core/injection/Injector;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0001\u0008\u0001\u0012\u000e\u0008\u0001\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\u0010\u0008\u0001\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f\u0012\u000e\u0008\u0001\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010+\u001a\u00020*\u0012\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u0017\u0012\u0008\u0008\u0001\u0010-\u001a\u00020,\u0012\u0008\u0008\u0001\u0010.\u001a\u00020,\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201\u0012\u000e\u0008\u0001\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u001a\u00a2\u0006\u0004\u00083\u00104J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\u0008\u00030\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000bH\u0016R\u001a\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0011R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$R\u001a\u0010&\u001a\u00020\u000b8\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u0012\u0004\u0008(\u0010)\u00a8\u00065"
    }
    d2 = {
        "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;",
        "Lcom/stripe/android/core/injection/Injector;",
        "Lcom/stripe/android/core/injection/Injectable;",
        "injectable",
        "",
        "inject",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
        "params",
        "confirm",
        "Lcom/stripe/android/model/ConfirmSetupIntentParams;",
        "",
        "clientSecret",
        "handleNextActionForPaymentIntent",
        "handleNextActionForSetupIntent",
        "Lkotlin/Function0;",
        "publishableKeyProvider",
        "Lkotlin/jvm/functions/Function0;",
        "stripeAccountIdProvider",
        "LB5;",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
        "hostActivityLauncher",
        "LB5;",
        "",
        "enableLogging",
        "Z",
        "",
        "productUsage",
        "Ljava/util/Set;",
        "Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;",
        "paymentLauncherComponent",
        "Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;",
        "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;",
        "authenticatorRegistry$delegate",
        "Lkotlin/Lazy;",
        "getAuthenticatorRegistry",
        "()Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;",
        "authenticatorRegistry",
        "injectorKey",
        "Ljava/lang/String;",
        "getInjectorKey$annotations",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "ioContext",
        "uiContext",
        "Lcom/stripe/android/networking/StripeRepository;",
        "stripeRepository",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "paymentAnalyticsRequestFactory",
        "<init>",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LB5;Landroid/content/Context;ZLkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Ljava/util/Set;)V",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final authenticatorRegistry$delegate:Lkotlin/Lazy;

.field private final enableLogging:Z

.field private final hostActivityLauncher:LB5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB5<",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final injectorKey:Ljava/lang/String;

.field private final paymentLauncherComponent:Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;

.field private final productUsage:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final publishableKeyProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LB5;Landroid/content/Context;ZLkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Ljava/util/Set;)V
    .locals 1
    .param p6    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .param p7    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/UIContext;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "LB5<",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
            ">;",
            "Landroid/content/Context;",
            "Z",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "publishableKeyProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeAccountIdProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hostActivityLauncher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioContext"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiContext"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeRepository"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsage"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->hostActivityLauncher:LB5;

    iput-boolean p5, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->enableLogging:Z

    iput-object p10, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->productUsage:Ljava/util/Set;

    invoke-static {}, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent;->builder()Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;

    move-result-object p3

    invoke-interface {p3, p4}, Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;->context(Landroid/content/Context;)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;

    move-result-object p3

    invoke-interface {p3, p5}, Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;->enableLogging(Z)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;

    move-result-object p3

    invoke-interface {p3, p6}, Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;->ioContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;

    move-result-object p3

    invoke-interface {p3, p7}, Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;->uiContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;

    move-result-object p3

    invoke-interface {p3, p8}, Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;->stripeRepository(Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;

    move-result-object p3

    invoke-interface {p3, p9}, Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;->analyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;

    move-result-object p3

    invoke-interface {p3, p1}, Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;->publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;->stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p10}, Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;->productUsage(Ljava/util/Set;)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;->build()Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->paymentLauncherComponent:Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;

    new-instance p1, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher$authenticatorRegistry$2;

    invoke-direct {p1, p0}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher$authenticatorRegistry$2;-><init>(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->authenticatorRegistry$delegate:Lkotlin/Lazy;

    sget-object p1, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->INSTANCE:Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;

    const-class p2, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    invoke-static {p2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p2

    invoke-interface {p2}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->nextKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->injectorKey:Ljava/lang/String;

    invoke-virtual {p1, p0, p2}, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->register(Lcom/stripe/android/core/injection/Injector;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic access$getPaymentLauncherComponent$p(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->paymentLauncherComponent:Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;

    return-object p0
.end method

.method private static synthetic getInjectorKey$annotations()V
    .locals 0
    .annotation runtime Lcom/stripe/android/core/injection/InjectorKey;
    .end annotation

    return-void
.end method


# virtual methods
.method public confirm(Lcom/stripe/android/model/ConfirmPaymentIntentParams;)V
    .locals 12

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->hostActivityLauncher:LB5;

    new-instance v11, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;

    iget-object v2, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->injectorKey:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    iget-boolean v5, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->enableLogging:Z

    iget-object v6, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->productUsage:Ljava/util/Set;

    const/4 v8, 0x0

    const/16 v9, 0x40

    const/4 v10, 0x0

    move-object v1, v11

    move-object v7, p1

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;Lcom/stripe/android/model/ConfirmStripeIntentParams;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v11}, LB5;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public confirm(Lcom/stripe/android/model/ConfirmSetupIntentParams;)V
    .locals 12

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->hostActivityLauncher:LB5;

    new-instance v11, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;

    iget-object v2, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->injectorKey:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    iget-boolean v5, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->enableLogging:Z

    iget-object v6, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->productUsage:Ljava/util/Set;

    const/4 v8, 0x0

    const/16 v9, 0x40

    const/4 v10, 0x0

    move-object v1, v11

    move-object v7, p1

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;Lcom/stripe/android/model/ConfirmStripeIntentParams;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v11}, LB5;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final getAuthenticatorRegistry()Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->authenticatorRegistry$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;

    return-object v0
.end method

.method public handleNextActionForPaymentIntent(Ljava/lang/String;)V
    .locals 12

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->hostActivityLauncher:LB5;

    new-instance v11, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$PaymentIntentNextActionArgs;

    iget-object v2, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->injectorKey:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    iget-boolean v5, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->enableLogging:Z

    iget-object v6, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->productUsage:Ljava/util/Set;

    const/4 v8, 0x0

    const/16 v9, 0x40

    const/4 v10, 0x0

    move-object v1, v11

    move-object v7, p1

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$PaymentIntentNextActionArgs;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v11}, LB5;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public handleNextActionForSetupIntent(Ljava/lang/String;)V
    .locals 12

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->hostActivityLauncher:LB5;

    new-instance v11, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$SetupIntentNextActionArgs;

    iget-object v2, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->injectorKey:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    iget-boolean v5, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->enableLogging:Z

    iget-object v6, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->productUsage:Ljava/util/Set;

    const/4 v8, 0x0

    const/16 v9, 0x40

    const/4 v10, 0x0

    move-object v1, v11

    move-object v7, p1

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$SetupIntentNextActionArgs;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v11}, LB5;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public inject(Lcom/stripe/android/core/injection/Injectable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/injection/Injectable<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "injectable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Factory;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->paymentLauncherComponent:Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Factory;

    invoke-interface {v0, p1}, Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;->inject(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Factory;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid Injectable "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " requested in "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
