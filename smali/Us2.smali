.class public final LUs2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZd3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUs2$b;,
        LUs2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LZd3<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "LUs2$b<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "LZd3$a<",
            "-TT;>;",
            "LUs2$a<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LuX2;

    invoke-direct {v0}, LuX2;-><init>()V

    iput-object v0, p0, LUs2;->a:LuX2;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LUs2;->b:Ljava/util/Map;

    return-void
.end method

.method public static synthetic a(LUs2;LUs2$a;)V
    .locals 0

    invoke-direct {p0, p1}, LUs2;->k(LUs2$a;)V

    return-void
.end method

.method public static synthetic e(LUs2;LUs2$a;LUs2$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LUs2;->h(LUs2$a;LUs2$a;)V

    return-void
.end method

.method public static synthetic f(LUs2;LO80$a;)V
    .locals 0

    invoke-direct {p0, p1}, LUs2;->i(LO80$a;)V

    return-void
.end method

.method public static synthetic g(LUs2;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LUs2;->j(LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic h(LUs2$a;LUs2$a;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, LUs2;->a:LuX2;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/LiveData;->removeObserver(Lfe3;)V

    :cond_0
    iget-object p1, p0, LUs2;->a:LuX2;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/LiveData;->observeForever(Lfe3;)V

    return-void
.end method

.method private synthetic i(LO80$a;)V
    .locals 2

    iget-object v0, p0, LUs2;->a:LuX2;

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LUs2$b;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Observable has not yet been initialized with a value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, LO80$a;->f(Ljava/lang/Throwable;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LUs2$b;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, LUs2$b;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, LO80$a;->c(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LUs2$b;->c()Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {v1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, LUs2$b;->c()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p1, v0}, LO80$a;->f(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method

.method private synthetic j(LO80$a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, LSs2;

    invoke-direct {v1, p0, p1}, LSs2;-><init>(LUs2;LO80$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " [fetch@"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private synthetic k(LUs2$a;)V
    .locals 1

    iget-object v0, p0, LUs2;->a:LuX2;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/LiveData;->removeObserver(Lfe3;)V

    return-void
.end method


# virtual methods
.method public b(LZd3$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd3$a<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LUs2;->b:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LUs2;->b:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUs2$a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LUs2$a;->b()V

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    new-instance v2, LQs2;

    invoke-direct {v2, p0, p1}, LQs2;-><init>(LUs2;LUs2$a;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c(Ljava/util/concurrent/Executor;LZd3$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "LZd3$a<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LUs2;->b:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LUs2;->b:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LUs2$a;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LUs2$a;->b()V

    :cond_0
    new-instance v2, LUs2$a;

    invoke-direct {v2, p1, p2}, LUs2$a;-><init>(Ljava/util/concurrent/Executor;LZd3$a;)V

    iget-object p1, p0, LUs2;->b:Ljava/util/Map;

    invoke-interface {p1, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    new-instance p2, LRs2;

    invoke-direct {p2, p0, v1, v2}, LRs2;-><init>(LUs2;LUs2$a;LUs2$a;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public d()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LPs2;

    invoke-direct {v0, p0}, LPs2;-><init>(LUs2;)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public l(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, LUs2;->a:LuX2;

    invoke-static {p1}, LUs2$b;->b(Ljava/lang/Object;)LUs2$b;

    move-result-object p1

    invoke-virtual {v0, p1}, LuX2;->postValue(Ljava/lang/Object;)V

    return-void
.end method
