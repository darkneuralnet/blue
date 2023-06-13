.class public final Lio/reactivex/internal/operators/observable/y1;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/y1$a;
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

.field public final f:Z


# direct methods
.method public constructor <init>(Lio/reactivex/Observable;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "TT;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-wide p2, p0, Lio/reactivex/internal/operators/observable/y1;->c:J

    iput-object p4, p0, Lio/reactivex/internal/operators/observable/y1;->d:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lio/reactivex/internal/operators/observable/y1;->e:Lio/reactivex/E;

    iput-boolean p6, p0, Lio/reactivex/internal/operators/observable/y1;->f:Z

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v8, Lio/reactivex/internal/operators/observable/y1$a;

    iget-wide v3, p0, Lio/reactivex/internal/operators/observable/y1;->c:J

    iget-object v5, p0, Lio/reactivex/internal/operators/observable/y1;->d:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/y1;->e:Lio/reactivex/E;

    invoke-virtual {v1}, Lio/reactivex/E;->b()Lio/reactivex/E$c;

    move-result-object v6

    iget-boolean v7, p0, Lio/reactivex/internal/operators/observable/y1;->f:Z

    move-object v1, v8

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lio/reactivex/internal/operators/observable/y1$a;-><init>(Lio/reactivex/D;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E$c;Z)V

    invoke-interface {v0, v8}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
