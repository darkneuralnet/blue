.class public final Lio/reactivex/internal/operators/observable/O;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/O$a;
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
.field public final c:Lio/reactivex/functions/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/g<",
            "-TT;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/functions/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lio/reactivex/functions/a;

.field public final f:Lio/reactivex/functions/a;


# direct methods
.method public constructor <init>(Lio/reactivex/B;Lio/reactivex/functions/g;Lio/reactivex/functions/g;Lio/reactivex/functions/a;Lio/reactivex/functions/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;",
            "Lio/reactivex/functions/g<",
            "-TT;>;",
            "Lio/reactivex/functions/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;",
            "Lio/reactivex/functions/a;",
            "Lio/reactivex/functions/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/O;->c:Lio/reactivex/functions/g;

    iput-object p3, p0, Lio/reactivex/internal/operators/observable/O;->d:Lio/reactivex/functions/g;

    iput-object p4, p0, Lio/reactivex/internal/operators/observable/O;->e:Lio/reactivex/functions/a;

    iput-object p5, p0, Lio/reactivex/internal/operators/observable/O;->f:Lio/reactivex/functions/a;

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v7, Lio/reactivex/internal/operators/observable/O$a;

    iget-object v3, p0, Lio/reactivex/internal/operators/observable/O;->c:Lio/reactivex/functions/g;

    iget-object v4, p0, Lio/reactivex/internal/operators/observable/O;->d:Lio/reactivex/functions/g;

    iget-object v5, p0, Lio/reactivex/internal/operators/observable/O;->e:Lio/reactivex/functions/a;

    iget-object v6, p0, Lio/reactivex/internal/operators/observable/O;->f:Lio/reactivex/functions/a;

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lio/reactivex/internal/operators/observable/O$a;-><init>(Lio/reactivex/D;Lio/reactivex/functions/g;Lio/reactivex/functions/g;Lio/reactivex/functions/a;Lio/reactivex/functions/a;)V

    invoke-interface {v0, v7}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
