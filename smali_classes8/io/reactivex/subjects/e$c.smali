.class public final Lio/reactivex/subjects/e$c;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/subjects/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/subjects/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Ljava/lang/Object;",
        ">;",
        "Lio/reactivex/subjects/e$a<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x6fcd9699e42b76b5L


# instance fields
.field public final b:I

.field public final c:J

.field public final d:Ljava/util/concurrent/TimeUnit;

.field public final e:Lio/reactivex/E;

.field public f:I

.field public volatile g:Lio/reactivex/subjects/e$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/e$d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public h:Lio/reactivex/subjects/e$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/e$d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public volatile i:Z


# direct methods
.method public constructor <init>(IJLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V
    .locals 1

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    const-string v0, "maxSize"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->f(ILjava/lang/String;)I

    move-result p1

    iput p1, p0, Lio/reactivex/subjects/e$c;->b:I

    const-string p1, "maxAge"

    invoke-static {p2, p3, p1}, Lio/reactivex/internal/functions/b;->g(JLjava/lang/String;)J

    move-result-wide p1

    iput-wide p1, p0, Lio/reactivex/subjects/e$c;->c:J

    const-string p1, "unit is null"

    invoke-static {p4, p1}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/TimeUnit;

    iput-object p1, p0, Lio/reactivex/subjects/e$c;->d:Ljava/util/concurrent/TimeUnit;

    const-string p1, "scheduler is null"

    invoke-static {p5, p1}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/reactivex/E;

    iput-object p1, p0, Lio/reactivex/subjects/e$c;->e:Lio/reactivex/E;

    new-instance p1, Lio/reactivex/subjects/e$d;

    const/4 p2, 0x0

    const-wide/16 p3, 0x0

    invoke-direct {p1, p2, p3, p4}, Lio/reactivex/subjects/e$d;-><init>(Ljava/lang/Object;J)V

    iput-object p1, p0, Lio/reactivex/subjects/e$c;->h:Lio/reactivex/subjects/e$d;

    iput-object p1, p0, Lio/reactivex/subjects/e$c;->g:Lio/reactivex/subjects/e$d;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 3

    new-instance v0, Lio/reactivex/subjects/e$d;

    const-wide v1, 0x7fffffffffffffffL

    invoke-direct {v0, p1, v1, v2}, Lio/reactivex/subjects/e$d;-><init>(Ljava/lang/Object;J)V

    iget-object p1, p0, Lio/reactivex/subjects/e$c;->h:Lio/reactivex/subjects/e$d;

    iput-object v0, p0, Lio/reactivex/subjects/e$c;->h:Lio/reactivex/subjects/e$d;

    iget v1, p0, Lio/reactivex/subjects/e$c;->f:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lio/reactivex/subjects/e$c;->f:I

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lio/reactivex/subjects/e$c;->e()V

    iput-boolean v2, p0, Lio/reactivex/subjects/e$c;->i:Z

    return-void
.end method

.method public add(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/subjects/e$d;

    iget-object v1, p0, Lio/reactivex/subjects/e$c;->e:Lio/reactivex/E;

    iget-object v2, p0, Lio/reactivex/subjects/e$c;->d:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2}, Lio/reactivex/E;->c(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    invoke-direct {v0, p1, v1, v2}, Lio/reactivex/subjects/e$d;-><init>(Ljava/lang/Object;J)V

    iget-object p1, p0, Lio/reactivex/subjects/e$c;->h:Lio/reactivex/subjects/e$d;

    iput-object v0, p0, Lio/reactivex/subjects/e$c;->h:Lio/reactivex/subjects/e$d;

    iget v1, p0, Lio/reactivex/subjects/e$c;->f:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lio/reactivex/subjects/e$c;->f:I

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lio/reactivex/subjects/e$c;->d()V

    return-void
.end method

.method public b(Lio/reactivex/subjects/e$b;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/subjects/e$b<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p1, Lio/reactivex/subjects/e$b;->b:Lio/reactivex/D;

    iget-object v1, p1, Lio/reactivex/subjects/e$b;->d:Ljava/lang/Object;

    check-cast v1, Lio/reactivex/subjects/e$d;

    const/4 v2, 0x1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lio/reactivex/subjects/e$c;->c()Lio/reactivex/subjects/e$d;

    move-result-object v1

    :cond_1
    move v3, v2

    :cond_2
    :goto_0
    iget-boolean v4, p1, Lio/reactivex/subjects/e$b;->e:Z

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    iput-object v5, p1, Lio/reactivex/subjects/e$b;->d:Ljava/lang/Object;

    return-void

    :cond_3
    :goto_1
    iget-boolean v4, p1, Lio/reactivex/subjects/e$b;->e:Z

    if-eqz v4, :cond_4

    iput-object v5, p1, Lio/reactivex/subjects/e$b;->d:Ljava/lang/Object;

    return-void

    :cond_4
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/reactivex/subjects/e$d;

    if-nez v4, :cond_6

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_5

    goto :goto_0

    :cond_5
    iput-object v1, p1, Lio/reactivex/subjects/e$b;->d:Ljava/lang/Object;

    neg-int v3, v3

    invoke-virtual {p1, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v3

    if-nez v3, :cond_2

    return-void

    :cond_6
    iget-object v1, v4, Lio/reactivex/subjects/e$d;->b:Ljava/lang/Object;

    iget-boolean v6, p0, Lio/reactivex/subjects/e$c;->i:Z

    if-eqz v6, :cond_8

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_8

    invoke-static {v1}, Lio/reactivex/internal/util/n;->j(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v0}, Lio/reactivex/D;->onComplete()V

    goto :goto_2

    :cond_7
    invoke-static {v1}, Lio/reactivex/internal/util/n;->h(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    invoke-interface {v0, v1}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    :goto_2
    iput-object v5, p1, Lio/reactivex/subjects/e$b;->d:Ljava/lang/Object;

    iput-boolean v2, p1, Lio/reactivex/subjects/e$b;->e:Z

    return-void

    :cond_8
    invoke-interface {v0, v1}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    move-object v1, v4

    goto :goto_1
.end method

.method public c()Lio/reactivex/subjects/e$d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/subjects/e$d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/subjects/e$c;->g:Lio/reactivex/subjects/e$d;

    iget-object v1, p0, Lio/reactivex/subjects/e$c;->e:Lio/reactivex/E;

    iget-object v2, p0, Lio/reactivex/subjects/e$c;->d:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2}, Lio/reactivex/E;->c(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    iget-wide v3, p0, Lio/reactivex/subjects/e$c;->c:J

    sub-long/2addr v1, v3

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/reactivex/subjects/e$d;

    :goto_0
    move-object v6, v3

    move-object v3, v0

    move-object v0, v6

    if-eqz v0, :cond_1

    iget-wide v4, v0, Lio/reactivex/subjects/e$d;->c:J

    cmp-long v4, v4, v1

    if-lez v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/reactivex/subjects/e$d;

    goto :goto_0

    :cond_1
    :goto_1
    return-object v3
.end method

.method public d()V
    .locals 7

    iget v0, p0, Lio/reactivex/subjects/e$c;->f:I

    iget v1, p0, Lio/reactivex/subjects/e$c;->b:I

    const/4 v2, 0x1

    if-le v0, v1, :cond_0

    sub-int/2addr v0, v2

    iput v0, p0, Lio/reactivex/subjects/e$c;->f:I

    iget-object v0, p0, Lio/reactivex/subjects/e$c;->g:Lio/reactivex/subjects/e$d;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/subjects/e$d;

    iput-object v0, p0, Lio/reactivex/subjects/e$c;->g:Lio/reactivex/subjects/e$d;

    :cond_0
    iget-object v0, p0, Lio/reactivex/subjects/e$c;->e:Lio/reactivex/E;

    iget-object v1, p0, Lio/reactivex/subjects/e$c;->d:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1}, Lio/reactivex/E;->c(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    iget-wide v3, p0, Lio/reactivex/subjects/e$c;->c:J

    sub-long/2addr v0, v3

    iget-object v3, p0, Lio/reactivex/subjects/e$c;->g:Lio/reactivex/subjects/e$d;

    :goto_0
    iget v4, p0, Lio/reactivex/subjects/e$c;->f:I

    if-gt v4, v2, :cond_1

    iput-object v3, p0, Lio/reactivex/subjects/e$c;->g:Lio/reactivex/subjects/e$d;

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/reactivex/subjects/e$d;

    if-nez v4, :cond_2

    iput-object v3, p0, Lio/reactivex/subjects/e$c;->g:Lio/reactivex/subjects/e$d;

    goto :goto_1

    :cond_2
    iget-wide v5, v4, Lio/reactivex/subjects/e$d;->c:J

    cmp-long v5, v5, v0

    if-lez v5, :cond_3

    iput-object v3, p0, Lio/reactivex/subjects/e$c;->g:Lio/reactivex/subjects/e$d;

    :goto_1
    return-void

    :cond_3
    iget v3, p0, Lio/reactivex/subjects/e$c;->f:I

    sub-int/2addr v3, v2

    iput v3, p0, Lio/reactivex/subjects/e$c;->f:I

    move-object v3, v4

    goto :goto_0
.end method

.method public e()V
    .locals 10

    iget-object v0, p0, Lio/reactivex/subjects/e$c;->e:Lio/reactivex/E;

    iget-object v1, p0, Lio/reactivex/subjects/e$c;->d:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1}, Lio/reactivex/E;->c(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    iget-wide v2, p0, Lio/reactivex/subjects/e$c;->c:J

    sub-long/2addr v0, v2

    iget-object v2, p0, Lio/reactivex/subjects/e$c;->g:Lio/reactivex/subjects/e$d;

    :goto_0
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/reactivex/subjects/e$d;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    if-nez v4, :cond_1

    iget-object v0, v2, Lio/reactivex/subjects/e$d;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    new-instance v0, Lio/reactivex/subjects/e$d;

    invoke-direct {v0, v7, v5, v6}, Lio/reactivex/subjects/e$d;-><init>(Ljava/lang/Object;J)V

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/reactivex/subjects/e$c;->g:Lio/reactivex/subjects/e$d;

    goto :goto_1

    :cond_0
    iput-object v2, p0, Lio/reactivex/subjects/e$c;->g:Lio/reactivex/subjects/e$d;

    goto :goto_1

    :cond_1
    iget-wide v8, v3, Lio/reactivex/subjects/e$d;->c:J

    cmp-long v4, v8, v0

    if-lez v4, :cond_3

    iget-object v0, v2, Lio/reactivex/subjects/e$d;->b:Ljava/lang/Object;

    if-eqz v0, :cond_2

    new-instance v0, Lio/reactivex/subjects/e$d;

    invoke-direct {v0, v7, v5, v6}, Lio/reactivex/subjects/e$d;-><init>(Ljava/lang/Object;J)V

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/reactivex/subjects/e$c;->g:Lio/reactivex/subjects/e$d;

    goto :goto_1

    :cond_2
    iput-object v2, p0, Lio/reactivex/subjects/e$c;->g:Lio/reactivex/subjects/e$d;

    :goto_1
    return-void

    :cond_3
    move-object v2, v3

    goto :goto_0
.end method
