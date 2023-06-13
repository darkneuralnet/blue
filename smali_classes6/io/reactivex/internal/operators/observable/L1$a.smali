.class public final Lio/reactivex/internal/operators/observable/L1$a;
.super Lio/reactivex/internal/observers/t;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/disposables/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/L1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/L1$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/observers/t<",
        "TT;",
        "Ljava/lang/Object;",
        "Lio/reactivex/Observable<",
        "TT;>;>;",
        "Lio/reactivex/disposables/c;"
    }
.end annotation


# instance fields
.field public final h:J

.field public final i:Ljava/util/concurrent/TimeUnit;

.field public final j:Lio/reactivex/E;

.field public final k:I

.field public final l:Z

.field public final m:J

.field public final n:Lio/reactivex/E$c;

.field public o:J

.field public p:J

.field public q:Lio/reactivex/disposables/c;

.field public r:Lio/reactivex/subjects/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/i<",
            "TT;>;"
        }
    .end annotation
.end field

.field public volatile s:Z

.field public final t:Lio/reactivex/internal/disposables/h;


# direct methods
.method public constructor <init>(Lio/reactivex/D;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;IJZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-",
            "Lio/reactivex/Observable<",
            "TT;>;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            "IJZ)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/queue/a;

    invoke-direct {v0}, Lio/reactivex/internal/queue/a;-><init>()V

    invoke-direct {p0, p1, v0}, Lio/reactivex/internal/observers/t;-><init>(Lio/reactivex/D;Lio/reactivex/internal/fuseable/i;)V

    new-instance p1, Lio/reactivex/internal/disposables/h;

    invoke-direct {p1}, Lio/reactivex/internal/disposables/h;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/L1$a;->t:Lio/reactivex/internal/disposables/h;

    iput-wide p2, p0, Lio/reactivex/internal/operators/observable/L1$a;->h:J

    iput-object p4, p0, Lio/reactivex/internal/operators/observable/L1$a;->i:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lio/reactivex/internal/operators/observable/L1$a;->j:Lio/reactivex/E;

    iput p6, p0, Lio/reactivex/internal/operators/observable/L1$a;->k:I

    iput-wide p7, p0, Lio/reactivex/internal/operators/observable/L1$a;->m:J

    iput-boolean p9, p0, Lio/reactivex/internal/operators/observable/L1$a;->l:Z

    if-eqz p9, :cond_0

    invoke-virtual {p5}, Lio/reactivex/E;->b()Lio/reactivex/E$c;

    move-result-object p1

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/L1$a;->n:Lio/reactivex/E$c;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/L1$a;->n:Lio/reactivex/E$c;

    :goto_0
    return-void
.end method

.method public static synthetic k(Lio/reactivex/internal/operators/observable/L1$a;)Z
    .locals 0

    iget-boolean p0, p0, Lio/reactivex/internal/observers/t;->e:Z

    return p0
.end method

.method public static synthetic l(Lio/reactivex/internal/operators/observable/L1$a;)Lio/reactivex/internal/fuseable/i;
    .locals 0

    iget-object p0, p0, Lio/reactivex/internal/observers/t;->d:Lio/reactivex/internal/fuseable/i;

    return-object p0
.end method


# virtual methods
.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/observers/t;->e:Z

    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/internal/observers/t;->e:Z

    return v0
.end method

.method public m()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/L1$a;->t:Lio/reactivex/internal/disposables/h;

    invoke-static {v0}, Lio/reactivex/internal/disposables/d;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/L1$a;->n:Lio/reactivex/E$c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    :cond_0
    return-void
.end method

