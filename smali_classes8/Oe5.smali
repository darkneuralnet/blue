.class public final LOe5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a*\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u001a*\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a8\u0006\t"
    }
    d2 = {
        "",
        "T",
        "LEu1;",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "Lio/reactivex/Observable;",
        "c",
        "Lio/reactivex/k;",
        "b",
        "kotlinx-coroutines-rx2"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public static synthetic a(Lkotlin/coroutines/CoroutineContext;LEu1;Lio/reactivex/y;)V
    .locals 0

    invoke-static {p0, p1, p2}, LOe5;->e(Lkotlin/coroutines/CoroutineContext;LEu1;Lio/reactivex/y;)V

    return-void
.end method

.method public static final b(LEu1;Lkotlin/coroutines/CoroutineContext;)Lio/reactivex/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LEu1<",
            "+TT;>;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")",
            "Lio/reactivex/k<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcr4;->a(LEu1;Lkotlin/coroutines/CoroutineContext;)Lna4;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/k;->j0(Lna4;)Lio/reactivex/k;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LEu1;Lkotlin/coroutines/CoroutineContext;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LEu1<",
            "+TT;>;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LNe5;

    invoke-direct {v0, p1, p0}, LNe5;-><init>(Lkotlin/coroutines/CoroutineContext;LEu1;)V

    invoke-static {v0}, Lio/reactivex/Observable;->create(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LEu1;Lkotlin/coroutines/CoroutineContext;ILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    :cond_0
    invoke-static {p0, p1}, LOe5;->c(LEu1;Lkotlin/coroutines/CoroutineContext;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lkotlin/coroutines/CoroutineContext;LEu1;Lio/reactivex/y;)V
    .locals 4

    sget-object v0, LVC1;->b:LVC1;

    invoke-static {}, LT41;->d()LSC0;

    move-result-object v1

    invoke-virtual {v1, p0}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    sget-object v1, LbD0;->d:LbD0;

    new-instance v2, LOe5$a;

    const/4 v3, 0x0

    invoke-direct {v2, p1, p2, v3}, LOe5$a;-><init>(LEu1;Lio/reactivex/y;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, p0, v1, v2}, LX30;->c(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;)Lzh2;

    move-result-object p0

    new-instance p1, LJe5;

    invoke-direct {p1, p0}, LJe5;-><init>(Lzh2;)V

    invoke-interface {p2, p1}, Lio/reactivex/y;->a(Lio/reactivex/functions/f;)V

    return-void
.end method
