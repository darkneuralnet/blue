.class public final Ldq5$e;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldq5;->g(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lro6;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lro6;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lro6;",
        "velocity",
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
    c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1"
    f = "Scrollable.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x2,
        0x2
    }
    l = {
        0x196,
        0x198,
        0x19a
    }
    m = "invokeSuspend"
    n = {
        "velocity",
        "velocity",
        "available",
        "velocity",
        "velocityLeft"
    }
    s = {
        "J$0",
        "J$0",
        "J$1",
        "J$0",
        "J$1"
    }
.end annotation


# instance fields
.field public h:J

.field public i:I

.field public synthetic j:J

.field public final synthetic k:Ldq5;


# direct methods
.method public constructor <init>(Ldq5;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldq5;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ldq5$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldq5$e;->k:Ldq5;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance v0, Ldq5$e;

    iget-object v1, p0, Ldq5$e;->k:Ldq5;

    invoke-direct {v0, v1, p2}, Ldq5$e;-><init>(Ldq5;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lro6;

    invoke-virtual {p1}, Lro6;->o()J

    move-result-wide p1

    iput-wide p1, v0, Ldq5$e;->j:J

    return-object v0
.end method

.method public final e(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lro6;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1, p2}, Lro6;->b(J)Lro6;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Ldq5$e;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Ldq5$e;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ldq5$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lro6;

    invoke-virtual {p1}, Lro6;->o()J

    move-result-wide v0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, v0, v1, p2}, Ldq5$e;->e(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v6

    iget v0, p0, Ldq5$e;->i:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Ldq5$e;->h:J

    iget-wide v2, p0, Ldq5$e;->j:J

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-wide v9, v0

    move-object v0, p1

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-wide v2, p0, Ldq5$e;->h:J

    iget-wide v4, p0, Ldq5$e;->j:J

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v0, p1

    move-wide v7, v4

    goto :goto_1

    :cond_2
    iget-wide v3, p0, Ldq5$e;->j:J

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-wide v4, p0, Ldq5$e;->j:J

    iget-object v0, p0, Ldq5$e;->k:Ldq5;

    invoke-virtual {v0}, Ldq5;->d()LsP5;

    move-result-object v0

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC43;

    iput-wide v4, p0, Ldq5$e;->j:J

    iput v3, p0, Ldq5$e;->i:I

    invoke-virtual {v0, v4, v5, p0}, LC43;->c(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_4

    return-object v6

    :cond_4
    move-wide v3, v4

    :goto_0
    check-cast v0, Lro6;

    invoke-virtual {v0}, Lro6;->o()J

    move-result-wide v7

    invoke-static {v3, v4, v7, v8}, Lro6;->k(JJ)J

    move-result-wide v7

    iget-object v0, p0, Ldq5$e;->k:Ldq5;

    iput-wide v3, p0, Ldq5$e;->j:J

    iput-wide v7, p0, Ldq5$e;->h:J

    iput v2, p0, Ldq5$e;->i:I

    invoke-virtual {v0, v7, v8, p0}, Ldq5;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_5

    return-object v6

    :cond_5
    move-wide v11, v3

    move-wide v2, v7

    move-wide v7, v11

    :goto_1
    check-cast v0, Lro6;

    invoke-virtual {v0}, Lro6;->o()J

    move-result-wide v9

    iget-object v0, p0, Ldq5$e;->k:Ldq5;

    invoke-virtual {v0}, Ldq5;->d()LsP5;

    move-result-object v0

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC43;

    invoke-static {v2, v3, v9, v10}, Lro6;->k(JJ)J

    move-result-wide v2

    iput-wide v7, p0, Ldq5$e;->j:J

    iput-wide v9, p0, Ldq5$e;->h:J

    iput v1, p0, Ldq5$e;->i:I

    move-wide v1, v2

    move-wide v3, v9

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, LC43;->a(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_6

    return-object v6

    :cond_6
    move-wide v2, v7

    :goto_2
    check-cast v0, Lro6;

    invoke-virtual {v0}, Lro6;->o()J

    move-result-wide v0

    invoke-static {v9, v10, v0, v1}, Lro6;->k(JJ)J

    move-result-wide v0

    invoke-static {v2, v3, v0, v1}, Lro6;->k(JJ)J

    move-result-wide v0

    invoke-static {v0, v1}, Lro6;->b(J)Lro6;

    move-result-object v0

    return-object v0
.end method