.method public n()V
    .locals 13

    iget-object v0, p0, Lio/reactivex/internal/observers/t;->d:Lio/reactivex/internal/fuseable/i;

    check-cast v0, Lio/reactivex/internal/queue/a;

    iget-object v1, p0, Lio/reactivex/internal/observers/t;->c:Lio/reactivex/D;

    iget-object v2, p0, Lio/reactivex/internal/operators/observable/L1$a;->r:Lio/reactivex/subjects/i;

    const/4 v3, 0x1

    move v4, v3

    :cond_0
    :goto_0
    iget-boolean v5, p0, Lio/reactivex/internal/operators/observable/L1$a;->s:Z

    if-eqz v5, :cond_1

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/L1$a;->q:Lio/reactivex/disposables/c;

    invoke-interface {v1}, Lio/reactivex/disposables/c;->dispose()V

    invoke-virtual {v0}, Lio/reactivex/internal/queue/a;->clear()V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/L1$a;->m()V

    return-void

    :cond_1
    iget-boolean v5, p0, Lio/reactivex/internal/observers/t;->f:Z

    invoke-virtual {v0}, Lio/reactivex/internal/queue/a;->poll()Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_2

    move v7, v3

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    :goto_1
    instance-of v8, v6, Lio/reactivex/internal/operators/observable/L1$a$a;

    if-eqz v5, :cond_5

    if-nez v7, :cond_3

    if-eqz v8, :cond_5

    :cond_3
    const/4 v1, 0x0

    iput-object v1, p0, Lio/reactivex/internal/operators/observable/L1$a;->r:Lio/reactivex/subjects/i;

    invoke-virtual {v0}, Lio/reactivex/internal/queue/a;->clear()V

    iget-object v0, p0, Lio/reactivex/internal/observers/t;->g:Ljava/lang/Throwable;

    if-eqz v0, :cond_4

    invoke-virtual {v2, v0}, Lio/reactivex/subjects/i;->onError(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v2}, Lio/reactivex/subjects/i;->onComplete()V

    :goto_2
    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/L1$a;->m()V

    return-void

    :cond_5
    if-eqz v7, :cond_6

    neg-int v4, v4

    invoke-virtual {p0, v4}, Lio/reactivex/internal/observers/t;->b(I)I

    move-result v4

    if-nez v4, :cond_0

    return-void

    :cond_6
    const-wide/16 v9, 0x0

    if-eqz v8, :cond_8

    check-cast v6, Lio/reactivex/internal/operators/observable/L1$a$a;

    iget-boolean v5, p0, Lio/reactivex/internal/operators/observable/L1$a;->l:Z

    if-eqz v5, :cond_7

    iget-wide v7, p0, Lio/reactivex/internal/operators/observable/L1$a;->p:J

    iget-wide v5, v6, Lio/reactivex/internal/operators/observable/L1$a$a;->b:J

    cmp-long v5, v7, v5

    if-nez v5, :cond_0

    :cond_7
    invoke-virtual {v2}, Lio/reactivex/subjects/i;->onComplete()V

    iput-wide v9, p0, Lio/reactivex/internal/operators/observable/L1$a;->o:J

    iget v2, p0, Lio/reactivex/internal/operators/observable/L1$a;->k:I

    invoke-static {v2}, Lio/reactivex/subjects/i;->e(I)Lio/reactivex/subjects/i;

    move-result-object v2

    iput-object v2, p0, Lio/reactivex/internal/operators/observable/L1$a;->r:Lio/reactivex/subjects/i;

    invoke-interface {v1, v2}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    :cond_8
    invoke-static {v6}, Lio/reactivex/internal/util/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v5}, Lio/reactivex/subjects/i;->onNext(Ljava/lang/Object;)V

    iget-wide v5, p0, Lio/reactivex/internal/operators/observable/L1$a;->o:J

    const-wide/16 v7, 0x1

    add-long/2addr v5, v7

    iget-wide v11, p0, Lio/reactivex/internal/operators/observable/L1$a;->m:J

    cmp-long v11, v5, v11

    if-ltz v11, :cond_9

    iget-wide v5, p0, Lio/reactivex/internal/operators/observable/L1$a;->p:J

    add-long/2addr v5, v7

    iput-wide v5, p0, Lio/reactivex/internal/operators/observable/L1$a;->p:J

    iput-wide v9, p0, Lio/reactivex/internal/operators/observable/L1$a;->o:J

    invoke-virtual {v2}, Lio/reactivex/subjects/i;->onComplete()V

    iget v2, p0, Lio/reactivex/internal/operators/observable/L1$a;->k:I

    invoke-static {v2}, Lio/reactivex/subjects/i;->e(I)Lio/reactivex/subjects/i;

    move-result-object v2

    iput-object v2, p0, Lio/reactivex/internal/operators/observable/L1$a;->r:Lio/reactivex/subjects/i;

    iget-object v5, p0, Lio/reactivex/internal/observers/t;->c:Lio/reactivex/D;

    invoke-interface {v5, v2}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    iget-boolean v5, p0, Lio/reactivex/internal/operators/observable/L1$a;->l:Z

    if-eqz v5, :cond_0

    iget-object v5, p0, Lio/reactivex/internal/operators/observable/L1$a;->t:Lio/reactivex/internal/disposables/h;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/reactivex/disposables/c;

    invoke-interface {v5}, Lio/reactivex/disposables/c;->dispose()V

    iget-object v6, p0, Lio/reactivex/internal/operators/observable/L1$a;->n:Lio/reactivex/E$c;

    new-instance v7, Lio/reactivex/internal/operators/observable/L1$a$a;

    iget-wide v8, p0, Lio/reactivex/internal/operators/observable/L1$a;->p:J

    invoke-direct {v7, v8, v9, p0}, Lio/reactivex/internal/operators/observable/L1$a$a;-><init>(JLio/reactivex/internal/operators/observable/L1$a;)V

    iget-wide v10, p0, Lio/reactivex/internal/operators/observable/L1$a;->h:J

    iget-object v12, p0, Lio/reactivex/internal/operators/observable/L1$a;->i:Ljava/util/concurrent/TimeUnit;

    move-wide v8, v10

    invoke-virtual/range {v6 .. v12}, Lio/reactivex/E$c;->d(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    move-result-object v6

    iget-object v7, p0, Lio/reactivex/internal/operators/observable/L1$a;->t:Lio/reactivex/internal/disposables/h;

    invoke-virtual {v7, v5, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-interface {v6}, Lio/reactivex/disposables/c;->dispose()V

    goto/16 :goto_0

    :cond_9
    iput-wide v5, p0, Lio/reactivex/internal/operators/observable/L1$a;->o:J

    goto/16 :goto_0
.end method

.method public onComplete()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/observers/t;->f:Z

    invoke-virtual {p0}, Lio/reactivex/internal/observers/t;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/L1$a;->n()V

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/observers/t;->c:Lio/reactivex/D;

    invoke-interface {v0}, Lio/reactivex/D;->onComplete()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iput-object p1, p0, Lio/reactivex/internal/observers/t;->g:Ljava/lang/Throwable;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/observers/t;->f:Z

    invoke-virtual {p0}, Lio/reactivex/internal/observers/t;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/L1$a;->n()V

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/observers/t;->c:Lio/reactivex/D;

    invoke-interface {v0, p1}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lio/reactivex/internal/operators/observable/L1$a;->s:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lio/reactivex/internal/observers/t;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/L1$a;->r:Lio/reactivex/subjects/i;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/i;->onNext(Ljava/lang/Object;)V

    iget-wide v1, p0, Lio/reactivex/internal/operators/observable/L1$a;->o:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iget-wide v5, p0, Lio/reactivex/internal/operators/observable/L1$a;->m:J

    cmp-long p1, v1, v5

    if-ltz p1, :cond_1

    iget-wide v1, p0, Lio/reactivex/internal/operators/observable/L1$a;->p:J

    add-long/2addr v1, v3

    iput-wide v1, p0, Lio/reactivex/internal/operators/observable/L1$a;->p:J

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lio/reactivex/internal/operators/observable/L1$a;->o:J

    invoke-virtual {v0}, Lio/reactivex/subjects/i;->onComplete()V

    iget p1, p0, Lio/reactivex/internal/operators/observable/L1$a;->k:I

    invoke-static {p1}, Lio/reactivex/subjects/i;->e(I)Lio/reactivex/subjects/i;

    move-result-object p1

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/L1$a;->r:Lio/reactivex/subjects/i;

    iget-object v0, p0, Lio/reactivex/internal/observers/t;->c:Lio/reactivex/D;

    invoke-interface {v0, p1}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lio/reactivex/internal/operators/observable/L1$a;->l:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/L1$a;->t:Lio/reactivex/internal/disposables/h;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/reactivex/disposables/c;

    invoke-interface {p1}, Lio/reactivex/disposables/c;->dispose()V

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/L1$a;->n:Lio/reactivex/E$c;

    new-instance v1, Lio/reactivex/internal/operators/observable/L1$a$a;

    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/L1$a;->p:J

    invoke-direct {v1, v2, v3, p0}, Lio/reactivex/internal/operators/observable/L1$a$a;-><init>(JLio/reactivex/internal/operators/observable/L1$a;)V

    iget-wide v4, p0, Lio/reactivex/internal/operators/observable/L1$a;->h:J

    iget-object v6, p0, Lio/reactivex/internal/operators/observable/L1$a;->i:Ljava/util/concurrent/TimeUnit;

    move-wide v2, v4

    invoke-virtual/range {v0 .. v6}, Lio/reactivex/E$c;->d(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    move-result-object p1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/L1$a;->t:Lio/reactivex/internal/disposables/h;

    invoke-static {v0, p1}, Lio/reactivex/internal/disposables/d;->c(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/disposables/c;)Z

    goto :goto_0

    :cond_1
    iput-wide v1, p0, Lio/reactivex/internal/operators/observable/L1$a;->o:J

    :cond_2
    :goto_0
    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Lio/reactivex/internal/observers/t;->b(I)I

    move-result p1

    if-nez p1, :cond_4

    return-void

    :cond_3
    iget-object v0, p0, Lio/reactivex/internal/observers/t;->d:Lio/reactivex/internal/fuseable/i;

    invoke-static {p1}, Lio/reactivex/internal/util/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lio/reactivex/internal/fuseable/j;->offer(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lio/reactivex/internal/observers/t;->a()Z

    move-result p1

    if-nez p1, :cond_4

    return-void

    :cond_4
    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/L1$a;->n()V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 8

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/L1$a;->q:Lio/reactivex/disposables/c;

    invoke-static {v0, p1}, Lio/reactivex/internal/disposables/d;->j(Lio/reactivex/disposables/c;Lio/reactivex/disposables/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/L1$a;->q:Lio/reactivex/disposables/c;

    iget-object p1, p0, Lio/reactivex/internal/observers/t;->c:Lio/reactivex/D;

    invoke-interface {p1, p0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-boolean v0, p0, Lio/reactivex/internal/observers/t;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lio/reactivex/internal/operators/observable/L1$a;->k:I

    invoke-static {v0}, Lio/reactivex/subjects/i;->e(I)Lio/reactivex/subjects/i;

    move-result-object v0

    iput-object v0, p0, Lio/reactivex/internal/operators/observable/L1$a;->r:Lio/reactivex/subjects/i;

    invoke-interface {p1, v0}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    new-instance v2, Lio/reactivex/internal/operators/observable/L1$a$a;

    iget-wide v0, p0, Lio/reactivex/internal/operators/observable/L1$a;->p:J

    invoke-direct {v2, v0, v1, p0}, Lio/reactivex/internal/operators/observable/L1$a$a;-><init>(JLio/reactivex/internal/operators/observable/L1$a;)V

    iget-boolean p1, p0, Lio/reactivex/internal/operators/observable/L1$a;->l:Z

    if-eqz p1, :cond_1

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/L1$a;->n:Lio/reactivex/E$c;

    iget-wide v5, p0, Lio/reactivex/internal/operators/observable/L1$a;->h:J

    iget-object v7, p0, Lio/reactivex/internal/operators/observable/L1$a;->i:Ljava/util/concurrent/TimeUnit;

    move-wide v3, v5

    invoke-virtual/range {v1 .. v7}, Lio/reactivex/E$c;->d(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lio/reactivex/internal/operators/observable/L1$a;->j:Lio/reactivex/E;

    iget-wide v5, p0, Lio/reactivex/internal/operators/observable/L1$a;->h:J

    iget-object v7, p0, Lio/reactivex/internal/operators/observable/L1$a;->i:Ljava/util/concurrent/TimeUnit;

    move-wide v3, v5

    invoke-virtual/range {v1 .. v7}, Lio/reactivex/E;->f(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    move-result-object p1

    :goto_0
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/L1$a;->t:Lio/reactivex/internal/disposables/h;

    invoke-virtual {v0, p1}, Lio/reactivex/internal/disposables/h;->a(Lio/reactivex/disposables/c;)Z

    :cond_2
    return-void
.end method
