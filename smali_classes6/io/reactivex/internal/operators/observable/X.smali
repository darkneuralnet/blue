.class public final Lio/reactivex/internal/operators/observable/X;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/X$a;,
        Lio/reactivex/internal/operators/observable/X$b;
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
        "TT;TU;>;"
    }
.end annotation


# instance fields
.field public final c:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/B<",
            "+TU;>;>;"
        }
    .end annotation
.end field

.field public final d:Z

.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(Lio/reactivex/B;Lio/reactivex/functions/o;ZII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/B<",
            "+TU;>;>;ZII)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/X;->c:Lio/reactivex/functions/o;

    iput-boolean p3, p0, Lio/reactivex/internal/operators/observable/X;->d:Z

    iput p4, p0, Lio/reactivex/internal/operators/observable/X;->e:I

    iput p5, p0, Lio/reactivex/internal/operators/observable/X;->f:I

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TU;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/X;->c:Lio/reactivex/functions/o;

    invoke-static {v0, p1, v1}, Lio/reactivex/internal/operators/observable/a1;->b(Lio/reactivex/B;Lio/reactivex/D;Lio/reactivex/functions/o;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v7, Lio/reactivex/internal/operators/observable/X$b;

    iget-object v3, p0, Lio/reactivex/internal/operators/observable/X;->c:Lio/reactivex/functions/o;

    iget-boolean v4, p0, Lio/reactivex/internal/operators/observable/X;->d:Z

    iget v5, p0, Lio/reactivex/internal/operators/observable/X;->e:I

    iget v6, p0, Lio/reactivex/internal/operators/observable/X;->f:I

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lio/reactivex/internal/operators/observable/X$b;-><init>(Lio/reactivex/D;Lio/reactivex/functions/o;ZII)V

    invoke-interface {v0, v7}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
