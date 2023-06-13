.class public final Lw61$l$b;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw61$l;->b(LgV2;LEt0;I)LgV2;
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
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2"
    f = "Draggable.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x3,
        0x4,
        0x5
    }
    l = {
        0xef,
        0xf1,
        0xf3,
        0xfb,
        0xfd,
        0x101
    }
    m = "invokeSuspend"
    n = {
        "$this$LaunchedEffect",
        "event",
        "$this$LaunchedEffect",
        "event",
        "$this$LaunchedEffect",
        "event",
        "$this$LaunchedEffect",
        "$this$LaunchedEffect",
        "$this$LaunchedEffect"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$0",
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt$draggable$9$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,461:1\n1#2:462\n*E\n"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:I

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:LFh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LFh0<",
            "Lp61;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic m:Lx61;

.field public final synthetic n:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lu61;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic o:LEy3;


# direct methods
.method public constructor <init>(LFh0;Lx61;LsP5;LEy3;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LFh0<",
            "Lp61;",
            ">;",
            "Lx61;",
            "LsP5<",
            "Lu61;",
            ">;",
            "LEy3;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lw61$l$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lw61$l$b;->l:LFh0;

    iput-object p2, p0, Lw61$l$b;->m:Lx61;

    iput-object p3, p0, Lw61$l$b;->n:LsP5;

    iput-object p4, p0, Lw61$l$b;->o:LEy3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance v6, Lw61$l$b;

    iget-object v1, p0, Lw61$l$b;->l:LFh0;

    iget-object v2, p0, Lw61$l$b;->m:Lx61;

    iget-object v3, p0, Lw61$l$b;->n:LsP5;

    iget-object v4, p0, Lw61$l$b;->o:LEy3;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lw61$l$b;-><init>(LFh0;Lx61;LsP5;LEy3;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v6, Lw61$l$b;->k:Ljava/lang/Object;

    return-object v6
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

    invoke-virtual {p0, p1, p2}, Lw61$l$b;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lw61$l$b;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lw61$l$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lw61$l$b;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lw61$l$b;->j:I

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v1, p0, Lw61$l$b;->k:Ljava/lang/Object;

    check-cast v1, LZC0;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p1, v1

    goto :goto_1

    :pswitch_1
    iget-object v1, p0, Lw61$l$b;->k:Ljava/lang/Object;

    check-cast v1, LZC0;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :pswitch_2
    iget-object v1, p0, Lw61$l$b;->k:Ljava/lang/Object;

    check-cast v1, LZC0;

    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    move-object p1, p0

    goto/16 :goto_6

    :pswitch_3
    iget-object v1, p0, Lw61$l$b;->h:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, p0, Lw61$l$b;->k:Ljava/lang/Object;

    check-cast v3, LZC0;

    :try_start_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    move-object p1, p0

    goto/16 :goto_5

    :catch_0
    move-object v1, v3

    :catch_1
    move-object v3, p0

    goto/16 :goto_7

    :pswitch_4
    iget-object v1, p0, Lw61$l$b;->h:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, p0, Lw61$l$b;->k:Ljava/lang/Object;

    check-cast v3, LZC0;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, v3

    move-object v3, p0

    goto/16 :goto_4

    :pswitch_5
    iget-object v1, p0, Lw61$l$b;->i:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, p0, Lw61$l$b;->h:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v4, p0, Lw61$l$b;->k:Ljava/lang/Object;

    check-cast v4, LZC0;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v5, v3

    move-object v3, p0

    goto :goto_3

    :pswitch_6
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lw61$l$b;->k:Ljava/lang/Object;

    check-cast p1, LZC0;

    :goto_1
    move-object v1, p0

    :goto_2
    invoke-static {p1}, LaD0;->f(LZC0;)Z

    move-result v3

    if-eqz v3, :cond_8

    new-instance v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iget-object v4, v1, Lw61$l$b;->l:LFh0;

    iput-object p1, v1, Lw61$l$b;->k:Ljava/lang/Object;

    iput-object v3, v1, Lw61$l$b;->h:Ljava/lang/Object;

    iput-object v3, v1, Lw61$l$b;->i:Ljava/lang/Object;

    const/4 v5, 0x1

    iput v5, v1, Lw61$l$b;->j:I

    invoke-interface {v4, v1}, Lks4;->G(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_0

    return-object v0

    :cond_0
    move-object v5, v3

    move-object v3, v1

    move-object v1, v5

    move-object v9, v4

    move-object v4, p1

    move-object p1, v9

    :goto_3
    iput-object p1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iget-object p1, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    instance-of p1, p1, Lp61$c;

    if-eqz p1, :cond_7

    iget-object p1, v3, Lw61$l$b;->n:LsP5;

    invoke-static {p1}, Lw61$l;->a(LsP5;)Lu61;

    move-result-object p1

    iget-object v1, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    const-string v6, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStarted"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lp61$c;

    iput-object v4, v3, Lw61$l$b;->k:Ljava/lang/Object;

    iput-object v5, v3, Lw61$l$b;->h:Ljava/lang/Object;

    iput-object v2, v3, Lw61$l$b;->i:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, v3, Lw61$l$b;->j:I

    invoke-virtual {p1, v4, v1, v3}, Lu61;->b(LZC0;Lp61$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    return-object v0

    :cond_1
    move-object v1, v5

    :goto_4
    :try_start_3
    iget-object p1, v3, Lw61$l$b;->m:Lx61;

    sget-object v5, LOX2;->c:LOX2;

    new-instance v6, Lw61$l$b$a;

    iget-object v7, v3, Lw61$l$b;->l:LFh0;

    iget-object v8, v3, Lw61$l$b;->o:LEy3;

    invoke-direct {v6, v1, v7, v8, v2}, Lw61$l$b$a;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;LFh0;LEy3;Lkotlin/coroutines/Continuation;)V

    iput-object v4, v3, Lw61$l$b;->k:Ljava/lang/Object;

    iput-object v1, v3, Lw61$l$b;->h:Ljava/lang/Object;

    const/4 v7, 0x3

    iput v7, v3, Lw61$l$b;->j:I

    invoke-interface {p1, v5, v6, v3}, Lx61;->d(LOX2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_3

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object p1, v3

    move-object v3, v4

    :goto_5
    :try_start_4
    iget-object v4, p1, Lw61$l$b;->n:LsP5;

    invoke-static {v4}, Lw61$l;->a(LsP5;)Lu61;

    move-result-object v4

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    instance-of v5, v1, Lp61$d;

    if-eqz v5, :cond_4

    const-string v5, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lp61$d;

    iput-object v3, p1, Lw61$l$b;->k:Ljava/lang/Object;

    iput-object v2, p1, Lw61$l$b;->h:Ljava/lang/Object;

    const/4 v5, 0x4

    iput v5, p1, Lw61$l$b;->j:I

    invoke-virtual {v4, v3, v1, p1}, Lu61;->c(LZC0;Lp61$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v1, v3

    :goto_6
    move-object v9, v1

    move-object v1, p1

    move-object p1, v9

    goto/16 :goto_2

    :cond_4
    instance-of v1, v1, Lp61$a;

    if-eqz v1, :cond_5

    iput-object v3, p1, Lw61$l$b;->k:Ljava/lang/Object;

    iput-object v2, p1, Lw61$l$b;->h:Ljava/lang/Object;

    const/4 v1, 0x5

    iput v1, p1, Lw61$l$b;->j:I

    invoke-virtual {v4, v3, p1}, Lu61;->a(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_2

    if-ne v1, v0, :cond_3

    return-object v0

    :cond_5
    move-object v1, p1

    move-object p1, v3

    goto/16 :goto_2

    :catch_2
    move-object v1, v3

    move-object v3, p1

    goto :goto_7

    :catch_3
    move-object v1, v4

    :goto_7
    iget-object p1, v3, Lw61$l$b;->n:LsP5;

    invoke-static {p1}, Lw61$l;->a(LsP5;)Lu61;

    move-result-object p1

    iput-object v1, v3, Lw61$l$b;->k:Ljava/lang/Object;

    iput-object v2, v3, Lw61$l$b;->h:Ljava/lang/Object;

    const/4 v4, 0x6

    iput v4, v3, Lw61$l$b;->j:I

    invoke-virtual {p1, v1, v3}, Lu61;->a(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    move-object p1, v1

    move-object v1, v3

    goto/16 :goto_2

    :cond_7
    move-object v1, v3

    move-object p1, v4

    goto/16 :goto_2

    :cond_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

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
