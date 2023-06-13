.class public final Lio/reactivex/internal/operators/flowable/v0;
.super Lio/reactivex/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/v0$a;,
        Lio/reactivex/internal/operators/flowable/v0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/flowable/a<",
        "TT;TR;>;"
    }
.end annotation


# instance fields
.field public final d:Lio/reactivex/functions/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/c<",
            "-TT;-TU;+TR;>;"
        }
    .end annotation
.end field

.field public final e:Lna4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lna4<",
            "+TU;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/k;Lio/reactivex/functions/c;Lna4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;",
            "Lio/reactivex/functions/c<",
            "-TT;-TU;+TR;>;",
            "Lna4<",
            "+TU;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/flowable/a;-><init>(Lio/reactivex/k;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/v0;->d:Lio/reactivex/functions/c;

    iput-object p3, p0, Lio/reactivex/internal/operators/flowable/v0;->e:Lna4;

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TR;>;)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/subscribers/a;

    invoke-direct {v0, p1}, Lio/reactivex/subscribers/a;-><init>(LhT5;)V

    new-instance p1, Lio/reactivex/internal/operators/flowable/v0$b;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/v0;->d:Lio/reactivex/functions/c;

    invoke-direct {p1, v0, v1}, Lio/reactivex/internal/operators/flowable/v0$b;-><init>(LhT5;Lio/reactivex/functions/c;)V

    invoke-virtual {v0, p1}, Lio/reactivex/subscribers/a;->a(LoT5;)V

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/v0;->e:Lna4;

    new-instance v1, Lio/reactivex/internal/operators/flowable/v0$a;

    invoke-direct {v1, p0, p1}, Lio/reactivex/internal/operators/flowable/v0$a;-><init>(Lio/reactivex/internal/operators/flowable/v0;Lio/reactivex/internal/operators/flowable/v0$b;)V

    invoke-interface {v0, v1}, Lna4;->c(LhT5;)V

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    invoke-virtual {v0, p1}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    return-void
.end method
