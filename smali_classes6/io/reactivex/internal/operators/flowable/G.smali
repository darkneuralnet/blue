.class public final Lio/reactivex/internal/operators/flowable/G;
.super Lio/reactivex/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/G$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/k<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field public final c:Lio/reactivex/E;

.field public final d:J

.field public final e:J

.field public final f:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public constructor <init>(JJLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/k;-><init>()V

    iput-wide p1, p0, Lio/reactivex/internal/operators/flowable/G;->d:J

    iput-wide p3, p0, Lio/reactivex/internal/operators/flowable/G;->e:J

    iput-object p5, p0, Lio/reactivex/internal/operators/flowable/G;->f:Ljava/util/concurrent/TimeUnit;

    iput-object p6, p0, Lio/reactivex/internal/operators/flowable/G;->c:Lio/reactivex/E;

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    new-instance v7, Lio/reactivex/internal/operators/flowable/G$a;

    invoke-direct {v7, p1}, Lio/reactivex/internal/operators/flowable/G$a;-><init>(LhT5;)V

    invoke-interface {p1, v7}, LhT5;->a(LoT5;)V

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/G;->c:Lio/reactivex/E;

    instance-of p1, v0, Lio/reactivex/internal/schedulers/p;

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lio/reactivex/E;->b()Lio/reactivex/E$c;

    move-result-object v0

    invoke-virtual {v7, v0}, Lio/reactivex/internal/operators/flowable/G$a;->a(Lio/reactivex/disposables/c;)V

    iget-wide v2, p0, Lio/reactivex/internal/operators/flowable/G;->d:J

    iget-wide v4, p0, Lio/reactivex/internal/operators/flowable/G;->e:J

    iget-object v6, p0, Lio/reactivex/internal/operators/flowable/G;->f:Ljava/util/concurrent/TimeUnit;

    move-object v1, v7

    invoke-virtual/range {v0 .. v6}, Lio/reactivex/E$c;->d(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lio/reactivex/internal/operators/flowable/G;->d:J

    iget-wide v4, p0, Lio/reactivex/internal/operators/flowable/G;->e:J

    iget-object v6, p0, Lio/reactivex/internal/operators/flowable/G;->f:Ljava/util/concurrent/TimeUnit;

    move-object v1, v7

    invoke-virtual/range {v0 .. v6}, Lio/reactivex/E;->f(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    move-result-object p1

    invoke-virtual {v7, p1}, Lio/reactivex/internal/operators/flowable/G$a;->a(Lio/reactivex/disposables/c;)V

    :goto_0
    return-void
.end method
