.class public final LPl8;
.super Ljava/util/concurrent/FutureTask;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final b:J

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final synthetic e:Ldn8;


# direct methods
.method public constructor <init>(Ldn8;Ljava/lang/Runnable;ZLjava/lang/String;)V
    .locals 2

    iput-object p1, p0, LPl8;->e:Ldn8;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    invoke-static {p4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ldn8;->s()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, LPl8;->b:J

    iput-object p4, p0, LPl8;->d:Ljava/lang/String;

    iput-boolean p3, p0, LPl8;->c:Z

    const-wide p2, 0x7fffffffffffffffL

    cmp-long p2, v0, p2

    if-nez p2, :cond_0

    iget-object p1, p1, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->o()Lec8;

    move-result-object p1

    const-string p2, "Tasks index overflow"

    invoke-virtual {p1, p2}, Lec8;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Ldn8;Ljava/util/concurrent/Callable;ZLjava/lang/String;)V
    .locals 2

    iput-object p1, p0, LPl8;->e:Ldn8;

    invoke-direct {p0, p2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    const-string p2, "Task exception on worker thread"

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ldn8;->s()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object p4

    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, LPl8;->b:J

    iput-object p2, p0, LPl8;->d:Ljava/lang/String;

    iput-boolean p3, p0, LPl8;->c:Z

    const-wide p2, 0x7fffffffffffffffL

    cmp-long p2, v0, p2

    if-nez p2, :cond_0

    iget-object p1, p1, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->o()Lec8;

    move-result-object p1

    const-string p2, "Tasks index overflow"

    invoke-virtual {p1, p2}, Lec8;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 6

    check-cast p1, LPl8;

    iget-boolean v0, p0, LPl8;->c:Z

    iget-boolean v1, p1, LPl8;->c:Z

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-eq v0, v1, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return v3

    :cond_1
    iget-wide v0, p0, LPl8;->b:J

    iget-wide v4, p1, LPl8;->b:J

    cmp-long p1, v0, v4

    if-gez p1, :cond_2

    move v2, v3

    goto :goto_0

    :cond_2
    if-lez p1, :cond_3

    :goto_0
    return v2

    :cond_3
    iget-object p1, p0, LPl8;->e:Ldn8;

    iget-object p1, p1, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->q()Lec8;

    move-result-object p1

    iget-wide v0, p0, LPl8;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "Two tasks share the same index. index"

    invoke-virtual {p1, v1, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final setException(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, LPl8;->e:Ldn8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->o()Lec8;

    move-result-object v0

    iget-object v1, p0, LPl8;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-super {p0, p1}, Ljava/util/concurrent/FutureTask;->setException(Ljava/lang/Throwable;)V

    return-void
.end method
