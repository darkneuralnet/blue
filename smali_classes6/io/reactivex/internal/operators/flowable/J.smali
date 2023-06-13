.class public final Lio/reactivex/internal/operators/flowable/J;
.super Lio/reactivex/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/J$a;,
        Lio/reactivex/internal/operators/flowable/J$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/flowable/a<",
        "TT;TU;>;"
    }
.end annotation


# instance fields
.field public final d:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-TT;+TU;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/k;Lio/reactivex/functions/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;",
            "Lio/reactivex/functions/o<",
            "-TT;+TU;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/flowable/a;-><init>(Lio/reactivex/k;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/J;->d:Lio/reactivex/functions/o;

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TU;>;)V"
        }
    .end annotation

    instance-of v0, p1, Lio/reactivex/internal/fuseable/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    new-instance v1, Lio/reactivex/internal/operators/flowable/J$a;

    check-cast p1, Lio/reactivex/internal/fuseable/a;

    iget-object v2, p0, Lio/reactivex/internal/operators/flowable/J;->d:Lio/reactivex/functions/o;

    invoke-direct {v1, p1, v2}, Lio/reactivex/internal/operators/flowable/J$a;-><init>(Lio/reactivex/internal/fuseable/a;Lio/reactivex/functions/o;)V

    invoke-virtual {v0, v1}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    new-instance v1, Lio/reactivex/internal/operators/flowable/J$b;

    iget-object v2, p0, Lio/reactivex/internal/operators/flowable/J;->d:Lio/reactivex/functions/o;

    invoke-direct {v1, p1, v2}, Lio/reactivex/internal/operators/flowable/J$b;-><init>(LhT5;Lio/reactivex/functions/o;)V

    invoke-virtual {v0, v1}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    :goto_0
    return-void
.end method
