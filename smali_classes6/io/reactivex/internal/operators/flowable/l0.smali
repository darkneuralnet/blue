.class public final Lio/reactivex/internal/operators/flowable/l0;
.super Lio/reactivex/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/l0$a;
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
.field public final d:Lna4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lna4<",
            "+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/k;Lna4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;",
            "Lna4<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/flowable/a;-><init>(Lio/reactivex/k;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/l0;->d:Lna4;

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/flowable/l0$a;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/l0;->d:Lna4;

    invoke-direct {v0, p1, v1}, Lio/reactivex/internal/operators/flowable/l0$a;-><init>(LhT5;Lna4;)V

    iget-object v1, v0, Lio/reactivex/internal/operators/flowable/l0$a;->d:Lio/reactivex/internal/subscriptions/f;

    invoke-interface {p1, v1}, LhT5;->a(LoT5;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    invoke-virtual {p1, v0}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    return-void
.end method
