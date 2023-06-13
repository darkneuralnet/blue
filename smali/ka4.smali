.class public final Lka4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ#\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\n"
    }
    d2 = {
        "Lka4;",
        "",
        "Lcom/adyen/checkout/core/api/Environment;",
        "environment",
        "",
        "clientKey",
        "a",
        "(Lcom/adyen/checkout/core/api/Environment;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "<init>",
        "()V",
        "card_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/adyen/checkout/core/api/Environment;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/adyen/checkout/core/api/Environment;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lka4$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lka4$a;

    iget v1, v0, Lka4$a;->n:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lka4$a;->n:I

    goto :goto_0

    :cond_0
    new-instance v0, Lka4$a;

    invoke-direct {v0, p0, p3}, Lka4$a;-><init>(Lka4;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lka4$a;->l:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lka4$a;->n:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lka4$a;->k:I

    iget p2, v0, Lka4$a;->j:I

    iget-object v2, v0, Lka4$a;->i:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v4, v0, Lka4$a;->h:Ljava/lang/Object;

    check-cast v4, Lcom/adyen/checkout/core/api/Environment;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p3

    goto :goto_3

    :catch_1
    move-exception p3

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-static {}, Lla4;->a()Ljava/lang/String;

    move-result-object p3

    const-string v2, "fetching publicKey from API"

    invoke-static {p3, v2}, LCx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p3, 0x3

    const/4 v2, 0x0

    move-object v8, p2

    move-object p2, p1

    move p1, p3

    move-object p3, v8

    :goto_1
    if-ge v2, p1, :cond_4

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    :try_start_1
    new-instance v4, Lha4;

    invoke-direct {v4, p2, p3}, Lha4;-><init>(Lcom/adyen/checkout/core/api/Environment;Ljava/lang/String;)V

    invoke-static {}, LT41;->b()LSC0;

    move-result-object v5

    new-instance v6, Lka4$b;

    const/4 v7, 0x0

    invoke-direct {v6, v4, v7}, Lka4$b;-><init>(Lfy0;Lkotlin/coroutines/Continuation;)V

    iput-object p2, v0, Lka4$a;->h:Ljava/lang/Object;

    iput-object p3, v0, Lka4$a;->i:Ljava/lang/Object;

    iput v2, v0, Lka4$a;->j:I

    iput p1, v0, Lka4$a;->k:I

    iput v3, v0, Lka4$a;->n:I

    invoke-static {v5, v6, v0}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    return-object p3

    :catch_2
    move-exception v4

    move-object v8, v4

    move-object v4, p2

    move p2, v2

    move-object v2, p3

    move-object p3, v8

    :goto_3
    invoke-static {}, Lla4;->a()Ljava/lang/String;

    move-result-object v5

    const-string v6, "PublicKeyConnection unexpected result"

    invoke-static {v5, v6, p3}, LCx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5

    :catch_3
    move-exception v4

    move-object v8, v4

    move-object v4, p2

    move p2, v2

    move-object v2, p3

    move-object p3, v8

    :goto_4
    invoke-static {}, Lla4;->a()Ljava/lang/String;

    move-result-object v5

    const-string v6, "PublicKeyConnection Failed"

    invoke-static {v5, v6, p3}, LCx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_5
    move-object p3, v2

    add-int/lit8 v2, p2, 0x1

    move-object p2, v4

    goto :goto_1

    :cond_4
    new-instance p1, Lcom/adyen/checkout/core/exception/CheckoutException;

    const-string p2, "Unable to fetch public key"

    invoke-direct {p1, p2}, Lcom/adyen/checkout/core/exception/CheckoutException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
