.class public final Lio/reactivex/internal/operators/observable/n1;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/n1$b;,
        Lio/reactivex/internal/operators/observable/n1$a;
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
.field public final c:Lio/reactivex/E;


# direct methods
.method public constructor <init>(Lio/reactivex/B;Lio/reactivex/E;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;",
            "Lio/reactivex/E;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/n1;->c:Lio/reactivex/E;

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/n1$a;

    invoke-direct {v0, p1}, Lio/reactivex/internal/operators/observable/n1$a;-><init>(Lio/reactivex/D;)V

    invoke-interface {p1, v0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/n1;->c:Lio/reactivex/E;

    new-instance v1, Lio/reactivex/internal/operators/observable/n1$b;

    invoke-direct {v1, p0, v0}, Lio/reactivex/internal/operators/observable/n1$b;-><init>(Lio/reactivex/internal/operators/observable/n1;Lio/reactivex/internal/operators/observable/n1$a;)V

    invoke-virtual {p1, v1}, Lio/reactivex/E;->d(Ljava/lang/Runnable;)Lio/reactivex/disposables/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/internal/operators/observable/n1$a;->a(Lio/reactivex/disposables/c;)V

    return-void
.end method
