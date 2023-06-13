.class public final Lcom/stripe/android/DefaultIntentConfirmationInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/IntentConfirmationInterceptor;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B9\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0008\u0001\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0010\u0008\u0001\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0007\u00a2\u0006\u0002\u0010\nJ\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00082\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J,\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00082\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J*\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0082@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008 \u0010!J+\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0082@\u00f8\u0001\u0002\u00a2\u0006\u0002\u0010&J3\u0010\'\u001a\u00020#2\u0006\u0010$\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0082@\u00f8\u0001\u0002\u00a2\u0006\u0002\u0010+J7\u0010,\u001a\u00020#2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096@\u00f8\u0001\u0002\u00a2\u0006\u0002\u0010-J7\u0010,\u001a\u00020#2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096@\u00f8\u0001\u0002\u00a2\u0006\u0002\u0010.J*\u0010/\u001a\u0008\u0012\u0004\u0012\u0002000\u001e2\u0006\u0010\u0014\u001a\u00020\u0008H\u0082@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u00081\u00102R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u00063"
    }
    d2 = {
        "Lcom/stripe/android/DefaultIntentConfirmationInterceptor;",
        "Lcom/stripe/android/IntentConfirmationInterceptor;",
        "context",
        "Landroid/content/Context;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "publishableKeyProvider",
        "Lkotlin/Function0;",
        "",
        "stripeAccountIdProvider",
        "(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V",
        "genericErrorMessage",
        "getGenericErrorMessage",
        "()Ljava/lang/String;",
        "requestOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "getRequestOptions",
        "()Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "createConfirmStep",
        "Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;",
        "clientSecret",
        "shippingValues",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
        "paymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "paymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "setupForFutureUsage",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;",
        "createPaymentMethod",
        "Lkotlin/Result;",
        "params",
        "createPaymentMethod-gIAlu-s",
        "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handleClientSideConfirmation",
        "Lcom/stripe/android/IntentConfirmationInterceptor$NextStep;",
        "createIntentCallback",
        "Lcom/stripe/android/CreateIntentCallback;",
        "(Lcom/stripe/android/CreateIntentCallback;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handleServerSideConfirmation",
        "Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;",
        "shouldSavePaymentMethod",
        "",
        "(Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;Lcom/stripe/android/model/PaymentMethod;ZLcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "intercept",
        "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrieveStripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "retrieveStripeIntent-gIAlu-s",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final context:Landroid/content/Context;

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

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeAccountIdProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    iput-object p3, p0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public static final synthetic access$createPaymentMethod-gIAlu-s(Lcom/stripe/android/DefaultIntentConfirmationInterceptor;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->createPaymentMethod-gIAlu-s(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleClientSideConfirmation(Lcom/stripe/android/DefaultIntentConfirmationInterceptor;Lcom/stripe/android/CreateIntentCallback;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->handleClientSideConfirmation(Lcom/stripe/android/CreateIntentCallback;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleServerSideConfirmation(Lcom/stripe/android/DefaultIntentConfirmationInterceptor;Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;Lcom/stripe/android/model/PaymentMethod;ZLcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->handleServerSideConfirmation(Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;Lcom/stripe/android/model/PaymentMethod;ZLcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrieveStripeIntent-gIAlu-s(Lcom/stripe/android/DefaultIntentConfirmationInterceptor;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->retrieveStripeIntent-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final createConfirmStep(Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;
    .locals 1

    sget-object v0, Lcom/stripe/android/ConfirmStripeIntentParamsFactory;->Companion:Lcom/stripe/android/ConfirmStripeIntentParamsFactory$Companion;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/ConfirmStripeIntentParamsFactory$Companion;->createFactory(Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/ConfirmStripeIntentParamsFactory;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/stripe/android/ConfirmStripeIntentParamsFactory;->create(Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/model/ConfirmStripeIntentParams;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;

    invoke-direct {p2, p1}, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;-><init>(Lcom/stripe/android/model/ConfirmStripeIntentParams;)V

    return-object p2
.end method

.method private final createConfirmStep(Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;
    .locals 1

    sget-object v0, Lcom/stripe/android/ConfirmStripeIntentParamsFactory;->Companion:Lcom/stripe/android/ConfirmStripeIntentParamsFactory$Companion;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/ConfirmStripeIntentParamsFactory$Companion;->createFactory(Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/ConfirmStripeIntentParamsFactory;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Lcom/stripe/android/ConfirmStripeIntentParamsFactory;->create(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)Lcom/stripe/android/model/ConfirmStripeIntentParams;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;

    invoke-direct {p2, p1}, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;-><init>(Lcom/stripe/android/model/ConfirmStripeIntentParams;)V

    return-object p2
.end method

.method private final createPaymentMethod-gIAlu-s(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;

    iget v1, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;-><init>(Lcom/stripe/android/DefaultIntentConfirmationInterceptor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object p2, p0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    invoke-direct {p0}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->getRequestOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v2

    iput v3, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;->label:I

    invoke-virtual {p2, p1, v2, v0}, Lcom/stripe/android/networking/StripeRepository;->createPaymentMethod(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lcom/stripe/android/model/PaymentMethod;

    if-eqz p2, :cond_4

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_4
    new-instance p1, Lcom/stripe/android/core/exception/APIException;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "Couldn\'t parse response when creating payment method"

    const/4 v5, 0x0

    const/16 v6, 0x17

    const/4 v7, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/core/exception/APIException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method private final getGenericErrorMessage()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->context:Landroid/content/Context;

    sget v1, Lcom/stripe/android/R$string;->unable_to_complete_operation:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context.getString(R.stri\u2026le_to_complete_operation)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final getRequestOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 7

    new-instance v6, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v0, p0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method private final handleClientSideConfirmation(Lcom/stripe/android/CreateIntentCallback;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/CreateIntentCallback;",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/IntentConfirmationInterceptor$NextStep;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleClientSideConfirmation$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleClientSideConfirmation$1;

    iget v1, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleClientSideConfirmation$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleClientSideConfirmation$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleClientSideConfirmation$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleClientSideConfirmation$1;-><init>(Lcom/stripe/android/DefaultIntentConfirmationInterceptor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleClientSideConfirmation$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleClientSideConfirmation$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleClientSideConfirmation$1;->L$2:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;

    iget-object p1, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleClientSideConfirmation$1;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/stripe/android/model/PaymentMethod;

    iget-object p1, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleClientSideConfirmation$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p4, p2, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object p0, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleClientSideConfirmation$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleClientSideConfirmation$1;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleClientSideConfirmation$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleClientSideConfirmation$1;->label:I

    invoke-interface {p1, p4, v0}, Lcom/stripe/android/CreateIntentCallback;->onCreateIntent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    check-cast p4, Lcom/stripe/android/CreateIntentCallback$Result;

    instance-of v0, p4, Lcom/stripe/android/CreateIntentCallback$Result$Success;

    if-eqz v0, :cond_4

    check-cast p4, Lcom/stripe/android/CreateIntentCallback$Result$Success;

    invoke-virtual {p4}, Lcom/stripe/android/CreateIntentCallback$Result$Success;->getClientSecret()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p1, p4, p3, p2}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->createConfirmStep(Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;

    move-result-object p1

    goto :goto_2

    :cond_4
    instance-of p2, p4, Lcom/stripe/android/CreateIntentCallback$Result$Failure;

    if-eqz p2, :cond_6

    new-instance p2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;

    check-cast p4, Lcom/stripe/android/CreateIntentCallback$Result$Failure;

    invoke-virtual {p4}, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->getCause$payments_core_release()Ljava/lang/Exception;

    move-result-object p3

    invoke-virtual {p4}, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->getDisplayMessage$payments_core_release()Ljava/lang/String;

    move-result-object p4

    if-nez p4, :cond_5

    invoke-direct {p1}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->getGenericErrorMessage()Ljava/lang/String;

    move-result-object p4

    :cond_5
    invoke-direct {p2, p3, p4}, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V

    move-object p1, p2

    :goto_2
    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final handleServerSideConfirmation(Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;Lcom/stripe/android/model/PaymentMethod;ZLcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Z",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/IntentConfirmationInterceptor$NextStep;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;

    iget v1, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;

    invoke-direct {v0, p0, p5}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;-><init>(Lcom/stripe/android/DefaultIntentConfirmationInterceptor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p5, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/CreateIntentCallback$Result;

    iget-object p2, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->L$2:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;

    iget-object p3, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->L$1:Ljava/lang/Object;

    check-cast p3, Lcom/stripe/android/model/PaymentMethod;

    iget-object p4, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->L$0:Ljava/lang/Object;

    check-cast p4, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p5, Lkotlin/Result;

    invoke-virtual {p5}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p5

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->L$2:Ljava/lang/Object;

    move-object p4, p1

    check-cast p4, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;

    iget-object p1, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/stripe/android/model/PaymentMethod;

    iget-object p1, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v5, p4

    move-object p4, p1

    move-object p1, v5

    goto :goto_1

    :cond_3
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p5, p2, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object p0, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->L$1:Ljava/lang/Object;

    iput-object p4, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->L$2:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->label:I

    invoke-interface {p1, p5, p3, v0}, Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;->onCreateIntent(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p4

    move-object p4, p0

    :goto_1
    move-object p3, p5

    check-cast p3, Lcom/stripe/android/CreateIntentCallback$Result;

    instance-of p5, p3, Lcom/stripe/android/CreateIntentCallback$Result$Success;

    if-eqz p5, :cond_9

    move-object p5, p3

    check-cast p5, Lcom/stripe/android/CreateIntentCallback$Result$Success;

    invoke-virtual {p5}, Lcom/stripe/android/CreateIntentCallback$Result$Success;->getClientSecret()Ljava/lang/String;

    move-result-object p5

    iput-object p4, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1;->label:I

    invoke-direct {p4, p5, v0}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->retrieveStripeIntent-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_5

    return-object v1

    :cond_5
    move-object v5, p2

    move-object p2, p1

    move-object p1, p3

    move-object p3, v5

    :goto_2
    invoke-static {p5}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_8

    check-cast p5, Lcom/stripe/android/model/StripeIntent;

    invoke-interface {p5}, Lcom/stripe/android/model/StripeIntent;->isConfirmed()Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance p1, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Complete;

    invoke-direct {p1, p5}, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Complete;-><init>(Lcom/stripe/android/model/StripeIntent;)V

    goto :goto_3

    :cond_6
    invoke-interface {p5}, Lcom/stripe/android/model/StripeIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object p5

    sget-object v0, Lcom/stripe/android/model/StripeIntent$Status;->RequiresAction:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne p5, v0, :cond_7

    new-instance p2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$HandleNextAction;

    check-cast p1, Lcom/stripe/android/CreateIntentCallback$Result$Success;

    invoke-virtual {p1}, Lcom/stripe/android/CreateIntentCallback$Result$Success;->getClientSecret()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$HandleNextAction;-><init>(Ljava/lang/String;)V

    move-object p1, p2

    goto :goto_3

    :cond_7
    check-cast p1, Lcom/stripe/android/CreateIntentCallback$Result$Success;

    invoke-virtual {p1}, Lcom/stripe/android/CreateIntentCallback$Result$Success;->getClientSecret()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p4, p1, p2, p3}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->createConfirmStep(Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;

    move-result-object p1

    goto :goto_3

    :cond_8
    new-instance p1, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;

    invoke-direct {p4}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->getGenericErrorMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, v0, p2}, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_3

    :cond_9
    instance-of p1, p3, Lcom/stripe/android/CreateIntentCallback$Result$Failure;

    if-eqz p1, :cond_b

    new-instance p1, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;

    check-cast p3, Lcom/stripe/android/CreateIntentCallback$Result$Failure;

    invoke-virtual {p3}, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->getCause$payments_core_release()Ljava/lang/Exception;

    move-result-object p2

    invoke-virtual {p3}, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->getDisplayMessage$payments_core_release()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_a

    invoke-direct {p4}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->getGenericErrorMessage()Ljava/lang/String;

    move-result-object p3

    :cond_a
    invoke-direct {p1, p2, p3}, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_3
    return-object p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final retrieveStripeIntent-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;

    iget v1, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;-><init>(Lcom/stripe/android/DefaultIntentConfirmationInterceptor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v5, v0

    iget-object p2, v5, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, v5, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v1, p0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    invoke-direct {p0}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->getRequestOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    iput v2, v5, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;->label:I

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/networking/StripeRepository;->retrieveStripeIntent$payments_core_release$default(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    check-cast p2, Lcom/stripe/android/model/StripeIntent;

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    return-object p1
.end method


# virtual methods
.method public intercept(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/IntentConfirmationInterceptor$NextStep;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-direct {p0, p1, p3, p2}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->createConfirmStep(Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lcom/stripe/android/IntentConfirmationInterceptor;->Companion:Lcom/stripe/android/IntentConfirmationInterceptor$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/IntentConfirmationInterceptor$Companion;->getCreateIntentCallback()Lcom/stripe/android/AbsCreateIntentCallback;

    move-result-object p1

    instance-of v0, p1, Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;->OffSession:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    if-ne p4, v0, :cond_1

    const/4 p4, 0x1

    goto :goto_0

    :cond_1
    const/4 p4, 0x0

    :goto_0
    move v3, p4

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;

    move-object v0, p0

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->handleServerSideConfirmation(Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;Lcom/stripe/android/model/PaymentMethod;ZLcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p4, p1, Lcom/stripe/android/CreateIntentCallback;

    if-eqz p4, :cond_3

    check-cast p1, Lcom/stripe/android/CreateIntentCallback;

    invoke-direct {p0, p1, p2, p3, p5}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->handleClientSideConfirmation(Lcom/stripe/android/CreateIntentCallback;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    const-class p1, Lcom/stripe/android/CreateIntentCallback;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must be implemented when using IntentConfiguration with PaymentSheet"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public intercept(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/IntentConfirmationInterceptor$NextStep;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;

    iget v1, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;

    invoke-direct {v0, p0, p5}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;-><init>(Lcom/stripe/android/DefaultIntentConfirmationInterceptor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v0

    iget-object p5, v6, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, v6, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v6, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;->L$2:Ljava/lang/Object;

    move-object p4, p1

    check-cast p4, Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    iget-object p1, v6, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;->L$1:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;

    iget-object p1, v6, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p5, Lkotlin/Result;

    invoke-virtual {p5}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    move-object v1, p1

    :goto_1
    move-object v4, p3

    move-object v5, p4

    goto :goto_2

    :cond_3
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    if-eqz p1, :cond_4

    invoke-direct {p0, p1, p3, p2, p4}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->createConfirmStep(Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;

    move-result-object p1

    goto :goto_4

    :cond_4
    iput-object p0, v6, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;->L$0:Ljava/lang/Object;

    iput-object p3, v6, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;->L$1:Ljava/lang/Object;

    iput-object p4, v6, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;->L$2:Ljava/lang/Object;

    iput v3, v6, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;->label:I

    invoke-direct {p0, p2, v6}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->createPaymentMethod-gIAlu-s(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_5

    return-object v0

    :cond_5
    move-object v1, p0

    goto :goto_1

    :goto_2
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_7

    move-object v3, p2

    check-cast v3, Lcom/stripe/android/model/PaymentMethod;

    const/4 p1, 0x0

    const/4 p2, 0x0

    iput-object p2, v6, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;->L$0:Ljava/lang/Object;

    iput-object p2, v6, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;->L$1:Ljava/lang/Object;

    iput-object p2, v6, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;->L$2:Ljava/lang/Object;

    iput v2, v6, Lcom/stripe/android/DefaultIntentConfirmationInterceptor$intercept$1;->label:I

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->intercept(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v0, :cond_6

    return-object v0

    :cond_6
    :goto_3
    move-object p1, p5

    check-cast p1, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep;

    goto :goto_4

    :cond_7
    new-instance p2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;

    invoke-direct {v1}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;->getGenericErrorMessage()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V

    move-object p1, p2

    :goto_4
    return-object p1
.end method
