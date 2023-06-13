.class public final Lio/reactivex/internal/operators/observable/l1;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/l1$a;,
        Lio/reactivex/internal/operators/observable/l1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/observable/a<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field public final c:Lio/reactivex/B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/B<",
            "TU;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/B;Lio/reactivex/B;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;",
            "Lio/reactivex/B<",
            "TU;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/l1;->c:Lio/reactivex/B;

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/observers/h;

    invoke-direct {v0, p1}, Lio/reactivex/observers/h;-><init>(Lio/reactivex/D;)V

    new-instance p1, Lio/reactivex/internal/disposables/a;

    const/4 v1, 0x2

    invoke-direct {p1, v1}, Lio/reactivex/internal/disposables/a;-><init>(I)V

    invoke-virtual {v0, p1}, Lio/reactivex/observers/h;->onSubscribe(Lio/reactivex/disposables/c;)V

    new-instance v1, Lio/reactivex/internal/operators/observable/l1$b;

    invoke-direct {v1, v0, p1}, Lio/reactivex/internal/operators/observable/l1$b;-><init>(Lio/reactivex/D;Lio/reactivex/internal/disposables/a;)V

    iget-object v2, p0, Lio/reactivex/internal/operators/observable/l1;->c:Lio/reactivex/B;

    new-instance v3, Lio/reactivex/internal/operators/observable/l1$a;

    invoke-direct {v3, p0, p1, v1, v0}, Lio/reactivex/internal/operators/observable/l1$a;-><init>(Lio/reactivex/internal/operators/observable/l1;Lio/reactivex/internal/disposables/a;Lio/reactivex/internal/operators/observable/l1$b;Lio/reactivex/observers/h;)V

    invoke-interface {v2, v3}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    invoke-interface {p1, v1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
