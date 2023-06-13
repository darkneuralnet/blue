.class public final Lio/reactivex/internal/operators/observable/q0;
.super Lio/reactivex/Observable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/q0$a;
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

.field public final e:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public constructor <init>(JJLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/Observable;-><init>()V

    iput-wide p1, p0, Lio/reactivex/internal/operators/observable/q0;->c:J

    iput-wide p3, p0, Lio/reactivex/internal/operators/observable/q0;->d:J

    iput-object p5, p0, Lio/reactivex/internal/operators/observable/q0;->e:Ljava/util/concurrent/TimeUnit;

    iput-object p6, p0, Lio/reactivex/internal/operators/observable/q0;->b:Lio/reactivex/E;

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

    new-instance v7, Lio/reactivex/internal/operators/observable/q0$a;

    invoke-direct {v7, p1}, Lio/reactivex/internal/operators/observable/q0$a;-><init>(Lio/reactivex/D;)V

    invoke-interface {p1, v7}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/q0;->b:Lio/reactivex/E;

    instance-of p1, v0, Lio/reactivex/internal/schedulers/p;

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lio/reactivex/E;->b()Lio/reactivex/E$c;

    move-result-object v0

    invoke-virtual {v7, v0}, Lio/reactivex/internal/operators/observable/q0$a;->a(Lio/reactivex/disposables/c;)V

    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/q0;->c:J

    iget-wide v4, p0, Lio/reactivex/internal/operators/observable/q0;->d:J

    iget-object v6, p0, Lio/reactivex/internal/operators/observable/q0;->e:Ljava/util/concurrent/TimeUnit;

    move-object v1, v7

    invoke-virtual/range {v0 .. v6}, Lio/reactivex/E$c;->d(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/q0;->c:J

    iget-wide v4, p0, Lio/reactivex/internal/operators/observable/q0;->d:J

    iget-object v6, p0, Lio/reactivex/internal/operators/observable/q0;->e:Ljava/util/concurrent/TimeUnit;

    move-object v1, v7

    invoke-virtual/range {v0 .. v6}, Lio/reactivex/E;->f(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    move-result-object p1

    invoke-virtual {v7, p1}, Lio/reactivex/internal/operators/observable/q0$a;->a(Lio/reactivex/disposables/c;)V

    :goto_0
    return-void
.end method
