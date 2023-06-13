.class public final Lcom/stripe/android/link/confirmation/ConfirmationManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001B3\u0008\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u000e\u0008\u0001\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u001a\u0012\u0010\u0008\u0001\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001a\u00a2\u0006\u0004\u0008#\u0010$J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0004J/\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u001c\u0010\u0010\u001a\u0018\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u0004\u0012\u00020\u00040\rj\u0002`\u000f\u00f8\u0001\u0000J7\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u001c\u0010\u0010\u001a\u0018\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u0004\u0012\u00020\u00040\rj\u0002`\u000f\u00f8\u0001\u0000R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R3\u0010!\u001a\u001c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rj\u0004\u0018\u0001`\u000f8\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006%"
    }
    d2 = {
        "Lcom/stripe/android/link/confirmation/ConfirmationManager;",
        "",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
        "paymentResult",
        "",
        "onPaymentResult",
        "(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)Lkotlin/Unit;",
        "Lu5;",
        "activityResultCaller",
        "setupPaymentLauncher",
        "invalidatePaymentLauncher",
        "Lcom/stripe/android/model/ConfirmStripeIntentParams;",
        "confirmStripeIntentParams",
        "Lkotlin/Function1;",
        "Lkotlin/Result;",
        "Lcom/stripe/android/link/confirmation/PaymentConfirmationCallback;",
        "onResult",
        "confirmStripeIntent",
        "",
        "clientSecret",
        "Lcom/stripe/android/model/StripeIntent;",
        "stripeIntent",
        "handleNextAction",
        "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
        "paymentLauncherFactory",
        "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
        "Lkotlin/Function0;",
        "publishableKeyProvider",
        "Lkotlin/jvm/functions/Function0;",
        "stripeAccountIdProvider",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;",
        "paymentLauncher",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;",
        "completionCallback",
        "Lkotlin/jvm/functions/Function1;",
        "<init>",
        "(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V",
        "link_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private completionCallback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private paymentLauncher:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

.field private final paymentLauncherFactory:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;

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
.method public constructor <init>(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "paymentLauncherFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeAccountIdProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager;->paymentLauncherFactory:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;

    iput-object p2, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public static synthetic a(Lcom/stripe/android/link/confirmation/ConfirmationManager;Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/confirmation/ConfirmationManager;->setupPaymentLauncher$onPaymentResult(Lcom/stripe/android/link/confirmation/ConfirmationManager;Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    return-void
.end method

.method private final onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager;->completionCallback:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private static final synthetic setupPaymentLauncher$onPaymentResult(Lcom/stripe/android/link/confirmation/ConfirmationManager;Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/confirmation/ConfirmationManager;->onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)Lkotlin/Unit;

    return-void
.end method


# virtual methods
.method public final confirmStripeIntent(Lcom/stripe/android/model/ConfirmStripeIntentParams;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmStripeIntentParams;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "confirmStripeIntentParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager;->completionCallback:Lkotlin/jvm/functions/Function1;

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager;->paymentLauncher:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "Required value was null."

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_2

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    instance-of p2, p1, Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    if-eqz p2, :cond_1

    check-cast p1, Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    invoke-interface {v0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;->confirm(Lcom/stripe/android/model/ConfirmPaymentIntentParams;)V

    goto :goto_1

    :cond_1
    instance-of p2, p1, Lcom/stripe/android/model/ConfirmSetupIntentParams;

    if-eqz p2, :cond_3

    check-cast p1, Lcom/stripe/android/model/ConfirmSetupIntentParams;

    invoke-interface {v0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;->confirm(Lcom/stripe/android/model/ConfirmSetupIntentParams;)V

    goto :goto_1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_1
    return-void
.end method

.method public final handleNextAction(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeIntent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onResult"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager;->completionCallback:Lkotlin/jvm/functions/Function1;

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager;->paymentLauncher:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "Required value was null."

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_2

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    instance-of p3, p2, Lcom/stripe/android/model/PaymentIntent;

    if-eqz p3, :cond_1

    invoke-interface {v0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;->handleNextActionForPaymentIntent(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    instance-of p2, p2, Lcom/stripe/android/model/SetupIntent;

    if-eqz p2, :cond_3

    invoke-interface {v0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;->handleNextActionForSetupIntent(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_1
    return-void
.end method

.method public final invalidatePaymentLauncher()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager;->paymentLauncher:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    return-void
.end method

.method public final setupPaymentLauncher(Lu5;)V
    .locals 5

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager;->paymentLauncherFactory:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;

    iget-object v1, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    new-instance v3, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;

    invoke-direct {v3}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;-><init>()V

    new-instance v4, LXx0;

    invoke-direct {v4, p0}, LXx0;-><init>(Lcom/stripe/android/link/confirmation/ConfirmationManager;)V

    invoke-interface {p1, v3, v4}, Lu5;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object p1

    const-string v3, "activityResultCaller.reg\u2026ymentResult\n            )"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2, p1}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;->create(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LB5;)Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager;->paymentLauncher:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    return-void
.end method
