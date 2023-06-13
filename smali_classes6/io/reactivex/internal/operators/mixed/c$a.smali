.class public final Lio/reactivex/internal/operators/mixed/c$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/o;
.implements LoT5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/mixed/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/mixed/c$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lio/reactivex/o<",
        "TT;>;",
        "LoT5;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x7ed83da4674d8da5L


# instance fields
.field public final b:LhT5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LhT5<",
            "-TR;>;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/u<",
            "+TR;>;>;"
        }
    .end annotation
.end field

.field public final d:I

.field public final e:Ljava/util/concurrent/atomic/AtomicLong;

.field public final f:Lio/reactivex/internal/util/c;

.field public final g:Lio/reactivex/internal/operators/mixed/c$a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/operators/mixed/c$a$a<",
            "TR;>;"
        }
    .end annotation
.end field

.field public final h:Lio/reactivex/internal/fuseable/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/fuseable/i<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final i:Lio/reactivex/internal/util/j;

.field public j:LoT5;

.field public volatile k:Z

.field public volatile l:Z

.field public m:J

.field public n:I

.field public o:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TR;"
        }
    .end annotation
.end field

.field public volatile p:I


# direct methods
.method public constructor <init>(LhT5;Lio/reactivex/functions/o;ILio/reactivex/internal/util/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TR;>;",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/u<",
            "+TR;>;>;I",
            "Lio/reactivex/internal/util/j;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/mixed/c$a;->b:LhT5;

    iput-object p2, p0, Lio/reactivex/internal/operators/mixed/c$a;->c:Lio/reactivex/functions/o;

    iput p3, p0, Lio/reactivex/internal/operators/mixed/c$a;->d:I

    iput-object p4, p0, Lio/reactivex/internal/operators/mixed/c$a;->i:Lio/reactivex/internal/util/j;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/mixed/c$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance p1, Lio/reactivex/internal/util/c;

    invoke-direct {p1}, Lio/reactivex/internal/util/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/mixed/c$a;->f:Lio/reactivex/internal/util/c;

    new-instance p1, Lio/reactivex/internal/operators/mixed/c$a$a;

    invoke-direct {p1, p0}, Lio/reactivex/internal/operators/mixed/c$a$a;-><init>(Lio/reactivex/internal/operators/mixed/c$a;)V

    iput-object p1, p0, Lio/reactivex/internal/operators/mixed/c$a;->g:Lio/reactivex/internal/operators/mixed/c$a$a;

    new-instance p1, Lio/reactivex/internal/queue/b;

    invoke-direct {p1, p3}, Lio/reactivex/internal/queue/b;-><init>(I)V

    iput-object p1, p0, Lio/reactivex/internal/operators/mixed/c$a;->h:Lio/reactivex/internal/fuseable/i;

    return-void
.end method


# virtual methods
.method public a(LoT5;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/mixed/c$a;->j:LoT5;

    invoke-static {v0, p1}, Lio/reactivex/internal/subscriptions/g;->i(LoT5;LoT5;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/reactivex/internal/operators/mixed/c$a;->j:LoT5;

    iget-object v0, p0, Lio/reactivex/internal/operators/mixed/c$a;->b:LhT5;

    invoke-interface {v0, p0}, LhT5;->a(LoT5;)V

    iget v0, p0, Lio/reactivex/internal/operators/mixed/c$a;->d:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LoT5;->o(J)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 15

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/operators/mixed/c$a;->b:LhT5;

    iget-object v1, p0, Lio/reactivex/internal/operators/mixed/c$a;->i:Lio/reactivex/internal/util/j;

    iget-object v2, p0, Lio/reactivex/internal/operators/mixed/c$a;->h:Lio/reactivex/internal/fuseable/i;

    iget-object v3, p0, Lio/reactivex/internal/operators/mixed/c$a;->f:Lio/reactivex/internal/util/c;

    iget-object v4, p0, Lio/reactivex/internal/operators/mixed/c$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    iget v5, p0, Lio/reactivex/internal/operators/mixed/c$a;->d:I

    shr-int/lit8 v6, v5, 0x1

    sub-int/2addr v5, v6

    const/4 v6, 0x1

    move v7, v6

    :cond_1
    :goto_0
    iget-boolean v8, p0, Lio/reactivex/internal/operators/mixed/c$a;->l:Z

    const/4 v9, 0x0

    if-eqz v8, :cond_2

    invoke-interface {v2}, Lio/reactivex/internal/fuseable/j;->clear()V

    iput-object v9, p0, Lio/reactivex/internal/operators/mixed/c$a;->o:Ljava/lang/Object;

    goto/16 :goto_4

    :cond_2
    iget v8, p0, Lio/reactivex/internal/operators/mixed/c$a;->p:I

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_4

    sget-object v10, Lio/reactivex/internal/util/j;->b:Lio/reactivex/internal/util/j;

    if-eq v1, v10, :cond_3

    sget-object v10, Lio/reactivex/internal/util/j;->c:Lio/reactivex/internal/util/j;

    if-ne v1, v10, :cond_4

    if-nez v8, :cond_4

    :cond_3
    invoke-interface {v2}, Lio/reactivex/internal/fuseable/j;->clear()V

    iput-object v9, p0, Lio/reactivex/internal/operators/mixed/c$a;->o:Ljava/lang/Object;

    invoke-virtual {v3}, Lio/reactivex/internal/util/c;->b()Ljava/lang/Throwable;

    move-result-object v1

    invoke-interface {v0, v1}, LhT5;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_4
    const/4 v10, 0x0

    if-nez v8, :cond_a

    iget-boolean v8, p0, Lio/reactivex/internal/operators/mixed/c$a;->k:Z

    invoke-interface {v2}, Lio/reactivex/internal/fuseable/i;->poll()Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_5

    move v11, v6

    goto :goto_1

    :cond_5
    move v11, v10

    :goto_1
    if-eqz v8, :cond_7

    if-eqz v11, :cond_7

    invoke-virtual {v3}, Lio/reactivex/internal/util/c;->b()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_6

    invoke-interface {v0}, LhT5;->onComplete()V

    goto :goto_2

    :cond_6
    invoke-interface {v0, v1}, LhT5;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void

    :cond_7
    if-eqz v11, :cond_8

    goto :goto_4

    :cond_8
    iget v8, p0, Lio/reactivex/internal/operators/mixed/c$a;->n:I

    add-int/2addr v8, v6

    if-ne v8, v5, :cond_9

    iput v10, p0, Lio/reactivex/internal/operators/mixed/c$a;->n:I

    iget-object v8, p0, Lio/reactivex/internal/operators/mixed/c$a;->j:LoT5;

    int-to-long v10, v5

    invoke-interface {v8, v10, v11}, LoT5;->o(J)V

    goto :goto_3

    :cond_9
    iput v8, p0, Lio/reactivex/internal/operators/mixed/c$a;->n:I

    :goto_3
    :try_start_0
    iget-object v8, p0, Lio/reactivex/internal/operators/mixed/c$a;->c:Lio/reactivex/functions/o;

    invoke-interface {v8, v9}, Lio/reactivex/functions/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "The mapper returned a null MaybeSource"

    invoke-static {v8, v9}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/reactivex/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput v6, p0, Lio/reactivex/internal/operators/mixed/c$a;->p:I

    iget-object v9, p0, Lio/reactivex/internal/operators/mixed/c$a;->g:Lio/reactivex/internal/operators/mixed/c$a$a;

    invoke-interface {v8, v9}, Lio/reactivex/u;->a(Lio/reactivex/s;)V

    goto :goto_4

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    iget-object v4, p0, Lio/reactivex/internal/operators/mixed/c$a;->j:LoT5;

    invoke-interface {v4}, LoT5;->cancel()V

    invoke-interface {v2}, Lio/reactivex/internal/fuseable/j;->clear()V

    invoke-virtual {v3, v1}, Lio/reactivex/internal/util/c;->a(Ljava/lang/Throwable;)Z

    invoke-virtual {v3}, Lio/reactivex/internal/util/c;->b()Ljava/lang/Throwable;

    move-result-object v1

    invoke-interface {v0, v1}, LhT5;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_a
    const/4 v11, 0x2

    if-ne v8, v11, :cond_b

    iget-wide v11, p0, Lio/reactivex/internal/operators/mixed/c$a;->m:J

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v13

    cmp-long v8, v11, v13

    if-eqz v8, :cond_b

    iget-object v8, p0, Lio/reactivex/internal/operators/mixed/c$a;->o:Ljava/lang/Object;

    iput-object v9, p0, Lio/reactivex/internal/operators/mixed/c$a;->o:Ljava/lang/Object;

    invoke-interface {v0, v8}, LhT5;->onNext(Ljava/lang/Object;)V

    const-wide/16 v8, 0x1

    add-long/2addr v11, v8

    iput-wide v11, p0, Lio/reactivex/internal/operators/mixed/c$a;->m:J

    iput v10, p0, Lio/reactivex/internal/operators/mixed/c$a;->p:I

    goto/16 :goto_0

    :cond_b
    :goto_4
    neg-int v7, v7

    invoke-virtual {p0, v7}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v7

    if-nez v7, :cond_1

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lio/reactivex/internal/operators/mixed/c$a;->p:I

    invoke-virtual {p0}, Lio/reactivex/internal/operators/mixed/c$a;->b()V

    return-void
.end method

.method public cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/operators/mixed/c$a;->l:Z

    iget-object v0, p0, Lio/reactivex/internal/operators/mixed/c$a;->j:LoT5;

    invoke-interface {v0}, LoT5;->cancel()V

    iget-object v0, p0, Lio/reactivex/internal/operators/mixed/c$a;->g:Lio/reactivex/internal/operators/mixed/c$a$a;

    invoke-virtual {v0}, Lio/reactivex/internal/operators/mixed/c$a$a;->a()V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/mixed/c$a;->h:Lio/reactivex/internal/fuseable/i;

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/j;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/reactivex/internal/operators/mixed/c$a;->o:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public d(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/mixed/c$a;->f:Lio/reactivex/internal/util/c;

    invoke-virtual {v0, p1}, Lio/reactivex/internal/util/c;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lio/reactivex/internal/operators/mixed/c$a;->i:Lio/reactivex/internal/util/j;

    sget-object v0, Lio/reactivex/internal/util/j;->d:Lio/reactivex/internal/util/j;

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lio/reactivex/internal/operators/mixed/c$a;->j:LoT5;

    invoke-interface {p1}, LoT5;->cancel()V

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, Lio/reactivex/internal/operators/mixed/c$a;->p:I

    invoke-virtual {p0}, Lio/reactivex/internal/operators/mixed/c$a;->b()V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/reactivex/internal/operators/mixed/c$a;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lio/reactivex/internal/operators/mixed/c$a;->p:I

    invoke-virtual {p0}, Lio/reactivex/internal/operators/mixed/c$a;->b()V

    return-void
.end method

.method public o(J)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/mixed/c$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lio/reactivex/internal/util/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    invoke-virtual {p0}, Lio/reactivex/internal/operators/mixed/c$a;->b()V

    return-void
.end method

.method public onComplete()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/operators/mixed/c$a;->k:Z

    invoke-virtual {p0}, Lio/reactivex/internal/operators/mixed/c$a;->b()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/mixed/c$a;->f:Lio/reactivex/internal/util/c;

    invoke-virtual {v0, p1}, Lio/reactivex/internal/util/c;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lio/reactivex/internal/operators/mixed/c$a;->i:Lio/reactivex/internal/util/j;

    sget-object v0, Lio/reactivex/internal/util/j;->b:Lio/reactivex/internal/util/j;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lio/reactivex/internal/operators/mixed/c$a;->g:Lio/reactivex/internal/operators/mixed/c$a$a;

    invoke-virtual {p1}, Lio/reactivex/internal/operators/mixed/c$a$a;->a()V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/reactivex/internal/operators/mixed/c$a;->k:Z

    invoke-virtual {p0}, Lio/reactivex/internal/operators/mixed/c$a;->b()V

    goto :goto_0

    :cond_1
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

    iget-object v0, p0, Lio/reactivex/internal/operators/mixed/c$a;->h:Lio/reactivex/internal/fuseable/i;

    invoke-interface {v0, p1}, Lio/reactivex/internal/fuseable/j;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/reactivex/internal/operators/mixed/c$a;->j:LoT5;

    invoke-interface {p1}, LoT5;->cancel()V

    new-instance p1, Lio/reactivex/exceptions/MissingBackpressureException;

    const-string v0, "queue full?!"

    invoke-direct {p1, v0}, Lio/reactivex/exceptions/MissingBackpressureException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/reactivex/internal/operators/mixed/c$a;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lio/reactivex/internal/operators/mixed/c$a;->b()V

    return-void
.end method
