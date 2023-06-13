.class public final Lio/reactivex/internal/operators/flowable/g$a$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/g$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "LoT5;",
        ">;",
        "Lio/reactivex/o<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x3605ff92ed908fcaL


# instance fields
.field public final synthetic b:Lio/reactivex/internal/operators/flowable/g$a;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/flowable/g$a;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/g$a$a;->b:Lio/reactivex/internal/operators/flowable/g$a;

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LoT5;)V
    .locals 2

    invoke-static {p0, p1}, Lio/reactivex/internal/subscriptions/g;->f(Ljava/util/concurrent/atomic/AtomicReference;LoT5;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LoT5;->o(J)V

    :cond_0
    return-void
.end method

.method public onComplete()V
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LoT5;

    sget-object v1, Lio/reactivex/internal/subscriptions/g;->b:Lio/reactivex/internal/subscriptions/g;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/g$a$a;->b:Lio/reactivex/internal/operators/flowable/g$a;

    invoke-virtual {v0}, Lio/reactivex/internal/operators/flowable/g$a;->b()V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LoT5;

    sget-object v1, Lio/reactivex/internal/subscriptions/g;->b:Lio/reactivex/internal/subscriptions/g;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/g$a$a;->b:Lio/reactivex/internal/operators/flowable/g$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/flowable/g$a;->b:LhT5;

    invoke-interface {v0, p1}, LhT5;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LoT5;

    sget-object v0, Lio/reactivex/internal/subscriptions/g;->b:Lio/reactivex/internal/subscriptions/g;

    if-eq p1, v0, :cond_0

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    invoke-interface {p1}, LoT5;->cancel()V

    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/g$a$a;->b:Lio/reactivex/internal/operators/flowable/g$a;

    invoke-virtual {p1}, Lio/reactivex/internal/operators/flowable/g$a;->b()V

    :cond_0
    return-void
.end method
