.class final Lbo/app/q6$a;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbo/app/q6;->p()V
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
        0x6,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.braze.managers.UserDependencyManager$requestClose$1"
    f = "UserDependencyManager.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:Lbo/app/q6;


# direct methods
.method public constructor <init>(Lbo/app/q6;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbo/app/q6;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lbo/app/q6$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbo/app/q6$a;->d:Lbo/app/q6;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

    invoke-virtual {p0, p1, p2}, Lbo/app/q6$a;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lbo/app/q6$a;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lbo/app/q6$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

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

    new-instance v0, Lbo/app/q6$a;

    iget-object v1, p0, Lbo/app/q6$a;->d:Lbo/app/q6;

    invoke-direct {v0, v1, p2}, Lbo/app/q6$a;-><init>(Lbo/app/q6;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lbo/app/q6$a;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lbo/app/q6$a;->a(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, Lbo/app/q6$a;->b:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lbo/app/q6$a;->c:Ljava/lang/Object;

    check-cast p1, LZC0;

    :try_start_0
    iget-object v0, p0, Lbo/app/q6$a;->d:Lbo/app/q6;

    invoke-virtual {v0}, Lbo/app/q6;->o()Lbo/app/p6;

    move-result-object v0

    invoke-virtual {v0}, Lbo/app/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v8, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->d:Lk20$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Lbo/app/q6$a$a;->b:Lbo/app/q6$a$a;

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p1

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object v0, p0, Lbo/app/q6$a;->d:Lbo/app/q6;

    invoke-virtual {v0}, Lbo/app/q6;->o()Lbo/app/p6;

    move-result-object v0

    invoke-virtual {v0}, Lbo/app/a;->c()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Lbo/app/q6$a$b;->b:Lbo/app/q6$a$b;

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p1

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lbo/app/q6$a;->d:Lbo/app/q6;

    invoke-static {v0}, Lbo/app/q6;->a(Lbo/app/q6;)Lbo/app/i0;

    move-result-object v0

    invoke-virtual {v0}, Lbo/app/a;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v8, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->d:Lk20$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Lbo/app/q6$a$c;->b:Lbo/app/q6$a$c;

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p1

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object v0, p0, Lbo/app/q6$a;->d:Lbo/app/q6;

    invoke-static {v0}, Lbo/app/q6;->a(Lbo/app/q6;)Lbo/app/i0;

    move-result-object v0

    invoke-virtual {v0}, Lbo/app/a;->c()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Lbo/app/q6$a$d;->b:Lbo/app/q6$a$d;

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p1

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :cond_1
    iget-object v0, p0, Lbo/app/q6$a;->d:Lbo/app/q6;

    invoke-virtual {v0}, Lbo/app/q6;->a()Lbo/app/f;

    move-result-object v0

    iget-object v1, p0, Lbo/app/q6$a;->d:Lbo/app/q6;

    invoke-virtual {v1}, Lbo/app/q6;->h()Lbo/app/a1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbo/app/f;->a(Lbo/app/g2;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v3, v0

    sget-object v0, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->g:Lk20$a;

    sget-object v5, Lbo/app/q6$a$e;->b:Lbo/app/q6$a$e;

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_0
    :try_start_1
    iget-object v0, p0, Lbo/app/q6$a;->d:Lbo/app/q6;

    invoke-virtual {v0}, Lbo/app/q6;->e()Lbo/app/f0;

    move-result-object v0

    invoke-virtual {v0}, Lbo/app/f0;->f()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v3, v0

    sget-object v0, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->g:Lk20$a;

    sget-object v5, Lbo/app/q6$a$f;->b:Lbo/app/q6$a$f;

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
