.class public final Lio/reactivex/internal/operators/observable/q;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/q$a;,
        Lio/reactivex/internal/operators/observable/q$c;,
        Lio/reactivex/internal/operators/observable/q$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U::",
        "Ljava/util/Collection<",
        "-TT;>;>",
        "Lio/reactivex/internal/operators/observable/a<",
        "TT;TU;>;"
    }
.end annotation


# instance fields
.field public final c:J

.field public final d:J

.field public final e:Ljava/util/concurrent/TimeUnit;

.field public final f:Lio/reactivex/E;

.field public final g:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "TU;>;"
        }
    .end annotation
.end field

.field public final h:I

.field public final i:Z


# direct methods
.method public constructor <init>(Lio/reactivex/B;JJLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Ljava/util/concurrent/Callable;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;JJ",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            "Ljava/util/concurrent/Callable<",
            "TU;>;IZ)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-wide p2, p0, Lio/reactivex/internal/operators/observable/q;->c:J

    iput-wide p4, p0, Lio/reactivex/internal/operators/observable/q;->d:J

    iput-object p6, p0, Lio/reactivex/internal/operators/observable/q;->e:Ljava/util/concurrent/TimeUnit;

    iput-object p7, p0, Lio/reactivex/internal/operators/observable/q;->f:Lio/reactivex/E;

    iput-object p8, p0, Lio/reactivex/internal/operators/observable/q;->g:Ljava/util/concurrent/Callable;

    iput p9, p0, Lio/reactivex/internal/operators/observable/q;->h:I

    iput-boolean p10, p0, Lio/reactivex/internal/operators/observable/q;->i:Z

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TU;>;)V"
        }
    .end annotation

    iget-wide v0, p0, Lio/reactivex/internal/operators/observable/q;->c:J

    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/q;->d:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget v0, p0, Lio/reactivex/internal/operators/observable/q;->h:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v8, Lio/reactivex/internal/operators/observable/q$b;

    new-instance v2, Lio/reactivex/observers/h;

    invoke-direct {v2, p1}, Lio/reactivex/observers/h;-><init>(Lio/reactivex/D;)V

    iget-object v3, p0, Lio/reactivex/internal/operators/observable/q;->g:Ljava/util/concurrent/Callable;

    iget-wide v4, p0, Lio/reactivex/internal/operators/observable/q;->c:J

    iget-object v6, p0, Lio/reactivex/internal/operators/observable/q;->e:Ljava/util/concurrent/TimeUnit;

    iget-object v7, p0, Lio/reactivex/internal/operators/observable/q;->f:Lio/reactivex/E;

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lio/reactivex/internal/operators/observable/q$b;-><init>(Lio/reactivex/D;Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V

    invoke-interface {v0, v8}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/q;->f:Lio/reactivex/E;

    invoke-virtual {v0}, Lio/reactivex/E;->b()Lio/reactivex/E$c;

    move-result-object v9

    iget-wide v0, p0, Lio/reactivex/internal/operators/observable/q;->c:J

    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/q;->d:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v10, Lio/reactivex/internal/operators/observable/q$a;

    new-instance v2, Lio/reactivex/observers/h;

    invoke-direct {v2, p1}, Lio/reactivex/observers/h;-><init>(Lio/reactivex/D;)V

    iget-object v3, p0, Lio/reactivex/internal/operators/observable/q;->g:Ljava/util/concurrent/Callable;

    iget-wide v4, p0, Lio/reactivex/internal/operators/observable/q;->c:J

    iget-object v6, p0, Lio/reactivex/internal/operators/observable/q;->e:Ljava/util/concurrent/TimeUnit;

    iget v7, p0, Lio/reactivex/internal/operators/observable/q;->h:I

    iget-boolean v8, p0, Lio/reactivex/internal/operators/observable/q;->i:Z

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lio/reactivex/internal/operators/observable/q$a;-><init>(Lio/reactivex/D;Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;IZLio/reactivex/E$c;)V

    invoke-interface {v0, v10}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void

    :cond_1
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v10, Lio/reactivex/internal/operators/observable/q$c;

    new-instance v2, Lio/reactivex/observers/h;

    invoke-direct {v2, p1}, Lio/reactivex/observers/h;-><init>(Lio/reactivex/D;)V

    iget-object v3, p0, Lio/reactivex/internal/operators/observable/q;->g:Ljava/util/concurrent/Callable;

    iget-wide v4, p0, Lio/reactivex/internal/operators/observable/q;->c:J

    iget-wide v6, p0, Lio/reactivex/internal/operators/observable/q;->d:J

    iget-object v8, p0, Lio/reactivex/internal/operators/observable/q;->e:Ljava/util/concurrent/TimeUnit;

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lio/reactivex/internal/operators/observable/q$c;-><init>(Lio/reactivex/D;Ljava/util/concurrent/Callable;JJLjava/util/concurrent/TimeUnit;Lio/reactivex/E$c;)V

    invoke-interface {v0, v10}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
