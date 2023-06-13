.class public final Lio/reactivex/internal/operators/flowable/X$b;
.super Ljava/util/concurrent/atomic/AtomicBoolean;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/o;
.implements LoT5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "Lio/reactivex/o<",
        "TT;>;",
        "LoT5;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x66f7ddf0554a95a7L


# instance fields
.field public final b:LhT5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LhT5<",
            "-TT;>;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/internal/operators/flowable/X;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/operators/flowable/X<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/internal/operators/flowable/X$a;

.field public e:LoT5;


# direct methods
.method public constructor <init>(LhT5;Lio/reactivex/internal/operators/flowable/X;Lio/reactivex/internal/operators/flowable/X$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;",
            "Lio/reactivex/internal/operators/flowable/X<",
            "TT;>;",
            "Lio/reactivex/internal/operators/flowable/X$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/X$b;->b:LhT5;

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/X$b;->c:Lio/reactivex/internal/operators/flowable/X;

    iput-object p3, p0, Lio/reactivex/internal/operators/flowable/X$b;->d:Lio/reactivex/internal/operators/flowable/X$a;

    return-void
.end method


# virtual methods
.method public a(LoT5;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/X$b;->e:LoT5;

    invoke-static {v0, p1}, Lio/reactivex/internal/subscriptions/g;->i(LoT5;LoT5;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/X$b;->e:LoT5;

    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/X$b;->b:LhT5;

    invoke-interface {p1, p0}, LhT5;->a(LoT5;)V

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/X$b;->e:LoT5;

    invoke-interface {v0}, LoT5;->cancel()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/X$b;->c:Lio/reactivex/internal/operators/flowable/X;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/X$b;->d:Lio/reactivex/internal/operators/flowable/X$a;

    invoke-virtual {v0, v1}, Lio/reactivex/internal/operators/flowable/X;->x1(Lio/reactivex/internal/operators/flowable/X$a;)V

    :cond_0
    return-void
.end method

.method public o(J)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/X$b;->e:LoT5;

    invoke-interface {v0, p1, p2}, LoT5;->o(J)V

    return-void
.end method

.method public onComplete()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/X$b;->c:Lio/reactivex/internal/operators/flowable/X;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/X$b;->d:Lio/reactivex/internal/operators/flowable/X$a;

    invoke-virtual {v0, v1}, Lio/reactivex/internal/operators/flowable/X;->A1(Lio/reactivex/internal/operators/flowable/X$a;)V

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/X$b;->b:LhT5;

    invoke-interface {v0}, LhT5;->onComplete()V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/X$b;->c:Lio/reactivex/internal/operators/flowable/X;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/X$b;->d:Lio/reactivex/internal/operators/flowable/X$a;

    invoke-virtual {v0, v1}, Lio/reactivex/internal/operators/flowable/X;->A1(Lio/reactivex/internal/operators/flowable/X$a;)V

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/X$b;->b:LhT5;

    invoke-interface {v0, p1}, LhT5;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/X$b;->b:LhT5;

    invoke-interface {v0, p1}, LhT5;->onNext(Ljava/lang/Object;)V

    return-void
.end method
