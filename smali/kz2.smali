.class public final Lkz2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0005\u001a\u001f\u0010\u0008\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\u0005\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\t"
    }
    d2 = {
        "LtX3;",
        "LZ06;",
        "observer",
        "",
        "d",
        "(LtX3;LZ06;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "c",
        "f",
        "e",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final synthetic a(LtX3;LZ06;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lkz2;->e(LtX3;LZ06;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LtX3;LZ06;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lkz2;->f(LtX3;LZ06;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LtX3;LZ06;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LtX3;",
            "LZ06;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkz2$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lkz2$a;-><init>(LtX3;LZ06;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, p2}, LaD0;->e(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final d(LtX3;LZ06;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LtX3;",
            "LZ06;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v1, Lkz2$b;

    invoke-direct {v1, p1}, Lkz2$b;-><init>(LZ06;)V

    new-instance v2, Lkz2$c;

    invoke-direct {v2, p1}, Lkz2$c;-><init>(LZ06;)V

    new-instance v3, Lkz2$d;

    invoke-direct {v3, p1}, Lkz2$d;-><init>(LZ06;)V

    new-instance v4, Lkz2$e;

    invoke-direct {v4, p1}, Lkz2$e;-><init>(LZ06;)V

    move-object v0, p0

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lq61;->e(LtX3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final e(LtX3;LZ06;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LtX3;",
            "LZ06;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v1, Lkz2$f;

    invoke-direct {v1, p1}, Lkz2$f;-><init>(LZ06;)V

    new-instance v2, Lkz2$g;

    invoke-direct {v2, p1}, Lkz2$g;-><init>(LZ06;)V

    new-instance v3, Lkz2$h;

    invoke-direct {v3, p1}, Lkz2$h;-><init>(LZ06;)V

    new-instance v4, Lkz2$i;

    invoke-direct {v4, p1}, Lkz2$i;-><init>(LZ06;)V

    move-object v0, p0

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lq61;->d(LtX3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final f(LtX3;LZ06;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LtX3;",
            "LZ06;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkz2$j;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lkz2$j;-><init>(LZ06;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v0, p2}, LMw1;->c(LtX3;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
