.class public final Lio/reactivex/internal/operators/flowable/b;
.super Lio/reactivex/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/b$a;,
        Lio/reactivex/internal/operators/flowable/b$c;,
        Lio/reactivex/internal/operators/flowable/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U::",
        "Ljava/util/Collection<",
        "-TT;>;>",
        "Lio/reactivex/internal/operators/flowable/a<",
        "TT;TU;>;"
    }
.end annotation


# instance fields
.field public final d:J

.field public final e:J

.field public final f:Ljava/util/concurrent/TimeUnit;

.field public final g:Lio/reactivex/E;

.field public final h:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "TU;>;"
        }
    .end annotation
.end field

.field public final i:I

.field public final j:Z


# direct methods
.method public constructor <init>(Lio/reactivex/k;JJLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Ljava/util/concurrent/Callable;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;JJ",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            "Ljava/util/concurrent/Callable<",
            "TU;>;IZ)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/flowable/a;-><init>(Lio/reactivex/k;)V

    iput-wide p2, p0, Lio/reactivex/internal/operators/flowable/b;->d:J

    iput-wide p4, p0, Lio/reactivex/internal/operators/flowable/b;->e:J

    iput-object p6, p0, Lio/reactivex/internal/operators/flowable/b;->f:Ljava/util/concurrent/TimeUnit;

    iput-object p7, p0, Lio/reactivex/internal/operators/flowable/b;->g:Lio/reactivex/E;

    iput-object p8, p0, Lio/reactivex/internal/operators/flowable/b;->h:Ljava/util/concurrent/Callable;

    iput p9, p0, Lio/reactivex/internal/operators/flowable/b;->i:I

    iput-boolean p10, p0, Lio/reactivex/internal/operators/flowable/b;->j:Z

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TU;>;)V"
        }
    .end annotation

    iget-wide v0, p0, Lio/reactivex/internal/operators/flowable/b;->d:J

    iget-wide v2, p0, Lio/reactivex/internal/operators/flowable/b;->e:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget v0, p0, Lio/reactivex/internal/operators/flowable/b;->i:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    new-instance v8, Lio/reactivex/internal/operators/flowable/b$b;

    new-instance v2, Lio/reactivex/subscribers/a;

    invoke-direct {v2, p1}, Lio/reactivex/subscribers/a;-><init>(LhT5;)V

    iget-object v3, p0, Lio/reactivex/internal/operators/flowable/b;->h:Ljava/util/concurrent/Callable;

    iget-wide v4, p0, Lio/reactivex/internal/operators/flowable/b;->d:J

    iget-object v6, p0, Lio/reactivex/internal/operators/flowable/b;->f:Ljava/util/concurrent/TimeUnit;

    iget-object v7, p0, Lio/reactivex/internal/operators/flowable/b;->g:Lio/reactivex/E;

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lio/reactivex/internal/operators/flowable/b$b;-><init>(LhT5;Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V

    invoke-virtual {v0, v8}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/b;->g:Lio/reactivex/E;

    invoke-virtual {v0}, Lio/reactivex/E;->b()Lio/reactivex/E$c;

    move-result-object v9

    iget-wide v0, p0, Lio/reactivex/internal/operators/flowable/b;->d:J

    iget-wide v2, p0, Lio/reactivex/internal/operators/flowable/b;->e:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    new-instance v10, Lio/reactivex/internal/operators/flowable/b$a;

    new-instance v2, Lio/reactivex/subscribers/a;

    invoke-direct {v2, p1}, Lio/reactivex/subscribers/a;-><init>(LhT5;)V

    iget-object v3, p0, Lio/reactivex/internal/operators/flowable/b;->h:Ljava/util/concurrent/Callable;

    iget-wide v4, p0, Lio/reactivex/internal/operators/flowable/b;->d:J

    iget-object v6, p0, Lio/reactivex/internal/operators/flowable/b;->f:Ljava/util/concurrent/TimeUnit;

    iget v7, p0, Lio/reactivex/internal/operators/flowable/b;->i:I

    iget-boolean v8, p0, Lio/reactivex/internal/operators/flowable/b;->j:Z

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lio/reactivex/internal/operators/flowable/b$a;-><init>(LhT5;Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;IZLio/reactivex/E$c;)V

    invoke-virtual {v0, v10}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    return-void

    :cond_1
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    new-instance v10, Lio/reactivex/internal/operators/flowable/b$c;

    new-instance v2, Lio/reactivex/subscribers/a;

    invoke-direct {v2, p1}, Lio/reactivex/subscribers/a;-><init>(LhT5;)V

    iget-object v3, p0, Lio/reactivex/internal/operators/flowable/b;->h:Ljava/util/concurrent/Callable;

    iget-wide v4, p0, Lio/reactivex/internal/operators/flowable/b;->d:J

    iget-wide v6, p0, Lio/reactivex/internal/operators/flowable/b;->e:J

    iget-object v8, p0, Lio/reactivex/internal/operators/flowable/b;->f:Ljava/util/concurrent/TimeUnit;

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lio/reactivex/internal/operators/flowable/b$c;-><init>(LhT5;Ljava/util/concurrent/Callable;JJLjava/util/concurrent/TimeUnit;Lio/reactivex/E$c;)V

    invoke-virtual {v0, v10}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    return-void
.end method
