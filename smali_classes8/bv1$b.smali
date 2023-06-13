.class public final Lbv1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbv1;->d(LEu1;Lkotlin/jvm/functions/Function3;)LEu1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LEu1<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0007"
    }
    d2 = {
        "bv1$b",
        "LEu1;",
        "LGu1;",
        "collector",
        "",
        "collect",
        "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:LEu1;

.field public final synthetic c:Lkotlin/jvm/functions/Function3;


# direct methods
.method public constructor <init>(LEu1;Lkotlin/jvm/functions/Function3;)V
    .locals 0

    iput-object p1, p0, Lbv1$b;->b:LEu1;

    iput-object p2, p0, Lbv1$b;->c:Lkotlin/jvm/functions/Function3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGu1<",
            "-TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lbv1$b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lbv1$b$a;

    iget v1, v0, Lbv1$b$a;->i:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbv1$b$a;->i:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbv1$b$a;

    invoke-direct {v0, p0, p2}, Lbv1$b$a;-><init>(Lbv1$b;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lbv1$b$a;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lbv1$b$a;->i:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lbv1$b$a;->k:Ljava/lang/Object;

    check-cast p1, Lfh5;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lbv1$b$a;->k:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_5

    :cond_3
    iget-object p1, v0, Lbv1$b$a;->l:Ljava/lang/Object;

    check-cast p1, LGu1;

    iget-object v2, v0, Lbv1$b$a;->k:Ljava/lang/Object;

    check-cast v2, Lbv1$b;

    :try_start_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_2
    iget-object p2, p0, Lbv1$b;->b:LEu1;

    iput-object p0, v0, Lbv1$b$a;->k:Ljava/lang/Object;

    iput-object p1, v0, Lbv1$b$a;->l:Ljava/lang/Object;

    iput v5, v0, Lbv1$b$a;->i:I

    invoke-interface {p2, p1, v0}, LEu1;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    move-object v2, p0

    :goto_1
    new-instance p2, Lfh5;

    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v4

    invoke-direct {p2, p1, v4}, Lfh5;-><init>(LGu1;Lkotlin/coroutines/CoroutineContext;)V

    :try_start_3
    iget-object p1, v2, Lbv1$b;->c:Lkotlin/jvm/functions/Function3;

    iput-object p2, v0, Lbv1$b$a;->k:Ljava/lang/Object;

    iput-object v6, v0, Lbv1$b$a;->l:Ljava/lang/Object;

    iput v3, v0, Lbv1$b$a;->i:I

    const/4 v2, 0x6

    invoke-static {v2}, Lkotlin/jvm/internal/InlineMarker;->mark(I)V

    invoke-interface {p1, p2, v6, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x7

    invoke-static {v0}, Lkotlin/jvm/internal/InlineMarker;->mark(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    move-object p1, p2

    :goto_2
    invoke-virtual {p1}, Lfh5;->releaseIntercepted()V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :catchall_2
    move-exception p1

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_3
    invoke-virtual {p1}, Lfh5;->releaseIntercepted()V

    throw p2

    :catchall_3
    move-exception p1

    move-object v2, p0

    :goto_4
    new-instance p2, LU36;

    invoke-direct {p2, p1}, LU36;-><init>(Ljava/lang/Throwable;)V

    iget-object v2, v2, Lbv1$b;->c:Lkotlin/jvm/functions/Function3;

    iput-object p1, v0, Lbv1$b$a;->k:Ljava/lang/Object;

    iput-object v6, v0, Lbv1$b$a;->l:Ljava/lang/Object;

    iput v4, v0, Lbv1$b$a;->i:I

    invoke-static {p2, v2, p1, v0}, Lbv1;->a(LGu1;Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    return-object v1

    :cond_7
    :goto_5
    throw p1
.end method
