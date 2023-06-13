.class public final Lio/reactivex/internal/operators/observable/N1;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/N1$a;,
        Lio/reactivex/internal/operators/observable/N1$c;,
        Lio/reactivex/internal/operators/observable/N1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/observable/a<",
        "TT;TR;>;"
    }
.end annotation


# instance fields
.field public final c:[Lio/reactivex/B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/reactivex/B<",
            "*>;"
        }
    .end annotation
.end field

.field public final d:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "+",
            "Lio/reactivex/B<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final e:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-[",
            "Ljava/lang/Object;",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/B;Ljava/lang/Iterable;Lio/reactivex/functions/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/reactivex/B<",
            "*>;>;",
            "Lio/reactivex/functions/o<",
            "-[",
            "Ljava/lang/Object;",
            "TR;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/N1;->c:[Lio/reactivex/B;

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/N1;->d:Ljava/lang/Iterable;

    iput-object p3, p0, Lio/reactivex/internal/operators/observable/N1;->e:Lio/reactivex/functions/o;

    return-void
.end method

.method public constructor <init>(Lio/reactivex/B;[Lio/reactivex/B;Lio/reactivex/functions/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;[",
            "Lio/reactivex/B<",
            "*>;",
            "Lio/reactivex/functions/o<",
            "-[",
            "Ljava/lang/Object;",
            "TR;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/N1;->c:[Lio/reactivex/B;

    const/4 p1, 0x0

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/N1;->d:Ljava/lang/Iterable;

    iput-object p3, p0, Lio/reactivex/internal/operators/observable/N1;->e:Lio/reactivex/functions/o;

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TR;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/N1;->c:[Lio/reactivex/B;

    if-nez v0, :cond_1

    const/16 v0, 0x8

    new-array v0, v0, [Lio/reactivex/B;

    :try_start_0
    iget-object v1, p0, Lio/reactivex/internal/operators/observable/N1;->d:Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/reactivex/B;

    array-length v4, v0

    if-ne v2, v4, :cond_0

    shr-int/lit8 v4, v2, 0x1

    add-int/2addr v4, v2

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/reactivex/B;

    :cond_0
    add-int/lit8 v4, v2, 0x1

    aput-object v3, v0, v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v2, v4

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lio/reactivex/internal/disposables/e;->i(Ljava/lang/Throwable;Lio/reactivex/D;)V

    return-void

    :cond_1
    array-length v2, v0

    :cond_2
    if-nez v2, :cond_3

    new-instance v0, Lio/reactivex/internal/operators/observable/x0;

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v2, Lio/reactivex/internal/operators/observable/N1$a;

    invoke-direct {v2, p0}, Lio/reactivex/internal/operators/observable/N1$a;-><init>(Lio/reactivex/internal/operators/observable/N1;)V

    invoke-direct {v0, v1, v2}, Lio/reactivex/internal/operators/observable/x0;-><init>(Lio/reactivex/B;Lio/reactivex/functions/o;)V

    invoke-virtual {v0, p1}, Lio/reactivex/internal/operators/observable/x0;->subscribeActual(Lio/reactivex/D;)V

    return-void

    :cond_3
    new-instance v1, Lio/reactivex/internal/operators/observable/N1$b;

    iget-object v3, p0, Lio/reactivex/internal/operators/observable/N1;->e:Lio/reactivex/functions/o;

    invoke-direct {v1, p1, v3, v2}, Lio/reactivex/internal/operators/observable/N1$b;-><init>(Lio/reactivex/D;Lio/reactivex/functions/o;I)V

    invoke-interface {p1, v1}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-virtual {v1, v0, v2}, Lio/reactivex/internal/operators/observable/N1$b;->g([Lio/reactivex/B;I)V

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    invoke-interface {p1, v1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
