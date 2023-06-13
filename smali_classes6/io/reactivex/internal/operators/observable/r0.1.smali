.class public final Lio/reactivex/internal/operators/observable/r0;
.super Lio/reactivex/Observable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/r0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/Observable<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/E;

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public constructor <init>(JJJJLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/Observable;-><init>()V

    iput-wide p5, p0, Lio/reactivex/internal/operators/observable/r0;->e:J

    iput-wide p7, p0, Lio/reactivex/internal/operators/observable/r0;->f:J

    iput-object p9, p0, Lio/reactivex/internal/operators/observable/r0;->g:Ljava/util/concurrent/TimeUnit;

    iput-object p10, p0, Lio/reactivex/internal/operators/observable/r0;->b:Lio/reactivex/E;

    iput-wide p1, p0, Lio/reactivex/internal/operators/observable/r0;->c:J

    iput-wide p3, p0, Lio/reactivex/internal/operators/observable/r0;->d:J

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    new-instance v7, Lio/reactivex/internal/operators/observable/r0$a;

    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/r0;->c:J

    iget-wide v4, p0, Lio/reactivex/internal/operators/observable/r0;->d:J

    move-object v0, v7

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lio/reactivex/internal/operators/observable/r0$a;-><init>(Lio/reactivex/D;JJ)V

    invoke-interface {p1, v7}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/r0;->b:Lio/reactivex/E;

    instance-of p1, v0, Lio/reactivex/internal/schedulers/p;

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lio/reactivex/E;->b()Lio/reactivex/E$c;

    move-result-object v0

    invoke-virtual {v7, v0}, Lio/reactivex/internal/operators/observable/r0$a;->a(Lio/reactivex/disposables/c;)V

    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/r0;->e:J

    iget-wide v4, p0, Lio/reactivex/internal/operators/observable/r0;->f:J

    iget-object v6, p0, Lio/reactivex/internal/operators/observable/r0;->g:Ljava/util/concurrent/TimeUnit;

    move-object v1, v7

    invoke-virtual/range {v0 .. v6}, Lio/reactivex/E$c;->d(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/r0;->e:J

    iget-wide v4, p0, Lio/reactivex/internal/operators/observable/r0;->f:J

    iget-object v6, p0, Lio/reactivex/internal/operators/observable/r0;->g:Ljava/util/concurrent/TimeUnit;

    move-object v1, v7

    invoke-virtual/range {v0 .. v6}, Lio/reactivex/E;->f(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    move-result-object p1

    invoke-virtual {v7, p1}, Lio/reactivex/internal/operators/observable/r0$a;->a(Lio/reactivex/disposables/c;)V

    :goto_0
    return-void
.end method
