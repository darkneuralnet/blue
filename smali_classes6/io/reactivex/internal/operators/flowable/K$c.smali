.class public final Lio/reactivex/internal/operators/flowable/K$c;
.super Lio/reactivex/internal/operators/flowable/K$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/flowable/K$a<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x3f1a97e8f84a341aL


# instance fields
.field public final o:LhT5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LhT5<",
            "-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LhT5;Lio/reactivex/E$c;ZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;",
            "Lio/reactivex/E$c;",
            "ZI)V"
        }
    .end annotation

    invoke-direct {p0, p2, p3, p4}, Lio/reactivex/internal/operators/flowable/K$a;-><init>(Lio/reactivex/E$c;ZI)V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/K$c;->o:LhT5;

    return-void
.end method


# virtual methods
.method public a(LoT5;)V
    .locals 3

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/K$a;->g:LoT5;

    invoke-static {v0, p1}, Lio/reactivex/internal/subscriptions/g;->i(LoT5;LoT5;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/K$a;->g:LoT5;

    instance-of v0, p1, Lio/reactivex/internal/fuseable/g;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lio/reactivex/internal/fuseable/g;

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Lio/reactivex/internal/fuseable/f;->b(I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iput v2, p0, Lio/reactivex/internal/operators/flowable/K$a;->l:I

    iput-object v0, p0, Lio/reactivex/internal/operators/flowable/K$a;->h:Lio/reactivex/internal/fuseable/j;

    iput-boolean v2, p0, Lio/reactivex/internal/operators/flowable/K$a;->j:Z

    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/K$c;->o:LhT5;

    invoke-interface {p1, p0}, LhT5;->a(LoT5;)V

    return-void

    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iput v2, p0, Lio/reactivex/internal/operators/flowable/K$a;->l:I

    iput-object v0, p0, Lio/reactivex/internal/operators/flowable/K$a;->h:Lio/reactivex/internal/fuseable/j;

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/K$c;->o:LhT5;

    invoke-interface {v0, p0}, LhT5;->a(LoT5;)V

    iget v0, p0, Lio/reactivex/internal/operators/flowable/K$a;->d:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LoT5;->o(J)V

    return-void

    :cond_1
    new-instance v0, Lio/reactivex/internal/queue/b;

    iget v1, p0, Lio/reactivex/internal/operators/flowable/K$a;->d:I

    invoke-direct {v0, v1}, Lio/reactivex/internal/queue/b;-><init>(I)V

    iput-object v0, p0, Lio/reactivex/internal/operators/flowable/K$a;->h:Lio/reactivex/internal/fuseable/j;

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/K$c;->o:LhT5;

    invoke-interface {v0, p0}, LhT5;->a(LoT5;)V

    iget v0, p0, Lio/reactivex/internal/operators/flowable/K$a;->d:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LoT5;->o(J)V

    :cond_2
    return-void
.end method

.method public d()V
    .locals 12

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/K$c;->o:LhT5;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/K$a;->h:Lio/reactivex/internal/fuseable/j;

    iget-wide v2, p0, Lio/reactivex/internal/operators/flowable/K$a;->m:J

    const/4 v4, 0x1

    move v5, v4

    :cond_0
    :goto_0
    iget-object v6, p0, Lio/reactivex/internal/operators/flowable/K$a;->f:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v6

    :cond_1
    :goto_1
    cmp-long v8, v2, v6

    if-eqz v8, :cond_6

    iget-boolean v9, p0, Lio/reactivex/internal/operators/flowable/K$a;->j:Z

    :try_start_0
    invoke-interface {v1}, Lio/reactivex/internal/fuseable/j;->poll()Ljava/lang/Object;

    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v10, :cond_2

    move v11, v4

    goto :goto_2

    :cond_2
    const/4 v11, 0x0

    :goto_2
    invoke-virtual {p0, v9, v11, v0}, Lio/reactivex/internal/operators/flowable/K$a;->c(ZZLhT5;)Z

    move-result v9

    if-eqz v9, :cond_3

    return-void

    :cond_3
    if-eqz v11, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v0, v10}, LhT5;->onNext(Ljava/lang/Object;)V

    const-wide/16 v8, 0x1

    add-long/2addr v2, v8

    iget v8, p0, Lio/reactivex/internal/operators/flowable/K$a;->e:I

    int-to-long v8, v8

    cmp-long v8, v2, v8

    if-nez v8, :cond_1

    const-wide v8, 0x7fffffffffffffffL

    cmp-long v8, v6, v8

    if-eqz v8, :cond_5

    iget-object v6, p0, Lio/reactivex/internal/operators/flowable/K$a;->f:Ljava/util/concurrent/atomic/AtomicLong;

    neg-long v7, v2

    invoke-virtual {v6, v7, v8}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide v6

    :cond_5
    iget-object v8, p0, Lio/reactivex/internal/operators/flowable/K$a;->g:LoT5;

    invoke-interface {v8, v2, v3}, LoT5;->o(J)V

    const-wide/16 v2, 0x0

    goto :goto_1

    :catchall_0
    move-exception v2

    invoke-static {v2}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    iput-boolean v4, p0, Lio/reactivex/internal/operators/flowable/K$a;->i:Z

    iget-object v3, p0, Lio/reactivex/internal/operators/flowable/K$a;->g:LoT5;

    invoke-interface {v3}, LoT5;->cancel()V

    invoke-interface {v1}, Lio/reactivex/internal/fuseable/j;->clear()V

    invoke-interface {v0, v2}, LhT5;->onError(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/K$a;->b:Lio/reactivex/E$c;

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    return-void

    :cond_6
    :goto_3
    if-nez v8, :cond_7

    iget-boolean v6, p0, Lio/reactivex/internal/operators/flowable/K$a;->j:Z

    invoke-interface {v1}, Lio/reactivex/internal/fuseable/j;->isEmpty()Z

    move-result v7

    invoke-virtual {p0, v6, v7, v0}, Lio/reactivex/internal/operators/flowable/K$a;->c(ZZLhT5;)Z

    move-result v6

    if-eqz v6, :cond_7

    return-void

    :cond_7
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v6

    if-ne v5, v6, :cond_8

    iput-wide v2, p0, Lio/reactivex/internal/operators/flowable/K$a;->m:J

    neg-int v5, v5

    invoke-virtual {p0, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v5

    if-nez v5, :cond_0

    return-void

    :cond_8
    move v5, v6

    goto :goto_0
.end method

.method public e()V
    .locals 5

    const/4 v0, 0x1

    move v1, v0

    :cond_0
    iget-boolean v2, p0, Lio/reactivex/internal/operators/flowable/K$a;->i:Z

    if-eqz v2, :cond_1

    return-void

    :cond_1
    iget-boolean v2, p0, Lio/reactivex/internal/operators/flowable/K$a;->j:Z

    iget-object v3, p0, Lio/reactivex/internal/operators/flowable/K$c;->o:LhT5;

    const/4 v4, 0x0

    invoke-interface {v3, v4}, LhT5;->onNext(Ljava/lang/Object;)V

    if-eqz v2, :cond_3

    iput-boolean v0, p0, Lio/reactivex/internal/operators/flowable/K$a;->i:Z

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/K$a;->k:Ljava/lang/Throwable;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/K$c;->o:LhT5;

    invoke-interface {v1, v0}, LhT5;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/K$c;->o:LhT5;

    invoke-interface {v0}, LhT5;->onComplete()V

    :goto_0
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/K$a;->b:Lio/reactivex/E$c;

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    return-void

    :cond_3
    neg-int v1, v1

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v1

    if-nez v1, :cond_0

    return-void
.end method

.method public g()V
    .locals 10

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/K$c;->o:LhT5;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/K$a;->h:Lio/reactivex/internal/fuseable/j;

    iget-wide v2, p0, Lio/reactivex/internal/operators/flowable/K$a;->m:J

    const/4 v4, 0x1

    move v5, v4

    :cond_0
    :goto_0
    iget-object v6, p0, Lio/reactivex/internal/operators/flowable/K$a;->f:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v6

    :goto_1
    cmp-long v8, v2, v6

    if-eqz v8, :cond_3

    :try_start_0
    invoke-interface {v1}, Lio/reactivex/internal/fuseable/j;->poll()Ljava/lang/Object;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v9, p0, Lio/reactivex/internal/operators/flowable/K$a;->i:Z

    if-eqz v9, :cond_1

    return-void

    :cond_1
    if-nez v8, :cond_2

    iput-boolean v4, p0, Lio/reactivex/internal/operators/flowable/K$a;->i:Z

    invoke-interface {v0}, LhT5;->onComplete()V

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/K$a;->b:Lio/reactivex/E$c;

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    return-void

    :cond_2
    invoke-interface {v0, v8}, LhT5;->onNext(Ljava/lang/Object;)V

    const-wide/16 v8, 0x1

    add-long/2addr v2, v8

    goto :goto_1

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    iput-boolean v4, p0, Lio/reactivex/internal/operators/flowable/K$a;->i:Z

    iget-object v2, p0, Lio/reactivex/internal/operators/flowable/K$a;->g:LoT5;

    invoke-interface {v2}, LoT5;->cancel()V

    invoke-interface {v0, v1}, LhT5;->onError(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/K$a;->b:Lio/reactivex/E$c;

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    return-void

    :cond_3
    iget-boolean v6, p0, Lio/reactivex/internal/operators/flowable/K$a;->i:Z

    if-eqz v6, :cond_4

    return-void

    :cond_4
    invoke-interface {v1}, Lio/reactivex/internal/fuseable/j;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_5

    iput-boolean v4, p0, Lio/reactivex/internal/operators/flowable/K$a;->i:Z

    invoke-interface {v0}, LhT5;->onComplete()V

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/K$a;->b:Lio/reactivex/E$c;

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    return-void

    :cond_5
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v6

    if-ne v5, v6, :cond_6

    iput-wide v2, p0, Lio/reactivex/internal/operators/flowable/K$a;->m:J

    neg-int v5, v5

    invoke-virtual {p0, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v5

    if-nez v5, :cond_0

    return-void

    :cond_6
    move v5, v6

    goto :goto_0
.end method

.method public poll()Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/K$a;->h:Lio/reactivex/internal/fuseable/j;

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/j;->poll()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v1, p0, Lio/reactivex/internal/operators/flowable/K$a;->l:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    iget-wide v1, p0, Lio/reactivex/internal/operators/flowable/K$a;->m:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iget v3, p0, Lio/reactivex/internal/operators/flowable/K$a;->e:I

    int-to-long v3, v3

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    const-wide/16 v3, 0x0

    iput-wide v3, p0, Lio/reactivex/internal/operators/flowable/K$a;->m:J

    iget-object v3, p0, Lio/reactivex/internal/operators/flowable/K$a;->g:LoT5;

    invoke-interface {v3, v1, v2}, LoT5;->o(J)V

    goto :goto_0

    :cond_0
    iput-wide v1, p0, Lio/reactivex/internal/operators/flowable/K$a;->m:J

    :cond_1
    :goto_0
    return-object v0
.end method
