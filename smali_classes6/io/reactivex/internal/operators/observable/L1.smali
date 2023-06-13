.class public final Lio/reactivex/internal/operators/observable/L1;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/L1$c;,
        Lio/reactivex/internal/operators/observable/L1$a;,
        Lio/reactivex/internal/operators/observable/L1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/observable/a<",
        "TT;",
        "Lio/reactivex/Observable<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field public final c:J

.field public final d:J

.field public final e:Ljava/util/concurrent/TimeUnit;

.field public final f:Lio/reactivex/E;

.field public final g:J

.field public final h:I

.field public final i:Z


# direct methods
.method public constructor <init>(Lio/reactivex/B;JJLjava/util/concurrent/TimeUnit;Lio/reactivex/E;JIZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;JJ",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            "JIZ)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-wide p2, p0, Lio/reactivex/internal/operators/observable/L1;->c:J

    iput-wide p4, p0, Lio/reactivex/internal/operators/observable/L1;->d:J

    iput-object p6, p0, Lio/reactivex/internal/operators/observable/L1;->e:Ljava/util/concurrent/TimeUnit;

    iput-object p7, p0, Lio/reactivex/internal/operators/observable/L1;->f:Lio/reactivex/E;

    iput-wide p8, p0, Lio/reactivex/internal/operators/observable/L1;->g:J

    iput p10, p0, Lio/reactivex/internal/operators/observable/L1;->h:I

    iput-boolean p11, p0, Lio/reactivex/internal/operators/observable/L1;->i:Z

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-",
            "Lio/reactivex/Observable<",
            "TT;>;>;)V"
        }
    .end annotation

    new-instance v1, Lio/reactivex/observers/h;

    invoke-direct {v1, p1}, Lio/reactivex/observers/h;-><init>(Lio/reactivex/D;)V

    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/L1;->c:J

    iget-wide v4, p0, Lio/reactivex/internal/operators/observable/L1;->d:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_1

    iget-wide v7, p0, Lio/reactivex/internal/operators/observable/L1;->g:J

    const-wide v4, 0x7fffffffffffffffL

    cmp-long p1, v7, v4

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v7, Lio/reactivex/internal/operators/observable/L1$b;

    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/L1;->c:J

    iget-object v4, p0, Lio/reactivex/internal/operators/observable/L1;->e:Ljava/util/concurrent/TimeUnit;

    iget-object v5, p0, Lio/reactivex/internal/operators/observable/L1;->f:Lio/reactivex/E;

    iget v6, p0, Lio/reactivex/internal/operators/observable/L1;->h:I

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lio/reactivex/internal/operators/observable/L1$b;-><init>(Lio/reactivex/D;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;I)V

    invoke-interface {p1, v7}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void

    :cond_0
    iget-object p1, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v10, Lio/reactivex/internal/operators/observable/L1$a;

    iget-object v4, p0, Lio/reactivex/internal/operators/observable/L1;->e:Ljava/util/concurrent/TimeUnit;

    iget-object v5, p0, Lio/reactivex/internal/operators/observable/L1;->f:Lio/reactivex/E;

    iget v6, p0, Lio/reactivex/internal/operators/observable/L1;->h:I

    iget-boolean v9, p0, Lio/reactivex/internal/operators/observable/L1;->i:Z

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lio/reactivex/internal/operators/observable/L1$a;-><init>(Lio/reactivex/D;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;IJZ)V

    invoke-interface {p1, v10}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void

    :cond_1
    iget-object p1, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v9, Lio/reactivex/internal/operators/observable/L1$c;

    iget-object v6, p0, Lio/reactivex/internal/operators/observable/L1;->e:Ljava/util/concurrent/TimeUnit;

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/L1;->f:Lio/reactivex/E;

    invoke-virtual {v0}, Lio/reactivex/E;->b()Lio/reactivex/E$c;

    move-result-object v7

    iget v8, p0, Lio/reactivex/internal/operators/observable/L1;->h:I

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lio/reactivex/internal/operators/observable/L1$c;-><init>(Lio/reactivex/D;JJLjava/util/concurrent/TimeUnit;Lio/reactivex/E$c;I)V

    invoke-interface {p1, v9}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
