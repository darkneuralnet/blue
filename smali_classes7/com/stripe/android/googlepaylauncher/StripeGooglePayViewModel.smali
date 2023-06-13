.class public final Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;
.super Lie;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001:\u0001:BC\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u00088\u00109J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0008J\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r0\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00f8\u0001\u0000R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0012R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R$\u0010%\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u001a\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00040.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R(\u00102\u001a\u0010\u0012\u000c\u0012\n 1*\u0004\u0018\u00010\u00040\u00040\u000c8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006;"
    }
    d2 = {
        "Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;",
        "Lie;",
        "Lcom/google/android/gms/wallet/IsReadyToPayRequest;",
        "createIsReadyToPayRequest",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;",
        "result",
        "",
        "updateGooglePayResult",
        "Lorg/json/JSONObject;",
        "createPaymentDataRequestForPaymentIntentArgs",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "params",
        "Landroidx/lifecycle/LiveData;",
        "Lkotlin/Result;",
        "Lcom/stripe/android/model/PaymentMethod;",
        "createPaymentMethod",
        "",
        "publishableKey",
        "Ljava/lang/String;",
        "stripeAccountId",
        "Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;",
        "args",
        "Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;",
        "Lcom/stripe/android/networking/StripeRepository;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "appName",
        "Lkotlin/coroutines/CoroutineContext;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "",
        "hasLaunched",
        "Z",
        "getHasLaunched",
        "()Z",
        "setHasLaunched",
        "(Z)V",
        "paymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "getPaymentMethod",
        "()Lcom/stripe/android/model/PaymentMethod;",
        "setPaymentMethod",
        "(Lcom/stripe/android/model/PaymentMethod;)V",
        "Lcom/stripe/android/GooglePayJsonFactory;",
        "googlePayJsonFactory",
        "Lcom/stripe/android/GooglePayJsonFactory;",
        "LuX2;",
        "_googleResult",
        "LuX2;",
        "kotlin.jvm.PlatformType",
        "googlePayResult",
        "Landroidx/lifecycle/LiveData;",
        "getGooglePayResult$payments_core_release",
        "()Landroidx/lifecycle/LiveData;",
        "Landroid/app/Application;",
        "application",
        "<init>",
        "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V",
        "Factory",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStripeGooglePayViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeGooglePayViewModel.kt\ncom/stripe/android/googlepaylauncher/StripeGooglePayViewModel\n+ 2 Transformations.kt\nandroidx/lifecycle/TransformationsKt\n*L\n1#1,113:1\n92#2:114\n*S KotlinDebug\n*F\n+ 1 StripeGooglePayViewModel.kt\ncom/stripe/android/googlepaylauncher/StripeGooglePayViewModel\n*L\n37#1:114\n*E\n"
    }
.end annotation


# instance fields
.field private final _googleResult:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;",
            ">;"
        }
    .end annotation
.end field

.field private final appName:Ljava/lang/String;

.field private final args:Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;

.field private final googlePayJsonFactory:Lcom/stripe/android/GooglePayJsonFactory;

.field private final googlePayResult:Landroidx/lifecycle/LiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/LiveData<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;",
            ">;"
        }
    .end annotation
.end field

.field private hasLaunched:Z

.field private paymentMethod:Lcom/stripe/android/model/PaymentMethod;

.field private final publishableKey:Ljava/lang/String;

