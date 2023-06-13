.class public final Lio/reactivex/internal/operators/maybe/F;
.super Lio/reactivex/internal/operators/maybe/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/maybe/F$a;,
        Lio/reactivex/internal/operators/maybe/F$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/maybe/a<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field public final c:Lio/reactivex/E;


# direct methods
.method public constructor <init>(Lio/reactivex/u;Lio/reactivex/E;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/u<",
            "TT;>;",
            "Lio/reactivex/E;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/maybe/a;-><init>(Lio/reactivex/u;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/maybe/F;->c:Lio/reactivex/E;

    return-void
.end method


# virtual methods
.method public S(Lio/reactivex/s;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/s<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/maybe/F$a;

    invoke-direct {v0, p1}, Lio/reactivex/internal/operators/maybe/F$a;-><init>(Lio/reactivex/s;)V

    invoke-interface {p1, v0}, Lio/reactivex/s;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-object p1, v0, Lio/reactivex/internal/operators/maybe/F$a;->b:Lio/reactivex/internal/disposables/h;

    iget-object v1, p0, Lio/reactivex/internal/operators/maybe/F;->c:Lio/reactivex/E;

    new-instance v2, Lio/reactivex/internal/operators/maybe/F$b;

    iget-object v3, p0, Lio/reactivex/internal/operators/maybe/a;->b:Lio/reactivex/u;

    invoke-direct {v2, v0, v3}, Lio/reactivex/internal/operators/maybe/F$b;-><init>(Lio/reactivex/s;Lio/reactivex/u;)V

    invoke-virtual {v1, v2}, Lio/reactivex/E;->d(Ljava/lang/Runnable;)Lio/reactivex/disposables/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/internal/disposables/h;->a(Lio/reactivex/disposables/c;)Z

    return-void
.end method
