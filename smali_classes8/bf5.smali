.class public final Lbf5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001aQ\u0010\u000f\u001a\u00020\u000e*\u00020\u00032\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0008\u001a\u00020\u00072,\u0010\r\u001a(\u0012\u001a\u0012\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\t\u0012\u0008\u0012\u00060\u0004j\u0002`\u00050\tH\u0002\u00f8\u0001\u0000*8\u0008\u0002\u0010\u0010\"\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\t2\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\t\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/reactivex/E;",
        "LSC0;",
        "d",
        "LZC0;",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "block",
        "",
        "delayMillis",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "",
        "",
        "adaptForScheduling",
        "Lio/reactivex/disposables/c;",
        "e",
        "Task",
        "kotlinx-coroutines-rx2"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public static synthetic a(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0

    invoke-static {p0}, Lbf5;->f(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    return-void
.end method

.method public static final synthetic b(LZC0;Ljava/lang/Runnable;JLkotlin/jvm/functions/Function1;)Lio/reactivex/disposables/c;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lbf5;->e(LZC0;Ljava/lang/Runnable;JLkotlin/jvm/functions/Function1;)Lio/reactivex/disposables/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lio/reactivex/disposables/c;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbf5;->g(Lio/reactivex/disposables/c;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lio/reactivex/E;)LSC0;
    .locals 1

    instance-of v0, p0, LS41;

    if-eqz v0, :cond_0

    check-cast p0, LS41;

    iget-object p0, p0, LS41;->d:LSC0;

    goto :goto_0

    :cond_0
    new-instance v0, LCm5;

    invoke-direct {v0, p0}, LCm5;-><init>(Lio/reactivex/E;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static final e(LZC0;Ljava/lang/Runnable;JLkotlin/jvm/functions/Function1;)Lio/reactivex/disposables/c;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Ljava/lang/Runnable;",
            "J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;+",
            "Ljava/lang/Runnable;",
            ">;)",
            "Lio/reactivex/disposables/c;"
        }
    .end annotation

    invoke-interface {p0}, LZC0;->K()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v2, Laf5;

    invoke-direct {v2, v1}, Laf5;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-static {v2}, Lio/reactivex/disposables/d;->d(Ljava/lang/Runnable;)Lio/reactivex/disposables/c;

    move-result-object v2

    invoke-static {p1}, Lio/reactivex/plugins/a;->w(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    new-instance v3, Lbf5$c;

    invoke-direct {v3, v2, v0, p1}, Lbf5$c;-><init>(Lio/reactivex/disposables/c;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    invoke-interface {p4, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Runnable;

    invoke-static {p0}, LaD0;->f(LZC0;)Z

    move-result p0

    if-nez p0, :cond_0

    invoke-static {}, Lio/reactivex/disposables/d;->a()Lio/reactivex/disposables/c;

    move-result-object p0

    return-object p0

    :cond_0
    const-wide/16 v3, 0x0

    cmp-long p0, p2, v3

    if-gtz p0, :cond_1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_1
    invoke-static {v0}, LrZ0;->c(Lkotlin/coroutines/CoroutineContext;)LqZ0;

    move-result-object p0

    invoke-interface {p0, p2, p3, p1, v0}, LqZ0;->t(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lo51;

    move-result-object p0

    iput-object p0, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    :goto_0
    return-object v2
.end method

.method public static final f(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0

    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lo51;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lo51;->dispose()V

    :cond_0
    return-void
.end method

.method public static final g(Lio/reactivex/disposables/c;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/disposables/c;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/lang/Runnable;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lbf5$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lbf5$a;

    iget v1, v0, Lbf5$a;->j:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbf5$a;->j:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbf5$a;

    invoke-direct {v0, p3}, Lbf5$a;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lbf5$a;->i:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lbf5$a;->j:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lbf5$a;->h:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-interface {p0}, Lio/reactivex/disposables/c;->e()Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    :cond_3
    :try_start_1
    new-instance p0, Lbf5$b;

    invoke-direct {p0, p2}, Lbf5$b;-><init>(Ljava/lang/Runnable;)V

    iput-object p1, v0, Lbf5$a;->h:Ljava/lang/Object;

    iput v3, v0, Lbf5$a;->j:I

    const/4 p2, 0x0

    invoke-static {p2, p0, v0, v3, p2}, LM62;->c(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p0, v1, :cond_4

    return-object v1

    :catchall_0
    move-exception p0

    invoke-static {p0, p1}, LKe5;->a(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V

    :cond_4
    :goto_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
