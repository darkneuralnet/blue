.class public final Lio/reactivex/internal/operators/flowable/k;
.super Lio/reactivex/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/k$a;,
        Lio/reactivex/internal/operators/flowable/k$b;
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
.field public final d:Lio/reactivex/functions/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/g<",
            "-TT;>;"
        }
    .end annotation
.end field

.field public final e:Lio/reactivex/functions/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lio/reactivex/functions/a;

.field public final g:Lio/reactivex/functions/a;


# direct methods
.method public constructor <init>(Lio/reactivex/k;Lio/reactivex/functions/g;Lio/reactivex/functions/g;Lio/reactivex/functions/a;Lio/reactivex/functions/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;",
            "Lio/reactivex/functions/g<",
            "-TT;>;",
            "Lio/reactivex/functions/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;",
            "Lio/reactivex/functions/a;",
            "Lio/reactivex/functions/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/flowable/a;-><init>(Lio/reactivex/k;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/k;->d:Lio/reactivex/functions/g;

    iput-object p3, p0, Lio/reactivex/internal/operators/flowable/k;->e:Lio/reactivex/functions/g;

    iput-object p4, p0, Lio/reactivex/internal/operators/flowable/k;->f:Lio/reactivex/functions/a;

    iput-object p5, p0, Lio/reactivex/internal/operators/flowable/k;->g:Lio/reactivex/functions/a;

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

    instance-of v0, p1, Lio/reactivex/internal/fuseable/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    new-instance v7, Lio/reactivex/internal/operators/flowable/k$a;

    move-object v2, p1

    check-cast v2, Lio/reactivex/internal/fuseable/a;

    iget-object v3, p0, Lio/reactivex/internal/operators/flowable/k;->d:Lio/reactivex/functions/g;

    iget-object v4, p0, Lio/reactivex/internal/operators/flowable/k;->e:Lio/reactivex/functions/g;

    iget-object v5, p0, Lio/reactivex/internal/operators/flowable/k;->f:Lio/reactivex/functions/a;

    iget-object v6, p0, Lio/reactivex/internal/operators/flowable/k;->g:Lio/reactivex/functions/a;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lio/reactivex/internal/operators/flowable/k$a;-><init>(Lio/reactivex/internal/fuseable/a;Lio/reactivex/functions/g;Lio/reactivex/functions/g;Lio/reactivex/functions/a;Lio/reactivex/functions/a;)V

    invoke-virtual {v0, v7}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    new-instance v7, Lio/reactivex/internal/operators/flowable/k$b;

    iget-object v3, p0, Lio/reactivex/internal/operators/flowable/k;->d:Lio/reactivex/functions/g;

    iget-object v4, p0, Lio/reactivex/internal/operators/flowable/k;->e:Lio/reactivex/functions/g;

    iget-object v5, p0, Lio/reactivex/internal/operators/flowable/k;->f:Lio/reactivex/functions/a;

    iget-object v6, p0, Lio/reactivex/internal/operators/flowable/k;->g:Lio/reactivex/functions/a;

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lio/reactivex/internal/operators/flowable/k$b;-><init>(LhT5;Lio/reactivex/functions/g;Lio/reactivex/functions/g;Lio/reactivex/functions/a;Lio/reactivex/functions/a;)V

    invoke-virtual {v0, v7}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    :goto_0
    return-void
.end method
