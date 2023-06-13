.class public final Lio/reactivex/internal/util/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No instances!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(ZZLhT5;ZLio/reactivex/internal/fuseable/j;Lio/reactivex/internal/util/r;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(ZZ",
            "LhT5<",
            "*>;Z",
            "Lio/reactivex/internal/fuseable/j<",
            "*>;",
            "Lio/reactivex/internal/util/r<",
            "TT;TU;>;)Z"
        }
    .end annotation

    invoke-interface {p5}, Lio/reactivex/internal/util/r;->c()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {p4}, Lio/reactivex/internal/fuseable/j;->clear()V

    return v1

    :cond_0
    if-eqz p0, :cond_4

    if-eqz p3, :cond_2

    if-eqz p1, :cond_4

    invoke-interface {p5}, Lio/reactivex/internal/util/r;->j()Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p2, p0}, LhT5;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, LhT5;->onComplete()V

    :goto_0
    return v1

    :cond_2
    invoke-interface {p5}, Lio/reactivex/internal/util/r;->j()Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-interface {p4}, Lio/reactivex/internal/fuseable/j;->clear()V

    invoke-interface {p2, p0}, LhT5;->onError(Ljava/lang/Throwable;)V

    return v1

    :cond_3
    if-eqz p1, :cond_4

    invoke-interface {p2}, LhT5;->onComplete()V

    return v1

    :cond_4
    const/4 p0, 0x0

    return p0
.end method

.method public static b(ZZLio/reactivex/D;ZLio/reactivex/internal/fuseable/j;Lio/reactivex/disposables/c;Lio/reactivex/internal/util/o;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(ZZ",
            "Lio/reactivex/D<",
            "*>;Z",
            "Lio/reactivex/internal/fuseable/j<",
            "*>;",
            "Lio/reactivex/disposables/c;",
            "Lio/reactivex/internal/util/o<",
            "TT;TU;>;)Z"
        }
    .end annotation

    invoke-interface {p6}, Lio/reactivex/internal/util/o;->c()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {p4}, Lio/reactivex/internal/fuseable/j;->clear()V

    invoke-interface {p5}, Lio/reactivex/disposables/c;->dispose()V

    return v1

    :cond_0
    if-eqz p0, :cond_7

    if-eqz p3, :cond_3

    if-eqz p1, :cond_7

    if-eqz p5, :cond_1

    invoke-interface {p5}, Lio/reactivex/disposables/c;->dispose()V

    :cond_1
    invoke-interface {p6}, Lio/reactivex/internal/util/o;->j()Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p2, p0}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    invoke-interface {p2}, Lio/reactivex/D;->onComplete()V

    :goto_0
    return v1

    :cond_3
    invoke-interface {p6}, Lio/reactivex/internal/util/o;->j()Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-interface {p4}, Lio/reactivex/internal/fuseable/j;->clear()V

    if-eqz p5, :cond_4

    invoke-interface {p5}, Lio/reactivex/disposables/c;->dispose()V

    :cond_4
    invoke-interface {p2, p0}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return v1

    :cond_5
    if-eqz p1, :cond_7

    if-eqz p5, :cond_6

    invoke-interface {p5}, Lio/reactivex/disposables/c;->dispose()V

    :cond_6
    invoke-interface {p2}, Lio/reactivex/D;->onComplete()V

    return v1

    :cond_7
    const/4 p0, 0x0

    return p0
.end method

.method public static c(I)Lio/reactivex/internal/fuseable/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I)",
            "Lio/reactivex/internal/fuseable/j<",
            "TT;>;"
        }
    .end annotation

    if-gez p0, :cond_0

    new-instance v0, Lio/reactivex/internal/queue/c;

    neg-int p0, p0

    invoke-direct {v0, p0}, Lio/reactivex/internal/queue/c;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Lio/reactivex/internal/queue/b;

    invoke-direct {v0, p0}, Lio/reactivex/internal/queue/b;-><init>(I)V

    return-object v0
.end method

