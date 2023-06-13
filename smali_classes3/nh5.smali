.class public final Lnh5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a;\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\"\u0004\u0008\u0000\u0010\u00002\'\u0010\u0007\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u000c\u0008\u0003\u0012\u0008\u0008\u0004\u0012\u0004\u0008\u0008(\u0005\u0012\u0004\u0012\u00020\u00060\u0001\u001a;\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\u0008\u0000\u0010\u00002\'\u0010\u0007\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\n\u00a2\u0006\u000c\u0008\u0003\u0012\u0008\u0008\u0004\u0012\u0004\u0008\u0008(\u0005\u0012\u0004\u0012\u00020\u00060\u0001\u001a;\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\u0008\u0000\u0010\u00002\'\u0010\u0007\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\r\u00a2\u0006\u000c\u0008\u0003\u0012\u0008\u0008\u0004\u0012\u0004\u0008\u0008(\u0005\u0012\u0004\u0012\u00020\u00060\u0001\u001a)\u0010\u0012\u001a\u00020\u00112!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\u000c\u0008\u0003\u0012\u0008\u0008\u0004\u0012\u0004\u0008\u0008(\u0005\u0012\u0004\u0012\u00020\u00060\u0001\u00a8\u0006\u0013"
    }
    d2 = {
        "T",
        "Lkotlin/Function1;",
        "Lio/reactivex/y;",
        "Lkotlin/ParameterName;",
        "name",
        "emitter",
        "",
        "source",
        "Lio/reactivex/Observable;",
        "i",
        "Lio/reactivex/H;",
        "Lio/reactivex/F;",
        "k",
        "Lio/reactivex/r;",
        "Lio/reactivex/p;",
        "g",
        "Lio/reactivex/e;",
        "Lio/reactivex/c;",
        "e",
        "rx_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lio/reactivex/H;)V
    .locals 0

    invoke-static {p0, p1}, Lnh5;->l(Lkotlin/jvm/functions/Function1;Lio/reactivex/H;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lio/reactivex/r;)V
    .locals 0

    invoke-static {p0, p1}, Lnh5;->h(Lkotlin/jvm/functions/Function1;Lio/reactivex/r;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lio/reactivex/e;)V
    .locals 0

    invoke-static {p0, p1}, Lnh5;->f(Lkotlin/jvm/functions/Function1;Lio/reactivex/e;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lio/reactivex/y;)V
    .locals 0

    invoke-static {p0, p1}, Lnh5;->j(Lkotlin/jvm/functions/Function1;Lio/reactivex/y;)V

    return-void
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/reactivex/e;",
            "Lkotlin/Unit;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkh5;

    invoke-direct {v0, p0}, Lkh5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-static {v0}, Lio/reactivex/c;->s(Lio/reactivex/g;)Lio/reactivex/c;

    move-result-object p0

    const-string v0, "create { emitter ->\n    \u2026tter.onError(t)\n    }\n  }"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Lio/reactivex/e;)V
    .locals 1

    const-string v0, "$source"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lih5;

    invoke-direct {v0, p1}, Lih5;-><init>(Lio/reactivex/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-interface {p1, p0}, Lio/reactivex/e;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;)Lio/reactivex/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/reactivex/r<",
            "TT;>;",
            "Lkotlin/Unit;",
            ">;)",
            "Lio/reactivex/p<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljh5;

    invoke-direct {v0, p0}, Ljh5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-static {v0}, Lio/reactivex/p;->i(Lio/reactivex/t;)Lio/reactivex/p;

    move-result-object p0

    const-string v0, "create { emitter ->\n    \u2026tter.onError(t)\n    }\n  }"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Lio/reactivex/r;)V
    .locals 1

    const-string v0, "$source"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lsh5;

    invoke-direct {v0, p1}, Lsh5;-><init>(Lio/reactivex/r;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-interface {p1, p0}, Lio/reactivex/r;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/reactivex/y<",
            "TT;>;",
            "Lkotlin/Unit;",
            ">;)",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmh5;

    invoke-direct {v0, p0}, Lmh5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-static {v0}, Lio/reactivex/Observable;->create(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object p0

    const-string v0, "create { emitter ->\n    \u2026tter.onError(t)\n    }\n  }"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final j(Lkotlin/jvm/functions/Function1;Lio/reactivex/y;)V
    .locals 1

    const-string v0, "$source"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lth5;

    invoke-direct {v0, p1}, Lth5;-><init>(Lio/reactivex/y;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-interface {p1, p0}, Lio/reactivex/j;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static final k(Lkotlin/jvm/functions/Function1;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/reactivex/H<",
            "TT;>;",
            "Lkotlin/Unit;",
            ">;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llh5;

    invoke-direct {v0, p0}, Llh5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-static {v0}, Lio/reactivex/F;->j(Lio/reactivex/J;)Lio/reactivex/F;

    move-result-object p0

    const-string v0, "create { emitter ->\n    \u2026tter.onError(t)\n    }\n  }"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final l(Lkotlin/jvm/functions/Function1;Lio/reactivex/H;)V
    .locals 1

    const-string v0, "$source"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lxh5;

    invoke-direct {v0, p1}, Lxh5;-><init>(Lio/reactivex/H;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-interface {p1, p0}, Lio/reactivex/H;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
