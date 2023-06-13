.class public final Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/googlepaylauncher/GooglePayRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u001d\u0010\u001eB!\u0008\u0011\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u001d\u0010!J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\""
    }
    d2 = {
        "Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
        "LEu1;",
        "",
        "isReady",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
        "environment",
        "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
        "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;",
        "billingAddressParameters",
        "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;",
        "existingPaymentMethodRequired",
        "Z",
        "allowCreditCards",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "Lcom/stripe/android/GooglePayJsonFactory;",
        "googlePayJsonFactory",
        "Lcom/stripe/android/GooglePayJsonFactory;",
        "LEP3;",
        "paymentsClient$delegate",
        "Lkotlin/Lazy;",
        "getPaymentsClient",
        "()LEP3;",
        "paymentsClient",
        "<init>",
        "(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZZLcom/stripe/android/core/Logger;)V",
        "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;",
        "googlePayConfig",
        "(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/core/Logger;)V",
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
.field private final allowCreditCards:Z

.field private final billingAddressParameters:Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;

.field private final context:Landroid/content/Context;

.field private final environment:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

.field private final existingPaymentMethodRequired:Z

.field private final googlePayJsonFactory:Lcom/stripe/android/GooglePayJsonFactory;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final paymentsClient$delegate:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZZLcom/stripe/android/core/Logger;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "environment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingAddressParameters"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->environment:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    iput-object p3, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->billingAddressParameters:Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;

    iput-boolean p4, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->existingPaymentMethodRequired:Z

    iput-boolean p5, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->allowCreditCards:Z

    iput-object p6, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->logger:Lcom/stripe/android/core/Logger;

    new-instance p2, Lcom/stripe/android/GooglePayJsonFactory;

    const/4 p3, 0x2

    const/4 p4, 0x0

    const/4 p5, 0x0

    invoke-direct {p2, p1, p5, p3, p4}, Lcom/stripe/android/GooglePayJsonFactory;-><init>(Landroid/content/Context;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->googlePayJsonFactory:Lcom/stripe/android/GooglePayJsonFactory;

    new-instance p1, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository$paymentsClient$2;

    invoke-direct {p1, p0}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository$paymentsClient$2;-><init>(Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->paymentsClient$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZZLcom/stripe/android/core/Logger;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    sget-object p6, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    invoke-virtual {p6}, Lcom/stripe/android/core/Logger$Companion;->noop()Lcom/stripe/android/core/Logger;

    move-result-object p6

    :cond_0
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;-><init>(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZZLcom/stripe/android/core/Logger;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/core/Logger;)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googlePayConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string p1, "context.applicationContext"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;->getEnvironment()Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    move-result-object v3

    invoke-virtual {p2}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;->getBillingAddressConfig()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/googlepaylauncher/ConvertKt;->convert(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;)Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;

    move-result-object v4

    invoke-virtual {p2}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;->getExistingPaymentMethodRequired()Z

    move-result v5

    invoke-virtual {p2}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;->getAllowCreditCards()Z

    move-result v6

    move-object v1, p0

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;-><init>(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZZLcom/stripe/android/core/Logger;)V

    return-void
.end method

.method public static synthetic a(Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;LGX2;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->isReady$lambda$2(Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;LGX2;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static final synthetic access$getContext$p(Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->context:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$getEnvironment$p(Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;)Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->environment:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    return-object p0
.end method

.method private final getPaymentsClient()LEP3;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->paymentsClient$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEP3;

    return-object v0
.end method

.method private static final isReady$lambda$2(Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;LGX2;Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$isReadyState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "task"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    const-class v0, Lcom/google/android/gms/common/api/ApiException;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/Task;->getResult(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :goto_0
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->logger:Lcom/stripe/android/core/Logger;

    const-string v2, "Google Pay check failed."

    invoke-interface {v1, v2, v0}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object p2, v0

    :cond_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iget-object p0, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->logger:Lcom/stripe/android/core/Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Google Pay ready? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lcom/stripe/android/core/Logger;->info(Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {p1, p0}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public isReady()LEu1;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->googlePayJsonFactory:Lcom/stripe/android/GooglePayJsonFactory;

    iget-object v2, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->billingAddressParameters:Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;

    iget-boolean v3, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->existingPaymentMethodRequired:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget-boolean v4, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->allowCreditCards:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/stripe/android/GooglePayJsonFactory;->createIsReadyToPayRequest(Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/wallet/IsReadyToPayRequest;->s(Ljava/lang/String;)Lcom/google/android/gms/wallet/IsReadyToPayRequest;

    move-result-object v1

    const-string v2, "fromJson(\n            go\u2026   ).toString()\n        )"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->getPaymentsClient()LEP3;

    move-result-object v2

    invoke-virtual {v2, v1}, LEP3;->i(Lcom/google/android/gms/wallet/IsReadyToPayRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    new-instance v2, LnX0;

    invoke-direct {v2, p0, v0}, LnX0;-><init>(Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;LGX2;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    invoke-static {v0}, LVu1;->v(LEu1;)LEu1;

    move-result-object v0

    return-object v0
.end method
