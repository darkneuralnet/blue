.class final Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;->fallback(Lcom/stripe/android/model/ElementsSessionParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/model/ElementsSession;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "LZC0;",
        "Lcom/stripe/android/model/ElementsSession;",
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
    c = "com.stripe.android.paymentsheet.repositories.ElementsSessionRepository$Api$fallback$2"
    f = "ElementsSessionRepository.kt"
    i = {}
    l = {
        0x53,
        0x60
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $params:Lcom/stripe/android/model/ElementsSessionParams;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;


# direct methods
.method public constructor <init>(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ElementsSessionParams;",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;->$params:Lcom/stripe/android/model/ElementsSessionParams;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;->this$0:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance p1, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;->$params:Lcom/stripe/android/model/ElementsSessionParams;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;->this$0:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;-><init>(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ElementsSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;->$params:Lcom/stripe/android/model/ElementsSessionParams;

    instance-of v1, p1, Lcom/stripe/android/model/ElementsSessionParams$PaymentIntentType;

    const-string v5, "payment_method"

    if-eqz v1, :cond_4

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;->this$0:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;->access$getStripeRepository$p(Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;)Lcom/stripe/android/networking/StripeRepository;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;->$params:Lcom/stripe/android/model/ElementsSessionParams;

    check-cast v1, Lcom/stripe/android/model/ElementsSessionParams$PaymentIntentType;

    invoke-virtual {v1}, Lcom/stripe/android/model/ElementsSessionParams$PaymentIntentType;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;->this$0:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;

    invoke-static {v2}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;->access$getRequestOptions(Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v2

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    iput v3, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;->label:I

    invoke-virtual {p1, v1, v2, v5, p0}, Lcom/stripe/android/networking/StripeRepository;->retrievePaymentIntent(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Lcom/stripe/android/model/PaymentIntent;

    if-eqz p1, :cond_7

    new-instance v0, Lcom/stripe/android/model/ElementsSession;

    invoke-direct {v0, v4, v4, p1}, Lcom/stripe/android/model/ElementsSession;-><init>(Lcom/stripe/android/model/ElementsSession$LinkSettings;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)V

    :goto_1
    move-object v4, v0

    goto :goto_3

    :cond_4
    instance-of v1, p1, Lcom/stripe/android/model/ElementsSessionParams$SetupIntentType;

    if-eqz v1, :cond_6

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;->this$0:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;->access$getStripeRepository$p(Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;)Lcom/stripe/android/networking/StripeRepository;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;->$params:Lcom/stripe/android/model/ElementsSessionParams;

    check-cast v1, Lcom/stripe/android/model/ElementsSessionParams$SetupIntentType;

    invoke-virtual {v1}, Lcom/stripe/android/model/ElementsSessionParams$SetupIntentType;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;->this$0:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;->access$getRequestOptions(Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v3

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    iput v2, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api$fallback$2;->label:I

    invoke-virtual {p1, v1, v3, v5, p0}, Lcom/stripe/android/networking/StripeRepository;->retrieveSetupIntent(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_2
    check-cast p1, Lcom/stripe/android/model/SetupIntent;

    if-eqz p1, :cond_7

    new-instance v0, Lcom/stripe/android/model/ElementsSession;

    invoke-direct {v0, v4, v4, p1}, Lcom/stripe/android/model/ElementsSession;-><init>(Lcom/stripe/android/model/ElementsSession$LinkSettings;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)V

    goto :goto_1

    :cond_6
    instance-of p1, p1, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    if-eqz p1, :cond_8

    :cond_7
    :goto_3
    return-object v4

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
