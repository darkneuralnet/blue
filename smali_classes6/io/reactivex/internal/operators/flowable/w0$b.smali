.class public final Lio/reactivex/internal/operators/flowable/w0$b;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/o;
.implements LoT5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
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
        "TT;>;",
        "LoT5;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x4037183c76e39a4cL


# instance fields
.field public final b:Lio/reactivex/internal/operators/flowable/w0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/operators/flowable/w0$a<",
            "TT;TR;>;"
        }
    .end annotation
.end field

.field public final c:I

.field public final d:I

.field public e:Lio/reactivex/internal/fuseable/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/fuseable/j<",
            "TT;>;"
        }
    .end annotation
.end field

.field public f:J

.field public volatile g:Z

.field public h:I


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/flowable/w0$a;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/operators/flowable/w0$a<",
            "TT;TR;>;I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/w0$b;->b:Lio/reactivex/internal/operators/flowable/w0$a;

    iput p2, p0, Lio/reactivex/internal/operators/flowable/w0$b;->c:I

    shr-int/lit8 p1, p2, 0x2

    sub-int/2addr p2, p1

    iput p2, p0, Lio/reactivex/internal/operators/flowable/w0$b;->d:I

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

    iput v1, p0, Lio/reactivex/internal/operators/flowable/w0$b;->h:I

    iput-object v0, p0, Lio/reactivex/internal/operators/flowable/w0$b;->e:Lio/reactivex/internal/fuseable/j;

    iput-boolean v2, p0, Lio/reactivex/internal/operators/flowable/w0$b;->g:Z

    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/w0$b;->b:Lio/reactivex/internal/operators/flowable/w0$a;

    invoke-virtual {p1}, Lio/reactivex/internal/operators/flowable/w0$a;->b()V

    return-void

    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iput v1, p0, Lio/reactivex/internal/operators/flowable/w0$b;->h:I

    iput-object v0, p0, Lio/reactivex/internal/operators/flowable/w0$b;->e:Lio/reactivex/internal/fuseable/j;

    iget v0, p0, Lio/reactivex/internal/operators/flowable/w0$b;->c:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LoT5;->o(J)V

    return-void

    :cond_1
    new-instance v0, Lio/reactivex/internal/queue/b;

    iget v1, p0, Lio/reactivex/internal/operators/flowable/w0$b;->c:I

    invoke-direct {v0, v1}, Lio/reactivex/internal/queue/b;-><init>(I)V

    iput-object v0, p0, Lio/reactivex/internal/operators/flowable/w0$b;->e:Lio/reactivex/internal/fuseable/j;

    iget v0, p0, Lio/reactivex/internal/operators/flowable/w0$b;->c:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LoT5;->o(J)V

    :cond_2
    return-void
.end method

.method public cancel()V
    .locals 0

    invoke-static {p0}, Lio/reactivex/internal/subscriptions/g;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public o(J)V
    .locals 2

    iget v0, p0, Lio/reactivex/internal/operators/flowable/w0$b;->h:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-wide v0, p0, Lio/reactivex/internal/operators/flowable/w0$b;->f:J

    add-long/2addr v0, p1

    iget p1, p0, Lio/reactivex/internal/operators/flowable/w0$b;->d:I

    int-to-long p1, p1

    cmp-long p1, v0, p1

    if-ltz p1, :cond_0

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lio/reactivex/internal/operators/flowable/w0$b;->f:J

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LoT5;

    invoke-interface {p1, v0, v1}, LoT5;->o(J)V

    goto :goto_0

    :cond_0
    iput-wide v0, p0, Lio/reactivex/internal/operators/flowable/w0$b;->f:J

    :cond_1
    :goto_0
    return-void
.end method

.method public onComplete()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/operators/flowable/w0$b;->g:Z

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/w0$b;->b:Lio/reactivex/internal/operators/flowable/w0$a;

    invoke-virtual {v0}, Lio/reactivex/internal/operators/flowable/w0$a;->b()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/w0$b;->b:Lio/reactivex/internal/operators/flowable/w0$a;

    invoke-virtual {v0, p0, p1}, Lio/reactivex/internal/operators/flowable/w0$a;->c(Lio/reactivex/internal/operators/flowable/w0$b;Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget v0, p0, Lio/reactivex/internal/operators/flowable/w0$b;->h:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/w0$b;->e:Lio/reactivex/internal/fuseable/j;

    invoke-interface {v0, p1}, Lio/reactivex/internal/fuseable/j;->offer(Ljava/lang/Object;)Z

    :cond_0
    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/w0$b;->b:Lio/reactivex/internal/operators/flowable/w0$a;

    invoke-virtual {p1}, Lio/reactivex/internal/operators/flowable/w0$a;->b()V

    return-void
.end method
