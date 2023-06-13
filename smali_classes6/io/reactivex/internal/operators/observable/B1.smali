.class public final Lio/reactivex/internal/operators/observable/B1;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/B1$d;,
        Lio/reactivex/internal/operators/observable/B1$a;,
        Lio/reactivex/internal/operators/observable/B1$b;,
        Lio/reactivex/internal/operators/observable/B1$e;,
        Lio/reactivex/internal/operators/observable/B1$c;
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

.field public final d:Ljava/util/concurrent/TimeUnit;

.field public final e:Lio/reactivex/E;

.field public final f:Lio/reactivex/B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/B<",
            "+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/Observable;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Lio/reactivex/B;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "TT;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            "Lio/reactivex/B<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-wide p2, p0, Lio/reactivex/internal/operators/observable/B1;->c:J

    iput-object p4, p0, Lio/reactivex/internal/operators/observable/B1;->d:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lio/reactivex/internal/operators/observable/B1;->e:Lio/reactivex/E;

    iput-object p6, p0, Lio/reactivex/internal/operators/observable/B1;->f:Lio/reactivex/B;

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/B1;->f:Lio/reactivex/B;

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Lio/reactivex/internal/operators/observable/B1$c;

    iget-wide v5, p0, Lio/reactivex/internal/operators/observable/B1;->c:J

    iget-object v7, p0, Lio/reactivex/internal/operators/observable/B1;->d:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p0, Lio/reactivex/internal/operators/observable/B1;->e:Lio/reactivex/E;

    invoke-virtual {v3}, Lio/reactivex/E;->b()Lio/reactivex/E$c;

    move-result-object v8

    move-object v3, v0

    move-object v4, p1

    invoke-direct/range {v3 .. v8}, Lio/reactivex/internal/operators/observable/B1$c;-><init>(Lio/reactivex/D;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E$c;)V

    invoke-interface {p1, v0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-virtual {v0, v1, v2}, Lio/reactivex/internal/operators/observable/B1$c;->c(J)V

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    invoke-interface {p1, v0}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lio/reactivex/internal/operators/observable/B1$b;

    iget-wide v5, p0, Lio/reactivex/internal/operators/observable/B1;->c:J

    iget-object v7, p0, Lio/reactivex/internal/operators/observable/B1;->d:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p0, Lio/reactivex/internal/operators/observable/B1;->e:Lio/reactivex/E;

    invoke-virtual {v3}, Lio/reactivex/E;->b()Lio/reactivex/E$c;

    move-result-object v8

    iget-object v9, p0, Lio/reactivex/internal/operators/observable/B1;->f:Lio/reactivex/B;

    move-object v3, v0

    move-object v4, p1

    invoke-direct/range {v3 .. v9}, Lio/reactivex/internal/operators/observable/B1$b;-><init>(Lio/reactivex/D;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E$c;Lio/reactivex/B;)V

    invoke-interface {p1, v0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-virtual {v0, v1, v2}, Lio/reactivex/internal/operators/observable/B1$b;->c(J)V

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    invoke-interface {p1, v0}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    :goto_0
    return-void
.end method
