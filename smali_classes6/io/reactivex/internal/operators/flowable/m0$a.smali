.class public final Lio/reactivex/internal/operators/flowable/m0$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "LoT5;",
        ">;",
        "Lio/reactivex/o<",
        "TR;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x3540c639803a63b9L


# instance fields
.field public final b:Lio/reactivex/internal/operators/flowable/m0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/operators/flowable/m0$b<",
            "TT;TR;>;"
        }
    .end annotation
.end field

.field public final c:J

.field public final d:I

.field public volatile e:Lio/reactivex/internal/fuseable/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/fuseable/j<",
            "TR;>;"
        }
    .end annotation
.end field

.field public volatile f:Z

.field public g:I


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/flowable/m0$b;JI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/operators/flowable/m0$b<",
            "TT;TR;>;JI)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/m0$a;->b:Lio/reactivex/internal/operators/flowable/m0$b;

    iput-wide p2, p0, Lio/reactivex/internal/operators/flowable/m0$a;->c:J

    iput p4, p0, Lio/reactivex/internal/operators/flowable/m0$a;->d:I

    return-void
.end method


# virtual methods
.method public a(LoT5;)V
    .locals 3

    invoke-static {p0, p1}, Lio/reactivex/internal/subscriptions/g;->f(Ljava/util/concurrent/atomic/AtomicReference;LoT5;)Z

    move-result v0

    if-eqz v0, :cond_2

    instance-of v0, p1, Lio/reactivex/internal/fuseable/g;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lio/reactivex/internal/fuseable/g;

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Lio/reactivex/internal/fuseable/f;->b(I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iput v1, p0, Lio/reactivex/internal/operators/flowable/m0$a;->g:I

    iput-object v0, p0, Lio/reactivex/internal/operators/flowable/m0$a;->e:Lio/reactivex/internal/fuseable/j;

    iput-boolean v2, p0, Lio/reactivex/internal/operators/flowable/m0$a;->f:Z

    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/m0$a;->b:Lio/reactivex/internal/operators/flowable/m0$b;

    invoke-virtual {p1}, Lio/reactivex/internal/operators/flowable/m0$b;->c()V

    return-void

    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iput v1, p0, Lio/reactivex/internal/operators/flowable/m0$a;->g:I

    iput-object v0, p0, Lio/reactivex/internal/operators/flowable/m0$a;->e:Lio/reactivex/internal/fuseable/j;

    iget v0, p0, Lio/reactivex/internal/operators/flowable/m0$a;->d:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LoT5;->o(J)V

    return-void

    :cond_1
    new-instance v0, Lio/reactivex/internal/queue/b;

    iget v1, p0, Lio/reactivex/internal/operators/flowable/m0$a;->d:I

    invoke-direct {v0, v1}, Lio/reactivex/internal/queue/b;-><init>(I)V

    iput-object v0, p0, Lio/reactivex/internal/operators/flowable/m0$a;->e:Lio/reactivex/internal/fuseable/j;

    iget v0, p0, Lio/reactivex/internal/operators/flowable/m0$a;->d:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LoT5;->o(J)V

    :cond_2
    return-void
.end method

.method public b()V
    .locals 0

    invoke-static {p0}, Lio/reactivex/internal/subscriptions/g;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public c(J)V
    .locals 2

    iget v0, p0, Lio/reactivex/internal/operators/flowable/m0$a;->g:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LoT5;

    invoke-interface {v0, p1, p2}, LoT5;->o(J)V

    :cond_0
    return-void
.end method

.method public onComplete()V
    .locals 5

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/m0$a;->b:Lio/reactivex/internal/operators/flowable/m0$b;

    iget-wide v1, p0, Lio/reactivex/internal/operators/flowable/m0$a;->c:J

    iget-wide v3, v0, Lio/reactivex/internal/operators/flowable/m0$b;->l:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lio/reactivex/internal/operators/flowable/m0$a;->f:Z

    invoke-virtual {v0}, Lio/reactivex/internal/operators/flowable/m0$b;->c()V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 5

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/m0$a;->b:Lio/reactivex/internal/operators/flowable/m0$b;

    iget-wide v1, p0, Lio/reactivex/internal/operators/flowable/m0$a;->c:J

    iget-wide v3, v0, Lio/reactivex/internal/operators/flowable/m0$b;->l:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_1

    iget-object v1, v0, Lio/reactivex/internal/operators/flowable/m0$b;->g:Lio/reactivex/internal/util/c;

    invoke-virtual {v1, p1}, Lio/reactivex/internal/util/c;->a(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean p1, v0, Lio/reactivex/internal/operators/flowable/m0$b;->e:Z

    const/4 v1, 0x1

    if-nez p1, :cond_0

    iget-object p1, v0, Lio/reactivex/internal/operators/flowable/m0$b;->i:LoT5;

    invoke-interface {p1}, LoT5;->cancel()V

    iput-boolean v1, v0, Lio/reactivex/internal/operators/flowable/m0$b;->f:Z

    :cond_0
    iput-boolean v1, p0, Lio/reactivex/internal/operators/flowable/m0$a;->f:Z

    invoke-virtual {v0}, Lio/reactivex/internal/operators/flowable/m0$b;->c()V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/m0$a;->b:Lio/reactivex/internal/operators/flowable/m0$b;

    iget-wide v1, p0, Lio/reactivex/internal/operators/flowable/m0$a;->c:J

    iget-wide v3, v0, Lio/reactivex/internal/operators/flowable/m0$b;->l:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_1

    iget v1, p0, Lio/reactivex/internal/operators/flowable/m0$a;->g:I

    if-nez v1, :cond_0

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/m0$a;->e:Lio/reactivex/internal/fuseable/j;

    invoke-interface {v1, p1}, Lio/reactivex/internal/fuseable/j;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Lio/reactivex/exceptions/MissingBackpressureException;

    const-string v0, "Queue full?!"

    invoke-direct {p1, v0}, Lio/reactivex/exceptions/MissingBackpressureException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/reactivex/internal/operators/flowable/m0$a;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lio/reactivex/internal/operators/flowable/m0$b;->c()V

    :cond_1
    return-void
.end method
