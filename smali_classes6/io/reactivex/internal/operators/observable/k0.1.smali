.class public final Lio/reactivex/internal/operators/observable/k0;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/k0$c;,
        Lio/reactivex/internal/operators/observable/k0$b;,
        Lio/reactivex/internal/operators/observable/k0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/observable/a<",
        "TT;",
        "Lio/reactivex/observables/b<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final c:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-TT;+TK;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-TT;+TV;>;"
        }
    .end annotation
.end field

.field public final e:I

.field public final f:Z


# direct methods
.method public constructor <init>(Lio/reactivex/B;Lio/reactivex/functions/o;Lio/reactivex/functions/o;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;",
            "Lio/reactivex/functions/o<",
            "-TT;+TK;>;",
            "Lio/reactivex/functions/o<",
            "-TT;+TV;>;IZ)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/k0;->c:Lio/reactivex/functions/o;

    iput-object p3, p0, Lio/reactivex/internal/operators/observable/k0;->d:Lio/reactivex/functions/o;

    iput p4, p0, Lio/reactivex/internal/operators/observable/k0;->e:I

    iput-boolean p5, p0, Lio/reactivex/internal/operators/observable/k0;->f:Z

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-",
            "Lio/reactivex/observables/b<",
            "TK;TV;>;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v7, Lio/reactivex/internal/operators/observable/k0$a;

    iget-object v3, p0, Lio/reactivex/internal/operators/observable/k0;->c:Lio/reactivex/functions/o;

    iget-object v4, p0, Lio/reactivex/internal/operators/observable/k0;->d:Lio/reactivex/functions/o;

    iget v5, p0, Lio/reactivex/internal/operators/observable/k0;->e:I

    iget-boolean v6, p0, Lio/reactivex/internal/operators/observable/k0;->f:Z

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lio/reactivex/internal/operators/observable/k0$a;-><init>(Lio/reactivex/D;Lio/reactivex/functions/o;Lio/reactivex/functions/o;IZ)V

    invoke-interface {v0, v7}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