.method public static d(Lio/reactivex/internal/fuseable/i;Lio/reactivex/D;ZLio/reactivex/disposables/c;Lio/reactivex/internal/util/o;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/internal/fuseable/i<",
            "TT;>;",
            "Lio/reactivex/D<",
            "-TU;>;Z",
            "Lio/reactivex/disposables/c;",
            "Lio/reactivex/internal/util/o<",
            "TT;TU;>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    move v1, v0

    :cond_0
    invoke-interface {p4}, Lio/reactivex/internal/util/o;->done()Z

    move-result v2

    invoke-interface {p0}, Lio/reactivex/internal/fuseable/j;->isEmpty()Z

    move-result v3

    move-object v4, p1

    move v5, p2

    move-object v6, p0

    move-object v7, p3

    move-object v8, p4

    invoke-static/range {v2 .. v8}, Lio/reactivex/internal/util/s;->b(ZZLio/reactivex/D;ZLio/reactivex/internal/fuseable/j;Lio/reactivex/disposables/c;Lio/reactivex/internal/util/o;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-void

    :cond_1
    :goto_0
    invoke-interface {p4}, Lio/reactivex/internal/util/o;->done()Z

    move-result v3

    invoke-interface {p0}, Lio/reactivex/internal/fuseable/i;->poll()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    move v10, v0

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    move v10, v4

    :goto_1
    move v4, v10

    move-object v5, p1

    move v6, p2

    move-object v7, p0

    move-object v8, p3

    move-object v9, p4

    invoke-static/range {v3 .. v9}, Lio/reactivex/internal/util/s;->b(ZZLio/reactivex/D;ZLio/reactivex/internal/fuseable/j;Lio/reactivex/disposables/c;Lio/reactivex/internal/util/o;)Z

    move-result v3

    if-eqz v3, :cond_3

    return-void

    :cond_3
    if-eqz v10, :cond_4

    neg-int v1, v1

    invoke-interface {p4, v1}, Lio/reactivex/internal/util/o;->b(I)I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_4
    invoke-interface {p4, p1, v2}, Lio/reactivex/internal/util/o;->d(Lio/reactivex/D;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public static e(Lio/reactivex/internal/fuseable/i;LhT5;ZLio/reactivex/disposables/c;Lio/reactivex/internal/util/r;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/internal/fuseable/i<",
            "TT;>;",
            "LhT5<",
            "-TU;>;Z",
            "Lio/reactivex/disposables/c;",
            "Lio/reactivex/internal/util/r<",
            "TT;TU;>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    move v1, v0

    :cond_0
    :goto_0
    invoke-interface {p4}, Lio/reactivex/internal/util/r;->done()Z

    move-result v2

    invoke-interface {p0}, Lio/reactivex/internal/fuseable/i;->poll()Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_1

    move v9, v0

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    move v9, v3

    :goto_1
    move v3, v9

    move-object v4, p1

    move v5, p2

    move-object v6, p0

    move-object v7, p4

    invoke-static/range {v2 .. v7}, Lio/reactivex/internal/util/s;->a(ZZLhT5;ZLio/reactivex/internal/fuseable/j;Lio/reactivex/internal/util/r;)Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz p3, :cond_2

    invoke-interface {p3}, Lio/reactivex/disposables/c;->dispose()V

    :cond_2
    return-void

    :cond_3
    if-eqz v9, :cond_4

    neg-int v1, v1

    invoke-interface {p4, v1}, Lio/reactivex/internal/util/r;->b(I)I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_4
    invoke-interface {p4}, Lio/reactivex/internal/util/r;->g()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_5

    invoke-interface {p4, p1, v8}, Lio/reactivex/internal/util/r;->i(LhT5;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-wide v4, 0x7fffffffffffffffL

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    const-wide/16 v2, 0x1

    invoke-interface {p4, v2, v3}, Lio/reactivex/internal/util/r;->d(J)J

    goto :goto_0

    :cond_5
    invoke-interface {p0}, Lio/reactivex/internal/fuseable/j;->clear()V

    if-eqz p3, :cond_6

    invoke-interface {p3}, Lio/reactivex/disposables/c;->dispose()V

    :cond_6
    new-instance p0, Lio/reactivex/exceptions/MissingBackpressureException;

    const-string p2, "Could not emit value due to lack of requests."

    invoke-direct {p0, p2}, Lio/reactivex/exceptions/MissingBackpressureException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p0}, LhT5;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
