.class public final Lak0$i;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lak0;->i(LN14;JLrX2;LEX2;LsP5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2"
    f = "Clickable.kt"
    i = {
        0x0,
        0x1,
        0x2
    }
    l = {
        0x1bd,
        0x1bf,
        0x1c6,
        0x1c7,
        0x1d0
    }
    m = "invokeSuspend"
    n = {
        "delayJob",
        "success",
        "releaseInteraction"
    }
    s = {
        "L$0",
        "Z$0",
        "L$0"
    }
.end annotation


# instance fields
.field public h:Z

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:LN14;

.field public final synthetic l:J

.field public final synthetic m:LrX2;

.field public final synthetic n:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LQ14;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic o:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LN14;JLrX2;LEX2;LsP5;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LN14;",
            "J",
            "LrX2;",
            "LEX2<",
            "LQ14;",
            ">;",
            "LsP5<",
            "+",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lak0$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lak0$i;->k:LN14;

    iput-wide p2, p0, Lak0$i;->l:J

    iput-object p4, p0, Lak0$i;->m:LrX2;

    iput-object p5, p0, Lak0$i;->n:LEX2;

    iput-object p6, p0, Lak0$i;->o:LsP5;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
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

    new-instance v8, Lak0$i;

    iget-object v1, p0, Lak0$i;->k:LN14;

    iget-wide v2, p0, Lak0$i;->l:J

    iget-object v4, p0, Lak0$i;->m:LrX2;

    iget-object v5, p0, Lak0$i;->n:LEX2;

    iget-object v6, p0, Lak0$i;->o:LsP5;

    move-object v0, v8

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lak0$i;-><init>(LN14;JLrX2;LEX2;LsP5;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v8, Lak0$i;->j:Ljava/lang/Object;

    return-object v8
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

    invoke-virtual {p0, p1, p2}, Lak0$i;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lak0$i;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lak0$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lak0$i;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lak0$i;->i:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    iget-object v2, v0, Lak0$i;->j:Ljava/lang/Object;

    check-cast v2, LR14;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    iget-boolean v2, v0, Lak0$i;->h:Z

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-object v2, v0, Lak0$i;->j:Ljava/lang/Object;

    check-cast v2, Lzh2;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_1

    :cond_5
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, v0, Lak0$i;->j:Ljava/lang/Object;

    move-object v9, v2

    check-cast v9, LZC0;

    const/4 v10, 0x0

    const/4 v11, 0x0

    new-instance v2, Lak0$i$a;

    iget-object v13, v0, Lak0$i;->o:LsP5;

    iget-wide v14, v0, Lak0$i;->l:J

    iget-object v12, v0, Lak0$i;->m:LrX2;

    iget-object v3, v0, Lak0$i;->n:LEX2;

    const/16 v18, 0x0

    move-object/from16 v16, v12

    move-object v12, v2

    move-object/from16 v17, v3

    invoke-direct/range {v12 .. v18}, Lak0$i$a;-><init>(LsP5;JLrX2;LEX2;Lkotlin/coroutines/Continuation;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    invoke-static/range {v9 .. v14}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-result-object v2

    iget-object v3, v0, Lak0$i;->k:LN14;

    iput-object v2, v0, Lak0$i;->j:Ljava/lang/Object;

    iput v7, v0, Lak0$i;->i:I

    invoke-interface {v3, v0}, LN14;->H0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_6

    return-object v1

    :cond_6
    :goto_1
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-interface {v2}, Lzh2;->b()Z

    move-result v7

    if-eqz v7, :cond_9

    iput-object v8, v0, Lak0$i;->j:Ljava/lang/Object;

    iput-boolean v3, v0, Lak0$i;->h:Z

    iput v6, v0, Lak0$i;->i:I

    invoke-static {v2, v0}, LKh2;->g(Lzh2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    return-object v1

    :cond_7
    move v2, v3

    :goto_2
    if-eqz v2, :cond_b

    new-instance v2, LQ14;

    iget-wide v6, v0, Lak0$i;->l:J

    invoke-direct {v2, v6, v7, v8}, LQ14;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, LR14;

    invoke-direct {v3, v2}, LR14;-><init>(LQ14;)V

    iget-object v6, v0, Lak0$i;->m:LrX2;

    iput-object v3, v0, Lak0$i;->j:Ljava/lang/Object;

    iput v5, v0, Lak0$i;->i:I

    invoke-interface {v6, v2, v0}, LrX2;->c(Ld62;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    return-object v1

    :cond_8
    move-object v2, v3

    :goto_3
    iget-object v3, v0, Lak0$i;->m:LrX2;

    iput-object v8, v0, Lak0$i;->j:Ljava/lang/Object;

    iput v4, v0, Lak0$i;->i:I

    invoke-interface {v3, v2, v0}, LrX2;->c(Ld62;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_b

    return-object v1

    :cond_9
    iget-object v2, v0, Lak0$i;->n:LEX2;

    invoke-interface {v2}, LEX2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LQ14;

    if-eqz v2, :cond_b

    iget-object v4, v0, Lak0$i;->m:LrX2;

    if-eqz v3, :cond_a

    new-instance v3, LR14;

    invoke-direct {v3, v2}, LR14;-><init>(LQ14;)V

    goto :goto_4

    :cond_a
    new-instance v3, LP14;

    invoke-direct {v3, v2}, LP14;-><init>(LQ14;)V

    :goto_4
    iput-object v8, v0, Lak0$i;->j:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, v0, Lak0$i;->i:I

    invoke-interface {v4, v3, v0}, LrX2;->c(Ld62;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_b

    return-object v1

    :cond_b
    :goto_5
    iget-object v1, v0, Lak0$i;->n:LEX2;

    invoke-interface {v1, v8}, LEX2;->setValue(Ljava/lang/Object;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method
