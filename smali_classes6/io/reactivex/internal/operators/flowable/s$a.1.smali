.class public final Lio/reactivex/internal/operators/flowable/s$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/o;
.implements Lio/reactivex/disposables/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "LoT5;",
        ">;",
        "Lio/reactivex/o<",
        "TU;>;",
        "Lio/reactivex/disposables/c;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x3fec6c572fe7d027L


# instance fields
.field public final b:J

.field public final c:Lio/reactivex/internal/operators/flowable/s$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/operators/flowable/s$b<",
            "TT;TU;>;"
        }
    .end annotation
.end field

.field public final d:I

.field public final e:I

.field public volatile f:Z

.field public volatile g:Lio/reactivex/internal/fuseable/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/fuseable/j<",
            "TU;>;"
        }
    .end annotation
.end field

.field public h:J

.field public i:I


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/flowable/s$b;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/operators/flowable/s$b<",
            "TT;TU;>;J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-wide p2, p0, Lio/reactivex/internal/operators/flowable/s$a;->b:J

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/s$a;->c:Lio/reactivex/internal/operators/flowable/s$b;

    iget p1, p1, Lio/reactivex/internal/operators/flowable/s$b;->f:I

    iput p1, p0, Lio/reactivex/internal/operators/flowable/s$a;->e:I

    shr-int/lit8 p1, p1, 0x2

    iput p1, p0, Lio/reactivex/internal/operators/flowable/s$a;->d:I

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

    iput v1, p0, Lio/reactivex/internal/operators/flowable/s$a;->i:I

    iput-object v0, p0, Lio/reactivex/internal/operators/flowable/s$a;->g:Lio/reactivex/internal/fuseable/j;

    iput-boolean v2, p0, Lio/reactivex/internal/operators/flowable/s$a;->f:Z

    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/s$a;->c:Lio/reactivex/internal/operators/flowable/s$b;

    invoke-virtual {p1}, Lio/reactivex/internal/operators/flowable/s$b;->f()V

    return-void

    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iput v1, p0, Lio/reactivex/internal/operators/flowable/s$a;->i:I

    iput-object v0, p0, Lio/reactivex/internal/operators/flowable/s$a;->g:Lio/reactivex/internal/fuseable/j;

    :cond_1
    iget v0, p0, Lio/reactivex/internal/operators/flowable/s$a;->e:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LoT5;->o(J)V

    :cond_2
    return-void
.end method

.method public b(J)V
    .locals 2

    iget v0, p0, Lio/reactivex/internal/operators/flowable/s$a;->i:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-wide v0, p0, Lio/reactivex/internal/operators/flowable/s$a;->h:J

    add-long/2addr v0, p1

    iget p1, p0, Lio/reactivex/internal/operators/flowable/s$a;->d:I

    int-to-long p1, p1

    cmp-long p1, v0, p1

    if-ltz p1, :cond_0

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lio/reactivex/internal/operators/flowable/s$a;->h:J

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LoT5;

    invoke-interface {p1, v0, v1}, LoT5;->o(J)V

    goto :goto_0

    :cond_0
    iput-wide v0, p0, Lio/reactivex/internal/operators/flowable/s$a;->h:J

    :cond_1
    :goto_0
    return-void
.end method

.method public dispose()V
    .locals 0

    invoke-static {p0}, Lio/reactivex/internal/subscriptions/g;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public e()Z
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lio/reactivex/internal/subscriptions/g;->b:Lio/reactivex/internal/subscriptions/g;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onComplete()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/operators/flowable/s$a;->f:Z

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/s$a;->c:Lio/reactivex/internal/operators/flowable/s$b;

    invoke-virtual {v0}, Lio/reactivex/internal/operators/flowable/s$b;->f()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lio/reactivex/internal/subscriptions/g;->b:Lio/reactivex/internal/subscriptions/g;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/s$a;->c:Lio/reactivex/internal/operators/flowable/s$b;

    invoke-virtual {v0, p0, p1}, Lio/reactivex/internal/operators/flowable/s$b;->k(Lio/reactivex/internal/operators/flowable/s$a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    iget v0, p0, Lio/reactivex/internal/operators/flowable/s$a;->i:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/s$a;->c:Lio/reactivex/internal/operators/flowable/s$b;

    invoke-virtual {v0, p1, p0}, Lio/reactivex/internal/operators/flowable/s$b;->m(Ljava/lang/Object;Lio/reactivex/internal/operators/flowable/s$a;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/s$a;->c:Lio/reactivex/internal/operators/flowable/s$b;

    invoke-virtual {p1}, Lio/reactivex/internal/operators/flowable/s$b;->f()V

    :goto_0
    return-void
.end method
