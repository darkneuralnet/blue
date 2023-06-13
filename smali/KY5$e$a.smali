.class public final LKY5$e$a;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKY5$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1"
    f = "TapGestureDetector.kt"
    i = {
        0x0
    }
    l = {
        0xed,
        0xf5
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitEachGesture"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1#2:377\n*E\n"
    }
.end annotation


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:LZC0;

.field public final synthetic k:Lkotlin/jvm/functions/Function3;
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

.field public final synthetic l:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LCe3;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic m:LO14;


# direct methods
.method public constructor <init>(LZC0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;LO14;Lkotlin/coroutines/Continuation;)V
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
            "LO14;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LKY5$e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LKY5$e$a;->j:LZC0;

    iput-object p2, p0, LKY5$e$a;->k:Lkotlin/jvm/functions/Function3;

    iput-object p3, p0, LKY5$e$a;->l:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, LKY5$e$a;->m:LO14;

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

    new-instance v6, LKY5$e$a;

    iget-object v1, p0, LKY5$e$a;->j:LZC0;

    iget-object v2, p0, LKY5$e$a;->k:Lkotlin/jvm/functions/Function3;

    iget-object v3, p0, LKY5$e$a;->l:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, LKY5$e$a;->m:LO14;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LKY5$e$a;-><init>(LZC0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;LO14;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v6, LKY5$e$a;->i:Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LKY5$e$a;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, LKY5$e$a;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, LKY5$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWu;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, LKY5$e$a;->e(LWu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v6, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v7

    iget v0, v6, LKY5$e$a;->h:I

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v0, :cond_2

    if-eq v0, v9, :cond_1

    if-ne v0, v8, :cond_0

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v6, LKY5$e$a;->i:Ljava/lang/Object;

    check-cast v0, LWu;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v11, v0

    move-object/from16 v0, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v0, v6, LKY5$e$a;->i:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, LWu;

    iget-object v0, v6, LKY5$e$a;->j:LZC0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, LKY5$e$a$a;

    iget-object v4, v6, LKY5$e$a;->m:LO14;

    invoke-direct {v3, v4, v10}, LKY5$e$a$a;-><init>(LO14;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    const/4 v1, 0x0

    iput-object v11, v6, LKY5$e$a;->i:Ljava/lang/Object;

    iput v9, v6, LKY5$e$a;->h:I

    move-object v0, v11

    move-object/from16 v3, p0

    invoke-static/range {v0 .. v5}, LKY5;->e(LWu;ZLaX3;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_3

    return-object v7

    :cond_3
    :goto_0
    check-cast v0, LjX3;

    invoke-virtual {v0}, LjX3;->a()V

    iget-object v1, v6, LKY5$e$a;->k:Lkotlin/jvm/functions/Function3;

    invoke-static {}, LKY5;->c()Lkotlin/jvm/functions/Function3;

    move-result-object v2

    if-eq v1, v2, :cond_4

    iget-object v12, v6, LKY5$e$a;->j:LZC0;

    const/4 v13, 0x0

    const/4 v14, 0x0

    new-instance v15, LKY5$e$a$b;

    iget-object v1, v6, LKY5$e$a;->k:Lkotlin/jvm/functions/Function3;

    iget-object v2, v6, LKY5$e$a;->m:LO14;

    invoke-direct {v15, v1, v2, v0, v10}, LKY5$e$a$b;-><init>(Lkotlin/jvm/functions/Function3;LO14;LjX3;Lkotlin/coroutines/Continuation;)V

    const/16 v16, 0x3

    const/16 v17, 0x0

    invoke-static/range {v12 .. v17}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :cond_4
    iput-object v10, v6, LKY5$e$a;->i:Ljava/lang/Object;

    iput v8, v6, LKY5$e$a;->h:I

    invoke-static {v11, v10, v6, v9, v10}, LKY5;->l(LWu;LaX3;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_5

    return-object v7

    :cond_5
    :goto_1
    check-cast v0, LjX3;

    if-nez v0, :cond_6

    iget-object v11, v6, LKY5$e$a;->j:LZC0;

    const/4 v12, 0x0

    const/4 v13, 0x0

    new-instance v14, LKY5$e$a$c;

    iget-object v0, v6, LKY5$e$a;->m:LO14;

    invoke-direct {v14, v0, v10}, LKY5$e$a$c;-><init>(LO14;Lkotlin/coroutines/Continuation;)V

    const/4 v15, 0x3

    const/16 v16, 0x0

    invoke-static/range {v11 .. v16}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    goto :goto_2

    :cond_6
    invoke-virtual {v0}, LjX3;->a()V

    iget-object v1, v6, LKY5$e$a;->j:LZC0;

    const/16 v18, 0x0

    const/16 v19, 0x0

    new-instance v2, LKY5$e$a$d;

    iget-object v3, v6, LKY5$e$a;->m:LO14;

    invoke-direct {v2, v3, v10}, LKY5$e$a$d;-><init>(LO14;Lkotlin/coroutines/Continuation;)V

    const/16 v21, 0x3

    const/16 v22, 0x0

    move-object/from16 v17, v1

    move-object/from16 v20, v2

    invoke-static/range {v17 .. v22}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    iget-object v1, v6, LKY5$e$a;->l:Lkotlin/jvm/functions/Function1;

    if-eqz v1, :cond_7

    invoke-virtual {v0}, LjX3;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, LCe3;->d(J)LCe3;

    move-result-object v0

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    :goto_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
