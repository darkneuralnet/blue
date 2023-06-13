.class final Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/String;",
        "+",
        "Landroid/graphics/Bitmap;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.uicore.text.HtmlKt$rememberRemoteImages$1$deferred$1$1"
    f = "Html.kt"
    i = {}
    l = {
        0xa3
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $stripeImageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field final synthetic $url:LDf$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LDf$b<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(LDf$b;Lcom/stripe/android/uicore/image/StripeImageLoader;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDf$b<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;->$url:LDf$b;

    iput-object p2, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;->$stripeImageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

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

    new-instance p1, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;

    iget-object v0, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;->$url:LDf$b;

    iget-object v1, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;->$stripeImageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;-><init>(LDf$b;Lcom/stripe/android/uicore/image/StripeImageLoader;Lkotlin/coroutines/Continuation;)V

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
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;->L$0:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;->$url:LDf$b;

    invoke-virtual {p1}, LDf$b;->e()Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;->$stripeImageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iget-object v3, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;->$url:LDf$b;

    invoke-virtual {v3}, LDf$b;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iput-object p1, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;->label:I

    invoke-virtual {v1, v3, p0}, Lcom/stripe/android/uicore/image/StripeImageLoader;->load-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    move-object p1, v1

    :goto_0
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 p1, 0x0

    :cond_3
    new-instance v1, Lkotlin/Pair;

    invoke-direct {v1, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method
