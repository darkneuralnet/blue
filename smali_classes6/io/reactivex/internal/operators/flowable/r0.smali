.class public final Lio/reactivex/internal/operators/flowable/r0;
.super Lio/reactivex/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/r0$a;
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

.field public final e:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public constructor <init>(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/k;-><init>()V

    iput-wide p1, p0, Lio/reactivex/internal/operators/flowable/r0;->d:J

    iput-object p3, p0, Lio/reactivex/internal/operators/flowable/r0;->e:Ljava/util/concurrent/TimeUnit;

    iput-object p4, p0, Lio/reactivex/internal/operators/flowable/r0;->c:Lio/reactivex/E;

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/flowable/r0$a;

    invoke-direct {v0, p1}, Lio/reactivex/internal/operators/flowable/r0$a;-><init>(LhT5;)V

    invoke-interface {p1, v0}, LhT5;->a(LoT5;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/r0;->c:Lio/reactivex/E;

    iget-wide v1, p0, Lio/reactivex/internal/operators/flowable/r0;->d:J

    iget-object v3, p0, Lio/reactivex/internal/operators/flowable/r0;->e:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2, v3}, Lio/reactivex/E;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/internal/operators/flowable/r0$a;->a(Lio/reactivex/disposables/c;)V

    return-void
.end method
