.class public final Lio/reactivex/internal/operators/observable/Y0;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/Y0$a;,
        Lio/reactivex/internal/operators/observable/Y0$b;,
        Lio/reactivex/internal/operators/observable/Y0$c;
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
.method public constructor <init>(Lio/reactivex/B;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-wide p2, p0, Lio/reactivex/internal/operators/observable/Y0;->c:J

    iput-object p4, p0, Lio/reactivex/internal/operators/observable/Y0;->d:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lio/reactivex/internal/operators/observable/Y0;->e:Lio/reactivex/E;

    iput-boolean p6, p0, Lio/reactivex/internal/operators/observable/Y0;->f:Z

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v1, Lio/reactivex/observers/h;

    invoke-direct {v1, p1}, Lio/reactivex/observers/h;-><init>(Lio/reactivex/D;)V

    iget-boolean p1, p0, Lio/reactivex/internal/operators/observable/Y0;->f:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v6, Lio/reactivex/internal/operators/observable/Y0$a;

    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/Y0;->c:J

    iget-object v4, p0, Lio/reactivex/internal/operators/observable/Y0;->d:Ljava/util/concurrent/TimeUnit;

    iget-object v5, p0, Lio/reactivex/internal/operators/observable/Y0;->e:Lio/reactivex/E;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lio/reactivex/internal/operators/observable/Y0$a;-><init>(Lio/reactivex/D;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V

    invoke-interface {p1, v6}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v6, Lio/reactivex/internal/operators/observable/Y0$b;

    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/Y0;->c:J

    iget-object v4, p0, Lio/reactivex/internal/operators/observable/Y0;->d:Ljava/util/concurrent/TimeUnit;

    iget-object v5, p0, Lio/reactivex/internal/operators/observable/Y0;->e:Lio/reactivex/E;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lio/reactivex/internal/operators/observable/Y0$b;-><init>(Lio/reactivex/D;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V

    invoke-interface {p1, v6}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    :goto_0
    return-void
.end method
