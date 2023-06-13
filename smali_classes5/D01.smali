.class public final LD01;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a[\u0010\u000b\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u00080\u0006j\u0008\u0012\u0004\u0012\u00028\u0000`\n\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u000e\u0008\u0001\u0010\u0003*\u0008\u0012\u0004\u0012\u00028\u00000\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a9\u0010\r\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u000e\u0008\u0001\u0010\u0003*\u0008\u0012\u0004\u0012\u00028\u00000\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000f"
    }
    d2 = {
        "",
        "T",
        "LC01;",
        "U",
        "LpI4;",
        "deserializable",
        "Lkotlin/Triple;",
        "LFM4;",
        "LaN4;",
        "Lcom/github/kittinunf/fuel/core/FuelError;",
        "Lcom/github/kittinunf/fuel/core/ResponseResultOf;",
        "b",
        "(LpI4;LC01;)Lkotlin/Triple;",
        "a",
        "(LpI4;LC01;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fuel"
    }
    k = 0x2
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# direct methods
.method public static final a(LpI4;LC01;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U::",
            "LC01<",
            "+TT;>;>(",
            "LpI4;",
            "TU;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/github/kittinunf/fuel/core/FuelError;
        }
    .end annotation

    instance-of v0, p2, LD01$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LD01$a;

    iget v1, v0, LD01$a;->i:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LD01$a;->i:I

    goto :goto_0

    :cond_0
    new-instance v0, LD01$a;

    invoke-direct {v0, p2}, LD01$a;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, LD01$a;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LD01$a;->i:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LD01$a;->k:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LC01;

    iget-object p0, v0, LD01$a;->j:Ljava/lang/Object;

    check-cast p0, LpI4;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-static {p0}, LwW5;->a(LpI4;)LvW5;

    move-result-object p2

    iput-object p0, v0, LD01$a;->j:Ljava/lang/Object;

    iput-object p1, v0, LD01$a;->k:Ljava/lang/Object;

    iput v3, v0, LD01$a;->i:I

    invoke-virtual {p2, v0}, LvW5;->r(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, LFM4;

    :try_start_0
    sget-object p0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-interface {p1, p2}, LC01;->a(LFM4;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_2
    invoke-static {p0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_4

    invoke-static {p0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p0

    :cond_4
    sget-object p0, Lcom/github/kittinunf/fuel/core/FuelError;->c:Lcom/github/kittinunf/fuel/core/FuelError$a;

    invoke-virtual {p0, p1, p2}, Lcom/github/kittinunf/fuel/core/FuelError$a;->a(Ljava/lang/Throwable;LFM4;)Lcom/github/kittinunf/fuel/core/FuelError;

    move-result-object p0

    throw p0
.end method

.method public static final b(LpI4;LC01;)Lkotlin/Triple;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U::",
            "LC01<",
            "+TT;>;>(",
            "LpI4;",
            "TU;)",
            "Lkotlin/Triple<",
            "LpI4;",
            "LFM4;",
            "LaN4<",
            "TT;",
            "Lcom/github/kittinunf/fuel/core/FuelError;",
            ">;>;"
        }
    .end annotation

    const-string v0, "rawResponse"

    const-string v1, "$this$response"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "deserializable"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p0}, LlJ4;->a(LpI4;)Ljava/util/concurrent/Callable;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LFM4;

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_0

    sget-object p1, Lcom/github/kittinunf/fuel/core/FuelError;->c:Lcom/github/kittinunf/fuel/core/FuelError$a;

    sget-object v0, LFM4;->g:LFM4$b;

    invoke-interface {p0}, LpI4;->a()Ljava/net/URL;

    move-result-object v1

    invoke-virtual {v0, v1}, LFM4$b;->a(Ljava/net/URL;)LFM4;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Lcom/github/kittinunf/fuel/core/FuelError$a;->a(Ljava/lang/Throwable;LFM4;)Lcom/github/kittinunf/fuel/core/FuelError;

    move-result-object p1

    new-instance v0, Lkotlin/Triple;

    invoke-virtual {p1}, Lcom/github/kittinunf/fuel/core/FuelError;->d()LFM4;

    move-result-object v1

    sget-object v2, LaN4;->a:LaN4$a;

    invoke-virtual {v2, p1}, LaN4$a;->a(Ljava/lang/Exception;)LaN4$b;

    move-result-object p1

    invoke-direct {v0, p0, v1, p1}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_0
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, LFM4;

    :try_start_1
    new-instance v2, Lkotlin/Triple;

    new-instance v3, LaN4$c;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v1}, LC01;->a(LFM4;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v3, p1}, LaN4$c;-><init>(Ljava/lang/Object;)V

    invoke-direct {v2, p0, v1, v3}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    new-instance p1, Lkotlin/Triple;

    new-instance v3, LaN4$b;

    sget-object v4, Lcom/github/kittinunf/fuel/core/FuelError;->c:Lcom/github/kittinunf/fuel/core/FuelError$a;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v2, v1}, Lcom/github/kittinunf/fuel/core/FuelError$a;->a(Ljava/lang/Throwable;LFM4;)Lcom/github/kittinunf/fuel/core/FuelError;

    move-result-object v0

    invoke-direct {v3, v0}, LaN4$b;-><init>(Ljava/lang/Exception;)V

    invoke-direct {p1, p0, v1, v3}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Triple;

    return-object p1
.end method
