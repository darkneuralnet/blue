.class public final Lio/reactivex/internal/operators/observable/Q;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/Q$a;
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

.field public final d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final e:Z


# direct methods
.method public constructor <init>(Lio/reactivex/B;JLjava/lang/Object;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;JTT;Z)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-wide p2, p0, Lio/reactivex/internal/operators/observable/Q;->c:J

    iput-object p4, p0, Lio/reactivex/internal/operators/observable/Q;->d:Ljava/lang/Object;

    iput-boolean p5, p0, Lio/reactivex/internal/operators/observable/Q;->e:Z

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v7, Lio/reactivex/internal/operators/observable/Q$a;

    iget-wide v3, p0, Lio/reactivex/internal/operators/observable/Q;->c:J

    iget-object v5, p0, Lio/reactivex/internal/operators/observable/Q;->d:Ljava/lang/Object;

    iget-boolean v6, p0, Lio/reactivex/internal/operators/observable/Q;->e:Z

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lio/reactivex/internal/operators/observable/Q$a;-><init>(Lio/reactivex/D;JLjava/lang/Object;Z)V

    invoke-interface {v0, v7}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
