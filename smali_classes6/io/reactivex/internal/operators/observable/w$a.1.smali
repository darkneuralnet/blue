.class public final Lio/reactivex/internal/operators/observable/w$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/D;
.implements Lio/reactivex/disposables/c;
.implements Lio/reactivex/internal/observers/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lio/reactivex/D<",
        "TT;>;",
        "Lio/reactivex/disposables/c;",
        "Lio/reactivex/internal/observers/r<",
        "TR;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x7023f1bcc236905eL


# instance fields
.field public final b:Lio/reactivex/D;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/D<",
            "-TR;>;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/B<",
            "+TR;>;>;"
        }
    .end annotation
.end field

.field public final d:I

.field public final e:I

.field public final f:Lio/reactivex/internal/util/j;

.field public final g:Lio/reactivex/internal/util/c;

.field public final h:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lio/reactivex/internal/observers/q<",
            "TR;>;>;"
        }
    .end annotation
.end field

.field public i:Lio/reactivex/internal/fuseable/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/fuseable/j<",
            "TT;>;"
        }
    .end annotation
.end field

.field public j:Lio/reactivex/disposables/c;

.field public volatile k:Z

.field public l:I

.field public volatile m:Z

.field public n:Lio/reactivex/internal/observers/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/observers/q<",
            "TR;>;"
        }
    .end annotation
.end field

.field public o:I


