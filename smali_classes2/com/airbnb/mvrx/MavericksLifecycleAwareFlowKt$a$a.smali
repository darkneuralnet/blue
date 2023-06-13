.class public final Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000*\u00020\u0001H\u008a@"
    }
    d2 = {
        "T",
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
    c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1"
    f = "MavericksLifecycleAwareFlow.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x65
    }
    m = "invokeSuspend"
    n = {
        "startedChannel",
        "flowChannel",
        "transform",
        "started",
        "flowValue",
        "isClosed"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:I

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:LLifecycleOwner;

.field public final synthetic p:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic q:LGu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGu1<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LLifecycleOwner;LEu1;LGu1;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLifecycleOwner;",
            "LEu1<",
            "+TT;>;",
            "LGu1<",
            "-TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->o:LLifecycleOwner;

    iput-object p2, p0, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->p:LEu1;

    iput-object p3, p0, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->q:LGu1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;

    iget-object v1, p0, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->o:LLifecycleOwner;

    iget-object v2, p0, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->p:LEu1;

    iget-object v3, p0, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->q:LGu1;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;-><init>(LLifecycleOwner;LEu1;LGu1;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->n:Ljava/lang/Object;

    return-object v0
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

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v2, v1, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->m:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v2, v1, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->l:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v5, v1, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->k:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v6, v1, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->j:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v7, v1, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->i:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/functions/Function3;

    iget-object v8, v1, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->h:Ljava/lang/Object;

    check-cast v8, Lks4;

    iget-object v9, v1, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->n:Ljava/lang/Object;

    check-cast v9, LFh0;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v11, v1

    move-object v10, v9

    move-object v9, v2

    move-object v2, v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, v1, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->n:Ljava/lang/Object;

    move-object v5, v2

    check-cast v5, LZC0;

    iget-object v2, v1, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->o:LLifecycleOwner;

    invoke-interface {v2}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v2

    const-string v6, "owner.lifecycle"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt;->a(Landroidx/lifecycle/f;)LFh0;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    new-instance v8, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a$c;

    iget-object v9, v1, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->p:LEu1;

    invoke-direct {v8, v9, v4}, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a$c;-><init>(LEu1;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lj74;->e(LZC0;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lks4;

    move-result-object v5

    new-instance v6, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a$f;

    iget-object v7, v1, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->q:LGu1;

    invoke-direct {v6, v7, v4}, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a$f;-><init>(LGu1;Lkotlin/coroutines/Continuation;)V

    new-instance v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v8, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v8}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v9, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v9}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    move-object v11, v1

    move-object v10, v2

    move-object v2, v0

    move-object v15, v8

    move-object v8, v5

    move-object v5, v15

    move-object/from16 v16, v7

    move-object v7, v6

    move-object/from16 v6, v16

    :cond_2
    :goto_0
    iget-boolean v0, v9, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-nez v0, :cond_4

    iput-object v10, v11, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->n:Ljava/lang/Object;

    iput-object v8, v11, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->h:Ljava/lang/Object;

    iput-object v7, v11, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->i:Ljava/lang/Object;

    iput-object v6, v11, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->j:Ljava/lang/Object;

    iput-object v5, v11, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->k:Ljava/lang/Object;

    iput-object v9, v11, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->l:Ljava/lang/Object;

    iput v3, v11, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a;->m:I

    new-instance v12, Lgr5;

    invoke-direct {v12, v11}, Lgr5;-><init>(Lkotlin/coroutines/Continuation;)V

    :try_start_0
    new-instance v0, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a$a;

    invoke-direct {v0, v6, v5, v7, v4}, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a$a;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)V

    invoke-interface {v10}, Lks4;->j()Lhr5;

    move-result-object v13

    new-instance v14, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a$d;

    invoke-direct {v14, v0, v4, v8, v9}, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a$d;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;Lks4;Lkotlin/jvm/internal/Ref$BooleanRef;)V

    invoke-interface {v12, v13, v14}, Lfr5;->k(Lhr5;Lkotlin/jvm/functions/Function2;)V

    new-instance v0, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a$b;

    invoke-direct {v0, v5, v6, v7, v4}, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a$b;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)V

    invoke-interface {v8}, Lks4;->j()Lhr5;

    move-result-object v13

    new-instance v14, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a$e;

    invoke-direct {v14, v0, v4, v9}, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a$a$e;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;Lkotlin/jvm/internal/Ref$BooleanRef;)V

    invoke-interface {v12, v13, v14}, Lfr5;->k(Lhr5;Lkotlin/jvm/functions/Function2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v12, v0}, Lgr5;->W(Ljava/lang/Throwable;)V

    :goto_1
    invoke-virtual {v12}, Lgr5;->V()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v12

    if-ne v0, v12, :cond_3

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_3
    if-ne v0, v2, :cond_2

    return-object v2

    :cond_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
