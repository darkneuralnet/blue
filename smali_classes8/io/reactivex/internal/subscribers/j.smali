.class public abstract Lio/reactivex/internal/subscribers/j;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/o;
.implements LoT5;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        "Lio/reactivex/o<",
        "TT;>;",
        "LoT5;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x6de1ba4ffe60ebe0L


# instance fields
.field public final b:LhT5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LhT5<",
            "-TR;>;"
        }
    .end annotation
.end field

.field public c:LoT5;

.field public d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TR;"
        }
    .end annotation
.end field

.field public e:J


# direct methods
.method public constructor <init>(LhT5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TR;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/subscribers/j;->b:LhT5;

    return-void
.end method


# virtual methods
.method public a(LoT5;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/subscribers/j;->c:LoT5;

    invoke-static {v0, p1}, Lio/reactivex/internal/subscriptions/g;->i(LoT5;LoT5;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/reactivex/internal/subscribers/j;->c:LoT5;

    iget-object p1, p0, Lio/reactivex/internal/subscribers/j;->b:LhT5;

    invoke-interface {p1, p0}, LhT5;->a(LoT5;)V

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    iget-wide v0, p0, Lio/reactivex/internal/subscribers/j;->e:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    invoke-static {p0, v0, v1}, Lio/reactivex/internal/util/d;->d(Ljava/util/concurrent/atomic/AtomicLong;J)J

    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/high16 v4, -0x8000000000000000L

    and-long v6, v0, v4

    cmp-long v6, v6, v2

    if-eqz v6, :cond_1

    invoke-virtual {p0, p1}, Lio/reactivex/internal/subscribers/j;->c(Ljava/lang/Object;)V

    return-void

    :cond_1
    const-wide v6, 0x7fffffffffffffffL

    and-long/2addr v0, v6

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->lazySet(J)V

    iget-object v0, p0, Lio/reactivex/internal/subscribers/j;->b:LhT5;

    invoke-interface {v0, p1}, LhT5;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/reactivex/internal/subscribers/j;->b:LhT5;

    invoke-interface {p1}, LhT5;->onComplete()V

    return-void

    :cond_2
    iput-object p1, p0, Lio/reactivex/internal/subscribers/j;->d:Ljava/lang/Object;

    invoke-virtual {p0, v2, v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lio/reactivex/internal/subscribers/j;->d:Ljava/lang/Object;

    goto :goto_0
.end method

.method public c(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/subscribers/j;->c:LoT5;

    invoke-interface {v0}, LoT5;->cancel()V

    return-void
.end method

.method public final o(J)V
    .locals 8

    invoke-static {p1, p2}, Lio/reactivex/internal/subscriptions/g;->h(J)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    and-long v4, v0, v2

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-eqz v4, :cond_1

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual {p0, v2, v3, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lio/reactivex/internal/subscribers/j;->b:LhT5;

    iget-object p2, p0, Lio/reactivex/internal/subscribers/j;->d:Ljava/lang/Object;

    invoke-interface {p1, p2}, LhT5;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/reactivex/internal/subscribers/j;->b:LhT5;

    invoke-interface {p1}, LhT5;->onComplete()V

    goto :goto_0

    :cond_1
    invoke-static {v0, v1, p1, p2}, Lio/reactivex/internal/util/d;->c(JJ)J

    move-result-wide v2

    invoke-virtual {p0, v0, v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/subscribers/j;->c:LoT5;

    invoke-interface {v0, p1, p2}, LoT5;->o(J)V

    :cond_2
    :goto_0
    return-void
.end method
