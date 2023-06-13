.class public final Lio/reactivex/internal/operators/completable/A;
.super Lio/reactivex/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/completable/A$a;,
        Lio/reactivex/internal/operators/completable/A$b;
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/h;

.field public final c:J

.field public final d:Ljava/util/concurrent/TimeUnit;

.field public final e:Lio/reactivex/E;

.field public final f:Lio/reactivex/h;


# direct methods
.method public constructor <init>(Lio/reactivex/h;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Lio/reactivex/h;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/completable/A;->b:Lio/reactivex/h;

    iput-wide p2, p0, Lio/reactivex/internal/operators/completable/A;->c:J

    iput-object p4, p0, Lio/reactivex/internal/operators/completable/A;->d:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lio/reactivex/internal/operators/completable/A;->e:Lio/reactivex/E;

    iput-object p6, p0, Lio/reactivex/internal/operators/completable/A;->f:Lio/reactivex/h;

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 7

    new-instance v0, Lio/reactivex/disposables/b;

    invoke-direct {v0}, Lio/reactivex/disposables/b;-><init>()V

    invoke-interface {p1, v0}, Lio/reactivex/f;->onSubscribe(Lio/reactivex/disposables/c;)V

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iget-object v2, p0, Lio/reactivex/internal/operators/completable/A;->e:Lio/reactivex/E;

    new-instance v3, Lio/reactivex/internal/operators/completable/A$a;

    invoke-direct {v3, p0, v1, v0, p1}, Lio/reactivex/internal/operators/completable/A$a;-><init>(Lio/reactivex/internal/operators/completable/A;Ljava/util/concurrent/atomic/AtomicBoolean;Lio/reactivex/disposables/b;Lio/reactivex/f;)V

    iget-wide v4, p0, Lio/reactivex/internal/operators/completable/A;->c:J

    iget-object v6, p0, Lio/reactivex/internal/operators/completable/A;->d:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v3, v4, v5, v6}, Lio/reactivex/E;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/disposables/b;->c(Lio/reactivex/disposables/c;)Z

    iget-object v2, p0, Lio/reactivex/internal/operators/completable/A;->b:Lio/reactivex/h;

    new-instance v3, Lio/reactivex/internal/operators/completable/A$b;

    invoke-direct {v3, v0, v1, p1}, Lio/reactivex/internal/operators/completable/A$b;-><init>(Lio/reactivex/disposables/b;Ljava/util/concurrent/atomic/AtomicBoolean;Lio/reactivex/f;)V

    invoke-interface {v2, v3}, Lio/reactivex/h;->g(Lio/reactivex/f;)V

    return-void
.end method
