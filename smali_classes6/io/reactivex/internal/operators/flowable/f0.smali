.class public final Lio/reactivex/internal/operators/flowable/f0;
.super Lio/reactivex/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/f0$a;,
        Lio/reactivex/internal/operators/flowable/f0$b;,
        Lio/reactivex/internal/operators/flowable/f0$c;
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

.field public final g:Z


# direct methods
.method public constructor <init>(Lio/reactivex/k;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/flowable/a;-><init>(Lio/reactivex/k;)V

    iput-wide p2, p0, Lio/reactivex/internal/operators/flowable/f0;->d:J

    iput-object p4, p0, Lio/reactivex/internal/operators/flowable/f0;->e:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lio/reactivex/internal/operators/flowable/f0;->f:Lio/reactivex/E;

    iput-boolean p6, p0, Lio/reactivex/internal/operators/flowable/f0;->g:Z

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v1, Lio/reactivex/subscribers/a;

    invoke-direct {v1, p1}, Lio/reactivex/subscribers/a;-><init>(LhT5;)V

    iget-boolean p1, p0, Lio/reactivex/internal/operators/flowable/f0;->g:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    new-instance v6, Lio/reactivex/internal/operators/flowable/f0$a;

    iget-wide v2, p0, Lio/reactivex/internal/operators/flowable/f0;->d:J

    iget-object v4, p0, Lio/reactivex/internal/operators/flowable/f0;->e:Ljava/util/concurrent/TimeUnit;

    iget-object v5, p0, Lio/reactivex/internal/operators/flowable/f0;->f:Lio/reactivex/E;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lio/reactivex/internal/operators/flowable/f0$a;-><init>(LhT5;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V

    invoke-virtual {p1, v6}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    new-instance v6, Lio/reactivex/internal/operators/flowable/f0$b;

    iget-wide v2, p0, Lio/reactivex/internal/operators/flowable/f0;->d:J

    iget-object v4, p0, Lio/reactivex/internal/operators/flowable/f0;->e:Ljava/util/concurrent/TimeUnit;

    iget-object v5, p0, Lio/reactivex/internal/operators/flowable/f0;->f:Lio/reactivex/E;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lio/reactivex/internal/operators/flowable/f0$b;-><init>(LhT5;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V

    invoke-virtual {p1, v6}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    :goto_0
    return-void
.end method
