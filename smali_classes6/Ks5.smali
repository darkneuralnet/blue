.class public final LKs5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LKs5$b;,
        LKs5$c;
    }
.end annotation


# static fields
.field public static final g:Ljava/util/logging/Logger;


# instance fields
.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public d:LKs5$c;

.field public e:J

.field public final f:LKs5$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, LKs5;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, LKs5;->g:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, LKs5;->c:Ljava/util/Deque;

    sget-object v0, LKs5$c;->b:LKs5$c;

    iput-object v0, p0, LKs5;->d:LKs5$c;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LKs5;->e:J

    new-instance v0, LKs5$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LKs5$b;-><init>(LKs5;LKs5$a;)V

    iput-object v0, p0, LKs5;->f:LKs5$b;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    iput-object p1, p0, LKs5;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic a(LKs5;)Ljava/util/Deque;
    .locals 0

    iget-object p0, p0, LKs5;->c:Ljava/util/Deque;

    return-object p0
.end method

.method public static synthetic b(LKs5;)LKs5$c;
    .locals 0

    iget-object p0, p0, LKs5;->d:LKs5$c;

    return-object p0
.end method

.method public static synthetic c(LKs5;LKs5$c;)LKs5$c;
    .locals 0

    iput-object p1, p0, LKs5;->d:LKs5$c;

    return-object p1
.end method

.method public static synthetic d(LKs5;)J
    .locals 4

    iget-wide v0, p0, LKs5;->e:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, LKs5;->e:J

    return-wide v0
.end method

.method public static synthetic e()Ljava/util/logging/Logger;
    .locals 1

    sget-object v0, LKs5;->g:Ljava/util/logging/Logger;

    return-object v0
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 8

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LKs5;->c:Ljava/util/Deque;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LKs5;->d:LKs5$c;

    sget-object v2, LKs5$c;->e:LKs5$c;

    if-eq v1, v2, :cond_7

    sget-object v2, LKs5$c;->d:LKs5$c;

    if-ne v1, v2, :cond_0

    goto :goto_3

    :cond_0
    iget-wide v3, p0, LKs5;->e:J

    new-instance v1, LKs5$a;

    invoke-direct {v1, p0, p1}, LKs5$a;-><init>(LKs5;Ljava/lang/Runnable;)V

    iget-object p1, p0, LKs5;->c:Ljava/util/Deque;

    invoke-interface {p1, v1}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    sget-object p1, LKs5$c;->c:LKs5$c;

    iput-object p1, p0, LKs5;->d:LKs5$c;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v0, 0x1

    const/4 v5, 0x0

    :try_start_1
    iget-object v6, p0, LKs5;->b:Ljava/util/concurrent/Executor;

    iget-object v7, p0, LKs5;->f:LKs5$b;

    invoke-interface {v6, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    iget-object v1, p0, LKs5;->d:LKs5$c;

    if-eq v1, p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v5

    :goto_0
    if-eqz v0, :cond_2

    return-void

    :cond_2
    iget-object v6, p0, LKs5;->c:Ljava/util/Deque;

    monitor-enter v6

    :try_start_2
    iget-wide v0, p0, LKs5;->e:J

    cmp-long v0, v0, v3

    if-nez v0, :cond_3

    iget-object v0, p0, LKs5;->d:LKs5$c;

    if-ne v0, p1, :cond_3

    iput-object v2, p0, LKs5;->d:LKs5$c;

    :cond_3
    monitor-exit v6

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :goto_1
    iget-object v2, p0, LKs5;->c:Ljava/util/Deque;

    monitor-enter v2

    :try_start_3
    iget-object v3, p0, LKs5;->d:LKs5$c;

    sget-object v4, LKs5$c;->b:LKs5$c;

    if-eq v3, v4, :cond_4

    sget-object v4, LKs5$c;->c:LKs5$c;

    if-ne v3, v4, :cond_5

    :cond_4
    iget-object v3, p0, LKs5;->c:Ljava/util/Deque;

    invoke-interface {v3, v1}, Ljava/util/Deque;->removeLastOccurrence(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    move v0, v5

    :goto_2
    instance-of v1, p1, Ljava/util/concurrent/RejectedExecutionException;

    if-eqz v1, :cond_6

    if-nez v0, :cond_6

    monitor-exit v2

    return-void

    :cond_6
    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :cond_7
    :goto_3
    :try_start_4
    iget-object v1, p0, LKs5;->c:Ljava/util/Deque;

    invoke-interface {v1, p1}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_2
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SequentialExecutor@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LKs5;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method