.field private final stripeAccountId:Ljava/lang/String;

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public constructor <init>(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeRepository"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appName"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lie;-><init>(Landroid/app/Application;)V

    iput-object p2, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->publishableKey:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->stripeAccountId:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->args:Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;

    iput-object p5, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    iput-object p6, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->appName:Ljava/lang/String;

    iput-object p7, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance p2, Lcom/stripe/android/GooglePayJsonFactory;

    const/4 p3, 0x2

    const/4 p4, 0x0

    const/4 p5, 0x0

    invoke-direct {p2, p1, p5, p3, p4}, Lcom/stripe/android/GooglePayJsonFactory;-><init>(Landroid/content/Context;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->googlePayJsonFactory:Lcom/stripe/android/GooglePayJsonFactory;

    new-instance p1, LuX2;

    invoke-direct {p1}, LuX2;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->_googleResult:LuX2;

    invoke-static {p1}, Lu96;->a(Landroidx/lifecycle/LiveData;)Landroidx/lifecycle/LiveData;

    move-result-object p1

    const-string p2, "distinctUntilChanged(this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->googlePayResult:Landroidx/lifecycle/LiveData;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, p3

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;-><init>(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V

    return-void
.end method

.method public static final synthetic access$getPublishableKey$p(Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->publishableKey:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getStripeAccountId$p(Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->stripeAccountId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getStripeRepository$p(Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;)Lcom/stripe/android/networking/StripeRepository;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    return-object p0
.end method

.method public static final synthetic access$getWorkContext$p(Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;)Lkotlin/coroutines/CoroutineContext;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-object p0
.end method


# virtual methods
.method public final createIsReadyToPayRequest()Lcom/google/android/gms/wallet/IsReadyToPayRequest;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->googlePayJsonFactory:Lcom/stripe/android/GooglePayJsonFactory;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/GooglePayJsonFactory;->createIsReadyToPayRequest$default(Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/wallet/IsReadyToPayRequest;->s(Ljava/lang/String;)Lcom/google/android/gms/wallet/IsReadyToPayRequest;

    move-result-object v0

    const-string v1, "fromJson(\n            go\u2026st().toString()\n        )"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final createPaymentDataRequestForPaymentIntentArgs()Lorg/json/JSONObject;
    .locals 12

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->googlePayJsonFactory:Lcom/stripe/android/GooglePayJsonFactory;

    new-instance v11, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->args:Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;->getConfig()Lcom/stripe/android/googlepaylauncher/GooglePayConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayConfig;->getCurrencyCode$payments_core_release()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;->Final:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->args:Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;->getConfig()Lcom/stripe/android/googlepaylauncher/GooglePayConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayConfig;->getCountryCode$payments_core_release()Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->args:Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;->getConfig()Lcom/stripe/android/googlepaylauncher/GooglePayConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayConfig;->getTransactionId$payments_core_release()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->args:Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;->getConfig()Lcom/stripe/android/googlepaylauncher/GooglePayConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayConfig;->getAmount$payments_core_release()Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x0

    sget-object v8, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;->CompleteImmediatePurchase:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;

    const/16 v9, 0x20

    const/4 v10, 0x0

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;-><init>(Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/stripe/android/GooglePayJsonFactory$MerchantInfo;

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->args:Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;->getConfig()Lcom/stripe/android/googlepaylauncher/GooglePayConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayConfig;->getMerchantName$payments_core_release()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->appName:Ljava/lang/String;

    :cond_0
    invoke-direct {v5, v1}, Lcom/stripe/android/GooglePayJsonFactory$MerchantInfo;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;

    sget-object v1, Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;->Min:Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v2, v4, v1, v3}, Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;-><init>(ZLcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;Z)V

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->args:Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;->getConfig()Lcom/stripe/android/googlepaylauncher/GooglePayConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayConfig;->isEmailRequired$payments_core_release()Z

    move-result v4

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x24

    const/4 v8, 0x0

    move-object v1, v11

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/GooglePayJsonFactory;->createPaymentDataRequest$default(Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;Lcom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters;ZLcom/stripe/android/GooglePayJsonFactory$MerchantInfo;Ljava/lang/Boolean;ILjava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final createPaymentMethod(Lcom/stripe/android/model/PaymentMethodCreateParams;)Landroidx/lifecycle/LiveData;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            ")",
            "Landroidx/lifecycle/LiveData<",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    new-instance v4, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1;-><init>(Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LWC0;->b(Lkotlin/coroutines/CoroutineContext;JLkotlin/jvm/functions/Function2;ILjava/lang/Object;)Landroidx/lifecycle/LiveData;

    move-result-object p1

    return-object p1
.end method

.method public final getGooglePayResult$payments_core_release()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->googlePayResult:Landroidx/lifecycle/LiveData;

    return-object v0
.end method

.method public final getHasLaunched()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->hasLaunched:Z

    return v0
.end method

.method public final getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    return-object v0
.end method

.method public final setHasLaunched(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->hasLaunched:Z

    return-void
.end method

.method public final setPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    return-void
.end method

.method public final updateGooglePayResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->_googleResult:LuX2;

    invoke-virtual {v0, p1}, LuX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method