# direct methods
.method public constructor <init>(Lio/reactivex/D;Lio/reactivex/functions/o;IILio/reactivex/internal/util/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TR;>;",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/B<",
            "+TR;>;>;II",
            "Lio/reactivex/internal/util/j;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/w$a;->b:Lio/reactivex/D;

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/w$a;->c:Lio/reactivex/functions/o;

    iput p3, p0, Lio/reactivex/internal/operators/observable/w$a;->d:I

    iput p4, p0, Lio/reactivex/internal/operators/observable/w$a;->e:I

    iput-object p5, p0, Lio/reactivex/internal/operators/observable/w$a;->f:Lio/reactivex/internal/util/j;

    new-instance p1, Lio/reactivex/internal/util/c;

    invoke-direct {p1}, Lio/reactivex/internal/util/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/w$a;->g:Lio/reactivex/internal/util/c;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/w$a;->h:Ljava/util/ArrayDeque;

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/internal/observers/q;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/observers/q<",
            "TR;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/w$a;->g:Lio/reactivex/internal/util/c;

    invoke-virtual {v0, p2}, Lio/reactivex/internal/util/c;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p2, p0, Lio/reactivex/internal/operators/observable/w$a;->f:Lio/reactivex/internal/util/j;

    sget-object v0, Lio/reactivex/internal/util/j;->b:Lio/reactivex/internal/util/j;

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lio/reactivex/internal/operators/observable/w$a;->j:Lio/reactivex/disposables/c;

    invoke-interface {p2}, Lio/reactivex/disposables/c;->dispose()V

    :cond_0
    invoke-virtual {p1}, Lio/reactivex/internal/observers/q;->c()V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/w$a;->b()V

    goto :goto_0

    :cond_1
    invoke-static {p2}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public b()V
    .locals 13

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/w$a;->i:Lio/reactivex/internal/fuseable/j;

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/w$a;->h:Ljava/util/ArrayDeque;

    iget-object v2, p0, Lio/reactivex/internal/operators/observable/w$a;->b:Lio/reactivex/D;

    iget-object v3, p0, Lio/reactivex/internal/operators/observable/w$a;->f:Lio/reactivex/internal/util/j;

    const/4 v4, 0x1

    move v5, v4

    :cond_1
    :goto_0
    iget v6, p0, Lio/reactivex/internal/operators/observable/w$a;->o:I

    :goto_1
    iget v7, p0, Lio/reactivex/internal/operators/observable/w$a;->d:I

    if-eq v6, v7, :cond_5

    iget-boolean v7, p0, Lio/reactivex/internal/operators/observable/w$a;->m:Z

    if-eqz v7, :cond_2

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/j;->clear()V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/w$a;->g()V

    return-void

    :cond_2
    sget-object v7, Lio/reactivex/internal/util/j;->b:Lio/reactivex/internal/util/j;

    if-ne v3, v7, :cond_3

    iget-object v7, p0, Lio/reactivex/internal/operators/observable/w$a;->g:Lio/reactivex/internal/util/c;

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Throwable;

    if-eqz v7, :cond_3

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/j;->clear()V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/w$a;->g()V

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/w$a;->g:Lio/reactivex/internal/util/c;

    invoke-virtual {v0}, Lio/reactivex/internal/util/c;->b()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v2, v0}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_3
    :try_start_0
    invoke-interface {v0}, Lio/reactivex/internal/fuseable/j;->poll()Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_4

    goto :goto_2

    :cond_4
    iget-object v8, p0, Lio/reactivex/internal/operators/observable/w$a;->c:Lio/reactivex/functions/o;

    invoke-interface {v8, v7}, Lio/reactivex/functions/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const-string v8, "The mapper returned a null ObservableSource"

    invoke-static {v7, v8}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/reactivex/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v8, Lio/reactivex/internal/observers/q;

    iget v9, p0, Lio/reactivex/internal/operators/observable/w$a;->e:I

    invoke-direct {v8, p0, v9}, Lio/reactivex/internal/observers/q;-><init>(Lio/reactivex/internal/observers/r;I)V

    invoke-virtual {v1, v8}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    invoke-interface {v7, v8}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    iget-object v3, p0, Lio/reactivex/internal/operators/observable/w$a;->j:Lio/reactivex/disposables/c;

    invoke-interface {v3}, Lio/reactivex/disposables/c;->dispose()V

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/j;->clear()V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/w$a;->g()V

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/w$a;->g:Lio/reactivex/internal/util/c;

    invoke-virtual {v0, v1}, Lio/reactivex/internal/util/c;->a(Ljava/lang/Throwable;)Z

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/w$a;->g:Lio/reactivex/internal/util/c;

    invoke-virtual {v0}, Lio/reactivex/internal/util/c;->b()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v2, v0}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_5
    :goto_2
    iput v6, p0, Lio/reactivex/internal/operators/observable/w$a;->o:I

    iget-boolean v6, p0, Lio/reactivex/internal/operators/observable/w$a;->m:Z

    if-eqz v6, :cond_6

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/j;->clear()V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/w$a;->g()V

    return-void

    :cond_6
    sget-object v6, Lio/reactivex/internal/util/j;->b:Lio/reactivex/internal/util/j;

    if-ne v3, v6, :cond_7

    iget-object v6, p0, Lio/reactivex/internal/operators/observable/w$a;->g:Lio/reactivex/internal/util/c;

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Throwable;

    if-eqz v6, :cond_7

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/j;->clear()V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/w$a;->g()V

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/w$a;->g:Lio/reactivex/internal/util/c;

    invoke-virtual {v0}, Lio/reactivex/internal/util/c;->b()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v2, v0}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_7
    iget-object v6, p0, Lio/reactivex/internal/operators/observable/w$a;->n:Lio/reactivex/internal/observers/q;

    const/4 v7, 0x0

    if-nez v6, :cond_d

    sget-object v6, Lio/reactivex/internal/util/j;->c:Lio/reactivex/internal/util/j;

    if-ne v3, v6, :cond_8

    iget-object v6, p0, Lio/reactivex/internal/operators/observable/w$a;->g:Lio/reactivex/internal/util/c;

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Throwable;

    if-eqz v6, :cond_8

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/j;->clear()V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/w$a;->g()V

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/w$a;->g:Lio/reactivex/internal/util/c;

    invoke-virtual {v0}, Lio/reactivex/internal/util/c;->b()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v2, v0}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_8
    iget-boolean v6, p0, Lio/reactivex/internal/operators/observable/w$a;->k:Z

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/reactivex/internal/observers/q;

    if-nez v8, :cond_9

    move v9, v4

    goto :goto_3

    :cond_9
    move v9, v7

    :goto_3
    if-eqz v6, :cond_b

    if-eqz v9, :cond_b

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/w$a;->g:Lio/reactivex/internal/util/c;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_a

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/j;->clear()V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/w$a;->g()V

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/w$a;->g:Lio/reactivex/internal/util/c;

    invoke-virtual {v0}, Lio/reactivex/internal/util/c;->b()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v2, v0}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_a
    invoke-interface {v2}, Lio/reactivex/D;->onComplete()V

    :goto_4
    return-void

    :cond_b
    if-nez v9, :cond_c

    iput-object v8, p0, Lio/reactivex/internal/operators/observable/w$a;->n:Lio/reactivex/internal/observers/q;

    :cond_c
    move-object v6, v8

    :cond_d
    if-eqz v6, :cond_13

    invoke-virtual {v6}, Lio/reactivex/internal/observers/q;->b()Lio/reactivex/internal/fuseable/j;

    move-result-object v8

    :goto_5
    iget-boolean v9, p0, Lio/reactivex/internal/operators/observable/w$a;->m:Z

    if-eqz v9, :cond_e

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/j;->clear()V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/w$a;->g()V

    return-void

    :cond_e
    invoke-virtual {v6}, Lio/reactivex/internal/observers/q;->a()Z

    move-result v9

    sget-object v10, Lio/reactivex/internal/util/j;->b:Lio/reactivex/internal/util/j;

    if-ne v3, v10, :cond_f

    iget-object v10, p0, Lio/reactivex/internal/operators/observable/w$a;->g:Lio/reactivex/internal/util/c;

    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Throwable;

    if-eqz v10, :cond_f

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/j;->clear()V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/w$a;->g()V

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/w$a;->g:Lio/reactivex/internal/util/c;

    invoke-virtual {v0}, Lio/reactivex/internal/util/c;->b()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v2, v0}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_f
    const/4 v10, 0x0

    :try_start_1
    invoke-interface {v8}, Lio/reactivex/internal/fuseable/j;->poll()Ljava/lang/Object;

    move-result-object v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v11, :cond_10

    move v12, v4

    goto :goto_6

    :cond_10
    move v12, v7

    :goto_6
    if-eqz v9, :cond_11

    if-eqz v12, :cond_11

    iput-object v10, p0, Lio/reactivex/internal/operators/observable/w$a;->n:Lio/reactivex/internal/observers/q;

    iget v6, p0, Lio/reactivex/internal/operators/observable/w$a;->o:I

    sub-int/2addr v6, v4

    iput v6, p0, Lio/reactivex/internal/operators/observable/w$a;->o:I

    goto/16 :goto_0

    :cond_11
    if-eqz v12, :cond_12

    goto :goto_7

    :cond_12
    invoke-interface {v2, v11}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    goto :goto_5

    :catchall_1
    move-exception v6

    invoke-static {v6}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    iget-object v7, p0, Lio/reactivex/internal/operators/observable/w$a;->g:Lio/reactivex/internal/util/c;

    invoke-virtual {v7, v6}, Lio/reactivex/internal/util/c;->a(Ljava/lang/Throwable;)Z

    iput-object v10, p0, Lio/reactivex/internal/operators/observable/w$a;->n:Lio/reactivex/internal/observers/q;

    iget v6, p0, Lio/reactivex/internal/operators/observable/w$a;->o:I

    sub-int/2addr v6, v4

    iput v6, p0, Lio/reactivex/internal/operators/observable/w$a;->o:I

    goto/16 :goto_0

    :cond_13
    :goto_7
    neg-int v5, v5

    invoke-virtual {p0, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v5

    if-nez v5, :cond_1

    return-void
.end method

.method public c(Lio/reactivex/internal/observers/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/observers/q<",
            "TR;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lio/reactivex/internal/observers/q;->c()V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/w$a;->b()V

    return-void
.end method

.method public d(Lio/reactivex/internal/observers/q;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/observers/q<",
            "TR;>;TR;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lio/reactivex/internal/observers/q;->b()Lio/reactivex/internal/fuseable/j;

    move-result-object p1

    invoke-interface {p1, p2}, Lio/reactivex/internal/fuseable/j;->offer(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/w$a;->b()V

    return-void
.end method

.method public dispose()V
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/internal/operators/observable/w$a;->m:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/operators/observable/w$a;->m:Z

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/w$a;->j:Lio/reactivex/disposables/c;

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/w$a;->h()V

    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/internal/operators/observable/w$a;->m:Z

    return v0
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/w$a;->n:Lio/reactivex/internal/observers/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/reactivex/internal/observers/q;->dispose()V

    :cond_0
    :goto_0
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/w$a;->h:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/internal/observers/q;

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Lio/reactivex/internal/observers/q;->dispose()V

    goto :goto_0
.end method

.method public h()V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/w$a;->i:Lio/reactivex/internal/fuseable/j;

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/j;->clear()V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/w$a;->g()V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    :cond_1
    return-void
.end method

.method public onComplete()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/operators/observable/w$a;->k:Z

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/w$a;->b()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/w$a;->g:Lio/reactivex/internal/util/c;

    invoke-virtual {v0, p1}, Lio/reactivex/internal/util/c;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/reactivex/internal/operators/observable/w$a;->k:Z

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/w$a;->b()V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget v0, p0, Lio/reactivex/internal/operators/observable/w$a;->l:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/w$a;->i:Lio/reactivex/internal/fuseable/j;

    invoke-interface {v0, p1}, Lio/reactivex/internal/fuseable/j;->offer(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/w$a;->b()V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/w$a;->j:Lio/reactivex/disposables/c;

    invoke-static {v0, p1}, Lio/reactivex/internal/disposables/d;->j(Lio/reactivex/disposables/c;Lio/reactivex/disposables/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/w$a;->j:Lio/reactivex/disposables/c;

    instance-of v0, p1, Lio/reactivex/internal/fuseable/e;

    if-eqz v0, :cond_1

    check-cast p1, Lio/reactivex/internal/fuseable/e;

    const/4 v0, 0x3

    invoke-interface {p1, v0}, Lio/reactivex/internal/fuseable/f;->b(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iput v0, p0, Lio/reactivex/internal/operators/observable/w$a;->l:I

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/w$a;->i:Lio/reactivex/internal/fuseable/j;

    iput-boolean v1, p0, Lio/reactivex/internal/operators/observable/w$a;->k:Z

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/w$a;->b:Lio/reactivex/D;

    invoke-interface {p1, p0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/w$a;->b()V

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iput v0, p0, Lio/reactivex/internal/operators/observable/w$a;->l:I

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/w$a;->i:Lio/reactivex/internal/fuseable/j;

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/w$a;->b:Lio/reactivex/D;

    invoke-interface {p1, p0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    return-void

    :cond_1
    new-instance p1, Lio/reactivex/internal/queue/c;

    iget v0, p0, Lio/reactivex/internal/operators/observable/w$a;->e:I

    invoke-direct {p1, v0}, Lio/reactivex/internal/queue/c;-><init>(I)V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/w$a;->i:Lio/reactivex/internal/fuseable/j;

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/w$a;->b:Lio/reactivex/D;

    invoke-interface {p1, p0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    :cond_2
    return-void
.end method
