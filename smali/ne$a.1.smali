.class public final Lne$a;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lne;->r(Lef;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljf<",
        "TT;TV;>;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0008\u0008\u0001\u0010\u0002*\u00020\u0001H\u008a@"
    }
    d2 = {
        "T",
        "Lvf;",
        "V",
        "Ljf;",
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
    c = "androidx.compose.animation.core.Animatable$runAnimation$2"
    f = "Animatable.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x131
    }
    m = "invokeSuspend"
    n = {
        "endState",
        "clampingNeeded"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:I

.field public final synthetic k:Lne;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne<",
            "TT;TV;>;"
        }
    .end annotation
.end field

.field public final synthetic l:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final synthetic m:Lef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lef<",
            "TT;TV;>;"
        }
    .end annotation
.end field

.field public final synthetic n:J

.field public final synthetic o:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lne<",
            "TT;TV;>;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lne;Ljava/lang/Object;Lef;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne<",
            "TT;TV;>;TT;",
            "Lef<",
            "TT;TV;>;J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lne<",
            "TT;TV;>;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lne$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lne$a;->k:Lne;

    iput-object p2, p0, Lne$a;->l:Ljava/lang/Object;

    iput-object p3, p0, Lne$a;->m:Lef;

    iput-wide p4, p0, Lne$a;->n:J

    iput-object p6, p0, Lne$a;->o:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v8, Lne$a;

    iget-object v1, p0, Lne$a;->k:Lne;

    iget-object v2, p0, Lne$a;->l:Ljava/lang/Object;

    iget-object v3, p0, Lne$a;->m:Lef;

    iget-wide v4, p0, Lne$a;->n:J

    iget-object v6, p0, Lne$a;->o:Lkotlin/jvm/functions/Function1;

    move-object v0, v8

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lne$a;-><init>(Lne;Ljava/lang/Object;Lef;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    return-object v8
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lne$a;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljf<",
            "TT;TV;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lne$a;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lne$a;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lne$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v7, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, v7, Lne$a;->j:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, v7, Lne$a;->i:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v1, v7, Lne$a;->h:Ljava/lang/Object;

    check-cast v1, Lnf;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    iget-object v1, v7, Lne$a;->k:Lne;

    invoke-virtual {v1}, Lne;->k()Lnf;

    move-result-object v1

    iget-object v3, v7, Lne$a;->k:Lne;

    invoke-virtual {v3}, Lne;->m()Lwb6;

    move-result-object v3

    invoke-interface {v3}, Lwb6;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v3

    iget-object v4, v7, Lne$a;->l:Ljava/lang/Object;

    invoke-interface {v3, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lvf;

    invoke-virtual {v1, v3}, Lnf;->o(Lvf;)V

    iget-object v1, v7, Lne$a;->k:Lne;

    iget-object v3, v7, Lne$a;->m:Lef;

    invoke-interface {v3}, Lef;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v3}, Lne;->d(Lne;Ljava/lang/Object;)V

    iget-object v1, v7, Lne$a;->k:Lne;

    invoke-static {v1, v2}, Lne;->c(Lne;Z)V

    iget-object v1, v7, Lne$a;->k:Lne;

    invoke-virtual {v1}, Lne;->k()Lnf;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/high16 v13, -0x8000000000000000L

    const/4 v15, 0x0

    const/16 v16, 0x17

    const/16 v17, 0x0

    invoke-static/range {v8 .. v17}, Lof;->f(Lnf;Ljava/lang/Object;Lvf;JJZILjava/lang/Object;)Lnf;

    move-result-object v8

    new-instance v9, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v9}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    iget-object v3, v7, Lne$a;->m:Lef;

    iget-wide v4, v7, Lne$a;->n:J

    new-instance v6, Lne$a$a;

    iget-object v1, v7, Lne$a;->k:Lne;

    iget-object v10, v7, Lne$a;->o:Lkotlin/jvm/functions/Function1;

    invoke-direct {v6, v1, v8, v10, v9}, Lne$a$a;-><init>(Lne;Lnf;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$BooleanRef;)V

    iput-object v8, v7, Lne$a;->h:Ljava/lang/Object;

    iput-object v9, v7, Lne$a;->i:Ljava/lang/Object;

    iput v2, v7, Lne$a;->j:I

    move-object v1, v8

    move-object v2, v3

    move-wide v3, v4

    move-object v5, v6

    move-object/from16 v6, p0

    invoke-static/range {v1 .. v6}, LuW5;->c(Lnf;Lef;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v1, v8

    move-object v0, v9

    :goto_0
    iget-boolean v0, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-eqz v0, :cond_3

    sget-object v0, Lff;->b:Lff;

    goto :goto_1

    :cond_3
    sget-object v0, Lff;->c:Lff;

    :goto_1
    iget-object v2, v7, Lne$a;->k:Lne;

    invoke-static {v2}, Lne;->b(Lne;)V

    new-instance v2, Ljf;

    invoke-direct {v2, v1, v0}, Ljf;-><init>(Lnf;Lff;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v2

    :catch_0
    move-exception v0

    iget-object v1, v7, Lne$a;->k:Lne;

    invoke-static {v1}, Lne;->b(Lne;)V

    throw v0
.end method
