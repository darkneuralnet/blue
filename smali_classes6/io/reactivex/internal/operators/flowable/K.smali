.class public final Lio/reactivex/internal/operators/flowable/K;
.super Lio/reactivex/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/K$b;,
        Lio/reactivex/internal/operators/flowable/K$c;,
        Lio/reactivex/internal/operators/flowable/K$a;
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
.field public final d:Lio/reactivex/E;

.field public final e:Z

.field public final f:I


# direct methods
.method public constructor <init>(Lio/reactivex/k;Lio/reactivex/E;ZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;",
            "Lio/reactivex/E;",
            "ZI)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/flowable/a;-><init>(Lio/reactivex/k;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/K;->d:Lio/reactivex/E;

    iput-boolean p3, p0, Lio/reactivex/internal/operators/flowable/K;->e:Z

    iput p4, p0, Lio/reactivex/internal/operators/flowable/K;->f:I

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/K;->d:Lio/reactivex/E;

    invoke-virtual {v0}, Lio/reactivex/E;->b()Lio/reactivex/E$c;

    move-result-object v0

    instance-of v1, p1, Lio/reactivex/internal/fuseable/a;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    new-instance v2, Lio/reactivex/internal/operators/flowable/K$b;

    check-cast p1, Lio/reactivex/internal/fuseable/a;

    iget-boolean v3, p0, Lio/reactivex/internal/operators/flowable/K;->e:Z

    iget v4, p0, Lio/reactivex/internal/operators/flowable/K;->f:I

    invoke-direct {v2, p1, v0, v3, v4}, Lio/reactivex/internal/operators/flowable/K$b;-><init>(Lio/reactivex/internal/fuseable/a;Lio/reactivex/E$c;ZI)V

    invoke-virtual {v1, v2}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    new-instance v2, Lio/reactivex/internal/operators/flowable/K$c;

    iget-boolean v3, p0, Lio/reactivex/internal/operators/flowable/K;->e:Z

    iget v4, p0, Lio/reactivex/internal/operators/flowable/K;->f:I

    invoke-direct {v2, p1, v0, v3, v4}, Lio/reactivex/internal/operators/flowable/K$c;-><init>(LhT5;Lio/reactivex/E$c;ZI)V

    invoke-virtual {v1, v2}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    :goto_0
    return-void
.end method
