.class public final Lio/reactivex/internal/operators/flowable/M;
.super Lio/reactivex/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/M$b;
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
.field public final d:J

.field public final e:Lio/reactivex/functions/a;

.field public final f:Lio/reactivex/a;


# direct methods
.method public constructor <init>(Lio/reactivex/k;JLio/reactivex/functions/a;Lio/reactivex/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;J",
            "Lio/reactivex/functions/a;",
            "Lio/reactivex/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/flowable/a;-><init>(Lio/reactivex/k;)V

    iput-wide p2, p0, Lio/reactivex/internal/operators/flowable/M;->d:J

    iput-object p4, p0, Lio/reactivex/internal/operators/flowable/M;->e:Lio/reactivex/functions/a;

    iput-object p5, p0, Lio/reactivex/internal/operators/flowable/M;->f:Lio/reactivex/a;

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

    new-instance v7, Lio/reactivex/internal/operators/flowable/M$b;

    iget-object v3, p0, Lio/reactivex/internal/operators/flowable/M;->e:Lio/reactivex/functions/a;

    iget-object v4, p0, Lio/reactivex/internal/operators/flowable/M;->f:Lio/reactivex/a;

    iget-wide v5, p0, Lio/reactivex/internal/operators/flowable/M;->d:J

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lio/reactivex/internal/operators/flowable/M$b;-><init>(LhT5;Lio/reactivex/functions/a;Lio/reactivex/a;J)V

    invoke-virtual {v0, v7}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    return-void
.end method
