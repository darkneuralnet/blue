.class public final Lio/reactivex/internal/operators/observable/R0;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/R0$a;
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


# direct methods
.method public constructor <init>(Lio/reactivex/Observable;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "TT;>;J)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-wide p2, p0, Lio/reactivex/internal/operators/observable/R0;->c:J

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

    new-instance v4, Lio/reactivex/internal/disposables/h;

    invoke-direct {v4}, Lio/reactivex/internal/disposables/h;-><init>()V

    invoke-interface {p1, v4}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    new-instance v6, Lio/reactivex/internal/operators/observable/R0$a;

    iget-wide v0, p0, Lio/reactivex/internal/operators/observable/R0;->c:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v5, v0, v2

    if-eqz v5, :cond_0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    move-wide v2, v0

    :cond_0
    iget-object v5, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lio/reactivex/internal/operators/observable/R0$a;-><init>(Lio/reactivex/D;JLio/reactivex/internal/disposables/h;Lio/reactivex/B;)V

    invoke-virtual {v6}, Lio/reactivex/internal/operators/observable/R0$a;->a()V

    return-void
.end method
