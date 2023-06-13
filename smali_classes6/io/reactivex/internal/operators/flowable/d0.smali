.class public final Lio/reactivex/internal/operators/flowable/d0;
.super Lio/reactivex/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/d0$a;
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
.field public final d:Lio/reactivex/functions/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/q<",
            "-",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field public final e:J


# direct methods
.method public constructor <init>(Lio/reactivex/k;JLio/reactivex/functions/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;J",
            "Lio/reactivex/functions/q<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/flowable/a;-><init>(Lio/reactivex/k;)V

    iput-object p4, p0, Lio/reactivex/internal/operators/flowable/d0;->d:Lio/reactivex/functions/q;

    iput-wide p2, p0, Lio/reactivex/internal/operators/flowable/d0;->e:J

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v5, Lio/reactivex/internal/subscriptions/f;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Lio/reactivex/internal/subscriptions/f;-><init>(Z)V

    invoke-interface {p1, v5}, LhT5;->a(LoT5;)V

    new-instance v7, Lio/reactivex/internal/operators/flowable/d0$a;

    iget-wide v2, p0, Lio/reactivex/internal/operators/flowable/d0;->e:J

    iget-object v4, p0, Lio/reactivex/internal/operators/flowable/d0;->d:Lio/reactivex/functions/q;

    iget-object v6, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    move-object v0, v7

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lio/reactivex/internal/operators/flowable/d0$a;-><init>(LhT5;JLio/reactivex/functions/q;Lio/reactivex/internal/subscriptions/f;Lna4;)V

    invoke-virtual {v7}, Lio/reactivex/internal/operators/flowable/d0$a;->b()V

    return-void
.end method
