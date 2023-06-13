.class public final LpF5$e;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LpF5;->c(LsE5;J)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "TT;",
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"
    }
    d2 = {
        "LjI5;",
        "T",
        "event",
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
    c = "co.bird.android.smartlock.impl.SmartLockManagerImpl$connect$eventJob$1"
    f = "SmartLockManagerImpl.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:LpF5;

.field public final synthetic k:LsE5;


# direct methods
.method public constructor <init>(LpF5;LsE5;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LpF5;",
            "LsE5;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LpF5$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LpF5$e;->j:LpF5;

    iput-object p2, p0, LpF5$e;->k:LsE5;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance v0, LpF5$e;

    iget-object v1, p0, LpF5$e;->j:LpF5;

    iget-object v2, p0, LpF5$e;->k:LsE5;

    invoke-direct {v0, v1, v2, p2}, LpF5$e;-><init>(LpF5;LsE5;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, LpF5$e;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public final e(LjI5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LpF5$e;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, LpF5$e;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, LpF5$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LjI5;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, LpF5$e;->e(LjI5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, LpF5$e;->h:I

    if-nez v0, :cond_d

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, LpF5$e;->i:Ljava/lang/Object;

    check-cast p1, LjI5;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "received smartlock event from ble manager: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    instance-of v0, p1, LCJ5;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_5

    check-cast p1, LCJ5;

    invoke-virtual {p1}, LCJ5;->c()LFJ5;

    move-result-object v0

    sget-object v4, LFJ5;->d:LFJ5;

    if-ne v0, v4, :cond_0

    sget-object v2, LwE5;->i:LwE5;

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p1}, LCJ5;->c()LFJ5;

    move-result-object v0

    sget-object v4, LFJ5;->o:LFJ5;

    if-ne v0, v4, :cond_1

    sget-object v2, LwE5;->l:LwE5;

    goto/16 :goto_4

    :cond_1
    invoke-virtual {p1}, LCJ5;->c()LFJ5;

    move-result-object v0

    sget-object v4, LFJ5;->j:LFJ5;

    if-ne v0, v4, :cond_3

    invoke-virtual {p1}, LCJ5;->g()LIJ5;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LIJ5;->b()Z

    move-result v0

    if-ne v0, v3, :cond_2

    move v0, v3

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    if-eqz v0, :cond_3

    sget-object v2, LwE5;->j:LwE5;

    goto/16 :goto_4

    :cond_3
    invoke-virtual {p1}, LCJ5;->c()LFJ5;

    move-result-object v0

    sget-object v4, LFJ5;->l:LFJ5;

    if-ne v0, v4, :cond_b

    invoke-virtual {p1}, LCJ5;->d()LEJ5;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, LEJ5;->b()Z

    move-result p1

    if-ne p1, v3, :cond_4

    goto :goto_1

    :cond_4
    move v3, v1

    :goto_1
    if-eqz v3, :cond_b

    sget-object v2, LwE5;->k:LwE5;

    goto :goto_4

    :cond_5
    instance-of v0, p1, LwK5;

    if-eqz v0, :cond_b

    check-cast p1, LwK5;

    invoke-virtual {p1}, LwK5;->c()LzK5;

    move-result-object v0

    sget-object v4, LzK5;->d:LzK5;

    if-ne v0, v4, :cond_6

    sget-object v2, LwE5;->i:LwE5;

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, LwK5;->c()LzK5;

    move-result-object v0

    sget-object v4, LzK5;->o:LzK5;

    if-ne v0, v4, :cond_7

    sget-object v2, LwE5;->l:LwE5;

    goto :goto_4

    :cond_7
    invoke-virtual {p1}, LwK5;->c()LzK5;

    move-result-object v0

    sget-object v4, LzK5;->j:LzK5;

    if-ne v0, v4, :cond_9

    invoke-virtual {p1}, LwK5;->g()LCK5;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, LCK5;->b()Z

    move-result v0

    if-ne v0, v3, :cond_8

    move v0, v3

    goto :goto_2

    :cond_8
    move v0, v1

    :goto_2
    if-eqz v0, :cond_9

    sget-object v2, LwE5;->j:LwE5;

    goto :goto_4

    :cond_9
    invoke-virtual {p1}, LwK5;->c()LzK5;

    move-result-object v0

    sget-object v4, LzK5;->l:LzK5;

    if-ne v0, v4, :cond_b

    invoke-virtual {p1}, LwK5;->d()LyK5;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p1}, LyK5;->b()Z

    move-result p1

    if-ne p1, v3, :cond_a

    goto :goto_3

    :cond_a
    move v3, v1

    :goto_3
    if-eqz v3, :cond_b

    sget-object v2, LwE5;->k:LwE5;

    :cond_b
    :goto_4
    if-eqz v2, :cond_c

    iget-object p1, p0, LpF5$e;->j:LpF5;

    iget-object v0, p0, LpF5$e;->k:LsE5;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setting smartlock event to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v3, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1, v0, v2}, LpF5;->a(LsE5;LwE5;)V

    :cond_c
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
