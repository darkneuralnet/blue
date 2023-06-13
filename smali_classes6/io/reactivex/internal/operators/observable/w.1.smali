.class public final Lio/reactivex/internal/operators/observable/w;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/w$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/observable/a<",
        "TT;TR;>;"
    }
.end annotation


# instance fields
.field public final c:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/B<",
            "+TR;>;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/internal/util/j;

.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(Lio/reactivex/B;Lio/reactivex/functions/o;Lio/reactivex/internal/util/j;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/B<",
            "+TR;>;>;",
            "Lio/reactivex/internal/util/j;",
            "II)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/w;->c:Lio/reactivex/functions/o;

    iput-object p3, p0, Lio/reactivex/internal/operators/observable/w;->d:Lio/reactivex/internal/util/j;

    iput p4, p0, Lio/reactivex/internal/operators/observable/w;->e:I

    iput p5, p0, Lio/reactivex/internal/operators/observable/w;->f:I

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TR;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v7, Lio/reactivex/internal/operators/observable/w$a;

    iget-object v3, p0, Lio/reactivex/internal/operators/observable/w;->c:Lio/reactivex/functions/o;

    iget v4, p0, Lio/reactivex/internal/operators/observable/w;->e:I

    iget v5, p0, Lio/reactivex/internal/operators/observable/w;->f:I

    iget-object v6, p0, Lio/reactivex/internal/operators/observable/w;->d:Lio/reactivex/internal/util/j;

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lio/reactivex/internal/operators/observable/w$a;-><init>(Lio/reactivex/D;Lio/reactivex/functions/o;IILio/reactivex/internal/util/j;)V

    invoke-interface {v0, v7}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
