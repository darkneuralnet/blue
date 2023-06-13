.class public final LmN1$b$c$a;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmN1$b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LWu;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
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
    c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1"
    f = "Hoverable.kt"
    i = {
        0x0
    }
    l = {
        0x68
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitPointerEventScope"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lkotlin/coroutines/CoroutineContext;

.field public final synthetic k:LZC0;

.field public final synthetic l:LrX2;

.field public final synthetic m:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LjN1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;LZC0;LrX2;LEX2;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/CoroutineContext;",
            "LZC0;",
            "LrX2;",
            "LEX2<",
            "LjN1;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LmN1$b$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LmN1$b$c$a;->j:Lkotlin/coroutines/CoroutineContext;

    iput-object p2, p0, LmN1$b$c$a;->k:LZC0;

    iput-object p3, p0, LmN1$b$c$a;->l:LrX2;

    iput-object p4, p0, LmN1$b$c$a;->m:LEX2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v6, LmN1$b$c$a;

    iget-object v1, p0, LmN1$b$c$a;->j:Lkotlin/coroutines/CoroutineContext;

    iget-object v2, p0, LmN1$b$c$a;->k:LZC0;

    iget-object v3, p0, LmN1$b$c$a;->l:LrX2;

    iget-object v4, p0, LmN1$b$c$a;->m:LEX2;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LmN1$b$c$a;-><init>(Lkotlin/coroutines/CoroutineContext;LZC0;LrX2;LEX2;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v6, LmN1$b$c$a;->i:Ljava/lang/Object;

    return-object v6
.end method

.method public final e(LWu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWu;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LmN1$b$c$a;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, LmN1$b$c$a;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, LmN1$b$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWu;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, LmN1$b$c$a;->e(LWu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LmN1$b$c$a;->h:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LmN1$b$c$a;->i:Ljava/lang/Object;

    check-cast v1, LWu;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, v1

    move-object v1, v0

    move-object v0, p0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, LmN1$b$c$a;->i:Ljava/lang/Object;

    check-cast p1, LWu;

    move-object v1, p1

    move-object p1, p0

    :goto_0
    iget-object v4, p1, LmN1$b$c$a;->j:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v4}, LKh2;->o(Lkotlin/coroutines/CoroutineContext;)Z

    move-result v4

    if-eqz v4, :cond_5

    iput-object v1, p1, LmN1$b$c$a;->i:Ljava/lang/Object;

    iput v2, p1, LmN1$b$c$a;->h:I

    invoke-static {v1, v3, p1, v2, v3}, LWu;->U(LWu;LaX3;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_2

    return-object v0

    :cond_2
    move-object v13, v0

    move-object v0, p1

    move-object p1, v4

    move-object v4, v1

    move-object v1, v13

    :goto_1
    check-cast p1, LYW3;

    invoke-virtual {p1}, LYW3;->f()I

    move-result p1

    sget-object v5, LbX3;->a:LbX3$a;

    invoke-virtual {v5}, LbX3$a;->a()I

    move-result v6

    invoke-static {p1, v6}, LbX3;->i(II)Z

    move-result v6

    if-eqz v6, :cond_3

    iget-object v7, v0, LmN1$b$c$a;->k:LZC0;

    const/4 v8, 0x0

    const/4 v9, 0x0

    new-instance v10, LmN1$b$c$a$a;

    iget-object p1, v0, LmN1$b$c$a;->l:LrX2;

    iget-object v5, v0, LmN1$b$c$a;->m:LEX2;

    invoke-direct {v10, p1, v5, v3}, LmN1$b$c$a$a;-><init>(LrX2;LEX2;Lkotlin/coroutines/Continuation;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    goto :goto_2

    :cond_3
    invoke-virtual {v5}, LbX3$a;->b()I

    move-result v5

    invoke-static {p1, v5}, LbX3;->i(II)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object v5, v0, LmN1$b$c$a;->k:LZC0;

    const/4 v6, 0x0

    const/4 v7, 0x0

    new-instance v8, LmN1$b$c$a$b;

    iget-object p1, v0, LmN1$b$c$a;->m:LEX2;

    iget-object v9, v0, LmN1$b$c$a;->l:LrX2;

    invoke-direct {v8, p1, v9, v3}, LmN1$b$c$a$b;-><init>(LEX2;LrX2;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :cond_4
    :goto_2
    move-object p1, v0

    move-object v0, v1

    move-object v1, v4

    goto :goto_0

    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
