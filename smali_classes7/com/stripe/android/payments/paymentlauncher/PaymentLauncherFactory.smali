.class public final Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB\u0019\u0008\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014B\u0019\u0008\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0017J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;",
        "",
        "",
        "publishableKey",
        "stripeAccountId",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;",
        "create",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "LB5;",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
        "hostActivityLauncher",
        "LB5;",
        "<init>",
        "(Landroid/content/Context;LB5;)V",
        "Landroidx/activity/ComponentActivity;",
        "activity",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;",
        "callback",
        "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)V",
        "Landroidx/fragment/app/Fragment;",
        "fragment",
        "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)V",
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
.field private final context:Landroid/content/Context;

.field private final hostActivityLauncher:LB5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB5<",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LB5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "LB5<",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hostActivityLauncher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;->hostActivityLauncher:LB5;

    return-void
.end method

.method public constructor <init>(Landroidx/activity/ComponentActivity;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)V
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "activity.applicationContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;

    invoke-direct {v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;-><init>()V

    new-instance v2, LyM3;

    invoke-direct {v2, p2}, LyM3;-><init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)V

    invoke-virtual {p1, v1, v2}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object p1

    const-string p2, "activity.registerForActi\u2026onPaymentResult\n        )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;-><init>(Landroid/content/Context;LB5;)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)V
    .locals 3

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "fragment.requireActivity().applicationContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;

    invoke-direct {v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;-><init>()V

    new-instance v2, LyM3;

    invoke-direct {v2, p2}, LyM3;-><init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)V

    invoke-virtual {p1, v1, v2}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object p1

    const-string p2, "fragment.registerForActi\u2026onPaymentResult\n        )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;-><init>(Landroid/content/Context;LB5;)V

    return-void
.end method

.method public static synthetic create$default(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;->create(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "publishableKey"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "PaymentLauncher"

    invoke-static {v2}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v13

    new-instance v12, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-object/from16 v25, v12

    iget-object v2, v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;->context:Landroid/content/Context;

    new-instance v3, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory$create$analyticsRequestFactory$1;

    invoke-direct {v3, v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory$create$analyticsRequestFactory$1;-><init>(Ljava/lang/String;)V

    invoke-direct {v12, v2, v3, v13}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V

    new-instance v2, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;

    new-instance v4, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory$create$1;

    invoke-direct {v4, v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory$create$1;-><init>(Ljava/lang/String;)V

    new-instance v5, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory$create$2;

    move-object/from16 v3, p2

    invoke-direct {v5, v3}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory$create$2;-><init>(Ljava/lang/String;)V

    iget-object v6, v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;->hostActivityLauncher:LB5;

    iget-object v7, v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;->context:Landroid/content/Context;

    const/4 v8, 0x0

    invoke-static {}, LT41;->b()LSC0;

    move-result-object v9

    invoke-static {}, LT41;->c()LpG2;

    move-result-object v10

    new-instance v11, Lcom/stripe/android/networking/StripeApiRepository;

    move-object v14, v11

    iget-object v15, v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;->context:Landroid/content/Context;

    new-instance v3, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory$create$3;

    move-object/from16 v16, v3

    invoke-direct {v3, v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory$create$3;-><init>(Ljava/lang/String;)V

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x7bfc

    const/16 v31, 0x0

    invoke-direct/range {v14 .. v31}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v2

    invoke-direct/range {v3 .. v13}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LB5;Landroid/content/Context;ZLkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Ljava/util/Set;)V

    return-object v2
.end method
