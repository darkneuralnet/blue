.class final Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.stripe.android.googlepaylauncher.StripeGooglePayViewModel$createPaymentMethod$1$1"
    f = "StripeGooglePayViewModel.kt"
    i = {}
    l = {
        0x4e,
        0x4b
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $$this$liveData:LVs2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LVs2<",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $params:Lcom/stripe/android/model/PaymentMethodCreateParams;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;


# direct methods
.method public constructor <init>(LVs2;Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVs2<",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;",
            "Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->$$this$liveData:LVs2;

    iput-object p2, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->this$0:Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;

    iput-object p3, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->$params:Lcom/stripe/android/model/PaymentMethodCreateParams;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->$$this$liveData:LVs2;

    iget-object v2, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->this$0:Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;

    iget-object v3, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->$params:Lcom/stripe/android/model/PaymentMethodCreateParams;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;-><init>(LVs2;Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

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
    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->L$0:Ljava/lang/Object;

    check-cast v1, LVs2;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->L$0:Ljava/lang/Object;

    check-cast p1, LZC0;

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->$$this$liveData:LVs2;

    iget-object p1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->this$0:Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;

    iget-object v4, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->$params:Lcom/stripe/android/model/PaymentMethodCreateParams;

    :try_start_1
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->access$getStripeRepository$p(Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;)Lcom/stripe/android/networking/StripeRepository;

    move-result-object v5

    new-instance v12, Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-static {p1}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->access$getPublishableKey$p(Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;)Ljava/lang/String;

    move-result-object v7

    invoke-static {p1}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->access$getStripeAccountId$p(Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v6, v12

    invoke-direct/range {v6 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->label:I

    invoke-virtual {v5, v4, v12, p0}, Lcom/stripe/android/networking/StripeRepository;->createPaymentMethod(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    if-eqz p1, :cond_4

    check-cast p1, Lcom/stripe/android/model/PaymentMethod;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_4
    const-string p1, "Required value was null."

    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    const/4 v3, 0x0

    iput-object v3, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$createPaymentMethod$1$1;->label:I

    invoke-interface {v1, p1, p0}, LVs2;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
