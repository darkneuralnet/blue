.class public final LkJ4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "LFM4;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0007j\u0002`\u00082\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u000b\u001a\u00020\u00022\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0007j\u0002`\u0008H\u0002R+\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u000cj\u0002`\u000e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u000f\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u000f\u001a\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006 "
    }
    d2 = {
        "LkJ4;",
        "Ljava/util/concurrent/Callable;",
        "LFM4;",
        "b",
        "LpI4;",
        "request",
        "h",
        "Lkotlin/Pair;",
        "Lcom/github/kittinunf/fuel/core/requests/RequestTaskResult;",
        "c",
        "result",
        "i",
        "Lkotlin/Function1;",
        "",
        "Lcom/github/kittinunf/fuel/core/InterruptCallback;",
        "Lkotlin/Lazy;",
        "f",
        "()Lkotlin/jvm/functions/Function1;",
        "interruptCallback",
        "LII4;",
        "e",
        "()LII4;",
        "executor",
        "Lfk0;",
        "d",
        "()Lfk0;",
        "client",
        "LpI4;",
        "g",
        "()LpI4;",
        "<init>",
        "(LpI4;)V",
        "fuel"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lkotlin/Lazy;

.field public final c:Lkotlin/Lazy;

.field public final d:Lkotlin/Lazy;

.field public final e:LpI4;


# direct methods
.method public constructor <init>(LpI4;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LkJ4;->e:LpI4;

    new-instance p1, LkJ4$f;

    invoke-direct {p1, p0}, LkJ4$f;-><init>(LkJ4;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LkJ4;->b:Lkotlin/Lazy;

    new-instance p1, LkJ4$e;

    invoke-direct {p1, p0}, LkJ4$e;-><init>(LkJ4;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LkJ4;->c:Lkotlin/Lazy;

    new-instance p1, LkJ4$d;

    invoke-direct {p1, p0}, LkJ4$d;-><init>(LkJ4;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LkJ4;->d:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic a(LkJ4;)LII4;
    .locals 0

    invoke-virtual {p0}, LkJ4;->e()LII4;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()LFM4;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/github/kittinunf/fuel/core/FuelError;
        }
    .end annotation

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, p0, LkJ4;->e:LpI4;

    invoke-virtual {p0, v0}, LkJ4;->h(LpI4;)LpI4;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_1
    check-cast v0, LpI4;

    invoke-virtual {p0, v0}, LkJ4;->c(LpI4;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :try_start_2
    check-cast v0, Lkotlin/Pair;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    invoke-virtual {p0, v0}, LkJ4;->i(Lkotlin/Pair;)LFM4;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v1

    :try_start_4
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_2
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, LFM4;

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_3

    :cond_1
    sget-object v1, LqA1;->c:LqA1;

    new-instance v3, LkJ4$a;

    invoke-direct {v3, v2}, LkJ4$a;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v3}, LqA1;->b(Lkotlin/jvm/functions/Function0;)V

    sget-object v1, Lcom/github/kittinunf/fuel/core/FuelError;->c:Lcom/github/kittinunf/fuel/core/FuelError$a;

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFM4;

    invoke-virtual {v1, v2, v0}, Lcom/github/kittinunf/fuel/core/FuelError$a;->a(Ljava/lang/Throwable;LFM4;)Lcom/github/kittinunf/fuel/core/FuelError;

    move-result-object v0

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :catchall_3
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    :cond_2
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_3

    sget-object v2, LqA1;->c:LqA1;

    new-instance v3, LkJ4$b;

    invoke-direct {v3, v1}, LkJ4$b;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v2, v3}, LqA1;->b(Lkotlin/jvm/functions/Function0;)V

    instance-of v3, v1, Lcom/github/kittinunf/fuel/core/FuelError;

    if-eqz v3, :cond_3

    move-object v3, v1

    check-cast v3, Lcom/github/kittinunf/fuel/core/FuelError;

    invoke-virtual {v3}, Lcom/github/kittinunf/fuel/core/FuelError;->b()Z

    move-result v3

    if-eqz v3, :cond_3

    new-instance v3, LkJ4$c;

    invoke-direct {v3, v1}, LkJ4$c;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v2, v3}, LqA1;->b(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p0}, LkJ4;->f()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    iget-object v2, p0, LkJ4;->e:LpI4;

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, LFM4;

    return-object v0
.end method

.method public final c(LpI4;)Lkotlin/Pair;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LpI4;",
            ")",
            "Lkotlin/Pair<",
            "LpI4;",
            "LFM4;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/github/kittinunf/fuel/core/FuelError;
        }
    .end annotation

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance v0, Lkotlin/Pair;

    invoke-virtual {p0}, LkJ4;->d()Lfk0;

    move-result-object v1

    invoke-interface {v1, p1}, Lfk0;->a(LpI4;)LFM4;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Pair;

    return-object v0

    :cond_0
    sget-object v0, Lcom/github/kittinunf/fuel/core/FuelError;->c:Lcom/github/kittinunf/fuel/core/FuelError$a;

    new-instance v12, LFM4;

    invoke-interface {p1}, LpI4;->a()Ljava/net/URL;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x3e

    const/4 v11, 0x0

    move-object v2, v12

    invoke-direct/range {v2 .. v11}, LFM4;-><init>(Ljava/net/URL;ILjava/lang/String;LLH1;JLOY;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1, v12}, Lcom/github/kittinunf/fuel/core/FuelError$a;->a(Ljava/lang/Throwable;LFM4;)Lcom/github/kittinunf/fuel/core/FuelError;

    move-result-object p1

    throw p1
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LkJ4;->b()LFM4;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lfk0;
    .locals 1

    iget-object v0, p0, LkJ4;->d:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfk0;

    return-object v0
.end method

.method public final e()LII4;
    .locals 1

    iget-object v0, p0, LkJ4;->c:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LII4;

    return-object v0
.end method

.method public final f()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "LpI4;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LkJ4;->b:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final g()LpI4;
    .locals 1

    iget-object v0, p0, LkJ4;->e:LpI4;

    return-object v0
.end method

.method public final h(LpI4;)LpI4;
    .locals 1

    invoke-virtual {p0}, LkJ4;->e()LII4;

    move-result-object v0

    invoke-virtual {v0}, LII4;->i()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LpI4;

    return-object p1
.end method

.method public final i(Lkotlin/Pair;)LFM4;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "LpI4;",
            "LFM4;",
            ">;)",
            "LFM4;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/github/kittinunf/fuel/core/FuelError;
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LpI4;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LFM4;

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-virtual {p0}, LkJ4;->e()LII4;

    move-result-object v1

    invoke-virtual {v1}, LII4;->k()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-interface {v1, v0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFM4;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :try_start_1
    check-cast v0, LFM4;

    invoke-virtual {p0}, LkJ4;->e()LII4;

    move-result-object v1

    invoke-virtual {v1}, LII4;->l()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_0
    sget-object v1, Lcom/github/kittinunf/fuel/core/FuelError;->c:Lcom/github/kittinunf/fuel/core/FuelError$a;

    new-instance v2, Lcom/github/kittinunf/fuel/core/HttpException;

    invoke-virtual {v0}, LFM4;->d()I

    move-result v3

    invoke-virtual {v0}, LFM4;->c()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/github/kittinunf/fuel/core/HttpException;-><init>(ILjava/lang/String;)V

    invoke-virtual {v1, v2, v0}, Lcom/github/kittinunf/fuel/core/FuelError$a;->a(Ljava/lang/Throwable;LFM4;)Lcom/github/kittinunf/fuel/core/FuelError;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    :cond_1
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, LFM4;

    return-object v0

    :cond_2
    sget-object v0, Lcom/github/kittinunf/fuel/core/FuelError;->c:Lcom/github/kittinunf/fuel/core/FuelError$a;

    invoke-virtual {v0, v1, p1}, Lcom/github/kittinunf/fuel/core/FuelError$a;->a(Ljava/lang/Throwable;LFM4;)Lcom/github/kittinunf/fuel/core/FuelError;

    move-result-object p1

    throw p1
.end method
