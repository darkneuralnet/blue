.class public abstract LfV2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LfV2$e;,
        LfV2$h;,
        LfV2$f;,
        LfV2$g;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Params:",
        "Ljava/lang/Object;",
        "Progress:",
        "Ljava/lang/Object;",
        "Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final g:Ljava/util/concurrent/ThreadFactory;

.field public static final h:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Ljava/util/concurrent/Executor;

.field public static j:LfV2$f;

.field public static volatile k:Ljava/util/concurrent/Executor;


# instance fields
.field public final b:LfV2$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LfV2$h<",
            "TParams;TResult;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/FutureTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/FutureTask<",
            "TResult;>;"
        }
    .end annotation
.end field

.field public volatile d:LfV2$g;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final f:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v7, LfV2$a;

    invoke-direct {v7}, LfV2$a;-><init>()V

    sput-object v7, LfV2;->g:Ljava/util/concurrent/ThreadFactory;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v0, 0xa

    invoke-direct {v6, v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    sput-object v6, LfV2;->h:Ljava/util/concurrent/BlockingQueue;

    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v1, 0x5

    const/16 v2, 0x80

    const-wide/16 v3, 0x1

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v8, LfV2;->i:Ljava/util/concurrent/Executor;

    sput-object v8, LfV2;->k:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LfV2$g;->b:LfV2$g;

    iput-object v0, p0, LfV2;->d:LfV2$g;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, LfV2;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, LfV2;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, LfV2$b;

    invoke-direct {v0, p0}, LfV2$b;-><init>(LfV2;)V

    iput-object v0, p0, LfV2;->b:LfV2$h;

    new-instance v1, LfV2$c;

    invoke-direct {v1, p0, v0}, LfV2$c;-><init>(LfV2;Ljava/util/concurrent/Callable;)V

    iput-object v1, p0, LfV2;->c:Ljava/util/concurrent/FutureTask;

    return-void
.end method

.method public static e()Landroid/os/Handler;
    .locals 2

    const-class v0, LfV2;

    monitor-enter v0

    :try_start_0
    sget-object v1, LfV2;->j:LfV2$f;

    if-nez v1, :cond_0

    new-instance v1, LfV2$f;

    invoke-direct {v1}, LfV2$f;-><init>()V

    sput-object v1, LfV2;->j:LfV2$f;

    :cond_0
    sget-object v1, LfV2;->j:LfV2$f;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final a(Z)Z
    .locals 2

    iget-object v0, p0, LfV2;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, LfV2;->c:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    move-result p1

    return p1
.end method

.method public varargs abstract b([Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TParams;)TResult;"
        }
    .end annotation
.end method

.method public final varargs c(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)LfV2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "[TParams;)",
            "LfV2<",
            "TParams;TProgress;TResult;>;"
        }
    .end annotation

    iget-object v0, p0, LfV2;->d:LfV2$g;

    sget-object v1, LfV2$g;->b:LfV2$g;

    if-eq v0, v1, :cond_2

    sget-object p1, LfV2$d;->a:[I

    iget-object p2, p0, LfV2;->d:LfV2$g;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "We should never reach this state"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot execute task: the task has already been executed (a task can be executed only once)"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot execute task: the task is already running."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    sget-object v0, LfV2$g;->c:LfV2$g;

    iput-object v0, p0, LfV2;->d:LfV2$g;

    invoke-virtual {p0}, LfV2;->j()V

    iget-object v0, p0, LfV2;->b:LfV2$h;

    iput-object p2, v0, LfV2$h;->b:[Ljava/lang/Object;

    iget-object p2, p0, LfV2;->c:Ljava/util/concurrent/FutureTask;

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object p0
.end method

.method public d(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    invoke-virtual {p0}, LfV2;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LfV2;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LfV2;->i(Ljava/lang/Object;)V

    :goto_0
    sget-object p1, LfV2$g;->d:LfV2$g;

    iput-object p1, p0, LfV2;->d:LfV2$g;

    return-void
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, LfV2;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public g()V
    .locals 0

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    invoke-virtual {p0}, LfV2;->g()V

    return-void
.end method

.method public i(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    return-void
.end method

.method public j()V
    .locals 0

    return-void
.end method

.method public varargs k([Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TProgress;)V"
        }
    .end annotation

    return-void
.end method

.method public l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)TResult;"
        }
    .end annotation

    invoke-static {}, LfV2;->e()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, LfV2$e;

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-direct {v1, p0, v3}, LfV2$e;-><init>(LfV2;[Ljava/lang/Object;)V

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-object p1
.end method

.method public m(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    iget-object v0, p0, LfV2;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, LfV2;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method