.class public abstract Lio/reactivex/internal/operators/flowable/a0;
.super Lio/reactivex/internal/subscriptions/f;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/o;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/subscriptions/f;",
        "Lio/reactivex/o<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x4dc79ef2e0d16b40L


# instance fields
.field public final j:LhT5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LhT5<",
            "-TT;>;"
        }
    .end annotation
.end field

.field public final k:Lio/reactivex/processors/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/processors/a<",
            "TU;>;"
        }
    .end annotation
.end field

.field public final l:LoT5;

.field public m:J


# direct methods
.method public constructor <init>(LhT5;Lio/reactivex/processors/a;LoT5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;",
            "Lio/reactivex/processors/a<",
            "TU;>;",
            "LoT5;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lio/reactivex/internal/subscriptions/f;-><init>(Z)V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/a0;->j:LhT5;

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/a0;->k:Lio/reactivex/processors/a;

    iput-object p3, p0, Lio/reactivex/internal/operators/flowable/a0;->l:LoT5;

    return-void
.end method


# virtual methods
.method public final a(LoT5;)V
    .locals 0

    invoke-virtual {p0, p1}, Lio/reactivex/internal/subscriptions/f;->f(LoT5;)V

    return-void
.end method

.method public final cancel()V
    .locals 1

    invoke-super {p0}, Lio/reactivex/internal/subscriptions/f;->cancel()V

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a0;->l:LoT5;

    invoke-interface {v0}, LoT5;->cancel()V

    return-void
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    sget-object v0, Lio/reactivex/internal/subscriptions/d;->b:Lio/reactivex/internal/subscriptions/d;

    invoke-virtual {p0, v0}, Lio/reactivex/internal/subscriptions/f;->f(LoT5;)V

    iget-wide v0, p0, Lio/reactivex/internal/operators/flowable/a0;->m:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iput-wide v2, p0, Lio/reactivex/internal/operators/flowable/a0;->m:J

    invoke-virtual {p0, v0, v1}, Lio/reactivex/internal/subscriptions/f;->e(J)V

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a0;->l:LoT5;

    const-wide/16 v1, 0x1

    invoke-interface {v0, v1, v2}, LoT5;->o(J)V

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a0;->k:Lio/reactivex/processors/a;

    invoke-interface {v0, p1}, LhT5;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-wide v0, p0, Lio/reactivex/internal/operators/flowable/a0;->m:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lio/reactivex/internal/operators/flowable/a0;->m:J

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a0;->j:LhT5;

    invoke-interface {v0, p1}, LhT5;->onNext(Ljava/lang/Object;)V

    return-void
.end method
