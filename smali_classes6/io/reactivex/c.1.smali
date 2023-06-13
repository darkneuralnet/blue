.class public abstract Lio/reactivex/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/h;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static F(Ljava/lang/Throwable;)Lio/reactivex/c;
    .locals 1

    const-string v0, "error is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/j;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/completable/j;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static G(Lio/reactivex/functions/a;)Lio/reactivex/c;
    .locals 1

    const-string v0, "run is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/k;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/completable/k;-><init>(Lio/reactivex/functions/a;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "*>;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    const-string v0, "callable is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/l;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/completable/l;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static I(Lna4;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lna4<",
            "TT;>;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    const-string v0, "publisher is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/m;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/completable/m;-><init>(Lna4;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static J(Ljava/lang/Runnable;)Lio/reactivex/c;
    .locals 1

    const-string v0, "run is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/n;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/completable/n;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static L(Ljava/lang/Iterable;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/reactivex/h;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/s;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/completable/s;-><init>(Ljava/lang/Iterable;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static varargs M([Lio/reactivex/h;)Lio/reactivex/c;
    .locals 2

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p0

    return-object p0

    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-static {p0}, Lio/reactivex/c;->k0(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Lio/reactivex/internal/operators/completable/r;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/completable/r;-><init>([Lio/reactivex/h;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static O()Lio/reactivex/c;
    .locals 1

    sget-object v0, Lio/reactivex/internal/operators/completable/t;->b:Lio/reactivex/c;

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public static c0(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/c;
    .locals 1

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lio/reactivex/c;->d0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static d0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/c;
    .locals 1

    const-string v0, "unit is null"

    invoke-static {p2, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p3, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/B;

    invoke-direct {v0, p0, p1, p2, p3}, Lio/reactivex/internal/operators/completable/B;-><init>(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static g0(Ljava/lang/Throwable;)Ljava/lang/NullPointerException;
    .locals 2

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Actually not, but can\'t pass out an exception otherwise..."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-object v0
.end method

.method public static varargs h([Lio/reactivex/h;)Lio/reactivex/c;
    .locals 2

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p0

    return-object p0

    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-static {p0}, Lio/reactivex/c;->k0(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Lio/reactivex/internal/operators/completable/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/reactivex/internal/operators/completable/a;-><init>([Lio/reactivex/h;Ljava/lang/Iterable;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static k0(Lio/reactivex/h;)Lio/reactivex/c;
    .locals 1

    const-string v0, "source is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    instance-of v0, p0, Lio/reactivex/c;

    if-eqz v0, :cond_0

    check-cast p0, Lio/reactivex/c;

    invoke-static {p0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lio/reactivex/internal/operators/completable/p;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/completable/p;-><init>(Lio/reactivex/h;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static p()Lio/reactivex/c;
    .locals 1

    sget-object v0, Lio/reactivex/internal/operators/completable/i;->b:Lio/reactivex/c;

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public static r(Ljava/lang/Iterable;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/reactivex/h;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/c;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/completable/c;-><init>(Ljava/lang/Iterable;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static s(Lio/reactivex/g;)Lio/reactivex/c;
    .locals 1

    const-string v0, "source is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/d;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/completable/d;-><init>(Lio/reactivex/g;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "+",
            "Lio/reactivex/h;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    const-string v0, "completableSupplier"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/e;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/completable/e;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A(Lio/reactivex/functions/a;)Lio/reactivex/c;
    .locals 7

    invoke-static {}, Lio/reactivex/internal/functions/a;->g()Lio/reactivex/functions/g;

    move-result-object v1

    invoke-static {}, Lio/reactivex/internal/functions/a;->g()Lio/reactivex/functions/g;

    move-result-object v2

    sget-object v5, Lio/reactivex/internal/functions/a;->c:Lio/reactivex/functions/a;

    move-object v0, p0

    move-object v3, v5

    move-object v4, v5

    move-object v6, p1

    invoke-virtual/range {v0 .. v6}, Lio/reactivex/c;->D(Lio/reactivex/functions/g;Lio/reactivex/functions/g;Lio/reactivex/functions/a;Lio/reactivex/functions/a;Lio/reactivex/functions/a;Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final B(Lio/reactivex/functions/g;)Lio/reactivex/c;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    invoke-static {}, Lio/reactivex/internal/functions/a;->g()Lio/reactivex/functions/g;

    move-result-object v1

    sget-object v6, Lio/reactivex/internal/functions/a;->c:Lio/reactivex/functions/a;

    move-object v0, p0

    move-object v2, p1

    move-object v3, v6

    move-object v4, v6

    move-object v5, v6

    invoke-virtual/range {v0 .. v6}, Lio/reactivex/c;->D(Lio/reactivex/functions/g;Lio/reactivex/functions/g;Lio/reactivex/functions/a;Lio/reactivex/functions/a;Lio/reactivex/functions/a;Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final C(Lio/reactivex/functions/g;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    const-string v0, "onEvent is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/h;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/completable/h;-><init>(Lio/reactivex/h;Lio/reactivex/functions/g;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final D(Lio/reactivex/functions/g;Lio/reactivex/functions/g;Lio/reactivex/functions/a;Lio/reactivex/functions/a;Lio/reactivex/functions/a;Lio/reactivex/functions/a;)Lio/reactivex/c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/g<",
            "-",
            "Lio/reactivex/disposables/c;",
            ">;",
            "Lio/reactivex/functions/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;",
            "Lio/reactivex/functions/a;",
            "Lio/reactivex/functions/a;",
            "Lio/reactivex/functions/a;",
            "Lio/reactivex/functions/a;",
            ")",
            "Lio/reactivex/c;"
        }
    .end annotation

    const-string v0, "onSubscribe is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onError is null"

    invoke-static {p2, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onComplete is null"

    invoke-static {p3, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onTerminate is null"

    invoke-static {p4, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onAfterTerminate is null"

    invoke-static {p5, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onDispose is null"

    invoke-static {p6, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/w;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-direct/range {v1 .. v8}, Lio/reactivex/internal/operators/completable/w;-><init>(Lio/reactivex/h;Lio/reactivex/functions/g;Lio/reactivex/functions/g;Lio/reactivex/functions/a;Lio/reactivex/functions/a;Lio/reactivex/functions/a;Lio/reactivex/functions/a;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final E(Lio/reactivex/functions/g;)Lio/reactivex/c;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/g<",
            "-",
            "Lio/reactivex/disposables/c;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    invoke-static {}, Lio/reactivex/internal/functions/a;->g()Lio/reactivex/functions/g;

    move-result-object v2

    sget-object v6, Lio/reactivex/internal/functions/a;->c:Lio/reactivex/functions/a;

    move-object v0, p0

    move-object v1, p1

    move-object v3, v6

    move-object v4, v6

    move-object v5, v6

    invoke-virtual/range {v0 .. v6}, Lio/reactivex/c;->D(Lio/reactivex/functions/g;Lio/reactivex/functions/g;Lio/reactivex/functions/a;Lio/reactivex/functions/a;Lio/reactivex/functions/a;Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final K()Lio/reactivex/c;
    .locals 1

    new-instance v0, Lio/reactivex/internal/operators/completable/q;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/completable/q;-><init>(Lio/reactivex/h;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public final N(Lio/reactivex/h;)Lio/reactivex/c;
    .locals 2

    const-string v0, "other is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [Lio/reactivex/h;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {v0}, Lio/reactivex/c;->M([Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final P(Lio/reactivex/E;)Lio/reactivex/c;
    .locals 1

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/u;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/completable/u;-><init>(Lio/reactivex/h;Lio/reactivex/E;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final Q()Lio/reactivex/c;
    .locals 1

    invoke-static {}, Lio/reactivex/internal/functions/a;->c()Lio/reactivex/functions/q;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/reactivex/c;->R(Lio/reactivex/functions/q;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public final R(Lio/reactivex/functions/q;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/q<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    const-string v0, "predicate is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/v;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/completable/v;-><init>(Lio/reactivex/h;Lio/reactivex/functions/q;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final S(Lio/reactivex/functions/o;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/o<",
            "-",
            "Ljava/lang/Throwable;",
            "+",
            "Lio/reactivex/h;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    const-string v0, "errorMapper is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/x;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/completable/x;-><init>(Lio/reactivex/h;Lio/reactivex/functions/o;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final T()Lio/reactivex/c;
    .locals 1

    invoke-virtual {p0}, Lio/reactivex/c;->e0()Lio/reactivex/k;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/k;->J0()Lio/reactivex/k;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/c;->I(Lna4;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public final U(J)Lio/reactivex/c;
    .locals 1

    invoke-virtual {p0}, Lio/reactivex/c;->e0()Lio/reactivex/k;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lio/reactivex/k;->K0(J)Lio/reactivex/k;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/c;->I(Lna4;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final V(Lio/reactivex/functions/o;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/o<",
            "-",
            "Lio/reactivex/k<",
            "Ljava/lang/Throwable;",
            ">;+",
            "Lna4<",
            "*>;>;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    invoke-virtual {p0}, Lio/reactivex/c;->e0()Lio/reactivex/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/k;->O0(Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/c;->I(Lna4;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public abstract W(Lio/reactivex/f;)V
.end method

.method public final X(Lio/reactivex/E;)Lio/reactivex/c;
    .locals 1

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/y;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/completable/y;-><init>(Lio/reactivex/h;Lio/reactivex/E;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final Y(Lio/reactivex/h;)Lio/reactivex/c;
    .locals 1

    const-string v0, "other is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/z;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/completable/z;-><init>(Lio/reactivex/c;Lio/reactivex/h;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final Z(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/c;
    .locals 6

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lio/reactivex/c;->b0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final a0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/h;)Lio/reactivex/c;
    .locals 7

    const-string v0, "other is null"

    invoke-static {p4, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v5

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v6, p4

    invoke-virtual/range {v1 .. v6}, Lio/reactivex/c;->b0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lio/reactivex/functions/a;)Lio/reactivex/disposables/c;
    .locals 1

    const-string v0, "onComplete is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/observers/j;

    invoke-direct {v0, p1}, Lio/reactivex/internal/observers/j;-><init>(Lio/reactivex/functions/a;)V

    invoke-virtual {p0, v0}, Lio/reactivex/c;->g(Lio/reactivex/f;)V

    return-object v0
.end method

.method public final b0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Lio/reactivex/h;)Lio/reactivex/c;
    .locals 8

    const-string v0, "unit is null"

    invoke-static {p3, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p4, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/A;

    move-object v1, v0

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lio/reactivex/internal/operators/completable/A;-><init>(Lio/reactivex/h;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Lio/reactivex/h;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lio/reactivex/functions/a;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/a;",
            "Lio/reactivex/functions/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/disposables/c;"
        }
    .end annotation

    const-string v0, "onError is null"

    invoke-static {p2, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onComplete is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/observers/j;

    invoke-direct {v0, p2, p1}, Lio/reactivex/internal/observers/j;-><init>(Lio/reactivex/functions/g;Lio/reactivex/functions/a;)V

    invoke-virtual {p0, v0}, Lio/reactivex/c;->g(Lio/reactivex/f;)V

    return-object v0
.end method

.method public final e0()Lio/reactivex/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/k<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lio/reactivex/internal/fuseable/b;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lio/reactivex/internal/fuseable/b;

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/b;->d()Lio/reactivex/k;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lio/reactivex/internal/operators/completable/C;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/completable/C;-><init>(Lio/reactivex/h;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->m(Lio/reactivex/k;)Lio/reactivex/k;

    move-result-object v0

    return-object v0
.end method

.method public final f0()Lio/reactivex/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/p<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lio/reactivex/internal/fuseable/c;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lio/reactivex/internal/fuseable/c;

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/c;->a()Lio/reactivex/p;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lio/reactivex/internal/operators/maybe/t;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/maybe/t;-><init>(Lio/reactivex/h;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->n(Lio/reactivex/p;)Lio/reactivex/p;

    move-result-object v0

    return-object v0
.end method

.method public final g(Lio/reactivex/f;)V
    .locals 1

    const-string v0, "observer is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :try_start_0
    invoke-static {p0, p1}, Lio/reactivex/plugins/a;->z(Lio/reactivex/c;Lio/reactivex/f;)Lio/reactivex/f;

    move-result-object p1

    const-string v0, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lio/reactivex/c;->W(Lio/reactivex/f;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lio/reactivex/c;->g0(Ljava/lang/Throwable;)Ljava/lang/NullPointerException;

    move-result-object p1

    throw p1

    :catch_0
    move-exception p1

    throw p1
.end method

.method public final h0()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lio/reactivex/internal/fuseable/d;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lio/reactivex/internal/fuseable/d;

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/d;->c()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lio/reactivex/internal/operators/completable/D;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/completable/D;-><init>(Lio/reactivex/h;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->o(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final i(Lio/reactivex/h;)Lio/reactivex/c;
    .locals 1

    const-string v0, "next is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/b;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/completable/b;-><init>(Lio/reactivex/h;Lio/reactivex/h;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final i0(Ljava/util/concurrent/Callable;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "+TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "completionValueSupplier is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/E;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lio/reactivex/internal/operators/completable/E;-><init>(Lio/reactivex/h;Ljava/util/concurrent/Callable;Ljava/lang/Object;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final j(Lna4;)Lio/reactivex/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lna4<",
            "TT;>;)",
            "Lio/reactivex/k<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "next is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/mixed/b;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/mixed/b;-><init>(Lio/reactivex/h;Lna4;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->m(Lio/reactivex/k;)Lio/reactivex/k;

    move-result-object p1

    return-object p1
.end method

.method public final j0(Ljava/lang/Object;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "completionValue is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/E;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Lio/reactivex/internal/operators/completable/E;-><init>(Lio/reactivex/h;Ljava/util/concurrent/Callable;Ljava/lang/Object;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final k(Lio/reactivex/u;)Lio/reactivex/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/u<",
            "TT;>;)",
            "Lio/reactivex/p<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "next is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/maybe/f;

    invoke-direct {v0, p1, p0}, Lio/reactivex/internal/operators/maybe/f;-><init>(Lio/reactivex/u;Lio/reactivex/h;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->n(Lio/reactivex/p;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public final l(Lio/reactivex/B;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/B<",
            "TT;>;)",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "next is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/mixed/a;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/mixed/a;-><init>(Lio/reactivex/h;Lio/reactivex/B;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->o(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public final m(Lio/reactivex/K;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/K<",
            "TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "next is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/e;

    invoke-direct {v0, p1, p0}, Lio/reactivex/internal/operators/single/e;-><init>(Lio/reactivex/K;Lio/reactivex/h;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final n(Lio/reactivex/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/d<",
            "+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "converter is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/reactivex/d;

    invoke-interface {p1, p0}, Lio/reactivex/d;->a(Lio/reactivex/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final o()Ljava/lang/Throwable;
    .locals 1

    new-instance v0, Lio/reactivex/internal/observers/h;

    invoke-direct {v0}, Lio/reactivex/internal/observers/h;-><init>()V

    invoke-virtual {p0, v0}, Lio/reactivex/c;->g(Lio/reactivex/f;)V

    invoke-virtual {v0}, Lio/reactivex/internal/observers/h;->b()Ljava/lang/Throwable;

    move-result-object v0

    return-object v0
.end method

.method public final q(Lio/reactivex/i;)Lio/reactivex/c;
    .locals 1

    const-string v0, "transformer is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/reactivex/i;

    invoke-interface {p1, p0}, Lio/reactivex/i;->a(Lio/reactivex/c;)Lio/reactivex/h;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/c;->k0(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final subscribe()Lio/reactivex/disposables/c;
    .locals 1

    new-instance v0, Lio/reactivex/internal/observers/n;

    invoke-direct {v0}, Lio/reactivex/internal/observers/n;-><init>()V

    invoke-virtual {p0, v0}, Lio/reactivex/c;->g(Lio/reactivex/f;)V

    return-object v0
.end method

.method public final u(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/c;
    .locals 6

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lio/reactivex/c;->v(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Z)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final v(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Z)Lio/reactivex/c;
    .locals 8

    const-string v0, "unit is null"

    invoke-static {p3, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p4, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/f;

    move-object v1, v0

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    invoke-direct/range {v1 .. v7}, Lio/reactivex/internal/operators/completable/f;-><init>(Lio/reactivex/h;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Z)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final w(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/c;
    .locals 1

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, v0}, Lio/reactivex/c;->x(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final x(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/c;
    .locals 0

    invoke-static {p1, p2, p3, p4}, Lio/reactivex/c;->d0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1, p0}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final y(Lio/reactivex/functions/a;)Lio/reactivex/c;
    .locals 1

    const-string v0, "onFinally is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/completable/g;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/completable/g;-><init>(Lio/reactivex/h;Lio/reactivex/functions/a;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final z(Lio/reactivex/functions/a;)Lio/reactivex/c;
    .locals 7

    invoke-static {}, Lio/reactivex/internal/functions/a;->g()Lio/reactivex/functions/g;

    move-result-object v1

    invoke-static {}, Lio/reactivex/internal/functions/a;->g()Lio/reactivex/functions/g;

    move-result-object v2

    sget-object v6, Lio/reactivex/internal/functions/a;->c:Lio/reactivex/functions/a;

    move-object v0, p0

    move-object v3, p1

    move-object v4, v6

    move-object v5, v6

    invoke-virtual/range {v0 .. v6}, Lio/reactivex/c;->D(Lio/reactivex/functions/g;Lio/reactivex/functions/g;Lio/reactivex/functions/a;Lio/reactivex/functions/a;Lio/reactivex/functions/a;Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method
