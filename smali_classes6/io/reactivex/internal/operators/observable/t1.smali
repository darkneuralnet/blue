.class public final Lio/reactivex/internal/operators/observable/t1;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/t1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/observable/a<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field public final c:J

.field public final d:J

.field public final e:Ljava/util/concurrent/TimeUnit;

.field public final f:Lio/reactivex/E;

.field public final g:I

.field public final h:Z


# direct methods
.method public constructor <init>(Lio/reactivex/B;JJLjava/util/concurrent/TimeUnit;Lio/reactivex/E;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;JJ",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            "IZ)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-wide p2, p0, Lio/reactivex/internal/operators/observable/t1;->c:J

    iput-wide p4, p0, Lio/reactivex/internal/operators/observable/t1;->d:J

    iput-object p6, p0, Lio/reactivex/internal/operators/observable/t1;->e:Ljava/util/concurrent/TimeUnit;

    iput-object p7, p0, Lio/reactivex/internal/operators/observable/t1;->f:Lio/reactivex/E;

    iput p8, p0, Lio/reactivex/internal/operators/observable/t1;->g:I

    iput-boolean p9, p0, Lio/reactivex/internal/operators/observable/t1;->h:Z

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v11, Lio/reactivex/internal/operators/observable/t1$a;

    iget-wide v3, p0, Lio/reactivex/internal/operators/observable/t1;->c:J

    iget-wide v5, p0, Lio/reactivex/internal/operators/observable/t1;->d:J

    iget-object v7, p0, Lio/reactivex/internal/operators/observable/t1;->e:Ljava/util/concurrent/TimeUnit;

    iget-object v8, p0, Lio/reactivex/internal/operators/observable/t1;->f:Lio/reactivex/E;

    iget v9, p0, Lio/reactivex/internal/operators/observable/t1;->g:I

    iget-boolean v10, p0, Lio/reactivex/internal/operators/observable/t1;->h:Z

    move-object v1, v11

    move-object v2, p1

    invoke-direct/range {v1 .. v10}, Lio/reactivex/internal/operators/observable/t1$a;-><init>(Lio/reactivex/D;JJLjava/util/concurrent/TimeUnit;Lio/reactivex/E;IZ)V

    invoke-interface {v0, v11}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
