.class public final Lio/reactivex/internal/operators/observable/Z0;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/Z0$a;,
        Lio/reactivex/internal/operators/observable/Z0$b;,
        Lio/reactivex/internal/operators/observable/Z0$d;,
        Lio/reactivex/internal/operators/observable/Z0$c;
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
.field public final c:Lio/reactivex/B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/B<",
            "*>;"
        }
    .end annotation
.end field

.field public final d:Z


# direct methods
.method public constructor <init>(Lio/reactivex/B;Lio/reactivex/B;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;",
            "Lio/reactivex/B<",
            "*>;Z)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/Z0;->c:Lio/reactivex/B;

    iput-boolean p3, p0, Lio/reactivex/internal/operators/observable/Z0;->d:Z

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

    new-instance v0, Lio/reactivex/observers/h;

    invoke-direct {v0, p1}, Lio/reactivex/observers/h;-><init>(Lio/reactivex/D;)V

    iget-boolean p1, p0, Lio/reactivex/internal/operators/observable/Z0;->d:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v1, Lio/reactivex/internal/operators/observable/Z0$a;

    iget-object v2, p0, Lio/reactivex/internal/operators/observable/Z0;->c:Lio/reactivex/B;

    invoke-direct {v1, v0, v2}, Lio/reactivex/internal/operators/observable/Z0$a;-><init>(Lio/reactivex/D;Lio/reactivex/B;)V

    invoke-interface {p1, v1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v1, Lio/reactivex/internal/operators/observable/Z0$b;

    iget-object v2, p0, Lio/reactivex/internal/operators/observable/Z0;->c:Lio/reactivex/B;

    invoke-direct {v1, v0, v2}, Lio/reactivex/internal/operators/observable/Z0$b;-><init>(Lio/reactivex/D;Lio/reactivex/B;)V

    invoke-interface {p1, v1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    :goto_0
    return-void
.end method
