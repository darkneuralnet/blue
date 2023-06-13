.class public final Lio/reactivex/internal/operators/flowable/h0$a;
.super Lio/reactivex/internal/subscriptions/c;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/h0;
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
        "Lio/reactivex/internal/subscriptions/c<",
        "TT;>;",
        "Lio/reactivex/o<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x4cb078945f01c821L


# instance fields
.field public final d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final e:Z

.field public f:LoT5;

.field public g:Z


# direct methods
.method public constructor <init>(LhT5;Ljava/lang/Object;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;TT;Z)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/subscriptions/c;-><init>(LhT5;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/h0$a;->d:Ljava/lang/Object;

    iput-boolean p3, p0, Lio/reactivex/internal/operators/flowable/h0$a;->e:Z

    return-void
.end method


# virtual methods
.method public a(LoT5;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/h0$a;->f:LoT5;

    invoke-static {v0, p1}, Lio/reactivex/internal/subscriptions/g;->i(LoT5;LoT5;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/h0$a;->f:LoT5;

    iget-object v0, p0, Lio/reactivex/internal/subscriptions/c;->b:LhT5;

    invoke-interface {v0, p0}, LhT5;->a(LoT5;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LoT5;->o(J)V

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 1

    invoke-super {p0}, Lio/reactivex/internal/subscriptions/c;->cancel()V

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/h0$a;->f:LoT5;

    invoke-interface {v0}, LoT5;->cancel()V

    return-void
.end method

.method public onComplete()V
    .locals 2

    iget-boolean v0, p0, Lio/reactivex/internal/operators/flowable/h0$a;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/operators/flowable/h0$a;->g:Z

    iget-object v0, p0, Lio/reactivex/internal/subscriptions/c;->c:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, Lio/reactivex/internal/subscriptions/c;->c:Ljava/lang/Object;

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/h0$a;->d:Ljava/lang/Object;

    :cond_1
    if-nez v0, :cond_3

    iget-boolean v0, p0, Lio/reactivex/internal/operators/flowable/h0$a;->e:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/reactivex/internal/subscriptions/c;->b:LhT5;

    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    invoke-interface {v0, v1}, LhT5;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lio/reactivex/internal/subscriptions/c;->b:LhT5;

    invoke-interface {v0}, LhT5;->onComplete()V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v0}, Lio/reactivex/internal/subscriptions/c;->c(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/internal/operators/flowable/h0$a;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/operators/flowable/h0$a;->g:Z

    iget-object v0, p0, Lio/reactivex/internal/subscriptions/c;->b:LhT5;

    invoke-interface {v0, p1}, LhT5;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lio/reactivex/internal/operators/flowable/h0$a;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/subscriptions/c;->c:Ljava/lang/Object;

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/reactivex/internal/operators/flowable/h0$a;->g:Z

    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/h0$a;->f:LoT5;

    invoke-interface {p1}, LoT5;->cancel()V

    iget-object p1, p0, Lio/reactivex/internal/subscriptions/c;->b:LhT5;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Sequence contains more than one element!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, LhT5;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    iput-object p1, p0, Lio/reactivex/internal/subscriptions/c;->c:Ljava/lang/Object;

    return-void
.end method
