.class public final LKY5$f$a;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKY5$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "LWu;",
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
    c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1"
    f = "TapGestureDetector.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4
    }
    l = {
        0x64,
        0x72,
        0x81,
        0x8d,
        0x9c,
        0xb2
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitEachGesture",
        "$this$awaitEachGesture",
        "down",
        "upOrCancel",
        "longPressTimeout",
        "$this$awaitEachGesture",
        "upOrCancel",
        "longPressTimeout",
        "$this$awaitEachGesture",
        "upOrCancel",
        "longPressTimeout",
        "$this$awaitEachGesture",
        "upOrCancel",
        "secondDown"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$2",
        "J$0",
        "L$0",
        "L$1",
        "J$0",
        "L$0",
        "L$1",
        "J$0",
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:J

.field public l:I

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:LZC0;

.field public final synthetic o:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "LN14;",
            "LCe3;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic p:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LCe3;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic q:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LCe3;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic r:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LCe3;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic s:LO14;


# direct methods
.method public constructor <init>(LZC0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LO14;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LN14;",
            "-",
            "LCe3;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LCe3;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LCe3;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LCe3;",
            "Lkotlin/Unit;",
            ">;",
            "LO14;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LKY5$f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LKY5$f$a;->n:LZC0;

    iput-object p2, p0, LKY5$f$a;->o:Lkotlin/jvm/functions/Function3;

    iput-object p3, p0, LKY5$f$a;->p:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, LKY5$f$a;->q:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, LKY5$f$a;->r:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, LKY5$f$a;->s:LO14;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance v8, LKY5$f$a;

    iget-object v1, p0, LKY5$f$a;->n:LZC0;

    iget-object v2, p0, LKY5$f$a;->o:Lkotlin/jvm/functions/Function3;

    iget-object v3, p0, LKY5$f$a;->p:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, LKY5$f$a;->q:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, LKY5$f$a;->r:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, LKY5$f$a;->s:LO14;

    move-object v0, v8

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, LKY5$f$a;-><init>(LZC0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LO14;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v8, LKY5$f$a;->m:Ljava/lang/Object;

    return-object v8
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

    invoke-virtual {p0, p1, p2}, LKY5$f$a;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, LKY5$f$a;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, LKY5$f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWu;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, LKY5$f$a;->e(LWu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v6, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v7

    iget v0, v6, LKY5$f$a;->l:I

    const/4 v8, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_1
    iget-object v0, v6, LKY5$f$a;->i:Ljava/lang/Object;

    check-cast v0, LjX3;

    iget-object v1, v6, LKY5$f$a;->h:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, v6, LKY5$f$a;->m:Ljava/lang/Object;

    check-cast v2, LWu;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_4

    goto/16 :goto_8

    :pswitch_2
    iget-wide v0, v6, LKY5$f$a;->k:J

    iget-object v2, v6, LKY5$f$a;->h:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, v6, LKY5$f$a;->m:Ljava/lang/Object;

    check-cast v3, LWu;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, v2

    move-object/from16 v2, p1

    goto/16 :goto_6

    :pswitch_3
    iget-wide v0, v6, LKY5$f$a;->k:J

    iget-object v2, v6, LKY5$f$a;->h:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, v6, LKY5$f$a;->m:Ljava/lang/Object;

    check-cast v3, LWu;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_4
    iget-wide v0, v6, LKY5$f$a;->k:J

    iget-object v2, v6, LKY5$f$a;->j:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, v6, LKY5$f$a;->i:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v4, v6, LKY5$f$a;->h:Ljava/lang/Object;

    check-cast v4, LjX3;

    iget-object v5, v6, LKY5$f$a;->m:Ljava/lang/Object;

    check-cast v5, LWu;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v9, v5

    move-object v5, v4

    move-object v4, v3

    move-object/from16 v3, p1

    goto/16 :goto_2

    :catch_0
    move-object v2, v3

    :catch_1
    move-object v3, v5

    goto/16 :goto_3

    :pswitch_5
    iget-object v0, v6, LKY5$f$a;->m:Ljava/lang/Object;

    check-cast v0, LWu;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v5, v0

    move-object/from16 v0, p1

    goto :goto_0

    :pswitch_6
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v0, v6, LKY5$f$a;->m:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, LWu;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x0

    iput-object v9, v6, LKY5$f$a;->m:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, v6, LKY5$f$a;->l:I

    move-object v0, v9

    move-object/from16 v3, p0

    invoke-static/range {v0 .. v5}, LKY5;->e(LWu;ZLaX3;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_0

    return-object v7

    :cond_0
    move-object v5, v9

    :goto_0
    move-object v4, v0

    check-cast v4, LjX3;

    invoke-virtual {v4}, LjX3;->a()V

    iget-object v9, v6, LKY5$f$a;->n:LZC0;

    const/4 v10, 0x0

    const/4 v11, 0x0

    new-instance v12, LKY5$f$a$b;

    iget-object v0, v6, LKY5$f$a;->s:LO14;

    invoke-direct {v12, v0, v8}, LKY5$f$a$b;-><init>(LO14;Lkotlin/coroutines/Continuation;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    invoke-static/range {v9 .. v14}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    iget-object v0, v6, LKY5$f$a;->o:Lkotlin/jvm/functions/Function3;

    invoke-static {}, LKY5;->c()Lkotlin/jvm/functions/Function3;

    move-result-object v1

    if-eq v0, v1, :cond_1

    iget-object v9, v6, LKY5$f$a;->n:LZC0;

    const/4 v10, 0x0

    const/4 v11, 0x0

    new-instance v12, LKY5$f$a$c;

    iget-object v0, v6, LKY5$f$a;->o:Lkotlin/jvm/functions/Function3;

    iget-object v1, v6, LKY5$f$a;->s:LO14;

    invoke-direct {v12, v0, v1, v4, v8}, LKY5$f$a$c;-><init>(Lkotlin/jvm/functions/Function3;LO14;LjX3;Lkotlin/coroutines/Continuation;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    invoke-static/range {v9 .. v14}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :cond_1
    iget-object v0, v6, LKY5$f$a;->p:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_2

    invoke-interface {v5}, LWu;->s()LJq6;

    move-result-object v0

    invoke-interface {v0}, LJq6;->d()J

    move-result-wide v0

    goto :goto_1

    :cond_2
    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    :goto_1
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    :try_start_2
    new-instance v3, LKY5$f$a$d;

    invoke-direct {v3, v8}, LKY5$f$a$d;-><init>(Lkotlin/coroutines/Continuation;)V

    iput-object v5, v6, LKY5$f$a;->m:Ljava/lang/Object;

    iput-object v4, v6, LKY5$f$a;->h:Ljava/lang/Object;

    iput-object v2, v6, LKY5$f$a;->i:Ljava/lang/Object;

    iput-object v2, v6, LKY5$f$a;->j:Ljava/lang/Object;

    iput-wide v0, v6, LKY5$f$a;->k:J

    const/4 v9, 0x2

    iput v9, v6, LKY5$f$a;->l:I

    invoke-interface {v5, v0, v1, v3, v6}, LWu;->Q(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3
    :try_end_2
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_2 .. :try_end_2} :catch_1

    if-ne v3, v7, :cond_3

    return-object v7

    :cond_3
    move-object v9, v5

    move-object v5, v4

    move-object v4, v2

    :goto_2
    :try_start_3
    iput-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iget-object v2, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-nez v2, :cond_4

    iget-object v10, v6, LKY5$f$a;->n:LZC0;

    const/4 v11, 0x0

    const/4 v12, 0x0

    new-instance v13, LKY5$f$a$e;

    iget-object v2, v6, LKY5$f$a;->s:LO14;

    invoke-direct {v13, v2, v8}, LKY5$f$a$e;-><init>(LO14;Lkotlin/coroutines/Continuation;)V

    const/4 v14, 0x3

    const/4 v15, 0x0

    invoke-static/range {v10 .. v15}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    goto :goto_5

    :cond_4
    check-cast v2, LjX3;

    invoke-virtual {v2}, LjX3;->a()V

    iget-object v10, v6, LKY5$f$a;->n:LZC0;

    const/4 v11, 0x0

    const/4 v12, 0x0

    new-instance v13, LKY5$f$a$f;

    iget-object v2, v6, LKY5$f$a;->s:LO14;

    invoke-direct {v13, v2, v8}, LKY5$f$a$f;-><init>(LO14;Lkotlin/coroutines/Continuation;)V

    const/4 v14, 0x3

    const/4 v15, 0x0

    invoke-static/range {v10 .. v15}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;
    :try_end_3
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_5

    :catch_2
    move-object v2, v4

    move-object v4, v5

    move-object v3, v9

    :goto_3
    iget-object v5, v6, LKY5$f$a;->p:Lkotlin/jvm/functions/Function1;

    if-eqz v5, :cond_5

    invoke-virtual {v4}, LjX3;->f()J

    move-result-wide v9

    invoke-static {v9, v10}, LCe3;->d(J)LCe3;

    move-result-object v4

    invoke-interface {v5, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iput-object v3, v6, LKY5$f$a;->m:Ljava/lang/Object;

    iput-object v2, v6, LKY5$f$a;->h:Ljava/lang/Object;

    iput-object v8, v6, LKY5$f$a;->i:Ljava/lang/Object;

    iput-object v8, v6, LKY5$f$a;->j:Ljava/lang/Object;

    iput-wide v0, v6, LKY5$f$a;->k:J

    const/4 v4, 0x3

    iput v4, v6, LKY5$f$a;->l:I

    invoke-static {v3, v6}, LKY5;->b(LWu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v7, :cond_6

    return-object v7

    :cond_6
    :goto_4
    iget-object v9, v6, LKY5$f$a;->n:LZC0;

    const/4 v10, 0x0

    const/4 v11, 0x0

    new-instance v12, LKY5$f$a$g;

    iget-object v4, v6, LKY5$f$a;->s:LO14;

    invoke-direct {v12, v4, v8}, LKY5$f$a$g;-><init>(LO14;Lkotlin/coroutines/Continuation;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    invoke-static/range {v9 .. v14}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-object v4, v2

    move-object v9, v3

    :goto_5
    iget-object v2, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-eqz v2, :cond_e

    iget-object v3, v6, LKY5$f$a;->q:Lkotlin/jvm/functions/Function1;

    if-nez v3, :cond_7

    iget-object v0, v6, LKY5$f$a;->r:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_e

    check-cast v2, LjX3;

    invoke-virtual {v2}, LjX3;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, LCe3;->d(J)LCe3;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_8

    :cond_7
    check-cast v2, LjX3;

    iput-object v9, v6, LKY5$f$a;->m:Ljava/lang/Object;

    iput-object v4, v6, LKY5$f$a;->h:Ljava/lang/Object;

    iput-object v8, v6, LKY5$f$a;->i:Ljava/lang/Object;

    iput-object v8, v6, LKY5$f$a;->j:Ljava/lang/Object;

    iput-wide v0, v6, LKY5$f$a;->k:J

    const/4 v3, 0x4

    iput v3, v6, LKY5$f$a;->l:I

    invoke-static {v9, v2, v6}, LKY5;->a(LWu;LjX3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_8

    return-object v7

    :cond_8
    move-object v3, v9

    :goto_6
    check-cast v2, LjX3;

    if-nez v2, :cond_9

    iget-object v0, v6, LKY5$f$a;->r:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_e

    iget-object v1, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, LjX3;

    invoke-virtual {v1}, LjX3;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, LCe3;->d(J)LCe3;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_8

    :cond_9
    iget-object v9, v6, LKY5$f$a;->n:LZC0;

    const/4 v10, 0x0

    const/4 v11, 0x0

    new-instance v12, LKY5$f$a$h;

    iget-object v5, v6, LKY5$f$a;->s:LO14;

    invoke-direct {v12, v5, v8}, LKY5$f$a$h;-><init>(LO14;Lkotlin/coroutines/Continuation;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    invoke-static/range {v9 .. v14}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    iget-object v5, v6, LKY5$f$a;->o:Lkotlin/jvm/functions/Function3;

    invoke-static {}, LKY5;->c()Lkotlin/jvm/functions/Function3;

    move-result-object v9

    if-eq v5, v9, :cond_a

    iget-object v10, v6, LKY5$f$a;->n:LZC0;

    const/4 v11, 0x0

    const/4 v12, 0x0

    new-instance v13, LKY5$f$a$i;

    iget-object v5, v6, LKY5$f$a;->o:Lkotlin/jvm/functions/Function3;

    iget-object v9, v6, LKY5$f$a;->s:LO14;

    invoke-direct {v13, v5, v9, v2, v8}, LKY5$f$a$i;-><init>(Lkotlin/jvm/functions/Function3;LO14;LjX3;Lkotlin/coroutines/Continuation;)V

    const/4 v14, 0x3

    const/4 v15, 0x0

    invoke-static/range {v10 .. v15}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :cond_a
    :try_start_4
    new-instance v5, LKY5$f$a$j;

    iget-object v10, v6, LKY5$f$a;->n:LZC0;

    iget-object v11, v6, LKY5$f$a;->q:Lkotlin/jvm/functions/Function1;

    iget-object v12, v6, LKY5$f$a;->r:Lkotlin/jvm/functions/Function1;

    iget-object v14, v6, LKY5$f$a;->s:LO14;

    const/4 v15, 0x0

    move-object v9, v5

    move-object v13, v4

    invoke-direct/range {v9 .. v15}, LKY5$f$a$j;-><init>(LZC0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$ObjectRef;LO14;Lkotlin/coroutines/Continuation;)V

    iput-object v3, v6, LKY5$f$a;->m:Ljava/lang/Object;

    iput-object v4, v6, LKY5$f$a;->h:Ljava/lang/Object;

    iput-object v2, v6, LKY5$f$a;->i:Ljava/lang/Object;

    const/4 v9, 0x5

    iput v9, v6, LKY5$f$a;->l:I

    invoke-interface {v3, v0, v1, v5, v6}, LWu;->Q(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_4 .. :try_end_4} :catch_3

    if-ne v0, v7, :cond_e

    return-object v7

    :catch_3
    move-object v0, v2

    move-object v2, v3

    move-object v1, v4

    :catch_4
    iget-object v3, v6, LKY5$f$a;->r:Lkotlin/jvm/functions/Function1;

    if-eqz v3, :cond_b

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, LjX3;

    invoke-virtual {v1}, LjX3;->f()J

    move-result-wide v4

    invoke-static {v4, v5}, LCe3;->d(J)LCe3;

    move-result-object v1

    invoke-interface {v3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    iget-object v1, v6, LKY5$f$a;->p:Lkotlin/jvm/functions/Function1;

    if-eqz v1, :cond_c

    invoke-virtual {v0}, LjX3;->f()J

    move-result-wide v3

    invoke-static {v3, v4}, LCe3;->d(J)LCe3;

    move-result-object v0

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    iput-object v8, v6, LKY5$f$a;->m:Ljava/lang/Object;

    iput-object v8, v6, LKY5$f$a;->h:Ljava/lang/Object;

    iput-object v8, v6, LKY5$f$a;->i:Ljava/lang/Object;

    const/4 v0, 0x6

    iput v0, v6, LKY5$f$a;->l:I

    invoke-static {v2, v6}, LKY5;->b(LWu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_d

    return-object v7

    :cond_d
    :goto_7
    iget-object v9, v6, LKY5$f$a;->n:LZC0;

    const/4 v10, 0x0

    const/4 v11, 0x0

    new-instance v12, LKY5$f$a$a;

    iget-object v0, v6, LKY5$f$a;->s:LO14;

    invoke-direct {v12, v0, v8}, LKY5$f$a$a;-><init>(LO14;Lkotlin/coroutines/Continuation;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    invoke-static/range {v9 .. v14}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :cond_e
    :goto_8
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
