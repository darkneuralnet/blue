.class public final LWe5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001ay\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0008\u0008\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a}\u0010\u0012\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u00110\u0010\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0008\u0008\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0010\u0008\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\nH\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "",
        "Key",
        "Value",
        "LWS0$c;",
        "dataSourceFactory",
        "LZD3$d;",
        "config",
        "initialLoadKey",
        "LZD3$a;",
        "boundaryCallback",
        "Lio/reactivex/E;",
        "fetchScheduler",
        "notifyScheduler",
        "LVe5;",
        "a",
        "(LWS0$c;LZD3$d;Ljava/lang/Object;LZD3$a;Lio/reactivex/E;Lio/reactivex/E;)LVe5;",
        "Lio/reactivex/Observable;",
        "LZD3;",
        "b",
        "(LWS0$c;LZD3$d;Ljava/lang/Object;LZD3$a;Lio/reactivex/E;Lio/reactivex/E;)Lio/reactivex/Observable;",
        "paging-rxjava2_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public static final a(LWS0$c;LZD3$d;Ljava/lang/Object;LZD3$a;Lio/reactivex/E;Lio/reactivex/E;)LVe5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Key:",
            "Ljava/lang/Object;",
            "Value:",
            "Ljava/lang/Object;",
            ">(",
            "LWS0$c<",
            "TKey;TValue;>;",
            "LZD3$d;",
            "TKey;",
            "LZD3$a<",
            "TValue;>;",
            "Lio/reactivex/E;",
            "Lio/reactivex/E;",
            ")",
            "LVe5<",
            "TKey;TValue;>;"
        }
    .end annotation

    new-instance v0, LVe5;

    invoke-direct {v0, p0, p1}, LVe5;-><init>(LWS0$c;LZD3$d;)V

    invoke-virtual {v0, p2}, LVe5;->d(Ljava/lang/Object;)LVe5;

    move-result-object p0

    invoke-virtual {p0, p3}, LVe5;->b(LZD3$a;)LVe5;

    move-result-object p0

    if-eqz p4, :cond_0

    invoke-virtual {p0, p4}, LVe5;->c(Lio/reactivex/E;)LVe5;

    :cond_0
    if-eqz p5, :cond_1

    invoke-virtual {p0, p5}, LVe5;->e(Lio/reactivex/E;)LVe5;

    :cond_1
    return-object p0
.end method

.method public static final b(LWS0$c;LZD3$d;Ljava/lang/Object;LZD3$a;Lio/reactivex/E;Lio/reactivex/E;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Key:",
            "Ljava/lang/Object;",
            "Value:",
            "Ljava/lang/Object;",
            ">(",
            "LWS0$c<",
            "TKey;TValue;>;",
            "LZD3$d;",
            "TKey;",
            "LZD3$a<",
            "TValue;>;",
            "Lio/reactivex/E;",
            "Lio/reactivex/E;",
            ")",
            "Lio/reactivex/Observable<",
            "LZD3<",
            "TValue;>;>;"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "PagedList is deprecated and has been replaced by PagingData"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "Pager(\n            PagingConfig(\n                config.pageSize,\n                config.prefetchDistance,\n                config.enablePlaceholders,\n                config.initialLoadSizeHint,\n                config.maxSize\n            ),\n            initialLoadKey,\n            this.asPagingSourceFactory(fetchScheduler?.asCoroutineDispatcher() ?: Dispatchers.IO)\n        ).observable"
            imports = {
                "androidx.paging.Pager",
                "androidx.paging.PagingConfig",
                "androidx.paging.rxjava2.getObservable",
                "kotlinx.coroutines.rx2.asCoroutineDispatcher",
                "kotlinx.coroutines.Dispatchers"
            }
        .end subannotation
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p0 .. p5}, LWe5;->a(LWS0$c;LZD3$d;Ljava/lang/Object;LZD3$a;Lio/reactivex/E;Lio/reactivex/E;)LVe5;

    move-result-object p0

    invoke-virtual {p0}, LVe5;->a()Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LWS0$c;LZD3$d;Ljava/lang/Object;LZD3$a;Lio/reactivex/E;Lio/reactivex/E;ILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 7

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, p2

    :goto_0
    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, p3

    :goto_1
    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    move-object v5, v0

    goto :goto_2

    :cond_2
    move-object v5, p4

    :goto_2
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    move-object v6, v0

    goto :goto_3

    :cond_3
    move-object v6, p5

    :goto_3
    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, LWe5;->b(LWS0$c;LZD3$d;Ljava/lang/Object;LZD3$a;Lio/reactivex/E;Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method
