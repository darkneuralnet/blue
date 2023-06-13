.class public final Lio/reactivex/internal/operators/flowable/w;
.super Lio/reactivex/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/k<",
        "TU;>;"
    }
.end annotation


# instance fields
.field public final c:Lna4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lna4<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lna4<",
            "+TU;>;>;"
        }
    .end annotation
.end field

.field public final e:Z

.field public final f:I

.field public final g:I


# direct methods
.method public constructor <init>(Lna4;Lio/reactivex/functions/o;ZII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lna4<",
            "TT;>;",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lna4<",
            "+TU;>;>;ZII)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/k;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/w;->c:Lna4;

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/w;->d:Lio/reactivex/functions/o;

    iput-boolean p3, p0, Lio/reactivex/internal/operators/flowable/w;->e:Z

    iput p4, p0, Lio/reactivex/internal/operators/flowable/w;->f:I

    iput p5, p0, Lio/reactivex/internal/operators/flowable/w;->g:I

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TU;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/w;->c:Lna4;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/w;->d:Lio/reactivex/functions/o;

    invoke-static {v0, p1, v1}, Lio/reactivex/internal/operators/flowable/g0;->b(Lna4;LhT5;Lio/reactivex/functions/o;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/w;->c:Lna4;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/w;->d:Lio/reactivex/functions/o;

    iget-boolean v2, p0, Lio/reactivex/internal/operators/flowable/w;->e:Z

    iget v3, p0, Lio/reactivex/internal/operators/flowable/w;->f:I

    iget v4, p0, Lio/reactivex/internal/operators/flowable/w;->g:I

    invoke-static {p1, v1, v2, v3, v4}, Lio/reactivex/internal/operators/flowable/s;->x1(LhT5;Lio/reactivex/functions/o;ZII)Lio/reactivex/o;

    move-result-object p1

    invoke-interface {v0, p1}, Lna4;->c(LhT5;)V

    return-void
.end method
