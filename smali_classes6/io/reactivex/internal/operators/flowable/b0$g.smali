.class public final Lio/reactivex/internal/operators/flowable/b0$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lna4;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lna4<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/internal/operators/flowable/b0$h<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "+",
            "Lio/reactivex/internal/operators/flowable/b0$e<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/Callable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/internal/operators/flowable/b0$h<",
            "TT;>;>;",
            "Ljava/util/concurrent/Callable<",
            "+",
            "Lio/reactivex/internal/operators/flowable/b0$e<",
            "TT;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/b0$g;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/b0$g;->c:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method public c(LhT5;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    :goto_0
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/b0$g;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/internal/operators/flowable/b0$h;

    if-nez v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/b0$g;->c:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/internal/operators/flowable/b0$e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v1, Lio/reactivex/internal/operators/flowable/b0$h;

    invoke-direct {v1, v0}, Lio/reactivex/internal/operators/flowable/b0$h;-><init>(Lio/reactivex/internal/operators/flowable/b0$e;)V

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/b0$g;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Li24;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lio/reactivex/internal/subscriptions/d;->c(Ljava/lang/Throwable;LhT5;)V

    return-void

    :cond_1
    :goto_1
    new-instance v1, Lio/reactivex/internal/operators/flowable/b0$c;

    invoke-direct {v1, v0, p1}, Lio/reactivex/internal/operators/flowable/b0$c;-><init>(Lio/reactivex/internal/operators/flowable/b0$h;LhT5;)V

    invoke-interface {p1, v1}, LhT5;->a(LoT5;)V

    invoke-virtual {v0, v1}, Lio/reactivex/internal/operators/flowable/b0$h;->b(Lio/reactivex/internal/operators/flowable/b0$c;)Z

    invoke-virtual {v1}, Lio/reactivex/internal/operators/flowable/b0$c;->e()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, v1}, Lio/reactivex/internal/operators/flowable/b0$h;->d(Lio/reactivex/internal/operators/flowable/b0$c;)V

    return-void

    :cond_2
    invoke-virtual {v0}, Lio/reactivex/internal/operators/flowable/b0$h;->c()V

    iget-object p1, v0, Lio/reactivex/internal/operators/flowable/b0$h;->b:Lio/reactivex/internal/operators/flowable/b0$e;

    invoke-interface {p1, v1}, Lio/reactivex/internal/operators/flowable/b0$e;->h(Lio/reactivex/internal/operators/flowable/b0$c;)V

    return-void
.end method
