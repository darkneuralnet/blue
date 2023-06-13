.class public final Lio/reactivex/internal/operators/observable/I1;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/I1$a;,
        Lio/reactivex/internal/operators/observable/I1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "B:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/observable/a<",
        "TT;",
        "Lio/reactivex/Observable<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field public final c:Lio/reactivex/B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/B<",
            "TB;>;"
        }
    .end annotation
.end field

.field public final d:I


# direct methods
.method public constructor <init>(Lio/reactivex/B;Lio/reactivex/B;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;",
            "Lio/reactivex/B<",
            "TB;>;I)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/I1;->c:Lio/reactivex/B;

    iput p3, p0, Lio/reactivex/internal/operators/observable/I1;->d:I

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-",
            "Lio/reactivex/Observable<",
            "TT;>;>;)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/I1$b;

    iget v1, p0, Lio/reactivex/internal/operators/observable/I1;->d:I

    invoke-direct {v0, p1, v1}, Lio/reactivex/internal/operators/observable/I1$b;-><init>(Lio/reactivex/D;I)V

    invoke-interface {p1, v0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/I1;->c:Lio/reactivex/B;

    iget-object v1, v0, Lio/reactivex/internal/operators/observable/I1$b;->d:Lio/reactivex/internal/operators/observable/I1$a;

    invoke-interface {p1, v1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    invoke-interface {p1, v0}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
