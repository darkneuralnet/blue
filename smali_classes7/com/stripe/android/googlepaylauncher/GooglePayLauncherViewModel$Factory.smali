.class public final Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/u$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J/\u0010\u0008\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0003*\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;",
        "Landroidx/lifecycle/u$b;",
        "LOr6;",
        "T",
        "Ljava/lang/Class;",
        "modelClass",
        "LFE0;",
        "extras",
        "create",
        "(Ljava/lang/Class;LFE0;)LOr6;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;",
        "args",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;",
        "",
        "enableLogging",
        "Z",
        "Lkotlin/coroutines/CoroutineContext;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "<init>",
        "(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;ZLkotlin/coroutines/CoroutineContext;)V",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

.field private final enableLogging:Z

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public constructor <init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;ZLkotlin/coroutines/CoroutineContext;)V
    .locals 1

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    iput-boolean p2, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->enableLogging:Z

    iput-object p3, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;ZLkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    invoke-static {}, LT41;->b()LSC0;

    move-result-object p3

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;ZLkotlin/coroutines/CoroutineContext;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic create(Ljava/lang/Class;)LOr6;
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/u$b;->create(Ljava/lang/Class;)LOr6;

    move-result-object p1

    return-object p1
.end method

.method public create(Ljava/lang/Class;LFE0;)LOr6;
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LOr6;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "LFE0;",
            ")TT;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "modelClass"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "extras"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p2 .. p2}, Lcom/stripe/android/utils/CreationExtrasKtxKt;->requireApplication(LFE0;)Landroid/app/Application;

    move-result-object v1

    move-object v4, v1

    iget-object v3, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    invoke-virtual {v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getEnvironment()Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    move-result-object v15

    sget-object v3, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    iget-boolean v5, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->enableLogging:Z

    invoke-virtual {v3, v5}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object v21

    move-object/from16 v7, v21

    sget-object v3, Lcom/stripe/android/PaymentConfiguration;->Companion:Lcom/stripe/android/PaymentConfiguration$Companion;

    invoke-virtual {v3, v1}, Lcom/stripe/android/PaymentConfiguration$Companion;->getInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v3}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v12

    const-string v3, "GooglePayLauncher"

    invoke-static {v3}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    move-object v9, v3

    new-instance v5, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-object v14, v5

    invoke-direct {v5, v1, v13, v3}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)V

    new-instance v26, Lcom/stripe/android/networking/StripeApiRepository;

    move-object/from16 v3, v26

    new-instance v6, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory$create$stripeRepository$1;

    move-object v5, v6

    invoke-direct {v6, v13}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory$create$stripeRepository$1;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x0

    iget-object v8, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->workContext:Lkotlin/coroutines/CoroutineContext;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    move-object/from16 p1, v12

    move-object/from16 v12, v16

    move-object/from16 v22, v13

    move-object/from16 v13, v16

    move-object/from16 v31, v15

    move-object/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x7bc4

    const/16 v20, 0x0

    invoke-direct/range {v3 .. v20}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v29, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;

    iget-object v3, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    invoke-virtual {v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getEnvironment()Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    move-result-object v5

    iget-object v3, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    invoke-virtual {v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getBillingAddressConfig()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;

    move-result-object v3

    invoke-static {v3}, Lcom/stripe/android/googlepaylauncher/ConvertKt;->convert(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;)Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;

    move-result-object v6

    iget-object v3, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    invoke-virtual {v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getExistingPaymentMethodRequired()Z

    move-result v7

    iget-object v3, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    invoke-virtual {v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getAllowCreditCards()Z

    move-result v8

    move-object/from16 v3, v29

    move-object/from16 v9, v21

    invoke-direct/range {v3 .. v9}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;-><init>(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZZLcom/stripe/android/core/Logger;)V

    new-instance v15, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    new-instance v3, Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;

    invoke-direct {v3, v1}, Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;-><init>(Landroid/content/Context;)V

    move-object/from16 v4, v31

    invoke-virtual {v3, v4}, Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;->create(Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;)LEP3;

    move-result-object v23

    new-instance v24, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object/from16 v8, v24

    move-object/from16 v9, v22

    move-object/from16 v10, p1

    invoke-direct/range {v8 .. v13}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v14, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    new-instance v27, Lcom/stripe/android/StripePaymentController;

    new-instance v5, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory$create$1;

    move-object/from16 v13, v22

    invoke-direct {v5, v13}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory$create$1;-><init>(Ljava/lang/String;)V

    iget-boolean v7, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->enableLogging:Z

    iget-object v8, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->workContext:Lkotlin/coroutines/CoroutineContext;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x1e0

    move-object/from16 v3, v27

    move-object v4, v1

    move-object/from16 v6, v26

    move-object v1, v13

    move/from16 v13, v16

    move-object/from16 v16, v14

    move-object/from16 v14, v17

    invoke-direct/range {v3 .. v14}, Lcom/stripe/android/StripePaymentController;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;ZLkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/AlipayRepository;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/stripe/android/GooglePayJsonFactory;

    new-instance v4, Lcom/stripe/android/GooglePayConfig;

    move-object/from16 v5, p1

    invoke-direct {v4, v1, v5}, Lcom/stripe/android/GooglePayConfig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->isJcbEnabled$payments_core_release()Z

    move-result v1

    invoke-direct {v3, v4, v1}, Lcom/stripe/android/GooglePayJsonFactory;-><init>(Lcom/stripe/android/GooglePayConfig;Z)V

    invoke-static/range {p2 .. p2}, Landroidx/lifecycle/q;->a(LFE0;)Landroidx/lifecycle/p;

    move-result-object v30

    move-object/from16 v22, v15

    move-object/from16 v25, v16

    move-object/from16 v28, v3

    invoke-direct/range {v22 .. v30}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;-><init>(LEP3;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/googlepaylauncher/GooglePayRepository;Landroidx/lifecycle/p;)V

    return-object v15
.end method
