.class public final Lio/reactivex/internal/operators/flowable/s;
.super Lio/reactivex/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/s$a;,
        Lio/reactivex/internal/operators/flowable/s$b;
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
.method public constructor <init>(Lio/reactivex/k;Lio/reactivex/functions/o;ZII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lna4<",
            "+TU;>;>;ZII)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/flowable/a;-><init>(Lio/reactivex/k;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/s;->d:Lio/reactivex/functions/o;

    iput-boolean p3, p0, Lio/reactivex/internal/operators/flowable/s;->e:Z

    iput p4, p0, Lio/reactivex/internal/operators/flowable/s;->f:I

    iput p5, p0, Lio/reactivex/internal/operators/flowable/s;->g:I

    return-void
.end method

.method public static x1(LhT5;Lio/reactivex/functions/o;ZII)Lio/reactivex/o;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(",
            "LhT5<",
            "-TU;>;",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lna4<",
            "+TU;>;>;ZII)",
            "Lio/reactivex/o<",
            "TT;>;"
        }
    .end annotation

    new-instance v6, Lio/reactivex/internal/operators/flowable/s$b;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lio/reactivex/internal/operators/flowable/s$b;-><init>(LhT5;Lio/reactivex/functions/o;ZII)V

    return-object v6
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

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/s;->d:Lio/reactivex/functions/o;

    invoke-static {v0, p1, v1}, Lio/reactivex/internal/operators/flowable/g0;->b(Lna4;LhT5;Lio/reactivex/functions/o;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/s;->d:Lio/reactivex/functions/o;

    iget-boolean v2, p0, Lio/reactivex/internal/operators/flowable/s;->e:Z

    iget v3, p0, Lio/reactivex/internal/operators/flowable/s;->f:I

    iget v4, p0, Lio/reactivex/internal/operators/flowable/s;->g:I

    invoke-static {p1, v1, v2, v3, v4}, Lio/reactivex/internal/operators/flowable/s;->x1(LhT5;Lio/reactivex/functions/o;ZII)Lio/reactivex/o;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    return-void
.end method
