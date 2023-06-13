.class public final Lio/reactivex/internal/operators/flowable/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/o;
.implements LoT5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/l;
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
        "LoT5;"
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

.field public final c:Lio/reactivex/functions/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/g<",
            "-",
            "LoT5;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/functions/p;

.field public final e:Lio/reactivex/functions/a;

.field public f:LoT5;


# direct methods
.method public constructor <init>(LhT5;Lio/reactivex/functions/g;Lio/reactivex/functions/p;Lio/reactivex/functions/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;",
            "Lio/reactivex/functions/g<",
            "-",
            "LoT5;",
            ">;",
            "Lio/reactivex/functions/p;",
            "Lio/reactivex/functions/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/l$a;->b:LhT5;

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/l$a;->c:Lio/reactivex/functions/g;

    iput-object p4, p0, Lio/reactivex/internal/operators/flowable/l$a;->e:Lio/reactivex/functions/a;

    iput-object p3, p0, Lio/reactivex/internal/operators/flowable/l$a;->d:Lio/reactivex/functions/p;

    return-void
.end method


# virtual methods
.method public a(LoT5;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/l$a;->c:Lio/reactivex/functions/g;

    invoke-interface {v0, p1}, Lio/reactivex/functions/g;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/l$a;->f:LoT5;

    invoke-static {v0, p1}, Lio/reactivex/internal/subscriptions/g;->i(LoT5;LoT5;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/l$a;->f:LoT5;

    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/l$a;->b:LhT5;

    invoke-interface {p1, p0}, LhT5;->a(LoT5;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    invoke-interface {p1}, LoT5;->cancel()V

    sget-object p1, Lio/reactivex/internal/subscriptions/g;->b:Lio/reactivex/internal/subscriptions/g;

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/l$a;->f:LoT5;

    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/l$a;->b:LhT5;

    invoke-static {v0, p1}, Lio/reactivex/internal/subscriptions/d;->c(Ljava/lang/Throwable;LhT5;)V

    return-void
.end method

.method public cancel()V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/l$a;->f:LoT5;

    sget-object v1, Lio/reactivex/internal/subscriptions/g;->b:Lio/reactivex/internal/subscriptions/g;

    if-eq v0, v1, :cond_0

    iput-object v1, p0, Lio/reactivex/internal/operators/flowable/l$a;->f:LoT5;

    :try_start_0
    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/l$a;->e:Lio/reactivex/functions/a;

    invoke-interface {v1}, Lio/reactivex/functions/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v1}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    :goto_0
    invoke-interface {v0}, LoT5;->cancel()V

    :cond_0
    return-void
.end method

.method public o(J)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/l$a;->d:Lio/reactivex/functions/p;

    invoke-interface {v0, p1, p2}, Lio/reactivex/functions/p;->a(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/l$a;->f:LoT5;

    invoke-interface {v0, p1, p2}, LoT5;->o(J)V

    return-void
.end method

.method public onComplete()V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/l$a;->f:LoT5;

    sget-object v1, Lio/reactivex/internal/subscriptions/g;->b:Lio/reactivex/internal/subscriptions/g;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/l$a;->b:LhT5;

    invoke-interface {v0}, LhT5;->onComplete()V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/l$a;->f:LoT5;

    sget-object v1, Lio/reactivex/internal/subscriptions/g;->b:Lio/reactivex/internal/subscriptions/g;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/l$a;->b:LhT5;

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

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/l$a;->b:LhT5;

    invoke-interface {v0, p1}, LhT5;->onNext(Ljava/lang/Object;)V

    return-void
.end method
