.class public final Lio/reactivex/internal/operators/observable/E0;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/E0$a;
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

.field public final d:Z

.field public final e:I


# direct methods
.method public constructor <init>(Lio/reactivex/B;Lio/reactivex/E;ZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;",
            "Lio/reactivex/E;",
            "ZI)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/E0;->c:Lio/reactivex/E;

    iput-boolean p3, p0, Lio/reactivex/internal/operators/observable/E0;->d:Z

    iput p4, p0, Lio/reactivex/internal/operators/observable/E0;->e:I

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/E0;->c:Lio/reactivex/E;

    instance-of v1, v0, Lio/reactivex/internal/schedulers/p;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    invoke-interface {v0, p1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/reactivex/E;->b()Lio/reactivex/E$c;

    move-result-object v0

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v2, Lio/reactivex/internal/operators/observable/E0$a;

    iget-boolean v3, p0, Lio/reactivex/internal/operators/observable/E0;->d:Z

    iget v4, p0, Lio/reactivex/internal/operators/observable/E0;->e:I

    invoke-direct {v2, p1, v0, v3, v4}, Lio/reactivex/internal/operators/observable/E0$a;-><init>(Lio/reactivex/D;Lio/reactivex/E$c;ZI)V

    invoke-interface {v1, v2}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    :goto_0
    return-void
.end method
