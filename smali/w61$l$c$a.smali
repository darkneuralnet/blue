.class public final Lw61$l$c$a;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw61$l$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1"
    f = "Draggable.kt"
    i = {
        0x0
    }
    l = {
        0x109
    }
    m = "invokeSuspend"
    n = {
        "$this$coroutineScope"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:LtX3;

.field public final synthetic k:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lkotlin/jvm/functions/Function1<",
            "LjX3;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic l:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic m:LEy3;

.field public final synthetic n:LFh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LFh0<",
            "Lp61;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic o:Z


# direct methods
.method public constructor <init>(LtX3;LsP5;LsP5;LEy3;LFh0;ZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LtX3;",
            "LsP5<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LjX3;",
            "Ljava/lang/Boolean;",
            ">;>;",
            "LsP5<",
            "+",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;>;",
            "LEy3;",
            "LFh0<",
            "Lp61;",
            ">;Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lw61$l$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lw61$l$c$a;->j:LtX3;

    iput-object p2, p0, Lw61$l$c$a;->k:LsP5;

    iput-object p3, p0, Lw61$l$c$a;->l:LsP5;

    iput-object p4, p0, Lw61$l$c$a;->m:LEy3;

    iput-object p5, p0, Lw61$l$c$a;->n:LFh0;

    iput-boolean p6, p0, Lw61$l$c$a;->o:Z

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

    new-instance v8, Lw61$l$c$a;

    iget-object v1, p0, Lw61$l$c$a;->j:LtX3;

    iget-object v2, p0, Lw61$l$c$a;->k:LsP5;

    iget-object v3, p0, Lw61$l$c$a;->l:LsP5;

    iget-object v4, p0, Lw61$l$c$a;->m:LEy3;

    iget-object v5, p0, Lw61$l$c$a;->n:LFh0;

    iget-boolean v6, p0, Lw61$l$c$a;->o:Z

    move-object v0, v8

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lw61$l$c$a;-><init>(LtX3;LsP5;LsP5;LEy3;LFh0;ZLkotlin/coroutines/Continuation;)V

    iput-object p1, v8, Lw61$l$c$a;->i:Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lw61$l$c$a;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lw61$l$c$a;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lw61$l$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lw61$l$c$a;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lw61$l$c$a;->h:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lw61$l$c$a;->i:Ljava/lang/Object;

    check-cast v0, LZC0;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lw61$l$c$a;->i:Ljava/lang/Object;

    check-cast p1, LZC0;

    :try_start_1
    iget-object v1, p0, Lw61$l$c$a;->j:LtX3;

    new-instance v11, Lw61$l$c$a$a;

    iget-object v5, p0, Lw61$l$c$a;->k:LsP5;

    iget-object v6, p0, Lw61$l$c$a;->l:LsP5;

    iget-object v7, p0, Lw61$l$c$a;->m:LEy3;

    iget-object v8, p0, Lw61$l$c$a;->n:LFh0;

    iget-boolean v9, p0, Lw61$l$c$a;->o:Z

    const/4 v10, 0x0

    move-object v3, v11

    move-object v4, p1

    invoke-direct/range {v3 .. v10}, Lw61$l$c$a$a;-><init>(LZC0;LsP5;LsP5;LEy3;LFh0;ZLkotlin/coroutines/Continuation;)V

    iput-object p1, p0, Lw61$l$c$a;->i:Ljava/lang/Object;

    iput v2, p0, Lw61$l$c$a;->h:I

    invoke-interface {v1, v11, p0}, LtX3;->v0(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v0, :cond_2

    return-object v0

    :catch_1
    move-exception v0

    move-object v12, v0

    move-object v0, p1

    move-object p1, v12

    :goto_0
    invoke-static {v0}, LaD0;->f(LZC0;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_3
    throw p1
.end method
