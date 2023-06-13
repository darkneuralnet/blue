.class public final LVe5$a$b;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVe5$a;->m(Z)V
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
        "\u0000\u0012\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0008\u0008\u0001\u0010\u0002*\u00020\u0000\"\u0008\u0008\u0002\u0010\u0001*\u00020\u0000\"\u0008\u0008\u0003\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@"
    }
    d2 = {
        "",
        "Key",
        "Value",
        "LZC0;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.paging.RxPagedListBuilder$PagingObservableOnSubscribe$invalidate$1"
    f = "RxPagedListBuilder.kt"
    i = {
        0x0,
        0x1,
        0x1
    }
    l = {
        0x18e,
        0x195
    }
    m = "invokeSuspend"
    n = {
        "pagingSource",
        "pagingSource",
        "lastKey"
    }
    s = {
        "L$0",
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:I

.field public final synthetic k:LVe5$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LVe5$a<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LVe5$a;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVe5$a<",
            "TKey;TValue;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LVe5$a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LVe5$a$b;->k:LVe5$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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

    new-instance p1, LVe5$a$b;

    iget-object v0, p0, LVe5$a$b;->k:LVe5$a;

    invoke-direct {p1, v0, p2}, LVe5$a$b;-><init>(LVe5$a;Lkotlin/coroutines/Continuation;)V

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LVe5$a$b;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, LVe5$a$b;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, LVe5$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, LVe5$a$b;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LVe5$a$b;->j:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, LVe5$a$b;->i:Ljava/lang/Object;

    iget-object v1, p0, LVe5$a$b;->h:Ljava/lang/Object;

    check-cast v1, LfE3;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v11, v0

    move-object v4, v1

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LVe5$a$b;->h:Ljava/lang/Object;

    check-cast v1, LfE3;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, LVe5$a$b;->k:LVe5$a;

    invoke-static {p1}, LVe5$a;->e(LVe5$a;)LZD3;

    move-result-object p1

    invoke-virtual {p1}, LZD3;->E()LfE3;

    move-result-object p1

    iget-object v1, p0, LVe5$a$b;->k:LVe5$a;

    invoke-static {v1}, LVe5$a;->c(LVe5$a;)Lkotlin/jvm/functions/Function0;

    move-result-object v1

    invoke-virtual {p1, v1}, LfE3;->f(Lkotlin/jvm/functions/Function0;)V

    iget-object p1, p0, LVe5$a$b;->k:LVe5$a;

    invoke-static {p1}, LVe5$a;->i(LVe5$a;)Lkotlin/jvm/functions/Function0;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LfE3;

    iget-object v1, p0, LVe5$a$b;->k:LVe5$a;

    invoke-static {v1}, LVe5$a;->c(LVe5$a;)Lkotlin/jvm/functions/Function0;

    move-result-object v1

    invoke-virtual {p1, v1}, LfE3;->e(Lkotlin/jvm/functions/Function0;)V

    instance-of v1, p1, Lfp2;

    if-eqz v1, :cond_3

    move-object v1, p1

    check-cast v1, Lfp2;

    iget-object v5, p0, LVe5$a$b;->k:LVe5$a;

    invoke-static {v5}, LVe5$a;->d(LVe5$a;)LZD3$d;

    move-result-object v5

    iget v5, v5, LZD3$d;->a:I

    invoke-virtual {v1, v5}, Lfp2;->i(I)V

    :cond_3
    iget-object v1, p0, LVe5$a$b;->k:LVe5$a;

    invoke-static {v1}, LVe5$a;->h(LVe5$a;)LSC0;

    move-result-object v1

    new-instance v5, LVe5$a$b$a;

    iget-object v6, p0, LVe5$a$b;->k:LVe5$a;

    invoke-direct {v5, v6, v2}, LVe5$a$b$a;-><init>(LVe5$a;Lkotlin/coroutines/Continuation;)V

    iput-object p1, p0, LVe5$a$b;->h:Ljava/lang/Object;

    iput v4, p0, LVe5$a$b;->j:I

    invoke-static {v1, v5, p0}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v1, p1

    :goto_0
    iget-object p1, p0, LVe5$a$b;->k:LVe5$a;

    invoke-static {p1}, LVe5$a;->e(LVe5$a;)LZD3;

    move-result-object p1

    invoke-virtual {p1}, LZD3;->A()Ljava/lang/Object;

    move-result-object p1

    iget-object v4, p0, LVe5$a$b;->k:LVe5$a;

    invoke-static {v4}, LVe5$a;->d(LVe5$a;)LZD3$d;

    move-result-object v4

    invoke-static {v4, p1}, LgE3;->a(LZD3$d;Ljava/lang/Object;)LfE3$a;

    move-result-object v4

    iput-object v1, p0, LVe5$a$b;->h:Ljava/lang/Object;

    iput-object p1, p0, LVe5$a$b;->i:Ljava/lang/Object;

    iput v3, p0, LVe5$a$b;->j:I

    invoke-virtual {v1, v4, p0}, LfE3;->d(LfE3$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_5

    return-object v0

    :cond_5
    move-object v11, p1

    move-object v4, v1

    move-object p1, v3

    :goto_1
    check-cast p1, LfE3$b;

    instance-of v0, p1, LfE3$b$b;

    if-eqz v0, :cond_6

    iget-object p1, p0, LVe5$a$b;->k:LVe5$a;

    invoke-static {p1}, LVe5$a;->e(LVe5$a;)LZD3;

    move-result-object p1

    sget-object v0, Lpt2;->b:Lpt2;

    new-instance v1, Lot2$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lot2$c;-><init>(Z)V

    invoke-virtual {p1, v0, v1}, LZD3;->U(Lpt2;Lot2;)V

    invoke-virtual {v4}, LfE3;->c()V

    goto :goto_3

    :cond_6
    instance-of v0, p1, LfE3$b$a;

    if-eqz v0, :cond_7

    iget-object v0, p0, LVe5$a$b;->k:LVe5$a;

    invoke-static {v0}, LVe5$a;->e(LVe5$a;)LZD3;

    move-result-object v0

    sget-object v1, Lpt2;->b:Lpt2;

    new-instance v2, Lot2$a;

    check-cast p1, LfE3$b$a;

    invoke-virtual {p1}, LfE3$b$a;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v2, p1}, Lot2$a;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1, v2}, LZD3;->U(Lpt2;Lot2;)V

    goto :goto_3

    :cond_7
    instance-of v0, p1, LfE3$b$c;

    if-eqz v0, :cond_9

    sget-object v3, LZD3;->k:LZD3$c;

    move-object v5, p1

    check-cast v5, LfE3$b$c;

    sget-object v6, LVC1;->b:LVC1;

    iget-object p1, p0, LVe5$a$b;->k:LVe5$a;

    invoke-static {p1}, LVe5$a;->h(LVe5$a;)LSC0;

    move-result-object v7

    iget-object p1, p0, LVe5$a$b;->k:LVe5$a;

    invoke-static {p1}, LVe5$a;->g(LVe5$a;)LSC0;

    move-result-object v8

    iget-object p1, p0, LVe5$a$b;->k:LVe5$a;

    invoke-static {p1}, LVe5$a;->b(LVe5$a;)LZD3$a;

    move-result-object v9

    iget-object p1, p0, LVe5$a$b;->k:LVe5$a;

    invoke-static {p1}, LVe5$a;->d(LVe5$a;)LZD3$d;

    move-result-object v10

    invoke-virtual/range {v3 .. v11}, LZD3$c;->a(LfE3;LfE3$b$c;LZC0;LSC0;LSC0;LZD3$a;LZD3$d;Ljava/lang/Object;)LZD3;

    move-result-object p1

    iget-object v0, p0, LVe5$a$b;->k:LVe5$a;

    invoke-static {v0}, LVe5$a;->e(LVe5$a;)LZD3;

    move-result-object v1

    invoke-static {v0, v1, p1}, LVe5$a;->k(LVe5$a;LZD3;LZD3;)V

    iget-object v0, p0, LVe5$a$b;->k:LVe5$a;

    invoke-static {v0, p1}, LVe5$a;->l(LVe5$a;LZD3;)V

    iget-object v0, p0, LVe5$a$b;->k:LVe5$a;

    invoke-static {v0}, LVe5$a;->f(LVe5$a;)Lio/reactivex/y;

    move-result-object v0

    if-nez v0, :cond_8

    const-string v0, "emitter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_8
    move-object v2, v0

    :goto_2
    invoke-interface {v2, p1}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    :cond_9
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
