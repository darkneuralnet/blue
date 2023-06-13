.class public final Lio/reactivex/internal/operators/flowable/L;
.super Lio/reactivex/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/L$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/flowable/a<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field public final d:I

.field public final e:Z

.field public final f:Z

.field public final g:Lio/reactivex/functions/a;


# direct methods
.method public constructor <init>(Lio/reactivex/k;IZZLio/reactivex/functions/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;IZZ",
            "Lio/reactivex/functions/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/flowable/a;-><init>(Lio/reactivex/k;)V

    iput p2, p0, Lio/reactivex/internal/operators/flowable/L;->d:I

    iput-boolean p3, p0, Lio/reactivex/internal/operators/flowable/L;->e:Z

    iput-boolean p4, p0, Lio/reactivex/internal/operators/flowable/L;->f:Z

    iput-object p5, p0, Lio/reactivex/internal/operators/flowable/L;->g:Lio/reactivex/functions/a;

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    new-instance v7, Lio/reactivex/internal/operators/flowable/L$a;

    iget v3, p0, Lio/reactivex/internal/operators/flowable/L;->d:I

    iget-boolean v4, p0, Lio/reactivex/internal/operators/flowable/L;->e:Z

    iget-boolean v5, p0, Lio/reactivex/internal/operators/flowable/L;->f:Z

    iget-object v6, p0, Lio/reactivex/internal/operators/flowable/L;->g:Lio/reactivex/functions/a;

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lio/reactivex/internal/operators/flowable/L$a;-><init>(LhT5;IZZLio/reactivex/functions/a;)V

    invoke-virtual {v0, v7}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    return-void
.end method
