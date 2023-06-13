.class public final Lio/reactivex/internal/operators/flowable/e0;
.super Lio/reactivex/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/e0$a;
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
.field public final d:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-",
            "Lio/reactivex/k<",
            "Ljava/lang/Throwable;",
            ">;+",
            "Lna4<",
            "*>;>;"
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
            "-",
            "Lio/reactivex/k<",
            "Ljava/lang/Throwable;",
            ">;+",
            "Lna4<",
            "*>;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/flowable/a;-><init>(Lio/reactivex/k;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/e0;->d:Lio/reactivex/functions/o;

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

    new-instance v0, Lio/reactivex/subscribers/a;

    invoke-direct {v0, p1}, Lio/reactivex/subscribers/a;-><init>(LhT5;)V

    const/16 v1, 0x8

    invoke-static {v1}, Lio/reactivex/processors/d;->z1(I)Lio/reactivex/processors/d;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/processors/a;->x1()Lio/reactivex/processors/a;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, Lio/reactivex/internal/operators/flowable/e0;->d:Lio/reactivex/functions/o;

    invoke-interface {v2, v1}, Lio/reactivex/functions/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "handler returned a null Publisher"

    invoke-static {v2, v3}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lna4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v3, Lio/reactivex/internal/operators/flowable/Z;

    iget-object v4, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    invoke-direct {v3, v4}, Lio/reactivex/internal/operators/flowable/Z;-><init>(Lna4;)V

    new-instance v4, Lio/reactivex/internal/operators/flowable/e0$a;

    invoke-direct {v4, v0, v1, v3}, Lio/reactivex/internal/operators/flowable/e0$a;-><init>(LhT5;Lio/reactivex/processors/a;LoT5;)V

    iput-object v4, v3, Lio/reactivex/internal/operators/flowable/Z;->e:Lio/reactivex/internal/operators/flowable/a0;

    invoke-interface {p1, v4}, LhT5;->a(LoT5;)V

    invoke-interface {v2, v3}, Lna4;->c(LhT5;)V

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v3, p1}, Lio/reactivex/internal/operators/flowable/Z;->onNext(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lio/reactivex/internal/subscriptions/d;->c(Ljava/lang/Throwable;LhT5;)V

    return-void
.end method
