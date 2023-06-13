.class final Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;->startSourceAuth(Lcom/stripe/android/PaymentBrowserAuthStarter;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LZC0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "LZC0;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.payments.core.authentication.SourceAuthenticator$startSourceAuth$2"
    f = "SourceAuthenticator.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $paymentBrowserAuthStarter:Lcom/stripe/android/PaymentBrowserAuthStarter;

.field final synthetic $requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

.field final synthetic $source:Lcom/stripe/android/model/Source;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;


# direct methods
.method public constructor <init>(Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;Lcom/stripe/android/PaymentBrowserAuthStarter;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;",
            "Lcom/stripe/android/PaymentBrowserAuthStarter;",
            "Lcom/stripe/android/model/Source;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;

    iput-object p2, p0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->$paymentBrowserAuthStarter:Lcom/stripe/android/PaymentBrowserAuthStarter;

    iput-object p3, p0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->$source:Lcom/stripe/android/model/Source;

    iput-object p4, p0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->$requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;

    iget-object v2, p0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->$paymentBrowserAuthStarter:Lcom/stripe/android/PaymentBrowserAuthStarter;

    iget-object v3, p0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->$source:Lcom/stripe/android/model/Source;

    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->$requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;-><init>(Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;Lcom/stripe/android/PaymentBrowserAuthStarter;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v1, v0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->label:I

    if-nez v1, :cond_5

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v1, v0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;->access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-result-object v1

    iget-object v2, v0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;

    invoke-static {v2}, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;->access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthSourceRedirect:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x1e

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    iget-object v1, v0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->$paymentBrowserAuthStarter:Lcom/stripe/android/PaymentBrowserAuthStarter;

    new-instance v15, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    iget-object v2, v0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->$source:Lcom/stripe/android/model/Source;

    invoke-virtual {v2}, Lcom/stripe/android/model/Source;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    if-nez v2, :cond_0

    move-object v4, v3

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    const v5, 0xc352

    iget-object v2, v0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->$source:Lcom/stripe/android/model/Source;

    invoke-virtual {v2}, Lcom/stripe/android/model/Source;->getClientSecret()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    move-object v6, v3

    goto :goto_1

    :cond_1
    move-object v6, v2

    :goto_1
    iget-object v2, v0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->$source:Lcom/stripe/android/model/Source;

    invoke-virtual {v2}, Lcom/stripe/android/model/Source;->getRedirect()Lcom/stripe/android/model/Source$Redirect;

    move-result-object v2

    const/4 v7, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/stripe/android/model/Source$Redirect;->getUrl()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v7

    :goto_2
    if-nez v2, :cond_3

    move-object v8, v3

    goto :goto_3

    :cond_3
    move-object v8, v2

    :goto_3
    iget-object v2, v0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->$source:Lcom/stripe/android/model/Source;

    invoke-virtual {v2}, Lcom/stripe/android/model/Source;->getRedirect()Lcom/stripe/android/model/Source$Redirect;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/stripe/android/model/Source$Redirect;->getReturnUrl()Ljava/lang/String;

    move-result-object v2

    move-object v7, v2

    :cond_4
    iget-object v2, v0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;

    invoke-static {v2}, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;->access$getEnableLogging$p(Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;)Z

    move-result v9

    const/4 v10, 0x0

    iget-object v2, v0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->$requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-virtual {v2}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getStripeAccount()Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    iget-object v2, v0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;

    invoke-static {v2}, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;->access$getPublishableKeyProvider$p(Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;)Lkotlin/jvm/functions/Function0;

    move-result-object v2

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Ljava/lang/String;

    iget-object v2, v0, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator$startSourceAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;

    invoke-static {v2}, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;->access$isInstantApp$p(Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;)Z

    move-result v17

    const/16 v18, 0x740

    const/16 v19, 0x0

    move-object v2, v15

    move-object v3, v4

    move v4, v5

    move-object v5, v6

    move-object v6, v8

    move v8, v9

    move-object v9, v10

    move-object v10, v11

    move v11, v12

    move v12, v13

    move-object v13, v14

    move-object/from16 v14, v16

    move-object/from16 v20, v15

    move/from16 v15, v17

    move/from16 v16, v18

    move-object/from16 v17, v19

    invoke-direct/range {v2 .. v17}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v20

    invoke-interface {v1, v2}, Lcom/stripe/android/view/AuthActivityStarter;->start(Ljava/lang/Object;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
