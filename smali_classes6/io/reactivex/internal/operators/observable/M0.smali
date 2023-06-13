.class public final Lio/reactivex/internal/operators/observable/M0;
.super Lio/reactivex/Observable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/M0$a;
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
.field public final b:J

.field public final c:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/Observable;-><init>()V

    iput-wide p1, p0, Lio/reactivex/internal/operators/observable/M0;->b:J

    iput-wide p3, p0, Lio/reactivex/internal/operators/observable/M0;->c:J

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    new-instance v6, Lio/reactivex/internal/operators/observable/M0$a;

    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/M0;->b:J

    iget-wide v0, p0, Lio/reactivex/internal/operators/observable/M0;->c:J

    add-long v4, v2, v0

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lio/reactivex/internal/operators/observable/M0$a;-><init>(Lio/reactivex/D;JJ)V

    invoke-interface {p1, v6}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-virtual {v6}, Lio/reactivex/internal/operators/observable/M0$a;->run()V

    return-void
.end method
