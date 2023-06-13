.class public final Lio/reactivex/internal/operators/flowable/Y;
.super Lio/reactivex/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/Y$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/flowable/a<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field public final d:J


# direct methods
.method public constructor <init>(Lio/reactivex/k;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;J)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/flowable/a;-><init>(Lio/reactivex/k;)V

    iput-wide p2, p0, Lio/reactivex/internal/operators/flowable/Y;->d:J

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v4, Lio/reactivex/internal/subscriptions/f;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lio/reactivex/internal/subscriptions/f;-><init>(Z)V

    invoke-interface {p1, v4}, LhT5;->a(LoT5;)V

    new-instance v6, Lio/reactivex/internal/operators/flowable/Y$a;

    iget-wide v0, p0, Lio/reactivex/internal/operators/flowable/Y;->d:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v5, v0, v2

    if-eqz v5, :cond_0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    move-wide v2, v0

    :cond_0
    iget-object v5, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lio/reactivex/internal/operators/flowable/Y$a;-><init>(LhT5;JLio/reactivex/internal/subscriptions/f;Lna4;)V

    invoke-virtual {v6}, Lio/reactivex/internal/operators/flowable/Y$a;->b()V

    return-void
.end method
