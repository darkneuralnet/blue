.class public final Lio/reactivex/internal/operators/observable/Q0;
.super Lio/reactivex/Observable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/Q0$b;,
        Lio/reactivex/internal/operators/observable/Q0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/Observable<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/observables/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/observables/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:I

.field public final d:J

.field public final e:Ljava/util/concurrent/TimeUnit;

.field public final f:Lio/reactivex/E;

.field public g:Lio/reactivex/internal/operators/observable/Q0$a;


# direct methods
.method public constructor <init>(Lio/reactivex/observables/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/observables/a<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lio/reactivex/internal/operators/observable/Q0;-><init>(Lio/reactivex/observables/a;IJLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V

    return-void
.end method

.method public constructor <init>(Lio/reactivex/observables/a;IJLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/observables/a<",
            "TT;>;IJ",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/Observable;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/Q0;->b:Lio/reactivex/observables/a;

    iput p2, p0, Lio/reactivex/internal/operators/observable/Q0;->c:I

    iput-wide p3, p0, Lio/reactivex/internal/operators/observable/Q0;->d:J

    iput-object p5, p0, Lio/reactivex/internal/operators/observable/Q0;->e:Ljava/util/concurrent/TimeUnit;

    iput-object p6, p0, Lio/reactivex/internal/operators/observable/Q0;->f:Lio/reactivex/E;

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/internal/operators/observable/Q0$a;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/Q0;->g:Lio/reactivex/internal/operators/observable/Q0$a;

    if-eqz v0, :cond_4

    if-eq v0, p1, :cond_0

    goto :goto_1

    :cond_0
    iget-wide v0, p1, Lio/reactivex/internal/operators/observable/Q0$a;->d:J

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    iput-wide v0, p1, Lio/reactivex/internal/operators/observable/Q0$a;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    iget-boolean v0, p1, Lio/reactivex/internal/operators/observable/Q0$a;->e:Z

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lio/reactivex/internal/operators/observable/Q0;->d:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, Lio/reactivex/internal/operators/observable/Q0;->h(Lio/reactivex/internal/operators/observable/Q0$a;)V

    monitor-exit p0

    return-void

    :cond_2
    new-instance v0, Lio/reactivex/internal/disposables/h;

    invoke-direct {v0}, Lio/reactivex/internal/disposables/h;-><init>()V

    iput-object v0, p1, Lio/reactivex/internal/operators/observable/Q0$a;->c:Lio/reactivex/disposables/c;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/Q0;->f:Lio/reactivex/E;

    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/Q0;->d:J

    iget-object v4, p0, Lio/reactivex/internal/operators/observable/Q0;->e:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, p1, v2, v3, v4}, Lio/reactivex/E;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/internal/disposables/h;->a(Lio/reactivex/disposables/c;)Z

    return-void

    :cond_3
    :goto_0
    :try_start_1
    monitor-exit p0

    return-void

    :cond_4
    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public c(Lio/reactivex/internal/operators/observable/Q0$a;)V
    .locals 1

    iget-object v0, p1, Lio/reactivex/internal/operators/observable/Q0$a;->c:Lio/reactivex/disposables/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    const/4 v0, 0x0

    iput-object v0, p1, Lio/reactivex/internal/operators/observable/Q0$a;->c:Lio/reactivex/disposables/c;

    :cond_0
    return-void
.end method

.method public e(Lio/reactivex/internal/operators/observable/Q0$a;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/Q0;->b:Lio/reactivex/observables/a;

    instance-of v1, v0, Lio/reactivex/disposables/c;

    if-eqz v1, :cond_0

    check-cast v0, Lio/reactivex/disposables/c;

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lio/reactivex/internal/disposables/g;

    if-eqz v1, :cond_1

    check-cast v0, Lio/reactivex/internal/disposables/g;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/reactivex/disposables/c;

    invoke-interface {v0, p1}, Lio/reactivex/internal/disposables/g;->d(Lio/reactivex/disposables/c;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public g(Lio/reactivex/internal/operators/observable/Q0$a;)V
    .locals 8

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/Q0;->b:Lio/reactivex/observables/a;

    instance-of v0, v0, Lio/reactivex/internal/operators/observable/J0;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/Q0;->g:Lio/reactivex/internal/operators/observable/Q0$a;

    if-eqz v0, :cond_0

    if-ne v0, p1, :cond_0

    iput-object v1, p0, Lio/reactivex/internal/operators/observable/Q0;->g:Lio/reactivex/internal/operators/observable/Q0$a;

    invoke-virtual {p0, p1}, Lio/reactivex/internal/operators/observable/Q0;->c(Lio/reactivex/internal/operators/observable/Q0$a;)V

    :cond_0
    iget-wide v0, p1, Lio/reactivex/internal/operators/observable/Q0$a;->d:J

    sub-long/2addr v0, v4

    iput-wide v0, p1, Lio/reactivex/internal/operators/observable/Q0$a;->d:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, Lio/reactivex/internal/operators/observable/Q0;->e(Lio/reactivex/internal/operators/observable/Q0$a;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/Q0;->g:Lio/reactivex/internal/operators/observable/Q0$a;

    if-eqz v0, :cond_2

    if-ne v0, p1, :cond_2

    invoke-virtual {p0, p1}, Lio/reactivex/internal/operators/observable/Q0;->c(Lio/reactivex/internal/operators/observable/Q0$a;)V

    iget-wide v6, p1, Lio/reactivex/internal/operators/observable/Q0$a;->d:J

    sub-long/2addr v6, v4

    iput-wide v6, p1, Lio/reactivex/internal/operators/observable/Q0$a;->d:J

    cmp-long v0, v6, v2

    if-nez v0, :cond_2

    iput-object v1, p0, Lio/reactivex/internal/operators/observable/Q0;->g:Lio/reactivex/internal/operators/observable/Q0$a;

    invoke-virtual {p0, p1}, Lio/reactivex/internal/operators/observable/Q0;->e(Lio/reactivex/internal/operators/observable/Q0$a;)V

    :cond_2
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public h(Lio/reactivex/internal/operators/observable/Q0$a;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-wide v0, p1, Lio/reactivex/internal/operators/observable/Q0$a;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/Q0;->g:Lio/reactivex/internal/operators/observable/Q0$a;

    if-ne p1, v0, :cond_2

    const/4 v0, 0x0

    iput-object v0, p0, Lio/reactivex/internal/operators/observable/Q0;->g:Lio/reactivex/internal/operators/observable/Q0$a;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/disposables/c;

    invoke-static {p1}, Lio/reactivex/internal/disposables/d;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/Q0;->b:Lio/reactivex/observables/a;

    instance-of v2, v1, Lio/reactivex/disposables/c;

    if-eqz v2, :cond_0

    check-cast v1, Lio/reactivex/disposables/c;

    invoke-interface {v1}, Lio/reactivex/disposables/c;->dispose()V

    goto :goto_0

    :cond_0
    instance-of v2, v1, Lio/reactivex/internal/disposables/g;

    if-eqz v2, :cond_2

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p1, Lio/reactivex/internal/operators/observable/Q0$a;->f:Z

    goto :goto_0

    :cond_1
    check-cast v1, Lio/reactivex/internal/disposables/g;

    invoke-interface {v1, v0}, Lio/reactivex/internal/disposables/g;->d(Lio/reactivex/disposables/c;)V

    :cond_2
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public subscribeActual(Lio/reactivex/D;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/Q0;->g:Lio/reactivex/internal/operators/observable/Q0$a;

    if-nez v0, :cond_0

    new-instance v0, Lio/reactivex/internal/operators/observable/Q0$a;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/observable/Q0$a;-><init>(Lio/reactivex/internal/operators/observable/Q0;)V

    iput-object v0, p0, Lio/reactivex/internal/operators/observable/Q0;->g:Lio/reactivex/internal/operators/observable/Q0$a;

    :cond_0
    iget-wide v1, v0, Lio/reactivex/internal/operators/observable/Q0$a;->d:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-nez v3, :cond_1

    iget-object v3, v0, Lio/reactivex/internal/operators/observable/Q0$a;->c:Lio/reactivex/disposables/c;

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lio/reactivex/disposables/c;->dispose()V

    :cond_1
    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, v0, Lio/reactivex/internal/operators/observable/Q0$a;->d:J

    iget-boolean v3, v0, Lio/reactivex/internal/operators/observable/Q0$a;->e:Z

    if-nez v3, :cond_2

    iget v3, p0, Lio/reactivex/internal/operators/observable/Q0;->c:I

    int-to-long v3, v3

    cmp-long v1, v1, v3

    if-nez v1, :cond_2

    const/4 v1, 0x1

    iput-boolean v1, v0, Lio/reactivex/internal/operators/observable/Q0$a;->e:Z

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, Lio/reactivex/internal/operators/observable/Q0;->b:Lio/reactivex/observables/a;

    new-instance v3, Lio/reactivex/internal/operators/observable/Q0$b;

    invoke-direct {v3, p1, p0, v0}, Lio/reactivex/internal/operators/observable/Q0$b;-><init>(Lio/reactivex/D;Lio/reactivex/internal/operators/observable/Q0;Lio/reactivex/internal/operators/observable/Q0$a;)V

    invoke-virtual {v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/D;)V

    if-eqz v1, :cond_3

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/Q0;->b:Lio/reactivex/observables/a;

    invoke-virtual {p1, v0}, Lio/reactivex/observables/a;->g(Lio/reactivex/functions/g;)V

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
