.class public final Lio/reactivex/internal/operators/observable/S;
.super Lio/reactivex/p;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/internal/fuseable/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/S$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/p<",
        "TT;>;",
        "Lio/reactivex/internal/fuseable/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/B<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:J


# direct methods
.method public constructor <init>(Lio/reactivex/B;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;J)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/p;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/S;->b:Lio/reactivex/B;

    iput-wide p2, p0, Lio/reactivex/internal/operators/observable/S;->c:J

    return-void
.end method


# virtual methods
.method public S(Lio/reactivex/s;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/s<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/S;->b:Lio/reactivex/B;

    new-instance v1, Lio/reactivex/internal/operators/observable/S$a;

    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/S;->c:J

    invoke-direct {v1, p1, v2, v3}, Lio/reactivex/internal/operators/observable/S$a;-><init>(Lio/reactivex/s;J)V

    invoke-interface {v0, v1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method

.method public c()Lio/reactivex/Observable;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    new-instance v6, Lio/reactivex/internal/operators/observable/Q;

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/S;->b:Lio/reactivex/B;

    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/S;->c:J

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lio/reactivex/internal/operators/observable/Q;-><init>(Lio/reactivex/B;JLjava/lang/Object;Z)V

    invoke-static {v6}, Lio/reactivex/plugins/a;->o(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
