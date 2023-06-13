.class public final Lio/reactivex/internal/operators/flowable/k0;
.super Lio/reactivex/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/k0$a;
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


# direct methods
.method public constructor <init>(Lio/reactivex/k;Lio/reactivex/E;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;",
            "Lio/reactivex/E;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/flowable/a;-><init>(Lio/reactivex/k;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/k0;->d:Lio/reactivex/E;

    iput-boolean p3, p0, Lio/reactivex/internal/operators/flowable/k0;->e:Z

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/k0;->d:Lio/reactivex/E;

    invoke-virtual {v0}, Lio/reactivex/E;->b()Lio/reactivex/E$c;

    move-result-object v0

    new-instance v1, Lio/reactivex/internal/operators/flowable/k0$a;

    iget-object v2, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    iget-boolean v3, p0, Lio/reactivex/internal/operators/flowable/k0;->e:Z

    invoke-direct {v1, p1, v0, v2, v3}, Lio/reactivex/internal/operators/flowable/k0$a;-><init>(LhT5;Lio/reactivex/E$c;Lna4;Z)V

    invoke-interface {p1, v1}, LhT5;->a(LoT5;)V

    invoke-virtual {v0, v1}, Lio/reactivex/E$c;->b(Ljava/lang/Runnable;)Lio/reactivex/disposables/c;

    return-void
.end method
