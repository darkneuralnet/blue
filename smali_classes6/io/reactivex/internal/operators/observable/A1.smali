.class public final Lio/reactivex/internal/operators/observable/A1;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/A1$a;,
        Lio/reactivex/internal/operators/observable/A1$b;,
        Lio/reactivex/internal/operators/observable/A1$c;,
        Lio/reactivex/internal/operators/observable/A1$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        "V:",
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

.field public final d:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/B<",
            "TV;>;>;"
        }
    .end annotation
.end field

.field public final e:Lio/reactivex/B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/B<",
            "+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/Observable;Lio/reactivex/B;Lio/reactivex/functions/o;Lio/reactivex/B;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "TT;>;",
            "Lio/reactivex/B<",
            "TU;>;",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/B<",
            "TV;>;>;",
            "Lio/reactivex/B<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/A1;->c:Lio/reactivex/B;

    iput-object p3, p0, Lio/reactivex/internal/operators/observable/A1;->d:Lio/reactivex/functions/o;

    iput-object p4, p0, Lio/reactivex/internal/operators/observable/A1;->e:Lio/reactivex/B;

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/A1;->e:Lio/reactivex/B;

    if-nez v0, :cond_0

    new-instance v0, Lio/reactivex/internal/operators/observable/A1$c;

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/A1;->d:Lio/reactivex/functions/o;

    invoke-direct {v0, p1, v1}, Lio/reactivex/internal/operators/observable/A1$c;-><init>(Lio/reactivex/D;Lio/reactivex/functions/o;)V

    invoke-interface {p1, v0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/A1;->c:Lio/reactivex/B;

    invoke-virtual {v0, p1}, Lio/reactivex/internal/operators/observable/A1$c;->c(Lio/reactivex/B;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    invoke-interface {p1, v0}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lio/reactivex/internal/operators/observable/A1$b;

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/A1;->d:Lio/reactivex/functions/o;

    iget-object v2, p0, Lio/reactivex/internal/operators/observable/A1;->e:Lio/reactivex/B;

    invoke-direct {v0, p1, v1, v2}, Lio/reactivex/internal/operators/observable/A1$b;-><init>(Lio/reactivex/D;Lio/reactivex/functions/o;Lio/reactivex/B;)V

    invoke-interface {p1, v0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/A1;->c:Lio/reactivex/B;

    invoke-virtual {v0, p1}, Lio/reactivex/internal/operators/observable/A1$b;->c(Lio/reactivex/B;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    invoke-interface {p1, v0}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    :goto_0
    return-void
.end method
