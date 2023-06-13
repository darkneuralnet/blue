.class public final Lio/reactivex/internal/operators/flowable/m0;
.super Lio/reactivex/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/m0$a;,
        Lio/reactivex/internal/operators/flowable/m0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/flowable/a<",
        "TT;TR;>;"
    }
.end annotation


# instance fields
.field public final d:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lna4<",
            "+TR;>;>;"
        }
    .end annotation
.end field

.field public final e:I

.field public final f:Z


# direct methods
.method public constructor <init>(Lio/reactivex/k;Lio/reactivex/functions/o;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lna4<",
            "+TR;>;>;IZ)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/flowable/a;-><init>(Lio/reactivex/k;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/m0;->d:Lio/reactivex/functions/o;

    iput p3, p0, Lio/reactivex/internal/operators/flowable/m0;->e:I

    iput-boolean p4, p0, Lio/reactivex/internal/operators/flowable/m0;->f:Z

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TR;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/m0;->d:Lio/reactivex/functions/o;

    invoke-static {v0, p1, v1}, Lio/reactivex/internal/operators/flowable/g0;->b(Lna4;LhT5;Lio/reactivex/functions/o;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    new-instance v1, Lio/reactivex/internal/operators/flowable/m0$b;

    iget-object v2, p0, Lio/reactivex/internal/operators/flowable/m0;->d:Lio/reactivex/functions/o;

    iget v3, p0, Lio/reactivex/internal/operators/flowable/m0;->e:I

    iget-boolean v4, p0, Lio/reactivex/internal/operators/flowable/m0;->f:Z

    invoke-direct {v1, p1, v2, v3, v4}, Lio/reactivex/internal/operators/flowable/m0$b;-><init>(LhT5;Lio/reactivex/functions/o;IZ)V

    invoke-virtual {v0, v1}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    return-void
.end method
