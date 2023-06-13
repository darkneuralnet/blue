.class public final Lio/reactivex/internal/operators/flowable/p0;
.super Lio/reactivex/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/p0$a;
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

.field public final e:Ljava/util/concurrent/TimeUnit;

.field public final f:Lio/reactivex/E;


# direct methods
.method public constructor <init>(Lio/reactivex/k;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/flowable/a;-><init>(Lio/reactivex/k;)V

    iput-wide p2, p0, Lio/reactivex/internal/operators/flowable/p0;->d:J

    iput-object p4, p0, Lio/reactivex/internal/operators/flowable/p0;->e:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lio/reactivex/internal/operators/flowable/p0;->f:Lio/reactivex/E;

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

    new-instance v7, Lio/reactivex/internal/operators/flowable/p0$a;

    new-instance v2, Lio/reactivex/subscribers/a;

    invoke-direct {v2, p1}, Lio/reactivex/subscribers/a;-><init>(LhT5;)V

    iget-wide v3, p0, Lio/reactivex/internal/operators/flowable/p0;->d:J

    iget-object v5, p0, Lio/reactivex/internal/operators/flowable/p0;->e:Ljava/util/concurrent/TimeUnit;

    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/p0;->f:Lio/reactivex/E;

    invoke-virtual {p1}, Lio/reactivex/E;->b()Lio/reactivex/E$c;

    move-result-object v6

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lio/reactivex/internal/operators/flowable/p0$a;-><init>(LhT5;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E$c;)V

    invoke-virtual {v0, v7}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    return-void
.end method
