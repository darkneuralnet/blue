.class public final Lio/reactivex/internal/operators/flowable/c;
.super Lio/reactivex/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/c$c;,
        Lio/reactivex/internal/operators/flowable/c$b;,
        Lio/reactivex/internal/operators/flowable/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/k<",
        "TR;>;"
    }
.end annotation


# instance fields
.field public final c:[Lna4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lna4<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "+",
            "Lna4<",
            "+TT;>;>;"
        }
    .end annotation
.end field

.field public final e:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;"
        }
    .end annotation
.end field

.field public final f:I

.field public final g:Z


# direct methods
.method public constructor <init>([Lna4;Lio/reactivex/functions/o;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lna4<",
            "+TT;>;",
            "Lio/reactivex/functions/o<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;IZ)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/k;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/c;->c:[Lna4;

    const/4 p1, 0x0

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/c;->d:Ljava/lang/Iterable;

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/c;->e:Lio/reactivex/functions/o;

    iput p3, p0, Lio/reactivex/internal/operators/flowable/c;->f:I

    iput-boolean p4, p0, Lio/reactivex/internal/operators/flowable/c;->g:Z

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TR;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/c;->c:[Lna4;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    const/16 v0, 0x8

    new-array v0, v0, [Lna4;

    :try_start_0
    iget-object v2, p0, Lio/reactivex/internal/operators/flowable/c;->d:Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-string v3, "The iterator returned is null"

    invoke-static {v2, v3}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Iterator;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move v3, v1

    :goto_0
    :try_start_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    :try_start_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    const-string v5, "The publisher returned by the iterator is null"

    invoke-static {v4, v5}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lna4;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    array-length v5, v0

    if-ne v3, v5, :cond_1

    shr-int/lit8 v5, v3, 0x2

    add-int/2addr v5, v3

    new-array v5, v5, [Lna4;

    invoke-static {v0, v1, v5, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v5

    :cond_1
    add-int/lit8 v5, v3, 0x1

    aput-object v4, v0, v3

    move v3, v5

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lio/reactivex/internal/subscriptions/d;->c(Ljava/lang/Throwable;LhT5;)V

    return-void

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lio/reactivex/internal/subscriptions/d;->c(Ljava/lang/Throwable;LhT5;)V

    return-void

    :catchall_2
    move-exception v0

    invoke-static {v0}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lio/reactivex/internal/subscriptions/d;->c(Ljava/lang/Throwable;LhT5;)V

    return-void

    :cond_2
    array-length v3, v0

    :goto_1
    move v8, v3

    if-nez v8, :cond_3

    invoke-static {p1}, Lio/reactivex/internal/subscriptions/d;->a(LhT5;)V

    return-void

    :cond_3
    const/4 v2, 0x1

    if-ne v8, v2, :cond_4

    aget-object v0, v0, v1

    new-instance v1, Lio/reactivex/internal/operators/flowable/J$b;

    new-instance v2, Lio/reactivex/internal/operators/flowable/c$c;

    invoke-direct {v2, p0}, Lio/reactivex/internal/operators/flowable/c$c;-><init>(Lio/reactivex/internal/operators/flowable/c;)V

    invoke-direct {v1, p1, v2}, Lio/reactivex/internal/operators/flowable/J$b;-><init>(LhT5;Lio/reactivex/functions/o;)V

    invoke-interface {v0, v1}, Lna4;->c(LhT5;)V

    return-void

    :cond_4
    new-instance v1, Lio/reactivex/internal/operators/flowable/c$a;

    iget-object v4, p0, Lio/reactivex/internal/operators/flowable/c;->e:Lio/reactivex/functions/o;

    iget v6, p0, Lio/reactivex/internal/operators/flowable/c;->f:I

    iget-boolean v7, p0, Lio/reactivex/internal/operators/flowable/c;->g:Z

    move-object v2, v1

    move-object v3, p1

    move v5, v8

    invoke-direct/range {v2 .. v7}, Lio/reactivex/internal/operators/flowable/c$a;-><init>(LhT5;Lio/reactivex/functions/o;IIZ)V

    invoke-interface {p1, v1}, LhT5;->a(LoT5;)V

    invoke-virtual {v1, v0, v8}, Lio/reactivex/internal/operators/flowable/c$a;->m([Lna4;I)V

    return-void
.end method
