.class public final Lio/reactivex/internal/operators/observable/H1;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/H1$b;,
        Lio/reactivex/internal/operators/observable/H1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/observable/a<",
        "TT;",
        "Lio/reactivex/Observable<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field public final c:J

.field public final d:J

.field public final e:I


# direct methods
.method public constructor <init>(Lio/reactivex/B;JJI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;JJI)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-wide p2, p0, Lio/reactivex/internal/operators/observable/H1;->c:J

    iput-wide p4, p0, Lio/reactivex/internal/operators/observable/H1;->d:J

    iput p6, p0, Lio/reactivex/internal/operators/observable/H1;->e:I

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-",
            "Lio/reactivex/Observable<",
            "TT;>;>;)V"
        }
    .end annotation

    iget-wide v0, p0, Lio/reactivex/internal/operators/observable/H1;->c:J

    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/H1;->d:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v1, Lio/reactivex/internal/operators/observable/H1$a;

    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/H1;->c:J

    iget v4, p0, Lio/reactivex/internal/operators/observable/H1;->e:I

    invoke-direct {v1, p1, v2, v3, v4}, Lio/reactivex/internal/operators/observable/H1$a;-><init>(Lio/reactivex/D;JI)V

    invoke-interface {v0, v1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v8, Lio/reactivex/internal/operators/observable/H1$b;

    iget-wide v3, p0, Lio/reactivex/internal/operators/observable/H1;->c:J

    iget-wide v5, p0, Lio/reactivex/internal/operators/observable/H1;->d:J

    iget v7, p0, Lio/reactivex/internal/operators/observable/H1;->e:I

    move-object v1, v8

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lio/reactivex/internal/operators/observable/H1$b;-><init>(Lio/reactivex/D;JJI)V

    invoke-interface {v0, v8}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    :goto_0
    return-void
.end method
