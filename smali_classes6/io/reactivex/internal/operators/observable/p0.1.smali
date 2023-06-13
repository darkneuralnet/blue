.class public final Lio/reactivex/internal/operators/observable/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/p0$k;,
        Lio/reactivex/internal/operators/observable/p0$n;,
        Lio/reactivex/internal/operators/observable/p0$b;,
        Lio/reactivex/internal/operators/observable/p0$a;,
        Lio/reactivex/internal/operators/observable/p0$j;,
        Lio/reactivex/internal/operators/observable/p0$o;,
        Lio/reactivex/internal/operators/observable/p0$c;,
        Lio/reactivex/internal/operators/observable/p0$e;,
        Lio/reactivex/internal/operators/observable/p0$d;,
        Lio/reactivex/internal/operators/observable/p0$g;,
        Lio/reactivex/internal/operators/observable/p0$h;,
        Lio/reactivex/internal/operators/observable/p0$i;,
        Lio/reactivex/internal/operators/observable/p0$f;,
        Lio/reactivex/internal/operators/observable/p0$l;,
        Lio/reactivex/internal/operators/observable/p0$m;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No instances!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(Lio/reactivex/functions/o;)Lio/reactivex/functions/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Ljava/lang/Iterable<",
            "+TU;>;>;)",
            "Lio/reactivex/functions/o<",
            "TT;",
            "Lio/reactivex/B<",
            "TU;>;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/p0$c;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/observable/p0$c;-><init>(Lio/reactivex/functions/o;)V

    return-object v0
.end method

.method public static b(Lio/reactivex/functions/o;Lio/reactivex/functions/c;)Lio/reactivex/functions/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/B<",
            "+TU;>;>;",
            "Lio/reactivex/functions/c<",
            "-TT;-TU;+TR;>;)",
            "Lio/reactivex/functions/o<",
            "TT;",
            "Lio/reactivex/B<",
            "TR;>;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/p0$e;

    invoke-direct {v0, p1, p0}, Lio/reactivex/internal/operators/observable/p0$e;-><init>(Lio/reactivex/functions/c;Lio/reactivex/functions/o;)V

    return-object v0
.end method

.method public static c(Lio/reactivex/functions/o;)Lio/reactivex/functions/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/B<",
            "TU;>;>;)",
            "Lio/reactivex/functions/o<",
            "TT;",
            "Lio/reactivex/B<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/p0$f;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/observable/p0$f;-><init>(Lio/reactivex/functions/o;)V

    return-object v0
.end method

.method public static d(Lio/reactivex/D;)Lio/reactivex/functions/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/D<",
            "TT;>;)",
            "Lio/reactivex/functions/a;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/p0$g;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/observable/p0$g;-><init>(Lio/reactivex/D;)V

    return-object v0
.end method

.method public static e(Lio/reactivex/D;)Lio/reactivex/functions/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/D<",
            "TT;>;)",
            "Lio/reactivex/functions/g<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/p0$h;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/observable/p0$h;-><init>(Lio/reactivex/D;)V

    return-object v0
.end method

.method public static f(Lio/reactivex/D;)Lio/reactivex/functions/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/D<",
            "TT;>;)",
            "Lio/reactivex/functions/g<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/p0$i;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/observable/p0$i;-><init>(Lio/reactivex/D;)V

    return-object v0
.end method

.method public static g(Lio/reactivex/Observable;)Ljava/util/concurrent/Callable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Observable<",
            "TT;>;)",
            "Ljava/util/concurrent/Callable<",
            "Lio/reactivex/observables/a<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/p0$j;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/observable/p0$j;-><init>(Lio/reactivex/Observable;)V

    return-object v0
.end method

.method public static h(Lio/reactivex/Observable;I)Ljava/util/concurrent/Callable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Observable<",
            "TT;>;I)",
            "Ljava/util/concurrent/Callable<",
            "Lio/reactivex/observables/a<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/p0$a;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/observable/p0$a;-><init>(Lio/reactivex/Observable;I)V

    return-object v0
.end method

.method public static i(Lio/reactivex/Observable;IJLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Ljava/util/concurrent/Callable;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Observable<",
            "TT;>;IJ",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            ")",
            "Ljava/util/concurrent/Callable<",
            "Lio/reactivex/observables/a<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v7, Lio/reactivex/internal/operators/observable/p0$b;

    move-object v0, v7

    move-object v1, p0

    move v2, p1

    move-wide v3, p2

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lio/reactivex/internal/operators/observable/p0$b;-><init>(Lio/reactivex/Observable;IJLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V

    return-object v7
.end method

.method public static j(Lio/reactivex/Observable;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Ljava/util/concurrent/Callable;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Observable<",
            "TT;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            ")",
            "Ljava/util/concurrent/Callable<",
            "Lio/reactivex/observables/a<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v6, Lio/reactivex/internal/operators/observable/p0$n;

    move-object v0, v6

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lio/reactivex/internal/operators/observable/p0$n;-><init>(Lio/reactivex/Observable;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V

    return-object v6
.end method

.method public static k(Lio/reactivex/functions/o;Lio/reactivex/E;)Lio/reactivex/functions/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/functions/o<",
            "-",
            "Lio/reactivex/Observable<",
            "TT;>;+",
            "Lio/reactivex/B<",
            "TR;>;>;",
            "Lio/reactivex/E;",
            ")",
            "Lio/reactivex/functions/o<",
            "Lio/reactivex/Observable<",
            "TT;>;",
            "Lio/reactivex/B<",
            "TR;>;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/p0$k;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/observable/p0$k;-><init>(Lio/reactivex/functions/o;Lio/reactivex/E;)V

    return-object v0
.end method

.method public static l(Lio/reactivex/functions/b;)Lio/reactivex/functions/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/functions/b<",
            "TS;",
            "Lio/reactivex/j<",
            "TT;>;>;)",
            "Lio/reactivex/functions/c<",
            "TS;",
            "Lio/reactivex/j<",
            "TT;>;TS;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/p0$l;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/observable/p0$l;-><init>(Lio/reactivex/functions/b;)V

    return-object v0
.end method

.method public static m(Lio/reactivex/functions/g;)Lio/reactivex/functions/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/functions/g<",
            "Lio/reactivex/j<",
            "TT;>;>;)",
            "Lio/reactivex/functions/c<",
            "TS;",
            "Lio/reactivex/j<",
            "TT;>;TS;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/p0$m;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/observable/p0$m;-><init>(Lio/reactivex/functions/g;)V

    return-object v0
.end method

.method public static n(Lio/reactivex/functions/o;)Lio/reactivex/functions/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/functions/o<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;)",
            "Lio/reactivex/functions/o<",
            "Ljava/util/List<",
            "Lio/reactivex/B<",
            "+TT;>;>;",
            "Lio/reactivex/B<",
            "+TR;>;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/p0$o;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/observable/p0$o;-><init>(Lio/reactivex/functions/o;)V

    return-object v0
.end method
