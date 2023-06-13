.class public final Lio/reactivex/internal/operators/completable/A$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/completable/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/completable/A$a$a;
    }
.end annotation


# instance fields
.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final c:Lio/reactivex/disposables/b;

.field public final d:Lio/reactivex/f;

.field public final synthetic e:Lio/reactivex/internal/operators/completable/A;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/completable/A;Ljava/util/concurrent/atomic/AtomicBoolean;Lio/reactivex/disposables/b;Lio/reactivex/f;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/internal/operators/completable/A$a;->e:Lio/reactivex/internal/operators/completable/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/reactivex/internal/operators/completable/A$a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Lio/reactivex/internal/operators/completable/A$a;->c:Lio/reactivex/disposables/b;

    iput-object p4, p0, Lio/reactivex/internal/operators/completable/A$a;->d:Lio/reactivex/f;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lio/reactivex/internal/operators/completable/A$a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/reactivex/internal/operators/completable/A$a;->c:Lio/reactivex/disposables/b;

    invoke-virtual {v0}, Lio/reactivex/disposables/b;->d()V

    iget-object v0, p0, Lio/reactivex/internal/operators/completable/A$a;->e:Lio/reactivex/internal/operators/completable/A;

    iget-object v0, v0, Lio/reactivex/internal/operators/completable/A;->f:Lio/reactivex/h;

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/completable/A$a;->d:Lio/reactivex/f;

    new-instance v1, Ljava/util/concurrent/TimeoutException;

    iget-object v2, p0, Lio/reactivex/internal/operators/completable/A$a;->e:Lio/reactivex/internal/operators/completable/A;

    iget-wide v3, v2, Lio/reactivex/internal/operators/completable/A;->c:J

    iget-object v2, v2, Lio/reactivex/internal/operators/completable/A;->d:Ljava/util/concurrent/TimeUnit;

    invoke-static {v3, v4, v2}, Lio/reactivex/internal/util/k;->d(JLjava/util/concurrent/TimeUnit;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lio/reactivex/f;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    new-instance v1, Lio/reactivex/internal/operators/completable/A$a$a;

    invoke-direct {v1, p0}, Lio/reactivex/internal/operators/completable/A$a$a;-><init>(Lio/reactivex/internal/operators/completable/A$a;)V

    invoke-interface {v0, v1}, Lio/reactivex/h;->g(Lio/reactivex/f;)V

    :cond_1
    :goto_0
    return-void
.end method
