.class final Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;->beginWebAuth(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.stripe.android.payments.core.authentication.WebIntentAuthenticator$beginWebAuth$2"
    f = "WebIntentAuthenticator.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $authUrl:Ljava/lang/String;

.field final synthetic $clientSecret:Ljava/lang/String;

.field final synthetic $host:Lcom/stripe/android/view/AuthActivityStarterHost;

.field final synthetic $requestCode:I

.field final synthetic $returnUrl:Ljava/lang/String;

.field final synthetic $shouldCancelIntentOnUserNavigation:Z

.field final synthetic $shouldCancelSource:Z

.field final synthetic $stripeAccount:Ljava/lang/String;

.field final synthetic $stripeIntent:Lcom/stripe/android/model/StripeIntent;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;


# direct methods
.method public constructor <init>(Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/model/StripeIntent;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZ",
            "Lkotlin/coroutines/Continuation<",
            "Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;

    iput-object p2, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    iput-object p3, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iput p4, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$requestCode:I

    iput-object p5, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$clientSecret:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$authUrl:Ljava/lang/String;

    iput-object p7, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$returnUrl:Ljava/lang/String;

    iput-object p8, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$stripeAccount:Ljava/lang/String;

    iput-boolean p9, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$shouldCancelSource:Z

    iput-boolean p10, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$shouldCancelIntentOnUserNavigation:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p11}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 12
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

    new-instance p1, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;

    iget-object v2, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    iget-object v3, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iget v4, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$requestCode:I

    iget-object v5, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$clientSecret:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$authUrl:Ljava/lang/String;

    iget-object v7, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$returnUrl:Ljava/lang/String;

    iget-object v8, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$stripeAccount:Ljava/lang/String;

    iget-boolean v9, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$shouldCancelSource:Z

    iget-boolean v10, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$shouldCancelIntentOnUserNavigation:Z

    move-object v0, p1

    move-object v11, p2

    invoke-direct/range {v0 .. v11}, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;-><init>(Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v1, v0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->label:I

    if-nez v1, :cond_1

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v1, v0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;->access$getPaymentBrowserAuthStarterFactory$p(Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    iget-object v2, v0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/PaymentBrowserAuthStarter;

    new-instance v15, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    iget-object v2, v0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-interface {v2}, Lcom/stripe/android/model/StripeIntent;->getId()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, ""

    :cond_0
    move-object v3, v2

    iget v4, v0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$requestCode:I

    iget-object v5, v0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$clientSecret:Ljava/lang/String;

    iget-object v6, v0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$authUrl:Ljava/lang/String;

    iget-object v7, v0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$returnUrl:Ljava/lang/String;

    iget-object v2, v0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;

    invoke-static {v2}, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;->access$getEnableLogging$p(Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;)Z

    move-result v8

    const/4 v9, 0x0

    iget-object v10, v0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$stripeAccount:Ljava/lang/String;

    iget-boolean v11, v0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$shouldCancelSource:Z

    iget-boolean v12, v0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->$shouldCancelIntentOnUserNavigation:Z

    const/4 v13, 0x0

    iget-object v2, v0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;

    invoke-static {v2}, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;->access$getPublishableKeyProvider$p(Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;)Lkotlin/jvm/functions/Function0;

    move-result-object v2

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ljava/lang/String;

    iget-object v2, v0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator$beginWebAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;

    invoke-static {v2}, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;->access$isInstantApp$p(Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;)Z

    move-result v16

    const/16 v17, 0x440

    const/16 v18, 0x0

    move-object v2, v15

    move-object/from16 v19, v15

    move/from16 v15, v16

    move/from16 v16, v17

    move-object/from16 v17, v18

    invoke-direct/range {v2 .. v17}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v19

    invoke-interface {v1, v2}, Lcom/stripe/android/view/AuthActivityStarter;->start(Ljava/lang/Object;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
