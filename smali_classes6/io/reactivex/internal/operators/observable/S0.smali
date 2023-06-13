.class public final Lio/reactivex/internal/operators/observable/S0;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/S0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/observable/a<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field public final c:Lio/reactivex/functions/e;


# direct methods
.method public constructor <init>(Lio/reactivex/Observable;Lio/reactivex/functions/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "TT;>;",
            "Lio/reactivex/functions/e;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/S0;->c:Lio/reactivex/functions/e;

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

    new-instance v0, Lio/reactivex/internal/disposables/h;

    invoke-direct {v0}, Lio/reactivex/internal/disposables/h;-><init>()V

    invoke-interface {p1, v0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    new-instance v1, Lio/reactivex/internal/operators/observable/S0$a;

    iget-object v2, p0, Lio/reactivex/internal/operators/observable/S0;->c:Lio/reactivex/functions/e;

    iget-object v3, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    invoke-direct {v1, p1, v2, v0, v3}, Lio/reactivex/internal/operators/observable/S0$a;-><init>(Lio/reactivex/D;Lio/reactivex/functions/e;Lio/reactivex/internal/disposables/h;Lio/reactivex/B;)V

    invoke-virtual {v1}, Lio/reactivex/internal/operators/observable/S0$a;->a()V

    return-void
.end method
