.class public final Lio/reactivex/internal/operators/flowable/r0$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements LoT5;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/disposables/c;",
        ">;",
        "LoT5;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x26fd42ce5a1686a7L


# instance fields
.field public final b:LhT5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LhT5<",
            "-",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public volatile c:Z


# direct methods
.method public constructor <init>(LhT5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/r0$a;->b:LhT5;

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/disposables/c;)V
    .locals 0

    invoke-static {p0, p1}, Lio/reactivex/internal/disposables/d;->i(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/disposables/c;)Z

    return-void
.end method

.method public cancel()V
    .locals 0

    invoke-static {p0}, Lio/reactivex/internal/disposables/d;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public o(J)V
    .locals 0

    invoke-static {p1, p2}, Lio/reactivex/internal/subscriptions/g;->h(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/reactivex/internal/operators/flowable/r0$a;->c:Z

    :cond_0
    return-void
.end method

.method public run()V
    .locals 3

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lio/reactivex/internal/disposables/d;->b:Lio/reactivex/internal/disposables/d;

    if-eq v0, v1, :cond_1

    iget-boolean v0, p0, Lio/reactivex/internal/operators/flowable/r0$a;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/r0$a;->b:LhT5;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, LhT5;->onNext(Ljava/lang/Object;)V

    sget-object v0, Lio/reactivex/internal/disposables/e;->b:Lio/reactivex/internal/disposables/e;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/r0$a;->b:LhT5;

    invoke-interface {v0}, LhT5;->onComplete()V

    goto :goto_0

    :cond_0
    sget-object v0, Lio/reactivex/internal/disposables/e;->b:Lio/reactivex/internal/disposables/e;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/r0$a;->b:LhT5;

    new-instance v1, Lio/reactivex/exceptions/MissingBackpressureException;

    const-string v2, "Can\'t deliver value due to lack of requests"

    invoke-direct {v1, v2}, Lio/reactivex/exceptions/MissingBackpressureException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LhT5;->onError(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method
