.class public final Lio/reactivex/internal/operators/observable/H1$b;
.super Ljava/util/concurrent/atomic/AtomicBoolean;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/D;
.implements Lio/reactivex/disposables/c;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/H1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "Lio/reactivex/D<",
        "TT;>;",
        "Lio/reactivex/disposables/c;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x2eb9e739d805fc76L


# instance fields
.field public final b:Lio/reactivex/D;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/D<",
            "-",
            "Lio/reactivex/Observable<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final c:J

.field public final d:J

.field public final e:I

.field public final f:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lio/reactivex/subjects/i<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public g:J

.field public volatile h:Z

.field public i:J

.field public j:Lio/reactivex/disposables/c;

.field public final k:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Lio/reactivex/D;JJI)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-",
            "Lio/reactivex/Observable<",
            "TT;>;>;JJI)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lio/reactivex/internal/operators/observable/H1$b;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/H1$b;->b:Lio/reactivex/D;

    iput-wide p2, p0, Lio/reactivex/internal/operators/observable/H1$b;->c:J

    iput-wide p4, p0, Lio/reactivex/internal/operators/observable/H1$b;->d:J

    iput p6, p0, Lio/reactivex/internal/operators/observable/H1$b;->e:I

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/H1$b;->f:Ljava/util/ArrayDeque;

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/operators/observable/H1$b;->h:Z

    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/internal/operators/observable/H1$b;->h:Z

    return v0
.end method

.method public onComplete()V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/H1$b;->f:Ljava/util/ArrayDeque;

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/reactivex/subjects/i;

    invoke-virtual {v1}, Lio/reactivex/subjects/i;->onComplete()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/H1$b;->b:Lio/reactivex/D;

    invoke-interface {v0}, Lio/reactivex/D;->onComplete()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/H1$b;->f:Ljava/util/ArrayDeque;

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/reactivex/subjects/i;

    invoke-virtual {v1, p1}, Lio/reactivex/subjects/i;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/H1$b;->b:Lio/reactivex/D;

    invoke-interface {v0, p1}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/H1$b;->f:Ljava/util/ArrayDeque;

    iget-wide v1, p0, Lio/reactivex/internal/operators/observable/H1$b;->g:J

    iget-wide v3, p0, Lio/reactivex/internal/operators/observable/H1$b;->d:J

    rem-long v5, v1, v3

    const-wide/16 v7, 0x0

    cmp-long v5, v5, v7

    if-nez v5, :cond_0

    iget-boolean v5, p0, Lio/reactivex/internal/operators/observable/H1$b;->h:Z

    if-nez v5, :cond_0

    iget-object v5, p0, Lio/reactivex/internal/operators/observable/H1$b;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    iget v5, p0, Lio/reactivex/internal/operators/observable/H1$b;->e:I

    invoke-static {v5, p0}, Lio/reactivex/subjects/i;->g(ILjava/lang/Runnable;)Lio/reactivex/subjects/i;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    iget-object v6, p0, Lio/reactivex/internal/operators/observable/H1$b;->b:Lio/reactivex/D;

    invoke-interface {v6, v5}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    :cond_0
    iget-wide v5, p0, Lio/reactivex/internal/operators/observable/H1$b;->i:J

    const-wide/16 v7, 0x1

    add-long/2addr v5, v7

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/reactivex/subjects/i;

    invoke-virtual {v10, p1}, Lio/reactivex/subjects/i;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-wide v9, p0, Lio/reactivex/internal/operators/observable/H1$b;->c:J

    cmp-long p1, v5, v9

    if-ltz p1, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/reactivex/subjects/i;

    invoke-virtual {p1}, Lio/reactivex/subjects/i;->onComplete()V

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lio/reactivex/internal/operators/observable/H1$b;->h:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/H1$b;->j:Lio/reactivex/disposables/c;

    invoke-interface {p1}, Lio/reactivex/disposables/c;->dispose()V

    return-void

    :cond_2
    sub-long/2addr v5, v3

    iput-wide v5, p0, Lio/reactivex/internal/operators/observable/H1$b;->i:J

    goto :goto_1

    :cond_3
    iput-wide v5, p0, Lio/reactivex/internal/operators/observable/H1$b;->i:J

    :goto_1
    add-long/2addr v1, v7

    iput-wide v1, p0, Lio/reactivex/internal/operators/observable/H1$b;->g:J

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/H1$b;->j:Lio/reactivex/disposables/c;

    invoke-static {v0, p1}, Lio/reactivex/internal/disposables/d;->j(Lio/reactivex/disposables/c;Lio/reactivex/disposables/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/H1$b;->j:Lio/reactivex/disposables/c;

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/H1$b;->b:Lio/reactivex/D;

    invoke-interface {p1, p0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    :cond_0
    return-void
.end method

.method public run()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/H1$b;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lio/reactivex/internal/operators/observable/H1$b;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/H1$b;->j:Lio/reactivex/disposables/c;

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    :cond_0
    return-void
.end method
