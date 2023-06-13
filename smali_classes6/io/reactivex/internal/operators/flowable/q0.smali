.class public final Lio/reactivex/internal/operators/flowable/q0;
.super Lio/reactivex/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/q0$a;
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

    iput-wide p2, p0, Lio/reactivex/internal/operators/flowable/q0;->d:J

    iput-object p4, p0, Lio/reactivex/internal/operators/flowable/q0;->e:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lio/reactivex/internal/operators/flowable/q0;->f:Lio/reactivex/E;

    iput-boolean p6, p0, Lio/reactivex/internal/operators/flowable/q0;->g:Z

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    new-instance v8, Lio/reactivex/internal/operators/flowable/q0$a;

    iget-wide v3, p0, Lio/reactivex/internal/operators/flowable/q0;->d:J

    iget-object v5, p0, Lio/reactivex/internal/operators/flowable/q0;->e:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/q0;->f:Lio/reactivex/E;

    invoke-virtual {v1}, Lio/reactivex/E;->b()Lio/reactivex/E$c;

    move-result-object v6

    iget-boolean v7, p0, Lio/reactivex/internal/operators/flowable/q0;->g:Z

    move-object v1, v8

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lio/reactivex/internal/operators/flowable/q0$a;-><init>(LhT5;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E$c;Z)V

    invoke-virtual {v0, v8}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    return-void
.end method
