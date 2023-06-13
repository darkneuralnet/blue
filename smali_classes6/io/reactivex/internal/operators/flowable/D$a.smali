.class public final Lio/reactivex/internal/operators/flowable/D$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/o;
.implements Lio/reactivex/internal/fuseable/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/o<",
        "TT;>;",
        "Lio/reactivex/internal/fuseable/g<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:LhT5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LhT5<",
            "-TT;>;"
        }
    .end annotation
.end field

.field public c:LoT5;


# direct methods
.method public constructor <init>(LhT5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/D$a;->b:LhT5;

    return-void
.end method


# virtual methods
.method public a(LoT5;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/D$a;->c:LoT5;

    invoke-static {v0, p1}, Lio/reactivex/internal/subscriptions/g;->i(LoT5;LoT5;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/D$a;->c:LoT5;

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/D$a;->b:LhT5;

    invoke-interface {v0, p0}, LhT5;->a(LoT5;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LoT5;->o(J)V

    :cond_0
    return-void
.end method

.method public b(I)I
    .locals 0

    and-int/lit8 p1, p1, 0x2

    return p1
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/D$a;->c:LoT5;

    invoke-interface {v0}, LoT5;->cancel()V

    return-void
.end method

.method public clear()V
    .locals 0

    return-void
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public o(J)V
    .locals 0

    return-void
.end method

.method public offer(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Should not be called!"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/D$a;->b:LhT5;

    invoke-interface {v0}, LhT5;->onComplete()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/D$a;->b:LhT5;

    invoke-interface {v0, p1}, LhT5;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    return-void
.end method

.method public poll()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method
