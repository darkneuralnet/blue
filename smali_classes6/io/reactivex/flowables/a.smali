.class public abstract Lio/reactivex/flowables/a;
.super Lio/reactivex/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/k<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/k;-><init>()V

    return-void
.end method


# virtual methods
.method public A1()Lio/reactivex/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/k<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/flowable/X;

    invoke-virtual {p0}, Lio/reactivex/flowables/a;->z1()Lio/reactivex/flowables/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/reactivex/internal/operators/flowable/X;-><init>(Lio/reactivex/flowables/a;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->m(Lio/reactivex/k;)Lio/reactivex/k;

    move-result-object v0

    return-object v0
.end method

.method public final x1()Lio/reactivex/disposables/c;
    .locals 1

    new-instance v0, Lio/reactivex/internal/util/g;

    invoke-direct {v0}, Lio/reactivex/internal/util/g;-><init>()V

    invoke-virtual {p0, v0}, Lio/reactivex/flowables/a;->y1(Lio/reactivex/functions/g;)V

    iget-object v0, v0, Lio/reactivex/internal/util/g;->b:Lio/reactivex/disposables/c;

    return-object v0
.end method

.method public abstract y1(Lio/reactivex/functions/g;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/g<",
            "-",
            "Lio/reactivex/disposables/c;",
            ">;)V"
        }
    .end annotation
.end method

.method public final z1()Lio/reactivex/flowables/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/flowables/a<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lio/reactivex/internal/operators/flowable/V;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lio/reactivex/internal/operators/flowable/V;

    new-instance v1, Lio/reactivex/internal/operators/flowable/U;

    invoke-interface {v0}, Lio/reactivex/internal/operators/flowable/V;->b()Lna4;

    move-result-object v2

    invoke-interface {v0}, Lio/reactivex/internal/operators/flowable/V;->e()I

    move-result v0

    invoke-direct {v1, v2, v0}, Lio/reactivex/internal/operators/flowable/U;-><init>(Lna4;I)V

    invoke-static {v1}, Lio/reactivex/plugins/a;->q(Lio/reactivex/flowables/a;)Lio/reactivex/flowables/a;

    move-result-object v0

    return-object v0

    :cond_0
    return-object p0
.end method
